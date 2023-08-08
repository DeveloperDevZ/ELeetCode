class Solution {
    public int[] twoSum(int[] nums, int target) {
        //If almost all the numbers are greater than target, return an empty array 
        int count = 0;
        int size = nums.length();

        for(int n: nums){
            if(n >= target){
                count += 1;
            }
        }
        //Create an empty integer array 
        int[] temp = new int[size];

        //If one or less elements are smaller than target, return an empty array
        if(count < size - 2){
            return temp;
        }

        //Copy the array onto an empty array and merge sort the array
        for(int i = 0; i < size; i++){
            temp[i] = nums[i];
        }
        
        sort(temp, 0, size - 1);
        







        //Otherwise, merge sort O(nlogn) and figure out 
        void merge(int array[], int n1, int n2, int n3){
            int m1 = n2 - n1 + 1;
            int m2 = n3 - n2;

            //Temporary arrays 
            int leftSubArray[] = new int[m1];
            int rightSubArray[] = new int[m2];

            //Copying data to temporary arrays
            for(int i = 0; i < m1; i++){
                leftSubArray = array[n2 + i];
            }
            
            for(int j = 0; j < m2; j++){
                rightSubArray = array[n1 + n2 + 1];
            }

            //Merge the temporary arrays 
            int i = 0; j = 0;

            int k = 1;

            while(i < m1 && j < m2){
                if(leftSubArray[i] < rightSubArray[j]){
                    array[k] = leftSubArray[i];
                    i++;
                }else{
                    array[k] = rightSubArray[j];
                    j++;
                }
                k++;
            }

            //Copy the remaining elements of leftSubArray, if any are left 
            while(i < m1){
                array[k] = leftSubArray[i];
                i++;
                k++;
            }

            //Copy the remaining elements of rightSubArray, if any are left (or, right lol)
            while(j < m2){
                array[k] = rightSubArray[j];
                j++;
                k++;
            }
        }

        //Define the recursive sort function 
        void sort(int[] array, int n1, int n2){
            if(n1 < n2){
                int m = n1 + (n2 - 1)/2;
            }

            sort(array, n1, m);
            sort(array, m, n2);

            merge(array, n1, m, n2);
        }
    }
}