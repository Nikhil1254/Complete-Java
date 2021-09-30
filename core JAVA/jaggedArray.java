public class jaggedArray {
    public static void main(String[] args) {
        int[][] arr = { { 10, 20, 30, 40, 50 }, { 1, 2, 3 }, { 11, 12 }, { 21, 22, 23, 24 } };

        for (int[] nums : arr) {
            for (int ele : nums)
                System.out.print(ele + " ");
            System.out.println();
        }
    }
}
