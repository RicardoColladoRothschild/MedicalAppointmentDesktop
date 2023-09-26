package Model;

import java.util.Date;
public class AppointmentNurse implements ISchedulable{
    private int id;
    private Nurse nurse;
    private Patient patient;

    private Date date;
    private String time;

    //Need to create Nurse class, it need to have appointments available, kind of patients etc..
    public AppointmentNurse(Patient patient, Nurse nurse){}

    @Override
    public void schedule(String date, String time) {

    }
}
