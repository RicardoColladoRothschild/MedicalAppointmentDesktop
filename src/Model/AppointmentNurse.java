package Model;

import java.util.Date;
public class AppointmentNurse implements ISchedulable{
    private int id;
    private Nurse nurse;
    private Patient patient;

    private Date date;
    private String time;

    //Need to create Nurse class, it need to have appointments available, kind of patients etc..
    public AppointmentNurse(Patient patient, Nurse nurse){
        this.patient = patient;
        this.nurse = nurse;
    }

    @Override
    public void schedule(String date, String time) {
        //TODO - LATER
        //Receive the date and time in string, msut formated to Date, internally and prepare to send it to DB.
    }
}
