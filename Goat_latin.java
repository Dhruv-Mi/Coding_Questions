package com.company;

public class Goat_latin {
    public static String toGoatLatin(String sentence){
        String[] words=sentence.split(" ");
        StringBuilder count= new StringBuilder("a");
        StringBuilder ans= new StringBuilder();
        for(int i=0;i< words.length;i++){
            String s=words[i];
            char ch=s.toLowerCase().charAt(0);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                s=s+"ma"+count;
            }
            else{
                s=s.substring(1)+s.charAt(0)+"ma"+count;
            }
            if(i== words.length-1){
                ans.append(s);
            }
            else{
                ans.append(s).append(" ");
            }
            count.append("a");
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String sentence= "The quick brown fox jumped over the lazy dog";
        String ans=toGoatLatin(sentence);
        System.out.println(ans);
    }
}
