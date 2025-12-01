function solution(a, b) {
    const calc = Number(a.valueOf().toString() + b.valueOf().toString());
    return calc > 2 * a * b ? calc : 2 * a * b;
}