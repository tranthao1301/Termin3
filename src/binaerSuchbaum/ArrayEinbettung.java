package binaerSuchbaum;

/**
 * Diese Klasse modelliert einen Suchbaum als Array-Einbettung
 * @author Thu Thao Tran
 * 		   Paulina Pansow
 *
 * @param <T>
 */

public class ArrayEinbettung<T> implements Suchbaum<T> {
	
	private Object[] arrayBaum;
	
	public ArrayEinbettung()
	{
		arrayBaum = new Object[10];
	}
	
	/**
	 * Fügt die generischen Daten in den Arraybaum ein
	 * @param element Das hinzufügende Element
	 * 
	 */
	@Override
	public void insert(T element)
	{
		if(arrayBaum[1]==null)
		{
			arrayBaum[1] = element;
		}
		else
		{
			fuegeEin(1,element);
		}
	}
	
	/**
	 * Fügt die generischen Daten am gewünschten Index des Arraybaums ein
	 * @param index		Das gewünschte Index
	 * @param element	Das hinzufügende Element
	 */
	private void fuegeEin(int index, T element) 
	{
		if(((Comparable) arrayBaum[index]).compareTo(element)<0)
		{
			addiereRechts(index);
			if(arrayBaum[index*2+1] == null)
			{
				arrayBaum[index*2+1] = element;
			}
			else
			{
				fuegeEin(index*2+1,element);
			}
		}
		else
		{
			addiereLinks(index);
			if(arrayBaum[index*2] == null)
			{
				arrayBaum[index*2] = element;
			}
			else
			{
				fuegeEin(index*2, element);
			}
			
		}
		
	}
	
	/**
	 * Vergrößt den Baum an der linken Seite
	 * @param index		Das nächste Index an der linken Seite
	 */
	private void addiereLinks(int index) {
		if(index*2 >= arrayBaum.length)
		{
			Object[] temp = new Object[arrayBaum.length*2];
			System.arraycopy(arrayBaum,0,temp,0,arrayBaum.length);
			arrayBaum = temp;
		}
		
	}
	
	/**
	 * Vergrößt den Baum an der rechten Seite
	 * @param index		Das nächste Index an der rechten Seite
	 */
	private void addiereRechts(int index) {
		if(index*2+1 >= arrayBaum.length)
		{
			Object[] temp = new Object[arrayBaum.length*2];
			System.arraycopy(arrayBaum, 0, temp, 0, arrayBaum.length);
			arrayBaum = temp;
		}
		
	}

	/**
	 * Gibt den Baum in Hauptreihenfolge aus
	 * 
	 */
	@Override
	public void preOrder()
	{
		preOrder1(1);
	}
	
	private void preOrder1(int index) 
	{
		System.out.print(arrayBaum[index].toString() + " ");
		if(index*2 <= arrayBaum.length && arrayBaum[index*2]!= null)
		{
			preOrder1(index*2);
		}
		if(index*2+1 <= arrayBaum.length && arrayBaum[index*2+1]!=null)
		{
			preOrder1(index*2+1);
		}
		
	}
	
	/**
	 * Gibt den Baum in Nebenreihenfolge aus
	 * 
	 */
	@Override
	public void postOrder()
	{
		postOrder1(1);
	}
	
	private void postOrder1(int index) 
	{
		if(index*2 <= arrayBaum.length && arrayBaum[index*2]!= null)
		{
			postOrder1(index*2);
		}
		if(index*2+1 <= arrayBaum.length && arrayBaum[index*2+1]!=null)
		{
			postOrder1(index*2+1);
		}
		System.out.print(arrayBaum[index]+" ");
		
	}
	
	/**
	 * Gibt den Baum in symmetrische Reihenfolge aus
	 * 
	 */
	@Override
	public void inOrder() {
		inOrder1(1);
		
	}
	
	private void inOrder1(int index)
	{
		if(index*2 <= arrayBaum.length && arrayBaum[index*2]!= null)
		{
			inOrder1(index*2);
		}
		
		System.out.print(arrayBaum[index]+" ");
		
		if(index*2+1 <= arrayBaum.length && arrayBaum[index*2+1]!=null)
		{
			inOrder1(index*2+1);
		}
	}
}
