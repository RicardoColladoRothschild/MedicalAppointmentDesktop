package Model;

import javax.swing.*;

public class Nurse extends User{
    private String speciality;


    public Nurse(String name, String email){
        super(name, email);
    }

    @Override
    public void showDataUser() {
        JOptionPane.showMessageDialog(null, "Hospital: Cruz Verde de Los Mina \nDepartamento: Nutriologia, Enfermeria general");
    }

    public String getSpeciality(){
        return this.speciality;
    }

    public void setSpeciality(String speciality){
        this.speciality = speciality;
    }
}
