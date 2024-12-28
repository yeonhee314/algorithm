import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int maxIndex = 0, sum = 0;
        int max = Arrays.stream(sides).max().getAsInt();
        for(int i = 0; i < sides.length; i++){
            if(max == sides[i]){
                maxIndex = i;
            }
            sum += sides[i];
        }
        sum -= sides[maxIndex];
        return sum > sides[maxIndex] ? 1 : 2;
    }
}