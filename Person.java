public abstract class Person {

    private String FirstName;
    private String LastName;
    private int Id;
    private int Age;
    private Date BirthDate;
    private char Gender;

    //constructor
    public Person(String FirstName, String LastName, int Id, int Age, Date BirthDate, char Gender) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Id = Id;
        this.Age = Age;
        this.BirthDate = BirthDate;
        this.Gender = Gender;
    }

    public Person() {
        this(" ", " ", 0, 0, null, ' ');
    }

    //getters
    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getId() {
        return Id;
    }

    public int getAge() {
        return Age;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public char getGender() {
        return Gender;
    }

    //setters
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setBirthDate(Date BirthDate) {
        this.BirthDate = BirthDate;
    }

    public void setMobileNum(char Gender) {
        this.Gender = Gender;
    }

    @Override
    public String toString() {
        return String.format("First Name:%s \nLast Name:%s \nId: %d \nAge: %d \n%sGender:%s %n",
                 FirstName, LastName, Id, Age, BirthDate.toString(), Gender);
    }

    public abstract void NameOfClass();

    public String checkAge() {
        if (Age > 18) {
            return "Adult";
        } else {
            return "Child";
        }
    }
}
