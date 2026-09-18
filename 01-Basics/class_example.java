//simple class and its object program 
//class is a static view of system while object is a dynamic view

//1.
// class student{
//     String name;
//     int rollno;
// }
// public class class_example {
//     public static void main(String args[]){
//       student s1=new student();
//       student s2=new student();
//       s1.name="vihan";
//       s1.rollno=13;
//       s2.name="vedika";
//       s2.rollno=14;
//       System.out.println("student is "+s1.name+" roll no is "+s1.rollno);
//       System.out.println("student is "+s2.name+" roll no is "+s2.rollno);
//     }
// }

//2.
//declaring a method inside a class
// class box{
//   double width;
//   double height;
//   double depth;
//   void volume(){
//       System.out.println("volume is=" + width*height*depth);
//   }
// }  
// class class_example {
//   public static void main(String args[]){
//       box b1=new box();
//       b1.width=2;
//       b1.height=5;
//       b1.depth=1;
//       b1.volume();
//   }
// }

//3.
//returing value from a method
// class box{
//   double width;
//   double height;
//   double depth;
//   double volume(){
//       return width*depth*height;
//   }
// }  
// class class_example {
//   public static void main(String args[]){
//       box b1=new box();
//       b1.width=2;
//       b1.height=5;
//       b1.depth=1;
//      double vol= b1.volume();
//      System.out.println("volume is ="+vol);
//   }
// }

//4.
//parameterized method 
// class box{
//   double width;
//   double height;
//   double depth;
//   double volume(){
//       return width*depth*height;
//   }
//   void setval(double w,double h, double d){
//       width=w;
//       height=h;
//       depth=d;
//   }
// }  
// class class_example {
//   public static void main(String args[]){
//       box b1=new box();
//       b1.setval(1.2, 3, 0.2);
//      double vol= b1.volume();
//      System.out.println("volume is ="+vol);
//   }
// }

//5.
//passing object as a parameter to a method
// class complex{
//   int x,y;
//   void setval(int x,int y){
//       this.x=x;
//       this.y=y;
//       System.out.println("\n complex no is="+x+"+"+y+"i");
//   }
//   void add(complex ob2){
//       System.out.println("\n sum is="+(x+ob2.x)+"+"+(y+ob2.y)+"i");
//   }
// }
// class class_example{
//   public static void main(String[] args) {
//       complex ob1=new complex();
//       complex ob2=new complex();
//       ob1.setval(10, 20);
//       ob2.setval(5, 6);
      //passing object as a parameter to a method
//       ob1.add(ob2);
//   }
// }

//6.
//returing object from a method
// class complex{
//   int x,y;
//   void setval(int x,int y){
//       this.x=x;
//       this.y=y;
//       System.out.println("\n complex no is="+x+"+"+y+"i");
//   }
//   complex add(complex ob2){
//       complex temp=new complex();
//       temp.x=x+ob2.x;
//       temp.y=y+ob2.y;
      //returing object
//       return temp; 
//   }
// }
// class class_example{
//   public static void main(String[] args) {
//       complex ob1=new complex();
//       complex ob2=new complex();
//       ob1.setval(10, 20);
//       ob2.setval(5, 6);
      //passing object as a parameter
//       complex ob3= ob1.add(ob2);
//       System.out.println("sum is ="+ob3.x+"+"+ob3.y+"i");
//   }
// }
