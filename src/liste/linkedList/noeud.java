package liste.linkedList;

/**
 * Created by treVi1732721 on 2018-03-19.
 */
public class noeud {
    protected Object object;
    protected noeud next;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public noeud getNext() {
        return next;
    }

    public void setNext(noeud nextObject) {
        this.next = nextObject;
    }
}
