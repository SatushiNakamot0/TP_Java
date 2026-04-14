import java.security.PublicKey;
import java.util.Scanner;

public class Point {
    double x;
    double y;
    public Point(){}
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void afficher(Point p){
        System.out.println("x: " + p.x + " y: " + p.y);

    }
    public void deplacer(double a, double b){
        x += a;
        y += b;

    }
    public double distance(Point p){
        double dist = Math.sqrt(p.x*p.x + p.y*p.y);
        return dist;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X coordinate: ");
        double x = sc.nextInt();
        System.out.print("Enter Y coordinate: ");
        double y = sc.nextInt();
        Point p = new Point(x, y);
        p.afficher(p);
        System.out.print("Enter le deplacement de x : ");
        double a = sc.nextDouble();
        System.out.print("Enter le deplacement de Y : ");
        double b = sc.nextDouble();
        p.deplacer(a, b);
        p.afficher(p);
        double distance = p.distance(p);
        System.out.println("Distance: " + distance);
        sc.close();




    }
}
