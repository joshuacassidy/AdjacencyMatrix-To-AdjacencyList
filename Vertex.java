import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private Character name;
    private List<Edge> adjacenciesList;
    private Vertex predecessor;
    private boolean visited = false;

    public Vertex(Character name) {
        this.name = name;
        this.adjacenciesList = new ArrayList<>();
    }

    public void addNeighbour(Vertex startVertex,Vertex targetVertex) {
        this.adjacenciesList.add(new Edge(startVertex, targetVertex));
    }

    public Character getName() {
        return name;
    }

    public void setName(Character name) {
        this.name = name;
    }

    public List<Edge> getAdjacenciesList() {
        return adjacenciesList;
    }

    public void setAdjacenciesList(List<Edge> adjacenciesList) {
        this.adjacenciesList = adjacenciesList;
    }


    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return this.name + "";
    }

}