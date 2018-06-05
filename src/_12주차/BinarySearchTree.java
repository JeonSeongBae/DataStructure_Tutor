package _12주차;


public class BinarySearchTree {
	//private field
	private Comparable<Integer> _key;
	private BinarySearchTree _left;
	private BinarySearchTree _right;
	private int _size;
	
	//inner class
	private class Node implements Comparable<Integer> {
		private int _key;
		
		public Node(int key) {
			this._key = key;
		}
		
		public int Key() { return _key; }
		@Override
		public int compareTo(Integer other) {
			if(this._key < other) return -1;
			else if(this._key == other) return 0;
			else return 1;
		}
	}

	//constructors
	public BinarySearchTree() {
		this._key = null;
		this._left = null;
		this._right = null;
		this._size = 0;
	}
	
	public BinarySearchTree(int key) {
		this._key = new Node(key);
		this._left = null;
		this._right = null;
		this._size = 1;
	}
	
	//private methods
	private Node Key() { return (Node) _key; }
	private void setKey(Node key) { _key = key; }
	private BinarySearchTree Left() { return _left; }
	private void setLeft(BinarySearchTree T) { _left = T; }
	private BinarySearchTree Right() { return _right; }
	private void setRight(BinarySearchTree T) { _right = T; }
	private void setSize(int s) { _size = s; }
	
	//public methods
	public int treeSize() { return _size; }
	
	public boolean insert(int key) {		
		if( this._key == null ) {
			this._key = new Node(key);
			this._size++;
			return true;
		}
		else {
			int flag = this._key.compareTo(key);
			_size++;
			if(flag == 0) return false;
			else if(flag > 0) {
				if(_left == null) _left = new BinarySearchTree();
				return _left.insert(key);
			}
			else {
				if(_right == null) _right = new BinarySearchTree();
				return _right.insert(key);
			}
		}
	}
	
	public void inorder() {
		if( _size == 0 ) {
			System.out.println("Tree is empty!");
			return;
		}
		
		if(_left != null) _left.inorder();
		
		System.out.println("Visited : " + ((Node) this._key).Key() + ", TreeSize : " + _size);
		
		if(_right != null) _right.inorder();
		
	}
	
	public Node delete(int key) {
		int flag = _key.compareTo(key);
		
		if(flag == 0) { 
			_size--;
			
			Node rtn = null;
			
			if ( _left == null && _right == null ) {
				rtn = (Node) _key;
				_key = null;
			}
			else if ( _left == null && _right != null ) {
				rtn = (Node) _key;
				_key = _right.Key();
				_left = _right.Left();
				_right = _right.Right();
			}
			else if ( _left != null && _right == null ) {
				rtn = (Node) _key;
				_key = _left.Key();
				_right = _left.Right();
				_left = _left.Left();
			}
			else {
				rtn = (Node) _key;
				if( _right.treeSize() == 1 ) {
					_key = _right.Key();
					_right = null;
				}
				else _key = _right.deleteMinimum(_right);
			}
			
			return (Node) rtn;
		}
		else if(flag < 0) { 
			if( _right == null ) return null;
			
			_size--;
			return _right.delete(key);
		}
		else { 
			if( _left == null ) return null;
			
			_size--;
			return _left.delete(key);
		} 
	}
	
	Comparable<Integer> deleteMinimum(BinarySearchTree T){
		Comparable<Integer> tmp = null;
		
		if ( T.Left() == null ) {
			tmp = T.Key();
			T.setKey( T.Right().Key() );
			T.setLeft( T.Right().Left() );
			T.setRight( T.Right().Right() );
		} else {
			if ( T.Left().treeSize() == 1 ) {
				tmp = T.Left().Key();
				T.setLeft(null);
			}
			else {
				tmp = T.deleteMinimum(T.Left());
			}
		}
		
		T.setSize(T.treeSize() - 1);
		
		return tmp;
	}
	
}
