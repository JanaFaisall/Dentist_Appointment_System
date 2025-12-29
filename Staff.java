public abstract class Staff extends Person {

    private int Salary;
    protected static final int WORKING_HOURS = 12;
    protected static int countStaff = 0;

    public Staff(String FirstName, String LastName, int Id, int Age, Date BirthDate, char Gender, int Salary) {
        super(FirstName, LastName, Id, Age, BirthDate, Gender);
        this.Salary = Salary;
        countStaff++;
    }

    public Staff() {
        this(null, null, 0, 0, null, ' ', 0);
    }

    public static int getCountStaff() {
        return countStaff;
    }

    public static void setCountStaff(int countStaff) {
        Staff.countStaff = countStaff;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public static int getWORKING_HOURS() {
        return WORKING_HOURS;
    }

    @Override
    public String toString() {
        return super.toString() + "Salary: " + Salary;
    }

    public abstract double calcSalary(int workingHours);
}
