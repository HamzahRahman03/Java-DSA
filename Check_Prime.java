public class Check_Prime {
 public static void  main(String[] args){
    int n=3;
    int fact=0;

    for(int i=2; i<n; i++){
        if(n%i==0){
            fact++;
        }
    }

    if(fact>0){
        System.out.println("NOT PRIME");
    }
    else{
        System.out.println("PRIME");
    }
 }   
}
