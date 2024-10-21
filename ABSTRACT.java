abstract class Shape {
int a;
int b;
abstract void printArea();

}
class Rectangle extends Shape {
Rectangle (int length, int breadth)
{
this.a = length;
this.b = breadth;
}
void printArea() {
int area = a*b;
System.out.println("Rectangle Area = " + area);
}
}
class Triangle extends Shape {
Triangle(int base, int height) {
this.a=base;
this.b=height;
}
void printArea() {
double area = 0.5*a*b;
System.out.println("Triangle area ="+area);
}
}
class Circle extends Shape {
Circle(int radius) {
this.a=radius;
}
void printArea() {
double area = Math.PI*a*a;
System.out.println("Circle Area ="+area);
}
}
public class  ABSTRACT{
public static void main(String[]args) {
Rectangle r = new Rectangle(5,10);
Triangle t = new Triangle(6,8);
Circle c = new Circle(7);
r.printArea();
t.printArea();
c.printArea();
}
}
