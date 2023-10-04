public class Student1_client {
    public static void main(String[] args) throws Exception {
        Student1 s = new Student1();
        // s.name = "Rajesh";
        // s.age = -10;
        // System.out.println(s.name);
        // System.out.println(s.age);

        System.out.println(s.GetName());
        s.SetName("Ramesh");
        System.out.println(s.GetName());

        Person p = new Person("Raj", 12);
        System.out.println(p.name);
        System.out.println(p.age);

        s.SetAge(-50);

        System.out.println("Hey");

    }

}
