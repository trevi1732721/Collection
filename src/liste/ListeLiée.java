package liste;

/**
 * Created by treVi1732721 on 2018-03-19.
 */
public class ListeLiée<T> implements Liste<T> {
    private Noeud debut;
    private Noeud fin;
    private int taille;

    public void add(T objet){
        if(debut.getObject()== null){
            debut.setObject(objet);
            debut.setNext(null);
            debut = fin;
            taille++;
        }else{
           Noeud nouveau = new Noeud();
           index(taille-1).setNext((Noeud) objet);
           nouveau.setObject(objet);
           nouveau.setNext(fin.getNext());
           fin = nouveau;
           fin.setObject(nouveau.getNext());
           taille++;
        }
    }
    public void add(int index,T objet){
         Noeud nouveau = new Noeud();
         nouveau.setObject(objet);
         nouveau.setNext(index(index-1).getNext());
         index(index-1).setNext(nouveau);
         taille++;

    }
    public void set(int index,T objet){
        index(index).setObject(objet);
    }
    public T get(int index){
        return(T) index(index).getObject();
    }
    public void remove(int index){
        index(index-1).setNext(index(index+1));
        taille--;
        }
    public void clear(){
        debut= null;
        taille =0;
    }
    public int size(){
        return taille;
    }
    public Noeud index(int index){
        Noeud position;
        position = debut;
        for (int i=0; 1<index; i++){
            position = position.getNext();
        }
        return position;
    }
}
