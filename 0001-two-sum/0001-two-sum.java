class Solution {
    public int[] twoSum(int[] nums, int target) {
        /* Brute Force Approach */

        // for(int i =0;i<nums.length;i++){
        //     for(int j =i+1;j<nums.length;j++){
        //         if(target == nums[i]+nums[j]){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{-1,1};

        /* Using HashMap */


        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[]{i,map.get(diff)};
            }

            map.put(nums[i],i);

            

        }
        return null;




    }
}