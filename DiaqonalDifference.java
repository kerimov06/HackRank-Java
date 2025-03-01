package HackRank;

public class DiaqonalDifference {
    public static void main(String[] args) {
        int n = 5;
        int[][] arr = new int[][]{{1, 2, 3, 5, 3}, {1, 7, 3, 5, 3}, {1, 2, 3, 5, 3}, {1, 2, 3, 5, 3}, {1, 2, 3, 5, 3}};
        int left = 0; int right = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++){
                if(i==j ) left += arr[i][j];
                if(i+j == n-1) right +=arr[i][j];
            }
        }
        int fark = Math.abs(left-right);
        System.out.println("fark: " + fark);
        System.out.println("left : " + left);
        System.out.println("right : " + right);
    }
}
