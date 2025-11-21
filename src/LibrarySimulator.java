import java.util.Scanner;

public class LibrarySimulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Member user1 = new Member(3343, "Khalid", 0);
        Member user2 = new Member(8979, "Nasser", 0);
        Member user3 = new Member(2709, "Abdullah", 0);
        boolean Runing = true;
        do {

            int mainMenuChoiceNum;
            int subMenuChoiceNum;
            System.out.println("---- Welcome To The library ----");
            System.out.printf("\t 1. %s-%d %n", user1.getName(), user1.getId());
            System.out.printf("\t 2. %s-%d %n", user2.getName(), user2.getId());
            System.out.printf("\t 3. %s-%d %n", user3.getName(), user3.getId());
            System.out.printf("\t 4. Administrator %n");
            System.out.printf("\t 5. Exit %n %n");
            System.out.print("Enter Your Choice : ");
            mainMenuChoiceNum = input.nextInt();

            Member currentMember = new Member(0000, "", 0);
            switch (mainMenuChoiceNum) {
                case 1:
                case 2:
                case 3:
                    if (mainMenuChoiceNum == 1) {
                        currentMember = user1;
                    } else if (mainMenuChoiceNum == 2) {
                        currentMember = user2;
                    } else if (mainMenuChoiceNum == 3) {
                        currentMember = user3;
                    }
                    else{}
                    boolean userActive = true;
                    do {
                    System.out.printf("%n-----------------------------%n \t    Welcome %s %n-----------------------------%n",currentMember.getName());
                    System.out.println("1.Borrow a Book");
                    System.out.println("2.View Borrowed Books");
                    System.out.println("3.Return Book");
                    System.out.println("4.View Session Summary");
                    System.out.printf("5.Exit to Main Menu: %n%n");
                    System.out.print("Enter Your Choice : ");
                    subMenuChoiceNum = input.nextInt();
                    switch (subMenuChoiceNum) {
                        case 1 -> {
                            currentMember.borrowOne();
                        }
                        case 2 -> {
                            currentMember.viewBorrowedCount();
                        }
                        case 3 -> {
                            currentMember.returnOne();
                        }
                        case 4 -> {
                            currentMember.displayStatistics();
                        }
                        case 5 -> {
                            userActive = false;
                        }
                    }
                    }while (userActive);
                    break;
                case 4 :{
                    //Admin Menu
                    break;}
                case 5:{
                    Runing = false;
                }
            }

        }while (Runing);

    }
}
