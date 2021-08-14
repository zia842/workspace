package com.practice.spring.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSort implements SortingAlgorithm{

	public int [] sort(int []arr) {
		return arr;
	}

	@Override
	public String toString() {
		return "QuickSort [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
