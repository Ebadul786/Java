import javax.swing.*;
import java.awt.event.*;
public class Gui{
    public static void main(String args[]){
        JFrame frame = new JFrame("Addition");
        frame.setSize(200,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //main panel
        JPanel mainpanel = new JPanel();
        mainpanel.setLayout(new BoxLayout(mainpanel,BoxLayout.Y_AXIS));
        //row 1
        JLabel title = new JLabel("Addition");
        
        //row 2
        JPanel p1 = new JPanel();
        JLabel l1 = new JLabel("Number 1 : ");
        JTextField t1 = new JTextField(10);
        p1.add(l1);
        p1.add(t1);

        //row 3
        JPanel p2 = new JPanel();
        JLabel l2 = new JLabel("Number 2 : ");
        JTextField t2 = new JTextField(10);
        p2.add(l2);
        p2.add(t2);
        //row 5
        JLabel result = new JLabel("");
        //row 4
        JButton sum = new JButton("Sum");
        sum.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    int n1 = Integer.parseInt(t1.getText());
                    int n2 = Integer.parseInt(t2.getText());
                    int s = n1+n2;
                    result.setText("Sum : "+s);
                }catch(NumberFormatException  ex){
                    JOptionPane.showMessageDialog(frame,"Invalid input");
                }
            }
        });
        mainpanel.add(title);
        mainpanel.add(p1);
        mainpanel.add(p2);
        p1.setMaximumSize(p1.getPreferredSize());
        p2.setMaximumSize(p2.getPreferredSize());
        mainpanel.add(sum);
        mainpanel.add(result);
        frame.add(mainpanel);
        frame.setVisible(true);
    }
}