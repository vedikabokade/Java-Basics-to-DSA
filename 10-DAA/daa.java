// //closest pair problem in 1D
// public class daa {
// public static void conquor(int arr[],int si,int mid,int ei) {
//     int merge[] =new int[ei-si+1]  ;
//     int idx1=si;
//     int idx2=mid+1;
//     int x=0;
//     while(idx1<=mid&&idx2<=ei){
//         if(arr[idx1]<=arr[idx2]){
//             merge[x++]=arr[idx1++];
//         }
//         else{
//             merge[x++]=arr[idx2++];
//         }
        
//     }
//     while(idx1<=mid){
//         merge[x++]=arr[idx1++];
//     }
//     while(idx2<=ei){
//         merge[x++]=arr[idx2++];
//     }
//     for(int i=0, j=si ;  i<merge.length ; i++ , j++){
//         arr[j]=merge[i];
//     }
// }
// public static void divide(int arr[], int si,int ei){
//     if(si>=ei){
//         return;
//     }
//     int mid=si+ (ei-si)/2;
//     divide(arr, si, mid);
//     divide(arr, mid+1, ei);
//     conquor(arr , si,mid,ei);
// }
// public static int closestpair(int arr[]){
//     int mindiff = Integer.MAX_VALUE;
//     for (int i = 1; i < arr.length; i++) {
//         int diff = arr[i] - arr[i - 1];
//         mindiff = Math.min(mindiff, diff);
//         }
//         return  mindiff;
//     }

// public static void main(String[] args) {
//     int arr[]={5,8,11,14,17,20};
//     int n=arr.length;
//     divide(arr, 0, n-1);
//     System.out.print("the sorted array is");
//     for(int i=0;i<n;i++){
//         System.out.print(+arr[i]+" ");
//     }
//     System.out.println();
//     int min=closestpair(arr);
//     System.out.println("the minimum distance between two coordinates is : "+ min);
//     System.out.println();
// }
// }


//closest pair problem in 2D

import java.util.Arrays;
class daa {
    static class Point {
        int x, y;
        
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
    
    static double bruteForce(Point[] points, int left, int right) {
        double minDist = Double.MAX_VALUE;
        for (int i = left; i < right; i++) {
            for (int j = i + 1; j <= right; j++) {
                minDist = Math.min(minDist, distance(points[i], points[j]));
            }
        }
        return minDist;
    }
    
    static double stripClosest(Point strip[], int size, double d) {
        double min = d;
        Arrays.sort(strip, 0, size, (p1, p2) -> Integer.compare(p1.y, p2.y));
        
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size && (strip[j].y - strip[i].y) < min; j++) {
                min = Math.min(min, distance(strip[i], strip[j]));
            }
        }
        return min;
    }
    
    static double closestUtil(Point[] points, int left, int right) {
        if (right - left + 1 <= 3) {
            return bruteForce(points, left, right);
        }
        
        int mid = left + (right - left) / 2;
        Point midPoint = points[mid];
        
        double dLeft = closestUtil(points, left, mid);
        double dRight = closestUtil(points, mid + 1, right);
        
        double d = Math.min(dLeft, dRight);
        
        Point strip[] = new Point[right - left + 1];
        int j = 0;
        for (int i = left; i <= right; i++) {
            if (Math.abs(points[i].x - midPoint.x) < d) {
                strip[j++] = points[i];
            }
        }
        
        return Math.min(d, stripClosest(strip, j, d));
    }
    
    static double closestPair(Point[] points) {
        Arrays.sort(points, (p1, p2) -> Integer.compare(p1.x, p2.x));
        return closestUtil(points, 0, points.length - 1);
    }
    
    public static void main(String[] args) {
        Point[] points = { new Point(2, 3), new Point(12, 30), new Point(40, 50), new Point(5, 1), new Point(12, 10), new Point(3, 4) };
        System.out.println("The smallest distance is: " + closestPair(points));
    }
}
