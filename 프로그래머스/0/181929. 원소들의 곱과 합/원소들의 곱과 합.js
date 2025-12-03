function solution(num_list) {
    let answer = 1;
    let sum = 0;
    for(let i = 0; i < num_list.length; i++){
        answer *= num_list[i];
        sum += num_list[i];
    }
    
    return answer < Math.pow(sum, 2) ? 1 : 0;
}