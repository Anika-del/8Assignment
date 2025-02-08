public class TriangleDrawer15 {
    public static void main(String[] args) {
        int height = 5; // Adjust the height of the triangle as needed
        char[][] triangle = new char[height][2 * height - 1];

        // Initialize the triangle with spaces
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2 * height - 1; j++) {
                triangle[i][j] = ' ';
            }
        }

        // Fill in the triangle with asterisks
        for (int row = 0; row < height; row++) {
            int start = height - row - 1;
            int end = height + row;
            for (int col = start; col <= end; col++) {
                triangle[row][col] = '*';
            }
        }

        // Print the triangle
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2 * height - 1; j++) {
                System.out.print(triangle[i][j]);
            }
            System.out.println();
        }
    }
}