
package chap8;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LuckyNumber extends JFrame implements MouseListener{

    private JLabel lblHeader, lblReault;
    private Random rd;
            
    public LuckyNumber() {
        initGUI();
    }

    public void initGUI(){
        lblHeader = new JLabel("Lucky Number");
        lblHeader.setFont(new Font("Tahoma",Font.PLAIN, 40));
        lblReault = new JLabel("");
        lblReault.setFont(new Font("Tahoma",Font.PLAIN, 40));
        lblReault.setForeground(Color.red);
        
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(lblHeader);
        add(lblReault);
        lblHeader.addMouseListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent me) {
        rd = new Random();
        int randomNum = rd.nextInt(1000);
        lblReault.setText((String.valueOf(randomNum)));
        }
    @Override
    public void mousePressed(MouseEvent me) {}
    @Override
    public void mouseReleased(MouseEvent me) {}
    @Override
    public void mouseEntered(MouseEvent me) {}
    @Override
    public void mouseExited(MouseEvent me) {
      lblReault.setText(null);
    }
    public static void main(String[] args) {
        LuckyNumber frmNum = new LuckyNumber();
        frmNum.setTitle("Lucky Number");
        frmNum.setSize(300, 200);
        frmNum.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmNum.setVisible(true);
    }
}
