import java.util.ArrayList;

public class MatrixToList {

    private int[][] matrix;

    public MatrixToList(int[][] matrix) {
        this.matrix = matrix;
    }

    public ArrayList<Vertex> convertToList() {
        ArrayList<Vertex> adjacencies = new ArrayList<>();
        char column = 'a';
        buildAdjacencyList(adjacencies, column);
        for (int i = 0, row = 'a'; i < matrix.length; i++, column++) {
            for (int j = 0; j < matrix[i].length; j++, row++) {
                addNeighbour(adjacencies, i, j, column, (char) row);
            }
        }
        return adjacencies;
    }

    private void addNeighbour(ArrayList<Vertex> adjacencies, int ithIndex, int jthIndex, char columnName, char rowName) {
        if ((matrix[ithIndex][jthIndex]== 1)) {
            Vertex vertex = getVertexByName(adjacencies, columnName);
            Vertex adjacency = getVertexByName(adjacencies, rowName);
            vertex.addNeighbour(vertex,adjacency);
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

}