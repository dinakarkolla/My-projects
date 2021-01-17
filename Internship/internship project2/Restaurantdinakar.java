import  java.io.IOException;
import  java.util.Scanner;
public class Restaurantjayanth {
public static void main(String args[])
{
String a[]=new String[10];
int j=0,k=0,l=0,m=0,n=0,o=0,total1=0,total2=0,total3=0,total4=0,total5=0,total6=0;
int top=0,bill=0;
int cmushroom=150,cpanner=200,cchicken=150,cbiriyani=300,cfriedrice=200,cbuttermasala=300;
Scanner sc=new Scanner(System.in);
System.out.println("Wanna have some thing please see out menu card");
System.out.println("Please press any key to diplay menu");

String c=sc.next();
char ch=c.charAt(0);

if(ch=='N'){
System.out.println("thank u");
}
else{
while(true){
System.out.println(" ______________________________________");
System.out.println("|______________LJK RESTARAUNT__________|");
System.out.println("|______________________________________|");
System.out.println("|             1.VEG                    |");
System.out.println("|             2.NON VEG                |");
System.out.println("|             3.EXIT                   |");
System.out.println("|______________________________________|");
System.out.print("enter your choice");
int s=sc.nextInt();
if(s==1)
{
System.out.println(" _________________________________________");
System.out.println("|------------VEGETERAIANS-----------------|");
System.out.println("|_________________________________________|");
System.out.println("|             1.PANNER                    |");
System.out.println("|             2.MUSHROOM                  |");
System.out.println("|             3.BUTTERMASALA              |");
System.out.println("|             3.EXIT                      |");
System.out.println("|_________________________________________|");
System.out.print("order the required one ");
int order=sc.nextInt();
if(order==1)
{
System.out.println("enter quantity");
j=sc.nextInt();
total1=cpanner*j;
a[top]="PANNER";
top++;
System.out.println("  _________________________________");
System.out.println(" |            order placed         | ");
System.out.println(" !_________________________________!");
}
else if(order==2)
{
System.out.println("enter quantity");
k=sc.nextInt();
total2=cmushroom*k;
a[top]="MUSHROOM";
top++;
System.out.println("  _________________________________");
System.out.println(" |            order placed         | ");
System.out.println(" !_________________________________!");

}
if(order==3)
{
System.out.println("enter quantity");
l=sc.nextInt();
total3=cbuttermasala*l;
a[top]="BUTTERMASALA";
top++;
System.out.println("  _________________________________");
System.out.println(" |            order placed         | ");
System.out.println(" !_________________________________!");
}
else if(order==4)   
{
break;
}
}
else if(s==2)
{
System.out.println(" __________________________________");
System.out.println("|____________NON VEGETARIAN________|");
System.out.println("|__________________________________|");
System.out.println("|            1.CHICKEN             |");
System.out.println("|            2.DUMBIRYANI          |");
System.out.println("|            3.EGG FRIED RICE      |");
System.out.println("|            4.EXIT                |");
System.out.println("|__________________________________|");
System.out.println("order the required one ");
int order=sc.nextInt();
if(order==1)
{
System.out.println("enter quantity");
m=sc.nextInt();
//d=l;
total4=cchicken*m;
a[top]="CHICKEN";
top++;
System.out.println("  _________________________________");
System.out.println(" |            orderedchicken       | ");
System.out.println(" !_________________________________!");
}
else if(order==2)
{
System.out.println("enter quantity");
n=sc.nextInt();
total5=cbiriyani*n;
a[top]="BIRYANI";
top++;
System.out.println("  _________________________________");
System.out.println(" |            order placed         | ");
System.out.println(" !_________________________________!");

}
else if(order==3)
{
System.out.println("enter quantity");
o=sc.nextInt();
total6=cfriedrice*o;
a[top]="FRIEDRICE";
top++;
System.out.println("  _________________________________");
System.out.println(" |            order placed         | ");
System.out.println(" !_________________________________!");
}
}
else if(s==3)
{ 
break;
}
System.out.println(" ____________________________________");
System.out.println("|           do u want anymore        |");
System.out.println("|____________________________________|");
}
System.out.println(" ___________________________________________________________");
System.out.println("|ITEMS          |       QUANTITY      |     BILL               |");
System.out.println("|---------------|---------------------|------------------------|");
for(int i=0;i<top;i++)
{

if(a[i]=="PANNER")
{
 System.out.println("|PANNER---------|-----------"+j+"---------|---------------"+total1+"-------|");
}
if(a[i]=="MUSHROOM")
{
 System.out.println("|MUSHROOM-------|-----------"+k+"---------|----------------"+total2+"-----|");
}   
if(a[i]=="BUTTERMASALA")
{
 System.out.println("|BUTTERMASALA---|-----------"+l+"---------|----------------"+total3+"-----|");
}
if(a[i]=="CHICKEN")
{
 System.out.println("|CHICKEN--------|-----------"+m+"---------|----------------"+total4+"-----|");
}
if(a[i]=="BIRYANI")
{
 System.out.println("|BIRYANI--------|-----------"+n+"---------|----------------"+total5+"-----|");
}
if(a[i]=="FRIEDRICE")
{
 System.out.println("|FRIEDRICE------|-----------"+o+"---------|----------------"+total6+"-----|");
}
}
System.out.println( "|_______________|_____________________|______________________  |");
System.out.println("   TOTAL BILL IS                                       "+(total1+total2+total3+total4+total5+total6));
}
}
}

