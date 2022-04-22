package Main;

import java.util.Random;

import static Main.Main.sc;
import static Main.Main.table;


public class GrilleDeJeu {


    public static void main() {
        InitGrille();
        AfficherGrille();
        DebutPartie();


    }

    public static void DebutPartie() {
        Math.random();
        char Joueur1 = '♤';
        char Joueur2 = '♡';
        char JoueurActuel;
        if (Math.random() < 0.5) {
            JoueurActuel = Joueur1;
        } else {
            JoueurActuel = Joueur2;
        }

        do {
            int[] posA = ObtenirCoordonneesJoueur(JoueurActuel);
            JoueurBloquer(table,posA);
            boolean mouvementOk = false;

            while( !mouvementOk ) {
                System.out.println("Joueur " + JoueurActuel + " Z Q S ou D ?");
                String mouvement = sc.next();
                mouvementOk = DeplacerJoueur(mouvement, posA);
            }


            for (int i = 0; i < 1; i++) {
                System.out.println("DETRUIT CASE, RENTRE LA LIGNE PUIS LA COLONNE");
                int corX = sc.nextInt();
                int corY = sc.nextInt();

                if (!table[corY][corX].equals("[ ]")) {
                    System.out.println(" Case occupé");
                    i--;
                } else {
                    PlacementPion(corX, corY);
                }

            }


            if (JoueurActuel == Joueur1) {
                JoueurActuel = Joueur2;
                System.out.println("A toi de jouer joueur 2 !");
            } else if (JoueurActuel == Joueur2) {
                JoueurActuel = Joueur1;
                System.out.println("A toi de jouer joueur 1 !");
            }

        } while (!false);
    }

    public static void AfficherGrille() {
        System.out.println("    0  1  2  3  4  5  6  7  8  9  10");

        for (int i = 0; i < (table.length - 1); i++) {
            String line = i + "  ";
            for (int j = 0; j < (table[0].length - 1); j++) {
                line += table[i][j];
            }
            System.out.println(line);
        }
    }


    public static void InitGrille() {
        Random rand = new Random();
        int J1X = 0, J1Y = 0, J2X = 0, J2Y = 0;

        // ??
        while ((J1X == J1Y) && (J1X == J2X)) {
            J1X = rand.nextInt((table.length - 1));
            J1Y = rand.nextInt((table[0].length - 1));

            J2X = rand.nextInt((table.length - 1));
            J2Y = rand.nextInt((table[0].length - 1));
        }

        for (int i = 0; i < (table.length - 1); i++) {
            for (int j = 0; j < (table[0].length - 1); j++) {
                table[i][j] = ("[ ]");
                table[1][2] = ("[#]");
            }
        }

        table[J1X][J1Y] = "[♤]";
        table[J2X][J2Y] = "[♡]";

    }

    // Obtient les coordonnées du pion du joueur qui joue
    public static int[] ObtenirCoordonneesJoueur(char Joueur) { // Prends en paramètre le joueur actuel
        int[] index = new int[2]; // Enregistre X et Y dans un index

        for (int i = 0; i < (table.length - 1); i++) {
            for (int j = 0; j < (table[0].length - 1); j++) {
                if (table[i][j].equals("[" + Joueur + "]")) {
                    index[0] = i;
                    index[1] = j;
                }
            }
        }

        return index;
    }

    public static boolean JoueurBloquer(String[][] table, int[] posA) {
        System.out.println("COUCOU ");
        int  X = posA[0];
        int Y = posA[1];

        if      ((!table[X][Y-1].equals("[ ]"))
                && (!table[X][Y+1].equals("[ ]"))
                && (!table[X-1][Y].equals("[ ]"))
                && (!table[X+1][Y].equals("[ ]")))
        {
            System.out.println("Joueur perdu");
            return true;
        }
        else
        {
            System.out.println("BOWDEL");
            return false;
        }

    }




    public static boolean DeplacerJoueur(String mouvement, int[] posA) {
        // Verifier si le mouvement est possible
        int X = posA[0];
        int Y = posA[1];

        if (mouvement.equals("Z")) {
            X--;
        }
        if (mouvement.equals("S")) {
            X++;
        }
        if (mouvement.equals("D")) {
            Y++;
        }
        if (mouvement.equals("Q")) {
            Y--;
        }

        // Condition de mouvement. Une condition s'impose si la mouvement effectué par le joueur est sur
        // une casse vide, si ce n'est pas le cas, celui-ci doit redonner de nouvelles cordonnées valide.
        if (table[X][Y].equals("[♤]") || table[X][Y].equals("[#]" )|| table[X][Y].equals("[♡]")) {
            AfficherGrille();
            System.out.println(" Case occupé");

            return false;
        } else { // Le pion se déplace dans ses nouvelles coordonnées X-Y, remet une case vide derrière lui
            table[X][Y] = table[posA[0]][posA[1]];
            table[posA[0]][posA[1]] = "[ ]";
            AfficherGrille();

            return true;
        }
    }

    // Fonction qui à l'aide de coordonnées X et Y à une
    public static void PlacementPion(int corX, int corY) {
        table[corX][corY] = "[#]";
        AfficherGrille();
    }


}