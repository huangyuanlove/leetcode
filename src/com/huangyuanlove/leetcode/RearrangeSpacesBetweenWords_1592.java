package com.huangyuanlove.leetcode;

public class RearrangeSpacesBetweenWords_1592 {
    public static String reorderSpaces(String text) {
        int spaceCount = 0;
        char[] chars = text.toCharArray();
        for (char c : chars) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        String[] splite = text.split(" ");
        int wordCount = 0;
        for (String s : splite) {
            if (s.length() > 0) {
                wordCount++;
            }
        }
        StringBuilder sb = new StringBuilder();

        if(wordCount ==1){
            sb.append(text.trim());
            for (int i = 0; i < spaceCount  ; i++) {
                sb.append(' ');
            }
            return sb.toString();
        }

        int per = spaceCount / (wordCount-1);
        int surplus = spaceCount -(per * (wordCount-1))  ;

        for(String s : splite){
            if(s.length() >0){
                sb.append(s);
                for (int i = 0; i < per; i++) {
                    sb.append(' ');
                }
            }
        }

        sb.delete(sb.length()-per,sb.length());
        for (int i = 0; i < surplus; i++) {
            sb.append(' ');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String testCase = "  this   is  a sentence ";
        System.out.println("\""+  reorderSpaces(testCase)  +"\"");
        System.out.println("\""+  reorderSpaces(" practice   makes   perfect")  +"\"");
        System.out.println("\""+reorderSpaces("  hello")+"\"");
        System.out.println("\""+reorderSpaces("a b c ")+"\"");
        System.out.println("\""+reorderSpaces("a b   c d")+"\"");

//        "a b c "
//        "a b c"
//        "a b c "

    }
}
