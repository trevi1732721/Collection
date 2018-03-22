package liste.linkedList;
import liste.*;

/**
 * Created by treVi1732721 on 2018-03-19.
 */
public class listeLiée implements Liste {
    private noeud debut;
    private noeud fin;
    private int taille;

    public void add(Object objet){
        if(debut.getObject()== null){
            debut.setObject(objet);
            debut.setNext(null);
            debut = fin;
            taille++;
        }else{
           noeud nouveau = new noeud();
           index(taille-1).setNext((noeud) objet);
           nouveau.setObject(objet);
           nouveau.setNext(fin.getNext());
           fin = nouveau;
           fin.setObject(nouveau.getNext());
           taille++;
        }
    }
    public void add(int index,Object objet){

    }
    public void set(int index,Object objet){
        index(index).setObject(objet);
    }
    public Object get(int index){

    }
    public void remove(int index){

    }
    public void clear(){

    }
    public int size(){

    }
    public noeud index(int index){
        noeud position;
        position = debut;
        for (int i=0; 1<index; i++){
            position = position.getNext();
        }
        return position;
    }
}
