package Model;

import java.util.ArrayList;
import java.util.Date;
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

        //Following array list is to hold available appointments for the specific object Docotr
        private ArrayList<AvailableAppointment> availableAppointments = new Arraylist<>();

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

            public AvailableAppointment(Date d, String t){
                this.date = d;
                this.time = t;
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




        }


    @Override
    public void showDataUser() {

    }
}
