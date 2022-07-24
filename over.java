class Bank{  
    int getRate(){return 0;}  
} 
class SBI extends Bank{
    int getRate(){return 8;}  
}  
class ICICI extends Bank{
    int getRate(){return 10;}  
}  
class over {
    //Method overloading
    static int sum(int a,int b){return a+b;}
    static int sum(int a,int b,int c){return a+b+c;}
    public static void main(String arg[]){
        SBI s=new SBI();
        ICICI i=new ICICI();
        System.out.println("Method Overriding");
        System.out.println(s.getRate());
        System.out.println(i.getRate());
        System.out.println("Method Overloading");
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
    }
}
