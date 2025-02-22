public class findDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(new findDuplicateNumber().findDuplicate(nums));
    }

    public int findDuplicate(int[] nums) {
        int slow=0,fast=0;
        while(true){
            slow=nums[slow];
            fast = nums[nums[fast]];
            if(slow==fast){
                break;
            }
        }
        int slow2=0;
        while(true){
            slow=nums[slow];
            slow2=nums[slow2];
            if(slow==slow2){
                break;
            }
        }
        return slow;
    }

}
