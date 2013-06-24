
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TriTree tree = new TriTree();
		tree.insert(10);
		tree.insert(3);
		tree.insert(7);
		tree.insert(9);
		tree.insert(6);
		tree.insert(5);
		tree.insert(8);
		
		tree.remove(7);
		tree.remove(2);
		
	}

}
