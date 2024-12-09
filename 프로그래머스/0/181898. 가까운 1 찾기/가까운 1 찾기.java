class Solution {
    public int solution(int[] arr, int idx) {
       int answer = 0;
        for(int i = idx; i < arr.length; i++) {
        	answer = arr[i] >= 1 ? i : -1;
        	if(arr[i] == 1) break;
        }
        return answer;
    }
}