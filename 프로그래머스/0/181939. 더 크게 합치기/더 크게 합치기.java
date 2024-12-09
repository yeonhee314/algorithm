class Solution {
    public int solution(int a, int b) {
        int i_str = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int i_str2 = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
        return  i_str > i_str2 ? i_str : i_str2;
    }
}