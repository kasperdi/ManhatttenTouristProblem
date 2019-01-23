public class ManhattenTouristAlgorithm {

    public static int[][] solve(int[][] W, int[][] D, int[][] R) {

        W[1][1] = 0;

        for (int i = 0; i < W.length; i++) {
            for (int j = 0; j < W.length; j++) {

                    if(i > 0 && j == 0) {
                        W[i][j] = W[i-1][0] + D[i-1][0];
                    }
                    else if(j > 0 && i == 0) {
                        W[i][j] = W[0][j-1] + R[0][j-1];
                    }
                    else if(j > 0 && i > 0) {
                        W[i][j] = Math.max(W[i-1][j] + D[i-1][j], W[i][j-1] + R[i][j-1]);
                    }
                }
        }

        printSolution(W);

        return W;
    }

    public static void printSolution(int[][] W) {

        for (int i = 0; i < W.length; i++) {
            for (int j = 0; j < W.length; j++) {
                System.out.print(W[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
