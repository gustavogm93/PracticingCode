import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sudoku {


    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        char[][] test2 = new char[][]{
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        char[][] test3 = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},  // 3i j0    5i j2
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println(isValidSudoku(test3));
    }


    public static boolean isValidSudoku(char[][] board) {

        Map<Integer, List<String>> map = new HashMap<>();
        //check if is number char
        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {

                if (board[i][j] == '.') {
                    continue;
                }

                Integer val = Integer.parseInt(String.valueOf(board[i][j]));
                List<String> temList = map.get(val);
                List<String> listOfCoordinates;
                if (null == temList) {
                    listOfCoordinates = new ArrayList<>();
                } else {
                    listOfCoordinates = temList;
                }

                String blockX;
                String blockY;

                if (i < 3) {
                    blockX = "0";
                } else if (i < 6) {
                    blockX = "1";
                } else {
                    blockX = "2";
                }

                if (j < 3) {
                    blockY = "0";
                } else if (j < 6) {
                    blockY = "1";
                } else {
                    blockY = "2";
                }

                //checkear cuando se agrega si exist una coordenada, si esta en el mismo bloque.

                String valueY = String.valueOf(i);
                String valueX = String.valueOf(j);
                String coordinates = valueY + "," + valueX + "," + blockX + "," + blockY;

                String[] coords = coordinates.split(",");

                for (int k = 0; k < listOfCoordinates.size(); k++) {
                    String[] coordsPrevious = listOfCoordinates.get(k).split(",");
                    //Check Row
                    if (coords[0].equals(coordsPrevious[0])) {
                        return false;
                    }
                    //check Col
                    if (coords[1].equals(coordsPrevious[1])) {
                        return false;
                    }

                    //check block;
                    if (coords[2].equals(coordsPrevious[2]) && coords[3].equals(coordsPrevious[3])) {
                        return false;
                    }

                }

                listOfCoordinates.add(coordinates);

                map.put(val, listOfCoordinates);

            }
        }

        return true;

    }

}
