import java.util.LinkedList;
import java.util.Queue;

public class BreathFirstSearch {

    public String search(Vertex root) {
        String searchResults = "";
        Queue<Vertex> queue = new LinkedList<>();
        root.setVisited(true);
        queue.add(root);
        while (!queue.isEmpty()) {
            Vertex current = queue.remove();
            searchResults += current + " ";
            for (Edge edge : current.getAdjacenciesList()) {
                if (edge.getTargetVertex() != null) {
                    Vertex v = edge.getTargetVertex();
                    if (!v.isVisited()) {
                        v.setVisited(true);
                        queue.add(v);
                    }
                }
            }
        }
        return searchResults;
    }

    public void clearVisited(Vertex root) {
        Queue<Vertex> queue = new LinkedList<>();
        root.setVisited(false);
        queue.add(root);
        while (!queue.isEmpty()) {
            Vertex current = queue.remove();
            for (Edge edge : current.getAdjacenciesList()) {
                if (edge.getTargetVertex() != null) {
                    Vertex v = edge.getTargetVertex();
                    if (v.isVisited()) {
                        v.setVisited(false);
                        queue.add(v);
                    }
                }
            }
        }
    }

}