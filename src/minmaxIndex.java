import java.util.HashMap;

public class minmaxIndex {
    //Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        System.out.print(map);
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        minmaxIndex o = new minmaxIndex();
        int[] nums = new int[5];
        nums[0] = -1;
        nums[1] = -2;
        nums[2] = -3;
        nums[3] = -4;
        nums[4] = -5;
        int target = -8;
        int[] a = twoSum(nums, target);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

}
