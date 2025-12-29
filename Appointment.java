public class Appointment {

    protected static int countPatient = 0;
    private Date DateAppointment;

    public Appointment(int numPatient, Date DateAppointment) {
        this.DateAppointment = DateAppointment;
        countPatient++;

    }

    public Appointment() {
        this(0, null);
    }

    public static int getCountPatient() {
        return countPatient;
    }

    public static void setCountPatient(int countPatient) {
        Appointment.countPatient = countPatient;
    }

    public Date getDateAppointment() {
        return DateAppointment;
    }

    public void setDateAppointment(Date DateAppointment) {
        this.DateAppointment = DateAppointment;
    }

    @Override
    public String toString() {
        return String.format("Number of patient: %d %n Appointment:%n %s  ",
                 countPatient, DateAppointment.toString());
    }
}
