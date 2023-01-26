/*
Name: Kennedy Keyes
Date: November 1, 2021
Program: ClassList.java
Description: This will create an array that will print all of the student's 
names given on the list.
 */
package pkgclass.list;

/**
 *
 * @author codingken
 */
public class ClassList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declare an array
        String[][] students = new String[5][5];
        
        // Row 0
        students[0][0] = "Jessica";
        students[0][1] = "Denise";
        students[0][2] = "Andrew";
        students[0][3] = "Jayla";
        students[0][4] = "Emelio";
        
        // Row 1
        students[1][0] = "Cameron";
        students[1][1] = "Sidney";
        students[1][2] = "Nico";
        students[1][3] = "Parker";
        students[1][4] = "Elliot";
        
        // Row 2
        students[2][0] = "Tina";
        students[2][1] = "Kennedy";
        students[2][2] = "Steve";
        students[2][3] = "Braylen";
        students[2][4] = "Ian";
        
        // Row 3
        students[3][0] = "Lauryn";
        students[3][1] = "Christa";
        students[3][2] = "Arie";
        students[3][3] = "Madisyn";
        students[3][4] = "Frankie";
        
        // Row 4
        students[4][0] = "Leah";
        students[4][1] = "Joshua";
        students[4][2] = "Tyler";
        students[4][3] = "Savannah";
        students[4][4] = "Haleigh";
        
        // Create for loop to display the array
        int rows = 5;
        int seats = 5;
        int a;
        int b;
        System.out.println("Class List:");
        System.out.println("---------------------------------"
                + "-------------------------------------------");
        for (a = 0; a < rows; a++)
        {
            for (b = 0; b < seats; b++)
            {
                System.out.print(students[a][b] + "          ");
            }
            System.out.println("");
        }
        
        System.out.println();
        System.out.println("The student in row 1 seat 1 is: "+ students[1][1]);
        System.out.println("The student in row 2 seat 4 is: "+ students[2][4]);
        System.out.println("The student in row 3 seat 3 is: "+ students[3][3]);
        System.out.println("The student in row 0 seat 0 is: "+ students[0][0]);
    }
    
}
