package com.sks.learn.dsalgo;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.sks.learn.algo.utility.CSVReader;


public class CSVReaderTester {

	@Test
	public void testCSVReader() {
		List<ArrayList<Integer>> csvDataList = CSVReader.readCSVFile();
		assertNotNull(csvDataList);
		assertNotEquals(csvDataList.size(), 0);
		System.out.println("csvDataList = "+csvDataList);
	}

}
