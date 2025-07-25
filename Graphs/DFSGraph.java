import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DFSGraph {

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
    
    public static void dfs(ArrayList<Edge> graph[]  , int curr, boolean visited[]){
        System.out.print(curr + " ");
        visited[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if (visited[e.dest] == false) {
                 dfs(graph, e.dest, visited);
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
     ArrayList<Edge> graph[] = new ArrayList[V];
     boolean visited[] = new boolean[V];
     create(graph);
     dfs(graph, 0, visited);
     
    }
}
