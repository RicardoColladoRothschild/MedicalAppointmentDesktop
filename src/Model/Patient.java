package Model;
import javax.swing.*;
import java.util.ArrayList;
public class Patient extends User{

    private String birthday;
    private double weight;
    private double height;
    String blood;

    public Patient(String name, String email){
        super(name, email);
    }

    private ArrayList<AppointmentDoctor> appointmentWithDoctor = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentWithNurse = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors(){
        //HERE MISSING CODE TO QUERY TO DB ABOUT SPECIFIC PATIENT APPOINTMENT WITH DOCTOR, DO IT LATER
        return appointmentWithDoctor;
    }

    public ArrayList<AppointmentNurse> getappointmentWithNurse(){
        //HERE MISSING CODE TO QUERY TO DB ABOUT SPECIFIC PATIENT APPOINTMENT WITH NURSE, DO IT LATER
        return appointmentWithNurse;
    }

    @Override
    public void showDataUser() {
        JOptionPane.showMessageDialog(null, "Patient \nVIP Patient");
    }
}
