public class Square
{
int side;
Square()
{
side=45;
}
void calArea()
{
int area=side*side;
System.out.println("Area is "+area);
}

void calPerimeter()
{
int perimeter=4*side;
System.out.println("Perimeter is "+perimeter);
}

public static void main(String args[])
{
Square sq=new Square();
sq.calArea();
sq.calPerimeter();
}
}
