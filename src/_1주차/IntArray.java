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
	}

	public void add(int x) {
		if (index >= arr.length) {
			resize();
		}
		arr[index++] = x;
	}

	private void resize() {
		int[] temp = arr;
		arr = new int[arr.length * 2];
		System.arraycopy(temp, 0, arr, 0, temp.length);
	}

	public void remove(int x) {
		for (int i = 0; i <= index; i++) {
			if (arr[i] == x) {
				System.arraycopy(arr, i + 1, arr, i, arr.length - i - 1);
				index--;
				break;
			}
		}
	}

	public void print() {
		for (int i = 0; i < index; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
