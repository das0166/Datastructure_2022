package Graph;

import stack.StackSL;

public class GraphSL {   
   /**
    * 그래프의 인접 연결 목록
    */   
   static GraphEdgeSL [] headOfGraph = null;

   /**
    * 복귀 후 나머지 인접 노드를 계속 검색하려는 노드 목록
    */   
   static StackSL waitingEdge = new StackSL();   

   /**
    * 검색 도중에 거처간 노드 목록
    */   
   static boolean [] visited = null;

   /**
    * 깊이 우선 검색 결과 문자열
    */      
   static String resultOfDFS = null;
   
   /**
    * 깊이 우선 탐색(DFS: Depth First Search)
    * @param edges 노드 전체 목록
    * @param start 출발 노드
    * @return DFS 결과를 표현하는 문자열
    */
   static public String DFS(GraphAdjacencyEdges edges, int start) {
      GraphEdgeSL edge = null;      // 검색 시작점
      
      headOfGraph = edges.firstVertex;               
      visited = new boolean [headOfGraph.length];      

      resultOfDFS = " 출발 노드 -" + start;   // 최초 출발 노드
      edge = headOfGraph[waitingEdge.push((char) start)];            // ????? 복기 후 다시 처리를 예약
      visited[start] = true;            // ????? 통과 사실을 등록      
      edge = edge;         // ????? 최초 검색 시작점

      while (true) {   
         while (edge != null) {
            int id = edge.getId();      // 처음 방문 노드
            
            if (!visited[id]) {
               resultOfDFS += "-" + id;
               edge = headOfGraph[waitingEdge.push((char) id)];   // ????? 복기 후 다시 처리를 예약
               visited[id] = true;   // ????? 통과 사실을 등록      
               start = id;   // ????? 노드 시작점                     
            }
            else
               edge = edge.getNext();   // 다음 인접 노드로
         }
         
         edge = headOfGraph[waitingEdge.pop()];   // 이전 방문 목록 조회
         if (waitingEdge.isEmpty()) break;   // 미처리 엣지 없음
      }
      resultOfDFS += "\n           (" + headOfGraph.length + " nodes, " + (headOfGraph.length - 1) + " edges)";

      return resultOfDFS.replace(" -", " *");
   }
}