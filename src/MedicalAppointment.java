import javax.swing.*;
import java.awt.*;
public class MedicalAppointment extends JFrame{

    private JLabel labelTitle;
    private JButton btn_DoctorView;
    private JButton btn_PatientView;
    private JButton btn_ConsultationView;
    private JPanel panel1;

    public MedicalAppointment(){
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setTitle("Medical Appointment");

            //crating panel
            panel1 = new JPanel();
            panel1.setLayout(null);
            panel1.setBounds(0,0,450,450);
            add(panel1);


                labelTitle = new JLabel("Medical Appontments");
                labelTitle.setBounds(120,10,100,31);
                panel1.add(labelTitle);
        }
}
