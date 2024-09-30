class Box
{
double width,height,depth;
}
class BoxDemo1
{
public static void main(String args[])
{
Box mybox=new Box();
mybox.width=10;
mybox.height=20;
mybox.depth=30;

double vol;
vol=mybox.width*mybox.height*mybox.depth;
System.out.println("Volume is "+vol);
}
}
