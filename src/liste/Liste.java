package liste;

/**
 * Created by treVi1732721 on 2018-03-19.
 */
public interface Liste {
   public void add(int index,Object objet);
   public void add(Object objet);
   public void set(int index,Object objet);
   public Object get(int index);
   public void remove(int index);
   public void clear();
   public int size();

}
