public class AreaOfFigures {
    static float area(float cr){
        return 3.14f*cr*cr;
    }
    static float area(float rl, float rb){
        return rl*rb;
    }
    static int area(int sl){
        return sl*sl;
    }
    static double area(double tb, double th){
        return th*tb/2;
    }
    public static void main(String[] args){
        float cr = 25.5f;
        float rl = 30.2f;
        float rb = 20.4f;
        int sl = 11;
        double tb = 25;
        double th = 12;

        float area1 = area(cr);
        System.out.println("Area of Circle: " + area1 + "\n");
        float area2 = area(rl,rb);
        System.out.println("Area of Rectangle: " + area2 + "\n");
        float area3 = area(sl);
        System.out.println("Area of Square: " + area3 + "\n");
        double area4 = area(th,tb);
        System.out.println("Area of Triangle: " + area4 + "\n");
    }

}
