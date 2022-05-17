package practice;

import java.util.LinkedList;
import java.util.Queue;

public class PairTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<Integer,Integer> pp = new Pair<Integer,Integer>(2,3);
		System.out.println(pp.getValue());
		
		 Queue<Pair<Integer,Integer>> q = new LinkedList<Pair<Integer,Integer>>();
		 q.add(new Pair<>(1,2));

	}

}
