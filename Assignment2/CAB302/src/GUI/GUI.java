package GUI;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


import java.awt.Font;

public class GUI extends JFrame  {
/**
 * @author Dylan Vardanega
 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JTable MainTable;

	String[] headers = {"Item","Manufacturing Cost","Sell Price","Re-order Point","Re-order Amount","Store Temp","Current Stock"};
	
	Object[][] data = {
			
			{"test1","test2","test3","test4","test5","test6","test7"},
			{"test1","test2","test3","test4","test5","test6","test7"},
			{"test1","test2","test3","test4","test5","test6","test7"}
	};
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception l) {
					l.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 712, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(511, 322, 175, 99);
		frame.getContentPane().add(textArea);
		
		JButton btnOpenfile = new JButton("Open Sales Log");
		btnOpenfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			OpenFile of = new OpenFile();
			
			try {
				of.PickMe();
			} catch (Exception q) {
				q.printStackTrace();
				
			}
			textArea.setText(of.sb.toString());
			}
		});
		

		btnOpenfile.setBounds(10, 398, 150, 23);
		frame.getContentPane().add(btnOpenfile);
		
		//Label for Sales Log
		JLabel label = new JLabel("<Sales Log>");
		label.setBounds(565, 302, 100, 14);
		frame.getContentPane().add(label);
		
		//Table showing all data from item properties
		MainTable = new JTable(data,headers);
		MainTable.setPreferredScrollableViewportSize(new Dimension(500,50));
		MainTable.setFillsViewportHeight(true);		
		
		JScrollPane jps = new JScrollPane(MainTable);
		add(jps);
		
		MainTable.setBounds(10, 11, 676, 260);
		frame.getContentPane().add(MainTable);
		
		//Label for Current Capital
		JLabel lblCurrentCapital = new JLabel("$100,000.00");
		lblCurrentCapital.setBounds(388, 393, 117, 32);
		frame.getContentPane().add(lblCurrentCapital);
		//Notifying user of what the value in lblCurrent Capital is displaying
		JLabel lblCurrentCapital_1 = new JLabel("Current Capital:");
		lblCurrentCapital_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblCurrentCapital_1.setBounds(272, 401, 139, 14);
		frame.getContentPane().add(lblCurrentCapital_1);
	}
}
