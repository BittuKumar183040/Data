import java.util.*;
class q3{
    public static void main(String arg[]){
        char value;
        Scanner inputObj=new Scanner(System.in);
        try{
            System.out.print("Enter - ");
            value=inputObj.next().charAt(0);
        }
        finally{
            inputObj.close();
        }
        if(Character.isAlphabetic(value)){
            System.out.println("It is an alphabet");
        }
        else{
            System.out.print("It is not an alphabet");
        }
    }
}