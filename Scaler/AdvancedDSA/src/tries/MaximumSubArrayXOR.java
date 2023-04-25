package src.tries;

public class MaximumSubArrayXOR {

    class TrieNode {
        int index;
        TrieNode[] children;
        TrieNode(int index) {
            this.index = index;
            children = new TrieNode[2];
        }
    }

    public TrieNode insert(TrieNode A, int B, int ind) {
        TrieNode curr = A;
        int idx = 0;
        for (int i=31; i>=0; i--) {
            idx = ((1 << i) & B) == 0 ? 0 : 1;
            if (curr.children[idx] == null)
                curr.children[idx] = new TrieNode(0);
            curr = curr.children[idx];
        }
        curr.index = ind;
        return A;
    }

    public int[] getMax(TrieNode A, int B) {
        TrieNode curr = A;
        int max = 0;
        int idx = 0;
        for (int i=31; i>=0; i--) {
            idx = ((1 << i) & B) == 0 ? 0 : 1;
            if (curr.children[idx ^ 1] != null) {
                curr = curr.children[idx ^ 1];
                if (idx == 0)
                    max += (1 << i);
            }
            else {
                curr = curr.children[idx];
                if (idx == 1)
                    max += (1 << i);
            }
        }
        return new int[] {max, curr.index};
    }
    public int[] solve(int[] A) {
        TrieNode root = new TrieNode(0);
        int xor = 0;
        int ans = 0;
        int maxlength = 0;
        root = insert(root, xor, 0);
        int[] B = new int[2];
        for (int i=0; i<A.length; i++) {
            int max = 0;
            xor ^= A[i];
            root = insert(root, xor, i+1);
            int[] arr = getMax(root, xor);
            max = Math.max(max, arr[0] ^ xor);
            int start = arr[1];
            int end = i + 1;
            if (max > ans || max == ans && end-start < maxlength) {
                ans = max;
                maxlength = end - start;
                B[0] = start + 1;
                B[1] = end;
            }
        }
        return B;
    }

}
