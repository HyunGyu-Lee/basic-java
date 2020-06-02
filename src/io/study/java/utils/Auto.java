package io.study.java.utils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author dlgusrb0808@gmail.com
 */
public class Auto {

	public static void main(String[] args) throws AWTException {
		JFrame frm = new JFrame();
		frm.setBounds(100, 100, 1000, 500);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.requestFocus();
		frm.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				System.exit(-1);
			}
		});
		frm.setVisible(true);

		Robot robot = new Robot();

		int handle = 0;
		int x = 100;
		int y = 200;
		int xdirection = 1;

		while (handle < 1000000) {

			if (x == 99 || x == 1001) {
				xdirection *= -1;
			}

			x += xdirection;

//			System.out.println(String.format("%d, %d", x, y));
			robot.mouseMove(x, y);

			synchronized (Auto.class) {
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			handle++;
		}
		frm.dispose();
	}

}
