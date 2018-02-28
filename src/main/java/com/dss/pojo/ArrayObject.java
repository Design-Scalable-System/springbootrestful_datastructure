/**
 * 
 */
package com.dss.pojo;

import java.util.Arrays;

/**
 * @author Mustajab Akhtar
 * @since 1.0
 */
public class ArrayObject {

	private int[] arr;
	private int size;
	private int rotateByNElements;

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getRotateByNElements() {
		return rotateByNElements;
	}

	public void setRotateByNElements(int rotateByNElements) {
		this.rotateByNElements = rotateByNElements;
	}

	@Override
	public String toString() {
		return "ArrayObject [arr=" + Arrays.toString(arr) + ", size=" + size + ", rotateByNElements="
				+ rotateByNElements + "]";
	}
	
	

}
