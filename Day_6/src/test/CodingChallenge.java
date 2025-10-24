package test;

public class CodingChallenge {

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 5, 6, 7, 8 };

        int n1 = arr1.length;
        int n2 = arr2.length;
        int n3 = n1 + n2;

        int[] result = new int[n3];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];

            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < n1) {
            result[k++] = arr1[i++];
        }

        while (j < n2) {
            result[k++] = arr2[j++];
        }

        for (int k2 = 0; k2 < result.length; k2++) {
            System.out.print(result[k2] + " ");
        }
    }
}
