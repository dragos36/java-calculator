package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator1 {

	private JFrame frame;
	private JTextField txtDisplay;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator1 window = new Calculator1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 260, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(12, 13, 216, 39);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		//--------------Row 1------------------
				JButton btnBack = new JButton("<-");
				btnBack.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String backspace = null;
						if(txtDisplay.getText().length() > 0){
							StringBuilder strB = new StringBuilder(txtDisplay.getText());
							strB.deleteCharAt(txtDisplay.getText().length() -1 );
							backspace = strB.toString();
							txtDisplay.setText(backspace);
						}
					}
				});
				btnBack.setFont(new Font("Tahoma", Font.BOLD, 14));
				btnBack.setBounds(10, 62, 55, 55);
				frame.getContentPane().add(btnBack);
				
				JButton btnClear = new JButton("C");
				btnClear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						txtDisplay.setText(null);
					}
				});
				btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnClear.setBounds(66, 62, 55, 55);
				frame.getContentPane().add(btnClear);
				
				JButton btnPercent = new JButton("%");
				btnPercent.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstnum = Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations = "%";
					}
				});
				btnPercent.setFont(new Font("Tahoma", Font.BOLD, 16));
				btnPercent.setBounds(122, 62, 55, 55);
				frame.getContentPane().add(btnPercent);
				
				JButton btnPlus = new JButton("+");
				btnPlus.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstnum = Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations = "+";
					}
				});
				btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnPlus.setBounds(178, 62, 55, 55);
				frame.getContentPane().add(btnPlus);
		
		
		//--------------Row 2------------------
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber);
				
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(10, 118, 55, 55);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(66, 118, 55, 55);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(122, 118, 55, 55);
		frame.getContentPane().add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub.setBounds(178, 118, 55, 55);
		frame.getContentPane().add(btnSub);
		
		
		//--------------Row 3------------------
				JButton btn4 = new JButton("4");
				btn4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = txtDisplay.getText() + btn4.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn4.setBounds(10, 174, 55, 55);
				frame.getContentPane().add(btn4);
				
				JButton btn5 = new JButton("5");
				btn5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = txtDisplay.getText() + btn5.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn5.setBounds(66, 174, 55, 55);
				frame.getContentPane().add(btn5);
				
				JButton btn6 = new JButton("6");
				btn6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = txtDisplay.getText() + btn6.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn6.setBounds(122, 174, 55, 55);
				frame.getContentPane().add(btn6);
				
				JButton btnMult = new JButton("*");
				btnMult.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstnum = Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations = "*";
					}
				});
				btnMult.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnMult.setBounds(178, 174, 55, 55);
				frame.getContentPane().add(btnMult);
				
				
				
				//--------------Row 4------------------
				JButton btn1 = new JButton("1");
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = txtDisplay.getText() + btn1.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn1.setBounds(10, 230, 55, 55);
				frame.getContentPane().add(btn1);
				
				JButton btn2 = new JButton("2");
				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = txtDisplay.getText() + btn2.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn2.setBounds(66, 230, 55, 55);
				frame.getContentPane().add(btn2);
				
				JButton btn3 = new JButton("3");
				btn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = txtDisplay.getText() + btn3.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn3.setBounds(122, 230, 55, 55);
				frame.getContentPane().add(btn3);
				
				JButton btnDiv = new JButton("/");
				btnDiv.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						firstnum = Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations = "/";
					}
				});
				btnDiv.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnDiv.setBounds(178, 230, 55, 55);
				frame.getContentPane().add(btnDiv);
				
				
				
				//--------------Row 5------------------
				JButton btn0 = new JButton("0");
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String EnterNumber = txtDisplay.getText() + btn0.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn0.setBounds(10, 286, 55, 55);
				frame.getContentPane().add(btn0);
				
				JButton btnDot = new JButton(".");
				btnDot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Object source = e.getSource();
						
						
					}
				});
				btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnDot.setBounds(66, 286, 55, 55);
				frame.getContentPane().add(btnDot);
				
				JButton btnPM = new JButton("±");
				btnPM.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
						ops = ops * (-1);//why is multiplied with -1 ?
						txtDisplay.setText(String.valueOf(ops));
					}
				});
				btnPM.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnPM.setBounds(122, 286, 55, 55);
				frame.getContentPane().add(btnPM);
				
				JButton btnEquals = new JButton("=");
				btnEquals.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String answer;
						secondnum = Double.parseDouble(txtDisplay.getText());
						if(operations == "+"){
							result = firstnum + secondnum;
							answer = String.format("%.2f", result);
							txtDisplay.setText(answer);
						}
						
						else if(operations == "-"){
							result = firstnum - secondnum;
							answer = String.format("%.2f", result);
							txtDisplay.setText(answer);
						}
						
						else if(operations == "*"){
							result = firstnum * secondnum;
							answer = String.format("%.2f", result);
							txtDisplay.setText(answer);
						}
						
						else if(operations == "/"){
							result = firstnum / secondnum;
							answer = String.format("%.2f", result);
							txtDisplay.setText(answer);
						}
						
						else if(operations == "%"){
							result = firstnum % secondnum;
							answer = String.format("%.2f", result);
							txtDisplay.setText(answer);
						}
						
						
					}
				});
				btnEquals.setFont(new Font("Tahoma", Font.BOLD, 18));
				btnEquals.setBounds(178, 286, 55, 55);
				frame.getContentPane().add(btnEquals);
				
				
	}
}
