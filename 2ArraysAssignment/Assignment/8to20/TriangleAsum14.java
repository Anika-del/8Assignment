/*
:- void TriangleAsume(int x[][]); 
Answer :- prints a triangle using a 2D array of characters. We’ll assume that the input int represents the height of the triangle. 

 */

import java.util.Arrays;
    
 public class TriangleAsum14  {
        public static void main(String[] args) {
            int height = 5; // You can adjust the height as needed
            char[][] triangle = new char[height][2 * height - 1]; // Create a 2D array
    
            // Initialize the triangle with spaces
            for (int i = 0; i < height; i++) {
                Arrays.fill(triangle[i], ' ');
            }
    
            // Fill in the triangle with asterisks
            for (int row = 0; row < height; row++) {
                int stars = 1 + 2 * (row <= height / 2 ? row : height - 1 - row);
                int startCol = (2 * height - 1 - stars) / 2;
    
                for (int col = startCol; col < startCol + stars; col++) {
                    triangle[row][col] = '*';
                }
            }
    
            // Print the triangle
            for (int i = 0; i < height; i++) {
                System.out.println(new String(triangle[i]));
            }
        }
    }
    /*
    D:\8Assignment\2ArraysAssignment\Assignment\8to20>java TriangleAsum14
    *
   ***
  *****
   ***
    *
     */
