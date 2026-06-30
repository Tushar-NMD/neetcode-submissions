class Solution {
    public int maxArea(int[] heights) {
        int maxwater = 0;
         int i = 0; 
         int j = heights.length - 1;

         while(i < j){

      int height = Math.min(heights[i],heights[j]);

            int width = j - i;

            int area = height * width;

            maxwater = Math.max(area, maxwater);

            if(heights[i] > heights[j]){

                j--;

            }else{
                i++;
            }


         }

          return maxwater;
    }
}
