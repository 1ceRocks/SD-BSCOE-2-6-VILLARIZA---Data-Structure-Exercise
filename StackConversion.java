import java.util.Scanner;

public class StackConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a set of number N to be converted: ");
        int num =  scanner.nextInt();
        String[] binary = new String[num];
        
        for (int i = 0; i < num; i++) {
            System.out.print("Enter a binary number (" + i + "): ");
            binary[i] = scanner.next();
        }

        for (int i = 0; i < num; i++){
            int decimal = binaryToDecimal(binary[i]);
            System.out.println("Converted binary (" + i + "): " + decimal);
        }
    }

    private static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }
}