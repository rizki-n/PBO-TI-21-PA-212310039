package com.ibik.pbo.praktikum;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class latihan4 extends JFrame{
	latihan4() {
		setVisible(true);
		setTitle("Latihan 4");
		setLocationRelativeTo(null);
		pack();
		setSize(700, 500);
		setResizable(false);
		GUI(this);
	}
	public static void main(String[] args) {
		new latihan4();

	}
	private void GUI(latihan4 frame) {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		
		JLabel judul =  new JLabel("FORM PENILAIAN MATAKULIAH PBO");
		judul.setBounds(20,20,20,20);
		mainPanel.add(judul);
		
		JLabel label1 = new JLabel("Mahasiswa");
		label1.setBounds(20,20,150,30);
		panel1.add(label1);
		
		JMenuBar menuBar = new JMenuBar();
		 
		 String lblMenu[] = {"File","Edit","Help"};
		 String lblSubMenuFile[] = {"New File","Open File","Exit"};
		 JMenu menus[] = new JMenu[lblMenu.length];
		 for (int i = 0; i < menus.length; i++) {
		 menus[i] = new JMenu();
		 menus[i].setText(lblMenu[i]);
		 menuBar.add(menus[i]);
		 }
		
		 JMenuItem subMenu[] = new JMenuItem[lblSubMenuFile.length];
		 for (int i = 0; i < subMenu.length; i++) {
		 subMenu[i] = new JMenuItem();
		 subMenu[i].setText(lblSubMenuFile[i]);
		 menus[0].add(subMenu[i]);

		 String data[][]={ {"212310018","FATHURAHMAN AL FARIDZI","B"}, 
				 {"212310019","MUHAMMAD RAFI ZUHAIR ARTA","C"}, 
				 {"212310020","MUHAMAD SUBHAN RIZKI AFIA","A"}}; 
				 String column[]={"Student ID","Name","Score"}; 
				 
				 JTable table=new JTable(data,column); 
				 table.setBounds(30,40,200,300);
				 
				 JScrollPane kategori=new JScrollPane(table); 
				 panel1.add(kategori);
				
		 
		 frame.setJMenuBar(menuBar);
		 frame.add(panel1);
		 
		}
	}
}
