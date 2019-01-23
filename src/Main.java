public class Main {
    public static void main(String[] args) {

        int[][] W = new int[5][5];
        int[][] D = new int[][]{
                new int[]{3, 2, 9, 7, 7},
                new int[]{9, 0, 1, 9, 9},
                new int[]{1, 4, 5, 4, 1},
                new int[]{5, 7, 5, 8, 0},
                new int[]{0, 0, 0, 0, 0},
            };
        int[][] R = new int[][]{
                new int[]{2, 7, 7, 8, 0},
                new int[]{1, 9, 8, 6, 0},
                new int[]{7, 5, 9, 2, 0},
                new int[]{1, 3, 2, 7, 0},
                new int[]{3, 4, 9, 5, 0},
            };

        ManhattenTouristAlgorithm.solve(W, D, R);

    }
}
