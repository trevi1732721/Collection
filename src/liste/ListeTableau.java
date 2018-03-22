package liste;

/**
 * Created by treVi1732721 on 2018-03-19.
 */
public class ListeTableau implements Liste{

    protected Object liste[] = new Object[5];
    protected int index;
    protected int taille = 0;

    public void add(int index,Object objet){
        tooSmall();
        for(int i = liste.length; i>index ;i--){
            liste[i] = liste[i+1];
        }
        liste[index]=objet;
        taille++;
    }
    public void add(Object objet) {
        tooSmall();
        liste[taille+1]=objet;
        taille++;
    }
    public void set(int index,Object objet){
        liste[index] = objet;
    }
    public Object get(int index){
        return liste[index];
    }
    public void remove(int index){
        liste[index]= null;
        taille--;
        for(int i = index;i<liste.length-1 ;i++){
            liste[i] = liste[i+1];
        }
    }
    public void clear(){
        liste = new Object[5];
        taille=0;
    }
    public int size(){
        return taille;
    }
    public void tooSmall(){
        if(liste.length == taille){
        Object tableau[]= new Object[liste.length*2];
        for(int i=0; i<=liste.length;i++){
            tableau[i]=liste[i];
        }
        liste = new Object[tableau.length];
        for(int i=0; i<=liste.length;i++){
            liste[i]=tableau[i];
        }
    }
    }

}
