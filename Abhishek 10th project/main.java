import java.io.*;
import java.util.*;
class main
{
static int amt,total;
public static void main() throws IOException
{
Scanner sc=new Scanner (System.in);
System.out.println("************************************");
System.out.println("************************************");
System.out.println("Select Your Option");
System.out.println("1.Mobile");
System.out.println("2.Tablets");
System.out.println("3.Laptops ");
System.out.println("Type 1/2/3");
int ch=sc.nextInt();
try
{

}
catch(Exception e)
{
System.out.println("Enter only number");
main.main();
}
switch (ch){
case 1:{mobile.mobile();

}
break;
case 2:{tablet.tablet();
    
}
break;
case 3:{laptop.laptop();

}
break;
default:System.out.println("You Have Entered Wrong Option");
}
}
}