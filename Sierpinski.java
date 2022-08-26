public class Sierpinski{
    static double z = Math.sqrt(3);

    public static void main(String[] args){
        StdDraw.setCanvasSize(800, 800);
        int degree = 7;
        generateSierpinski(degree, 1, 0, 0);
    }

    public static void generateSierpinski(int n, double sideLength, double x0, double y0){
        if (n == 0){
            draw(x0, y0, sideLength);
        }
        else{
            generateSierpinski(n-1, sideLength/2, x0, y0);
            generateSierpinski(n-1, sideLength/2, x0+sideLength/2, y0);
            generateSierpinski(n-1, sideLength/2, x0+sideLength/4, y0+sideLength*z/4);
        }
    }

    public static void draw(double x0, double y0, double sideLength){
        double [] x = {x0, x0 + sideLength/2, x0 + sideLength};
        double [] y = {y0, y0+sideLength*z/2 ,y0};
        StdDraw.filledPolygon(x, y);
    }
}
