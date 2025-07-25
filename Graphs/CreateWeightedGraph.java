import java.util.ArrayList;

public class CreateWeightedGraph{
    public static class Edge{
        int source;
        int dest;
        int weight;
        Edge(int s , int d, int wt){
            this.source = s;
            this.dest = d;
            this.weight = wt;
        }
    }

    public static void create(ArrayList<Edge> graph[] ){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2,2));
        graph[1].add(new Edge(1, 2,10));
        graph[1].add(new Edge(1, 3,0));
        graph[2].add(new Edge(2, 0,2));
        graph[2].add(new Edge(2, 1,10));
        graph[2].add(new Edge(2, 3,-1));
        graph[3].add(new Edge(3, 1,0));
        graph[3].add(new Edge(3, 2,-1));
    }


    public static void main(String[] args) {
        int V = 4;
        //int arr[] = new int[size]
        ArrayList<Edge> graph[] = new ArrayList[V];
        create(graph);
        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println("Source is "+e.source + " Destination is "+e.dest + " and its weight is "+e.weight);
        }


    }
}
