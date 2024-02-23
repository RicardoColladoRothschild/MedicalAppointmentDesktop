import Model.ImageHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
            panel1.setBounds(0,0,750,750);

            //color for panel:
            panel1.setBackground(new Color(99,183,240));

            //Doctor btn:
            btn_DoctorView = new JButton();
            ImageIcon image = new ImageIcon("doctor.png");
            btn_DoctorView.setIcon(image);
            btn_DoctorView.setBounds(35,35,150,150);
            btn_DoctorView.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Testin: Opening Doctor view");
                }
            });
            ImageIcon imageDoc = new ImageIcon("doctor.png");
            btn_DoctorView.setIcon(imageDoc);
            panel1.add(btn_DoctorView);

            btn_PatientView = new JButton("Patient");
                btn_PatientView.setBounds(200,35,150,150);
                    btn_PatientView.addActionListener(new ActionListener(){
                        @Override
                            public void actionPerformed(ActionEvent e){
                            System.out.println("Testing: Opening patient view");
                        }

                    });
                panel1.add(btn_PatientView);

            add(panel1);



        }
}
