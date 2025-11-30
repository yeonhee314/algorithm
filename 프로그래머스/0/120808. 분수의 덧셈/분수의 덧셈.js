function gcd(a, b) {
	return b === 0 ? a : gcd(b, a % b);
}

function solution(numer1, denom1, numer2, denom2) {
    let answer = [];
	
	numer1 = numer1 * denom2;
	numer2 = numer2 * denom1;
	denom1 = denom1 * denom2;
		
	let numer = numer1 + numer2;
    let g = gcd(numer, denom1);
		
	answer.push(numer / g);
	answer.push(denom1 / g);

    return answer;
}