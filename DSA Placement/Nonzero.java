public class Nonzero {
    static void pushZeroToLast(int nums[], int n){
        int start = 0;
        for(int i = 0; i<n; i++)
        if(nums[i] != 0)
        nums[start++] = nums[i];

        while(start<n)
        nums[start++] = 0;

    }
     public static void main(String args[]){
            int nums[] = {0,1,0,3,12};
            int n = nums.length;
            pushZeroToLast(nums, n);
            System.out.println("pushing zeros");
            for(int i= 0; i<n; i++)
            System.out.print(nums[i] + "");
        }
}
