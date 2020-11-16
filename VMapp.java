import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VMapp extends JFrame implements ActionListener{
	JPanel panel;
	JTextField MyApp;
	JButton cancel;
	
	VMapp(){
		MyApp = new JTextField();
		cancel = new JButton("Cancel");
		panel = new JPanel(new GridLayout(2,1));
		panel.isVisible();
		JLabel typeLabel = new JLabel("My Appointments");
		panel.add(typeLabel);
		panel.add(MyApp);
		panel.add(cancel);
		cancel.addActionListener(this);
		setSize(450,450);
		setVisible(true);
		setTitle("Viewing Appointments");
		add(panel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new VMapp();
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == cancel) {
			dispose();
		}
	}
}
