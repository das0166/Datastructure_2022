package tree;


public class TreeNodeDL {
	/**
	 * Ʈ�� ����� ������
	 * @see #getItem()
	 * @see #setItem(char item)
	 */
	char item = '\0';

	/**
	 * ������ �̿� ���
	 * @see #getRight()
	 * @see #setRight(TreeNodeDL node)
	 */
	TreeNodeDL right = null;
	
	/**
	 * ���� �̿� ���
	 * @see #getLeft()
	 * @see #setLeft(TreeNodeDL node)
	 */
	TreeNodeDL left = null;
	
	/**
	 * �⺻ ������
	 * ������ ���� ���('\0') ����
	 */
	public TreeNodeDL() {
		this.item = '\0';
	}

	/**
	 * �����͸����� ��� ����
	 * @param item �����Ϸ��� ������
	 */
	public TreeNodeDL(char item) {
		this.setItem(item);
	}
		
	/**
	 * ����� �����͸� �˻�
	 * @return ������ ��
	 */
	public char getItem() {
		return this.item;
	}
	
	/**
	 * �����͸� ����
	 * @param item �����Ϸ��� ������
	 */
	public void setItem(char item) {
		this.item = item;		
	}
	
	/**
	 * ���� ���� ������ �˻�
	 * @return ���� Ʈ��
	 */
	public TreeNodeDL getLeft() {
		return this.left;
	}
	
	/**
	 * ���� ���� ������ �˻�
	 * @param node �����Ϸ��� ���� Ʈ��
	 */
	public void setLeft(TreeNodeDL node) {
		this.left = node;
	}
	
	/**
	 * ������ ���� ������ �˻�
	 * @return ������ Ʈ��
	 */
	public TreeNodeDL getRight() {
		return this.right;
	}
	
	/**
	 * ������ ������ ����
	 * @param node �����Ϸ��� ������ Ʈ��
	 */
	public void setRight(TreeNodeDL node) {
		this.right = node;
	}

	/**
	 * ���� �����͸� ���� ��� ����
	 * @param left ���� Ʈ���� �����Ϸ��� ��
	 * @param right ������ Ʈ���� �����Ϸ��� ��
	 */	
	public void setBoth(char left, char right) {
		this.left = new TreeNodeDL(left);
		this.right = new TreeNodeDL(right);
	}
	public void setBoth(TreeNodeDL left, TreeNodeDL right) {
		this.left = left;
		this.right = right;
	}

	/**
	 * ��ü�� ���ڿ��� ��ȯ
	 * @return ���׽� ǥ�� ���ڿ�
	 */
	public String toString() {	
		String buff = "";		
		buff += item;		
		return buff;
	}
}