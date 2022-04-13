
import java.util.*;


class Main {
  public static void main(String[] args) {
      int num_input =   Mylibrairy.myinput();
      int num_fact = Mylibrairy.myfact(num_input);
     System.out.println("The factoriel of " + num_input+ " is "+ num_fact);
    
  }
  
}
//----- The Procedure 
class Mylibrairy {
  public static int myfact (int k){
    int factorial=1;
    for (int i = 1 ; i <= k ; i++) factorial = factorial * i;
    return (factorial);
  } 
  public static int myinput (){
       int num_input;
       Scanner scn = new Scanner(System.in);
       System.out.println(" give the number which you want its factorial");
       num_input = scn.nextInt();
       return(num_input);
  } 
  
}
