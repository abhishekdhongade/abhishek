import java.io.*;
import java.lang.Math;
class rectangle
{
int height,width;
void area() 
{
int result=height*width;
System.out.println("the area is "+result);
}
}
class demo
{
public static void main(String arags[ ])                                  
{
rectangle r1=new rectangle();
r1.height=20;
r1.width=25;
r1.area();
}
}