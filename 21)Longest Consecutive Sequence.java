class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int longSeq=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int num=nums[i]+1;
                count=1;
                while(set.contains(num)){
                    num+=1;
                    count++;
                }
                longSeq=Math.max(longSeq,count);
            }
        }
        return longSeq;

    }
}
