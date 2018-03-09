import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class UI extends JFrame implements ActionListener
{
	Harbour harbour;
	
	JPanel panel = new JPanel(new GridBagLayout());

	JLabel lblShipText = new JLabel("Nume vapor:");
	JTextField txtShipName = new JTextField(15);
	JButton btnShowShip = new JButton("Afisare vapor");

	JLabel lblShipDesc = new JLabel();

	public UI(Harbour h)
	{
		harbour = h;
		
		btnShowShip.addActionListener(this);

		GridBagConstraints c = new GridBagConstraints();

		c.gridx = 0;
		c.gridy = 0;
		panel.add(lblShipText, c);
		c.gridx = 1;
		c.gridy = 0;
		panel.add(txtShipName, c);
		c.gridx = 2;
		c.gridy = 0;
		panel.add(btnShowShip, c);

		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 3;
		panel.add(lblShipDesc, c);

		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String tofind = txtShipName.getText().toUpperCase();
		
		Ship s = harbour.Vapoare.stream().filter(x-> x.Nume.toUpperCase().contains(tofind)).findFirst().orElse(null);
		
		if(s==null)
		{
			lblShipDesc.setText("");
			JOptionPane.showMessageDialog(this, "Vaporul nu a fost gasit!");
		}
		else
		{
			lblShipDesc.setText(String.format("ora %2d:%2d - %s - %d pasageri", s.OraPlecarii.getHours(), s.OraPlecarii.getMinutes(), s.Nume, s.NumarLocuri));
		}

		this.pack();
	}
}
