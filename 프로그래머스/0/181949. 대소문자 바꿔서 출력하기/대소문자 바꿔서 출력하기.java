import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        for(int i = 0; i < a.length(); i++){
        	answer += Character.isUpperCase(a.charAt(i)) ? Character.toLowerCase(a.charAt(i)) : Character.toUpperCase(a.charAt(i));
        }
        System.out.println(answer);
    }
}