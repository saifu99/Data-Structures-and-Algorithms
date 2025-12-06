import java.util.Arrays;

//Leetcode 2643
public class RowWithMaximumOnes {
    public static int[] rowAndMaximumOnes(int[][] mat){
        int row=mat.length, col=mat[0].length;
        int rowIndex=-1, maxCount=-1; //track row with max 1s and the count

        for (int i=0; i<row; i++){
            int count=0;
            for (int j=0; j<col; j++){
                count += mat[i][j];
            }
            if(count>maxCount) {
                maxCount = count;
                rowIndex = i;
            }
        }
        return new int[]{rowIndex,maxCount};
    }

    static void main(String[] args) {
        int[][] mat = {{0,0,0},{0,1,1}};
        System.out.println(Arrays.toString(rowAndMaximumOnes(mat)));
    }
}
