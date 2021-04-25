package com.leetcode;

public class ConsecutiveOneInArray {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] ==1){
                count+=1;
                if(count > 0 && count > maxCount){
                    maxCount = count;  
                }          
            } else {
                count = 0;
            }
        }
        System.out.println("Max consecutive 1's : "+maxCount);
        return maxCount;
    }
	public static void main(String[] args) {
		ConsecutiveOneInArray array= new ConsecutiveOneInArray();
		int[] a= {1,4,1,3,1,5,6,1};
		System.out.println(array.findMaxConsecutiveOnes(a));
	}

}
