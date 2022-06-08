package Graph;

public class GraphSL {	
	/**
	 * �׷����� ���� ���� ���
	 */	
	static GraphEdgeSL [] headOfGraph = null;

	/**
	 * ���� �� ������ ���� ��带 ��� �˻��Ϸ��� ��� ���
	 */	
	static StackSL waitingEdge = new StackSL();	

	/**
	 * �˻� ���߿� ��ó�� ��� ���
	 */	
	static boolean [] visited = null;

	/**
	 * ���� �켱 �˻� ��� ���ڿ�
	 */		
	static String resultOfDFS = null;
	
	/**
	 * ���� �켱 Ž��(DFS: Depth First Search)
	 * @param edges ��� ��ü ���
	 * @param start ��� ���
	 * @return DFS ����� ǥ���ϴ� ���ڿ�
	 */
	static public String DFS(GraphAdjacencyEdges edges, int start) {
		GraphEdgeSL edge = null;		// �˻� ������
		
		headOfGraph = edges.firstVertex;					
		visited = new boolean [headOfGraph.length];		

		resultOfDFS = " ��� ��� -" + start;	// ���� ��� ���
		;				// ????? ���� �� �ٽ� ó���� ����					
		;				// ????? ��� ����� ���		
		;				// ????? ���� �˻� ������

		while (true) {	
			while (edge != null) {
				int id = edge.getId();		// ó�� �湮 ���
				
				if (!visited[id]) {
					resultOfDFS += "-" + id;
					;	// ????? ���� �� �ٽ� ó���� ����					
					;	// ????? ��� ����� ���		
					;	// ????? ��� ������							
				}
				else
					edge = edge.getNext();	// ���� ���� ����
			}
			
			edge = headOfGraph[waitingEdge.pop()];	// ���� �湮 ��� ��ȸ
			if (waitingEdge.isEmpty()) break;	// ��ó�� ���� ����
		}
		resultOfDFS += "\n           (" + headOfGraph.length + " nodes, " + (headOfGraph.length - 1) + " edges)";

		return resultOfDFS.replace(" -", " *");
	}
}