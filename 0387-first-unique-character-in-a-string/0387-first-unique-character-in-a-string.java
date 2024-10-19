class Solution {
    public int firstUniqChar(String s) {
       Queue<Character> queue=new LinkedList<>();
       int []freq=new int[26];
       int i=0;
       while(i<s.length())
       {
       queue.add(s.charAt(i));
       freq[s.charAt(i)-'a']++;
       i++;
       }
       for(char ch : queue){
           if(freq[ch-'a']==1)
             return s.indexOf(ch);
       }
       return -1;
    }
}