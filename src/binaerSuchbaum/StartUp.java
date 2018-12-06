package binaerSuchbaum;

public class StartUp {

	public static void main(String[] args) {
		Suchbaum<Integer> array = new ArrayEinbettung<Integer>();
		Suchbaum<Integer> verlinkung = new Verlinkung<Integer>();
		
		System.out.println("Binärer Suchbaum:");
		
		System.out.println("\nArray Einbettung: ");
		array.insert(5);
		array.insert(4);
		array.insert(7);
		array.insert(3);
		array.insert(6);
		
		System.out.println("\nPostorder: ");
		array.postOrder();
		System.out.println("\nPreorder: ");
		array.preOrder();
		System.out.println("\nInorder: ");
		array.inOrder();
		
		System.out.println();
		System.out.println("\nVerlinkung: ");
		verlinkung.insert(5);
		verlinkung.insert(4);
		verlinkung.insert(7);
		verlinkung.insert(3);
		verlinkung.insert(6);
		
		System.out.println("\nPostorder: ");
		verlinkung.postOrder();
		System.out.println("\nPreorder: ");
		verlinkung.preOrder();
		System.out.println("\nInorder: ");
		verlinkung.inOrder();
		
	}

}
