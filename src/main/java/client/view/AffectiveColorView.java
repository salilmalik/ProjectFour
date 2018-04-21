package client.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

import client.controller.AffectiveColorController;

public class AffectiveColorView extends JPanel {
	public AffectiveColorView() {
		setLayout(new BorderLayout());
		setBackground(Color.BLUE);
		JButton focusButton = new JButton("FOCUS");
		focusButton.addActionListener(new AffectiveColorController());
		add(focusButton);
	}

}
