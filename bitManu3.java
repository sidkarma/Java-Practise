public class bitManu3 {
    public static void main(String args[]) {
        int n=5;
        int pos = 2;
        int bitMask=1<<pos;
        int notBitMask = ~(bitMask);

        int newNum = notBitMask & n;
        System.out.println(newNum);
    }
}
// public class bitManu3 {

//     public static void main(String[] args) {
//         int decimalNumber = 5;  // Sample decimal number

//         // Convert decimalNumber to binary string
//         String binaryString = Integer.toBinaryString(decimalNumber);

//         // Print the binary representation
//         System.out.println("Binary representation of " + decimalNumber + " is: " + binaryString);
//     }
// }
