public class ArraysMethods{

	//****************************evenOdd****************************
 
	public static void evenOdd(int[] array){
	//Variable initialization 
	int nextEven = 0, nextOdd = array.length - 1;
	
	//A while loop traversing the whole array 
	while(nextEven < nextOdd){
		//If the lower indicator has an even number, the indicator is incremented 
		if(array[nextEven] % 2 == 0){
			nextEven++;
		//Otherwise, the odd number is placed in a temporary variable and replaced 
		}else{
			int temp = array[nextEven];
			array[nextEven] = array[nextOdd];
			array[nextOdd--] = temp;
		}
	}
	/*
	-------------------------SUMMARY---------------------------
	Time Complexity: O(n)
	Space Complexity: O(1)
	-------------------------INSIGHTS---------------------------
	Array traversal can be done in O(1) space complexity 
	*/


	//****************************DUTCH NATIONAL FLAG PROBLEM****************************
	/*
	-------------------------DESCRIPTION---------------------------
	Write a program that takes an array A and index i into A and rearranges the elements such that 
	all elements less than A[i] (the pivot) appears first, followed by elements equal to the pivot, 
	followed by elements greater than the pivot
	*/

	public static void dutchFlagPartition(int pivotIndex, List<Integer> list){
		int pivot = list.get(pivotIndex);
		for(int i = 0; i < list.size(); i++){
			//Look for a smaller element 
			for(int j = i + 1; j < list.size(); j++){
				if(list.get(j) < pivot){
					Collections.swap(list, i, j);
					break;
				}
			}		
		}
			
		//Second Pass
		for(int i = list.size() - 1; i >= 0 && list.get(i) >= pivot; i--){
			for(int i = j - 1; j >= 0 && list.get(i) >= pivot; j--){
				if(list.get(i) > pivot){
					Collections.swap(list, i, j);
					break; 
				}
			}
		}
		


	}

	/*
	-------------------------SUMMARY---------------------------
	Time Complexity: O(n*n)
	Space Complexity: O(1)
	-------------------------INSIGHTS---------------------------
	Optimized space complexity for swapping 
	*/
	
	/*
	-------------------------DESCRIPTION---------------------------
	This is a time-complexity optimized solution for the dutchFlagPartition problem 
	*/

	public static void dutchFlagPartitionOptimized(int pivotIndex, List<Integer> list){
		int pivot = list.get(pivotIndex);
		int smaller = 0;
	
		for(int i = 0; i < list.size(); i++){
			if(list.get(i) < pivot){
				Collections.swap(list, smaller++, i);
			}
		}
			
		//Does NOT reset the lower tracker 
		//Second Pass: group elements larger than pivot 
		int larger = list.size() - 1;
		for(int i = list.size() - 1; i >= 0 && list.get(i) >= pivot; i--){
			if(list.get(i) > pivot){
				Collections.swap(list, larger--, i);
			}
		}
	}

	/*
	-------------------------SUMMARY---------------------------
	Time Complexity: O(n)
	Space Complexity: O(1)
	-------------------------INSIGHTS---------------------------
	Optimized space and time complexity for swapping elements  
	*/

	/*
	-------------------------DESCRIPTION---------------------------
	This is a highly space and time optimized solution to the dutch national flag problem 
	*/

	public static void dutchFlagPartitionHighlyOptimized(int pivotIndex, List<Integer> list){
		int pivot = list.get(pivotIndex);
		int smaller = 0, equal = 0, larger = list.size();
		
		while(equal < larger){
			if(list.get(equal) < pivot){
				Collections.swap(list, smaller++, equal++);
			}else if(list.get(equal) == pivot){
				equal++;
			}else{
				Collections.swap(list, equal, larger--);
			}
		}
	}
	
	/*
	-------------------------SUMMARY---------------------------
	Time Complexity: O(n)
	Space Complexity: O(1)
	-------------------------INSIGHTS---------------------------
	Highly optimized space and time complexity for swapping elements  
	*/
	
	
	//****************************Multiply****************************
	
}







