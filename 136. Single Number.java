class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        int count=0;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
            count=hm.get(nums[i]);
            hm.put(nums[i],count+1);
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer>entry:hm.entrySet())
        {
            if(entry.getValue()<=1)
            ans= entry.getKey();
        }
        return ans ;
    }
}
