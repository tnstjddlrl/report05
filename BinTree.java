public class BinTree {
	public static void main(String[] args) {
		BTNode<Integer> n1 = new BTNode<Integer>(100,null,null);
		BTNode<Integer> n2 = new BTNode<Integer>(200,null,null);
		BTNode<Integer> n3 = new BTNode<Integer>(300,null,null);
		BTNode<Integer> n4 = new BTNode<Integer>(400,null,null);
		BTNode<Integer> n5 = new BTNode<Integer>(500,null,null);
		BTNode<Integer> n6 = new BTNode<Integer>(600,null,null);
		BTNode<Integer> n7 = new BTNode<Integer>(700,null,null);
		BTNode<Integer> n8 = new BTNode<Integer>(800,null,null);
		
		n1.setLeft(n2); n1.setRight(n3);
		n1.setLeft(n4); n1.setRight(n5);
		n1.setLeft(n6); n1.setRight(n7);
		n1.setLeft(n8);
		
		BinaryTree<Integer> t = new BinaryTree<Integer>();
		t.setRoot(n1);
		
		System.out.print("트리 노드 수 = " + t.size(t.getRoot()) + "\n트리 높이    =" + t.height(t.getRoot()));
		System.out.printf("\n전위 순회: ");
		t.preorder(t.getRoot());
		System.out.printf("\n중위 순회: ");
		t.inorder(t.getRoot());
		System.out.printf("\n후위 순회: ");
		t.postorder(t.getRoot());
		System.out.printf("\n레벨 순회: ");
		t.levelorder(t.getRoot());
		System.out.println();
		
		BTNode<Integer> n10 = new BTNode<Integer>(100,null,null);
		BTNode<Integer> n20 = new BTNode<Integer>(200,null,null);
		BTNode<Integer> n30 = new BTNode<Integer>(300,null,null);
		BTNode<Integer> n40 = new BTNode<Integer>(400,null,null);
		BTNode<Integer> n50 = new BTNode<Integer>(500,null,null);
		BTNode<Integer> n60 = new BTNode<Integer>(600,null,null);
		BTNode<Integer> n70 = new BTNode<Integer>(700,null,null);
		BTNode<Integer> n80 = new BTNode<Integer>(800,null,null);
		
		n10.setLeft(n20); n10.setRight(n30);
		n20.setLeft(n40); n20.setRight(n50);
		n30.setLeft(n60); n30.setRight(n70);
		n40.setLeft(n80);
		
		BinaryTree<Integer> t2 = new BinaryTree<Integer>();
		t2.setRoot(n10);
		
		System.out.printf("동일성 검사:    "+BinaryTree.isEqual(t.getRoot(), t2.getRoot()));
		System.out.println();
		
		BinaryTree<Integer> t3 = new BinaryTree<Integer>();
		t3.setRoot(t3.copy(t.getRoot()));
		System.out.printf("copy 테스트: "+ BinaryTree.isEqual(t.getRoot(), t3.getRoot()));
		System.out.println();
	}
}
