import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {

    public static class Edge {
       int source ;
       int dest;
        
       Edge(int s, int d){
        this.source = s;
        this.dest = d;
       }
    }

    public static void create(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
         graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));
        
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static void bfs(ArrayList<Edge> graph[]){
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (visited[curr] == false) {
                System.out.print(curr + " " );
                visited[curr] = true;
                for(int i=0;i<graph[curr].size();i++){
                  Edge e = graph[curr].get(i);
                  q.add(e.dest);
                }
            }
        }
    }

    public static void bfsDisconnected(ArrayList<Edge> graph[], int V, boolean visited[], int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (visited[curr] == false) {
                System.out.print(curr + " " );
                visited[curr] = true;
                for(int i=0;i<graph[curr].size();i++){
                  Edge e = graph[curr].get(i);
                  q.add(e.dest);
                }
            }
        }
    }


    
    public static void main(String[] args) {
        int V = 7;
     ArrayList<Edge> graph[] = new ArrayList[V];
     create(graph);
     bfs(graph);
          boolean visited[] = new boolean[V];
          for(int i=0;i<visited.length;i++){
            if (visited[i] == false) {
                bfsDisconnected(graph, V, visited, i);
            }
          }

    }
}
