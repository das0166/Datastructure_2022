package tree;


public class TreeNodeDL {
	/**
	 * 트리 노드의 데이터
	 * @see #getItem()
	 * @see #setItem(char item)
	 */
	char item = '\0';

	/**
	 * 오른쪽 이웃 노드
	 * @see #getRight()
	 * @see #setRight(TreeNodeDL node)
	 */
	TreeNodeDL right = null;
	
	/**
	 * 왼쪽 이웃 노드
	 * @see #getLeft()
	 * @see #setLeft(TreeNodeDL node)
	 */
	TreeNodeDL left = null;
	
	/**
	 * 기본 생성자
	 * 내용이 없는 노드('\0') 생성
	 */
	public TreeNodeDL() {
		this.item = '\0';
	}

	/**
	 * 테이터만으로 노드 생성
	 * @param item 저장하려는 데이터
	 */
	public TreeNodeDL(char item) {
		this.setItem(item);
	}
		
	/**
	 * 저장된 데이터를 검사
	 * @return 데이터 값
	 */
	public char getItem() {
		return this.item;
	}
	
	/**
	 * 데이터를 변경
	 * @param item 저장하려는 데이터
	 */
	public void setItem(char item) {
		this.item = item;		
	}
	
	/**
	 * 왼쪽 연결 가지를 검사
	 * @return 왼쪽 트리
	 */
	public TreeNodeDL getLeft() {
		return this.left;
	}
	
	/**
	 * 왼쪽 연결 가지를 검사
	 * @param node 변경하려는 왼쪽 트리
	 */
	public void setLeft(TreeNodeDL node) {
		this.left = node;
	}
	
	/**
	 * 오른쪽 연결 가지를 검사
	 * @return 오른쪽 트리
	 */
	public TreeNodeDL getRight() {
		return this.right;
	}
	
	/**
	 * 오른쪽 가지를 변경
	 * @param node 변경하려는 오른쪽 트리
	 */
	public void setRight(TreeNodeDL node) {
		this.right = node;
	}

	/**
	 * 양쪽 데이터를 갖는 노드 생성
	 * @param left 왼쪽 트리로 연결하려는 값
	 * @param right 오른쪽 트리로 연결하려는 값
	 */	
	public void setBoth(char left, char right) {


//		this.item = left;
//		this.item = right;

		//마지막 줄에 this.item = right;를 하게 되면 right 값만 전달 됨. left 값은 없어지게됨. +=를 하면 문자로 변경됨. 숫자로 변경이 안됨..?
		
	

		// ?????

	}

	/**
	 * 양쪽 노드가 있는 노드 생성
	 * @param left 왼쪽 트리로 연결하려는 노드
	 * @param right 오른쪽 트리로 연결하려는 노드
	 */	
	public void setBoth(TreeNodeDL left, TreeNodeDL right) {
		this.left = left;
		
		this.right = right;	// ?????
		
	}

	/**
	 * 객체를 문자열로 변환
	 * @return 단항식 표현 문자열
	 */
	public String toString() {	
		String buff = "";		
		buff += item;		
		return buff;
	}
}