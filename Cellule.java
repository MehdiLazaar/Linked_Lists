/**
 * @author Lazaar Mehdi
 * 
 */
public class Cellule {

    /**
     * objet encapsulé dans la cellule
     */
    protected Object contenu;
    /**
     * pointeur sur la cellule suivante
     */
    protected Cellule suivant;

    /**
     * constructeur créant une cellule sans contenu ni suivant
     */
    public Cellule() {
        contenu = null;
        suivant = null;
    }

    /**
     * constructeur créant une cellule encapsulant l'objet _contenu 
     * @param _contenu l'objet à encapsuler
     */
    public Cellule(Object o_contenu) {
        contenu = o_contenu;
        suivant = null;
    }

    /**
     * accesseur de la cellule suivante
     * @return suivant
     */
    public Cellule getSuivant() {
        return suivant;
    }

    /**
     * modificateur du suivant
     * @param  la nouvelle cellule suivante
     */
    public void setSuivant(Cellule c_suivante) {
        suivant = c_suivante;
    }
    
    /**
     * modificateur du suivant
     * @param  un objet à encapsuler dans la future nouvelle cellule suivante
     */
    public void setSuivant(Object o_suivant) {
        suivant = new Cellule(o_suivant);
    }
    
    /**
     * accesseur du contenu
     * @return contenu
     */
    public Object getContenu() {
        return contenu;
    }

    /**
     * modificateur du contenu
     * @param  le nouveau contenu
     */
    public void setContenu(Object o_contenu) {
        contenu = o_contenu;
    }

    /**
     * repésentation de la cellule en chaîne de caractères
     */
    public String toString() {
        if (contenu == null) {
            return "nil";
        }
        else {
            return contenu.toString();
        }
    }
    
public static void main(String[] args){
    Cellule c1,c2,c3;
    c1 = new Cellule();
    c2 = new Cellule(3);
    System.out.println("c1 : " + c1);
    System.out.println("c2 : " + c2);
    c3 = new Cellule(c1);
    System.out.println("c1 : " + c1);
    System.out.println("c3 : " + c3);
    c1.setContenu(5);
    System.out.println("c1 : " + c1);
    System.out.println("c3 : " + c3);
    c1.setSuivant(c2); 
    c1.getSuivant().setContenu(6);
    System.out.println("c1 : " + c1);
    System.out.println("c2 : " + c2);
    //c2.getSuivant().setContenu(7); // il affiche un message d'erreur car il n'y a pas de cellule suivante pour c2
    System.out.println("c1 : " + c1);
    System.out.println("c2 : " + c2);
}
    }
