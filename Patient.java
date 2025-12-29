public class Patient extends Person implements Service {

    private Appointment[] appointment;

    public Patient(Appointment[] appointment, String FirstName, String LastName, int Id, int Age, Date BirthDate, char Gender) {
        super(FirstName, LastName, Id, Age, BirthDate, Gender);
        this.appointment = appointment;

    }

    public Patient() {
        this(null, null, null, 0, 0, null, ' ');
    }

    public Appointment[] getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment[] appointment) {
        this.appointment = appointment;
    }
 
    
    @Override
    public void NameOfClass(){
        System.out.println(this.getClass().getSimpleName());
    }
    
    
    @Override
    public String toString(){
        return super.toString()+"appointment: "+appointment;
    }
     
    
    @Override
     public void display() {
    
           for (Appointment appointment1 : appointment) {
               System.out.println("Array info:\n"+appointment1);
           }
   
       }
    
}