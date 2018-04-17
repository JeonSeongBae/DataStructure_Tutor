package _6주차;

public interface Queue {
	public void add(Object object);//큐에 원소를 삽입하는 메소드

	public Object first();//큐의 첫번째 원소를 확인

	public Object remove();//큐의 첫번째 원소를 삭제하고, 해당 원소 반환

	public int size();//큐에 저장된 원소의 갯수를 반환

	public void print();//큐 내부의 원소들을 출력

	public void resize();//ArrayQueue 구현 시 배열을 확장하는 메소드, SlinkedQueue는 구현할 필요 없음.
}
