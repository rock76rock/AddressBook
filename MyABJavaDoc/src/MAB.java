import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

/**
 * Simple Address Book to store contact details for customers
 *
 * @author Rochelle Pyziakos
 * @version 1.01, 8 March 2018
 */

public class MAB {

	private JFrame frame;
	private JTextField txtFirstname;
	private JTextField txtLastname;
	private JTextField txtPhonenum;
	private JTextField textEmailAdd;
	private JTextField txtAddress;
	private JTextField txtCity;
	private JTextField txtState;
	private JTextField txtPostcode;

	/**
	* Launch the application
	* 
	* @param args creates the form for data entry of a new customer to be stored in the database
	*/
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MAB window = new MAB();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MAB() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		/**
		 * Label and data entry to store new customers first name only
		 * 
		 * @param txtFirstname
		 */
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(38, 48, 83, 14);
		frame.getContentPane().add(lblFirstName);
					
		txtFirstname = new JTextField();
		txtFirstname.setText("Bob");
		txtFirstname.setBounds(147, 45, 86, 20);
		frame.getContentPane().add(txtFirstname);
		txtFirstname.setColumns(10);
		
		/**
		 * Label and data entry to store new customers last name only
		 * 
		 * @param txtLastname
		 */
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(38, 73, 83, 14);
		frame.getContentPane().add(lblLastName);
				
		txtLastname = new JTextField();
		txtLastname.setText("Brown");
		txtLastname.setBounds(147, 70, 86, 20);
		frame.getContentPane().add(txtLastname);
		txtLastname.setColumns(10);
		
		/**
		 * Label and data entry to store new customers phone number
		 * 
		 * @param txtPhonenum
		 */
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setBounds(37, 98, 84, 14);
		frame.getContentPane().add(lblPhoneNumber);
		
		txtPhonenum = new JTextField();
		txtPhonenum.setText("0401 745 617");
		txtPhonenum.setBounds(147, 95, 86, 20);
		frame.getContentPane().add(txtPhonenum);
		txtPhonenum.setColumns(10);
		
		/**
		 * Label and data entry to store new customers email address
		 * 
		 * @param txtEmailAdd
		 */
		
		JLabel lblEmailAddress = new JLabel("Email Address:");
		lblEmailAddress.setBounds(38, 123, 83, 14);
		frame.getContentPane().add(lblEmailAddress);
		
		textEmailAdd = new JTextField();
		textEmailAdd.setText("amyorange@hotmail.com");
		textEmailAdd.setBounds(147, 120, 123, 20);
		frame.getContentPane().add(textEmailAdd);
		textEmailAdd.setColumns(10);
		
		/**
		 * Label and data entry to store new customers residential address
		 * 
		 * @param txtAddress
		 */
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(38, 148, 46, 14);
		frame.getContentPane().add(lblAddress);
		
		txtAddress = new JTextField();
		txtAddress.setText("123 Road Street");
		txtAddress.setBounds(147, 145, 123, 20);
		frame.getContentPane().add(txtAddress);
		txtAddress.setColumns(10);
		
		/**
		 * Label and data entry to store new customers city
		 * 
		 * @param txtCity
		 */
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(38, 170, 83, 14);
		frame.getContentPane().add(lblCity);
		
		txtCity = new JTextField();
		txtCity.setText("Brisbane");
		txtCity.setBounds(147, 167, 86, 20);
		frame.getContentPane().add(txtCity);
		txtCity.setColumns(10);
		
		/**
		 * Label and data entry to store new customers state
		 */
		
		JLabel lblState = new JLabel("State:");
		lblState.setBounds(38, 195, 46, 14);
		frame.getContentPane().add(lblState);
		
		txtState = new JTextField();
		txtState.setText("Qld");
		txtState.setBounds(147, 192, 86, 20);
		frame.getContentPane().add(txtState);
		txtState.setColumns(10);
		
		/**
		 * Label and data entry to store new customers postcode
		 * 
		 * @param txtPostCode
		 */
		
		JLabel lblPostCode = new JLabel("Post Code:");
		lblPostCode.setBounds(38, 220, 62, 14);
		frame.getContentPane().add(lblPostCode);
		
		txtPostcode = new JTextField();
		txtPostcode.setText("4000");
		txtPostcode.setBounds(147, 223, 86, 20);
		frame.getContentPane().add(txtPostcode);
		txtPostcode.setColumns(10);
		
		/**
		 * Adds and saves new customer in the database
		 */
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setBounds(309, 94, 89, 23);
		frame.getContentPane().add(btnSave);

		/**
		 * Allows changes to be made to customer details stored in the database
		 */
		
		JButton btnEdit = new JButton("EDIT");
		btnEdit.setBounds(309, 119, 89, 23);
		frame.getContentPane().add(btnEdit);
		
		/**
		 * Deletes customer from the database
		 */
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDelete.setBounds(309, 227, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		/**
		 * Heading for the form
		 */
		
		JLabel lblMyAddressBook = new JLabel("My Address Book");
		lblMyAddressBook.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblMyAddressBook.setBounds(38, 11, 172, 26);
		frame.getContentPane().add(lblMyAddressBook);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{txtFirstname, txtLastname, txtPhonenum, textEmailAdd, txtAddress, txtCity, txtState, txtPostcode, btnSave, btnEdit, btnDelete, lblPhoneNumber, lblEmailAddress, lblAddress, lblCity, lblState, lblPostCode, lblLastName, lblFirstName}));
	}
}
