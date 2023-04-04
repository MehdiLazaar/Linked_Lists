/**
 * @author Lazaar Mehdi
 * 
 */
public class ListeChainee{
    //Attributs
    protected Cellule tete;
    protected Cellule queue;

    //Constructeur
    public ListeChainee(){
        tete = null;
        queue = null;
    }
    public ListeChainee( Cellule _tete){
        tete = _tete;
        queue = tete;
        Cellule temp = tete;
        if(temp != null){
            while(temp.getSuivant() != null){
                temp = temp.getSuivant();
            }
            queue = temp;
        }
    }
    public Cellule getTete(){
        return tete;
    }
    public Cellule getQueue(){
        return queue;
    }
    public void ajouteTete(Object o_tete){
        Cellule nouvelle = new Cellule(o_tete);
        if(estVide()){
            tete = nouvelle;
            queue = nouvelle;
        } else {
            tete.setSuivant(nouvelle);
            tete = nouvelle;
        }
    }
    public void ajouteQueue(Object o_queue){
        Cellule nouvelle = new Cellule(o_queue);
        if(estVide()){
            tete = nouvelle;
            queue = nouvelle;
        } else {
            queue.setSuivant(nouvelle);
            queue = nouvelle;
        }
    }
    public boolean estVide(){
        return (tete == null);
    }
    public Object enTete(){
        if(tete == null){
            return null;
        }
        return getTete().getContenu();
    }
    public Object enQueue(){
        if(queue == null){
            return null;
        }
        return queue.getContenu();
    }
    public void retireTete(){
        if(estVide()){
            tete = queue = null;
        } else {
            Cellule tmp = tete;
            tete = tete.getSuivant();
            tmp.setSuivant(null);
        }
    }
    public void retireQueue(){
        if(tete == queue){
            tete = null;
            queue = null;
        } else {
            Cellule tmp = tete;
            while(tmp.getSuivant() != queue){
                tmp = tmp.getSuivant();
            }
            tmp.setSuivant(null);
            queue = tmp;
        }

    }
    public String toString(){
        if(estVide()){
            return "nil";
        }
        Cellule courante = tete;
        String resu = courante.toString();
        courante = courante.getSuivant();
        while(courante != null){
            resu = resu + " -> " +courante.toString();
            courante = courante.getSuivant();
        }
        return resu + " -> nil";
    }
    public void inserePos( Object o, int pos){
        // la premiere position est 1 
        if(pos <= 0){
            System.out.println("Position non valide");
        } else {
            if(pos == 1){
                //liste est vide ou non
                ajouteTete(o);
            } else {
                Cellule c = new Cellule(o);
                Cellule avant = null;
                Cellule apres = tete;
                int i = 1;
                while(i != pos && apres != null){
                    avant = apres;
                    apres = apres.getSuivant();
                    i++;
                }
                if(apres == null){
                    System.out.println("position apres fin de liste, pas d'insertion");
                } else {
                    avant.setSuivant(c);
                    c.setSuivant(apres);
                }
            }
        }
    }
    public void retirePos(int pos){
        if(pos <= 0){
            System.out.println("Il n y a pas d'éléments à supprimer");
        } else if( tete == queue){
            tete = queue = null;
        } else {
            int i =1;
            Cellule avant = null;
            Cellule apres = tete;
            while( i != pos || apres!= null){
                avant = apres;
                apres = apres.getSuivant();
                i++;
            }
            avant.setSuivant(apres.getSuivant());
            apres.setSuivant(null);
        }
    }
}