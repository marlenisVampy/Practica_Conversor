package View;

import java.awt.*;

import java.io.File;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;

import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
//import javax.swing.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.Dimension;

 public class changeBackGround extends JFrame// implements ActionListener
{
	public changeBackGround()
	{
	}
	public void cambiarFondoPanel()
	{
		getContentPane().add( new javax.swing.JPanel()
		{
	     @Override
		 public void paintComponent(java.awt.Graphics g)
		 	{
		    super.paintComponent(g);
		    /*ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/ImageApp/fondo02.jpg"));
		  	g.drawImage(imagenFondo.getImage(),0,0,getWidth(), getHeight(), null);
			g.setColor(new java.awt.Color(0,0,0)); // amarillo claro
            g.fillRect(0, getHeight()/10, getWidth(), getHeight() - 500);*/
		   }
		}
	);
	}
	
	public void createWindow()
	{
		 setTitle("MyCurrenceConverter");
	  setSize(650,600);
	  setResizable(false);
	  setLayout(null);
	  setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
	  //addWindowListener(new CloseWindow());
	}
}