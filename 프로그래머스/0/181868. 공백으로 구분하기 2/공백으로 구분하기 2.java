import java.util.ArrayList;
import java.util.List;
class Solution {
    public String[] solution(String my_string) {
        my_string.replaceAll("\\s+", " ");
        String[] answer = my_string.split(" ");
        List<String> list = new ArrayList<>();
		for(int i = 0; i < answer.length; i++) {
			if(!answer[i].isEmpty())
				list.add(answer[i]);
		}
        return list.toArray(new String[0]);
    }
}