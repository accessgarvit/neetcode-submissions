class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        int start = 0 ;
        int end = arr.length-1;

        while(start<=end)
        {
            while(start<=end &&  ! (( arr[start] >= 'a' && arr[start]<='z' )  || ( arr[start] >= '0' && arr[start]<='9' )))
            {
               start++;
            }

            while(start<=end  &&  ! (( arr[end] >= 'a' && arr[end]<='z' )  || ( arr[end] >= '0' && arr[end]<='9' )))
            {
                end--;
            }

            if( start <= end && arr[start]!=arr[end])
            {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
