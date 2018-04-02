package _4주차;

public class BigInt {

	private Node start;

	private static class Node {
		int digit;
		Node next;

		Node(int digit) {
			this.digit = digit;
		}
	}

	public BigInt(int n) {
		if (n < 0)
			throw new IllegalArgumentException(n + "<0");
		start = new Node(n % 10);
		Node p = start;
		n /= 10;
		while (n > 0) {
			p = p.next = new Node(n % 10);
			n /= 10;
		}

	}

	public String toString() {
		StringBuffer buf = new StringBuffer(Integer.toString(start.digit));
		Node p = start.next;
		while (p != null) {
			buf.insert(0, Integer.toString(p.digit));
			p = p.next;
		}
		return buf.toString();
	}

	public BigInt plus(BigInt y) {
		Node p = start;
		Node q = y.start;
		int n = p.digit + q.digit;
		BigInt z = new BigInt(n % 10);
		Node r = z.start;
		p = p.next;
		q = q.next;
		while (p != null && q != null) {
			n = n / 10 + p.digit + q.digit;
			r.next = new Node(n % 10);
			p = p.next;
			q = q.next;
			r = r.next;
		}
		while (p != null) {
			n = n / 10 + p.digit;
			r.next = new Node(n % 10);
			p = p.next;
			r = r.next;
		}
		while (q != null) {
			n = n / 10 + p.digit;
			r.next = new Node(n % 10);
			q = q.next;
			r = r.next;
		}
		if (n > 9)
			r.next = new Node(n / 10);
		return z;
	}

	// y가 한자리 양의 정수일 때,
	// 곱하기를 수행하여 그 결과를 프린트하고 결과를 저장한 BigInt 객체를 리턴.
	public BigInt multiplyone(BigInt y) {
		return y;

	}

	// y가 임의의 자리수의 양의 정수일 때,
	// 곱하기를 수행하여 그 결과를 프린트하고 결과를 저장한 BigInt 객체를 리턴.
	public BigInt multiply(BigInt y) {
		return y;
	}
}
