class Solution {
    public String solution(String myString) {
         StringBuilder answer = new StringBuilder(); 
        for (int i = 0; i < myString.length(); i++) {
            char currentChar = myString.charAt(i);
            if (currentChar == 'a') {
                answer.append('A');
            } else if (currentChar >= 'A' && currentChar <= 'Z' && currentChar != 'A') {
                answer.append(Character.toLowerCase(currentChar)); 
            } else {
                answer.append(currentChar);
            }
        }
        return answer.toString(); 
    }
}