import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



//����|�l��
public class Game {
static Label l1 =new Label("�ݲM���A�ڤ��O���ھ�");
static Label l2 =new Label("�ڭ̨ӤU�ѧa");
static Button pp =new Button("�}�l");
static Frame fr=new Frame("����|�l��");
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
		/*�����W���s*/
		fr.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){System.exit(0);}});
		/**********/
		//EVENT
		pp.addActionListener(new PlayGame());//���U�ƥ��ť��

		
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
