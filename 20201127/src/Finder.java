public class Finder {
    public static void main(String[] args) {
        int[] a = {2,32,4,1,6,9,0};
        int n = a.length;
        int K = 7;
        System.out.println(findKthLargest(a, n, K));
    }
    public static int findKthLargest(int[] num, int n, int k){
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if(num[i] > num[j]) {
                    int tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
        }
        return num[k-1];
    }


    public int findKth(int[] a, int n, int K) {
        return findKth(a, 0, n - 1, K);
    }

    public int findKth(int[] a, int low, int high, int k) {
        int part = partation(a, low, high);
        if (k == part - low + 1) {
            return a[part];
        } else if (k > part - low + 1) {
            return findKth(a, part + 1, high, k - part + low - 1);
        } else {
            return findKth(a, low, part - 1, k);
        }
    }
    public int partation(int[] a, int low, int high) {
        int key = a[low];
        while(low < high) {
            while(low < high && a[high] <= key) high--;
            a[low] = a[high];
            while(low < high && a[low] >= key) low++;
            a[high] = a[low];
        } a
                [low] = key;
        return low;
    }
}