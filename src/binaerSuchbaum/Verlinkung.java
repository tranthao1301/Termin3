package binaerSuchbaum;

/**
 * Die Klasse modelliert einen Suchbaum als Verlinkungsbaum
 * @author	Thu Thao Tran
 * 			Paulina Pansow
 *
 * @param <T>
 */
public class Verlinkung<T extends Comparable<T>> implements Suchbaum<T>
{
	private Node<T> _wurzel;
	
	/**
	 * Fügt die generischen Daten in den Verlinkungsbaum ein
	 * @param	element		Das hinzufügende Element
	 */
	@Override
	public void insert(T element) {
		if(_wurzel == null)
		{
			_wurzel = new Node<T>(element);
		}
		else
		{
			fuegeEin(element, _wurzel);
		}
		
	}
	
	/**
	 * Fügt die generischen Daten am gewünschten Platz ein
	 * @param element	Das hinzufügende Element
	 * @param node		Der gewünschte Platz
	 */
	private void fuegeEin(T element, Node<T> node) 
	{
		Node<T> newNode = new Node<T>(element);
		if(element.compareTo(node.gibElement())<0)
		{
			if(node.gibLinkenKnoten()==null)
			{
				node.setzeLinkenKnoten(newNode);
			}
			else
			{
				fuegeEin(element, node.gibLinkenKnoten());
			}
		}
		else if(element.compareTo(node.gibElement())>0)
		{
			if(node.gibRechtenKnoten()==null)
			{
				node.setzeRechtenKnoten(newNode);
			}
			else
			{
				fuegeEin(element, node.gibRechtenKnoten());
			}
		}
		else
		{
			System.out.println("Node already in tree!");
		}
	}
	
	/**
	 * Gibt den Baum in Nebenreihenfolge aus (Node - Links - Rechts)
	 */
	@Override
	public void preOrder() {
		preOrder1(_wurzel);
		
	}
	
	private void preOrder1(Node<T> node)
	{
		System.out.print(node.gibElement() + " ");
		
		if(node.gibLinkenKnoten()!=null)
		{
			preOrder1(node.gibLinkenKnoten());
		}
		if( node.gibRechtenKnoten()!=null)
		{
			preOrder1(node.gibRechtenKnoten());
		}
		
	}

	/**
	 * Gibt den Baum in Hauptreihenfolge aus (Links - Rechts - Node)
	 */
	@Override
	public void postOrder() {
		postOrder1(_wurzel);
		
	}
	
	private void postOrder1(Node<T> node)
	{
		if(node.gibLinkenKnoten()!=null)
		{
			postOrder1(node.gibLinkenKnoten());
		}
		if( node.gibRechtenKnoten()!=null)
		{
			postOrder1(node.gibRechtenKnoten());
		}
		System.out.print(node.gibElement() + " ");
	}
	
	/**
	 * Gibt den Baum in symmetrische Reihenfolge aus (Links - Node - Rechts)
	 */
	@Override
	public void inOrder() {
		inOrder1(_wurzel);
	}
	
	private void inOrder1(Node<T> node)
	{
		if(node.gibLinkenKnoten()!=null)
		{
			inOrder1(node.gibLinkenKnoten());
		}
		System.out.print(node.gibElement() + " ");
		if( node.gibRechtenKnoten()!=null)
		{
			inOrder1(node.gibRechtenKnoten());
		}
	}
}
