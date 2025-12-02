function solution(a, b) {
    const calcA = Number(a + "" + b);
    const calcB = Number(b + "" + a);
    return calcA > calcB ? calcA : calcA === calcB ? calcA : calcB;
}