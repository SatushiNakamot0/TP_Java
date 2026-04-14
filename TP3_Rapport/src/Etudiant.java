import java.util.Scanner;

public class Etudiant {

    String cne;
    double note;

    public Etudiant(String cne, double note) {
        this.cne = cne;
        this.note = note;
    }

    public String toString() {
        return "CNE : " + this.cne + " | Note : " + this.note;
    }

    public boolean estAdmis(Etudiant e) {
        boolean admis = e.note >= 10.0;
        return admis;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CNE de l'etudiant : ");
        String cneInput = sc.next();

        System.out.print("Enter note de l'etudiant : ");
        double noteInput = sc.nextDouble();

        Etudiant e = new Etudiant(cneInput, noteInput);

        System.out.println(e.toString());

        boolean admis = e.estAdmis(e);
        if (admis) {
            System.out.println("L'etudiant est admis.");
        } else {
            System.out.println("L'etudiant n'est pas admis.");
        }

        sc.close();
    }
}
