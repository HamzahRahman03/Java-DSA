public class Student1 {
    private String name = "Kaju";
    private int age = 16;

    public void SetName(String name){
        this.name = name;
    }

    public String GetName(){
        return this.name;
    }

    // public void SetAge(int age) throws Exception {
    //     if(age<0){
    //         throw new Exception ("age cannot be -ve");
    //     }
    //     this.age = age;
    // }

    public void SetAge(int age) {
        try{
        if(age<0){
            throw new Exception ("age cannot be -ve");
        }
        this.age = age;
    }
    catch  (Exception e){
        e.printStackTrace();
    }

    finally{
        System.out.println("I am finally blacks");
    }
    }

    public int GetAge(){
        return this.age;
    }

}

    