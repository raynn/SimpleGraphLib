package SimpleGraphLib;

import java.util.ArrayList;
import java.util.List;

public class Vertex <T>{
    private T value;
    private final List<Vertex> neighbours;

    public Vertex(T value) {
        this.value = value;
        this.neighbours = new ArrayList<>();
    }

    public void addNeighbour(Vertex neighbour){
        if (!neighbours.contains(neighbour)) {
            this.neighbours.add(neighbour);
        }
    };

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public List<Vertex> getNeighbours() {
        return neighbours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Vertex vo = (Vertex) o;
        return vo.value == null ? this.value == vo.value : vo.value.equals(this.value);
    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "value=" + value +
                '}';
    }
}
