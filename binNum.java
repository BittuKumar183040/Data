import java.util.Scanner;
class BinarayAdd{
    public String add(String n1, String n2){
        int num1=Integer.parseInt(n1,2);
        int num2=Integer.parseInt(n2,2);
        int sum=num1+num2;
        return Integer.toBinaryString(sum);
    }
}
class binNum {
    public static void main(String arg[]){
        Scanner takeIn=new Scanner(System.in);
        System.out.print("Enter 1st Binary Number : ");
        String val1=takeIn.next();
        System.out.print("Enter 2st Binary Number : "); 
        String val2=takeIn.next();
        takeIn.close();
        BinarayAdd biObj=new BinarayAdd();
        String addition=biObj.add(val1, val2);
        System.out.println("Sum of "+val1+" and "+ val2 +" : " + addition);
    }
}
