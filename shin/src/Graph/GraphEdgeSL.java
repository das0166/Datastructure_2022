package Graph;

public class GraphEdgeSL {	
	/**
	 * 연결된 노드 번호
	 * @see #getId()
	 * @see #setId(int vertex)
	 */
	protected int id = 0;
	
	/**
	 * 연결된 또 다른 노드
	 * @see #getNext()
	 * @see #setNext(StackNodeSL next)
	 */
	protected GraphEdgeSL next = null;
	
	/**
	 * 기본 생성자
	 */
	public GraphEdgeSL() {
		this.id = 0;		// 노드 번호
		this.next = null;	// 연결 노드
	}
	
	/**
	 * 그래프에 선 1개를 생성
	 * @param id 노드
	 * @param next 연결되는 노드 
	 */
	public GraphEdgeSL(int id, GraphEdgeSL next) {
		this.id = id;		// 노드 번호
		this.next = next;	// 연결되는 다음 노드
	}

	/**
	 * 노드 번호 검사
	 * @return 저장된 정보
	 */	
	public int getId() {
		return this.id;
	}

	/**
	 * 노드 번호를 지정
	 * @param id 노드 번호
	 */	
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * 연결된 다음 노드를 검사
	 * @return 도착 노드
	 */
	public GraphEdgeSL getNext() {
		return this.next;
	}

	/**
	 * 연결되는 노드를 설정
	 * @param next 연결하려는 노드
	 */ 
	public void setNext(GraphEdgeSL next) {
		this.next = next;
	}
	
	/**
	 * 객체를 문자열로 변환
	 * @return 노드 표현 문자열
	 */
	public String toString() {
		return ", " + this.id;
	}
}