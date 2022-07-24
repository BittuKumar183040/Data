import java.util.Scanner;
public class lowerUpper{
    public static void main(String args[]){
    //variable declaration
        String str;
    int upper=0,lower=0;
    Scanner scan=new Scanner(System.in); 
        
    System.out.println("Enter the String  ");
    str=scan.nextLine();
    scan.close();
    for(int i=0; i<str.length(); i++){
    char ch=str.charAt(i);
    if(ch>='A' && ch<='Z'){
        upper++;
    }
    else if(ch>='a' && ch<='z'){
        lower++;
    }
    }
    System.out.println("lowercase letters: "+lower);
    System.out.println("uppercase letters: "+upper);
    }
}
