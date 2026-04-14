import java.util.Scanner;

public class Produit {
    int id;
    String nom;
    String description;
    double prix;
    int quantite;

    public Produit(int id, String nom, String description, double prix, int quantite) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantite = quantite;
    }

    public void ajouterProd(Produit p, Produit np) {
        if (p.id == np.id) {
            p.quantite += np.quantite;
            System.out.println("Stock mis a jour. Nouvelle quantite de " + p.nom + " : " + p.quantite);
        } else {
            System.out.println("Erreur : Impossible d'additionner des produits differents.");
        }
    }

    public void modifierProd(Produit p, Produit np) {
        if (p.id == np.id) {
            p.nom = np.nom;
            p.description = np.description;
            p.prix = np.prix;
            p.quantite = np.quantite;
        }
    }

    public void supprimerProd(Produit p) {
        p.id = 0;
        p.nom = "";
        p.description = "";
        p.prix = 0.0;
        p.quantite = 0;
    }

    public void getProduitByID(int id) {
        if (this.id == id) {
            this.afficher(this);
        } else {
            System.out.println("Produit non trouve.");
        }
    }

    public void getAllProduits() {
        if (this.id != 0) {
            this.afficher(this);
        }
    }

    public void afficher(Produit p) {
        System.out.println("ID: " + p.id + " | Nom: " + p.nom + " | Prix: " + p.prix + " | Quantite: " + p.quantite);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer ID : ");
        int id1 = sc.nextInt();
        System.out.print("Entrer le nom : ");
        String nom1 = sc.next();
        System.out.print("Entrer la description : ");
        String desc1 = sc.next();
        System.out.print("Entrer le prix : ");
        double prix1 = sc.nextDouble();
        System.out.print("Entrer la quantite : ");
        int qte1 = sc.nextInt();

        Produit p1 = new Produit(id1, nom1, desc1, prix1, qte1);
        p1.afficher(p1);
        System.out.print("Entrer la quantite reue : ");
        int qte2 = sc.nextInt();

        Produit arrivage = new Produit(id1, nom1, desc1, prix1, qte2);

        p1.ajouterProd(p1, arrivage);

        sc.close();
    }
}
