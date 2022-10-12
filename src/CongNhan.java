import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CongNhan extends JFrame {
    JLabel lblTenCN = new JLabel ("Ten Cong Nhan");
    JTextField txtTenCN = new JTextField();
    JLabel lblLuong = new JLabel("Luong Cong Nhan");
    JTextField txtLuong = new JTextField();
    JLabel lblResult = new JLabel("Ket Qua");
    JTextArea tatResult = new JTextArea();
    JButton btnTinhThue = new JButton("Tinh");
    JScrollPane scroll = new JScrollPane(tatResult, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    public CongNhan() {
        setTitle("Tinh gia san pham");
        setSize(300, 300);
        setLayout(null);
        setLocationRelativeTo(null);
        add (lblTenCN);
        add (txtTenCN);
        add (lblLuong);
        add (txtLuong);
        add (btnTinhThue);
        add (scroll);
        add (lblResult);

        lblTenCN.setBounds (10, 10, 100, 25);
        txtTenCN.setBounds(115, 10, 150, 25);
        lblLuong.setBounds(10, 40, 125, 25);
        txtLuong.setBounds(130, 40, 125, 25);
        lblResult.setBounds(200, 100, 100, 25);
        btnTinhThue.setBounds(10, 100, 70, 25);
        scroll.setBounds(10, 130, 260, 120);

//		ADD Action Listener cho Button Tinh
        btnTinhThue.addActionListener(new ActionListener() {
            //			@override
            public void actionPerformed(ActionEvent e) {
                double ThueThuNhap;
                String ten = txtTenCN.getText();
                double luong = Integer.parseInt(txtLuong.getText());
                if(luong <= 6000000) {
                    ThueThuNhap = 0;
                }
                else {
                    ThueThuNhap = (luong - 6000000) * 5/100;
                }
                double luongcuoi = luong - ThueThuNhap;
                tatResult.setText("Ten NV: " + ten + "\nLuong NV: " + luong + "\nThue TNCN: " + ThueThuNhap + "\nLuong thuc lanh:" + luongcuoi);
            }
        });


    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CongNhan wMain = new CongNhan();
        wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
        wMain.setVisible(true);
    }

}
