public class Member {
    //The Attributes
    private int id;
    private String name;
    private int borrowedCount;
    private int numViewBorrowed;
    private int numBorrows;
    private int numReturns;
    private double sessionFees;
    // thees are static because its common foe multiple users
    public static double TotalRevenue;
    public static int TotalViewBorrowed;
    public static int TotalBorrows;
    public static int TotalReturns;

    //Constructor
    public Member (int id,String name,int borrowedCount){
        this.id = id;
        this.name = name;
        this.borrowedCount = borrowedCount;
    }

    // Methods
    private boolean canBorrow(){
        if (borrowedCount>=5){
            return false;
        }
        else{
            return true;
        }
    }
    private boolean canReturn(){
        if (borrowedCount == 0){
            return false;
        }
        else
            return true;
    }

    public void viewBorrowedCount(){
        numViewBorrowed++;
        TotalViewBorrowed++;
        System.out.println("The Number Of Borrowed Book: " + borrowedCount);
    }

    public boolean borrowOne (){
        if (canBorrow()){
            borrowedCount++;
            numBorrows ++;
            sessionFees += 0.5;
            TotalRevenue += 0.5;
            TotalBorrows ++;
            System.out.printf("You have borrowed Book!");
            return true;
        }
        else {
            System.out.printf("You have 5 books borrowed %nYou Can not borrow more Books!");
            return false;
        }

    }

    public boolean returnOne(){
        if (canReturn()){
            borrowedCount--;
            numReturns++;
            TotalReturns++;
            System.out.printf("%nYou have Returned Book!");
            return true;
        }
        else{
            System.out.printf("%n You have No Books to Return");
            return false;
        }

    }

    public void displayStatistics(){
        System.out.println("the number of times the operation View borrowed books count was use :"+numViewBorrowed);
        System.out.println("the number of times the operation Borrow book was used : " + numBorrows);
        System.out.println("the number of times the operation Return book was used: " + numReturns);
        System.out.println("the total amount of fees that incurred during the session is : "+ sessionFees);
    }

    public void reset() {
        numViewBorrowed =0;
        numBorrows = 0;
        numReturns = 0;
        sessionFees = 0;
    }
    // Getters & Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBorrowedCount() {
        return borrowedCount;
    }

    public void setName(String name) {
        this.name = name;
    }
}
