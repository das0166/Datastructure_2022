package tree;

public class testTreeDL {
	/**
	 * starting here! main(String[] args)
	 */
	public static void main(String[] args) {
		System.out.println("== Tree Double Linked ======= 단독 노드 ====");
		System.out.println("           nodeSub: " + new TreeNodeDL('+'));		
		TreeNodeDL node2   = new TreeNodeDL('2');
		System.out.println("             node2: " + node2);		

		System.out.println("== Tree Double Linked ======= 이진 트리 ====");
		System.out.println("----------------------------- 수동 생성 ----");
		
		TreeNodeDL nodeMul = new TreeNodeDL('*');
		TreeNodeDL nodeDiv = new TreeNodeDL('/');
		TreeNodeDL nodeSub = new TreeNodeDL('-');
		
		nodeMul.setBoth('2', '3');
		nodeDiv.setBoth('5', '6');	
		nodeSub.setBoth(nodeMul, nodeDiv);		
		
		TreeDL polynomialTree = new TreeDL(nodeSub);
		System.out.println("    inOrder of Sub: " + polynomialTree.inOrderTraversal(nodeSub));		
		System.out.println("    inOrder of Mul: " + polynomialTree.inOrderTraversal(nodeMul));
		
		System.out.println("---------------------------- traversal ----");
		System.out.println("  postOrder of Sub: " + polynomialTree.postOrderTraversal(nodeSub));		
		System.out.println("   preOrder of Mul: " + polynomialTree.preOrderTraversal(nodeMul));		

		System.out.println("--------------------------- 자동 insert ----");
		TreeDL treeDaelim20 = new TreeDL();
		treeDaelim20.insert('D');
		treeDaelim20.insert('a');
		treeDaelim20.insert('e');
		treeDaelim20.insert('_');
		treeDaelim20.insert('L');
		TreeDL.insert(treeDaelim20,  'i');
		TreeDL.insert(treeDaelim20,  'm');
		TreeDL.insert(treeDaelim20,  '2');
		TreeDL.insert(treeDaelim20,  '0');
		System.out.println("      treeDaelim20: " + treeDaelim20.inOrderTraversal(treeDaelim20.getRoot()));	
		System.out.println("   there is 'i' ? > " + treeDaelim20.isItem('i'));	
		System.out.println("            '7' ? > " + treeDaelim20.isItem('7'));	

		System.out.println("------------------------------- delete ----");
		treeDaelim20.remove('D');
		System.out.println("        remove 'D': " + treeDaelim20.inOrderTraversal(treeDaelim20.getRoot()));	
		treeDaelim20.remove('0');
		System.out.println("        remove '0': " + treeDaelim20.inOrderTraversal(treeDaelim20.getRoot()));	
		treeDaelim20.insert('D');
		System.out.println("        insert 'D': " + treeDaelim20.inOrderTraversal(treeDaelim20.getRoot()));	
	}
}
