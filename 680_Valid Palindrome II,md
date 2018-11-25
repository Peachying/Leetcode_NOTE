##题目描述：
Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome. 
Example 1:
Input: "aba"
Output: True

Example 2:
Input: "abca"
Output: True
Explanation: You could delete the character 'c'.

Note:
The string will only contain lowercase characters a-z. The maximum length of the string is 50000.
也就是说可以最多去掉一个字符判断是否回文。

##解析：
、
class Solution {
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))
                return isPalindrome(s,i+1,j)||isPalindrome(s,i,j-1);
            i++;
            j--;
        }
        return true;
    }
    
    private boolean isPalindrome(String s, int i,int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
、
