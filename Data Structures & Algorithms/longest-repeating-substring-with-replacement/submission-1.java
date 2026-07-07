class Solution {
    public int characterReplacement(String s, int k) {

      int max = 0;

      int arr[] = new int[26];
      
      int left = 0;
      
      int maxfreq = 0;

      for(int right = 0; right < s.length(); right++){

         char ch = s.charAt(right);

         int length = right - left + 1;

         arr[ch - 'A']++;

        maxfreq = Math.max(maxfreq, arr[ch - 'A']);

        while(length - maxfreq > k){

           char leftchar = s.charAt(left);

           arr[leftchar - 'A']--;

           left++;

           length = right - left + 1;

        }
        
        max = Math.max(length, max);
      }
       return max;  
    }
}
