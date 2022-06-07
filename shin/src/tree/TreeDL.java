package tree;

public class TreeDL {
	/**
	 * 2진 트리의 최상위 노드
	 * @see #getRoot()
	 * @see #setRoot(TreeNodeDL root)
	 */
	private TreeNodeDL root;

	/**
	 * 기본 생성자,
	 * 내용이 없는 2진 트리(tree) 생성
	 */
	public TreeDL() {
		this.root = null;
	}

	/**
	 * 최상위 root 노드가 있는 2진 투리 생성
	 * @param root 최상위 노드
	 */
	public TreeDL(TreeNodeDL root) {
		this.root = root;
	}

	/**
	 * 최상위 root 노드를 검사
	 * @return 시작점 노드
	 */
	public TreeNodeDL getRoot() {
		return root;
	}
	
	/**
	 * 최상위 root 노드를 변경
	 * @param root 변경하려는 시작점 노드
	 */
	public void setRoot(TreeNodeDL root) {
		this.root = root;
	}

	/**
	 * 현재 2진 트리에 노드를 추가
	 * @param item 추가하려는 데이터
	 */	
	public void insert(char item) {
		if (this.root == null) this.root = new TreeNodeDL(item);
		else insert(this, item);
	}

	/**
	 * 2진 트리에 노드를 작으면 왼쪽으로, 크면 오른쪽으로 추가
	 * @param tree 노드를 추가하려는 2진 트리
	 * @param item 추가하려는 데이터
	 * @return 노드가 추가되어 정리된 트리
	 */	
	static public TreeNodeDL insert(TreeDL tree, char item) {
		TreeNodeDL node = tree.root;
		TreeNodeDL newNode = new TreeNodeDL();
		newNode.item = item;
		newNode.left = null;
		newNode.right = null;
		if(node == null) return newNode;
		else if(newNode.item < node.item) node.left = insert(new TreeDL(node.left),item);
		else if(newNode.item > node.item) node.right = insert(new TreeDL(node.right),item);
		return node;
	}

	/**
	 * 현재 2진 트리에서 노드를 제거
	 * @param item 제거하려는 노드의 값
	 */	
	public void remove(char item) {
		TreeNodeDL parent = this.searchParent(item);
		if (parent == null) return;

		this.remove(new TreeDL(parent), this.search(item));
	}

	/**
	 * 지정한 2진 트리에서 노드를 제거
	 * @param tree 노드를 제거하려는 트리
	 * @param node 제거하려는 노드
	 */	
	public void remove(TreeDL tree, TreeNodeDL node) {
		TreeNodeDL parent = tree.root;
		if (parent == null) return;
		if (node.left == null && node.right == null) {
			if(parent.left == node) parent.left = null;
			else parent.right = null;
		}
		else if (node.left != null && node.right == null) {
			if(parent.left == node) parent.left = node.left;
			else parent.right = node.left;
		}
		else if (node.left == null && node.right != null) {
			if(parent.left == node) parent.left = node.right;
			else parent.right = node.right;
		}
		else {
			TreeNodeDL right = node.right;
			TreeNodeDL tempTree = right.left;
			char c = 0;
			while(tempTree != null) { 
				c = tempTree.item;
				tempTree = tempTree.left;
			}
			this.remove(c);
			node.item = c;
		}
	}	 

	/**
	 * 2진 트리에서 데이터의 부모 노드를 검색
	 * @param item 검색하려는 데이터
	 * @return 부모 노드,
	 *         만약 검색하려는 노드가 최상위이면 자기 자신,
	 *         해당 데이터가 없으며 null
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
	 * 2진 트리에서 데이터를 검색
	 * @param item 검색하려는 데이터
	 * @return 해당 노드, 없으며 null
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
	 * 2진 트리에 데이터가 존재하는지를 검사
	 * @param item 검사하려는 데이터
	 * @return true: 존재, false: otherwise
	 */
	public Boolean isItem(char item) {
		if (this.searchParent(item) != null) return true;
		else                                 return false;
	} 
    
	/**
	 * 계층적 전방 교회법으로 노드를 순회
	 * D 현재 노드 >> L 왼쪽 트리 >> R 오른쪽 트리
	 * @param root 시작점 노드
	 * @return 순회 결과 문자열
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
	 * 계층적 중앙 교회법으로 노드를 순회
	 * L 왼쪽 트리 >> D 현재 노드 >> R 오른쪽 트리
	 * @param root 시작점 노드
	 * @return 순회 결과 문자열
	 */	
	public String inOrderTraversal(TreeNodeDL root) {
		String buff = "";
		if (root != null) {
			buff += inOrderTraversal(root.left);
			buff += root.item;
			buff += inOrderTraversal(root.right);
		}
		return buff;
	}
	public String postOrderTraversal(TreeNodeDL root) {
		String buff = "";
		if (root != null) {
			buff += postOrderTraversal(root.left);
			buff += postOrderTraversal(root.right);
			buff += root.item;
		}
		return buff;

	}
}
