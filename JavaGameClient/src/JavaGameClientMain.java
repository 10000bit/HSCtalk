// JavaObjClient.java
// ObjecStream 사용하는 채팅 Client

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JavaGameClientMain extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private JButton star;
	private JButton logo;
	private JTextField inputID;
	private JTextField inputpassword;
	private JTextField inputtitle;
	private JButton title;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaGameClientMain frame = new JavaGameClientMain();
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
	public JavaGameClientMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		/*
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setBounds(12, 39, 82, 33);
		contentPane.add(lblNewLabel);
		
		txtUserName = new JTextField();
		txtUserName.setHorizontalAlignment(SwingConstants.CENTER);
		txtUserName.setBounds(101, 39, 116, 33);
		contentPane.add(txtUserName);
		txtUserName.setColumns(10);
		
		JLabel lblIpAddress = new JLabel("IP Address");
		lblIpAddress.setBounds(12, 100, 82, 33);
		contentPane.add(lblIpAddress);
		
		txtIpAddress = new JTextField();
		txtIpAddress.setHorizontalAlignment(SwingConstants.CENTER);
		txtIpAddress.setText("127.0.0.1");
		txtIpAddress.setColumns(10);
		txtIpAddress.setBounds(101, 100, 116, 33);
		contentPane.add(txtIpAddress);
		
		JLabel lblPortNumber = new JLabel("Port Number");
		lblPortNumber.setBounds(12, 163, 82, 33);
		contentPane.add(lblPortNumber);
		
		txtPortNumber = new JTextField();
		txtPortNumber.setText("30000");
		txtPortNumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtPortNumber.setColumns(10);
		txtPortNumber.setBounds(101, 163, 116, 33);
		contentPane.add(txtPortNumber);
		*/
		
		star = new JButton("🌟");
		star.setBounds(183, 57, 44, 40);
		star.setBorderPainted(false);
		star.setContentAreaFilled(false);
		star.setFocusPainted(false);
		contentPane.add(star);
		
		logo = new JButton("HSC TALK");
		logo.setBounds(141, 107, 130, 30);
		logo.setBorderPainted(false);
		logo.setContentAreaFilled(false);
		logo.setFocusPainted(false);
		contentPane.add(logo);
		
		inputID = new JTextField();
		inputID.setColumns(10);
		inputID.setBounds(165, 151, 153, 30);
		contentPane.add(inputID);
		
		inputpassword = new JTextField();
		inputpassword.setColumns(10);
		inputpassword.setBounds(165, 191, 153, 30);
		contentPane.add(inputpassword);
		
		inputtitle = new JTextField();
		inputtitle.setColumns(10);
		inputtitle.setBounds(165, 231, 153, 30);
		contentPane.add(inputtitle);
		
		JButton ID = new JButton("ID");
		ID.setFocusPainted(false);
		ID.setContentAreaFilled(false);
		ID.setBorderPainted(false);
		ID.setBounds(74, 150, 81, 30);
		contentPane.add(ID);
		
		JButton password = new JButton("password");
		password.setFocusPainted(false);
		password.setContentAreaFilled(false);
		password.setBorderPainted(false);
		password.setBounds(58, 190, 97, 30);
		contentPane.add(password);
		
		title = new JButton("채팅방이름");
		title.setFocusPainted(false);
		title.setContentAreaFilled(false);
		title.setBorderPainted(false);
		title.setBounds(58, 230, 97, 30);
		contentPane.add(title);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.setBounds(96, 288, 205, 38);
		contentPane.add(btnConnect);
		Myaction action = new Myaction();
		btnConnect.addActionListener(action);
	}
	
	class Myaction implements ActionListener // 내부클래스로 액션 이벤트 처리 클래스
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			String username = inputID.getText().trim();
			String ip_addr = "127.0.0.1";
			String port_no = "30000";
			String title = inputtitle.getText().trim();
			JavaGameClientView view = new JavaGameClientView(username, ip_addr, port_no, title);
			setVisible(false);
		}
	}
}


