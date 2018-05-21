package _04주차;

public class BigInt {

	private Node start;

	private static class Node {
		private int digit;
		private Node next;

		public Node(int digit) {
			this.digit = digit;
		}

		public int getDigit() {
			return digit;
		}
/*
		public void setDigit(int digit) {
			this.digit = digit;
		}
*/
		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

	public BigInt(int n) {
		if (n < 0)
			throw new IllegalArgumentException(n + "<0");
		start = new Node(n % 10);
		Node p = start;
		n /= 10;
		while (n > 0) {
			p.setNext(new Node(n % 10));
			p = p.getNext();
			n /= 10;
		}
	}

	public BigInt plus(BigInt y) {
		Node p = start;
		Node q = y.start;
		int n = p.getDigit() + q.getDigit();
		BigInt z = new BigInt(n % 10);
		Node r = z.start;
		p = p.getNext();
		q = q.getNext();
		while (p != null && q != null) {
			n = n / 10 + p.getDigit() + q.getDigit();
			r.setNext(new Node(n % 10));
			p = p.getNext();
			q = q.getNext();
			r = r.getNext();
		}
		while (p != null) {
			n = n / 10 + p.getDigit();
			r.setNext(new Node(n % 10));
			p = p.getNext();
			r = r.getNext();
		}
		while (q != null) {
			n = n / 10 + q.getDigit();
			r.setNext(new Node(n % 10));
			q = q.getNext();
			r = r.getNext();
		}
		if (n > 9)
			r.setNext(new Node(n / 10));
		return z;
	}

	/*
	 * y가 한자리 양의 정수일 때, 곱하기를 수행하여 그 결과를 프린트하고 결과를 저장한 BigInt 객체를 리턴.
	 */
	public BigInt multiplyone(BigInt y) {
		// y는 한자리 수
		Node p = this.start;
		Node q = y.start;
		int n = p.getDigit() * q.getDigit();
		BigInt z = new BigInt(n % 10);
		Node r = z.start;
		p = p.getNext();
		while (p != null) {
			n = n / 10 + (p.getDigit() * q.getDigit());
			r.setNext(new Node(n % 10));
			p = p.getNext();
			r = r.getNext();
		}
		if (n > 9)
			r.setNext(new Node(n / 10));
		return z;

	}

	/*
	 * y가 임의의 자리수의 양의 정수일 때, 곱하기를 수행하여 그 결과를 프린트하고 결과를 저장한 BigInt 객체를 리턴.
	 */
	public BigInt multiply(BigInt y) {
		Node q = y.start;
		BigInt result = this.multiplyone(new BigInt(q.getDigit()));
		q = q.getNext();
		int count = 1;
		while (q != null) {
			BigInt sum = this.multiplyone(new BigInt(q.getDigit()));
			// 자릿수를 맞춰주기위해 10을 곱해준다. x * 10 == (x * 9) + x
			for (int i = 0; i < count; i++) {
				BigInt temp = sum.multiplyone(new BigInt(9));
				sum = sum.plus(temp);
			}
			result = result.plus(sum);
			q = q.getNext();
			count++;
		}
		return result;
	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer(Integer.toString(start.getDigit()));
		Node p = start.getNext();
		while (p != null) {
			buf.insert(0, Integer.toString(p.getDigit()));
			p = p.getNext();
		}
		return buf.toString();
	}
}