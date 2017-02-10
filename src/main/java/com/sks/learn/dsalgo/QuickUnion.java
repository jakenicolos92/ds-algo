package com.sks.learn.dsalgo;

/**
 * Data: id Array
 * index = Value stored
 * Array-Value = id or parent of index-value
 * Note: With each union operation there is only one change in array
 * Problem: Tree can go long and tall and each find operation will be O(n)
 * @author Sujit K Singh
 *
 */
public class QuickUnion {
	int[] id = new int[10];

	/**
	 * Initialization of id-array where
	 * root of index = id
	 * id[i] stores root of i
	 * i is input value b/w 0-9
	 * @param N
	 */
	public QuickUnion(int N) {
		for (int i = 0; i < N; i++) {
			id[i] = i;
		}
		System.out.println("Data Initialized :: ");
		printData();
	}
	public void printData(){
		for (int i = 0; i < id.length; i++) {
			System.out.print(i + "-->" + id[i] + ", ");
		}
	}

	/**
	 * Input is index(i1,i2)
	 * id of i1's root = id of i2's root
	 * Note - id[i] = parent of i
	 * Example:
	 * Union(4,3)
	 * r1=id[4]=4
	 * r2=id[3]=3
	 * id[4]=id[3]=3
	 * @param i1
	 * @param i2
	 */
	public void union(int i1, int i2) {
		// Get Root of i1
		int i1_root = id[i1];
		while (id[i1_root] != i1_root) {
			i1_root = id[id[i1_root]];
		}
		// Get root of i2
		int i2_root = id[i2];
		while (id[i2_root] != i2_root) {
			i2_root = id[id[i2_root]];
		}
		id[i1_root] = id[i2_root];
		System.out.println("\nData after Union("+i1+","+i2+")");
		printData();
	}

	/**
	 * if i1 and i2 have same root
	 * @param i1
	 * @param i2
	 * @return
	 */
	public boolean find(int i1, int i2) {
		return false;
	}
}
