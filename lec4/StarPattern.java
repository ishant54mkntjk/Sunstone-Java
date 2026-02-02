package lec4;

public class StarPattern {
    public static void main(String[] args) {
        int n = 7; // The size of the grid (number of rows and columns)
        int center = n / 2; // Calculate the center index (3 for a 7x7 grid)

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Logic: Calculate distance from the center
                // If the sum of vertical and horizontal distance is >= center, print *
                if (Math.abs(i - center) + Math.abs(j - center) >= center) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Print 2 spaces to maintain alignment
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}