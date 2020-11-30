import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Canvas;
import java.awt.Color;

public class javaClientSetting extends JFrame{
	private JPanel contentPane;
	private JColorChooser cc;
	
	public javaClientSetting() {
		setTitle("����");
		
		setResizable(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 254, 321);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btn = new JButton("��ȭ���� ��������");
		btn.setBackground(new Color(0, 153, 255));
		btn.setBounds(59, 28, 146, 33);
		contentPane.add(btn);
		
		
		JButton btn_1 = new JButton("ä�ù� ���ȭ��");
		btn_1.setBackground(new Color(0, 153, 255));
		btn_1.setBounds(59, 94, 146, 33);
		contentPane.add(btn_1);
		BackgroundAction backaction = new BackgroundAction();
		btn_1.addActionListener(backaction);
	}
	class BackgroundAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			Color newColor = JColorChooser.showDialog(cc,"Color Chooser",javaClientSetting.this.getBackground());
			JavaGameClientView.textArea.setBackground(newColor);
			JavaGameClientView.textArea.repaint();
		}
		
	}
	
}
