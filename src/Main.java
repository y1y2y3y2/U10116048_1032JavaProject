import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;

//U10116048 ������ �����M�D 
public class Main extends JFrame {

	private static JPanel contentPane;
	private static JTextField psd;
	//����J
	static JLabel noInPut =new JLabel("�A�S����J�F��!!! �п�J");
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
		
		psd = new JTextField(" ");
		psd.setBounds(101, 92, 206, 25);
		getContentPane().add(psd);
		psd.setColumns(10);
		
		JButton ok = new JButton("\u78BA\u8A8D");
		ok.setBounds(227, 158, 99, 27);
		getContentPane().add(ok);
		
		JButton clean = new JButton("\u6E05\u9664");
		clean.setBounds(89, 158, 99, 27);
		getContentPane().add(clean);
		
		JLabel label = new JLabel("\u8ACB\u8F38\u5165\u5BC6\u78BC");
		label.setBounds(161, 126, 99, 19);
		getContentPane().add(label);
		contentPane = new JPanel();
		
		/*���s�ƥ�*/
		ok.addActionListener(new next());
		clean.addActionListener(new reset());
		/*********/

	}
	/*inner class*/
	static class next implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			String in=psd.getText();
			if(in==" "){
				contentPane.add(noInPut);
				
			}else{
				//�B�z���s
				Game gm = new Game();
				gm.main(null);
				contentPane.setVisible(false);
				
			}
			
 		}
		
	}
	//�M��
	static class reset implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			//�B�z���s
			psd.setText(" ");
		}
		
	}
}
