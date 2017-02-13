package com.sks.learn.algo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * For n data : O(n^2) : Quadratic - Too Slow
 * Not efficient Algo
 * @author Sujit K Singh
 *
 */
public class UnionFind {
	private List<Set<Integer>> componentList = new ArrayList<Set<Integer>>();

	public void union(int i1, int i2) {
		if (componentList.isEmpty()) {
			Set<Integer> component = new HashSet<Integer>();
			component.add(i1);
			component.add(i2);
			componentList.add(component);
		} else {
			for (Set<Integer> component : componentList) {
				boolean i1Exists = component.contains(i1);
				boolean i2Exists = component.contains(i2);
				// Both i1 & i2 already exists so no need to Union
				if (i1Exists && i2Exists) {
					break;
				}
				// If only i1 exists then add i2
				else if (i1Exists) {
					component.add(i2);
					break;
				}
				// If only i2 esixts then add i1
				else if (i2Exists) {
					component.add(i1);
					break;
				}
				// If none exist then create a new component
				else {
					Set<Integer> comp = new HashSet<Integer>();
					comp.add(i1);
					comp.add(i2);
					componentList.add(comp);
					break;
				}
			}
		}
		System.out.println("componentList = " + componentList);
	}

	public boolean isConnected(int i1, int i2) {
		for (Set<Integer> component : componentList) {
			if (component.contains(i1) && component.contains(i2)) {
				return true;
			}
		}
		return false;
	}

	public List<Set<Integer>> getComponentList() {
		return componentList;
	}

	public void setComponentList(List<Set<Integer>> componentList) {
		this.componentList = componentList;
	}

	public static void main(String[] args) {
		UnionFind uf = new UnionFind();
		//assertFalse(uf.isConnected(10, 11));
		uf.union(10, 11);
		//assertTrue(uf.isConnected(10, 11));
		uf.union(13, 14);
		uf.union(18, 20);
		uf.union(10, 15);
		uf.union(17, 13);
		uf.union(10, 12);
	}
}
