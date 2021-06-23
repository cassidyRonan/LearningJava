package com.ronan;

import java.awt.EventQueue;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import java.util.List;
import javax.swing.JScrollPane;

public class Tables extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
		
		private static final long serialVersionUID = 2L;

		public TableData() {
			//allData[0][0] = 1;
			//allData[0][1] = 2;
			//allData[0][2] = 3;
			
			//allData[0] = new int[] { 1,2,3 };
			//allData[1] = new int[] { 4,5,6 };
			//allData[2] = new int[] { 7,8,9 };
			
			loadFile("data.csv");
		}
		
		
		void loadFile(String fileName) {
			Path filePath = FileSystems.getDefault().getPath("", fileName);
			
			try 
			{
				List<String> lines = Files.readAllLines(filePath);
				for(int i = 0; i < lines.size(); i++) {
					String lineString = lines.get(i);
					String[] lineArray = lineString.split(",");
					if(allData == null) {
						allData = new int[lines.size()][lineArray.length];
					}
					for (int j = 0; j < lineArray.length; j++) {
						 int parsedInt = Integer.parseInt(lineArray[j]);
						allData[i][j] = parsedInt; 
					}
				}
			}
				catch (IOException e){
					e.printStackTrace();
				}
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 51, 896, 77);
		contentPane.add(scrollPane);
		
		TbLl = new JTable();
		scrollPane.setViewportView(TbLl);
		TbLl.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		TbLl.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		TableData data = new TableData();
		TbLl.setModel(data);
	}

}
