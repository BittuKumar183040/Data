import java.util.Scanner;

class aboutNumber{
    int num;
    int count;
    aboutNumber(int arg){
        num=arg;
        while(arg!=0){
            count++;
            arg=arg/10;
        }
    }
    int getPower(int number){
        int val=number;
        for(int i=1;i<count;i++){
            val=val*number;
        }
        return val;
    }
    boolean isArm(){
        int newNum=num;
        int rem;
        int sum=0;
        while(newNum!=0){
            rem=newNum%10;
            newNum=newNum/10;
            sum=sum+getPower(rem);
        }
        if(sum==num){
            return true;
        }
        return false;
    }
}
class arm {
    public static void main(String arg[]){
        Scanner getVal=new Scanner(System.in);
        System.out.print("Enter Number to Check Armstrong -> ");
        int val=getVal.nextInt();
        aboutNumber obj=new aboutNumber(val);
        boolean n=obj.isArm();
        System.out.println(n);
        getVal.close();
    }    
}
