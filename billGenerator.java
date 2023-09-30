// SIDDHANT VISHWAKARMA - SIDDHANTVISHWAKARMA5@GMAIL.COM

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

class billGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Create a new bill");
            System.out.println("2. View an existing bill");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1/2/3): ");

            int ch = sc.nextInt();
            sc.nextLine();

            billGenerator ob = new billGenerator();

            switch(ch) {
                case 1:
                    ob.createBill();
                    break;
                case 2:
                    ob.viewBill();
                    break;
                case 3:
                    System.out.println("Exiting Bill Generator Menu.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice Please choose 1, 2, or 3.");
            }
        }
    }

    void createBill() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy_HH-mm-ss");
        Date date = new Date();
        String fileName = dateFormat.format(date) + ".txt";
        String filePath = "generated-bill/" + fileName;

        try {
            File billFile = new File(filePath);
            billFile.getParentFile().mkdirs(); // checks if the "generated-bill" directory exists and creates it if not

            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(writer);

            System.out.println("Enter the order details (item name and price) and type 'done' to finish:");
            List<String> items = new ArrayList<>();
            double totalPrice = 0.0;

            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.print("Item name: ");
                String itemName = sc.nextLine();

                itemName = Character.toUpperCase(itemName.charAt(0)) + itemName.substring(1);

                if (itemName.equalsIgnoreCase("done")) {
                    break;
                }

                System.out.print("Price: Rs. ");
                double price = sc.nextDouble();
                sc.nextLine();

                items.add(itemName + ": Rs. " + price);
                totalPrice += price;
            }
            

            bw.write("Order Details:\n");
            for (String item : items) {
                bw.write(item + "\n");
            }
            bw.write("Total Amount: Rs. " + totalPrice);

            bw.close();
            System.out.println("Bill created successfully. Saved as '" + fileName + "' in 'generated-bill' directory.");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the bill.");
            e.printStackTrace();
        }
    }

    void viewBill() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date and time (MM-dd-yyyy_HH-mm-ss) of the bill you want to view: ");
        String billDateTime = sc.nextLine();
        String filePath = "generated-bill/" + billDateTime + ".txt";

        try {
            File billFile = new File(filePath);
            if (billFile.exists()) {
                FileReader reader = new FileReader(filePath);
                BufferedReader br = new BufferedReader(reader);

                System.out.println("\nBill Details:");
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                
                br.close();
            } else {
                System.out.println("Bill not found.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while viewing the bill.");
            e.printStackTrace();
        }
    }
}
