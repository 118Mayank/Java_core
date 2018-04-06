import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class My_calci extends Frame implements ActionListener {
	TextField t;
	TextArea ta;
	Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11,
			button12, button13, button14, button15, button16, button17, button18, button19, button20;
	static double a = 0, b = 0, result = 0;
	static int operator = 0;

	public My_calci() {
		setLayout(null);
		t = new TextField();
		ta = new TextArea();

		button1 = new Button("C");
		button2 = new Button("CE");
		button3 = new Button("(");
		button4 = new Button(")");
		button5 = new Button("+");
		button6 = new Button("-");
		button7 = new Button("*");
		button8 = new Button("/");
		button9 = new Button("1");
		button10 = new Button("2");
		button11 = new Button("3");
		button12 = new Button("4");
		button13 = new Button("5");
		button14 = new Button("6");
		button15 = new Button("7");
		button16 = new Button("8");
		button17 = new Button("9");
		button18 = new Button("0");
		button19 = new Button(".");
		button20 = new Button("=");

		ta.setBounds(15, 40, 400, 150);
		t.setBounds(15, 195, 400, 45);
		button1.setBounds(15, 250, 100, 25);
		button2.setBounds(115, 250, 100, 25);
		button3.setBounds(215, 250, 100, 25);
		button4.setBounds(315, 250, 100, 25);
		button5.setBounds(15, 275, 100, 25);
		button6.setBounds(115, 275, 100, 25);
		button7.setBounds(215, 275, 100, 25);
		button8.setBounds(315, 275, 100, 25);
		button9.setBounds(15, 300, 100, 25);
		button10.setBounds(115, 300, 100, 25);
		button11.setBounds(215, 300, 100, 25);
		button12.setBounds(315, 300, 100, 25);
		button13.setBounds(15, 325, 100, 25);
		button14.setBounds(115, 325, 100, 25);
		button15.setBounds(215, 325, 100, 25);
		button16.setBounds(315, 325, 100, 25);
		button17.setBounds(115, 350, 100, 25);
		button18.setBounds(215, 350, 100, 25);
		button19.setBounds(15, 350, 100, 25);
		button20.setBounds(315, 350, 100, 25);

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button10.addActionListener(this);
		button11.addActionListener(this);
		button12.addActionListener(this);
		button13.addActionListener(this);
		button14.addActionListener(this);
		button15.addActionListener(this);
		button16.addActionListener(this);
		button17.addActionListener(this);
		button18.addActionListener(this);
		button19.addActionListener(this);
		button20.addActionListener(this);

		add(t);
		add(ta);
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		add(button7);
		add(button8);
		add(button9);
		add(button10);
		add(button11);
		add(button12);
		add(button13);
		add(button14);
		add(button15);
		add(button16);
		add(button17);
		add(button18);
		add(button19);
		add(button20);

		setTitle("My Calculator");
		setSize(435, 400);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		{
			if (e.getSource() == button9)
				t.setText(t.getText().concat("1"));

			if (e.getSource() == button10)
				t.setText(t.getText().concat("2"));

			if (e.getSource() == button11)
				t.setText(t.getText().concat("3"));

			if (e.getSource() == button12)
				t.setText(t.getText().concat("4"));

			if (e.getSource() == button13)
				t.setText(t.getText().concat("5"));

			if (e.getSource() == button14)
				t.setText(t.getText().concat("6"));

			if (e.getSource() == button15)
				t.setText(t.getText().concat("7"));

			if (e.getSource() == button16)
				t.setText(t.getText().concat("8"));

			if (e.getSource() == button17)
				t.setText(t.getText().concat("9"));

			if (e.getSource() == button18)
				t.setText(t.getText().concat("0"));

			if (e.getSource() == button19)
				t.setText(t.getText().concat("."));

			if (e.getSource() == button3)
				t.setText(t.getText().concat("("));

			if (e.getSource() == button4)
				t.setText(t.getText().concat(")"));

			if (e.getSource() == button5) {
				a = Double.parseDouble(t.getText());
				operator = 1;
				t.setText("");
			}

			if (e.getSource() == button6) {
				a = Double.parseDouble(t.getText());
				operator = 2;
				t.setText("");
			}

			if (e.getSource() == button7) {
				a = Double.parseDouble(t.getText());
				operator = 3;
				t.setText("");
			}

			if (e.getSource() == button8) {
				a = Double.parseDouble(t.getText());
				operator = 4;
				t.setText("");
			}

			if (e.getSource() == button20) {
				b = Double.parseDouble(t.getText());

				switch (operator) {
				case 1:
					result = a + b;
					break;

				case 2:
					result = a - b;
					break;

				case 3:
					result = a * b;
					break;

				case 4:
					result = a / b;
					break;

				default:
					result = 0;
				}

				t.setText("" + result);
			}

			if (e.getSource() == button1)
				t.setText("");

			if (e.getSource() == button2) {
				String s = t.getText();
				t.setText("");
				for (int i = 0; i < s.length() - 1; i++)
					t.setText(t.getText() + s.charAt(i));
			}
		}
		ta.append(e.getSource() + "\n");
	}

	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(0, 0, 500, 400);
	}

	public static void main(String arg[]) {
		new My_calci();
	}
}
