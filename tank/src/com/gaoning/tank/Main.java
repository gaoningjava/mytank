package com.gaoning.tank;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
	public static void main(String[] args) {
		/*
		 * Frame frame 	= new Frame(); frame.setSize(800, 600);
		 * frame.setResizable(false); frame.setTitle("tank war");
		 * frame.addWindowListener(new WindowAdapter() {
		 * 
		 * @Override public void windowClosing(WindowEvent e) { System.exit(0); } });
		 * frame.setVisible(true);
		 */
		TankFrame tankFrame = new TankFrame();
		while(true) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			tankFrame.repaint();
		}
	}
	
	
	
	
	
	
	
	
	
	

}
