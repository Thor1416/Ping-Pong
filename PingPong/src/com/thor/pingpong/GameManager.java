package com.thor.pingpong;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GameManager {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createGUI();
			}
		});
	}
	private static void createGUI(){
		JFrame vindue = new JFrame("Ping Pong");
		vindue.add(new Spilleflade());
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		vindue.setSize(500, height);
	}
	
}
