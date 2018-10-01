import java.util.Scanner;

public class InsertVAlue {
    public static void main(String[] args) {
        int x, index;
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("Insert value to the array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "]= ");
            a[i] = scanner.nextInt();
        }
        System.out.println("Enter value to insert:  ");
        x = scanner.nextInt();
        System.out.println("Insert index of the value: ");
        index = scanner.nextInt();
        if (index < 0 || index >= a.length) {
            System.out.println("Invalid index!");
        }
        a[index] = x;
        System.out.println("Araay after Insert: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }


    }
}
