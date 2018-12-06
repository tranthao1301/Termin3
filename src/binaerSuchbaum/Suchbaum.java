package binaerSuchbaum;

/**
 * Das Interface modelliert einen Suchbaum
 * @author	Thu Thao Tran	
 *			Paulina Pansow
 *
 * @param <T>
 */
public interface Suchbaum<T> 
{
/**
 * Fuegt einen Knoten im Baum ein
 * @param element	
 * 				 das einzufuegende Element
 */
 void insert(T element);
 
 /**
  * Gibt den Baum in Hauptreihenfolge aus
  * @return
  */
 void preOrder();
 
 /**
  * Gibt den Baum in Nebenreihenfolge aus
  * @return
  */
 void postOrder();
 
 /**
  * Gibt den Baum in symmetrische Reihenfolge aus
  * @return
  */
 void inOrder();
}
