class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!= t.length())
        {
            return false;
        }

        char [] hello = s.toCharArray();
        char [] hey = t.toCharArray();
        int  [] freq = new int[26];

        for(int i = 0 ; i<hello.length ;  i++)
        {
            freq[hello[i]-'a']++;
        }

        for(int i = 0 ; i<hey.length ;  i++)
        {
            freq[hey[i]-'a']--;
        }

        for(int i = 0 ; i<freq.length;i++)
        {
            if(freq[i]!=0)
            {
                return false;
            }
        }

        return true;

    }
}
