package Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.util.Date;
import java.util.Timer;
public class Doctor extends User{

    private String speciality;

        public Doctor(String name, String email, String speciality){
            super(name,email);
            this.speciality = speciality;
        }

        public String getSpeciality(){
            return this.speciality;
        }

        public void setSpeciality(String s){
            this.speciality = s;
        }

        //Following array list is to hold available appointments for the specific object Doctor
        private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

        //method to add appointments to the array:
        public void addAvailableAppointment(Date date, String time){
            availableAppointments.add(new AvailableAppointment(date,time));
        }

        //returning the lsit of the availabeApointment:
        public ArrayList<AvailableAppointment> getAvailableAppointments(){
            return availableAppointments;
        }

        //static inner class to handle specific information, like available apppointments
        public static class AvailableAppointment{
            private int id;
            private Date date;
            private String time;

            //SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            public AvailableAppointment(Date d, String t){

                    this.date = d;
                    this.time =time;

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


        @Override
            public String toString(){
                return "Date: " + this.date + "| Time: " + this.time;
            }

        }

        @Override
        public String toString(){
            String result = "Available Appointments:\n";
                for(int i = 0; i < availableAppointments.size(); i++){
                    result+=availableAppointments.toString() + "\n";
                }
        }

    @Override
    public void showDataUser() {
            //TODO - LATER
        //Method will be build to show a new JFrame with doctor information
    }
}
