package com.java.krish.tap.two;

import java.util.stream.IntStream;

/*
 *  Count the maximum length of consecutive 1's in the binary representation of N
	Input : N=14 (integer)
	Output : 3
	Explanation : Binary representation of 14=1110... There are 3 consecutive 1's
 */
public class BinaryConsecutivesOfOne {

	public static void main(String[] args) {
		System.out.println(binaryConsecutivesOfOne(1));
		System.out.println(binaryConsecutivesOfOne(14));
		System.out.println(binaryConsecutivesOfOne(-114));
		System.out.println(binaryConsecutivesOfOne1(14));
		System.out.println(binaryConsecutivesOfOne1(509));
	}
	
	public static int binaryConsecutivesOfOne(int decimalNumber) {
		if (decimalNumber == 0) {
            return 0;
        }
		
		String binaryString = Integer.toBinaryString(decimalNumber);
		System.out.println("Binary string: " + binaryString);
		int maxConsecutiveOnes = 0;
        int currentConsecutiveOnes = 0;
		for (char ch : binaryString.toCharArray()) {
			if (ch == '1') {
				currentConsecutiveOnes++;
				maxConsecutiveOnes = Math.max(currentConsecutiveOnes, maxConsecutiveOnes);
			} else {
				currentConsecutiveOnes = 0;
			}
		}
		
		return maxConsecutiveOnes;
	}
	
	public static int binaryConsecutivesOfOne1(int decimalNumber) {
		if (decimalNumber == 0) {
            return 0;
        }

        StringBuilder binaryString = new StringBuilder();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryString.insert(0, remainder);
            decimalNumber /= 2;
        }

        String str = String.valueOf(binaryString);
        System.out.println("Binary string: " + str);
        return IntStream.range(0, str.length())
                .filter(i -> str.charAt(i) == '1')
                .map(i -> {
                    int count = 1;
                    while (i + 1 < str.length() && str.charAt(i + 1) == '1') {
                        count++;
                        i++;
                    }
                    return count;
                })
                .max()
                .orElse(0);
	}

}
