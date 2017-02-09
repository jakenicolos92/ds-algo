/**
 * 
 */
package com.sks.learn.dsalgo;

import java.util.ArrayList;

import org.junit.Test;

import com.sks.learn.dsalgo.sorting.InsertionSort;
import com.sks.learn.dsalgo.utility.CSVReader;

/**
 * @author Sujit
 *
 */
public class SortingAlgosTester {
	@Test
	public void testInsertionSort() {
		for(ArrayList<Integer> input: CSVReader.readCSVFile()){
			System.out.println("Input : "+input);
			InsertionSort.insertionSort(input);
			System.out.println("Output : "+input);
		}
	}
}
