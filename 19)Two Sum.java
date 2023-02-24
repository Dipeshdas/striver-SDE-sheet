class Solution {
    public int[] twoSum(int[] nums, int target) {
        //T.C - O(N^2) 
        // int a[]=new int[2];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=1;j<nums.length;j++){
        //         if(nums[i]==nums[j] && nums[i]+nums[j]==target && i<j && i==0){
        //             a[1]=j;
        //             break;
        //         }
        //         if(nums[i]+nums[j]==target && i<j){
        //             a[0]=i;
        //             a[1]=j;
        //             break;
        //         }
        //     }
        // }
        // return a;

        int ans[]=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                ans[0]=map.get(target-nums[i]);
                ans[1]=i;
                return ans;
            }
            map.put(nums[i],i);
        }
        return ans;
        
    }
}
