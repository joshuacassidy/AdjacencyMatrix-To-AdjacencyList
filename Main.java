import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[][] matrix = {
                {0,1,1},
                {1,0,1},
                {1,1,0}
        };

        MatrixToList matrixToList = new MatrixToList(matrix);
        BreathFirstSearch breathFirstSearch = new BreathFirstSearch();
        ArrayList<Vertex> vertices = matrixToList.convertToList();
        System.out.println(matrixToList.getAdjacencies());
        if (vertices.size() > 0) {
            String results = breathFirstSearch.search(vertices.get(2));
            System.out.println(results);
        } else {
            System.out.println("Breath first search can't be preformed on a empty list");
        }


    }
}
