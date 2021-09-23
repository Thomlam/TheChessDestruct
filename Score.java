import java.util.Scanner;
public class Score {

    public static String VerifierPseudo() {
        System.out.println("Votre pseudo doit contenir entre 2 et 10 caractères.");
        String pseudo = DemandePseudo();
        System.out.println("Votre pseudo possède " + pseudo.length() + "caractère(s).");
        if ((pseudo.length() < 2) || (10 < pseudo.length())) {
            System.out.println("Recommencer votre pseudo est incorrect");
            System.out.println();
            VerifierPseudo();
        } else {
            System.out.println("Le pseudo est correcte passons à la suite");
            System.out.println();

        }
        return pseudo;
    }

    public static String DemandePseudo(){
        Scanner sc = new Scanner(System.in);
        String nom;
        System.out.print("Le joueur choisit son pseudo : ");
        nom = sc.next();

        return nom;
    }


    public static String RecupTabScore(String PseudoScore){
        String p = PseudoScore;
        RemplirTabScore(p);
        return PseudoScore;
    }

    public static String [] RemplirTabScore (String Var){
        int i=0 ;
        int j= i+1;
        String[] TabRecup =new String[10];
        System.out.println("Affichage du tableau qui conservent les pseudos");
        System.out.println();
        for (i=0; i< TabRecup.length;i++){
            TabRecup[i]="Aucun Pseudo Ici";
        }

        for (i=0;  i < TabRecup.length;i++){
            TabRecup[j]= Var;
            System.out.println(j);
            System.out.println(i);

            for (i=0; i< TabRecup.length;i++){
                System.out.println(TabRecup[i]);
            }

        }
    return TabRecup;
    }

    public static void main(String[] args) {
        String pseudoPerso1;
        String pseudoPerso2;
        String [] tab = new String[10];

        System.out.println("Création du premier pseudo");
        System.out.println();
        pseudoPerso1=VerifierPseudo();

        System.out.println("Création du deuxième pseudo");
        System.out.println();
        pseudoPerso2= VerifierPseudo();

        System.out.println("Le premier joueur est :"+pseudoPerso1);
        System.out.println("Le deuxième joueur est :"+pseudoPerso2);

        RecupTabScore(pseudoPerso1);
        RecupTabScore(pseudoPerso2);
    }
}
