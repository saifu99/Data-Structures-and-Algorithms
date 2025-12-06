public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int count=0, candidate=0;

        for (int i=0; i<nums.length; i++) {
            int number = nums[i];
            if (count == 0) {
                candidate = number;
            }
            if (number == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }
}
