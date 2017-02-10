package com.sks.learn.dsalgo;

import org.junit.Test;

public class MiscTester {
/*
	@Test
	public void testUnionFind() {
		UnionFind uf = new UnionFind();
		assertFalse(uf.isConnected(10, 11));
		uf.union(10, 11);
		assertTrue(uf.isConnected(10, 11));
		uf.union(13, 14);
		uf.union(18, 20);
		uf.union(10, 15);
		uf.union(17, 13);
		uf.union(10, 12);
		assertTrue(uf.isConnected(13, 17));
		assertTrue(uf.isConnected(10, 15));
		assertFalse(uf.isConnected(15, 20));
	}

	@Test
	public void testQuickFind() {
		QuickFindUF qf = new QuickFindUF(10);
		List<QFData> qfDataList = qf.getQfDataList();
		qf.union(qfDataList.get(0), qfDataList.get(1));
		assertTrue(qf.isConnected(qfDataList.get(0), qfDataList.get(1)));
		qf.union(qfDataList.get(2), qfDataList.get(4));
		qf.union(qfDataList.get(6), qfDataList.get(8));
		qf.union(qfDataList.get(1), qfDataList.get(3));
		qf.union(qfDataList.get(5), qfDataList.get(7));
		qf.union(qfDataList.get(9), qfDataList.get(0));
		assertTrue(qf.isConnected(qfDataList.get(1), qfDataList.get(9)));
	}
*/
	@Test
	public void testQuickUnion() {
		QuickUnion qu = new QuickUnion(10);
		qu.union(4, 3);
		qu.union(3, 8);
		qu.union(6, 5);
		qu.union(9, 4);
		qu.union(5, 0);
	}
}
