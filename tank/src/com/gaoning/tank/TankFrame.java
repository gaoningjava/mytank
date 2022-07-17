package com.gaoning.tank;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {
	int x = 200;
	int y = 200;

	public TankFrame() {
		setVisible(true);
		setSize(800, 600);
		setResizable(false);
		setTitle("tank war");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);

			}
		});
		addKeyListener(new MyKeyListener());

	}

	boolean bL = false;
	boolean bU = false;
	boolean bR = false;
	boolean bD = false;

	@Override
	public void paint(Graphics g) {

		System.out.println("tank");
		g.fillRect(x, y, 50, 50);

		// x+=10;
		// y+=10;

	}

	class MyKeyListener extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {

			int keyCode = e.getKeyCode();
			switch (keyCode) {

			case KeyEvent.VK_LEFT:
				x -= 10;
				bL = true;
				break;
			case KeyEvent.VK_UP:
				y -= 10;
				bU = true;
				break;
			case KeyEvent.VK_RIGHT:
				x += 10;
				bR = true;
				break;
			case KeyEvent.VK_DOWN:
				y += 10;
				bD = true;
				break;
			}

		}

		@Override
		public void keyReleased(KeyEvent e) {
			int keyCode = e.getKeyCode();
			switch (keyCode) {
			case KeyEvent.VK_LEFT:
				bL = false;
				break;
			case KeyEvent.VK_UP:
				bU = false;
				break;
			case KeyEvent.VK_RIGHT:
				bR = false;
				break;
			case KeyEvent.VK_DOWN:
				bD = false;
				break;
			}

		}

	}

}
