import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageTypeSpecifier;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LPierwsze extends JFrame {

	LPierwsze() {

		JPanel p = new JPanel();
		JLabel tekst = new JLabel("Podaj liczbê do sprawdzenia, czy jest liczb¹ pierwsz¹");

		JButton przycisk;
		JLabel wynik;
		JTextField liczba = new JTextField(20);

		setSize(500, 500);
		setLocation(100, 100);
		setTitle("Liczba pierwsza");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		przycisk = new JButton("SprawdŸ");
		wynik = new JLabel(" ");
		// p.setLayout(new FlowLayout(1));
		p.setLayout(new GridLayout(7, 5));

		przycisk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = liczba.getText();
				int l1 = Integer.parseInt(s1);
				if (l1 > 2) {
					wynik.setText("Poda³eœ '1' - to oczywiste, ¿e nie jest liczb¹ pierwsz¹");
				}
				for (int i = 2; i <= Math.sqrt(l1); i++) {
					if (l1 % i == 0) {
						wynik.setText("nie pierwsza");
						break;
					} else {
						wynik.setText("pierwsza");
					}
				}
			}
		});

		p.setBackground(Color.pink);
		p.add(tekst);
		p.add(liczba);
		p.add(przycisk);
		p.add(wynik);
		add(p);
	}
}