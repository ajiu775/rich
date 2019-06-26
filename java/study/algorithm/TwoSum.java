package study.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Description: Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * @Author: Mr.Xing
 * @Date: 2019/6/11/23:49
 */
public class TwoSum {
    public static void main(String[] args) {
        System.out.println("请分别输入一个数组以逗号分隔和输入一个目标值:");
        Scanner numSc = new Scanner(System.in);
        Scanner targetSc = new Scanner(System.in);
        String numString = numSc.nextLine();
        String[] numStrings = numString.split(",");
        int[] num = new int[numStrings.length];
        for (int i = 0; i < numStrings.length; i++) {
            num[i] = Integer.valueOf(numStrings[i]);
        }
        int target = targetSc.nextInt();
        int[] result = twoNum(num, target);
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < result.length; i++) {
            stringBuilder.append(result[i]).append(",");
        }
        String substring = stringBuilder.substring(0, stringBuilder.length() - 1);
        substring = substring + "]";
        System.out.println(substring);
    }

    public static int[] twoNum(int[] num, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int key = target - num[i];
            if (hashMap.containsKey(key)) {
                return new int[]{hashMap.get(key), i};
            }
            hashMap.put(num[i], i);
        }
        throw new IllegalArgumentException("No result");
    }
}