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
            panel1.setBounds(35,35,350,350);

            //color for panel:
            panel1.setBackground(new Color(99,183,240));
            add(panel1);



        }
}
