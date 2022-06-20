package Graph;

public class GraphEdgeSL {	
	/**
	 * ����� ��� ��ȣ
	 * @see #getId()
	 * @see #setId(int vertex)
	 */
	protected int id = 0;
	
	/**
	 * ����� �� �ٸ� ���
	 * @see #getNext()
	 * @see #setNext(StackNodeSL next)
	 */
	protected GraphEdgeSL next = null;
	
	/**
	 * �⺻ ������
	 */
	public GraphEdgeSL() {
		this.id = 0;		// ��� ��ȣ
		this.next = null;	// ���� ���
	}
	
	/**
	 * �׷����� �� 1���� ����
	 * @param id ���
	 * @param next ����Ǵ� ��� 
	 */
	public GraphEdgeSL(int id, GraphEdgeSL next) {
		this.id = id;		// ��� ��ȣ
		this.next = next;	// ����Ǵ� ���� ���
	}

	/**
	 * ��� ��ȣ �˻�
	 * @return ����� ����
	 */	
	public int getId() {
		return this.id;
	}

	/**
	 * ��� ��ȣ�� ����
	 * @param id ��� ��ȣ
	 */	
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * ����� ���� ��带 �˻�
	 * @return ���� ���
	 */
	public GraphEdgeSL getNext() {
		return this.next;
	}

	/**
	 * ����Ǵ� ��带 ����
	 * @param next �����Ϸ��� ���
	 */ 
	public void setNext(GraphEdgeSL next) {
		this.next = next;
	}
	
	/**
	 * ��ü�� ���ڿ��� ��ȯ
	 * @return ��� ǥ�� ���ڿ�
	 */
	public String toString() {
		return ", " + this.id;
	}
}