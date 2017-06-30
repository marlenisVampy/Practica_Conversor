
package View;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.BorderLayout;

import java.awt.Dimension;

public class MyCurrence extends changeBackGround implements ActionListener
{

	private JTextField textAmount;
	private JLabel labelTitulo;
	private JLabel lblEtiqueta1;
	private JLabel lblTo;
	private JButton btnConvert;
	private JLabel lblAmountConvert;

	private String[] choices = {"US Dollar($)","Dominican Peso(DOP)","EUR-Euro"};

	private JComboBox<String>cmb1 ;
	private JComboBox<String>cmb2 ;
	
	//private float amount;
	private float total;
	float amount = 0.00F;
	private float tasaDolarDop = 46.9042F;
	private float tasaEuroDop = 49.8934F;
	private float tasaDolarEuro = 0.939868F;


	public MyCurrence()
	{
		super.createWindow();
		chargeElement();
		cargarComboBoxes();
	 	setVisible(true);

	}

	
	public void chargeElement()
	{
		labelTitulo = new JLabel("My Currence Converter");
		//labelTitulo = new JLabel("Conversor de Unidades");
		//labelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitulo.setFont(new Font("ARIAL", Font.BOLD, 25));
		labelTitulo.setForeground(Color.BLACK);
		labelTitulo.setBounds(175,25,300,25);
		this.add(labelTitulo);
		
		textAmount = new JTextField();
		textAmount.setBounds(100,100,75,25);
		this.add(textAmount);

		lblEtiqueta1 = new JLabel(" << Enter amount to convert");
		//lblEtiqueta1 = new JLabel(" << CANTIDAD A CONVERTIR");
		lblEtiqueta1.setBounds(200,100,350,25);
		lblEtiqueta1.setFont(new Font("ARIAL", Font.BOLD, 25));
		lblEtiqueta1.setForeground(Color.BLACK);
		this.add(lblEtiqueta1);

		lblTo = new JLabel("TO");
		lblTo.setBounds(100,250,50,25);
		lblTo.setFont(new Font("ARIAL", Font.BOLD, 25));
		lblTo.setForeground(Color.BLACK);
		this.add(lblTo);

		btnConvert = new JButton("Convert");
		btnConvert.setFont(new Font("ARIAL", Font.BOLD, 25));
		btnConvert.setBounds(100,400,200,30);
		this.add(btnConvert);
		btnConvert.addActionListener(this);

		lblAmountConvert = new JLabel();
		//lblAmountConvert = new JLabel("TO "+ amount + " DOP ");
		lblAmountConvert.setBounds(400,400,300,30);
		lblAmountConvert.setFont(new Font("ARIAL", Font.BOLD, 25));
		lblAmountConvert.setForeground(Color.BLACK);
		this.add(lblAmountConvert);

	
		/*
		
		C:\Users\PC\Desktop\Ing.Soft I 2017-10\Asignaciones\A01\Practica>
		javac -d bin -cp src src\Tester\MyCurrenceConverter.java

		C:\Users\PC\Desktop\Ing.Soft I 2017-10\Asignaciones\A01\Practica>java -cp bin MyCurrenceConverter

		*/

	}

	public void cargarComboBoxes()
	{
		cmb1 = new JComboBox<String>(choices);
		cmb2 = new JComboBox<String>(choices);

		/*final JComboBox<String>cmb1 = new JComboBox<String>(choices);
		final JComboBox<String>cmb2 = new JComboBox<String>(choices);*/
		cmb1.setBounds(100,150,400,35);
		cmb2.setBounds(100,300,400,35);
		this.add(cmb1);
		this.add(cmb2);
	}

	@Override
   		public void actionPerformed(ActionEvent e)
   		 {
   		 	
   		 	String text = textAmount.getText();
			if (text != null && !text.isEmpty())
		    {
    			 amount = Float.parseFloat(text);
			}
				int indice1 = cmb1.getSelectedIndex();
				int indice2 = cmb2.getSelectedIndex();

				if(indice1 == indice2)
					{
						JOptionPane.showMessageDialog(null,"Warning:Select a coin available to convert");
					}else


			if((indice1== 0) && (indice2 == 1))
			{
				total = amount * tasaDolarDop;
				lblAmountConvert.setText("TO "+ String.valueOf(total) + " DOP");
				//System.out.println("Salida " + total);

			}else
				if((indice1== 1) && (indice2 == 0))
				{
					total = amount / tasaDolarDop;	
					lblAmountConvert.setText("TO "+ String.valueOf(total) + " USD");
				}else
				if((indice1== 2) && (indice2 == 1))
				{
					total = amount * tasaEuroDop;
					lblAmountConvert.setText("TO "+ String.valueOf(total) + " DOP");
				}else 
					if((indice1== 1) && (indice2 == 2))
					{
						total = amount / tasaEuroDop;
						lblAmountConvert.setText("TO "+ String.valueOf(total) + " EUR");
					}else
					  if((indice1== 0) && (indice2 == 2))
					  {
					  	 total = amount * tasaDolarEuro;
					  	 lblAmountConvert.setText("TO "+ String.valueOf(total) + " EUR");
					  }else 
					  	if((indice1== 2) && (indice2 == 0))
					  	{
					  		total = amount / tasaDolarEuro;
					  	 	lblAmountConvert.setText("TO "+ String.valueOf(total) + " USD");
					  	}

 	 	 }
}