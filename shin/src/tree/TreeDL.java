package tree;

public class TreeDL {
	/**
	 * 2�� Ʈ���� �ֻ��� ���
	 * @see #getRoot()
	 * @see #setRoot(TreeNodeDL root)
	 */
	private TreeNodeDL root;

	/**
	 * �⺻ ������,
	 * ������ ���� 2�� Ʈ��(tree) ����
	 */
	public TreeDL() {
		this.root = null;
	}

	/**
	 * �ֻ��� root ��尡 �ִ� 2�� ���� ����
	 * @param root �ֻ��� ���
	 */
	public TreeDL(TreeNodeDL root) {
		this.root = root;
	}

	/**
	 * �ֻ��� root ��带 �˻�
	 * @return ������ ���
	 */
	public TreeNodeDL getRoot() {
		return root;
	}
	
	/**
	 * �ֻ��� root ��带 ����
	 * @param root �����Ϸ��� ������ ���
	 */
	public void setRoot(TreeNodeDL root) {
		this.root = root;
	}

	/**
	 * ���� 2�� Ʈ���� ��带 �߰�
	 * @param item �߰��Ϸ��� ������
	 */	
	public void insert(char item) {
		if (this.root == null) this.root = new TreeNodeDL(item);
		else insert(this, item);
	}

	/**
	 * 2�� Ʈ���� ��带 ������ ��������, ũ�� ���������� �߰�
	 * @param tree ��带 �߰��Ϸ��� 2�� Ʈ��
	 * @param item �߰��Ϸ��� ������
	 * @return ��尡 �߰��Ǿ� ������ Ʈ��
	 */	
	static public TreeNodeDL insert(TreeDL tree, char item) {
		TreeNodeDL node = tree.root;

		;	// ?????

		return node;
	}

	/**
	 * ���� 2�� Ʈ������ ��带 ����
	 * @param item �����Ϸ��� ����� ��
	 */	
	public void remove(char item) {
		TreeNodeDL parent = this.searchParent(item);
		if (parent == null) return;

		this.remove(new TreeDL(parent), this.search(item));
	}

	/**
	 * ������ 2�� Ʈ������ ��带 ����
	 * @param tree ��带 �����Ϸ��� Ʈ��
	 * @param node �����Ϸ��� ���
	 */	
	public void remove(TreeDL tree, TreeNodeDL node) {
		TreeNodeDL parent = tree.root;
		if (parent == null) return;
				
		if (node.left == null && node.right == null) {		// no child
			;	// ?????
		}
		else if (node.left != null && node.right == null) {	// only left hand child
			;	// ?????
		}
		else if (node.left == null && node.right != null) {	// only right hand child
			;	// ?????
		}
		else {							// both hand child
			;	// ?????
		}
	}	 

	/**
	 * 2�� Ʈ������ �������� �θ� ��带 �˻�
	 * @param item �˻��Ϸ��� ������
	 * @return �θ� ���,
	 *         ���� �˻��Ϸ��� ��尡 �ֻ����̸� �ڱ� �ڽ�,
	 *         �ش� �����Ͱ� ������ null
	 */
	public TreeNodeDL searchParent(char item) {		
        if (item == this.root.item) return this.root;
        
	TreeNodeDL curr   = this.root;
	TreeNodeDL parent = this.root;
		
        while(curr != null) {       	
            if (item == curr.item) break;
            
            parent = curr;
            if      (item < curr.item) curr = curr.left;
            else if (item > curr.item) curr = curr.right;
        }
        
        if (curr == null) return null;
        else              return parent;
    }    

	/**
	 * 2�� Ʈ������ �����͸� �˻�
	 * @param item �˻��Ϸ��� ������
	 * @return �ش� ���, ������ null
	 */
	public TreeNodeDL search(char item) {
        TreeNodeDL parent = this.searchParent(item);	
        
	if (parent == null)         return null;		
        if (item == this.root.item) return this.root;

	if (parent.right != null && parent.right.item  == item)
		return parent.right;
	else
		return parent.left;
    }   

	/**
	 * 2�� Ʈ���� �����Ͱ� �����ϴ����� �˻�
	 * @param item �˻��Ϸ��� ������
	 * @return true: ����, false: otherwise
	 */
	public Boolean isItem(char item) {
		if (this.searchParent(item) != null) return true;
		else                                 return false;
	} 
    
	/**
	 * ������ ���� ��ȸ������ ��带 ��ȸ
	 * D ���� ��� >> L ���� Ʈ�� >> R ������ Ʈ��
	 * @param root ������ ���
	 * @return ��ȸ ��� ���ڿ�
	 */
	public String preOrderTraversal(TreeNodeDL root) {
		String buff = "";
		if (root != null) {
			buff += root.item;
			buff += preOrderTraversal(root.left);
			buff += preOrderTraversal(root.right);
		}
		
		return buff;
	}
	
	/**
	 * ������ �߾� ��ȸ������ ��带 ��ȸ
	 * L ���� Ʈ�� >> D ���� ��� >> R ������ Ʈ��
	 * @param root ������ ���
	 * @return ��ȸ ��� ���ڿ�
	 */	
	public String inOrderTraversal(TreeNodeDL root) {

		;	// ?????

	}
	
	/**
	 * ������ �Ĺ� ��ȸ������ ��带 ��ȸ
	 * L ���� Ʈ��  >> R ������ Ʈ��>> D ���� ���
	 * @param root ������ ���
	 * @return ��ȸ ��� ���ڿ�
	 */
	public String postOrderTraversal(TreeNodeDL root) {

		;	// ?????

	}
}