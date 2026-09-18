public class bitmanipulation {
    public static void main(String[] args) {
        
        //get bit
        // int n=5; //0101
        // int position=3;
        // int bitmask=1<<position;
        // if((bitmask & n) ==0){
        //     System.out.println("bit at position " + position + " is 0");
        // }
        // else{
        //     System.out.println("bit at position " + position + " is 1");
        // }

        //set bit
        // int n=5; //0101
        // int position=1;
        // int bitmask=1<<position;
        // int newnumber=bitmask | n;
        // System.out.println(newnumber);

        //clear bit
        int n=5; //0101
        int position=2;
        int bitmask=1<<position;
        int notbitmask =~(bitmask);
        int newnumber = notbitmask & n;
        System.out.println(newnumber);

    }
}
