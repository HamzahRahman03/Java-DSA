public class Student{
    String name;
     int age;
     static int count;

     public void Intro_yourself(){
        System.out.println("My name is " + name + " and age is " + age);
     }

     public void SayHey(String name){
        System.out.println(this.name+ " say hey " + name);
     }

     public static void fun(int x){
      System.out.println("I am in fun" + x);
     }

     static{
      System.out.println("I am in static blocks");
     }
}