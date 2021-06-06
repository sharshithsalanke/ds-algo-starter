import java.util.Scanner;
public class First_unique{
    public static void firstunique(String s){
        char[] str=s.toCharArray();
        int i=0;
        int n=0;
        while(i<str.length){
            int j=i+1;
            int k=i-1;
        while(j<str.length && str[i]!=str[j]){
            j++;
        }
        while(k>=0 && str[i]!=str[k]){
            k--;
        }
        if(k>=0 && str[i]==str[k]){
            i++;
        }
        else if(j<str.length && str[i]==str[j]){
            i++;
        }
        else{
            System.out.println(i);
            System.out.println(str[i]);
            n=1;
            break;
        }
    }
    if(n==0){
        System.out.println("-1");
    }
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Word");
        String s=sc.nextLine();
        while(s.length()<=1 || s.length()>=(10^5)){
            System.out.println("The word is too short or too long");
            s=sc.nextLine();
        }
        firstunique(s);
    }
}