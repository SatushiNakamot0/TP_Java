import java.util.Scanner;

public class Rectangle {

    double largeur;
    double hauteur;
    public Rectangle(double largeur, double hauteur){
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double surface(Rectangle r){
        double surface = r.largeur * r.hauteur;
        return surface;
    }
    public double perimetre(Rectangle r){
        double perimetre = r.hauteur * 2 + r.largeur *2;
        return perimetre;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter largeur du rectangle : ");
        double x = sc.nextDouble();
        System.out.print("Enter hauteur du rectangle : ");
        double y = sc.nextDouble();
        Rectangle r = new Rectangle(x,y);
        double surf =r.surface(r);
        System.out.println("surface : " + surf);
        double peri = r.perimetre(r);
        System.out.println("perimetre : " + peri);
        sc.close();
    }
}
