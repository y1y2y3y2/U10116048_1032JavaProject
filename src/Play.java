import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;




//U10116048 期末專題 四子棋 棋盤程式
public class Play extends Frame{
	static Label InPut =new Label("請輸入棋譜");
	static TextField inX =new TextField("x");
	static TextField inY =new TextField("y");
	static Button PRound = new Button("下棋");
	static Frame fr =new  Frame();
	public static void main(String[] args) {
		//建立GUI
		
		/*視窗上按鈕*/
		fr.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){System.exit(0);}});
		/**********/
		//排版
		fr.setLayout(null);//使用絕對座標
		fr.setSize(400,400);
		fr.setLocation(50,50);
		fr.setBackground(Color.yellow);
		fr.add(InPut);
		InPut.setBounds(10,50,80,20);
		//Y
		fr.add(inY);
		inY.setBounds(140,80,80,20);
		//X
		fr.add(inX);
		inX.setBounds(50,80,80,20);
		PRound.setSize(100,30);
		fr.add(PRound);
		PRound.setBounds(250,80,80,20);
		fr.setVisible(true);
		/****************************/
		//棋盤
		//center(200,200)
		Label a0 =new Label("0");
		Label a1 =new Label("1");
		Label a2 =new Label("2");
		Label a3 =new Label("3");
		Label b1 =new Label("1");
		Label b2 =new Label("2");
		Label b3 =new Label("3");
		a0.setBounds(120,300,20,20);
		a1.setBounds(180,300,20,20);
		a2.setBounds(240,300,20,20);
		a3.setBounds(300,300,20,20);
		b1.setBounds(120,240,20,20);
		b2.setBounds(120,180,20,20);
		b3.setBounds(120,120,20,20);
		fr.add(a0);
		fr.add(a1);
		fr.add(a2);
		fr.add(a3);
		fr.add(b1);
		fr.add(b2);
		fr.add(b3);
		//EVENT
		PRound.addActionListener(new Round());//註冊事件傾聽者

	}
	static class Round extends Frame implements ActionListener{
		
		public void actionPerformed(ActionEvent arg0) {
			int l0=280,l1=240,l2=180,l3=120;
			int v0=140,v1=180,v2=240,v3=300;
			int rounds=0;
			//範圍X:20到380,Y:100~350
			ComputerPlayer cp =new ComputerPlayer();
			//取得座標
			int x=Integer.parseInt(inX.getText());
			int y=Integer.parseInt(inY.getText());
			Label WPoint =new Label("○");
			
			//check Correct Bounds
			switch(x){
				case 0:
					x=v0;
					break;
				case 1:
					x=v1;
					break;
				case 2:
					x=v2;
					break;
				case 3:
					x=v3;
					break;
			}
			switch(y){
			case 0:
				y=l0;
				break;
			case 1:
				y=l1;
				break;
			case 2:
				y=l2;
				break;
			case 3:
				y=l3;
				break;
		}
			
		//印出
		WPoint.setBounds(x,y,80,20);
		fr.add(WPoint);
		//換電腦玩
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			cp.Cplay();
		}
		
			
			
			
			
		}
		
		
	}

}
class ComputerPlayer extends Play{
public void	Cplay(){
	 int clogX []=new int [50];//紀錄電腦玩的X座標
	 int clogY []=new int [50];//紀錄電腦玩的Y座標
		Label BPoint =new Label("●");
		int l0=280,l1=240,l2=180,l3=120;
		int v0=140,v1=180,v2=240,v3=300;
		int x=(int)( Math.random()*4);
		int y=(int)( Math.random()*4);
		System.out.println(x+" "+y);
		switch(x){
		case 0:
			x=v0;
			break;
		case 1:
			x=v1;
			break;
		case 2:
			x=v2;
			break;
		case 3:
			x=v3;
			break;
		}
		switch(y){
			case 0:
				y=l0;
				break;
			case 1:
				y=l1;
				break;
			case 2:
				y=l2;
				break;
			case 3:
				y=l3;
				break;
			}
	
		//印出
		
		BPoint.setBounds(x,y,80,20);
		fr.add(BPoint);
		//call檢查輸贏
		//checkWin(clogX[],clogY[]);
	}

}

