import SimpleGraphLib.Graph;
import SimpleGraphLib.UnDirectedGraph;
import SimpleGraphLib.Vertex;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UnDirectedGraphTest {
    private Graph graph;

    @Before
    public void setUp(){
        this.graph = new UnDirectedGraph();
        Vertex<String> v1 = new Vertex("1");
        Vertex<String> v2 = new Vertex("2");
        Vertex<String> v3 = new Vertex("3");
        Vertex<String> v4 = new Vertex("4");
        Vertex<String> v5 = new Vertex("5");
        Vertex<String> v6 = new Vertex("6");
        Vertex<String> v7 = new Vertex("7");

        graph.addEdge(v1,v2);
        graph.addEdge(v5,v1);
        graph.addEdge(v1,v3);
        graph.addEdge(v2,v5);
        graph.addEdge(v3,v4);
        graph.addEdge(v4,v5);
        graph.addEdge(v7,v6);
    }

    @Test
    public void pathShouldExist(){
        List path = graph.getPath(new Vertex("1"), new Vertex("4"));
        assertFalse(path.isEmpty());
    }

    @Test
    public void pathShouldNotExist(){
        List path = graph.getPath(new Vertex("6"), new Vertex("1"));
        assertTrue(path.isEmpty());
    }

}
