import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class Game extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game frame = new Game();
					frame.setTitle("趣味四子棋");
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
	public Game() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u6211\u5011\u4F86\u4E0B\u68CB");
		lblNewLabel.setBounds(167, 151, 75, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u4F60\u597D");
		lblNewLabel_1.setIcon(new ImageIcon(Game.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		lblNewLabel_1.setBounds(145, 110, 134, 25);
		contentPane.add(lblNewLabel_1);
		/*畫布*/
		ImagePanel imgp =new ImagePanel();
		imgp.setSize(250,75);
		imgp.setBounds(50,50,300,150);
		add(imgp);
		/**/
		
	}
}
/**********/
class ImagePanel extends JPanel {
	
	
	  //用java.swing.ImageIcon
	  private ImageIcon imageIcon1 = new ImageIcon("img/01.png");
	 
	  private Image image1 = imageIcon1.getImage();
	 	 
	  @Override /** Draw image on the panel */
	  protected void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    if (image1 != null){
	    		//畫圖
	    			g.drawImage(image1, 25, 0, 120,150, this);
	    			
	    	}
	    
	  }
	  
}
