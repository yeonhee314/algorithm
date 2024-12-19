class Solution {
    public int[] solution(int[] num_list) {
    	int last_index = num_list.length - 1;
    	int[] answer = new int[num_list.length + 1];
		for(int i = 0; i < num_list.length; i++) {
    		answer[i] = num_list[i];
		}
		answer[last_index + 1] = num_list[last_index] > num_list[last_index - 1] ? num_list[last_index] - num_list[last_index-1] : num_list[last_index] * 2;
    	
        return answer;
    }
}