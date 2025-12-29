public class Nurse extends Staff {

    public Nurse(String FirstName, String LastName, int Id, int Age, Date BirthDate, char Gender, int Salary) {
        super(FirstName, LastName, Id, Age, BirthDate, Gender, Salary);

    }

    public Nurse() {
        this(null, null, 0, 0, null, ' ', 0);
    }

    @Override
    public void NameOfClass() {
        System.out.println(this.getClass().getSimpleName());
    }

    @Override
    public double calcSalary(int workingHours) {
        if (workingHours > getWORKING_HOURS()) {
            return (workingHours * 20 * 100);
        } else {
            return getSalary();
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}