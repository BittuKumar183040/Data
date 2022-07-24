class arrayInJava {
    public static void main(String arg[]){
        int intArray[]; //declaring array
        intArray = new int[5]; //memory allocation
        int n=intArray.length; //lenth
        for(int i=0;i<n;i++){
            intArray[i]=i+1;     //instialize
        }
        for(int i=0;i<n;i++){
            System.out.println(intArray[i]);     //displaying
        }

    }
}
