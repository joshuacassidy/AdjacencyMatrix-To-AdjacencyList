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

        String results = breathFirstSearch.search(vertices.get(0));
        System.out.println(results);


    }
}
