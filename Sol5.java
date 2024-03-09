import java.util.Scanner;

public class Sol5 {
    double posAvg = 0, negAvg = 0;
    double posCount = 0, negCount = 0;

    public void avg(int arr[]) {
        //write your code here
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                posAvg += arr[i];
                posCount++;
            } else if (arr[i] < 0) {
                negAvg += arr[i];
                negCount++;
            }
        }
        if (posCount > 0)
            posAvg /= posCount;
        if (negCount > 0)
            negAvg /= negCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sol5 obj = new Sol5();
        int length = scanner.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        obj.avg(arr);
        System.out.println(obj.posAvg);
        System.out.println(obj.negAvg);
        scanner.close(); // Close the scanner to avoid resource leak
    }
}
