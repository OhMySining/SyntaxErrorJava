import java.util.Scanner;

public class TaskCheckList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nAdd and navigate your task with this program.");

        String Tasks[] = new String[5];
        
        String MainLoop;
        do { 
            System.out.print("\nWhat action do you want to do? \n\n1. Add new task \n2. View Tasks \n3. Manage Tasks \n\nEnter your choice here: ");
            String ActionDecision = sc.next();

            switch (ActionDecision){
                case "1":
                String LoopDec;
                do { 
                    System.out.println("\nWhat number you want to add a task? (1-4 (A number that has a task will be overlap with the new one))");
                    System.out.print("\nYour choice: ");
                    int NumAdd = sc.nextInt();
                    if (NumAdd >= 1){
                        System.out.print("\nAdd task here: ");
                        Tasks[NumAdd - 1] = sc.next();
                    }
                    System.out.print("\nAdd more task(s)? ");
                    LoopDec = sc.next();
                } while (LoopDec.equalsIgnoreCase("Yes"));
                break;
                case "2":
                System.out.println("\nHere are your current tasks: ");
                System.out.println("");
                for (int x = 0; x < Tasks.length; x++){
                    System.out.println((x + 1) + ". " + Tasks[x]);
                }
                break;
                case "3":
                System.out.print("\nPick an action: \n1. Mark a task done \n2. Delete a task \nEnter your choice here: ");
                int ManDec = sc.nextInt();
                String ManDecYN, DelDecYN;
                if (ManDec == 1){
                    do { 
                        System.out.println("\nWhat task you want to mark as done? ");
                        int DoneDec = sc.nextInt();
                        if (DoneDec >= 1){
                            Tasks[DoneDec - 1] = Tasks[DoneDec - 1] + " - Done";
                        }
                        System.out.println("\nMark another task as done? ");
                        ManDecYN = sc.next();
                    } while (ManDecYN.equalsIgnoreCase("Yes"));
                }
                if (ManDec == 2){
                    do { 
                        System.out.println("\nWhat task you want to delete? ");
                        int DelDec = sc.nextInt();
                        if (DelDec >= 1){
                            Tasks[DelDec] = "";
                        }
                    System.out.println("\nDelete another task? ");
                    DelDecYN = sc.next();
                    } while (DelDecYN.equalsIgnoreCase("Yes"));
                }
                break;
            } 
            System.out.print("\nGo back to main menu? "); 
            MainLoop = sc.next();
        } while (MainLoop.equalsIgnoreCase("Yes"));  
    }
}
