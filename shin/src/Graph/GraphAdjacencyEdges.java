package Graph;

public class GraphAdjacencyEdges {
	/**
	 * 그래프 각 노드의 인접 연결
	 * @see #getFirstVertex()
	 * @see #setFirstVertex(GraphEdgeSL [] head)
	 */
	protected GraphEdgeSL [] firstVertex;
	
	/**
	 * 기본 생성자
	 */
	public GraphAdjacencyEdges() {
		firstVertex = null;
	}
	
	/**
	 * 그래프를 구성하는 노드 갯수로 객체를 생성
	 * @param size 노드의 최대 갯수, 리스트의 크기
	 */
	public GraphAdjacencyEdges(int size) {
		firstVertex = new GraphEdgeSL[size];
	}

	/**
	 * 노드 목록 검사
	 * @return 저장된 전보
	 */		
	public GraphEdgeSL [] getFirstVertex() {
		return this.firstVertex;
	}

	/**
	 * 노드 목록을 지정
	 * @param head 인접 연결 목록
	 */	
	public void setFirstVertex(GraphEdgeSL [] head) {
		this.firstVertex = head;
	}

	/**
	 * 이웃 노드 목록이 비었는지 검사
	 * @param node 인접 연결 목록
	 * @return true: 비었음, false: 내용 있음
	 */
	public boolean isEmptyNode(int node) {
		if (firstVertex[node] == null) return true;
		else                           return false;
	}
	
	/**
	 * 특정 점(node, vertex)에 여러개 연결 선을 추가
	 * @param source 출발 노드
	 * @param next 도착 노드
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
	 * 특정 점(node, vertex)에 신규 선을 추가
	 * @param source 출발 노드
	 * @param destination 도착 노드
	 */
	public void appendEdge(int source, int destination) {
		GraphEdgeSL newVertex = new GraphEdgeSL(destination, null);

		if (isEmptyNode(source))			// 빈 목록에 최초 엣지
			firstVertex[source] = newVertex;
		else {		 				// 기존 목록 가장 끝에 추가
			GraphEdgeSL currNode = firstVertex[source];
			
			while (currNode.getNext() != null)	// 끝 검색
				currNode = currNode.getNext();	// 추가
			
			currNode.setNext(newVertex);
		}
	}
	
	/**
	 * 객체를 문자열로 변환
	 * @return 그래프 노드들의 인접 연결을 츨력
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