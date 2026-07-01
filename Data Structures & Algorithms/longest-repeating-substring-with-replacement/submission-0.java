class Solution {
    public int characterReplacement(String s, int k) {

    int arr[] = new int[26];
    
    int window = 0;

    int maxfreq = 0;

    int maxlength = 0;

    int left = 0;

    for(int right = 0; right < s.length(); right++){

    arr[s.charAt(right) - 'A']++;

    window = right - left + 1;

    maxfreq = Math.max(maxfreq, arr[s.charAt(right) - 'A']);

    while(window - maxfreq > k){

        arr[s.charAt(left) - 'A']--;
        left++;

        window = right - left + 1;

    }
     maxlength = Math.max(maxlength, right - left + 1);
     
    }
 return maxlength;
    }
   
}
