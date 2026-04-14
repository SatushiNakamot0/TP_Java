import java.util.Scanner;

public class NombreComplexe {
    double reel;
    double imaginaire;

    public NombreComplexe(double reel, double imaginaire) {
        this.reel = reel;
        this.imaginaire = imaginaire;
    }
    public NombreComplexe addition(NombreComplexe z1, NombreComplexe z2) {
        double sommeReel = z1.reel + z2.reel;
        double sommeImag = z1.imaginaire + z2.imaginaire;
        return new NombreComplexe(sommeReel, sommeImag);
    }

    public NombreComplexe multiplication(NombreComplexe z1, NombreComplexe z2) {
        double multReel = (z1.reel * z2.reel) - (z1.imaginaire * z2.imaginaire);
        double multImag = (z1.reel * z2.imaginaire) + (z1.imaginaire * z2.reel);
        return new NombreComplexe(multReel, multImag);
    }

    public void afficher(NombreComplexe z) {
        if (z.imaginaire >= 0) {
            System.out.println(z.reel + " + " + z.imaginaire + "i");
        } else {
            System.out.println(z.reel + " - " + Math.abs(z.imaginaire) + "i");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter partie reelle du premiere nombre : ");
        double r1 = sc.nextDouble();
        System.out.print("Enter partie imaginaire du premiere nombre : ");
        double i1 = sc.nextDouble();
        NombreComplexe z1 = new NombreComplexe(r1, i1);

        System.out.print("Enter partie reelle du deusieme nombre : ");
        double r2 = sc.nextDouble();
        System.out.print("Enter partie imaginaire du deusieme nombre : ");
        double i2 = sc.nextDouble();
        NombreComplexe z2 = new NombreComplexe(r2, i2);

        NombreComplexe resultatAdd = z1.addition(z1, z2);
        NombreComplexe resultatMult = z1.multiplication(z1, z2);

        System.out.print("\nz1 = ");
        z1.afficher(z1);
        System.out.print("z2 = ");
        z2.afficher(z2);

        System.out.print("\nAddition = ");
        resultatAdd.afficher(resultatAdd);

        System.out.print("Multiplication = ");
        resultatMult.afficher(resultatMult);

        sc.close();
    }
}
