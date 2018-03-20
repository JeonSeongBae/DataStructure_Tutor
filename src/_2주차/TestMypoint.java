package _2주차;

public class TestMypoint {

	public static void main(String[] args) {
		MyPoint mypoint = new MyPoint();

		mypoint.setX(-1);
		mypoint.setY(3);
		System.out.println("[현재좌표] X : " + mypoint.getX() + " / Y : " + mypoint.getY());

		mypoint.moveTo(3, 4);
		System.out.println("[현재좌표] X : " + mypoint.getX() + " / Y : " + mypoint.getY());

		mypoint.scale(-2);
		System.out.println("[현재좌표] X : " + mypoint.getX() + " / Y : " + mypoint.getY());

		mypoint.scale(2);
		System.out.println("[현재좌표] X : " + mypoint.getX() + " / Y : " + mypoint.getY());

	}
}
