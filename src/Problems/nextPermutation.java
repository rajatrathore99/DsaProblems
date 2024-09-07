package Problems;

public class nextPermutation {
    public int[] nextPermutationArray(int[] A) {
        int n = A.length;
        int idx = -1;

        // Step 1: Find the first decreasing element from the right
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] < A[i + 1]) {
                idx = i;
                break;
            }
        }

        // Step 2: If no such element is found, reverse the entire array (it's the last permutation)
        if (idx == -1) {
            reverseArray(A, 0, n - 1);
            return A;
        }

        // Step 3: Find the first element larger than A[idx] from the right
        int idx1 = -1;
        for (int j = n - 1; j > idx; j--) {
            if (A[j] > A[idx]) {
                idx1 = j;
                break;
            }
        }

        // Step 4: Swap A[idx] and A[idx1]
        int temp = A[idx];
        A[idx] = A[idx1];
        A[idx1] = temp;

        // Step 5: Reverse the elements from idx + 1 to the end
        reverseArray(A, idx + 1, n - 1);

        return A;
    }

    // Helper function to reverse a subarray
    private void reverseArray(int[] A, int left, int right) {
        while (left < right) {
            int temp = A[left];
            A[left] = A[right];
            A[right] = temp;
            left++;
            right--;
        }
    }
}

}
