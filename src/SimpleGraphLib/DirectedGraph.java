package SimpleGraphLib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DirectedGraph implements Graph {
    List<Vertex> vertices;

    public DirectedGraph() {
        vertices = new ArrayList<>();
    }

    public void addVertex(Vertex a){
        if (!vertices.contains(a)){
            vertices.add(a);
        }
    };

    public void addEdge(Vertex from, Vertex to){
        addVertex(from);
        addVertex(to);
        from.addNeighbour(to);
    };

    public List<Vertex> getPath(Vertex from, Vertex to){
        int fromIdx = vertices.indexOf(from);
        int toIdx = vertices.indexOf(to);
        if (fromIdx<0 || toIdx<0){
            return Collections.EMPTY_LIST;
        }else {
            List<Vertex> visited = new ArrayList<>();
            List<Vertex> path = new ArrayList<>();
            return deepFirstSearch(vertices.get(fromIdx), vertices.get(toIdx), visited, path);
        }
    };

    private List<Vertex> deepFirstSearch(Vertex from, Vertex to, List<Vertex> visited, List<Vertex> path){
        visited.add(from);
        path.add(from);
        if (from.equals(to)){
            return path;
        }
        for (Object next: from.getNeighbours()){
            if (!visited.contains(next)) {
                List<Vertex> foundPath = deepFirstSearch((Vertex)next, to, visited, path);
                if (!foundPath.isEmpty()){
                    return foundPath;
                }
                path.remove(next);
            }
        }
        return Collections.EMPTY_LIST;
    }

}
