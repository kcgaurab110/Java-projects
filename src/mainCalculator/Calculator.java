package mainCalculator;

import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame{

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("CALCULATOR");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true); 
		
		//Java Swing Menu function 
		JMenuBar jmb = new JMenuBar();
		frame.setJMenuBar(jmb);
		
		JMenu fileMenu = new JMenu("File");
		JMenuItem newMenu = new JMenuItem("New");
		fileMenu.add(newMenu);
		
		JMenuItem openMenu = new JMenuItem("Open");
		fileMenu.add(openMenu);
		fileMenu.addSeparator();
		
		JMenuItem printMenu = new JMenuItem("Print");
		fileMenu.add(printMenu);
		
		JMenuItem exitMenu = new JMenuItem("Exit");
		fileMenu.add(exitMenu);
		
		
		JMenu helpMenu = new JMenu("Help");
//		JMenuItem perisianMenu = new JMenuItem("Perisian");
//		helpMenu.add(perisianMenu);
		
		
		
		jmb.add(fileMenu);
		jmb.add(helpMenu);
	}

}