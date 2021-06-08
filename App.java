public class App {
    public static void main(String[] args) {
       
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(10.0,10.0);
        Triangle triangle = new Triangle(10.0,10.0);
    
        ausgabe("---- Flächen -------");
        ausgabe("Fläche Kreis: " + circle.area());
        ausgabe("Fläche Rechteck: " + rectangle.area());
        ausgabe("Fläche Dreieck: " + triangle.area());

        ausgabe("---- Differenzen -------");
        ausgabe("Diff. r/t: " + areaDiff(rectangle, triangle));
        ausgabe("Diff. r/c: " + areaDiff(rectangle, circle));
        ausgabe("Diff. c/t: " + areaDiff(circle, triangle));
    
    }

    // Shape - Shape  ;-) .. all you can eat ...
    public static double areaDiff(Shape s1, Shape s2) {
        return s1.area() - s2.area();
    }


    public static void ausgabe(String outStr) {
        System.out.println(outStr);
    }

}
