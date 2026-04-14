import java.util.Scanner;

public class JeuDevinette {
    int nombreSecret;
    int tentatives;

    public JeuDevinette(int nombreSecret) {
        this.nombreSecret = nombreSecret;
        this.tentatives = 0;
    }

    public boolean verifierNombre(JeuDevinette jeu, int essai) {
        jeu.tentatives++;

        if (essai < jeu.nombreSecret) {
            System.out.println("kber !");
            return false;
        } else if (essai > jeu.nombreSecret) {
            System.out.println("sgher !");
            return false;
        } else {
            System.out.println("tbarkellah 3lik !");
            return true;
        }
    }

    public void afficherScore(JeuDevinette jeu) {
        int score = 100 - (jeu.tentatives * 10);
        if (score < 0) {
            score = 0;
        }
        System.out.println("Nombre de tentatives : " + jeu.tentatives);
        System.out.println("Votre score final : " + score + "/100");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int secret = (int)(Math.random() * 10) + 1;
        JeuDevinette jeu = new JeuDevinette(secret);

        System.out.println("--- JEU DE DEVINETTE ---");
        System.out.println("J'ai choisi un nombre entre 1 et 10. A vous de jouer !");

        boolean trouve = false;

        while (!trouve) {
            System.out.print("\nEntrez un nombre : ");
            int essai = sc.nextInt();

            trouve = jeu.verifierNombre(jeu, essai);
        }

        System.out.println("------------------------");
        jeu.afficherScore(jeu);

        sc.close();
    }
}