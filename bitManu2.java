public class bitManu2 {
    public static void main(String args[]) {
        int n=5;
        int pos = 1;
        int bitMask = 1<<pos;
        int newNum = bitMask | n;
        System.out.println(newNum);
    } 
}
// public class bitManu2 {

//     public static void printBits(int decimalNumber) {
//         int bitsCount = 32;  // Assuming 32-bit integers

//         for (int i = bitsCount - 1; i >= 0; i--) {
//             int bit = (decimalNumber >> i) & 1;
//             System.out.print(bit);
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int decimalNumber = 256;  // Sample decimal number
//         System.out.print("Binary representation of " + decimalNumber + " is: ");
//         printBits(decimalNumber);
//     }
// }
