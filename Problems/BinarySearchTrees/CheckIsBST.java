package Problems.BinarySearchTrees;

public class CheckIsBST {
    static boolean isBSTTraversal(int arr[]) {
        for(int i=1;i<arr.length;i++) {
            if(arr[i-1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {11975, 59779, 11339};
        boolean b = isBSTTraversal(arr);
        System.out.println(b);
    }
}
