package homeWork03;

import java.util.Arrays;

class findPathKnight {
    public static int N = 5;

    public static int[] row = {2, 1, -1, -2, -2, -1, 1, 2, 2};
    public static int[] col = {1, 2, 2, 1, -1, -2, -2, -1, 1};

    private static boolean isValid(int x, int y) {
        return x >= 0 && y >= 0 && x < N && y < N;
    }

    private static void print(int[][] visited) {
        for (var r : visited) {
            System.out.println(Arrays.toString(r));
        }
        System.out.println();
    }

    public static void knightTour(int[][] visited, int x, int y, int pos) {
        visited[x][y] = pos;

        if (pos >= N * N) {
            print(visited);

            visited[x][y] = 0;
            return;
        }

        for (int k = 0; k < 8; k++) {

            int newX = x + row[k];
            int newY = y + col[k];

            if (isValid(newX, newY) && visited[newX][newY] == 0) {
                knightTour(visited, newX, newY, pos + 1);
            }
        }

        visited[x][y] = 0;
    }

    public static void main(String[] args) {

        int[][] visited = new int[N][N];
        int pos = 1;

        knightTour(visited, 0, 0, pos);
    }
}


