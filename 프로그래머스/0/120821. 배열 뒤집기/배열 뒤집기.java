class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        int i=answer.length-1;
        for(int n:num_list){
            answer[i] = n;
            i--;
        }
        
        
        return answer;
 }
}