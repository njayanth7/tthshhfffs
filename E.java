class A
{
struct EMPLOYEE
{
int Employee_number;
string name;
float Basic;
float DA;
float IT;
float Netsalary;

void calc()
{
Scanner s=new Scanner(System.in);
Basic=s.nextInt();

A=Basic*0.75;
IT=0.3*Basic;
Netsalary=Basic+DA+IT;


}
void get()
{
Scanner s=new Scanner(System.in);
name=s.next();

Employee_number=s.nextInt();
}
void disp()
{
System.out.println("the empnum,name,DA,IT,Basic,netsal is"+Employee_number+""+name+""+DA+""+IT+""+Basic+""+Netsalary);
}
}
class E
{
public static void main(String args[])
{

A a=new A();
a.get();
a.calc();
a.disp();
}

}
