package test;

import java.util.Scanner;

public class CellMachine2 {
	static Scanner in = new Scanner(System.in);
	static int width = 0;
	static int height = 0;
	static int[][] field_old;
	static int[][] field_new;
	static int numOfStep;

	public static void main(String[] args) {
		width = in.nextInt();
		height = in.nextInt();
		initial();
		numOfStep = in.nextInt();
		run(numOfStep);
		System.out.println(count(field_old));
	}
	public static void initial() {
		field_old = new int[height][width];
		field_new = new int[height][width];

		for (int i = 0; i < field_old.length; i++) {
			for (int j = 0; j < field_old[i].length; j++) {
				field_old[i][j] = 0;
				field_new[i][j] = 0;
			}
		}
		while (true) {
			int i = in.nextInt();
			int j = in.nextInt();

			if (i == -1 && j == -1) {
				break;
			}

			field_old[i][j] = 1;
			field_new[i][j] = 1;
		}
	}
	public static void run(int times) {
		int numberOfLive = 0;

		for (int i = 0; i < times; i++) {
			for (int j = 0; j < field_old.length; j++) {
				for (int k = 0; k < field_old[j].length; k++) {
					numberOfLive = getNeighbour(j, k);

					if (field_old[j][k] == 1 && (numberOfLive == 2 || numberOfLive == 3)) {
						field_new[j][k] = 1;
					} else {
						field_new[j][k] = 0;
					}
					if (field_old[j][k] == 0 && numberOfLive == 3) {
						field_new[j][k] = 1;
					}
				}
			}

			for (int j = 0; j < field_new.length; j++) {
				for (int k = 0; k < field_new[j].length; k++) {
					field_old[j][k] = field_new[j][k];
				}
			}
		}
	}
	public static int getNeighbour(int i, int j) {
		int numberOfLive = 0;
		if (i == 0 && j == 0) {
			numberOfLive = field_old[i][j + 1] + field_old[i + 1][j + 1] + field_old[i + 1][j];
		} else if (i == 0 && j == width - 1) {
			numberOfLive = field_old[i][j - 1] + field_old[i + 1][j - 1] + field_old[i + 1][j];
		} else if (i == height - 1 && j == 0) {
			numberOfLive = field_old[i - 1][j] + field_old[i - 1][j + 1] + field_old[i][j + 1];
		} else if (i == height - 1 && j == width - 1) {
			numberOfLive = field_old[i - 1][j] + field_old[i - 1][j - 1] + field_old[i][j - 1];
		} else if (i == 0) {
			numberOfLive = field_old[i][j - 1] + field_old[i + 1][j - 1] + field_old[i + 1][j] + field_old[i + 1][j + 1]
					+ field_old[i][j + 1];
		} else if (i == height - 1) {
			numberOfLive = field_old[i][j - 1] + field_old[i - 1][j - 1] + field_old[i - 1][j] + field_old[i - 1][j + 1]
					+ field_old[i][j + 1];
		} else if (j == 0) {
			numberOfLive = field_old[i - 1][j] + field_old[i - 1][j + 1] + field_old[i][j + 1] + field_old[i + 1][j + 1]
					+ field_old[i + 1][j];
		} else if (j == width - 1) {
			numberOfLive = field_old[i - 1][j] + field_old[i - 1][j - 1] + field_old[i][j - 1] + field_old[i + 1][j - 1]
					+ field_old[i + 1][j];
		} else {
			numberOfLive = field_old[i - 1][j - 1] + field_old[i - 1][j] + field_old[i - 1][j + 1] + field_old[i][j + 1]
					+ field_old[i + 1][j + 1] + field_old[i + 1][j] + field_old[i + 1][j - 1] + field_old[i][j - 1];
		}
		return numberOfLive;
	}
	public static int count(int[][] field) {
		int aliveCellNumber = 0;
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				if (field[i][j] == 1) {
					aliveCellNumber++;
				}
			}
		}
		return aliveCellNumber;
	}
}