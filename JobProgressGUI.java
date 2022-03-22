
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JobProgressGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// Creating and setting frame to visible
					JobProgressGUI frame = new JobProgressGUI();
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
	public JobProgressGUI() {
		// Designing contentPane
		setBackground(new Color(233, 248, 255));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 425);
		contentPane = new JPanel();
		contentPane.setBackground((new Color(233, 248, 255)));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		// Create and display panelNorth
		JPanel panelNorth = new JPanel();
		panelNorth.setBackground(new Color(123, 155, 160));
		contentPane.add(panelNorth, BorderLayout.NORTH);
		panelNorth.setLayout(new GridLayout(0, 1, 0, 0));
		
		// Make panelNorth thicker
		panelNorth.setPreferredSize(new Dimension(600, 30));
		panelNorth.setMaximumSize(panelNorth.getPreferredSize()); 
		panelNorth.setMinimumSize(panelNorth.getPreferredSize());
		
		// Header code
		JLabel lblHeaderJobProg = new JLabel("Vulture Service - Job Progress");
		lblHeaderJobProg.setHorizontalAlignment(SwingConstants.LEFT);
		lblHeaderJobProg.setForeground(Color.WHITE);
		lblHeaderJobProg.setFont(new Font("Tahoma", Font.BOLD, 12));
		panelNorth.add(lblHeaderJobProg);
		
		// panelCentre code
		JPanel panelCentre = new JPanel();
		panelCentre.setBackground(new Color(233, 248, 255));
		contentPane.add(panelCentre, BorderLayout.CENTER);
		
		// Motor details button code - brings up MotorDetailsGUI.java
		JButton btnMotorDetails = new JButton("MOTOR DETAILS");
		btnMotorDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MotorDetailsGUI motorDetailsGUI = new MotorDetailsGUI();	
				motorDetailsGUI.setVisible(true);
			}
		});
		
		// Tasks button code - brings up TasksGUI.java
		JButton btnTasks = new JButton("TASKS");
		btnTasks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TasksGUI tasksGUI = new TasksGUI();
				tasksGUI.setVisible(true);
			}
		});
		// Adding buttons to panelCentre
		panelCentre.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelCentre.add(btnMotorDetails);
		panelCentre.add(btnTasks);
	}

}
