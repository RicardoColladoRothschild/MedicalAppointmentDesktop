import javax.swing.*;
import java.awt.*;
public class MedicalAppointment extends JFrame{

    private JLabel labelTitle;
    private JButton btn_DoctorView;
    private JButton btn_PatientView;
    private JButton btn_ConsultationView;

        public MedicalAppointment(){
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setTitle("Medical Appointment");

                labelTitle = new JLabel("Medical Appontments");
                labelTitle.setBounds(120,10,100,31);
                add(labelTitle);
        }
}
