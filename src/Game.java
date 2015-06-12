import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



//趣味四子棋
public class Game {
static Label l1 =new Label("看清楚，我不是提款機");
static Label l2 =new Label("我們來下棋吧");
static Button pp =new Button("開始");
static Frame fr=new Frame("趣味四子棋");
	public static void main(String[] args) {
		
		fr.setLayout(null);
		fr.setBounds(100,100,450,300);
		
		l1.setBounds(150, 150, 120, 30);
		l2.setBounds(150, 180, 120, 30);
		pp.setBounds(150,220,120,30);
		fr.add(l1);
		fr.add(l2);
		fr.add(pp);
		fr.setVisible(true);
		/*視窗上按鈕*/
		fr.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){System.exit(0);}});
		/**********/
		//EVENT
		pp.addActionListener(new PlayGame());//註冊事件傾聽者

		
	}
	//iner class
	static class PlayGame extends Frame implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			Play p=new Play();
			try {
				p.main(null);
				fr.setVisible(false);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			
			
			}	
		}

}
