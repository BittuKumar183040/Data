import java.util.*;
class checkAlpha{
    private int rem;
    private int sum=0;
    checkAlpha(int val){
        
        while(val!=0){
            rem=val%10;
            val=val/10;
            sum=sum+rem;
        }
        System.out.print("Sum of Digit : " + sum);
    }
}
class q4{
    public static void main(String arg[]){
        int value;
        System.out.print("Enter Number - ");
        Scanner inputObj=new Scanner(System.in);
        try{
            value=inputObj.nextInt();
        }
        finally{
            inputObj.close();
        }
        checkAlpha alpObj=new checkAlpha(value);
    }
}