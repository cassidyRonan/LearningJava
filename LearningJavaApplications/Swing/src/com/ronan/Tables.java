package com.ronan;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

public class Tables extends JFrame {

	private JPanel contentPane;
	private JTable TbLl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tables frame = new Tables();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	class TableData extends AbstractTableModel{

		int[][] allData = new int[3][3];
		
		private static final long serialVersionUID = 1L;

		public TableData() {
			//allData[0][0] = 1;
			//allData[0][1] = 2;
			//allData[0][2] = 3;
			
			allData[0] = new int[] { 1,2,3 };
			allData[1] = new int[] { 4,5,6 };
			allData[2] = new int[] { 7,8,9 };
		}
		
		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return allData.length;
		}

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return allData[0].length;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
			return allData[rowIndex][columnIndex];
		}
		
	}
	

	/**
	 * Create the frame.
	 */
	public Tables() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1004, 884);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TbLl = new JTable();
		TbLl.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		TbLl.setBounds(50, 51, 896, 732);
		TbLl.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.add(TbLl);
		
		TableData data = new TableData();
		TbLl.setModel(data);
	}

}
