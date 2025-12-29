
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Menu
        int choice;
        Scanner input = new Scanner(System.in);

        Staff[] staff = new Staff[5];
        staff[0] = new Doctor("Najla ", "Alkhamis", 444008881, 18, new Date(8, 0, 25, 1, 2005), 'f', 10000, "Doctor");
        staff[1] = new Doctor("Lujain ", "Alkanaan", 444008935, 18, new Date(8, 0, 22, 1, 2005), 'f', 11000, "Doctor");
        staff[2] = new Doctor("Rand ", "Bin Rushud", 444008895, 18, new Date(4, 0, 13, 2, 2005), 'f', 12000, "Doctor");
        staff[3] = new Nurse("Jana ", "Alghamdi", 444008891, 18, new Date(8, 0, 27, 2, 2005), 'f', 13000);
        staff[4] = new Nurse("Aeshah ", "Almutairi", 444008851, 18, new Date(4, 0, 23, 6, 2003), 'f', 140000);

        ArrayList<Person> myList = new ArrayList<>();

        myList.add(staff[0]);
        myList.add(staff[1]);
        myList.add(staff[2]);
        myList.add(staff[3]);
        myList.add(staff[4]);
        //print hello
        System.out.println("*Welcom To The Dental Clinic*");
        System.out.println("-------------------------------");

        try {

            do {
                System.out.println(
                        "1.Show Hospital information\n"
                        + "2.New Patient\n"
                        + "3.show Service\n"
                        + "4.Booking Appointment\n"
                        + "5.delet Appointment\n"
                        + "6.display Staff \n"
                        + "7.Save too text file\n"
                        + "8.Read too text file\n"
                        + "9.Exit \n"
                        + "Please enter your choice: ");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        Hospital hospital = new Hospital(20, new Doctor("D.Maha ", "Ahmad", 110022, 23, new Date(8, 0, 1, 1, 2000), 'f', 30000, "Professor"), new Address("Riyadh", "King Fahd", "1123"));
                        System.out.println("Hospital Information: \n" + hospital);
                        System.out.println("-------------------------------");

                        break;

                    case 2: //new patient 
                        System.out.println("Enter:");
                        System.out.print(" ID:");
                        int ID = input.nextInt();
                        if (ID <= 0) {
                            System.out.print("Invalid ID value!");
                            break;
                        }

                        System.out.print(" first name:");
                        String firstName = input.next();
                        System.out.print(" Last name:");
                        String LAstName = input.next();
                        System.out.println("gander M or F");
                        char gander = input.next().charAt(0);
                        if (gander != 'F' && gander != 'M' && gander != 'f' && gander != 'm') {
                            System.out.println("Invalid gander value! ");
                            System.out.println("-------------------------------");
                            break;
                        }

                        System.out.println("age:");
                        int age = input.nextInt();
                        Person Patient1 = new Patient(null, firstName, LAstName, ID, age, null, gander);
                        System.out.println(Patient1.checkAge()); //if the patient adult or child
                        myList.add(Patient1);
                        System.out.println("Patient added seccessfully.. Thank You! :) ");
                        System.out.println("-------------------------------");
                        break;
                    case 3:
                        int num,
                         total = 0;
                        System.out.println("Service List: ");
                        do {
                            System.out.printf("1.XRAYS=%d %n2.TOOTH_DECAY_TREATMENT=%d %n3.FILLINGS=%d %n4.PERIODONTICS=%d %n5.ENDODONTICS=%d %n6.DENTURES=%d %n7.IMPLANTS=%d "
                                    + "%n8.ORAL_SURGERY=%d %n9.CROWNS_AND_BRIDGES=%d %n10.ORTHODONTICS=%d %n11.Exit %n",
                                     Service.XRAYS, Service.TOOTH_DECAY_TREATMENT, Service.FILLINGS, Service.PERIODONTICS, Service.ENDODONTICS,
                                    Service.DENTURES, Service.IMPLANTS, Service.ORAL_SURGERY, Service.CROWNS_AND_BRIDGES, Service.ORTHODONTICS);
                            System.out.println("Enter the Number of Service: ");
                            num = input.nextInt();
                            switch (num) {
                                case 1:
                                    total += Service.XRAYS;
                                    break;
                                case 2:
                                    total += Service.TOOTH_DECAY_TREATMENT;
                                    break;
                                case 3:
                                    total += Service.FILLINGS;
                                    break;
                                case 4:
                                    total += Service.PERIODONTICS;
                                    break;
                                case 5:
                                    total += Service.ENDODONTICS;
                                    break;
                                case 6:
                                    total += Service.DENTURES;
                                    break;
                                case 7:
                                    total += Service.IMPLANTS;
                                    break;
                                case 8:
                                    total += Service.ORAL_SURGERY;
                                    break;
                                case 9:
                                    total += Service.CROWNS_AND_BRIDGES;
                                    break;
                                case 10:
                                    total += Service.ORTHODONTICS;
                                    break;
                                case 11:
                                    System.out.println("The Total Price : " + total);
                                    break;
                            }
                        } while (num != 11);

                        System.out.println("-------------------------------");

                        break;

                    case 4: //Booking Appointment
                        System.out.println("enter your ID:");
                        ID = input.nextInt();
                        //check if the patient here or not
                        Patient1 = null;
                        for (Person p : myList) {
                            if (p instanceof Patient) {
                                int pID = ((Patient) p).getId();
                                if (pID == ID) {
                                    Patient1 = p;
                                    break;
                                }
                            }
                        }
                        if (Patient1 == null) {
                            System.out.println("This patient: " + ID + "is not found.");
                            System.out.println("-------------------------------");
                            break;
                        }

                        System.out.println("Doctor List :");
                        for (Person d : myList) {
                            if (d instanceof Doctor) {
                                System.out.println(((Doctor) d).getId() + ":" + d.getFirstName() + d.getLastName());

                            }
                        }

                        System.out.print("Enter doctor id:");
                        int DRId = input.nextInt();
                        //Check if the doctor here or not: 
                        String DRName = null;
                        for (Person person : myList) {
                            if (person instanceof Doctor) {
                                if (DRId == ((Doctor) person).getId()) {
                                    DRName = person.getFirstName() + " " + person.getLastName();
                                    break;
                                }
                            }
                        }
                        if (DRName == null) {
                            System.out.println("Invalid Doctor id.");
                            break;
                        } //stop    
                        System.out.println("-------------------------------");

                        System.out.println("Enter date: ");
                        System.out.print("Year(2023 or 2024) : ");
                        int year = input.nextInt();
                        if (year < 2023 || year > 2024) {
                            System.out.println("Invalid year!");
                            break;
                        } //stop

                        System.out.print("Month(From 1 to 12): ");
                        int month = input.nextInt();
                        if (month < 1 || month > 12) {
                            System.out.println("Invalid month!");
                            break;
                        }//stop

                        System.out.print("Day(From 1 to 30): ");
                        int day = input.nextInt();
                        if (day < 1 || day > 30) {
                            System.out.println("Invalid day!");
                            break;
                        } //stop

                        System.out.println("-------------------------------");
                        System.out.println("Enter time: ");
                        System.out.print("Hour(from 0 to 23): ");
                        int hour = input.nextInt();
                        if (hour < 0 || hour > 23) {
                            System.out.println("Invalid hour!");
                            break;
                        }//stop

                        System.out.print("Minutes(From 0 to 59): ");
                        int minutes = input.nextInt();
                        if (minutes < 0 || minutes > 59) {
                            System.out.println("Invalid minutes!");
                            break;
                        }//stop

                        Date DateWithTime = new Date(hour, minutes, day, month, year);
                        Appointment appointment = new Appointment(0, DateWithTime);

                        System.out.print("Appointment Confirmation: (Enter Y if Yes or N if No) ");
                        char answer = input.next().charAt(0);
                        if (answer == 'y' || answer == 'Y') {
                            System.out.println(appointment); //implicitly call toString method
                            System.out.println(" Your appoitment has been confirmed.. Thank You! :) ");
                        }
                        System.out.println("-------------------------------");

                        //all the appointments for patient
                        Appointment[] appointments = ((Patient) Patient1).getAppointment();
                        //if the pateint has no appointment
                        if (appointments == null) {
                            appointments = new Appointment[1];
                            appointments[0] = appointment;
                            ((Patient) Patient1).setAppointment(appointments);
                        } //update
                        //if the patient has already Appointment and they add a new one
                        else {
                            //copy appointments and add the new one
                            Appointment[] appointmentsB = new Appointment[appointments.length + 1];
                            int i = 0;
                            for (i = 0; i < appointments.length; i++) {
                                appointmentsB[i] = appointments[i];
                            }
                            appointmentsB[i] = appointment;
                            ((Patient) Patient1).setAppointment(appointmentsB);
                        } //update
                        break;

                    case 5:      //Cancel Appointment
                        System.out.print("Enter patient id: ");
                        ID = input.nextInt();
                        //search the list for the patient with the entered id and check if the patient here or not
                        Patient1 = null;
                        for (Person p : myList) {
                            if (p instanceof Patient) {
                                int patientId = ((Patient) p).getId();
                                if (patientId == ID) {//patient found
                                    Patient1 = p;
                                    break;
                                }
                            }
                        }

                        //if patient is not found
                        if (Patient1 == null) {
                            System.out.println("This patient: " + ID + " is not found.");
                            System.out.println("-------------------------------");
                            break;
                        } //stop

                        //if patient is found
                        System.out.print("Enter appointment id: ");
                        int AppointmentId = input.nextInt();
                        Appointment[] PatientAppointments = ((Patient) Patient1).getAppointment();
                        boolean isCancelled = false;
                        for (Appointment a : PatientAppointments) {
                            if (a != null) {
                                if (ID == AppointmentId) {
                                    System.out.println("Cancelled");
                                    isCancelled = true;
                                    break;
                                }
                            }
                        }
                        if (isCancelled == true) {
                            System.out.println("Your appointment has been cancelled!");
                        } else {
                            System.out.println("Sorry, no appointment found with id " + AppointmentId);
                        }
                        System.out.println("-------------------------------");
                        break;

                    case 6: //display Staff(doctors and Nurses)
                        System.out.println("Staff List :");
                        for (int i = 0; i < staff.length; i++) {
                            System.out.println(staff[i]);
                            System.out.println("------------------------------------------");
                        }
                        if (Staff.getCountStaff() == 0) {
                            System.out.println("No Doctors And Nurses Until Now! ");
                        }
                        break;

                    case 7: //save Files
                        Write w = new Write();
                        w.openFile("OurProjectText");
                        for (Person person : myList) {
                            if (person instanceof Staff) {
                                w.writeFile(person);
                            }
                        }//end 
                        w.closeFile();//to close
                        break;

                    case 8: //read files
                        //Read file txt
                        Read r = new Read();
                        r.openTextFile("OurProjectText");
                        r.readFromFile();
                        r.closeFile();//to close
                        break;

                    case 9:
                        System.out.println("Thank you! :) ");
                        break;

                    default:
                        System.out.println("Invalid .. please choose from the list!!");
                } //end switch
            } while (choice != 9);
        } catch (InputMismatchException e) {
            System.err.println("Wrong Input! :( "); // err is the same with out but the diffrent meaning
        } catch (NullPointerException e) {
            System.err.println("Wrong object! :(  ");
        } catch (ClassCastException e) {
            System.out.println("Wrong downcasting! :(  ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong index! :( ");
        }
    }
    
}
