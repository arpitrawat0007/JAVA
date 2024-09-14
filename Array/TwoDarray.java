public class TwoDarray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5,6}, {4,5,6,457,47,58}, {12,24,57,65,89,78}};
        int i = 0;
        while(i< arr.length){
            int j = 0;
            while (j < arr[i].length) {
                System.out.print(arr[i][j]+ " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
