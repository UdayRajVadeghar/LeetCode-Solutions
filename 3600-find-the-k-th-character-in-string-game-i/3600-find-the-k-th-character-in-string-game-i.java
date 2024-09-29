class Solution {
    public char kthCharacter(int k) {

        StringBuilder str = new StringBuilder("a");


        while(true){

            int length = str.length();

            for(int i = 0 ; i < length ;i++){

                int lol = (str.charAt(i)-'a'+1)%26 + 'a';
                char temp = (char)(lol);
                
                System.out.println(temp);
                str.append(temp);

            }
            if(str.length() > k){
                break;
            }

        }
        char temp = str.charAt(k-1);

        return temp;

    }
}