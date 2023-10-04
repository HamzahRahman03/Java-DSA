public class Array1 {
    public static void main(String [] args){
        int [] arr = null;      //null is a keyword that stores the default address of array
        System.out.println(arr);

        int [] arr2=new int[5];
        System.out.println(arr2);
        
        arr2[0]=3;
        arr2[1]=5;
        arr2[2]=10;
        arr2[3]=40;
        arr2[4]=30;
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);
        System.out.println(arr2[4]);
    }
    
}
