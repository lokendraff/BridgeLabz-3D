package arrayslevel2;

import java.util.Scanner;

class FriendComparator {
    public static void main(String[] args) {
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i] + ":");
            System.out.print("Enter age: ");
            ages[i] = input.nextInt();
            System.out.print("Enter height: ");
            heights[i] = input.nextDouble();
        }

        int youngestAge = ages[0];
        String youngestFriendName = names[0];
        double tallestHeight = heights[0];
        String tallestFriendName = names[0];

        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriendName = names[i];
            }
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriendName = names[i];
            }
        }

        System.out.println("\nComparison Result -> ");
        System.out.println("The youngest friend is: " + youngestFriendName);
        System.out.println("The tallest friend is: " + tallestFriendName);
        
        input.close();
    }
}
