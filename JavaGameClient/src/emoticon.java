import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;

public class emoticon extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton emo01;
	private JButton emo02;
	private JButton emo03;
	private JButton emo04;
	private JButton emo05;
	private JButton emo06;
	private JButton emo07;
	private JButton emo08;
	private JButton emo09;
	private JButton emo10;
	
	public emoticon() {
		setResizable(false);
		setBounds(500, 600, 200, 200);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		emo01 = new JButton("🙂");
		emo01.setBackground(new Color(255, 255, 204));
		emo01.setBounds(20, 20, 50, 50);
		contentPane.add(emo01);
		EmoticonAction actionEmo = new EmoticonAction();
		emo01.addActionListener(actionEmo);
		
		emo02 = new JButton("😍");
		emo02.setBackground(new Color(255, 255, 204));
		emo02.setBounds(70, 20, 50, 50);
		contentPane.add(emo02);
		emo02.addActionListener(actionEmo);

		
		emo03 = new JButton("💗");
		emo03.setBackground(new Color(255, 255, 204));
		emo03.setBounds(120, 20, 50, 50);
		contentPane.add(emo03);
		emo03.addActionListener(actionEmo);

		
		emo04 = new JButton("❣️");
		emo04.setBackground(new Color(255, 255, 204));
		emo04.setBounds(170, 20, 50, 50);
		contentPane.add(emo04);
		emo04.addActionListener(actionEmo);

		
		emo05 = new JButton("❤️");
		emo05.setBackground(new Color(255, 255, 204));
		emo05.setBounds(20, 70, 50, 50);
		contentPane.add(emo05);
		emo05.addActionListener(actionEmo);

		
		emo06 = new JButton("⚽");
		emo06.setBackground(new Color(255, 255, 204));
		emo06.setBounds(70, 70, 50, 50);
		contentPane.add(emo06);
		emo06.addActionListener(actionEmo);

		
		emo07 = new JButton("😠");
		emo07.setBackground(new Color(255, 255, 204));
		emo07.setBounds(120, 70, 50, 50);
		contentPane.add(emo07);
		emo07.addActionListener(actionEmo);

		
		emo08 = new JButton("😭");
		emo08.setBackground(new Color(255, 255, 204));
		emo08.setBounds(170, 70, 50, 50);
		contentPane.add(emo08);
		emo08.addActionListener(actionEmo);

		
		emo09 = new JButton("😢");
		emo09.setBackground(new Color(255, 255, 204));
		emo09.setBounds(20, 120, 50, 50);
		contentPane.add(emo09);
		emo09.addActionListener(actionEmo);

		
		emo10 = new JButton("😀");
		emo10.setBackground(new Color(255, 255, 204));
		emo10.setBounds(70, 120, 50, 50);
		contentPane.add(emo10);
		emo10.addActionListener(actionEmo);
		
	}
	
	class EmoticonAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn =(JButton)e.getSource();
			JavaGameClientView.getTxtInput(btn.getText());
			
		}
		
	}


}
