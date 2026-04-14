import java.util.Scanner;

public class CompteBancaire {
    long numero;
    double solde;

    public CompteBancaire(long numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public void deposer(CompteBancaire c, double n_deposer) {
        c.solde += n_deposer;
        System.out.println("Depot effectue avec succes.");
    }

    public void retirer(CompteBancaire c, double n_retirer) {
        if (c.solde >= n_retirer) {
            c.solde -= n_retirer;
            System.out.println("Retrait effectue avec succes.");
        } else {
            System.out.println("Erreur : Solde insuffisant pour ce retrait.");
        }
    }

    public void transfer(CompteBancaire c, CompteBancaire d, double n_transf) {
        if (c.solde >= n_transf) {
            c.solde -= n_transf;
            d.solde += n_transf;
            System.out.println("Transfert effectue avec succes vers le compte " + d.numero);
        } else {
            System.out.println("Erreur : Solde insuffisant pour ce transfert.");
        }
    }

    public void affichersolde(CompteBancaire c) {
        System.out.println("-> Solde actuel du compte " + c.numero + " : " + c.solde);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- CREATION COMPTE 1 ---");
        System.out.print("Entrer le numero du compte : ");
        long numero = sc.nextLong();
        System.out.print("Entrer le solde initial : ");
        double solde = sc.nextDouble();
        CompteBancaire c = new CompteBancaire(numero, solde);
        c.affichersolde(c);

        System.out.print("\nEntrer la somme a deposer : ");
        double n_deposer = sc.nextDouble();
        c.deposer(c, n_deposer);
        c.affichersolde(c);

        System.out.print("\nEntrer la somme a retirer : ");
        double n_retirer = sc.nextDouble();
        c.retirer(c, n_retirer);
        c.affichersolde(c);

        System.out.println("\n--- CREATION COMPTE 2 (Destinataire) ---");
        System.out.print("Entrer le numero du compte cible : ");
        long numero2 = sc.nextLong();
        System.out.print("Entrer le solde initial du compte cible : ");
        double solde2 = sc.nextDouble();
        CompteBancaire d = new CompteBancaire(numero2, solde2);

        System.out.print("\nEntrer la somme a transferer du Compte 1 vers le Compte 2 : ");
        double n_transf = sc.nextDouble();
        c.transfer(c, d, n_transf);

        System.out.println("\n--- BILAN FINAL ---");
        c.affichersolde(c);
        d.affichersolde(d);

        sc.close();
    }
}
