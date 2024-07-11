/*7)Write a program to input the Basic Pay of an employee and find the gross pay of the employee 
for the following allowances and deductions. 
Dearness Allowance = 25% of Basic Pay 
House Rent Allowance=15% of Basic Pay 
Provident Fund=8.33% of Basic Pay 
Net Pay=Basic Pay + Dearness Allowance + House Rent Allowance
Gross Pay= Net Pay – Provident Fund*/


import java.util.*;
class Basicpay
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
float bpay=0,Da=0,Hra=0,pf,npay,gpay;
System.out.println("enter the basicpay amt");
bpay=sc.nextFloat();
Da=(bpay*25)/100;
Hra=(bpay*15)/100;
pf=(bpay*8.33f)/100;
npay=bpay+Da+Hra;
gpay=npay-pf;
System.out.println("Gross payment is "+gpay);

}
}