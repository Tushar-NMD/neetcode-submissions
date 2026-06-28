class Solution {
    public int longestConsecutive(int[] nums) {

    HashMap<Integer, Boolean> map = new HashMap<>();
  
     for(int num : nums){
        
        map.put(num, true);
     }

     for(int val : nums){

        if(map.containsKey(val - 1)){

            map.put(val , false);

          }
        }
           int ml = 0;
        for(int val : nums){   

           int  count = 1;
            int next = val;

           while(map.containsKey(next + 1)){

                count++;
                next++;
           }

           if(count > ml){
                ml = count;
           }
        }
return ml;
     }
}
