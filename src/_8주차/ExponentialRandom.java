package _8주차;

public class ExponentialRandom extends java.util.Random {
	private double mean;

	public ExponentialRandom(double mean) {
		// TODO Auto-generated constructor stub
		super(System.currentTimeMillis());
		this.mean = mean;
	}

	public double nextDouble() {
		return -mean * Math.log(1.0 - super.nextDouble());
	}

	public int nextInt() {
		return (int) Math.ceil(nextDouble());
	}
}
