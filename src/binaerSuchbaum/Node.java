package binaerSuchbaum;

public class Node<T extends Comparable<T>>{
	
		private Node<T> _linkerKnoten;
		private Node<T> _rechterKnoten;
		private Node<T> _wurzel;
		private T _element;
		
	/**
	 * Erzeuge einen neuen Knoten und setze gleich Element
	 * @param element
	 * 
	 */
	public Node(T element) {
		_element = element;
	}

	/**
	 * Gibt den rechten Knoten zurueck
	 * 
	 */
	public Node<T> gibRechtenKnoten() {
		return _rechterKnoten;
	}

	/**
	 * Setzt den rechten Knoten
	 * 
	 * @param rechterKnoten
	 * 						Der rechte Knoten
	 */
	public void setzeRechtenKnoten(Node<T> rechterKnoten) {
		_rechterKnoten = rechterKnoten;
	}

	/**
	 * Gibt den linken Knoten zurueck
	 * 
	 */
	public Node<T> gibLinkenKnoten() {
		return _linkerKnoten;
	}

	/**
	 * Setzt den linken Knoten
	 * 
	 * @param linkerKnoten
	 * 						Der linke Knoten
	 */
	public void setzeLinkenKnoten(Node<T> linkerKnoten) {
		_linkerKnoten = linkerKnoten;
	}
	
	/**
	 * Gibt den Wurzel-Knoten zurueck
	 * 
	 */
	public Node<T> gibWurzel()
	{
		return _wurzel;
	}
	
	/**
	 * Setze den Wurzel-Knoten
	 * @param wurzel 
	 * 				Der Wurzel-Knoten
	 */
	public void setzeWurzel(Node<T> wurzel)
	{
		_wurzel = wurzel;
	}

	/**
	 * Gibt das Element des Knotens zurueck
	 * 
	 * @return _element
	 * 					Das zurueckgegebene Element des Knotens
	 */
	public T gibElement() {
		return _element;
	}


}

