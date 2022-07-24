class wdof {
    public static void main(String arg[]){
        String num[]={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        System.out.println("-------\tFor Loop -------");
        for(int i=0;i<10;i++){
            System.out.println(i+1+".\t"+ num[i]);
        }
        System.out.println(" -------\tWhile Loop\t -------");
        int i=0;
        while(true){
            System.out.print(num[i]+ ", ");
            i++;
            if(i==10){break;}
        }
        System.out.println(" -------\tDo While Loop\t -------");
        do{
            System.out.println("-> Executes at least once");
        }while(false);
    }    
}
