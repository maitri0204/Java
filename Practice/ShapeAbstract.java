Code:-
1. Shape.java
package pdeu.drawing;
public abstract class Shape
{
public String color;
public String pattern;
static int count = 0;{
count++;
}
public Shape(){
color = "Null";
pattern = "Null";
}
public Shape(String color, String pattern) {
this.color = color;
this.pattern = pattern;
}
public abstract double calculateArea();
public abstract double calculatePerimeter();
public static int countShapes(){
return count;
}
}
2. Circle.java
package pdeu.drawing;
public class Circle extends Shape implements Resizeable{
double radius;
public Circle(){
super();
radius = 0;
}
public Circle(String color, String pattern, double radius){
super(color, pattern);
this.radius = radius;
}
public double calculateArea(){
return (2*3.14*radius);
}
public double calculatePerimeter(){
return (3.14*radius*radius);
}
public void resize(int radius){
this.radius = radius;
}
}
3. Square.java
package pdeu.drawing;
public class Square extends Shape implements Resizeable{
double length;
public Square(){
super();
length = 0;
}
public Square(String color, String pattern, double length){
super(color, pattern);
this.length = length;
}
public double calculateArea(){
return (length*length);
}
public double calculatePerimeter(){
return (4*length);
}
public void resize(int length){
this.length = length;
}
}
4. Rectangle.java
package pdeu.drawing;
public class Rectangle extends Shape{
double length;
double width;
public Rectangle(){
super();
length = 0;
width = 0;
}
public Rectangle(String color, String pattern, double length, double width) {
super(color, pattern);
this.length = length;
this.width = width;
}
public double calculateArea(){
return (length*width);
}
public double calculatePerimeter(){
return (2*length + 2*width);
}
}
5. Triangle.java
package pdeu.drawing;
public class Triangle extends Shape{
double base;
double height;
public Triangle(){
super();
base = 0;
height = 0;
}
public Triangle(String color, String pattern, double base, double height){
super(color, pattern);
this.base = base;
this.height = height;
}
public double calculateArea(){
return (base*height*0.5);
}
public double calculatePerimeter(){
return (3*base);
}
}
6. Resizeable.java
package pdeu.drawing;
public interface Resizeable{
void resize(int factor);
}
7. Test.java
package pdeu.drawingTest;
import pdeu.drawing.Circle;
import pdeu.drawing.Rectangle;
import pdeu.drawing.Resizable;
import pdeu.drawing.Shape;
import pdeu.drawing.Square;
import pdeu.drawing.Triangle;
class Test {
static void highestArea(Shape[] sp){
int max = 0;
for(int i =0; i<sp.length; i++){
if(sp[i].calculateArea() > sp[max].calculateArea())
{
max = i;
}
}
System.out.println("\nThe shape with highest area's details are: ");
System.out.println("Colour :" + sp[max].color);
System.out.println("Pattern : " + sp[max].pattern);
}
static void ResizeableShapes(Shape[] sp)
{
for(int i=0; i<sp.length; i++)
{
if(sp[i] instanceof Resizeable)
{
System.out.println("\nThe shape which allows resizeable facility's details are: ");
System.out.println("Colour :" + sp[i].color);
System.out.println("Pattern : " + sp[i].pattern);
}
}
}
static double totalDecorativMaterialForCircle(Shape[] sp)
{
double totalmaterial = 0;
for(int i=0; i<sp.length; i++)
{
if(sp[i] instanceof Circle){
totalmaterial += sp[i].calculatePerimeter();
}
}
return totalmaterial;
}
public static void main(String[] args) {
Shape s1 = new Triangle("black", "equilator", 5.0, 10.0);
Shape s2 = new Circle("white", "equilator", 5.0);
Shape s3 = new Rectangle("red", "equilator", 5.0, 10.0);
Shape s4 = new Square("green", "equilator", 10.0);
Shape[] shapes = {s1, s2, s3, s4};
System.out.println("Total number of shapes created are: " + Shape.countShapes());
highestArea(shapes);
ResizeableShapes(shapes);
double x = totalDecorativMaterialForCircle(shapes);
System.out.println("\n" + x);
}
}