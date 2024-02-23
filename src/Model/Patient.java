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
        //TODO - LATER
        //HERE MISSING CODE TO QUERY TO DB ABOUT SPECIFIC PATIENT APPOINTMENT WITH DOCTOR, DO IT LATER
        return appointmentWithDoctor;
    }

    public void addAppointmentDoctors(Doctor doctor, String date, String time){
        AppointmentDoctor appointmentDoc = new AppointmentDoctor(this, doctor);
        appointmentDoc.schedule(date, time); // must change in the future this date to be handle by Date class
        appointmentWithDoctor.add(appointmentDoc);
        //TODO - LATER
        //Missing code to send appointment to a DB.
    }

    public ArrayList<AppointmentNurse> getappointmentWithNurse(){
        //TODO - LATER
        //HERE MISSING CODE TO QUERY TO DB ABOUT SPECIFIC PATIENT APPOINTMENT WITH NURSE, DO IT LATER
        return appointmentWithNurse;
    }

    public void addAppointmentNurse(Nurse nurse, String date, String time){
        AppointmentNurse appointmentNurse = new AppointmentNurse(this, nurse);
        appointmentNurse.schedule(date, time);
        this.appointmentWithNurse.add(appointmentNurse);
        //TODO - LATER
        //MIssing code to send this information to a DATABASE-> Must create a class that  take it and send it.
    }

    @Override
    public void showDataUser() {
        //TODO- LATER
        JOptionPane.showMessageDialog(null, "Patient \nVIP Patient");
    }
}
