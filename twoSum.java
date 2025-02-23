import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Integer number = hashmap.get(nums[i]);
            if(number != null ){
                return new int[]{i,number};
            }
            hashmap.put(target-nums[i], i);
        }
        return nums;
    }

}
