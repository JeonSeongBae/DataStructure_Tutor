package _05주차_2;

public class TestLinkedList {

	   public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      LinkedList a = new LinkedList();
	      
	      for (int i = 1; i < 6; i++) {
	         a.push(i);
	      }
	      for (int i = 1; i < 3; i++) {
			System.out.println(a.pop());
		}
	      System.out.println(a);

	      a.removesecond();
	      System.out.println(a);
	      
	      a.reverse();
	      System.out.println(a);
	   }
	}