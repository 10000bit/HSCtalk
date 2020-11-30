import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class bigImage extends JFrame {
		private JPanel contentPane;
		
		public bigImage() {
			setResizable(false);
			//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 254, 321);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(204, 255, 255));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
		}
}
