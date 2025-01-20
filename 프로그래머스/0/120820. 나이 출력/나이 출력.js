function solution(age) {
    let date = new Date();
    date.setFullYear(2022);
    
    return date.getFullYear() - age + 1;
}