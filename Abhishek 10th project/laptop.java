import java.io.*;
import java.util.*;
class laptop
{
   static int amt=0,total=0;
public static void laptop () throws IOException
{
Scanner sc=new Scanner (System.in);
System.out.println();
System.out.println("Here Are The Devices In Stock");
System.out.println("1.Dell XPS 13 - Rs.1,30,000");
System.out.println("2.MacBook Pro (15 inch) - Rs.1,25,000");
System.out.println("3.Microsoft Surface Pro 4 - Rs.1,10,000 ");
System.out.println("Choose Your Option");
        int a=sc.nextInt();
         {
            if (a==1)
            amt=130000;
            else if (a==2)
            amt=125000;
            else if (a==3)
            amt=125000;
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