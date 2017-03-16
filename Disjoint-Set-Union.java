import java.util.HashMap;
import java.util.Map;
import java.util.* ;

public class DisjointSet{

	private Map<Long,Node> map = new HashMap<>();

	class Node{
		long data ;
		Node parent ;
		int rank ;
	}

	public void make_set(long data){
		Node node = new Node() ;
		node.data = data ;
		node.parent = node ;
		node.rank = 0 ;
		map.put(data , node) ;
	}

	public boolean union (long data1 , long data2){
		Node node1 = new Node();
		Node node2 = new Node();

		Node parent1 = node1.parent;
		Node parent2 = node2.parent;

		if(parent1.data == parent2.data){
			return false;
		}

		if(parent1.rank >= parent2.rank){
			parent1.rank = (parent1.rank == parent2.rank) ?  parent1.rank+1 : parent1.rank;
			parent2.parent = parent1 ; 
		}else {
			parent1.parent = parent2;
		}
		return true ;
	}

	public long findSet (long data){
		return findSet(map.get(data)).data ;
	}

	public Node findSet(Node node){
		Node parent = node.parent;
		if(parent == node){
			return parent ;
		}else{
			node.parent = findSet(node.parent);
			return node.parent;  
		}
	}

	public static void main(String[] args) {
		DisjointSet disjointSet = new DisjointSet();
		disjointSet.make_set(1);
		disjointSet.make_set(2);
		disjointSet.make_set(3);
		disjointSet.make_set(4);
		disjointSet.make_set(5);
		disjointSet.make_set(6);
		disjointSet.make_set(7);

		disjointSet.union(1,2);
		disjointSet.union(2,3);
		disjointSet.union(4,5);
		disjointSet.union(6,7);
		disjointSet.union(5,6);
		disjointSet.union(3,7);

		System.out.println(disjointSet.findSet(1)) ;
		System.out.println(disjointSet.findSet(2)) ;
		System.out.println(disjointSet.findSet(3)) ;
		System.out.println(disjointSet.findSet(4)) ;
		System.out.println(disjointSet.findSet(5)) ;
		System.out.println(disjointSet.findSet(6)) ;
		System.out.println(disjointSet.findSet(7)) ;

	}
}