package SimpleGraphLib;

import java.util.List;

public interface Graph {

    //adds vertex to the graph
    public void addVertex(Vertex a);

    //adds edge to the graph
    public void addEdge(Vertex from, Vertex to);

    //returns a list of edges between 2 vertices (path doesn’t have to be optimal)
    public List<Vertex> getPath(Vertex from, Vertex to);

}
