import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;


public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
					frame.setTitle("A T M");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ATM");
		lblNewLabel.setBounds(186, 31, 57, 19);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(101, 92, 206, 25);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u78BA\u8A8D");
		btnNewButton.setBounds(227, 158, 99, 27);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u6E05\u9664");
		btnNewButton_1.setBounds(89, 158, 99, 27);
		getContentPane().add(btnNewButton_1);
		
		JLabel label = new JLabel("\u8ACB\u8F38\u5165\u5BC6\u78BC");
		label.setBounds(161, 126, 99, 19);
		getContentPane().add(label);
		contentPane = new JPanel();

	}
}
