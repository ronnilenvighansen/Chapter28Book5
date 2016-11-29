import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ronni on 22-11-2016.
 */
public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner file = new Scanner(System.in);
        Scanner input = new Scanner(new File(file.next()));
        int amount = input.nextInt();
        ArrayList <Integer> vertices = new ArrayList();
        ArrayList<AbstractGraph.Edge> edges = new ArrayList<>();
        while(input.hasNextLine())
        {
            Scanner s = new Scanner(input.nextLine());
            while(s.hasNext()){
                int vertex = s.nextInt();
                vertices.add(vertex);
                while(s.hasNext()){
                    int edge = s.nextInt();
                    edges.add(new AbstractGraph.Edge(vertex, edge));
                }
            }
        }
        UnweightedGraph graph = new UnweightedGraph(vertices, edges);
        graph.printEdges();
        AbstractGraph.Tree tree = graph.dfs(0);
        if(tree.getNumberOfVerticesFound() == amount)
        {
            System.out.println("The graph is connected");
        }
        else
        {
            System.out.println("The graph is not connected");
        }
    }
}