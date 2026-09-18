// import java.util.*;
// public class closestpair {
//     static class Point {
//         int x, y;
//         Point(int x, int y) { this.x = x; this.y = y; }
//     }

//     static double distance(Point a, Point b) {
//         return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
//     }

//     static double closestPair(Point[] points, int left, int right) {
//         if (right - left <= 3) {
//             double minDist = Double.MAX_VALUE;
//             for (int i = left; i < right; i++) {
//                 for (int j = i + 1; j < right; j++) {
//                     minDist = Math.min(minDist, distance(points[i], points[j]));
//                 }
//             }
//             return minDist;
//         }
        
//         int mid = (left + right) / 2;
//         double d1 = closestPair(points, left, mid);
//         double d2 = closestPair(points, mid, right);
//         double minDist = Math.min(d1, d2);
        
//         List<Point> strip = new ArrayList<>();
//         for (int i = left; i < right; i++) {
//             if (Math.abs(points[i].x - points[mid].x) < minDist) {
//                 strip.add(points[i]);
//             }
//         }
        
//         strip.sort(Comparator.comparingInt(p -> p.y));
//         for (int i = 0; i < strip.size(); i++) {
//             for (int j = i + 1; j < strip.size() && (strip.get(j).y - strip.get(i).y) < minDist; j++) {
//                 minDist = Math.min(minDist, distance(strip.get(i), strip.get(j)));
//             }
//         }
//         return minDist;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter number of points: ");
//         int n = scanner.nextInt();
//         Point[] points = new Point[n];
//         for (int i = 0; i < n; i++) {
//             points[i] = new Point(scanner.nextInt(), scanner.nextInt());
//         }
//         scanner.close();
//         Arrays.sort(points, Comparator.comparingInt(p -> p.x));
//         System.out.println("Closest Distance: " + closestPair(points, 0, n));
//     }
// } 




import java.util.*;

class closestpair {
static class Point {
int x, y;
Point(int x, int y) { 
    this.x = x; this.y = y;
    }
}
static double distance(Point a, Point b) {
    return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
}

static Point[] closestPair(Point[] points, int left, int right) {
    if (right - left <= 3) {
        double minDist = Double.MAX_VALUE;
        Point[] closestPoints = new Point[2];
        for (int i = left; i < right; i++) {
            for (int j = i + 1; j < right; j++) {
                double dist = distance(points[i], points[j]);
                if (dist < minDist) {
                    minDist = dist;
                    closestPoints[0] = points[i];
                    closestPoints[1] = points[j];
                }
            }
        }
        return closestPoints;
    }
    int mid = (left + right) / 2;
    Point[] leftPair = closestPair(points, left, mid);
    Point[] rightPair = closestPair(points, mid, right);
    
    double d1 = distance(leftPair[0], leftPair[1]);
    double d2 = distance(rightPair[0], rightPair[1]);
    Point[] bestPair = d1 < d2 ? leftPair : rightPair;
    double minDist = Math.min(d1, d2);
    
    List<Point> bp = new ArrayList<>();
    for (int i = left; i < right; i++) {
        if (Math.abs(points[i].x - points[mid].x) < minDist) {
            for (Point p : bp) {
                double dist = distance(points[i], p);
                if (dist < minDist) {
                    minDist = dist;
                    bestPair[0] = points[i];
                    bestPair[1] = p;
                }
            }
            bp.add(points[i]);
        }
    }
    return bestPair;
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number of points: ");
    int n = scanner.nextInt();
    Point[] points = new Point[n];
    for (int i = 0; i < n; i++) {
        points[i] = new Point(scanner.nextInt(), scanner.nextInt());
    }
    scanner.close();
    Arrays.sort(points, Comparator.comparingInt(p -> p.x));
    Point[] result = closestPair(points, 0, n);
    System.out.println("Closest Points: (" + result[0].x + ", " + result[0].y + ") and (" + result[1].x + ", " + result[1].y + ")");
}
}