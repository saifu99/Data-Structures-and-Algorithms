import java.util.ArrayList;
import java.util.List;

//Leetcode 54
public class SpiralMatrix {
    public List<Integer> spiralOrderOptimal(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int top = 0, left = 0, bottom = matrix.length - 1, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) res.add(matrix[top][i]);
            top++;

            for (int i = top; i <= bottom; i++) res.add(matrix[i][right]);
            right--;

            if (top <= bottom)
                for (int i = right; i >= left; i--) res.add(matrix[bottom][i]);
            bottom--;

            if (left <= right)
                for (int i = bottom; i >= top; i--) res.add(matrix[i][left]);
            left++;
        }
        return res;
    }

    static void main(String[] args) {
        SpiralMatrix solution = new SpiralMatrix();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(solution.spiralOrderOptimal(matrix));
    }
}
