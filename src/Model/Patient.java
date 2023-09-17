package Model;
import java.util.ArrayList;
public class Patient extends User{

    private String birthday;
    private double weight;
    private double height;
    String blood;

    private ArrayList<AppointmentDoctor> appointmentWithDoctor = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentWithNurse = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors(){
        //HERE MISSING CODE TO QUERY TO DB ABOUT SPECIFIC PATIENT APPOINTMENT WITH DOCTOR, DO IT LATER
        return appointmentWithDoctors;
    }

    public Arraylist<AppointmentNurse> getappointmentWithNurse(){
        //HERE MISSING CODE TO QUERY TO DB ABOUT SPECIFIC PATIENT APPOINTMENT WITH NURSE, DO IT LATER
        return appointmentWithNurse;
    }
}
