import java.awt.*;
import javax.swing.*;

public class calculator extends JFrame{
	public calculator() { //���� Frame
		setTitle("����"); //������ Frame�� �̸�
		setSize(250,300); //������ Frame�� ũŰ
		
		
		FlowLayout flow = new FlowLayout(FlowLayout.LEFT, 5, 5); //flow��� �̸��� flowlayout�Ӽ��� �ο�
		setLayout(flow); //flow��� ���̾ƿ��� frame�� ����
		
		Panel p1 = new Panel(); //p1��� �̸��� �г��Ѱ� ����
	
		Panel p2 = new Panel(); //p2��� �̸��� �г� �Ѱ� ����
		
		Panel p3 = new Panel(); //p3��� �̸��� �г� �Ѱ� ����
		
		JTextField text = new JTextField(20);
		p1.add(text);
		
		JButton b1 = new JButton("C"); //b1�̶�� �̸��� JButton�� �Ӽ� stringŸ���� "C"
		p2.add(b1); //b1(��ư)�� p2(�г�)�� �߰�
		
		
		
		p3.setLayout(new GridLayout(4,0,5,5)); //p3���̾ƿ��� gridlayout���� ����
		JButton b2 = new JButton("7"); //��ư 16�� ����
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
		
		p3.add(b2); //16���� ��ư p3�гο� �߰�
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
		
		add(p1); // Frame�� ������ �г� p1,p2,p3�� �߰��մϴ�.
		add(p2);
		add(p3);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
