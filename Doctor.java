public class Doctor extends Staff {

    private String SpecialMajor;

    public Doctor(String FirstName, String LastName, int Id, int Age, Date BirthDate, char Gender, int Salary, String SpecialMajor) {
        super(FirstName, LastName, Id, Age, BirthDate, Gender, Salary);
        this.SpecialMajor = SpecialMajor;
    }

    public Doctor() {
        this(null, null, 0, 0, null, ' ', 0, null);
    }

    public String getSpecialMajor() {
        return SpecialMajor;
    }

    public void setSpecialMajor(String SpecialMajor) {
        this.SpecialMajor = SpecialMajor;
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
        return super.toString() + "SpecialMajor: " + SpecialMajor;
    }
}
