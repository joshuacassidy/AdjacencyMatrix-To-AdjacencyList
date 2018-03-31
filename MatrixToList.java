import java.util.ArrayList;

public class MatrixToList {

    private int[][] matrix;
    ArrayList<Vertex> adjacencies;

    public MatrixToList(int[][] matrix) {
        this.matrix = matrix;
        adjacencies = new ArrayList<>();
    }

    public ArrayList<Vertex> convertToList() {

        char column = 'a';
        buildAdjacencyList(adjacencies, column);
        for (int i = 0, row = 'a'; i < matrix.length; i++, column++) {
            for (int j = 0; j < matrix[i].length; j++, row++) {
                // Traverse using matrix[i][j] so we read the matrix left to right and top to bottom
                addNeighbour(adjacencies, i, j, column, (char) row);
            }
            row = 'a';
        }

        for (int i = 0; i < adjacencies.size(); i++) {
            if (adjacencies.get(i).getAdjacenciesList().size() == 0 && adjacencies.get(i).getPredecessors().size() == 0 ) {
                adjacencies.remove(i);
            }
        }

        return adjacencies;
    }

    private void addNeighbour(ArrayList<Vertex> adjacencies, int ithIndex, int jthIndex, char columnName, char rowName) {
        if ((matrix[ithIndex][jthIndex]== 1)) {
            Vertex vertex = getVertexByName(adjacencies, columnName);
            Vertex adjacency = getVertexByName(adjacencies, rowName);
            vertex.addAdjacency(vertex,adjacency);
            adjacency.addPredesscor(vertex);
        }
    }

    private void buildAdjacencyList(ArrayList<Vertex> adjacencies, char vertexName) {
        for (int i = 0; i < matrix.length; i++, vertexName++) {
                adjacencies.add(new Vertex(vertexName));
        }
    }

    public Vertex getVertexByName(ArrayList<Vertex> adjacencies, char name) {
        Vertex vertexSearchedFor = null;
        for (Vertex v: adjacencies) {
            if (v.getName() == name) {
                vertexSearchedFor = v;
            }
        }
        return vertexSearchedFor;
    }

    public ArrayList<Vertex> getAdjacencies() {
        return adjacencies;
    }
}