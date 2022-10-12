import java.util.*;

//We are given n towers with n disks with descending order of diameter from
//top to bottom which are placed in the first tower.
//We need to perform actions maintaining the rule that disk with larger radius
//will be at the bottom
//At the end we need all the disks in the same order in the last Tower.

//Time Complexity - O(2^n);
//Space Complexity - O(2^n);
public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        hanoiTower(n, "A", "B", "C");
    }

    public static void hanoiTower(int n, String a, String b, String c) {
        if (n == 1) {
            System.out.println(" Shift disk " + n + " from " + a + " to " + c);
            return;
        } 
        //We first shift n-1 disks from Tower A to B
        hanoiTower(n-1, a, c, b);
        // Then shift the last disk from Tower A to C
        System.out.println(" Shift disk " + n + " from " + a + " to " + c);
        // Then shift the n-1 disks from Tower B to C
        hanoiTower(n-1, b, a, c);
    }
}
