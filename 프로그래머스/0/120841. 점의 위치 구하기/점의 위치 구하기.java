class Solution {
    public int solution(int[] dot) {
        return dot[0] < 0 && dot[1] < 0 ? 3 : 
               dot[0] < 0 && dot[1] > 0 ? 2 :
               dot[0] > 0 && dot[1] < 0 ? 4 : 1;
    }
}