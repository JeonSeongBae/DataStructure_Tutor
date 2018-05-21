package _02주차;

public class MyPoint implements Point {
	private double X;
	private double Y;

	public MyPoint() {
		this.X = 0.0;
		this.Y = 0.0;
	}

	@Override
	public void setX(double A) {
		this.X = A;
	}

	@Override
	public void setY(double B) {
		this.Y = B;
	}

	@Override
	public double getX() {
		return this.X;
	}

	@Override
	public double getY() {
		return this.Y;
	}

	@Override
	public void moveTo(double X, double Y) {
		this.X += X;
		this.Y += Y;
		System.out.println("X는 " + X + "만큼 Y는 " + Y + "만큼 이동하였습니다.");
	}

	@Override
	public void scale(double Z) {
		if (Z > 0) {
			this.X *= Z;
			this.Y *= Z;
		} else {
			System.out.println("[Error] 0보다 작은 값은 곱할 수 없습니다.");
		}
	}

}
