package FindPattern2DArray;

import java.util.List;

/**
 * Created by bleri on 7/15/2017.
 */
public class FindPattern2DArray {

    /**
     * [2, 4, 6
     * 3, 7, 2
     * 7, 3, 1]
     *
     * [1, 3, 7]
     * @param pattern
     * @param matrix
     * @return
     */
    static boolean findPattern2DArray(List<Integer> pattern, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                if (matchPattern(i, j, pattern, matrix)) return true;

        return false;
    }

    private static boolean matchPattern(int i, int j, List<Integer> pattern, int[][] matrix) {
        if (pattern.isEmpty())
            return true;

        if (matrix[i][j] != pattern.get(0))
            return false;

        else if (pattern.size() == 1)
            return true;

        boolean left, right, up, down;
        left = right = up = down = false;

        // search left
        if (j-1 >= 0)
            left = matchPattern(i, j-1, pattern.subList(1, pattern.size()), matrix);
        // search right
        if (j+1 < matrix[0].length)
            right = matchPattern(i, j+1, pattern.subList(1, pattern.size()), matrix);
        // search down
        if (i+1 < matrix.length)
            down = matchPattern(i+1, j, pattern.subList(1, pattern.size()), matrix);
        // search left
        if (i-1 >= 0)
            up = matchPattern(i-1, j, pattern.subList(1, pattern.size()), matrix);

        return left || right || up || down;
    }

}
