// Factorial of a given number
import java.util.*;
class fact{
    int factorial=1;
    fact(int num){
        for(int x=1;x<=num;x++){
            factorial=factorial*x;
        }
        System.out.println("Factorial of "+num+" is : "+factorial);
    }
}
class Main{
    public static void main(String arg[]){
        Scanner ab=new Scanner(System.in);
        System.out.print("Enter Number To get Factorial - ");
        int numberGet=ab.nextInt();
        fact obj=new fact(numberGet);
    }
}