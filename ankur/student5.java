class student5
{
int rno;
String name;
float marks;
void display()
{
System.out.println(rno);
System.out.println(name);
System.out.println(marks);
}
public static void main(String s[])
{
student5 s1=new student5();
System.out.println(s1);
s1.rno=1;
s1.name="ankur";
s1.marks=70;
s1.display();
}}
