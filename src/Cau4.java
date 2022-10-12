import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;


public class Cau4 extends JFrame {
    JButton btnstart = new JButton("start");
    JButton btnstop = new JButton("stop");
    JLabel lblNumber = new JLabel();
    int iNumber = 100 ;
    Timer timNumber;


    public Cau4() {
        setTitle("cau4");
        setSize(600,500);
        setLayout(null);
        setLocationRelativeTo(null);
        setBackground(Color.ORANGE);
        add(btnstart);
        add(btnstop);
        add(lblNumber);

        btnstart.setBounds(50, 100, 100, 100);
        btnstop.setBounds(450, 100, 100, 100 );
        btnstart.setBackground(Color.PINK);
        btnstop.setBackground(Color.BLUE);
        lblNumber.setBounds(225, 200, 200, 200);
        Font fontchu = new Font(lblNumber.getFont().getName(), Font.PLAIN, 100);
        lblNumber.setFont(fontchu);
        lblNumber.setForeground(Color.PINK);


        timNumber = new Timer(100, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                iNumber --;
                lblNumber.setText(""+ iNumber);
                if(iNumber == 0) {
                    timNumber.stop();
                }

            }
        });
        btnstart.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                timNumber.start();

            }
        });
        btnstop.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                timNumber.stop();

            }
        });

    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Cau4 cau4 = new Cau4();
        cau4.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cau4.setVisible(true);

    }

}
