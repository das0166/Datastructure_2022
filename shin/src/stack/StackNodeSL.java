package stack;

public class StackNodeSL {
	
	/**
	 * �����͸� �����ϴ� ���
	 * @see #getData()
	 * @see #setData(char aData)
	 */
	private char data;


	
	/**
	 * �Ʒ� ���� �����ͷ� ����
	 * @see #getNext()
	 * @see #setNext(StackNodeSL aNext)
	 */
	public StackNodeSL next = null;

	/**
	 * ������ 1���� ���� ������ ����
	 * @param item �����Ϸ��� ���� 1��
	 */
	public StackNodeSL(char item) {
		 this.data = item;
         this.next =null;


	}

	/**
	 * ����� ������ �˻�
	 * @return ����� ����
	 */
	public char getData() {
		return data;
	}

	/**
	 * ������ ����
	 * @param aData �����Ϸ��� ���� 1��
	 */	
	public void setData(char aData) {
		this.data = aData;
	}
	
	/**
	 * ����� �Ʒ� ���� ������ �˻�
	 * @return ���� �� ����
	 */
	public StackNodeSL getNext() {
		return this.next;
	}

	/**
	 * �Ʒ� ���� ������ ����
	 * @param aNext �����Ϸ��� ���� ���� 1��
	 */		
	public void setNext(StackNodeSL aNext) {
		this.next = aNext;
	}


	/**
	 * ��ü�� ���ڿ��� ��ȯ
	 * @return ���׽� ǥ�� ���ڿ�
	 */
	public String toString() {	
		String buff = "";		
		buff += data + 0;		
		return buff;
	}
}
