
import java.util.Scanner;

public class LibrarySimulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Member user1 = new Member(3343, "Khalid", 0);
        Member user2 = new Member(8979, "Nasser", 0);
        Member user3 = new Member(2709, "Abdullah", 0);
        boolean Running = true;
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
                    final String adminUsername = "admin" , adminPassword = "123";

                    System.out.print("Enter the username: ");				// Asking for Username and Password
                    String username = input.next();
                    System.out.print("Enter the password: ");
                    String password = input.next();
                    if(username.equals(adminUsername) && password.equals(adminPassword)  ) {
                        do {
                            System.out.println("-------- Welcome Admin --------");
                            System.out.println("1. View Total Revenue");
                            System.out.println("2. Most Frequent Operation");
                            System.out.println("3. Exit To Main Menu");
                            subMenuChoiceNum = input.nextInt();

                            switch(subMenuChoiceNum) {
                                case 1 -> {System.out.println(" Total Revenue is: " + Member.TotalRevenue); }  //Total Revenue
                                case 2 -> {if (Member.TotalBorrows > Member.TotalReturns) { 				   //Most Frequent Operation
                                    System.out.println("The total of borrwed Books "+ Member.TotalBorrows +" Is Greater Than The total returned books "+ Member.TotalReturns );}
                                else if(Member.TotalBorrows == Member.TotalReturns) {
                                    System.out.println("The total of borrwed Books "+ Member.TotalBorrows +" Is Equal To The total returned books "+ Member.TotalReturns );
                                }
                                else {
                                    System.out.println("The total of borrwed Books "+ Member.TotalBorrows +" Is Less Than The total returned books "+ Member.TotalReturns );}

                                }
                            }
                        }while(subMenuChoiceNum != 3);

                    }
                    else {
                        System.out.println("The Username or Password is incorrect! ");
                    }


                    break;}
                case 5:{
                    Running = false;
                }
            }
        }while (Running);
    }
}