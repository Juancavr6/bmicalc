package bmicalc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.BorderLayout;


import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class Ventana extends JFrame implements ActionListener {

	//private JPanel contentPane;
	//private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textBmi;
	private JTextField textCat;
	private JTextField textObes;
	private JLabel lError;
	private JButton bBmi,bCat,bObes;
	private JRadioButton rdHombre,rdMujer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana()  {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 450, 550);
		
		JLabel lblNewLabel = new JLabel("Calculadora BMI");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JLabel lblNewLabel_1 = new JLabel("Peso");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Altura");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Circunferenca de cintura");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Kg");
		
		JLabel lblNewLabel_5 = new JLabel("cm");
		
		JLabel lblNewLabel_6 = new JLabel("cm");
		
		JLabel lblNewLabel_7 = new JLabel("Sexo");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		rdHombre = new JRadioButton("Hombre");
		rdHombre.addActionListener(this);
		
		rdMujer = new JRadioButton("Mujer");
		rdMujer.addActionListener(this);
		
		bBmi = new JButton("Calcular BMI");
		bBmi.addActionListener(this);
		
		bCat = new JButton("Determinar Categor\u00EDa");
		bCat.addActionListener(this);
		
		bObes = new JButton("Determinar Obesidad ");
		bObes.addActionListener(this);
		
		JLabel lblNewLabel_8 = new JLabel("BMI :");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textBmi = new JTextField();
		textBmi.setEditable(false);
		textBmi.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Categor\u00EDa :");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textCat = new JTextField();
		textCat.setEditable(false);
		textCat.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("\u00BFObesidad abdominal?");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textObes = new JTextField();
		textObes.setEditable(false);
		textObes.setColumns(10);
		
		 lError = new JLabel("");
		lError.setForeground(new Color(255, 0, 0));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(0)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(41)
									.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(37)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNewLabel_2)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(241)
											.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(rdMujer)
												.addComponent(rdHombre)))
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_3)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(bBmi)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(textBmi, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)))
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(2)
											.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(bCat)
													.addGap(18)
													.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(textCat, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(bObes)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(lblNewLabel_10)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(textObes, 0, 0, Short.MAX_VALUE)))
											.addPreferredGap(ComponentPlacement.RELATED))))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(112)
							.addComponent(lblNewLabel)))
					.addGap(24))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lError, GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
					.addGap(136))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_1)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_4))
									.addGap(32)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_2)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_5)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(7)
									.addComponent(rdHombre, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(rdMujer)
									.addGap(46)))
							.addGap(34)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_6))
							.addGap(18))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(lblNewLabel_7)
							.addGap(137)))
					.addGap(43)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(bBmi)
						.addComponent(lblNewLabel_8)
						.addComponent(textBmi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(bCat)
						.addComponent(lblNewLabel_9)
						.addComponent(textCat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(38)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(bObes)
						.addComponent(lblNewLabel_10)
						.addComponent(textObes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(lError, GroupLayout.DEFAULT_SIZE, 7, Short.MAX_VALUE)
					.addGap(69))
		);
		getContentPane().setLayout(groupLayout);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == bBmi) {
			String peso = textField_1.getText();
			String altura = textField_2.getText();

			if(peso.length()>0 && altura.length()>0) {
				
				try {
					BMICalcImpl calc = new BMICalcImpl();
					double resultado= calc.bmi(Double.parseDouble(peso),Double.parseDouble(altura)/100);
					textBmi.setText("" +String.format("%.2f",resultado));
					lError.setText("");
				}
				catch(Exception exx) {
					textBmi.setText("");
					textObes.setText("");
					lError.setText("ERROR : Los datos introducidos deben ser numericos y positivos");
				}
				
			}else {
				textBmi.setText("");
				textObes.setText("");
				lError.setText("ERROR : Debe introducir la altura y el peso para calcular el BMI");
			}
			
			
			
		}
		
		
		if (e.getSource() == bCat) {
			
			String peso = textField_1.getText();
			String altura = textField_2.getText();

			if(peso.length()>0 && altura.length()>0) {
				
				try {
					BMICalcImpl calc = new BMICalcImpl();
					String resultado= calc.category(calc.bmi(Double.parseDouble(peso),Double.parseDouble(altura)/100));
					textCat.setText(resultado);
					lError.setText("");
				}
				catch(Exception exx) {
					textCat.setText("");
					textObes.setText("");
					lError.setText("ERROR : Los datos introducidos deben ser numericos y positivos");
				}
				
			}else {
				textCat.setText("");
				textObes.setText("");
				lError.setText("ERROR : Debe introducir la altura y el peso para calcular la Categoria");
			}
			
			
			
		}
		
		if (e.getSource() == bObes) {
			
			if((!rdHombre.isSelected()&&!rdMujer.isSelected()) || textField_3.getText().length()==0){
				textObes.setText("");
				lError.setText("ERROR : Debe introducir la circunferencia y el sexo");
			}
			else {
				char sexo;
				if(rdHombre.isSelected()) sexo='M';
				else sexo='F';
				String wc = textField_3.getText();
				
				try {
					BMICalcImpl calc = new BMICalcImpl();
					boolean resultado=calc.abdominalObesity(Double.parseDouble(wc),sexo);
					
					if(resultado)textObes.setText("SI"); 
					else textObes.setText("NO"); 
				}
				catch(Exception exx) {
					textObes.setText("");
					lError.setText("ERROR : Los datos introducidos deben ser numericos y positivos");		
				}			
			}
		}
		if (e.getSource() == rdHombre) if(rdMujer.isSelected()) rdMujer.setSelected(false);
		if (e.getSource() == rdMujer) if(rdHombre.isSelected()) rdHombre.setSelected(false);
		
	}
	
}

