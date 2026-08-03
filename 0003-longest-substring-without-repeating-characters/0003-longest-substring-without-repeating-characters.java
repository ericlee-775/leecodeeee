class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hmap = new  HashMap();
        int left=0,max =0,index=0;
        for(char c :s.toCharArray()){
          if(hmap.containsKey(c)&& hmap.get(c)>=left){
            left = hmap.get(c)+1;
          }
          hmap.put(c,index);
          max = Math.max(max,index-left+1);
          index++;  
        }
        return max;
    }
}