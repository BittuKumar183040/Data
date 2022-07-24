import java.util.*;
class stringLast {
    public static void main(String arg[]){
        Scanner usrInput=new Scanner(System.in);
        String userString=usrInput.next();
        usrInput.close();
        String [] charString=userString.split("");
        for(int i=0;i<charString.length;i++)
            {
                if(i==charString.length/2)
                {
                    charString[i]=charString[i].toUpperCase();
                    break;
                }
            }
        for(int i=0;i<charString.length;i++)
            {
                System.out.print(charString[i]);
            }
    }
}
