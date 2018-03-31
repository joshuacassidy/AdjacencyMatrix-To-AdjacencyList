import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MatrixToListTest {

    MatrixToList matrixToList;
    BreathFirstSearch breathFirstSearch;

    @Before
    public void setUp() {
        breathFirstSearch = new BreathFirstSearch();
    }

    @Test
    public void matrixToListTestCase1() throws Exception {
        int[][] matrix = {
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };
        matrixToList = new MatrixToList(matrix);

        ArrayList<Vertex> vertices = matrixToList.convertToList();
        String searchOnA = breathFirstSearch.search(vertices.get(0));
        String searchOnB = breathFirstSearch.search(vertices.get(1));
        String searchOnC = breathFirstSearch.search(vertices.get(2));

        assertEquals(searchOnA, "a ");
        assertEquals(searchOnB, "b ");
        assertEquals(searchOnC, "c ");
    }

    @Test
    public void matrixToListTestCase2() throws Exception {
        int[][] matrix = {
                {0,1,0},
                {0,0,0},
                {0,0,0}
        };
        matrixToList = new MatrixToList(matrix);

        ArrayList<Vertex> vertices = matrixToList.convertToList();
        String searchOnA = breathFirstSearch.search(vertices.get(0));
        assertEquals(searchOnA, "a b ");
    }

    @Test
    public void matrixToListTestCase3() throws Exception {
        int[][] matrix = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        matrixToList = new MatrixToList(matrix);

        ArrayList<Vertex> vertices = matrixToList.convertToList();
        assertEquals(vertices.toString(), "[]");
    }

    @Test
    public void matrixToListTestCase4() throws Exception {
        int[][] matrix = {
                {0,1,1},
                {1,0,1},
                {1,1,0}
        };
        matrixToList = new MatrixToList(matrix);

        ArrayList<Vertex> vertices = matrixToList.convertToList();

        assertEquals(vertices.toString(), "[a, b, c]");


        String searchOnA = breathFirstSearch.search(vertices.get(0));
        assertEquals(searchOnA, "a b c ");
        breathFirstSearch.clearVisited(vertices.get(0));

        String searchOnB = breathFirstSearch.search(vertices.get(1));
        assertEquals(searchOnB, "b a c ");
        breathFirstSearch.clearVisited(vertices.get(1));

        String searchOnC = breathFirstSearch.search(vertices.get(2));
        assertEquals(searchOnC, "c a b ");

    }

    @Test
    public void matrixToListTestCase5() throws Exception {
        int[][] matrix = {
                {0,0,0},
                {0,0,0},
                {0,1,0}
        };
        matrixToList = new MatrixToList(matrix);

        ArrayList<Vertex> vertices = matrixToList.convertToList();
        String searchOnA = breathFirstSearch.search(vertices.get(1));
        assertEquals(searchOnA, "c b ");
    }



}