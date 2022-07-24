import java.util.Scanner;
class sumIt{
    int num1;
    int num2;
    sumIt(int a, int b){
        num1=a;
        num2=b;
    }
    int sum(){
        return num1+num2;
    }
}
class paraConst {
    public static void main(String arg[]){
        Scanner getVal=new Scanner(System.in);
        System.out.println("--------- Sum ----------");
        System.out.print("Enter Value 1st : ");
        int val1=getVal.nextInt();
        System.out.print("Enter Value 2st : ");
        int val2=getVal.nextInt();
        getVal.close();
        sumIt obj=new sumIt(val1, val2);
        System.out.println("Sum "+obj.sum());
    }
}
