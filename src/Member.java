public class Member {
    //The Attributes
    private int id;
    private String name;
    private int borrowedCount;
    private int numViewBorrowed;
    private int numBorrows;
    private int numReturns;
    private double sessionFees;

    public double TotalRevenue;
    public int TotalViewBorrowed;
    public int TotalBorrows;
    public int TotalReturns;

    public void Member (int id,String name,int borrowedCount){
        this.id = id;
        this.name = name;
        this.borrowedCount = borrowedCount;
    }




}
