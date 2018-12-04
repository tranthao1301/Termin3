package binaerSuchbaum;

public class Verlinkung<T extends Comparable<T>> implements Suchbaum<T>
{
	private Node<T> _wurzel;
	
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
