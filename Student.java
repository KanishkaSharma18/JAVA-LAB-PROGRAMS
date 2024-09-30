public class Student
{
String name; 
int rollNo;
int age;

Student()
{
name = "Shubh";
rollNo=05;
age=22;
}

void display()
{
System.out.println("Student's name : "+name);
System.out.println("Student's rollNo : "+rollNo);
System.out.println("Student's age : "+age);
}

public static void main(String args[])
{
Student st=new Student();
st.display();
}
}
