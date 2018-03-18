package _1주차;

import java.util.Random;

public class IntArray {
	int[] arr;
	int index;

	public IntArray(int size) {
		this.arr = new int[size];
		for (int i = 0; i < arr.length / 2; i++) {
			Random random = new Random();
			arr[i] = random.nextInt(10) + 1;
		}
		index = arr.length / 2;
		System.out.println("길이 " + size + "인 배열을 생성하였습니다.");
	}

	public void add(int x) {
		if (index >= arr.length) {
			int[] temp = arr;
			arr = new int[arr.length * 2];
			System.arraycopy(temp, 0, arr, 0, temp.length);
		}
		arr[index++] = x;
		System.out.println("데이터 " + x + "의 삽입이 완료되었습니다.");
	}

	public void remove(int x) {
		for (int i = 0; i <= index; i++) {
			if (arr[i] == x) {
				System.arraycopy(arr, i + 1, arr, i, arr.length - i - 1);
				index--;
				System.out.println("데이터 " + x + "의 삭제가 완료되었습니다.");
				break;
			}
		}
	}

	public void print() {
		System.out.println("배열 데이터 : ");
		for (int i = 0; i < index; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}