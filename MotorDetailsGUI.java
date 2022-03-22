
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MotorDetailsGUI extends JFrame {

	private JPanel contentPane;
	private JTable tableMotorDetails;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MotorDetailsGUI frame = new MotorDetailsGUI();
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
	public MotorDetailsGUI() {
		setBackground(new Color(233, 248, 255));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 425);
		contentPane = new JPanel();
		contentPane.setBackground((new Color(233, 248, 255)));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		// Creating panelNorth
		JPanel panelNorth = new JPanel();
		panelNorth.setBackground(new Color(123, 155, 160));
		contentPane.add(panelNorth, BorderLayout.NORTH);
		panelNorth.setLayout(new GridLayout(0, 1, 0, 0));
		// Make panelNorth thicker
		panelNorth.setPreferredSize(new Dimension(600, 30));
		panelNorth.setMaximumSize(panelNorth.getPreferredSize()); 
		panelNorth.setMinimumSize(panelNorth.getPreferredSize());
		
		// Code for header text
		JLabel lblHeaderMotorDetails = new JLabel("Vulture Service - Motor Details");
		lblHeaderMotorDetails.setHorizontalAlignment(SwingConstants.LEFT);
		lblHeaderMotorDetails.setForeground(Color.WHITE);
		lblHeaderMotorDetails.setFont(new Font("Tahoma", Font.BOLD, 12));
		panelNorth.add(lblHeaderMotorDetails);
		
		// Scroll pane code - currently holds
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		// Motor details table
		// temporary dummy data
		String data[][] = {{"001","SuperSpeed2.0","Nissan","Brushless"},{"002","Windinator5000","Teknika","Linear"},{"003","JohnSmith Motor","Bosch","Brushless"}};
		String column[] = {"ID","Motor Name","Manufacturer","Type"};
		
		// Code for MotorDetails table
		tableMotorDetails = new JTable(data, column);
		tableMotorDetails.setBackground(new Color(233, 248, 255));
		scrollPane.setViewportView(tableMotorDetails);
		tableMotorDetails.setBounds(30, 40, 200, 100);
		
		// Code for panelSouth (panel containing buttons)
		JPanel panelSouth = new JPanel();
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		panelSouth.setPreferredSize(new Dimension(600, 50));
		panelSouth.setMaximumSize(getPreferredSize());
		panelSouth.setMinimumSize(getPreferredSize());
		panelSouth.setLayout(new GridLayout(0, 3, 0, 0));
		
		// Code for Delete button
		JButton btnDeleteMotor = new JButton("DELETE");
		btnDeleteMotor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code delete a row from the database
			}
		});
		panelSouth.add(btnDeleteMotor);
		
		// Code for Close button
		JButton btnClose = new JButton("CLOSE");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CAN'T GET BUTTON TO CLOSE ENTIRE WINDOW
//				frame.dispose();
				// DOESN'T HAVE ACCESS TO 'frame'
			}
		});
		panelSouth.add(btnClose);
		
		// Code for Add button
		JButton btnAddMotor = new JButton("ADD");
		btnAddMotor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// brings up AddMotorDialog
				AddMotorDialog addMotorDialog = new AddMotorDialog();
				addMotorDialog.setVisible(true);
			}
		});
		panelSouth.add(btnAddMotor);
		
		
	}

}
