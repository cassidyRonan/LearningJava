package com.ronan;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class SwingBasics {

	private JFrame frame;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingBasics window = new SwingBasics();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	JLabel LblRadio = new JLabel("New label");
	
	
	class RadioListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			JRadioButton btn = (JRadioButton)e.getSource();
			
			LblRadio.setText(btn.getText());
		}
		
	}
	

	/**
	 * Create the application.
	 */
	public SwingBasics() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 636, 578);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		
		
		JLabel LblName = new JLabel("Name:");
		LblName.setHorizontalAlignment(SwingConstants.TRAILING);
		LblName.setBounds(45, 25, 49, 17);
		frame.getContentPane().add(LblName);
		
		JLabel LblPrintOut = new JLabel("");
		LblPrintOut.setHorizontalAlignment(SwingConstants.CENTER);
		LblPrintOut.setBounds(104, 53, 369, 21);
		frame.getContentPane().add(LblPrintOut);
		
		textField = new JTextField();
		textField.setBounds(104, 24, 369, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton BtnSayHi = new JButton("Say Hi");
		BtnSayHi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LblPrintOut.setText("Hi " + textField.getText());
			}
		});
		
		BtnSayHi.setBounds(483, 25, 110, 20);
		frame.getContentPane().add(BtnSayHi);
		
		//Light Switch
		JLabel LblLightStatus = new JLabel("");
		LblLightStatus.setHorizontalAlignment(SwingConstants.CENTER);
		LblLightStatus.setBounds(257, 139, 71, 29);
		frame.getContentPane().add(LblLightStatus);
		
		JCheckBox ChkBxLights = new JCheckBox("Toggle On/Off");
		ChkBxLights.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = (ChkBxLights.isSelected()) ? "Lights On" : "Lights Off";
				LblLightStatus.setText(text);
			}
		});
		ChkBxLights.setBounds(232, 112, 124, 21);
		frame.getContentPane().add(ChkBxLights);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(28, 84, 565, 11);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(28, 188, 565, 11);
		frame.getContentPane().add(separator_1);
		
		RadioListener listener = new RadioListener();
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(28, 304, 565, 11);
		frame.getContentPane().add(separator_1_1);
		
		JRadioButton RdBtnChoiceOne = new JRadioButton("Choice 1");
		buttonGroup.add(RdBtnChoiceOne);
		RdBtnChoiceOne.setBounds(28, 205, 103, 21);
		frame.getContentPane().add(RdBtnChoiceOne);
		RdBtnChoiceOne.addActionListener(listener);
		
		JRadioButton RdBtnChoiceTwo = new JRadioButton("Choice 2");
		buttonGroup.add(RdBtnChoiceTwo);
		RdBtnChoiceTwo.setBounds(232, 205, 103, 21);
		frame.getContentPane().add(RdBtnChoiceTwo);
		RdBtnChoiceTwo.addActionListener(listener);
		
		JRadioButton RdBtnChoiceThree = new JRadioButton("Choice 3");
		buttonGroup.add(RdBtnChoiceThree);
		RdBtnChoiceThree.setBounds(448, 205, 103, 21);
		frame.getContentPane().add(RdBtnChoiceThree);
		RdBtnChoiceThree.addActionListener(listener);
		
		
		LblRadio.setHorizontalAlignment(SwingConstants.CENTER);
		LblRadio.setBounds(82, 240, 378, 17);
		frame.getContentPane().add(LblRadio);
		
		
		//Dynamic UI creation/ destruction
		JLabel LblToCreate = new JLabel("Im New");
		LblToCreate.setBounds(230, 337, 45, 13);
		frame.getContentPane().add(LblToCreate);
		
		JButton BtnCreateLabel = new JButton("Delete Label");
		
		BtnCreateLabel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.getContentPane().remove(LblToCreate);
				frame.revalidate();
				frame.repaint();
			}
		});
		
		BtnCreateLabel.setBounds(26, 333, 124, 21);
		frame.getContentPane().add(BtnCreateLabel);
		
		
		
	}
}
