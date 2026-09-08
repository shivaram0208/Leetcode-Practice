class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = 0;
        while(m < nums1.length)
        {
            nums1[m++] = nums2[a++];
        }
        Arrays.sort(nums1);
    }
}