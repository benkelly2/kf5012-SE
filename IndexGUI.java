
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;

public class IndexGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// Initialising and setting frame to visible
					IndexGUI frame = new IndexGUI();
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
	public IndexGUI() {
		// Designing contentPane
		setBackground(new Color(233, 248, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 425);
		contentPane = new JPanel();
		contentPane.setBackground((new Color(233, 248, 255)));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JPanel panelWest = new JPanel();
		panelWest.setBackground(new Color(233, 248, 255));
		contentPane.add(panelWest, BorderLayout.WEST);
		
		JButton btnTaskAllocation = new JButton("TASK ALLOCATION");
		btnTaskAllocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				TaskAllocationDialog taskAllocationDialog = new TaskAllocationDialog();	UNCOMMENT THESE ONCE TaskAllocationDialog.java exists
//				taskAllocationDialog.setVisible(true);
			}
		});
		panelWest.add(btnTaskAllocation);
		
		JPanel panelCentre = new JPanel();
		panelCentre.setBackground(new Color(233, 248, 255));
		contentPane.add(panelCentre, BorderLayout.CENTER);
		
		JButton btnJobProgress = new JButton("JOB PROGRESS");
		btnJobProgress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JobProgressGUI jobProgressGUI = new JobProgressGUI();	
				jobProgressGUI.setVisible(true);
			}
		});
		panelCentre.add(btnJobProgress);
		
		JPanel panelEast = new JPanel();
		panelEast.setBackground(new Color(233, 248, 255));
		contentPane.add(panelEast, BorderLayout.EAST);
		
		JButton btnSignIn = new JButton("SIGN IN");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				SignInDialog signInDialog = new SignInDialog();	UNCOMMENT THESE ONCE SignInDialog.java exists
//				signInDialog.setVisible(true)
			}
		});
		panelEast.add(btnSignIn);
		
		// Create panelNorth
		JPanel panelNorth = new JPanel();
		panelNorth.setBackground(new Color(123, 155, 160));
		contentPane.add(panelNorth, BorderLayout.NORTH);
		panelNorth.setLayout(new GridLayout(0, 1, 0, 0));
		
		// Make panelNorth thicker
		panelNorth.setPreferredSize(new Dimension(600, 30));
		panelNorth.setMaximumSize(panelNorth.getPreferredSize()); 
		panelNorth.setMinimumSize(panelNorth.getPreferredSize());
		
		JLabel lblHeaderHome = new JLabel("Vulture Service - Home", SwingConstants.LEFT);
		lblHeaderHome.setForeground(Color.WHITE);
		lblHeaderHome.setBackground(new Color(240, 240, 240));
		lblHeaderHome.setFont(new Font("Tahoma", Font.BOLD, 12));
		panelNorth.add(lblHeaderHome);
	}

}
