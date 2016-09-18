package cityLibraryDataBase;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import java.sql.*;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import net.proteanit.sql.DbUtils;
import java.awt.Color;
import javax.swing.border.EmptyBorder;


public class Login_Class {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Class window = new Login_Class();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	Connection connection = null;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JLabel lblEnterYourCard;
	private JLabel lblNewLabel;
	private JLabel lblUserId;
	private JButton btnLogin;
	private JButton btnNewButton;
	private JTextField textField_2;
	private JRadioButton rdbtnAddADocument;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblTitle;
	private JButton btnNewButton_1;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_11;
	private JButton btnNewButton_2;
	private JRadioButton rdbtnNewRadioButton_3;
	private JRadioButton rdbtnNewRadioButton_4;
	private JTextField textField_12;
	private JButton btnNewButton_3;
	private JLabel lblLibraryId;
	private JPanel Reader_Functions_Panel_2;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JTextField textField_13;
	private JButton btnNewButton_6;
	private JLabel lblNewLabel_8;
	private JTable table;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JTable table_1;
	private JTable table_2;
	private JScrollPane scrollPane_2;
	private JTextField textField_14;
	private JTextField textField_15;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JPanel Administrative_Functions_Panel_2;
	private JButton btnMainPage;
	private JButton btnNewButton_11;
	private JRadioButton rdbtnNewRadioButton_6;
	private JTable table_3;
	private JScrollPane scrollPane_3;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JLabel lblReaderId;
	private JLabel lblDocumentId;
	private JLabel lblCopyId;
	private JLabel lblLibraryId_1;
	private JButton btnSubmit;
	private JRadioButton rdbtnNewRadioButton_7;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JButton btnNewButton_12;
	private JLabel lblReaderId_1;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JRadioButton rdbtnNewRadioButton_8;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JButton btnNewButton_13;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JRadioButton rdbtnSearchADocument;
	private JRadioButton rdbtnNewRadioButton_9;
	private JTextField textField_27;
	private JButton btnNewButton_14;
	private JTable table_4;
	private JScrollPane scrollPane_4;
	private JLabel lblNewLabel_9;
	private JRadioButton rdbtnNewRadioButton_10;
	private JScrollPane scrollPane;
	private JRadioButton rdbtnMostBorrowedBooks;
	private JButton btnNewButton_15;
	private JTable table_5;
	private JScrollPane scrollPane_5;
	private JTextField textField_28;
	private JLabel lblEnterBranchName;
	private JPanel Administrative_Functions_Panel_3;
	private JButton button;
	private JButton button_1;
	private JButton btnNewButton_16;
	private JTable table_6;
	private JTextField textField_29;
	private JRadioButton rdbtnNewRadioButton_13;
	private JTable table_7;
	private JScrollPane scrollPane_7;
	private JButton btnAverageFine;
	private JPanel Reader_Functions_Panel_3;
	private JTable table_8;
	private JButton btnNewButton_18;
	private JTable table_9;
	private JTextField textField_10;
	private JTextField textField_30;
	
	

	/**
	 * Create the application.
	 */
	public Login_Class() {
		initialize();
		connection= JDBC_Connection.DBConnection();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 858, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel Main_Menu_Panel = new JPanel();
		frame.getContentPane().add(Main_Menu_Panel, "name_99807475219934");
		Main_Menu_Panel.setLayout(null);
		Main_Menu_Panel.setVisible(true);
		
		JPanel Reader_Functions_Panel = new JPanel();
		Reader_Functions_Panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		frame.getContentPane().add(Reader_Functions_Panel, "name_99857599261853");
		Reader_Functions_Panel.setLayout(null);
		
		Reader_Functions_Panel_2 = new JPanel();
		frame.getContentPane().add(Reader_Functions_Panel_2, "name_137501692570062");
		Reader_Functions_Panel_2.setLayout(null);
		
		Reader_Functions_Panel_3 = new JPanel();
		frame.getContentPane().add(Reader_Functions_Panel_3, "name_274782994772512");
		Reader_Functions_Panel_3.setLayout(null);
		
		JButton button_2 = new JButton("Main Page");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main_Menu_Panel.setVisible(true);
				Reader_Functions_Panel_3.setVisible(false);
			}
		});
		button_2.setBounds(730, 11, 102, 23);
		Reader_Functions_Panel_3.add(button_2);
		
		JButton button_3 = new JButton("Back Page");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reader_Functions_Panel_2.setVisible(true);
				Reader_Functions_Panel_3.setVisible(false);
			}
		});
		button_3.setBounds(730, 426, 102, 23);
		Reader_Functions_Panel_3.add(button_3);
		
		JScrollPane scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(46, 86, 498, 363);
		Reader_Functions_Panel_3.add(scrollPane_8);
		
		table_8 = new JTable();
		scrollPane_8.setViewportView(table_8);
		
		JLabel lblNewLabel_10 = new JLabel("Fine paid by a reader for a document copy borrowed");
		lblNewLabel_10.setBounds(57, 15, 311, 14);
		Reader_Functions_Panel_3.add(lblNewLabel_10);
		
		JButton btnNewButton_17 = new JButton("Check");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String query ="SELECT  READERID,COPYNO, BDTIME,RDTIME ,DATEDIFF(dd,BDTIME,RDTIME) as 'BORROWEDDAYS',"
							+ "CASE WHEN DATEDIFF(dd,BDTIME,RDTIME) > 20 THEN  DATEDIFF(dd,BDTIME,RDTIME) * 0.20 END AS 'Fine' FROM library.dbo.BORROWS WHERE READERID=? ORDER BY FINE DESC	";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, textField_30.getText());
					ResultSet rs= pst.executeQuery();
					table_8.setModel(DbUtils.resultSetToTableModel(rs));
					
					rs.close();
					pst.close();			
				}catch(Exception e1)
				{
					JOptionPane.showInputDialog(null,e1);
				}
			}
		});
		btnNewButton_17.setBounds(184, 40, 89, 23);
		Reader_Functions_Panel_3.add(btnNewButton_17);
		
		textField_30 = new JTextField();
		textField_30.setBounds(67, 40, 86, 20);
		Reader_Functions_Panel_3.add(textField_30);
		textField_30.setColumns(10);
		
		Administrative_Functions_Panel_2 = new JPanel();
		frame.getContentPane().add(Administrative_Functions_Panel_2, "name_209236425669134");
		Administrative_Functions_Panel_2.setLayout(null);
		
		Administrative_Functions_Panel_3 = new JPanel();
		frame.getContentPane().add(Administrative_Functions_Panel_3, "name_235871236856285");
		Administrative_Functions_Panel_3.setLayout(null);

		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String query ="select TITLE  from library.dbo.DOCUMENT A INNER JOIN  library.dbo.PUBLISHER B ON A.PUBLISHERID=B.PUBLISHERID "
							+ "where A.DOCID=? OR A.TITLE=? OR B.PUBNAME=?";
					PreparedStatement pst = connection.prepareStatement(query);
					try {
						pst.setInt(1, Integer.parseInt(textField_2.getText()));
					} catch(Exception ex1){
						pst.setString(1, null);
					}
					
					pst.setString(2, textField_2.getText());
					pst.setString(3, textField_2.getText());
								
					ResultSet rs= pst.executeQuery();
					table_1.setModel(DbUtils.resultSetToTableModel(rs));

					rs.close();
					pst.close();			
				}catch(Exception e1)
				{
					JOptionPane.showInputDialog(null,e1);
				}
			}
		});
		textField_2.setBounds(301, 52, 160, 20);
		Reader_Functions_Panel.add(textField_2);
		textField_2.setColumns(10);
		
		btnNewButton_4 = new JButton("Next Page");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reader_Functions_Panel_2.setVisible(true);
				Reader_Functions_Panel.setVisible(false);
			}
		});
		btnNewButton_4.setBounds(684, 58, 100, 23);
		Reader_Functions_Panel.add(btnNewButton_4);
		
		btnNewButton_7 = new JButton("Main Page");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_Menu_Panel.setVisible(true);
				Reader_Functions_Panel.setVisible(false);
			}
		});
		btnNewButton_7.setBounds(684, 11, 100, 23);
		Reader_Functions_Panel.add(btnNewButton_7);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setEnabled(false);
		scrollPane_1.setBounds(311, 83, 137, 41);
		Reader_Functions_Panel.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Document Reservation");
		rdbtnNewRadioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setEditable(false);
				textField_15.setEditable(true);
				textField_16.setEditable(true);
				textField_17.setEditable(true);
				textField_18.setEditable(true);
				textField_19.setEditable(false);
				textField_20.setEditable(false);
				textField_21.setEditable(false);
				textField_22.setEditable(false);
				textField_23.setEditable(false);
				textField_24.setEditable(false);
				textField_25.setEditable(false);
				textField_26.setEditable(false);
				btnSubmit.setEnabled(true);
				btnNewButton_12.setEnabled(false);
				btnNewButton_13.setEnabled(false);
				scrollPane_1.setEnabled(false);
			}
		});
		rdbtnNewRadioButton_5.setBounds(27, 192, 172, 23);
		Reader_Functions_Panel.add(rdbtnNewRadioButton_5);
		
		textField_15 = new JTextField();
		textField_15.setEditable(false);
		textField_15.setBounds(124, 238, 86, 20);
		Reader_Functions_Panel.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setEditable(false);
		textField_16.setBounds(124, 269, 86, 20);
		Reader_Functions_Panel.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setEditable(false);
		textField_17.setBounds(124, 300, 86, 20);
		Reader_Functions_Panel.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setEditable(false);
		textField_18.setBounds(124, 331, 86, 20);
		Reader_Functions_Panel.add(textField_18);
		textField_18.setColumns(10);
		
		lblReaderId = new JLabel("Reader ID:");
		lblReaderId.setBounds(25, 241, 67, 14);
		Reader_Functions_Panel.add(lblReaderId);
		
		lblDocumentId = new JLabel("Document ID:");
		lblDocumentId.setBounds(25, 272, 80, 14);
		Reader_Functions_Panel.add(lblDocumentId);
		
		lblCopyId = new JLabel("Copy ID:");
		lblCopyId.setBounds(25, 303, 46, 14);
		Reader_Functions_Panel.add(lblCopyId);
		
		lblLibraryId_1 = new JLabel("Library ID:");
		lblLibraryId_1.setBounds(25, 334, 74, 14);
		Reader_Functions_Panel.add(lblLibraryId_1);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setEnabled(false);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String query = "INSERT INTO Library.dbo.RESERVES (RESUMBER,READERID,DOCID,COPYNO,LIBID,DTIME) VALUES ((Select max(RESUMBER)+1 from Library.dbo.RESERVES),?,?,?,?,getDate())";
					PreparedStatement pst = connection.prepareStatement(query);
					pst = connection.prepareStatement(query);
					pst.setString(1, textField_15.getText());
					pst.setString(2, textField_16.getText());
					pst.setString(3, textField_17.getText());
					pst.setString(4, textField_18.getText());
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null,"Document Reserved");
					
					pst.close();
				}catch(Exception e2)
				{
					JOptionPane.showInputDialog(null,e2);
				}
					
		
			}
		});
		btnSubmit.setBounds(64, 385, 89, 23);
		Reader_Functions_Panel.add(btnSubmit);
		
		rdbtnNewRadioButton_7 = new JRadioButton("Document Return");
		rdbtnNewRadioButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setEditable(false);
				textField_15.setEditable(false);
				textField_16.setEditable(false);
				textField_17.setEditable(false);
				textField_18.setEditable(false);
				textField_19.setEditable(true);
				textField_20.setEditable(true);
				textField_21.setEditable(true);
				textField_22.setEditable(true);
				textField_23.setEditable(false);
				textField_24.setEditable(false);
				textField_25.setEditable(false);
				textField_26.setEditable(false);
				btnSubmit.setEnabled(false);
				btnNewButton_12.setEnabled(true);
				btnNewButton_13.setEnabled(false);
				scrollPane_1.setEnabled(false);
			}
		});
		rdbtnNewRadioButton_7.setBounds(599, 192, 147, 23);
		Reader_Functions_Panel.add(rdbtnNewRadioButton_7);
		
		textField_19 = new JTextField();
		textField_19.setEditable(false);
		textField_19.setBounds(684, 238, 86, 20);
		Reader_Functions_Panel.add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setEditable(false);
		textField_20.setBounds(684, 269, 86, 20);
		Reader_Functions_Panel.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setEditable(false);
		textField_21.setBounds(684, 300, 86, 20);
		Reader_Functions_Panel.add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setEditable(false);
		textField_22.setBounds(684, 331, 86, 20);
		Reader_Functions_Panel.add(textField_22);
		textField_22.setColumns(10);
		
		btnNewButton_12 = new JButton("Submit");
		btnNewButton_12.setEnabled(false);
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String query = "UPDATE library.dbo.BORROWS SET RDTIME=getDate() WHERE READERID=? AND DOCID=? AND COPYNO=? AND LIBID=?";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, textField_19.getText());
					pst.setString(2, textField_20.getText());
					pst.setString(3, textField_21.getText());
					pst.setString(4, textField_22.getText());
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null,"Document returned");
					
					pst.close();
				}catch(Exception e2)
				{
					JOptionPane.showInputDialog(null,e2);
				}
			}
		});
		btnNewButton_12.setBounds(619, 385, 89, 23);
		Reader_Functions_Panel.add(btnNewButton_12);
		
		lblReaderId_1 = new JLabel("Reader ID:");
		lblReaderId_1.setBounds(564, 241, 86, 14);
		Reader_Functions_Panel.add(lblReaderId_1);
		
		label = new JLabel("Document ID:");
		label.setBounds(564, 272, 80, 14);
		Reader_Functions_Panel.add(label);
		
		label_1 = new JLabel("Copy ID:");
		label_1.setBounds(564, 303, 46, 14);
		Reader_Functions_Panel.add(label_1);
		
		label_2 = new JLabel("Library ID:");
		label_2.setBounds(564, 334, 74, 14);
		Reader_Functions_Panel.add(label_2);
		
		rdbtnNewRadioButton_8 = new JRadioButton("Document checkout");
		rdbtnNewRadioButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setEditable(false);
				textField_15.setEditable(false);
				textField_16.setEditable(false);
				textField_17.setEditable(false);
				textField_18.setEditable(false);
				textField_19.setEditable(false);
				textField_20.setEditable(false);
				textField_21.setEditable(false);
				textField_22.setEditable(false);
				textField_23.setEditable(true);
				textField_24.setEditable(true);
				textField_25.setEditable(true);
				textField_26.setEditable(true);
				btnSubmit.setEnabled(false);
				btnNewButton_12.setEnabled(false);
				btnNewButton_13.setEnabled(true);
				scrollPane_1.setEnabled(false);
			}
		});
		rdbtnNewRadioButton_8.setBounds(296, 192, 147, 23);
		Reader_Functions_Panel.add(rdbtnNewRadioButton_8);
		
		textField_23 = new JTextField();
		textField_23.setEditable(false);
		textField_23.setBounds(404, 238, 86, 20);
		Reader_Functions_Panel.add(textField_23);
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setEditable(false);
		textField_24.setBounds(404, 269, 86, 20);
		Reader_Functions_Panel.add(textField_24);
		textField_24.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setEditable(false);
		textField_25.setBounds(404, 300, 86, 20);
		Reader_Functions_Panel.add(textField_25);
		textField_25.setColumns(10);
		
		textField_26 = new JTextField();
		textField_26.setEditable(false);
		textField_26.setBounds(404, 331, 86, 20);
		Reader_Functions_Panel.add(textField_26);
		textField_26.setColumns(10);
		
		btnNewButton_13 = new JButton("Submit");
		btnNewButton_13.setEnabled(false);
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					//String query0 = "SELECT MAX(BORNUMBER) FROM library.dbo.BORROWS;"
					String query = "INSERT INTO library.dbo.BORROWS (BORNUMBER,READERID,DOCID,COPYNO,LIBID,BDTIME) VALUES ((select max(BORNUMBER)+1 FROM library.dbo.borrows), ?,?,?,?,getDate())";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, textField_23.getText());
					pst.setString(2, textField_24.getText());
					pst.setString(3, textField_25.getText());
					pst.setString(4, textField_26.getText());
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null,"Document Borrowed");
					
					pst.close();
				}catch(Exception e2)
				{
					JOptionPane.showInputDialog(null,e2);
				}
			}
		});
		btnNewButton_13.setBounds(345, 385, 89, 23);
		Reader_Functions_Panel.add(btnNewButton_13);
		
		label_3 = new JLabel("Reader ID:");
		label_3.setBounds(296, 241, 67, 14);
		Reader_Functions_Panel.add(label_3);
		
		label_4 = new JLabel("Document ID:");
		label_4.setBounds(296, 272, 80, 14);
		Reader_Functions_Panel.add(label_4);
		
		label_5 = new JLabel("Copy ID:");
		label_5.setBounds(296, 303, 46, 14);
		Reader_Functions_Panel.add(label_5);
		
		label_6 = new JLabel("Library ID:");
		label_6.setBounds(296, 334, 74, 14);
		Reader_Functions_Panel.add(label_6);
		
		rdbtnSearchADocument = new JRadioButton("Search a document by ID, title, or publisher name");
		rdbtnSearchADocument.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setEditable(true);
				textField_15.setEditable(false);
				textField_16.setEditable(false);
				textField_17.setEditable(false);
				textField_18.setEditable(false);
				textField_19.setEditable(false);
				textField_20.setEditable(false);
				textField_21.setEditable(false);
				textField_22.setEditable(false);
				textField_23.setEditable(false);
				textField_24.setEditable(false);
				textField_25.setEditable(false);
				textField_26.setEditable(false);
				btnSubmit.setEnabled(false);
				btnNewButton_12.setEnabled(false);
				btnNewButton_13.setEnabled(false);
				scrollPane_1.setEnabled(true);
			}
		});
		rdbtnSearchADocument.setBounds(234, 11, 336, 23);
		Reader_Functions_Panel.add(rdbtnSearchADocument);
		Reader_Functions_Panel.setVisible(false);
		
		JPanel Administrative_Functions_Panel = new JPanel();
		frame.getContentPane().add(Administrative_Functions_Panel, "name_100473405911516");
		Administrative_Functions_Panel.setLayout(null);
		
		rdbtnAddADocument = new JRadioButton("Add a Document copy");
		rdbtnAddADocument.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_3.setEditable(true);
				textField_7.setEditable(true);
				textField_8.setEditable(true);
				textField_11.setEditable(true);
				btnNewButton_2.setEnabled(true);
				textField_4.setEditable(false);
				textField_5.setEditable(false);
				textField_6.setEditable(false);
				textField_9.setEditable(false);
				btnNewButton_1.setEnabled(false);
				textField_12.setEditable(false);
				btnNewButton_3.setEnabled(false);
				textField_14.setEditable(false);
				scrollPane_2.setEnabled(false);
			}
		});
		rdbtnAddADocument.setBounds(40, 40, 152, 23);
		Administrative_Functions_Panel.add(rdbtnAddADocument);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(128, 70, 86, 20);
		Administrative_Functions_Panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(352, 70, 86, 20);
		Administrative_Functions_Panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(352, 101, 86, 20);
		Administrative_Functions_Panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(352, 177, 86, 20);
		Administrative_Functions_Panel.add(textField_6);
		textField_6.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Position:");
		lblNewLabel_1.setBounds(40, 180, 71, 14);
		Administrative_Functions_Panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Document ID:");
		lblNewLabel_2.setBounds(32, 73, 79, 14);
		Administrative_Functions_Panel.add(lblNewLabel_2);
		
		lblTitle = new JLabel("Copy NO:");
		lblTitle.setBounds(40, 104, 61, 14);
		Administrative_Functions_Panel.add(lblTitle);
		
		btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				String query = "INSERT INTO Library.dbo.READER(READERID,RTYPE,RNAME,ADDRESS) VALUES (?,?,?,?);";
				PreparedStatement pst = connection.prepareStatement(query);
				pst.setString(1, textField_4.getText());
				pst.setString(2, textField_5.getText());
				pst.setString(3, textField_6.getText());
				pst.setString(4, textField_9.getText());
				
				
				pst.execute();
				
				JOptionPane.showMessageDialog(null,"Data Saved");
				
				pst.close();
			}catch(Exception e2)
			{
				JOptionPane.showInputDialog(null,e2);
			}
				
				
			}
		});
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBounds(352, 230, 86, 23);
		Administrative_Functions_Panel.add(btnNewButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton(" Add a new reader");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_3.setEditable(false);
				textField_7.setEditable(false);
				textField_8.setEditable(false);
				textField_11.setEditable(false);
				btnNewButton_2.setEnabled(false);
				textField_4.setEditable(true);
				textField_5.setEditable(true);
				textField_6.setEditable(true);
				textField_9.setEditable(true);
				btnNewButton_1.setEnabled(true);
				textField_12.setEditable(false);
				btnNewButton_3.setEnabled(false);
				textField_14.setEditable(false);
				scrollPane_2.setEnabled(false);
				
			}
		});
		rdbtnNewRadioButton_2.setBounds(342, 40, 128, 23);
		Administrative_Functions_Panel.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("Address:");
		lblNewLabel_3.setBounds(274, 180, 68, 14);
		Administrative_Functions_Panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Type:");
		lblNewLabel_4.setBounds(284, 104, 46, 14);
		Administrative_Functions_Panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Name:");
		lblNewLabel_5.setBounds(284, 142, 46, 14);
		Administrative_Functions_Panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Reader ID:");
		lblNewLabel_6.setBounds(274, 73, 70, 14);
		Administrative_Functions_Panel.add(lblNewLabel_6);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(128, 101, 86, 20);
		Administrative_Functions_Panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setBounds(128, 139, 85, 20);
		Administrative_Functions_Panel.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setBounds(352, 139, 86, 20);
		Administrative_Functions_Panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setBounds(128, 177, 86, 20);
		Administrative_Functions_Panel.add(textField_11);
		textField_11.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(21, 128, 265, 302);
		Reader_Functions_Panel_2.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		btnNewButton_2 = new JButton("Submit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String query ="INSERT INTO Library.dbo.Copy (DOCID,COPYNO,LIBID,POSITION) VALUES (?,?,?,?)";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setInt(1, Integer.parseInt(textField_3.getText()));
					pst.setInt(2, Integer.parseInt(textField_7.getText()));
					pst.setInt(3, Integer.parseInt(textField_8.getText()));
					pst.setString(4, textField_11.getText());
					
					pst.execute();
					
					JOptionPane.showMessageDialog(null,"Data Saved");
					
					pst.close();
				}catch(Exception e2)
				{
					JOptionPane.showInputDialog(null,e2);
				}
					
					
				}
				
			
		});
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.setBounds(128, 220, 89, 23);
		Administrative_Functions_Panel.add(btnNewButton_2);
		
		JLabel lblPublisherId = new JLabel("Library ID:");
		lblPublisherId.setBounds(40, 142, 68, 14);
		Administrative_Functions_Panel.add(lblPublisherId);
		Administrative_Functions_Panel.setVisible(false);
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Reader");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblEnterYourCard.setEnabled(true);
				textField.setEditable(true);
				btnLogin.setEnabled(true);
				lblUserId.setEnabled(false);
				lblNewLabel.setEnabled(false);
				passwordField.setEditable(false);
				textField_1.setEditable(false);
				btnNewButton.setEnabled(false);
			}
		});
		rdbtnNewRadioButton.setBounds(196, 76, 109, 23);
		Main_Menu_Panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Administrator");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblUserId.setEnabled(true);
				lblNewLabel.setEnabled(true);
				passwordField.setEditable(true);
				textField_1.setEditable(true);
				btnNewButton.setEnabled(true);
				lblEnterYourCard.setEnabled(false);
				textField.setEditable(false);
				btnLogin.setEnabled(false);
			}
		});
		rdbtnNewRadioButton_1.setBounds(431, 76, 109, 23);
		Main_Menu_Panel.add(rdbtnNewRadioButton_1);
		
		
		rdbtnNewRadioButton_3 = new JRadioButton("Print Branch Information");
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_12.setEditable(true);
				btnNewButton_3.setEnabled(true);
				textField_3.setEditable(false);
				textField_7.setEditable(false);
				textField_8.setEditable(false);
				textField_11.setEditable(false);
				btnNewButton_2.setEnabled(false);
				textField_4.setEditable(false);
				textField_5.setEditable(false);
				textField_6.setEditable(false);
				textField_9.setEditable(false);
				btnNewButton_1.setEnabled(false);
				textField_14.setEditable(false);
				scrollPane_2.setEnabled(false);
				
			}
		});
		rdbtnNewRadioButton_3.setBounds(533, 40, 175, 23);
		Administrative_Functions_Panel.add(rdbtnNewRadioButton_3);
		
		rdbtnNewRadioButton_4 = new JRadioButton("Search and Check status of the Document copy");
		rdbtnNewRadioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_14.setEditable(true);
				scrollPane_2.setEnabled(true);
				textField_12.setEditable(false);
				btnNewButton_3.setEnabled(false);
				textField_3.setEditable(false);
				textField_7.setEditable(false);
				textField_8.setEditable(false);
				textField_11.setEditable(false);
				btnNewButton_2.setEnabled(false);
				textField_4.setEditable(false);
				textField_5.setEditable(false);
				textField_6.setEditable(false);
				textField_9.setEditable(false);
				btnNewButton_1.setEnabled(false);
			}
		});
		rdbtnNewRadioButton_4.setBounds(40, 304, 346, 23);
		Administrative_Functions_Panel.add(rdbtnNewRadioButton_4);
		
		rdbtnNewRadioButton_9 = new JRadioButton("Enter Reader ID:");
		rdbtnNewRadioButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_13.setEditable(false);
				textField_27.setEditable(true);
				btnNewButton_14.setEnabled(true);
				btnNewButton_6.setEnabled(false);
				scrollPane.setEnabled(false);
				scrollPane_4.setEnabled(true);	
			}
		});
		rdbtnNewRadioButton_9.setBounds(379, 26, 131, 23);
		Reader_Functions_Panel_2.add(rdbtnNewRadioButton_9);
		
		rdbtnNewRadioButton_10 = new JRadioButton("Enter Publisher ID:");
		rdbtnNewRadioButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_13.setEditable(true);
				textField_27.setEditable(false);
				btnNewButton_14.setEnabled(false);
				btnNewButton_6.setEnabled(true);
				scrollPane.setEnabled(true);
				scrollPane_4.setEnabled(false);
			}
		});
		rdbtnNewRadioButton_10.setBounds(21, 26, 182, 23);
		Reader_Functions_Panel_2.add(rdbtnNewRadioButton_10);
		
		rdbtnNewRadioButton_6 = new JRadioButton("Most borrowed books in a branch");
		rdbtnNewRadioButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_15.setEnabled(false);
				textField_28.setEditable(true);
			}
		});
		rdbtnNewRadioButton_6.setBounds(25, 24, 274, 23);
		Administrative_Functions_Panel_2.add(rdbtnNewRadioButton_6);
		
		
		rdbtnMostBorrowedBooks = new JRadioButton("Most Popular Books in the Year");
		rdbtnMostBorrowedBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_15.setEnabled(true);
				textField_28.setEditable(false);
			}
		});
		rdbtnMostBorrowedBooks.setBounds(403, 24, 262, 23);
		Administrative_Functions_Panel_2.add(rdbtnMostBorrowedBooks);
		
		JRadioButton rdbtnNewRadioButton_12 = new JRadioButton("Frequent borrowers in a branch");
		rdbtnNewRadioButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAverageFine.setEnabled(false);
				textField_29.setEditable(true);
			}
		});
		rdbtnNewRadioButton_12.setBounds(28, 11, 262, 23);
		Administrative_Functions_Panel_3.add(rdbtnNewRadioButton_12);
		
		rdbtnNewRadioButton_13 = new JRadioButton("Average fine paid per reader");
		rdbtnNewRadioButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAverageFine.setEnabled(true);
				textField_29.setEditable(false);
			}
		});
		rdbtnNewRadioButton_13.setBounds(364, 11, 295, 23);
		Administrative_Functions_Panel_3.add(rdbtnNewRadioButton_13);

		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton);
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(rdbtnNewRadioButton_2);
		group1.add(rdbtnAddADocument);
		group1.add(rdbtnNewRadioButton_4);
		group1.add(rdbtnNewRadioButton_3);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(rdbtnSearchADocument);
		group2.add(rdbtnNewRadioButton_8);
		group2.add(rdbtnNewRadioButton_7);
		group2.add(rdbtnNewRadioButton_5);
		
		ButtonGroup group3 = new ButtonGroup();
		group3.add(rdbtnNewRadioButton_9);
		group3.add(rdbtnNewRadioButton_10);
		
		ButtonGroup group4 = new ButtonGroup();
		group4.add(rdbtnMostBorrowedBooks);
		group4.add(rdbtnNewRadioButton_6);
		
		ButtonGroup group5 = new ButtonGroup();
		group5.add(rdbtnNewRadioButton_12);
		group5.add(rdbtnNewRadioButton_13);
		

		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setBounds(611, 70, 86, 20);
		Administrative_Functions_Panel.add(textField_12);
		textField_12.setColumns(10);
		
		btnNewButton_3 = new JButton("Submit");
		btnNewButton_3.setEnabled(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				String query ="select LNAME,LLOCATION from Library.dbo.BRANCH where LIBID=?";
				PreparedStatement pst = connection.prepareStatement(query);
				pst.setInt(1, Integer.parseInt(textField_12.getText()));
				ResultSet rs= pst.executeQuery();
				//String a  = rs.getString("LNAME");
				//String b = rs.getString("LLOCATION");
				//lblLibraryName.setText(a);	
				//lblLocationName.setText(b);
				table_9.setModel(DbUtils.resultSetToTableModel(rs));
				JOptionPane.showMessageDialog(null,"Valid ID Entered");
				
				rs.close();
				pst.close();
			}catch(Exception e2)
			{
				JOptionPane.showInputDialog(null,e2);
			}		
			}
		});
		btnNewButton_3.setBounds(573, 100, 89, 23);
		Administrative_Functions_Panel.add(btnNewButton_3);
		
		lblLibraryId = new JLabel("Library ID:");
		lblLibraryId.setBounds(530, 73, 61, 14);
		Administrative_Functions_Panel.add(lblLibraryId);
		

		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setEnabled(false);
		scrollPane_2.setBounds(40, 375, 258, 55);
		Administrative_Functions_Panel.add(scrollPane_2);
		
		table_2 = new JTable();
		scrollPane_2.setViewportView(table_2);
		
		textField_14 = new JTextField();
		textField_14.setEditable(false);
		textField_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String query ="SELECT DOCID,COPYNO, CASE WHEN RESUMBER IS NOT NULL THEN 'R' END AS STATUS FROM Library.dbo.RESERVES WHERE COPYNO=? AND DOCID=?"
							+ " UNION SELECT DOCID,COPYNO,CASE WHEN BORNUMBER IS NOT NULL THEN 'B'  END AS STATUS FROM Library.dbo.BORROWS WHERE COPYNO=? AND DOCID=?"
							+ " UNION SELECT DOCID,COPYNO,CASE WHEN COPYNO IS NOT NULL THEN 'A' END AS STATUS FROM library.dbo.COPY WHERE COPYNO NOT IN ( SELECT COPYNO FROM Library.dbo.BORROWS UNION SELECT COPYNO FROM Library.dbo.RESERVES)"
							+ " AND COPYNO=? AND DOCID=?";
					PreparedStatement pst = connection.prepareStatement(query);
					 
					pst.setString(1, textField_10.getText());
					pst.setString(2, textField_14.getText());
					pst.setString(3, textField_10.getText());
					pst.setString(4, textField_14.getText());
					pst.setString(5, textField_10.getText());
					pst.setString(6, textField_14.getText());
								
					ResultSet rs= pst.executeQuery();
					table_2.setModel(DbUtils.resultSetToTableModel(rs));

					rs.close();
					pst.close();			
				}catch(Exception e1)
				{
					JOptionPane.showInputDialog(null,e1);
				}
			}
		});
		textField_14.setBounds(81, 334, 97, 20);
		Administrative_Functions_Panel.add(textField_14);
		textField_14.setColumns(10);
		
		btnNewButton_9 = new JButton("Next Page");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Administrative_Functions_Panel_2.setVisible(true);
				Administrative_Functions_Panel.setVisible(false);
			}
		});
		btnNewButton_9.setBounds(714, 426, 97, 23);
		Administrative_Functions_Panel.add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("Main Page");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_Menu_Panel.setVisible(true);
				Administrative_Functions_Panel.setVisible(false);
			}
		});
		btnNewButton_10.setBounds(714, 11, 97, 23);
		Administrative_Functions_Panel.add(btnNewButton_10);
		
		JScrollPane scrollPane_9 = new JScrollPane();
		scrollPane_9.setBounds(533, 142, 159, 55);
		Administrative_Functions_Panel.add(scrollPane_9);
		
		table_9 = new JTable();
		scrollPane_9.setViewportView(table_9);
		
		textField_10 = new JTextField();
		textField_10.setBounds(202, 334, 86, 20);
		Administrative_Functions_Panel.add(textField_10);
		textField_10.setColumns(10);
		
		
		lblEnterYourCard = new JLabel("Enter your card number");
		lblEnterYourCard.setEnabled(false);
		lblEnterYourCard.setBounds(196, 117, 140, 14);
		Main_Menu_Panel.add(lblEnterYourCard);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(206, 140, 86, 20);
		Main_Menu_Panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(468, 140, 86, 20);
		Main_Menu_Panel.add(textField_1);
		textField_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setEditable(false);
		passwordField.setBounds(468, 171, 86, 20);
		Main_Menu_Panel.add(passwordField);
		
        lblUserId = new JLabel("User ID:");
		lblUserId.setEnabled(false);
		lblUserId.setBounds(396, 143, 50, 14);
		Main_Menu_Panel.add(lblUserId);
		
        lblNewLabel = new JLabel("Password:");
		lblNewLabel.setEnabled(false);
		lblNewLabel.setBounds(396, 174, 62, 14);
		Main_Menu_Panel.add(lblNewLabel);
		
		btnNewButton = new JButton("Login");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String query ="select * from Library.dbo.ADMINISTRATOR where ADMIN_ID=? and PASSWORD=? ";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, textField_1.getText());
					pst.setString(2, passwordField.getText());

					ResultSet rs= pst.executeQuery();
					int  count=0;
					while(rs.next()){
						count = count+1;
					}
					if(count==1)
					{
						JOptionPane.showMessageDialog(null, "Username and Password is Correct");
						Administrative_Functions_Panel.setVisible(true);
						Main_Menu_Panel.setVisible(false);
					}
					else if(count>1)
					{
						JOptionPane.showMessageDialog(null, "Duplicate Username and Password");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Username and Password is not correct Try Again");
					}
					
					rs.close();
					pst.close();			
				}catch(Exception e2)
				{
					JOptionPane.showInputDialog(null,e2);
				}
			}
		});
		btnNewButton.setBounds(474, 214, 77, 23);
		Main_Menu_Panel.add(btnNewButton);
		
		btnLogin = new JButton("Login");
		btnLogin.setEnabled(false);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String query ="select * from Library.dbo.READER where READERID=? ";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, textField.getText());

					ResultSet rs= pst.executeQuery();
					int  count=0;
					while(rs.next()){
						count = count+1;
					}
					if(count==1)
					{
						JOptionPane.showMessageDialog(null, "card number entered is Correct");
						Reader_Functions_Panel.setVisible(true);
						Main_Menu_Panel.setVisible(false);
					}
					else if(count>1)
					{
						JOptionPane.showMessageDialog(null, "Duplicate card number ");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "card number is not correct Try Again");
					}
					
					rs.close();
					pst.close();			
				}catch(Exception e1)
				{
					JOptionPane.showInputDialog(null,e1);
				}	
			}
		});
		btnLogin.setBounds(206, 171, 86, 23);
		Main_Menu_Panel.add(btnLogin);
		

		
		btnNewButton_5 = new JButton("Back Page");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reader_Functions_Panel.setVisible(true);
				Reader_Functions_Panel_2.setVisible(false);
				
			}
		});
		btnNewButton_5.setBounds(687, 418, 102, 23);
		Reader_Functions_Panel_2.add(btnNewButton_5);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setBounds(31, 56, 86, 20);
		Reader_Functions_Panel_2.add(textField_13);
		textField_13.setColumns(10);
		
		btnNewButton_6 = new JButton("submit");
		btnNewButton_6.setEnabled(false);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String query ="select DOCID,TITLE from library.dbo.DOCUMENT where PUBLISHERID=? ";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, textField_13.getText());

					ResultSet rs= pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					rs.close();
					pst.close();			
				}catch(Exception e1)
				{
					JOptionPane.showInputDialog(null,e1);
				}	
			}
		});
		btnNewButton_6.setBounds(149, 55, 89, 23);
		Reader_Functions_Panel_2.add(btnNewButton_6);
		
		lblNewLabel_8 = new JLabel("Document id and document titles of the Publisher");
		lblNewLabel_8.setBounds(45, 96, 301, 14);
		Reader_Functions_Panel_2.add(lblNewLabel_8);
		

		
		btnNewButton_8 = new JButton("Main Page");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main_Menu_Panel.setVisible(true);
				Reader_Functions_Panel_2.setVisible(false);
			}
		});
		btnNewButton_8.setBounds(687, 11, 102, 23);
		Reader_Functions_Panel_2.add(btnNewButton_8);
		
	
		
		textField_27 = new JTextField();
		textField_27.setEditable(false);
		textField_27.setBounds(389, 56, 86, 20);
		Reader_Functions_Panel_2.add(textField_27);
		textField_27.setColumns(10);
		
		btnNewButton_14 = new JButton("Submit");
		btnNewButton_14.setEnabled(false);
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String query ="SELECT DOCID,CASE WHEN COPYNO NOT IN (select COPYNO FROM library.dbo.BORROWS UNION SELECT COPYNO FROM library.dbo.RESERVES) THEN 'Avaialable' ELSE 'NotAvaialble' END AS Status FROM library.dbo.RESERVES where READERID=?;";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, textField_27.getText());
					//pst.setString(2, textField_27.getText());
					//pst.setString(3, textField_27.getText());
					
					ResultSet rs= pst.executeQuery();
					table_4.setModel(DbUtils.resultSetToTableModel(rs));
					
					rs.close();
					pst.close();			
				}catch(Exception e1)
				{
					JOptionPane.showInputDialog(null,e1);
				}
			}
		});
		btnNewButton_14.setBounds(505, 55, 89, 23);
		Reader_Functions_Panel_2.add(btnNewButton_14);
		
		scrollPane_4 = new JScrollPane();
		scrollPane_4.setEnabled(false);
		scrollPane_4.setBounds(379, 128, 241, 302);
		Reader_Functions_Panel_2.add(scrollPane_4);
		
		table_4 = new JTable();
		scrollPane_4.setViewportView(table_4);
		
		lblNewLabel_9 = new JLabel("Documents Reserved");
		lblNewLabel_9.setBounds(388, 96, 157, 14);
		Reader_Functions_Panel_2.add(lblNewLabel_9);
		
		btnNewButton_18 = new JButton("Next Page");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reader_Functions_Panel_3.setVisible(true);
				Reader_Functions_Panel_2.setVisible(false);
			}
		});
		btnNewButton_18.setBounds(687, 384, 102, 23);
		Reader_Functions_Panel_2.add(btnNewButton_18);
		

		
		btnMainPage = new JButton("Main Page");
		btnMainPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_Menu_Panel.setVisible(true);
				Administrative_Functions_Panel_2.setVisible(false);
			}
		});
		btnMainPage.setBounds(706, 11, 109, 23);
		Administrative_Functions_Panel_2.add(btnMainPage);
		
		btnNewButton_11 = new JButton("Back Page");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Administrative_Functions_Panel.setVisible(true);
				Administrative_Functions_Panel_2.setVisible(false);
			}
		});
		btnNewButton_11.setBounds(706, 378, 109, 23);
		Administrative_Functions_Panel_2.add(btnNewButton_11);
		

		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(27, 106, 272, 331);
		Administrative_Functions_Panel_2.add(scrollPane_3);
		
		table_3 = new JTable();
		scrollPane_3.setViewportView(table_3);

		
		btnNewButton_15 = new JButton("Submit");
		btnNewButton_15.setEnabled(false);
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String query ="SELECT TOP 10 A.DOCID,B.TITLE FROM library.dbo.BORROWS A INNER JOIN Library.dbo.BOOK C ON A.DOCID=C.DOCID INNER JOIN library.dbo.DOCUMENT B ON A.DOCID=B.DOCID where YEAR(A.BDTIME)  between YEAR(getDate())  and YEAR(DATEADD(year,1,getDate())) "
							+ "GROUP BY A.DOCID,B.TITLE ORDER BY COUNT(A.DOCID) desc;";
					PreparedStatement pst = connection.prepareStatement(query);

					ResultSet rs= pst.executeQuery();
					table_5.setModel(DbUtils.resultSetToTableModel(rs));
					
					rs.close();
					pst.close();			
				}catch(Exception e1)
				{
					JOptionPane.showInputDialog(null,e1);
				}	
			}
		});
		btnNewButton_15.setBounds(462, 72, 101, 23);
		Administrative_Functions_Panel_2.add(btnNewButton_15);
		
		scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(375, 106, 262, 332);
		Administrative_Functions_Panel_2.add(scrollPane_5);
		
		table_5 = new JTable();
		scrollPane_5.setViewportView(table_5);
		
		textField_28 = new JTextField();
		textField_28.setEditable(false);
		textField_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String query ="SELECT TOP 10 A.DOCID,C.TITLE,B.LIBID FROM library.dbo.BORROWS A INNER JOIN library.dbo.BOOK D ON A.DOCID=D.DOCID INNER JOIN library.dbo.BRANCH B "
							+ "ON A.LIBID=B.LIBID INNER JOIN library.dbo.DOCUMENT C ON A.DOCID=C.DOCID where B.LIBID=? GROUP BY A.DOCID,C.TITLE,B.LIBID ORDER BY COUNT(A.DOCID) desc;";
					PreparedStatement pst = connection.prepareStatement(query);
					
					pst.setString(1, textField_28.getText());

					ResultSet rs= pst.executeQuery();
					table_3.setModel(DbUtils.resultSetToTableModel(rs));
					
					rs.close();
					pst.close();			
				}catch(Exception e1)
				{
					JOptionPane.showInputDialog(null,e1);
				}
			}
		});
		textField_28.setBounds(166, 68, 86, 20);
		Administrative_Functions_Panel_2.add(textField_28);
		textField_28.setColumns(10);
		
		lblEnterBranchName = new JLabel("Enter Branch ID:");
		lblEnterBranchName.setBounds(25, 71, 131, 14);
		Administrative_Functions_Panel_2.add(lblEnterBranchName);
		
		btnNewButton_16 = new JButton("Next Page");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Administrative_Functions_Panel_3.setVisible(true);
				Administrative_Functions_Panel_2.setVisible(false);
			}
		});
		btnNewButton_16.setBounds(706, 412, 109, 23);
		Administrative_Functions_Panel_2.add(btnNewButton_16);
		
		button = new JButton("Main Page");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_Menu_Panel.setVisible(true);
				Administrative_Functions_Panel_3.setVisible(false);
			}
		});
		button.setBounds(723, 11, 109, 23);
		Administrative_Functions_Panel_3.add(button);
		
		button_1 = new JButton("Back Page");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Administrative_Functions_Panel_2.setVisible(true);
				Administrative_Functions_Panel_3.setVisible(false);
			}
		});
		button_1.setBounds(723, 426, 109, 23);
		Administrative_Functions_Panel_3.add(button_1);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(26, 85, 264, 347);
		Administrative_Functions_Panel_3.add(scrollPane_6);
		
		table_6 = new JTable();
		scrollPane_6.setViewportView(table_6);
		
		textField_29 = new JTextField();
		textField_29.setEditable(false);
		textField_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					String query ="SELECT  C.RNAME,count(bornumber) AS COUNT  from library.dbo.BORROWS A INNER JOIN library.dbo.BRANCH B ON A.LIBID=B.LIBID INNER JOIN library.dbo.READER C ON "
							+ "A.READERID=C.READERID where B.LIBID=? GROUP BY BORNUMBER,B.LIBID,C.RNAME ORDER BY BORNUMBER,B.LIBID,count(bornumber)";
					PreparedStatement pst = connection.prepareStatement(query);
					
					pst.setString(1, textField_29.getText());

					ResultSet rs= pst.executeQuery();
					table_6.setModel(DbUtils.resultSetToTableModel(rs));
					
					rs.close();
					pst.close();			
				}catch(Exception e1)
				{
					JOptionPane.showInputDialog(null,e1);
				}
	
			}
		});
		textField_29.setBounds(176, 53, 102, 20);
		Administrative_Functions_Panel_3.add(textField_29);
		textField_29.setColumns(10);
		
		JLabel label_7 = new JLabel("");
		label_7.setBounds(58, 53, 46, 14);
		Administrative_Functions_Panel_3.add(label_7);
		
		JLabel lblEnterBranchId = new JLabel("Enter Branch ID:");
		lblEnterBranchId.setBounds(26, 53, 131, 14);
		Administrative_Functions_Panel_3.add(lblEnterBranchId);
		
		scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(364, 85, 237, 347);
		Administrative_Functions_Panel_3.add(scrollPane_7);
		
		table_7 = new JTable();
		scrollPane_7.setViewportView(table_7);
		
		btnAverageFine = new JButton("Average Fine");
		btnAverageFine.setEnabled(false);
		btnAverageFine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String query ="SELECT A.READERID,AVG(A.Fine) AS AvgFine from ( SELECT  READERID,COPYNO, BDTIME,RDTIME ,DATEDIFF(dd,BDTIME,RDTIME) as 'BORROWEDDAYS', CASE WHEN DATEDIFF(dd,BDTIME,RDTIME) > 20 THEN  DATEDIFF(dd,BDTIME,RDTIME) * 0.20 END AS 'Fine' FROM library.dbo.BORROWS ) AS A GROUP BY READERID ORDER BY AVG(A.FINE) DESC;";
					PreparedStatement pst = connection.prepareStatement(query);

					ResultSet rs= pst.executeQuery();
					table_7.setModel(DbUtils.resultSetToTableModel(rs));
					
					rs.close();
					pst.close();			
				}catch(Exception e1)
				{
					JOptionPane.showInputDialog(null,e1);
				}
			}
		});
		btnAverageFine.setBounds(418, 41, 122, 23);
		Administrative_Functions_Panel_3.add(btnAverageFine);
		
	
	}
}
