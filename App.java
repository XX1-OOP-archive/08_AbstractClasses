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
    
    }

    // Problem: Aufwand/Nutzen : Linear!!!!
    // 1966 "HELP!" :: "Hi, Hi, Hilfe!"

    // Rechteck - Dreieck
    public static double areaDiff(Rectangle r, Circle c) {
        return r.area() - c.area();
    }

    // Rechteck - Dreieck
    public static double areaDiff(Rectangle r, Triangle t) {
        return r.area() - t.area();
    }

    public static void ausgabe(String outStr) {
        System.out.println(outStr);
    }

}
