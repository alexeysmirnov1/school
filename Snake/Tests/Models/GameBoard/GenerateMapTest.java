package Snake.Tests.Models.GameBoard;

import Snake.Models.GameBoard;

public class GenerateMapTest {
    public static void main(String[] args) {
        GameBoard board = new GameBoard();

        GameBoard.size = 6;
        board.generateMap();

        System.out.println(GameBoard.map[0]);
    }
}

