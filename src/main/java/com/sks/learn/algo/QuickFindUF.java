package com.sks.learn.algo;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Union for n data is O(n^2) : Quadratic : Too Slow
 * Not efficient Algo
 * 
 * find/isConnected is fast
 * 
 * NOTE - QFData will have Unique values
 * 
 * @author Sujit K Singh
 *
 */
public class QuickFindUF {
	/**
	 * Inner Class for Data
	 *
	 */
	public class QFData {
		int id;
		int value;
		boolean hasConnection;

		QFData(int id, int value) {
			this.id = id;
			this.value = value;
		}

		@Override
		public String toString() {
			return id + "-->" + value;
		}

		@Override
		public boolean equals(Object obj) {
			if (this.value == ((QFData) obj).value) {
				return true;
			}
			return false;
		}
	}

	public QFData getQfObject(int id, int value) {
		return new QFData(id, value);
	}

	List<QFData> qfDataList;

	public QuickFindUF(int N) {
		qfDataList = new ArrayList<QFData>();
		for (int i = 0; i < N; i++) {
			QFData data = new QFData(i, 10 + i);
			qfDataList.add(data);
		}
		System.out.println("qfDataList = " + qfDataList);
	}

	/**
	 * For connected elements id will be same
	 * @param i1
	 * @param i2
	 * @return
	 */
	public boolean isConnected(QFData data1, QFData data2) {
		if (data1.id == data2.id) {
			return true;
		}
		return false;
	}

	/**
	 * Connects two QFData
	 * @param data1
	 * @param data2
	 */
	public void union(QFData data1, QFData data2) {
		System.out.println("qfDataList union(" + data1 + ", " + data2 + ")");
		int idToSet = data1.id;
		int idToBeChanged = data2.id;
		data2.id = idToSet;
		// Change the id for all connections of data2
		if (data2.hasConnection) {
			for (QFData qfData : qfDataList) {
				if (qfData.id == idToBeChanged) {
					qfData.id = idToSet;
				}
			}
		}
		// Set the connection flag
		data1.hasConnection = true;
		data2.hasConnection = true;
		System.out.println(qfDataList);
	}

	public List<QFData> getQfDataList() {
		return qfDataList;
	}

	public void setQfDataList(List<QFData> qfDataList) {
		this.qfDataList = qfDataList;
	}

}
