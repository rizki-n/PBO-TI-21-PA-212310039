package com.ibik.pbo.praktikum;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class App {

	App(){
		ConnectionDB conn = new ConnectionDB ();
		try {
			conn.connect();
			new FormRegist().setVisible(true);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,"Gagal");
		}

	}

	public static void main(String[] args) {
		new App();

	}
}