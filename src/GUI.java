import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
 
public class GUI extends JFrame {
 
    private JPanel contentPane;
    private final Action action_1 = new SwingAction();
    private final Action action = new SwingAction_1();
    private final Action action_2 = new SwingAction_2();
    private final Action action_3 = new SwingAction_3();
    private final Action action_4 = new SwingAction_4();
 
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUI frame = new GUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
    /**
     * Create the frame.
     */
    public GUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 700, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
 
        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(20, 60, 500, 200);
        contentPane.add(scrollPane_1);
 
        JTextArea textArea_1 = new JTextArea();
        scrollPane_1.setViewportView(textArea_1);
 
 
        JButton btnNewButton = new JButton("追加");
        btnNewButton.setAction(action_1);
        btnNewButton.setBounds(536, 15, 125, 51);
        contentPane.add(btnNewButton);
 
        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("CarShop");
        rdbtnNewRadioButton_1.setAction(action);
        rdbtnNewRadioButton_1.setBounds(45, 15, 161, 29);
        contentPane.add(rdbtnNewRadioButton_1);
 
        JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("AnimalWorld");
        rdbtnNewRadioButton_2.setAction(action_2);
        rdbtnNewRadioButton_2.setBounds(267, 15, 161, 29);
        contentPane.add(rdbtnNewRadioButton_2);
 
        ButtonGroup group = new ButtonGroup();
        group.add(rdbtnNewRadioButton_1);
        group.add(rdbtnNewRadioButton_2);
 
        JButton button_1 = new JButton("削除");
        button_1.setAction(action_3);
        button_1.setBounds(542, 104, 119, 27);
        contentPane.add(button_1);
 
        JButton button_2 = new JButton("変更");
        button_2.setAction(action_4);
        button_2.setBounds(542, 168, 119, 27);
        contentPane.add(button_2);
    }
 
    private class SwingAction extends AbstractAction {
        public SwingAction() {
            putValue(NAME, "追加");
            putValue(SHORT_DESCRIPTION, "Some short description");
        }
        public void actionPerformed(ActionEvent e){
            new MyDialog();
        }
    }
 
    class MyDialog extends JDialog implements ActionListener{
        JTextField field1 = new JTextField(20);
        JTextField field2 = new JTextField(20);
        JTextField field3 = new JTextField(20);
        JButton save = new JButton("追加する");
        JButton cancel = new JButton("キャンセル");
 
        MyDialog(){
        setBounds(100, 100, 400, 400);
        setLayout(new FlowLayout());
        setModal(true);
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("rule "));
        panel1.add(field1);
        add(panel1);
        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("if "));
        panel2.add(field2);
        add(panel2);
        JPanel panel3 = new JPanel();
        panel3.add(new JLabel("then "));
        panel3.add(field3);
        add(panel3);
        JPanel panel4 = new JPanel();
        panel4.add(save);
        panel4.add(cancel);
        add(panel4);
        save.addActionListener(this);
        cancel.addActionListener(this);
        setVisible(true);
    }
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == save){
                
            } setVisible(false);
            }
 
    }
 
    //Carボタン
    private class SwingAction_1  extends AbstractAction {
        public SwingAction_1() {
            putValue(NAME, "CarShop");
            putValue(SHORT_DESCRIPTION, "Some short description");
        }
        public void actionPerformed(ActionEvent e) {
        	
        }
    }
 
    //Animalボタン
    private class SwingAction_2 extends AbstractAction {
        public SwingAction_2() {
            putValue(NAME, "AnimalWorld");
            putValue(SHORT_DESCRIPTION, "Some short description");
        }
        public void actionPerformed(ActionEvent e) {
        }
    }
    //削除ボタン
    private class SwingAction_3 extends AbstractAction {
        public SwingAction_3() {
            putValue(NAME, "削除");
            putValue(SHORT_DESCRIPTION, "Some short description");
        }
        public void actionPerformed(ActionEvent e) {
        }
    }
    //変更ボタン
    private class SwingAction_4 extends AbstractAction {
        public SwingAction_4() {
            putValue(NAME, "変更");
            putValue(SHORT_DESCRIPTION, "Some short description");
        }
        public void actionPerformed(ActionEvent e) {
        }
    }
}
