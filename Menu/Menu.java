package Menu;
import Main.GrilleDeJeu;
import Regles.Reglesdujeu;

import java.util.Scanner;

public class Menu {

    public static void ReturnOrNot (int choix2){
        while (choix2 !=0) {
            System.out.println("Choisir 0 pour retourner au menu principal");
            choix2 =VerifCheck();
        }
        System.out.println("Retour au menu principal");
        MenuChest();
    }

    public static int VerifCheck(){
        Scanner sc = new Scanner(System.in);
        int choix;
        try {
            choix = sc.nextInt();
        }
        catch (java.util.InputMismatchException e) {
            choix = -1;
        }

        return choix;
    }
    public static void rules() { //Fonction pour les règles
    Reglesdujeu.rules();

    }

    public static void scores() { //Fonction pour les scores


    }

    public static void start() { //Fonction pour le jeu
        GrilleDeJeu.main();


    }

    public static void MenuChest() {
        System.out.println("Bienvenue dans le Destruct Chess 2.0");
        System.out.println();
        System.out.println("Plusieurs choix s'offre à vous :");
        System.out.println();
        System.out.println("Faites votre choix avec parcimonie: ");
        System.out.println();
        System.out.println("1: Démarrer le jeu.");
        System.out.println();
        System.out.println("2: Afficher les scores");
        System.out.println();
        System.out.println("3:Afficher les Règles");
        System.out.println();
        System.out.println("4:Quitter le jeu");


        int choix; // Variable de type entier qui prend en compte le premier choix de l'utilisateur
        int choix2;// Variable de type entier qui prend en compte le deuxième choix de l'utilisateur

        choix = VerifCheck();


        switch (choix) {
            //Choix numéro 1
            case 1:
                System.out.println("Démarrer le jeu");
                start();

                // Déterminer si on continue dans le jeu ou l'on retourne au menu
                System.out.println("Choisir 0 pour retourner au menu principal.");
                choix2 = VerifCheck();
                ReturnOrNot(choix2);
                System.out.println("Nous quittons le jeu ");

                break;


            //Choix numéro 2
            case 2:
                System.out.println("Scores");
                scores();

                // Déterminer si on continue dans l'affichage du score ou l'on retourne au menu
                choix2 = VerifCheck();
                ReturnOrNot(choix2);
                System.out.println("Nous quittons les scores");
                break;


            //Choix numéro 3
            case 3:
                System.out.println("Règles du jeu");
                rules();

                choix2 = VerifCheck();
                ReturnOrNot(choix2);
                System.out.println("Nous quittons les règles .");
                break;


            //Choix numéro 4//
            case 4:
                System.out.println("Au revoir.");
                break;

            // Choix par défault si le choix est diffèrent des choix proposés auparavant//
            default:
                System.out.println("Attention choix incorrect!!! Veuillez resaissir une valeur correcte");
                MenuChest();
                break;
        }
    }


    public static void main() {

        MenuChest();
    }





}
