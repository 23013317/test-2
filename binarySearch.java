
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isyyo
 */
public class binarySearch {

    
    
    
    public static int findProductIndex(int productIDs[], int targetID) {
        int down = 0;
        int up = productIDs.length - 1;

        while (down <= up) {
            int mid = (down + up) / 2;

            if (productIDs[mid] == targetID) {
                return mid;
            }

            if (productIDs[down] <= productIDs[mid]) {
                if (targetID >= productIDs[down] && targetID < productIDs[mid]) {
                    up = mid - 1;
                } else {
                    down = mid + 1;
                }
            } else {
                if (targetID > productIDs[mid] && targetID <= productIDs[up]) {
                    down = mid + 1;
                } else {
                    up = mid - 1;
                }
            }
        }

        return -1;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int[] productIDs = {104, 105, 106, 107, 101, 102, 103};

        System.out.print("Enter the product ID to search for: ");
        int targetID = input.nextInt();

        int index = findProductIndex(productIDs, targetID);

        if (index != -1) {
            System.out.println("Product found at index: " + index);
        } else {
            System.out.println("Product not found.");
        }

        input.close();
    }
    
}
