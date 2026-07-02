class Solution {
    public String minWindow(String s, String t) {

    int arr[] = new int[123];

    for(int i = 0; i < t.length(); i++){

        char ch = t.charAt(i);
        arr[ch]++;

    }

    int minlength = Integer.MAX_VALUE, count = 0, startIdx = -1, left = 0, right = 0;

    while(right < s.length()){

        char c = s.charAt(right);

        if(arr[c] > 0){

           count++;

        }

        arr[c]--;

        while(count == t.length()){

          if(right - left + 1 < minlength){

             minlength = right - left + 1;
             startIdx = left;

          }

          char leftchar = s.charAt(left);
         
          arr[leftchar]++;

           if(arr[leftchar] > 0){
            count--;

          }
          left++;

        }

        right++;

    }

      if(startIdx == -1){
        return "";
      }else{
        return s.substring(startIdx, startIdx + minlength);
      }
    }
}
