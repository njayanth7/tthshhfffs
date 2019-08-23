import java.util.*;
class A{
int h;
int m;
int s;
A()
{
h=0;
m=0;
s=0;
}
A(int a,int b,int c)
{
h=a;
m=b;
s=c;
}
void curr(int a,int b,int c)
{
h=a;
m=b;
s=c;
}
void advance(int a,int b,int d)
{
s=s+d;
m=m+b+(s/60);
s=s%60;
h=h+a+(m/60);
m=m%60;

h=h%24;
}
void print()
{
System.out.println("the time is"+h+""+m+""+s);
}

}
class Time
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int f;
int a;
int b;
int c;
int n;
int ch;

f=1;
System.out.println("enter the type pof bj(1.parameter 2.0 0 0 time object");
n=s.nextInt();
if(n==1)
{
A ab=new A();
while(f==1)
{
System.out.println("enter 1.reset 2.advance 3.print 4.exit");
ch=s.nextInt();
if(ch==1)
{
System.out.println("enter the h m s");

a=s.nextInt();
b=s.nextInt();
c=s.nextInt();

ab.curr(a,b,c);
}

else if(ch==2)
{

System.out.println("enter the h m s");

a=s.nextInt();
b=s.nextInt();
c=s.nextInt();

ab.advance(a,b,c);
}

else if(ch==3)
{



ab.print();
}

else
{
break;
}
}

}
else if(n==2)
{   
System.out.println("enter the h m s");

a=s.nextInt();
b=s.nextInt();
c=s.nextInt();

A ab=new A(a,b,c);

while(f==1)
{
System.out.println("enter 1.reset 2.advance 3.print 4.exit");
ch=s.nextInt();
if(ch==1)
{
System.out.println("enter the h m s");

a=s.nextInt();
b=s.nextInt();
c=s.nextInt();

ab.curr(a,b,c);
}

else if(ch==2)
{

System.out.println("enter the h m s");

a=s.nextInt();
b=s.nextInt();
c=s.nextInt();

ab.advance(a,b,c);
}

else if(ch==3)
{



ab.print();
}

else
{
break;
}
}
}
}
}


