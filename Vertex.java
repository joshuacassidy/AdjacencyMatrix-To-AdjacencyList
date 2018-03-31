import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private Character name;
    private List<Edge> adjacenciesList;
    private List<Edge> predecessors;
    private boolean visited = false;

    public Vertex(Character name) {
        this.name = name;
        this.adjacenciesList = new ArrayList<>();
        this.predecessors = new ArrayList<>();
    }

    public void addAdjacency(Vertex startVertex, Vertex targetVertex) {
        this.adjacenciesList.add(new Edge(startVertex, targetVertex));
    }

    public void addPredesscor(Vertex targetVertex) {
        this.predecessors.add(new Edge(targetVertex));
    }

    public List<Edge> getPredecessors() {
        return predecessors;
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