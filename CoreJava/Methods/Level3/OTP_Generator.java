package Methods.Level3;

import java.util.HashSet;

public class OTP_Generator {
	public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }
    public static void main(String[] args) {
        int totalOTPs = 10;
        int[] otps = new int[totalOTPs];
        HashSet<Integer> uniqueOTPs = new HashSet<>();
        System.out.println("Generated OTPs:");
        for (int i = 0; i < totalOTPs; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
            uniqueOTPs.add(otps[i]); 
        }
        if (uniqueOTPs.size() == 1) {
            System.out.println("All OTPs are same (Not Unique)");
        } else {
            System.out.println("Validation Passed  (OTPs are not all same)");
        }
    }

}
