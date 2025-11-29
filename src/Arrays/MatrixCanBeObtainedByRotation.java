public class MatrixCanBeObtainedByRotation {
    //Leetcode 1886
    public static boolean findRotationBruteForce(int[][] mat, int[][] target) {
                int n=mat.length;
                for(int count=0; count<4; count++) { //rotation counter

                    //check mat matches target
                    boolean same = true;
                    for(int i=0; i<n && same; i++)
                        for (int j=0; j<n; j++)
                            same &= (mat[i][j] == target[i][j]);
                    if(same) return true;

                    for(int i=0; i<n; i++) {
                        for(int j=i; j<n; j++) {
                            int temp=mat[i][j];
                            mat[i][j]=mat[j][i];
                            mat[j][i]=temp;
                        }
                    }
                    for(int i=0; i<n; i++) {
                        for(int j=0; j<n/2; j++) {
                            int temp=mat[i][j];
                            mat[i][j]=mat[i][n-1-j];
                            mat[i][n-1-j]=temp;
                        }
                    }
                }
                return false;
            }

    public static void main(String args[]) {
        int mat[][] = {{0,0,0},{0,1,0},{1,1,1}};
        int target[][] = {{1,1,1},{0,1,0},{0,0,0}};

        boolean canRotate = MatrixCanBeObtainedByRotation.findRotationBruteForce(mat, target);
        System.out.println("Can matrix be rotated to match target? " + canRotate);

        System.out.println("Matrix after last rotation:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

