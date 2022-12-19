class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        int maxone=0;
        List result=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            maxone=Math.max(maxone,candies[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(candies[i]+extraCandies>=maxone)
            result.add(i,true);
            else 
            result.add(i,false);
        }
        return result;
    }
}
