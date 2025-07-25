import java.util.ArrayList;

public class CreateGraph{
    public static class Edge{
        int source;
        int dest;
        Edge(int s , int d){
            this.source = s;
            this.dest = d;
        }
    }

    public static void create(ArrayList<Edge> graph[] ){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }


    public static void main(String[] args) {
        int V = 4;
        //int arr[] = new int[size]
        ArrayList<Edge> graph[] = new ArrayList[V];
        create(graph);
        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println("Source is "+e.source + " Destination is "+e.dest);
        }


    }
}