package com.company;

import java.util.Scanner;

class beba  {
   // Procédure de Retour en fonction d'une variable d'entrée choix
    public static void ReturnOrNot (int choix2) {
        while (choix2 != 0) {
            System.out.println("Choisir 0 pour retourner au menu principal. ");
            choix2 = VerifCheck();
        }
        System.out.println("Nous sommes rédiriger vers le menu");
        MenuChest();
    }
// Fonction sans paramètres qui retourne un entier pour vérifier le choix de l'utilisateur
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
    // PROCÉDURE QUI AFFICHE LES RÈGLES
    public static void Rules() { //Fonction pour les règles


    }
// PROCÉDURE QUI AFFICHE LES 10 DERNIERS SCORES
    public static void Scores() { //Fonction pour les scores


    }
// PRODCÉDURE QUI LANCE LE JEU
    public static void Start() { //Fonction pour le jeu


    }
// PROCÉDURE QUI AFFICHE LE MENU
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

        //Scanner sc = new Scanner(System.in);
        int choix; // Variable de type entier qui prend en compte le premier choix de l'utilisateur
        int choix2;// Variable de type entier qui prend en compte le deuxième choix de l'utilisateur

        choix = VerifCheck();
        System.out.println();


        switch (choix) {

            //Choix numéro 1 POUR ACCÉDER AU JEU

            case 1:
                System.out.println("Démarrer le jeu");
                Start();
                // DETERMINER SI L'UTILISATEUR SOUHAITE RETOURNER AU MENU PRINCIPAL//
                System.out.println("Nous sommes dans la partie jeu,choisir 0 pour retourner au menu principal. ");
                choix2 = VerifCheck();
                ReturnOrNot(choix2);
                break;


            //Choix numéro 2 POUR ACCÉDER AU 10 DERNIERS SCORES //
            case 2:
                System.out.println("Scores");
                Scores();

                // DETERMINER SI L'UTILISATEUR SOUHAITE RETOURNER AU MENU PRINCIPAL//
                System.out.println("Nous sommes dans l'affichage des Scores ,choisir 0 pour retourner au menu principal. ");
                choix2 = VerifCheck();
                ReturnOrNot(choix2);
                break;


            //Choix numéro 3 POUR ACCÉDER AU RÈGLES DU JEU//
            case 3:
                System.out.println("Règles du jeu");
                Rules();
                // DETERMINER SI L'UTILISATEUR SOUHAITE RETOURNER AU MENU PRINCIPAL//
                System.out.println("Nous sommes dans l'affichage des règles ,choisir 0 pour retourner au menu principal. ");
                choix2 = VerifCheck();
                ReturnOrNot(choix2);
                break;


            //Choix numéro 4 SORTIR DU JEU //
            case 4:
                System.out.println("Vous avez décidez de quitter le jeu.");
                break;

            // Choix par défault si le choix est diffèrent des choix proposés auparavant//
            default:
                System.out.println("Attention choix incorrect!!! Veuillez résaissir une valeur correcte");
                MenuChest();
                break;
        }
    }


    public static void main(String[] args) {

        MenuChest();
    }

}