package Regles;

public class Reglesdujeu {

    public static void rules() {
        System.out.println("Pendant son tour un joueur peut déplacer son pion d’une case (verticalement ou horizontalement), puis il détruit une case du plateau. ");
        System.out.println("Le dernier joueur pouvant encore se déplacer gagne.");
        System.out.println();
        System.out.println();
        System.out.println("Contraintes : ");
        System.out.println("- Un joueur ne peut pas détruire une case occupée.");
        System.out.println("- Un joueur ne peut pas occuper une case détruite ou une case déjà occupée.");
        System.out.println("- Un joueur bloqué pendant un tour est déclaré perdant.");
        System.out.println(" ------- Appuyez sur 0 pour revenir au Menu -----------");


    }
}


