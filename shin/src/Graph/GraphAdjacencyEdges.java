package Graph;

public class GraphAdjacencyEdges {
	/**
	 * �׷��� �� ����� ���� ����
	 * @see #getFirstVertex()
	 * @see #setFirstVertex(GraphEdgeSL [] head)
	 */
	protected GraphEdgeSL [] firstVertex;
	
	/**
	 * �⺻ ������
	 */
	public GraphAdjacencyEdges() {
		firstVertex = null;
	}
	
	/**
	 * �׷����� �����ϴ� ��� ������ ��ü�� ����
	 * @param size ����� �ִ� ����, ����Ʈ�� ũ��
	 */
	public GraphAdjacencyEdges(int size) {
		firstVertex = new GraphEdgeSL[size];
	}

	/**
	 * ��� ��� �˻�
	 * @return ����� ����
	 */		
	public GraphEdgeSL [] getFirstVertex() {
		return this.firstVertex;
	}

	/**
	 * ��� ����� ����
	 * @param head ���� ���� ���
	 */	
	public void setFirstVertex(GraphEdgeSL [] head) {
		this.firstVertex = head;
	}

	/**
	 * �̿� ��� ����� ������� �˻�
	 * @param node ���� ���� ���
	 * @return true: �����, false: ���� ����
	 */
	public boolean isEmptyNode(int node) {
		if (firstVertex[node] == null) return true;
		else                           return false;
	}
	
	/**
	 * Ư�� ��(node, vertex)�� ������ ���� ���� �߰�
	 * @param source ��� ���
	 * @param next ���� ���
	 */
	public void appendEdge(int source, int [] next) {
		for(int i=0; i<next.length; i++) {
			appendEdge(source, next[i]);
		};
		
//		for(int i=0; i<next.length; i++) {
//			for(int j=0; j<next.length; j++) {
//			appendEdge(source, next[i][j]);
//			};// ?????
//		};

	}

	/**
	 * Ư�� ��(node, vertex)�� �ű� ���� �߰�
	 * @param source ��� ���
	 * @param destination ���� ���
	 */
	public void appendEdge(int source, int destination) {
		GraphEdgeSL newVertex = new GraphEdgeSL(destination, null);

		if (isEmptyNode(source))			// �� ��Ͽ� ���� ����
			firstVertex[source] = newVertex;
		else {		 				// ���� ��� ���� ���� �߰�
			GraphEdgeSL currNode = firstVertex[source];
			
			while (currNode.getNext() != null)	// �� �˻�
				currNode = currNode.getNext();	// �߰�
			
			currNode.setNext(newVertex);
		}
	}
	
	/**
	 * ��ü�� ���ڿ��� ��ȯ
	 * @return �׷��� ������ ���� ������ ����
	 */
	public String toString() {
		String buff = "";
		
		GraphEdgeSL edge = null;
		for (int i = 0; i < firstVertex.length; i++) {	// each node
			buff += "  [node " + i + "]";
			
			edge = firstVertex[i];
			while (edge != null) {			// every adjacent node
				buff += edge;
				edge = edge.getNext();
			}
			buff += "\n";
		}
		
		return buff.replace("],", "]");
	}
}