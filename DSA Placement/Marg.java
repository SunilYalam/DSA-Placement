public class Marg {
    public void twoMarge(int nums1[], int nums2[], int m, int n){
        int i = m-1;
        int j = n-1;
        int k = nums1.length-1;

        while(j>=0){
            if(i>=0 && nums1[i]> nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            }
            else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }
}
