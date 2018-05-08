package _9주차;

import java.util.*;

public class TestOrderedTree {

	public static void main(String[] args) {
		OrderedTree treeA, treeB, treeD, treeE, treeG;
		OrderedTree treeC = new OrderedTree("C");
		OrderedTree treeF = new OrderedTree("F");
		OrderedTree treeH = new OrderedTree("H");
		OrderedTree treeI = new OrderedTree("I");
		OrderedTree treeJ = new OrderedTree("J");
		OrderedTree treeK = new OrderedTree("K");
		OrderedTree treeL = new OrderedTree("L");
		OrderedTree treeM = new OrderedTree("M");

		/* TreeList 객체 생성 */
		List subtreesOfE = (List) new LinkedList();

		/* treeList에 treeH treeI 추가 */
		subtreesOfE.add(treeH);
		subtreesOfE.add(treeI);

		/* treeB에 연결하여 트리 구축 */
		treeE = new OrderedTree("E", subtreesOfE);

		/* TreeList 객체 생성 */
		List subtreesOfG = (List) new LinkedList();

		/* treeList에 treeJ treeL treeL treeM 추가 */
		subtreesOfG.add(treeJ);
		subtreesOfG.add(treeK);
		subtreesOfG.add(treeL);
		subtreesOfG.add(treeM);

		/* treeB에 연결하여 트리 구축 */
		treeG = new OrderedTree("G", subtreesOfG);
		
		/* TreeList 객체 생성 */
		List subtreesOfB = (List) new LinkedList();

		/* treeList에 treeE treeF 추가 */
		subtreesOfB.add(treeE);
		subtreesOfB.add(treeF);

		/* treeB에 연결하여 트리 구축 */
		treeB = new OrderedTree("B", subtreesOfB);

		/* treeList 객체 생성 */
		List subtreesOfD = (List) new LinkedList();

		/* treeList에 treeG 추가 */
		subtreesOfD.add(treeG);

		/* treeD에 연결하여 트리 구축 */
		treeD = new OrderedTree("D", subtreesOfD);

		/* treeList 객체 생성 */
		List subtreesOfA = (List) new LinkedList();

		/* treeList에 treeB, treeC, treeD 추가 */
		subtreesOfA.add(treeB);
		subtreesOfA.add(treeC);
		subtreesOfA.add(treeD);

		/* treeA(root)에 각 트리를 연결 */
		treeA = new OrderedTree("A", subtreesOfA);

		/* levelOreder() */
		treeA.levelOrder();
	}
}
