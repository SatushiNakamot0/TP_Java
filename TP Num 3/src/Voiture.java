import java.util.Scanner;

public class Voiture {
    String marque;
    double vitesse;
    public Voiture(String marque, double vitesse) {
        this.marque = marque;
        this.vitesse = vitesse;
    }

    public void accelerer(Voiture v, double increment) {
        v.vitesse += increment;
        System.out.println("Acceleration:La vitesse de la " + v.marque + " est maintenant de " + v.vitesse + " km/h.");
    }

    public void freiner(Voiture v, double decrement) {
        if (v.vitesse >= decrement) {
            v.vitesse -= decrement;
        } else {
            v.vitesse = 0;
        }
        System.out.println("Freinage:La vitesse de la " + v.marque + " est maintenant de " + v.vitesse + " km/h.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- CREATION DE LA VOITURE ---");
        System.out.print("Enter la marque de la voiture : ");
        String marque = sc.next();
        System.out.print("Enter la vitesse initiale : ");
        double vitesse = sc.nextDouble();

        Voiture v = new Voiture(marque, vitesse);

        System.out.print("\nEnter la valeur d'acceleration : ");
        double valeurAcc = sc.nextDouble();
        v.accelerer(v, valeurAcc);

        System.out.print("\nEnter la valeur de freinage : ");
        double valeurFrein = sc.nextDouble();
        v.freiner(v, valeurFrein);

        sc.close();
    }
}