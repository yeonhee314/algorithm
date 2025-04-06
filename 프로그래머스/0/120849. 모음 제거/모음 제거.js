function solution(my_string) {
    let answer = '';
    const vowels = ["a", "e", "i", "o", "u"];
    my_string.split("").forEach((s) => {
        if (!vowels.includes(s)) answer += s;
    });
  return answer;
}