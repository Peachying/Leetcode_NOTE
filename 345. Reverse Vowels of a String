-将元音字母用Hash Set保存，利用contains方法判断。新建char数组保存结果。用双指针分别从头部尾部向中间遍历。
-遇到元音字母以外的直接写入（头尾分别），如果都是辅音就交换。
-注意这里要用char保存字符，否则自增自减操作之后就变了。如一开始代码是：
class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> vowel = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int i=0,j=s.length()-1;
        char[] res = new char[s.length()];
        while(i<=j){
            if(!vowel.contains(s.charAt(i)))
                res[i++] = s.charAt(i);
            else if(!vowel.contains(s.charAt(j)))
                res[j--] = s.charAt(j);
            else{
                res[i++] = s.charAt(j);
                res[j--] = s.charAt(i);
            }
            }
        return new String(res);
    }
}
###输出"eolol"。

##正确答案：
private final static HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

public String reverseVowels(String s) {
    int i = 0, j = s.length() - 1;
    char[] result = new char[s.length()];
    while (i <= j) {
        char ci = s.charAt(i);
        char cj = s.charAt(j);
        if (!vowels.contains(ci)) {
            result[i++] = ci;
        } else if (!vowels.contains(cj)) {
            result[j--] = cj;
        } else {
            result[i++] = cj;
            result[j--] = ci;
        }
    }
    return new String(result);
}
