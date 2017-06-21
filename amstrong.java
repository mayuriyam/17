import java.io.*;
import java.util.*;
class amstrong
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in); 
        int num = sc.nextInt();
        int a,b=0;
        int temp=num;
	   while(num>0)
	   {
          a=num%10;
          num=num/10;
          b=b+(a*a*a);
        }
        if(temp==b)
        {
            System.out.print("amstrong");
        }
        else
        {
            System.out.print("not amstrong");
        }
 }
}   
               
        
       
	    
	  
        
 


