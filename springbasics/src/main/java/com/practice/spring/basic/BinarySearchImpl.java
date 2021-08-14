package com.practice.spring.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //Component use it for Bean
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	@Autowired // Inject Dependency 
	@Qualifier("bubble")
	SortingAlgorithm sortingAlgo;
	
	public int binarySearch(int []numbers, int key) {
		
		//Sort Array
		System.out.println(sortingAlgo);
		sortingAlgo.sort(numbers);
		
		//Check low + high /2 == key return else check if key > mid search right side else search key left side
		//Repeat until found
		int low = 0;
		int high = numbers.length - 1;
	
		
		while(low <= high) {
			int mid = (low + high) / 2;
			if(key == numbers[mid]) {
				return mid;
			}
			else if(key > numbers[mid]) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
			
		}
		return -1;
	}

}
