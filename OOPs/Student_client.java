public class Student_client{

    public static void main(String [] args){
        //ArrayList<Integer> ll = new ArrayList<>();
        Student s = new Student();

        System.out.println(s.name);
        System.out.println(s.age);

        s.Intro_yourself();
        
        s.name = "Kaju";
        s.age = 18;
        s.Intro_yourself();
        
        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.name = "Raju";
        s1.age = 20;
        s1.Intro_yourself();
        
        s2.name = "Hitesh";
        s2.age = 34;
        s2.Intro_yourself();

        s.SayHey("Rahul");


        Student.fun(50);    //call function by class reference
        // s.fun(9);
    }

    static{
        System.out.println("This is main static blocks");
    }
}