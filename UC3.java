import java.util.Scanner;

/**
 * TicTacToe
 * UC3 reads a slot number (1–9)
 * entered by the user.
 */
public class UC3 {

    static Scanner scanner = new Scanner(System.in);

    /*
     * Entry point of the program.
     * Reads slot input and prints it back
     * to verify correct user input handling.
     */
    public static void main(String[] args) {

        int slot = getUserSlot();

        System.out.println("Slot entered: " + slot);
    }

    /*
     * Reads an integer slot value from the user.
     * Input: Scanner object
     * Output: Slot number (1–9)
     */
    static int getUserSlot() {

        System.out.print("Enter slot number (1-9): ");

        int slot = scanner.nextInt();

        return slot;
    }
}