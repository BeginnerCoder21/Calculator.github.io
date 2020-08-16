import java.awt.event.*; 
import javax.swing.*; 
import java.awt.*; 

class Calculator extends JFrame
{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
	JButton bp,bs,bm,bd,be;
	JButton bc,bx,bper,bpoint;
	JTextField tf,tf1;
	Font f,f1,f2;
	double num,ans;
	int calc;
	JLabel l;

	public Calculator()
	{
		setSize(500,400);
		setBackground(Color.white);
		setTitle("Calculator");
		setVisible(true);
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f=new Font("SansSerif",Font.BOLD,16);
		f1=new Font("Consolas",Font.BOLD,18);
		f2=new Font("Consolas",Font.BOLD,12);
	}
	public void textarea()
	{
		tf=new JTextField(10);
		tf.setEditable(false); 
		tf.setBounds(20,50,430,40);
		tf.setBackground(Color.white);
		tf.setFont(f1);
		tf.setHorizontalAlignment(tf.RIGHT);
			
		tf1=new JTextField(10);
		tf1.setEditable(false); 
		tf1.setBounds(300,8,150,40);
		tf1.setBackground(Color.white);
		tf1.setFont(f);
		tf1.setHorizontalAlignment(tf.RIGHT);
		
		add(tf);
		add(tf1);
	}
	public void button()
	{

	
		bc=new JButton("AC");
		bc.setBounds(20,100,100,40);
		bc.setFont(f);
		bc.setForeground(Color.red);

		bx=new JButton("<--");
		bx.setBounds(130,100,100,40);
		bx.setFont(f1);
		bx.setForeground(Color.red);
		
		bper=new JButton("%");
		bper.setBounds(240,100,100,40);
		bper.setFont(f);
		bper.setForeground(Color.red);

		bd=new JButton("/");
		bd.setBounds(350,100,100,40);
		bd.setFont(f);
		bd.setForeground(Color.red);
	
		b7=new JButton("7");
		b7.setBounds(20,150,100,40);
		b7.setFont(f);
		
		b8=new JButton("8");
		b8.setBounds(130,150,100,40);
		b8.setFont(f);

		b9=new JButton("9");
		b9.setBounds(240,150,100,40);
		b9.setFont(f);

		bm=new JButton("X");
		bm.setBounds(350,150,100,40);	
		bm.setFont(f);	
		bm.setForeground(Color.red);
	
		b4=new JButton("4");
		b4.setBounds(20,200,100,40);
		b4.setFont(f);

		b5=new JButton("5");
		b5.setBounds(130,200,100,40);
		b5.setFont(f);

		b6=new JButton("6");
		b6.setBounds(240,200,100,40);
		b6.setFont(f);
		
		bs=new JButton("-");
		bs.setBounds(350,200,100,40);
		bs.setFont(f1);	
		bs.setForeground(Color.red);
		
		b1=new JButton("1");
		b1.setBounds(20,250,100,40);
		b1.setFont(f);
		
		b2=new JButton("2");
		b2.setBounds(130,250,100,40);
		b2.setFont(f);
		
		b3=new JButton("3");
		b3.setBounds(240,250,100,40);
		b3.setFont(f);
		
		bp=new JButton("+");
		bp.setBounds(350,250,100,40);
		bp.setFont(f);
		bp.setForeground(Color.red);
		
		b0=new JButton("0");
		b0.setBounds(130,300,100,40);
		b0.setFont(f);
	
		bpoint=new JButton(".");
		bpoint.setBounds(240,300,100,40);
		bpoint.setFont(f1);
		bpoint.setForeground(Color.red);
		
		be=new JButton("=");
		be.setBounds(350,300,100,40);
		be.setFont(f);
		be.setForeground(Color.red);

		l=new JLabel("*Click AC before next calculation");
		l.setFont(f2);	
		l.setForeground(Color.red);
		l.setBounds(130,350,1000,20);
	
		add(bc);
		add(bx);
		add(bper);
		add(bd);
		add(b7);
		add(b8);
		add(b9);
		add(b4);
		add(b5);
		add(b6);
		add(b1);
		add(b2);
		add(b3);
		add(bm);
		add(bp);
		add(bs);
		add(b0);
		add(bpoint);
		add(be);
		add(l);

		b0.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tf.setText(tf.getText().concat("0"));
			}
		});
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tf.setText(tf.getText().concat("1"));
			}
		});
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tf.setText(tf.getText().concat("2"));
			}
		});
		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tf.setText(tf.getText().concat("3"));
			}
		});
		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tf.setText(tf.getText().concat("4"));
			}
		});
		b5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tf.setText(tf.getText().concat("5"));
			}
		});
		b6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tf.setText(tf.getText().concat("6"));
			}
		});
		b7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tf.setText(tf.getText().concat("7"));
			}
		});
		b8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tf.setText(tf.getText().concat("8"));
			}
		});
		b9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tf.setText(tf.getText().concat("9"));
			}
		});
		bp.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				num=Double.parseDouble(tf.getText());
				calc=1;
				tf.setText("");
				tf1.setText(num+" + ");
			}
		});
		bpoint.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tf.setText(tf.getText().concat("."));
			}
		});
		be.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				arithmatic();
				tf1.setText("");
			}
		});
		bs.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				num=Double.parseDouble(tf.getText());
				calc=2;
				tf.setText("");
				tf1.setText(num+" - ");
			}
		});
		bm.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				num=Double.parseDouble(tf.getText());
				calc=3;
				tf.setText("");
				tf1.setText(num+" X ");
			}
		});
		bd.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				num=Double.parseDouble(tf.getText());
				calc=4;
				tf.setText("");
				tf1.setText(num+" / ");
			}
		});
		bper.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				num=Double.parseDouble(tf.getText());
				calc=4;
				tf.setText("");
			}
		});
		bx.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int length=tf.getText().length();
				int number=tf.getText().length()-1;
				String store;
				if(length>0)
				{
					StringBuilder sb=new StringBuilder(tf.getText());
					sb.deleteCharAt(number);
					store=sb.toString();
					tf.setText(store);
				}
			}
		});
		bc.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tf.setText("");
			}
		});
	}
	public void arithmatic()
	{
		switch(calc)
		{
			case 1: ans=num+Double.parseDouble(tf.getText());
				tf.setText(Double.toString(ans));
				break;
			
			case 2: ans=num-Double.parseDouble(tf.getText());
				tf.setText(Double.toString(ans));
				break;

			case 3: ans=num*Double.parseDouble(tf.getText());
				tf.setText(Double.toString(ans));
				break;
			
			case 4: ans=num/Double.parseDouble(tf.getText());
				tf.setText(Double.toString(ans));
				break;
		}
	}
	public static void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				Calculator ob=new Calculator();
				ob.textarea();
				ob.button();
			}
		});
	}
}