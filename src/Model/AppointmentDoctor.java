package Model;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;
public class AppointmentDoctor implements Ischedulable {

    private int id;
    private Patient patient;
    private Doctor doctor;

    private Date date;
    private String time;

    public AppointmentDoctor(Patient patient, Doctor doctor){
        this.patient = patient;
        this.doctor =doctor;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public Patient getPatient(){
        return patient;
    }

    public void setPatient(Patient patient){
        this.patient = patient;
    }

    public Doctor getDoctor(){
        return doctor;
    }

    public void setDoctor(Doctor doctor){
        this.doctor = doctor;
    }

    public Date getDate(){
        return date;
    }

    public String getTime(){
        return time + " hrs.";
    }

    public void setTime(String time){
        this.time = time;
    }

    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public void schedule(String date, String time){

        try{
            this.date = format.parse(date);
        }catch(ParseException e){
            e.printStackTrace();
        }
    }


}
