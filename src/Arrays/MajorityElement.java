public class MajorityElement {
    public int majorityElement(int[] nums) {
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
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("The majority element is: " + new MajorityElement().majorityElement(arr));
    }
}
