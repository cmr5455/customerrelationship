import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MApp extends JFrame implements ActionListener{
	JPanel panel;
	JLabel listing;
	JTextField available;
	JButton book, cancel;
	
	MApp(){
		book = new JButton("Book");
		available = new JTextField();
		cancel = new JButton("Cancel");
		panel = new JPanel(new GridLayout(2,1));
		panel.isVisible();
		listing = new JLabel("Available Services");
		panel.add(listing);
		panel.add(available);
		panel.add(book);
		panel.add(cancel);
		book.addActionListener(this);
		cancel.addActionListener(this);
		setSize(450,450);
		setVisible(true);
		setTitle("Make an Appointment");
		add(panel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MApp();
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == book) {
			//put the insert here
			JOptionPane.showMessageDialog(this, "You have booked an appointment");
		}
		if (ae.getSource() == cancel) {
			dispose();
		}
	}
}
