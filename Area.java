import java.util.Scanner;

abstract class Shape
{
double dim1,dim2;

Shape(double a,double b)
{
dim1=a;
dim2=b;
}

abstract double printArea();
}

class Rectangle extends Shape
{
Rectangle (double a,double b)
{
super(a,b);
}

double printArea()
{
System.out.println("Inside area for Rectangle :");
return dim1*dim2;
}
}

class Triangle extends Shape
{
Triangle (double a,double b)
{
super(a,b);
}

double printArea()
{
System.out.println("Inside area for Triangle :");
return dim1*dim2/2;
}
}

class Circle extends Shape
{
Circle (double a)
{
super(a,0);
}
                                                                                                      
double printArea()
{
System.out.println("Inside area for Circle :");
return 3.14*dim1*dim1;
}
}

class Area
{
public static void main(String args[])
{

Scanner s = new Scanner(System.in);
System.out.println("Enter the dimensions for Rectangle (dim1,dim2):");
double rDim1 = s.nextDouble();
double rDim2 = s.nextDouble();
Rectangle R = new Rectangle(rDim1, rDim2);
System.out.println(R.printArea());

System.out.println("Enter the dimensions for Triangle (dim1,dim2):");
double tDim1 = s.nextDouble();
double tDim2 = s.nextDouble();
Triangle T = new Triangle(tDim1, tDim2);
System.out.println(T.printArea());

System.out.println("Enter the dimension for Circle (dim1):");
double cDim1 = s.nextDouble();
Circle C = new Circle(cDim1);
System.out.println(C.printArea());

System.out.println("NAME : KANISHKA SHARMA");
System.out.println("USN : 1BM23CS138");
}
}
