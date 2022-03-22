
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JScrollPane;

public class TasksGUI extends JFrame {

	private JPanel contentPane;
	private JTable tableTasks;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TasksGUI frame = new TasksGUI();
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
	public TasksGUI() {
		// Designing content pane
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBackground(new Color(233, 248, 255));
		setBounds(100, 100, 600, 425);
		contentPane = new JPanel();
		contentPane.setBackground((new Color(233, 248, 255)));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		// Code for panelNorth
		JPanel panelNorth = new JPanel();
		panelNorth.setBackground(new Color(123, 155, 160));
		contentPane.add(panelNorth, BorderLayout.NORTH);
		panelNorth.setLayout(new GridLayout(0, 1, 0, 0));
		// Make panelNorth thicker
		panelNorth.setPreferredSize(new Dimension(600, 30));
		panelNorth.setMaximumSize(panelNorth.getPreferredSize()); 
		panelNorth.setMinimumSize(panelNorth.getPreferredSize());
		
		// Code for header text
		JLabel lblHeaderTasks = new JLabel("Vulture Service - Tasks");
		lblHeaderTasks.setHorizontalAlignment(SwingConstants.LEFT);
		lblHeaderTasks.setForeground(Color.WHITE);
		lblHeaderTasks.setFont(new Font("Tahoma", Font.BOLD, 12));
		panelNorth.add(lblHeaderTasks);
		
		// Creating scrollPane
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		
		// Tasks table
		// temporary dummy data
		String data[][] = {{"001","Type5","2hour","Ongoing","20.03.22"}, {"002","Type3","30min","Completed","18.03.22"}, {"003","Type9","1day","Completed","20.03.22"}};
		String column[] = {"TaskID","TaskType","Duration","Status","Date of Completion"};
		
		// Code for Tasks table
		tableTasks = new JTable(data, column);
		tableTasks.setBackground(new Color(233, 248, 255));
		scrollPane.setViewportView(tableTasks);
		tableTasks.setBounds(0, 0, 576, 348);
	}

}
