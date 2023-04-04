public class Test {
    public static void main (String[] args) {
        // creation d'une liste vide
        System.out.println("Creation d'une liste vide");
        ListeChainee lc = new ListeChainee();
        System.out.println("Affichage de la liste vide");
        System.out.println("lc : "+lc);
        // utilisation des arguments du programme
        System.out.println("initialisation avec ajouteTete");
        int i=0;
        while(i < args.length) {
        lc.ajouteTete(args[i]);
        i++;
    }
        System.out.println("Affichage de la liste obtenue");
        System.out.println("lc : "+lc);
        // creation d'un deuxieme liste vide
        System.out.println("Creation d'une autre liste vide");
        ListeChainee lc2 = new ListeChainee();
        System.out.println("initialisation avec ajouteQueue");
        i=0;
        while(i < args.length) {
        lc2.ajouteQueue(args[i]);
        i++;
    }
        System.out.println("Affichage de la liste obtenue");
        System.out.println("lc2 : "+lc2);
        // creation d'une troisieme liste a partir de la tete de lc2
        System.out.println("Creation d'une autre liste");
        ListeChainee lc3 = new ListeChainee(lc2.getTete());
        // affichage de la liste obtenue
        System.out.println("Affichage de la liste obtenue");
        System.out.println("lc3 : "+lc3);
        // retrait de la tete de lc :
        lc.retireTete();
        System.out.println("Affichage de lc apres retrait de lc.tete");
        System.out.println("lc : "+lc);
        System.out.println();
        // Ajout d'élément en tête de la liste
        lc.ajouteTete("0");
        lc.ajouteTete("1");
        lc.ajouteTete("2");
        System.out.println("Affichage de la liste obtenue apres ajout de têtes ");
        System.out.println("Lc : " + lc);
        // retrait de la queue de lc2 :
        lc2.retireQueue();
        System.out.println("Affichage de lc2 et lc3 apres retrait de lc2.queue");
        System.out.println("lc2 : "+lc2);
        System.out.println("lc3 : "+lc3);
        System.out.println();
        // Insertion d'une cellule à une position donné
        lc2.inserePos("3",2);
        System.out.println(lc2);
        System.out.println("Affichage de la liste obtenue apres insertion d'une cellule à une position donnée");
        System.out.println("lc2 : " +lc2);
        lc2.retirePos(2);
        System.out.println("lc2 : " +lc);
    }
}
