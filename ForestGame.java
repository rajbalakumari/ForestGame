package pack1;

import java.util.Random;

public class ForestGame {

	private static final char TREE = 'T';
	private static final char OPEN_SPACE = '.';
	private static final char PLAYER = 'P';

	public static void main(String[] args) {
		int rows = 5;
		int cols = 10;
		char[][] forest = generateForest(rows, cols);
		displayForest(forest);
		movePlayer(forest, 'D');
		displayForest(forest);
	}

	public static char[][] generateForest(int rows, int cols) {
		char[][] forest = new char[rows][cols];
		Random random = new Random();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (random.nextDouble() < 0.3) { // 30% chance of tree
					forest[i][j] = TREE;
				} else {
					forest[i][j] = OPEN_SPACE;
				}
			}
		}

		int playerRow, playerCol;
		do {
			playerRow = random.nextInt(rows);
			playerCol = random.nextInt(cols);
		} while (forest[playerRow][playerCol] != OPEN_SPACE);
		forest[playerRow][playerCol] = PLAYER;

		return forest;
	}

	public static void displayForest(char[][] forest) {
		for (char[] row : forest) {
			for (char cell : row) {
				System.out.print(cell + " ");
			}
			System.out.println();
		}
	}

	public static void movePlayer(char[][] forest, char direction) {
		int[] playerPos = findPlayer(forest);
		int playerRow = playerPos[0];
		int playerCol = playerPos[1];

		int newRow = playerRow;
		int newCol = playerCol;

		switch (direction) {
		case 'W':
			newRow--;
			break;
		case 'S':
			newRow++;
			break;
		case 'A':
			newCol--;
			break;
		case 'D':
			newCol++;
			break;
		default:
			System.out.println("Invalid direction!");
			return;
		}

		// Check if the new position is within the forest boundaries and not a tree
		if (newRow >= 0 && newRow < forest.length && newCol >= 0 && newCol < forest[0].length) {
			if (forest[newRow][newCol] != TREE) {
				// Move the player to the new position
				forest[playerRow][playerCol] = OPEN_SPACE;
				forest[newRow][newCol] = PLAYER;
			} else {
				System.out.println("Cannot move there, it's a tree!");
			}
		} else {
			System.out.println("Cannot move outside the forest!");
		}
	}

	public static int[] findPlayer(char[][] forest) {
		int[] playerPos = new int[2];
		for (int i = 0; i < forest.length; i++) {
			for (int j = 0; j < forest[0].length; j++) {
				if (forest[i][j] == PLAYER) {
					playerPos[0] = i;
					playerPos[1] = j;
					return playerPos;
				}
			}
		}
		return playerPos;
	}
}
