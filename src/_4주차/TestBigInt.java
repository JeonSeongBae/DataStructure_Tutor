package _4주차;

public class TestBigInt {

	public static void main(String[] args) {
		BigInt x = new BigInt(54321);
		BigInt y = new BigInt(999);
		BigInt z = new BigInt(9);
		BigInt a = new BigInt(123);
		System.out.println(x + " + " + y + " = " + (54321 + 999) + " ... " + x.plus(y));
		System.out.println(x + " * " + z + " = " + 54321 * 9 + " ... " + x.multiplyone(z));
		System.out.println(x + " * " + a + " = " + 54321 * 123 + " ... " + x.multiply(a));
		System.out.println(y + " * " + a + " = " + 999 * 123 + " ... " + y.multiply(a));
	}
}
