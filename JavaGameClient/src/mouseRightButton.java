import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JColorChooser;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mouseRightButton extends JFrame {
	private JPanel contentPane;
	private JButton noticeButton;
	private JButton bigImageButton;
	
	public mouseRightButton() {
		setResizable(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 254, 321);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		noticeButton = new JButton("공지로 띄우기");
		noticeButton.setBackground(new Color(0, 153, 255));
		noticeButton.setBounds(59, 28, 146, 33);
		contentPane.add(noticeButton);
		Action action = new Action();
		noticeButton.addActionListener(action);
		
		bigImageButton = new JButton("이미지 크게 보기");
		bigImageButton.setBackground(new Color(0, 153, 255));
		bigImageButton.setBounds(59, 94, 146, 33);
		contentPane.add(bigImageButton);
		
	}
	
	class Action implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
		
	}
	
}
