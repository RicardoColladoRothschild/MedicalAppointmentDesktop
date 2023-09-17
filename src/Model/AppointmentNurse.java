package Model;

public class AppointmentNurse implements ISchedulable{
    private int id;
    private Nurse nurse;
    private Patient patient;

    private Date date;
    private String time;

    //Need to create Nurse class, it need to have appointments available, kind of patients etc..
    public AppointmentNurse(Patient patient, Nurse nurse){}
}
