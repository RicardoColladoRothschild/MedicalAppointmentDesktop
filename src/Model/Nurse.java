package Model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

public class Nurse extends User{
    private String speciality;


    public Nurse(String name, String email){
        super(name, email);
    }

    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<AvailableAppointment>();


    public String getSpeciality(){
        return this.speciality;
    }

    public void setSpeciality(String speciality){
        this.speciality = speciality;
    }

        public static class AvailableAppointment{
            //TODO - LATER
            //We alreadt created a class exactly like this one for the doctors, will analyze the posibility to create a lone class
            //instead of having it as inner class
            private int id;
            private Date date;
            private String time;

                public AvailableAppointment(Date d, String t){
                    this.date = d;
                    this.time = t;
                    // this.id+=; ->Appointment id must be level up depending on last appintment created.
                }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public Date getDate() {
                return date;
            }

            public void setDate(Date date) {
                this.date = date;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            //TODO - LATER
            //Again this is repeat code:Need analyze if it will be better to have an own class for this, instead of
            //using an inner class.
            @Override
                public String toString(){
                return "Date: " + this.date + "| Time: " + this.time;
            }
        }

    @Override
    public void showDataUser() {
        //TODO - LATER
        //this will be fill from database, at the moment this is a test
        JOptionPane.showMessageDialog(null, "Hospital: Cruz Verde de Los Mina \nDepartamento: Nutriologia, Enfermeria general");
    }
    @Override
    public String toString(){
        String result = "Available Appointments:\n";
        for(int i = 0; i < availableAppointments.size(); i++){
            result+=availableAppointments.toString() + "\n";
        }
        return result;
    }
}
