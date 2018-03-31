public class Edge {

    private Vertex startVertex;
    private Vertex targetVertex;

    public Edge(Vertex startVertex, Vertex targetVertex) {
        this.startVertex = startVertex;
        this.targetVertex = targetVertex;
    }


    public Vertex getStartVertex() {
        return startVertex;
    }

    public void setStartVertex(Vertex startVertex) {
        this.startVertex = startVertex;
    }

    public Vertex getTargetVertex() {
        return targetVertex;
    }

    public void setTargetVertex(Vertex targetVertex) {
        this.targetVertex = targetVertex;
    }
}