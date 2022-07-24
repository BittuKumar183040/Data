import java.util.Scanner;
class switchStat{
    public static void main(String arg[]){
        System.out.println("Choose To Learn :");
        System.out.println("1. Months");
        System.out.println("2. Days");
        System.out.println("3. Holiday ");
        Scanner getVal=new Scanner(System.in);
        System.out.print("-> ");
        int ch=getVal.nextInt();
        getVal.close();
        switch (ch) {
            case 1:
            System.out.println("January · February · March · April · May · June · July · August · September · October · November · December ");
            break;
            case 2:
            System.out.println("Sunday · Monday · Tuesday · Wednesday · Thursday · Friday · Saturday");
            break;
            case 3:
            System.out.println("Christmas Day · Ramadan · Diwali · Guru Nanak's Birthday · Mahavir Jayanti · Muharram · Independence Day");
            break;
            
            default:
            System.out.println("Enter Valid Choice");
            System.out.print("Program EXIT");
                break;
        }
    }
}