package Graph;

public class testGraphDepthFirstSearchSL {
	/**
	 * starting here! main(String[] args)
	 */
	public static void main(String[] args) {
		GraphAdjacencyEdges myNetwork = new GraphAdjacencyEdges(7);

		System.out.print("=========================== Depth First Search ===\n");
		System.out.print("------------------------ 인접 연결 리스트 구성 ---\n");
		myNetwork.appendEdge(0, new int [] {    1, 2             } );
		myNetwork.appendEdge(1, new int [] { 0,       3, 4       } );
		myNetwork.appendEdge(2, new int [] { 0,          4       } );
		myNetwork.appendEdge(3, new int [] {    1,             6 } );
		myNetwork.appendEdge(4, new int [] {    1, 2,          6 } );
		myNetwork.appendEdge(5, new int [] {                   6 } );
		myNetwork.appendEdge(6, new int [] {          3, 4, 5    } );
		System.out.print(myNetwork);

		System.out.print("------------------------------- 깊이 우선 탐색 ---\n");
		System.out.print(GraphSL.DFS(myNetwork, 0) + "\n");
		System.out.print(GraphSL.DFS(myNetwork, 5));
	}
}