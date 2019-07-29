package SimpleGraphLib;

public class UnDirectedGraph extends DirectedGraph {

    @Override
    public void addEdge(Vertex from, Vertex to){
        super.addEdge(from, to);
        to.addNeighbour(from);
    };

}
