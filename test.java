package com.company;

import java.util.Scanner;

class beba  {

    public static void main(String[] args) {

        MenuChest();
    }

    public static int ErrorCheck(){
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
    public static void Rules() { //Fonction pour les règles


    }

    public static void Scores() { //Fonction pour les scores


    }

    public static void Start() { //Fonction pour le jeu


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

        //Scanner sc = new Scanner(System.in);
        int choix; // Variable de type entier qui prend en compte le premier choix de l'utilisateur
        int choix2;// Variable de type entier qui prend en compte le deuxième choix de l'utilisateur
        //choix = sc.nextInt();
        //ErrorCheck(choix);

        choix = ErrorCheck();
        System.out.println();


        switch (choix) {
            //Choix numéro 1
            case 1:
                System.out.println("Démarrer le jeu");
                Start();

                // Déterminer si on continue dans le jeu ou l'on retourne au menu


                do{
                    System.out.println("Nous sommes dans la partie jeu,choisir 0 pour retourner au menu principal. ");
                    Start();
                    choix2 = ErrorCheck();
                }
                while (choix2!=0);
                System.out.println("Nous sortons du jeu, Retour au menu");
                MenuChest();
                break;


            //Choix numéro 2
            case 2:
                System.out.println("Scores");
                Scores();

                // Déterminer si on continue dans l'affichage du score ou l'on retourne au menu
                do{
                    System.out.println("Nous sommes dans l'affichage du score,choisir 0 pour retourner au menu principal. ");
                    Scores();
                    choix2 = ErrorCheck();
                }
                while (choix2!=0);
                System.out.println("Nous sortons l'affichage du score, Retour au menu");
                MenuChest();
                break;


            //Choix numéro 3
            case 3:
                System.out.println("Règles du jeu");
                Rules();

                do{
                    System.out.println("Nous sommes dans l'affichage des règles,choisir 0 pour retourner au menu principal. ");
                    Rules();
                    choix2 = ErrorCheck();
                }
                while (choix2!=0);
                System.out.println("Nous sortons ll'affichage des règles, Retour au menu");
                MenuChest();
                break;


            //Choix numéro 4//
            case 4:
                System.out.println("Quitter");
                break;

            // Choix par défault si le choix est diffèrent des choix proposés auparavant//
            default:
                System.out.println("Attention choix incorrect!!! Veuillez resaissir une valeur correcte");
                MenuChest();
                break;
        }
    }






}
