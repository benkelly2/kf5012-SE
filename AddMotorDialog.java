import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Window;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class AddMotorDialog extends JDialog {
	private JTextField textID;
	private JTextField textMotorName;
	private JTextField textManufacturer;
	private JTextField textType;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			// Initialising and setting dialog to visible
			AddMotorDialog addMotorDialog = new AddMotorDialog();
			addMotorDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			addMotorDialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddMotorDialog() {
		setModal(true);
		// Creating/designing the main panels
		setBounds(100, 100, 450, 300);
		setBackground(new Color(233, 248, 255));
		getContentPane().setLayout(new BorderLayout());
		{
			// Code for bottom buttonPanel (panelSouth in other files)
			JPanel panelSouth = new JPanel();
			panelSouth.setBackground(new Color(233, 248, 255));
			panelSouth.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(panelSouth, BorderLayout.SOUTH);
			{
				// Code for OK button
				JButton btnOK = new JButton("OK");
				btnOK.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// Insert code to update database here
//						dialog.dispose();
						// Need to ask for help on this bit - Scope issues
					}
				});
				btnOK.setActionCommand("OK");
				panelSouth.add(btnOK);
				getRootPane().setDefaultButton(btnOK);
			}
			{
				// Code for Cancel button
				JButton btnCancel = new JButton("Cancel");
				btnCancel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						addMotorDialog.dispose();	
					}
				});
				btnCancel.setActionCommand("Cancel");
				panelSouth.add(btnCancel);
			}
		}
		{
			// Creating panelNorth
			JPanel panelNorth = new JPanel();
			panelNorth.setBackground(new Color(123, 155, 160));
			getContentPane().add(panelNorth, BorderLayout.NORTH);
			panelNorth.setLayout(new GridLayout(0, 1, 0, 0));
			// Make panelNorth thicker
			panelNorth.setPreferredSize(new Dimension(600, 30));
			panelNorth.setMaximumSize(panelNorth.getPreferredSize()); 
			panelNorth.setMinimumSize(panelNorth.getPreferredSize());
			{
				JLabel lblHeaderAddMotor = new JLabel("Vulture Service - Add Motor");
				lblHeaderAddMotor.setForeground(Color.WHITE);
				lblHeaderAddMotor.setHorizontalAlignment(SwingConstants.LEFT);
				lblHeaderAddMotor.setFont(new Font("Tahoma", Font.BOLD, 12));
				panelNorth.add(lblHeaderAddMotor);
			}
		}
		{
			JPanel panelCentre = new JPanel();
			getContentPane().add(panelCentre, BorderLayout.CENTER);
			panelCentre.setBackground(new Color(233, 248, 255));
			panelCentre.setLayout(new GridLayout(4, 2, 0, 0));
			{
				JLabel lblID = new JLabel("ID:");
				panelCentre.add(lblID);
			}
			{
				textID = new JTextField();
				panelCentre.add(textID);
				textID.setColumns(10);
			}
			{
				JLabel lblMotorName = new JLabel("Motor Name:");
				panelCentre.add(lblMotorName);
			}
			{
				textMotorName = new JTextField();
				panelCentre.add(textMotorName);
				textMotorName.setColumns(10);
			}
			{
				JLabel lblManufacturer = new JLabel("Manufacturer:");
				panelCentre.add(lblManufacturer);
			}
			{
				textManufacturer = new JTextField();
				panelCentre.add(textManufacturer);
				textManufacturer.setColumns(10);
			}
			{
				JLabel lblType = new JLabel("Type:");
				panelCentre.add(lblType);
			}
			{
				textType = new JTextField();
				panelCentre.add(textType);
				textType.setColumns(10);
			}
		}
	}

}
