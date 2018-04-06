import java.io.*;
import java.util.*;
class tablet
{
static int amt=0,total=0;
public static void tablet () throws IOException
{
Scanner sc=new Scanner (System.in);
System.out.println();
System.out.println("Here Are The Devices In Stock");
System.out.println("1.Apple iPad Mini 4 - Rs.43,000");
System.out.println("2.Samsung Galaxy Tab S2 8.0 - Rs.32,000");
System.out.println("3.Google Nexus 9 - Rs.30,000 ");
System.out.println("Select your option");
        int a=sc.nextInt();
        {
            if (a==1)
            amt=43000;
            else if (a==2)
            amt=32000;
            else if (a==3)
            amt=30000;
            }
        System.out.println(" Rs. "+amt);
        System.out.println(" Enter quantity");
        int z=sc.nextInt();
        total=total+(z*amt);
        System.out.println("");
        System.out.println("");
        System.out.println("         YOUR TOTAL:"+total);
        System.out.println("");
        System.out.println("");
        System.out.println(" DO YOU WANT TO CONTINUE SHOPPING ?");
        System.out.println(" 1. YES");
        System.out.println(" 2. NO");
        System.out.println("");
        System.out.println(" SELECT YOUR OPTION");
        int b=sc.nextInt();
        switch(b)
        {
            case 1:{
            main.main();}
            break;
            case 2:{
                bill.main();
            }
            break;
            default:
            System.out.println("Incorrect option");
        }
    }
}