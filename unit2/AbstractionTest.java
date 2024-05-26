import javax.swing.text.html.HTMLDocument.RunElement;

import pdeu.drawing.Circle;
import pdeu.drawing.Shape;
import pdeu.drawing.Square;

abstract class Shape{
    public abstract void draw();
    abstract long calculateArea();
}

// interface by default all methods are abstract and public
interface Resizable{
    public abstract void resize(int resizeFactor);
}
// class Square extends Shape, Resizable{  // the multiple heritance is not possible in java
class Square extends Shape implements Resizable{
    public void draw(){System.out.println("Square Drawing");}
    long calculateArea(){return 0;}
    public void resize(int rf){System.out.println("Resizing!!");}
}

class Circle extends Shape{
    public void draw(){System.out.println("Circle Drawing");}
    long calculateArea(){return 0;}
}
class AbstractionTest{  
    public static void ResizableShapes(Shape[] sp){
        System.out.println("Resizable shapes are : ");
        for(int i=0;i<sp.length;i++){
            if(sp[i]instanceof Resizable){
                System.out.println(sp[i]);
            }
        }
    }
    public static void main(String[] args) {
        //Shape s = new Shape();  //Error - Instance can not be created for abstract class.
        Shape s1 = new Square();
        s1.draw();

        Shape[] shapes = {new Square(), new Circle(), new Square(), new Circle()};
        ResizableShapes(shapes);
    }
}