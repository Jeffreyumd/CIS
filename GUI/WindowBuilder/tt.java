import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTable;

public class tt extends JFrame {

	private JPanel contentPane;
	private JTextField fnField;
	private JTextField lnField;
	private JTextField emField;
	
	private Manager manager;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tt frame = new tt();
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
	public tt() {
		
		// create the person
		try {
			manager = new Manager();
			
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(this, "Error: " + exc, "Error", JOptionPane.ERROR_MESSAGE); 
		}
				
		setTitle("SImple App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("First Name");
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		fnField = new JTextField();
		panel.add(fnField);
		fnField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		panel.add(lblLastName);
		
		lnField = new JTextField();
		panel.add(lnField);
		lnField.setColumns(10);
		
		JButton btnNewButton = new JButton("Add ");
		 btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
				
					try {
						
						String fname = fnField.getText();
						String lname = lnField.getText();
						String email = emField.getText();
						
						Person a = new Person(fname,lname,email);
						manager.addPerson(a);
						
						JOptionPane.showMessageDialog(null, "First_Name:" + a.getfirstName() + "\n" 
															+"Last_Name:" + a.getlastName() + "\n" 
															+" Email_:" + a.getEmail() + "\n"
															+ "Has been added to the DataBase !");
						
						//PersonTable model = new PersonTable(manager.getAllperson());
						//table.setModel(model);
						
						
					} catch (Exception e) {
						
						e.printStackTrace();
					}
				
			}
		});
		
		JLabel lblEmail = new JLabel("Email ");
		panel.add(lblEmail);
		
		emField = new JTextField();
		panel.add(emField);
		emField.setColumns(10);
		panel.add(btnNewButton);
		
		JButton btnShowData = new JButton("Show data");
		btnShowData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					PersonTable model = new PersonTable(manager.getAllperson());
					table.setModel(model);
				} catch (Exception ex) {
					
					ex.printStackTrace();
				}
			}
		});
		panel.add(btnShowData);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setAlignment(FlowLayout.RIGHT);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		panel_1.add(btnExit);
		
		
	}
	
	
	

}
