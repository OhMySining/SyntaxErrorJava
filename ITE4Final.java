import java.util.Scanner;

public class ITE4Final {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to my fashion boutique!");

        String Categories[] = {"Men's Clothes", "Women's Clothes", "Accessories"};
        String MensChoice[] = {"Shirts", "Jeans", "Jacket", "T-shirts"};
        String WomensChoice[] = {"Blouse", "Skirts", "Dresses", "Tops"};
        String AccessoriesChoice[] = {"Belts", "Hats", "Sunglasses", "Watches"};

        double MensClothesPrice[] = {1300, 2500, 3800, 1200};
        double WomensClothesPrice[] = {1600,1800, 5000, 1500};
        double AccessoriesPrice[] = {580, 800, 1400, 2500};

        int[] MensClothesCount = new int[4];
        int[] WomensClothesCount = new int[4];
        int[] AccessoriesCount = new int[4];

        String[] MensSize = new String[4];
        String[] WomensSize = new String[4];

        System.out.println("\nWe have various categries such as: ");
        String decision2;
        do {
            System.out.println("");
            for (int i = 0; i < 3; i++) {
                System.out.println((i + 1) + ". " + Categories[i]);
            }

            System.out.print("\nEnter your choice: ");
            String choice = sc.next();

            switch (choice){
                case "1":
                System.out.println("\nYou have chosen Men's Categories. Here we have: ");
                String decision;
                do { 
                    System.out.println("");
                    for (int i = 0; i < 4; i++) {
                        System.out.println((i + 1) + ". " + MensChoice[i] + " : P" + MensClothesPrice[i]);
                    }
                    System.out.print("\nEnter your choice: ");
                    int MensPick = sc.nextInt() - 1;

                    System.out.print("\nYou have chosen " + MensChoice[MensPick] + " with a price: P" + MensClothesPrice[MensPick] + " How many would you like? ");
                    MensClothesCount[MensPick] = sc.nextInt();

                    System.out.print("\nChoose a size (S- Small, M- Medium, L- Large): ");
                    MensSize[MensPick] = sc.next();

                    System.out.print("\nDo you want another purchase in this category? ");
                    decision = sc.next();
                } while (decision.equalsIgnoreCase("Yes"));
                break;
                case "2":
                System.out.print("\nYou have chosen Women's Categories. Here we have: ");
                do{
                    System.out.println("");
                    for (int i = 0; i < 4; i++) {
                        System.out.println((i + 1) + ". " + WomensChoice[i] + " : P" + WomensClothesPrice[i]);
                    }
                    System.out.print("\nEnter your choice: ");
                    int WomensPick = sc.nextInt() - 1;

                    System.out.print("\nYou have chosen " + WomensChoice[WomensPick] + " with the price: P" + WomensClothesPrice[WomensPick] + " How many would you like? ");
                    WomensClothesCount[WomensPick] = sc.nextInt();

                    System.out.print("\nChoose a size (S- Small, M- Medium, L- Large): ");
                    WomensSize[WomensPick] = sc.next();

                    System.out.print("\nDo you want another purchase in this category? ");
                    decision = sc.next();
                } while (decision.equalsIgnoreCase("Yes"));
                break;
                case "3":
                System.out.println("\nYou have chosen Accessories. Here we have: ");
                do { 
                    System.out.println("");
                    for (int i = 0; i < 4; i++) {
                        System.out.println((i + 1) + ". " + AccessoriesChoice[i] + " : P" + AccessoriesPrice[i]);
                    }
                    System.out.print("\nEnter your choice: ");
                    int AccessoriesPick = sc.nextInt() - 1;

                    System.out.print("\nYou have chosen " + AccessoriesChoice[AccessoriesPick] + " with the price: P" + AccessoriesPrice[AccessoriesPick] + " How many would you like? ");
                    AccessoriesCount[AccessoriesPick] = sc.nextInt();

                    System.out.print("\nDo you want another purchase in this category? ");
                    decision = sc.next();
                } while (decision.equalsIgnoreCase("Yes"));
                break;          
            } 
            System.out.print("\nDo you want to browse another category? ");
            decision2 = sc.next();
        } while (decision2.equalsIgnoreCase("Yes"));

        System.out.println("\nPrinting the receipt. \n");

        for (int x = 0; x < 4;){
            if (MensClothesCount[x] > 1){
                double MensTotalPrice = MensClothesPrice[x] * MensClothesCount[x];
                System.out.println(MensChoice[x] + " - " + MensSize[x] + " : " + MensClothesPrice[x] + " * " + MensClothesCount[x] + " = P" + MensTotalPrice);
            }
            if (WomensClothesCount[x] > 1){
                double WomensTotalPrice = WomensClothesPrice[x] * WomensClothesCount[x];
                System.out.println(WomensChoice[x] + " - " + WomensSize[x] + " : " + WomensClothesPrice[x] + " * " + WomensClothesCount[x] + " = P" + WomensTotalPrice);
            }
            if (AccessoriesCount[x] > 1){
                double AccessoriesTotalPrice = AccessoriesPrice[x] * AccessoriesCount[x];
                System.out.println(AccessoriesChoice[x] + " : " + AccessoriesPrice[x] + " * " + AccessoriesCount[x] + " = P" + AccessoriesTotalPrice);
            }
            x++;
        }
        System.err.println("\nThank you for shopping with us!");
    }
}
