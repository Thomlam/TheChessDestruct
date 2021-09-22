package App;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static String nomJ1;
    static String nomJ2;

    public static void main(String[] args) {

        //Tableau.ShowMyBoard();


        System.out.print("Le joueur 1 choisi son pseudo : ");
        nomJ1 = Joueur.choisirPseudo();

        System.out.print("Le joueur 2 choisi son pseudo : ");
        nomJ2 = Joueur.choisirPseudo();

        System.out.println( nomJ1 );
        System.out.println( nomJ2 );

    }
}
