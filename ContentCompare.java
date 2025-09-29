//== points to objects in memory
//.equals() checks if both have same content

import java.util.*;
import java.util.stream.Collectors;

class ContainsDuplicate {
    public static boolean hasDuplicate(int[] nums) {
        List<Integer> dl = Arrays.stream(nums).boxed().collect(Collectors.toList());

        Set<Integer> dup = new TreeSet<>(Comparator.naturalOrder());
        for (int elem : nums) {
            dup.add(elem);
        }
        if (dup.toString().equals(dl.toString())) {//used here
            return false;
        } else {
            System.out.println(dl.toString() + " " + dup.toString());
            return true;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        if (hasDuplicate(arr)) {
            System.out.println("Contains duplicate");
        } else {
            System.out.println("Doesn't contain duplicate");
        }
    }

}
