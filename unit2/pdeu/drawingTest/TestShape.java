package pdeu.drawingTest;

import java.security.DrbgParameters.Reseed;

import javax.swing.plaf.basic.BasicBorders.SplitPaneBorder;

class TestShape{
    public static long highestArea(Shape[] sp){
        long[] values = new long[sp.length];
        for(int i=0;i<sp.lenght;i++){
            values[i] = (long)(sp[i].calculateArea());
        }
    }
    public static void resizeableShapes(Shape[] sp){
        for(int i=0;i<sp.length;i++){
            if(sp[i] instanceof Resizable){
                System.out.println(sp[i]);
            }
        }
    }
    public static long totalDecorativeMaterialForCircle(Shape[] sp){

    }
    public static void main(String[] args) {
        Shape s = new Shape();
        Square s1 = new  Sqaure();
        Shape[] sp = {new Sqaure(), new Rectangle(), new Circle(), new Square()};
        highestArea(null);
    }
}