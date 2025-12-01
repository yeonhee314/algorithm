function solution(a, b) {
    const calc = Number(a + "" + b + "");
    return calc > 2 * a * b ? calc : 2 * a * b;
}