import java.util.*;

class Calculator

{
public static void main(String[]args)
{
     Scanner sc=new Scanner(System.in);
        
     System.out.println("\t\t\tCalculator");
      System.out.println("\t\t\t============"); 
          
         
      System.out.println("\n\t\t\t1.Addition"); 
      System.out.println("\t\t\t2.Substraction"); 
      System.out.println("\t\t\t3.Multiplication"); 
      System.out.println("\t\t\t4.Division"); 
      
      System.out.println("\t\t\t============="); 
       
       System.out.print("\n\t\t\tEnter your Choice="); 
       
      int c=sc.nextInt();
        
   System.out.print("\t\t\tEnter First Number="); 
      
              
     int num1=sc.nextInt();
  System.out.print("\t\t\tEnter Second Number="); 
     int num2=sc.nextInt();

     if(c==1)
{
 int Result=num1+num2;
  System.out.println("\t\t\tResult is="+Result);
      
   }    

 else if(c==2) 
{
int Result=num1-num2;
System.out.println("\t\t\tResult is="+Result);  
}   

 else if(c==3) 
{
int Result=num1*num2;
System.out.println("\t\t\tResult is="+Result);  
} 


 else if(c==4) 
{
int Result=num1/num2;
System.out.println("\t\tResult is="+Result);  
}


else
{

System.out.println("\t\t\tWrong input"); 
}
}
}

       