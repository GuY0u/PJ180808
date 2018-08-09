import java.awt.*;
import javax.swing.*;

public class calculator extends JFrame{
	public calculator() { //계산기 Frame
		setTitle("계산기"); //계산기의 Frame의 이름
		setSize(250,300); //계산기의 Frame의 크키
		
		
		FlowLayout flow = new FlowLayout(FlowLayout.LEFT, 5, 5); //flow라는 이름의 flowlayout속성을 부여
		setLayout(flow); //flow라는 레이아웃을 frame에 설정
		
		Panel p1 = new Panel(); //p1라는 이름의 패널한개 생성
	
		Panel p2 = new Panel(); //p2라는 이름의 패널 한개 생성
		
		Panel p3 = new Panel(); //p3라는 이름의 패널 한개 생성
		
		JTextField text = new JTextField(20);
		p1.add(text);
		
		JButton b1 = new JButton("C"); //b1이라는 이름의 JButton에 속성 string타입의 "C"
		p2.add(b1); //b1(버튼)을 p2(패널)에 추가
		
		
		
		p3.setLayout(new GridLayout(4,0,5,5)); //p3레이아웃을 gridlayout으로 설정
		JButton b2 = new JButton("7"); //버튼 16개 생성
		JButton b3 = new JButton("8");
		JButton b4 = new JButton("9");
		JButton b5 = new JButton("/");
		JButton b6 = new JButton("4");
		JButton b7 = new JButton("5");
		JButton b8 = new JButton("6");
		JButton b9 = new JButton("*");
		JButton b10 = new JButton("1");
		JButton b11 = new JButton("2");
		JButton b12 = new JButton("3");
		JButton b13 = new JButton("-");
		JButton b14 = new JButton("0");
		JButton b15 = new JButton("+/-");
		JButton b16 = new JButton("=");
		JButton b17 = new JButton("+");
		
		p3.add(b2); //16개의 버튼 p3패널에 추가
		p3.add(b3);
		p3.add(b4);
		p3.add(b5);
		p3.add(b6);
		p3.add(b7);
		p3.add(b8);
		p3.add(b9);
		p3.add(b10);
		p3.add(b11);
		p3.add(b12);
		p3.add(b13);
		p3.add(b14);
		p3.add(b15);
		p3.add(b16);
		p3.add(b17);
		
		add(p1); // Frame에 각가의 패널 p1,p2,p3를 추가합니다.
		add(p2);
		add(p3);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
