package liste;

/**
 * Created by treVi1732721 on 2018-03-19.
 */
public class ListeLiée<T> implements Liste<T> {
    private Noeud debut = null;
    private Noeud fin;
    private int taille;

    public void add(T objet) {
        if (taille == 0) {
            Noeud nouveau = new Noeud();
            nouveau.setObject(objet);
            debut = nouveau;
            fin = debut;
            taille++;
        } else {
            Noeud suite = new Noeud();
            Noeud nouveauFin = new Noeud();
            suite.setObject(fin.getObject());
            suite.setNext(nouveauFin);
            nouveauFin.setObject(objet);
            fin = nouveauFin;
            index(taille - 2).setNext(suite);
            taille++;
        }
    }

    public void add(int index, T objet) {
        if (index == 0) {
            Noeud nouveau = new Noeud();
            nouveau.setObject(objet);
            debut = nouveau;
            fin = debut;
            taille++;
        } else {
            Noeud suite = new Noeud();
            Noeud nouveauFin = new Noeud();
            suite.setObject(fin.getObject());
            suite.setNext(nouveauFin);
            nouveauFin.setObject(objet);
            index(index).setObject(nouveauFin.getObject());
            index(index).setNext(nouveauFin);
            index(taille - 2).setNext(suite);
            taille++;
        }
    }

    public void set(int index, T objet) {
        index(index).setObject(objet);
    }

    public T get(int index) {
        return (T) (index(index).getObject());
    }

    public void remove(int index) {
        index(index - 1).setNext(index(index + 1));
        taille--;
    }

    public void clear() {
        debut.setNext(null);
        debut.setObject(null);
        taille = 0;
    }

    public int size() {
        return taille;
    }

    public Noeud index(int index) {
        Noeud position;
        position = debut;
        if (index == 0) {
            return position;
        }else{
            for (int i = 0; i < index; i++) {
                position = position.getNext();
            }
            return position;
        }
    }
}
