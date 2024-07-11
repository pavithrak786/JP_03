import java.util.*;
class Average
{
  public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      int m1,m2,m3,m4,m5,m6;
      float avg;
      System.out.println("enter the marks");
      m1=sc.nextInt();
       m2=sc.nextInt();
       m3=sc.nextInt();
       m4=sc.nextInt();
       m5=sc.nextInt();
      m6=sc.nextInt();
if(m1<35 || m2<35 || m3<35 || m4<35  || m5<35 || m6<35){
             System.out.println("Failed");
}
    else
      {
      avg=(m1+m2+m3+m4+m5+m6)/6f;
      
     if(avg>=35 && avg<50)
         System.out.println("Thrid Division");
     else if(avg>=50 && avg<60)
         System.out.println("Second Division");
     else if(avg>=60 && avg<70)
         System.out.println("First Division");
     else 
         System.out.println("Distinction");

   }
}

}
/* Switch statement
   ===============
--> Switch is an menu driven program.
In  switch statement theuser will be passing a choice inside a switch and based on the choice the respective case get executed .
if the choice is not matched by any of the  cases then the default case get executed.
Syntax:-
======
Switch(Expression)
{
case label1:statement;
            break;
case label2:statement;
            break;
'
'
'
case labeln:statement n;
          break;
default: statements;
         
}
Rules:
=====
--> Choice can be an expression or variable or constant
--> label can be literals,string literals
    ex:- case 1; case 'a'; case "pavi"
--> Floating point values are not supported by switch labels
    ex:- case 4.5;
--> Case labels need not be in any sequence.
    ex:- case 100:
         case 1:
         case 99:
-->Similar cases can be combined with a common statement.
   ex:- case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':SYSO("vowel");
        break;
--> case 1: ----------
           ----------
           ----------
           ----------
    case 2: ---------
            ----------*/
         