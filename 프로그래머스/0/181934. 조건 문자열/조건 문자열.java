class Solution {
     public int solution(String ineq, String eq, int n, int m) {
       int answer = 0;
        switch(ineq) {
        case "<": 
        	if(eq.equals("=")) return answer = n <= m ? 1 : 0;
        	else return answer = n < m ? 1 : 0;
        case ">":
        	if(eq.equals("=")) return answer = n >= m ? 1 : 0;
        	else return answer = n > m ? 1 : 0;
        }
        return answer;
    }
}