import java.io.*;
import java.util.*;
class mobile
{
static int amt=0,total=0;
public static void mobile () throws IOException
{
Scanner sc=new Scanner (System.in);
System.out.println();
System.out.println("Here Are The Devices In Stock");
System.out.println("1.Galaxy S6 Edge - Rs.45,000");
System.out.println("2.Nexus 6p - Rs.40,000");
System.out.println("3.Apple iPhone6s - Rs.43,000 ");
System.out.println("Select your option");
        int a=sc.nextInt();
         {
            if (a==1)
            amt=45000;
            else if (a==2)
            amt=40000;
            else if (a==3)
            amt=43000;
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