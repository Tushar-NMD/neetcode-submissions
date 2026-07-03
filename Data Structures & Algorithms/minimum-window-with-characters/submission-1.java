class Solution {
    public String minWindow(String s, String t) {

      int arr[] = new int[123];
        
        int left = 0;
        int count = 0;
        int minlength = Integer.MAX_VALUE;
        int startIdx = 0;
        for(int i = 0; i < t.length(); i++){

          char c = t.charAt(i);
          arr[c]++;

        }

        for(int right = 0; right < s.length(); right++){

          char ch = s.charAt(right);

          if(arr[ch] > 0){

            count++;

          }

          arr[ch]--;
        

        while(count == t.length()){
           
           int window = right - left + 1;

           if(window < minlength){

              minlength = window;
              startIdx = left;

           }
            
          char charleft = s.charAt(left);

          arr[charleft]++;
          left++;

          if(arr[charleft] > 0){

             count--;

          }  
        }
        }
        if(minlength == Integer.MAX_VALUE) return "";

        return s.substring(startIdx, startIdx + minlength);
    }

}
