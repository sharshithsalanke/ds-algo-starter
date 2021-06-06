import java.util.Arrays;
import java.util.Scanner;

public class Anagram{
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        else{
            char[] str1=s.toCharArray();
            char[] str2=t.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            for(int i=0;i<s.length();i++){
                if(str1[i]!=str2[i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String s=sc.nextLine();
        System.out.println("Enter it's Anagram");
        String t=sc.nextLine();
        System.out.println(isAnagram(s,t));
    }
}