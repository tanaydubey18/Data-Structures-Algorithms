import java.util.*;

public class Practicejava {

    public static void main(String[] args) {
        int nums[] = {2,3,5,7,8,10};
        int arr[] = {3,4,6,9,10};

        List<Integer> list = new ArrayList<>();

        //Using the 2 - Pointer Approach in order to solve this Problem
        int first = 0;
        int second = 0;

        while (first < nums.length && second < arr.length) {
            //Checking the Duplication Cases
            if (first > 0 && nums[first] == nums[first-1]) {
                first++;
                continue;
            }
            else if (second > 0 && arr[second] == arr[second-1]) {
                second++;
                continue;
            }


            //Checking for the Out of Bound situdation or the Conditon
            if (first >= nums.length || second >= arr.length) {
                break;
            }

            //Checking for the 2-Pointer approach 
            if (nums[first] == arr[second]) {
                list.add(nums[first]);
                first++; second++;
            }
            else if (nums[first] < arr[second]) {
                first++;
            }else{
                second++;
            }
        }

        for (Integer elem : list) {
            System.out.println(elem + " ");
        }
    }
}