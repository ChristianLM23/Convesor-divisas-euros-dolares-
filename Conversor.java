import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Conversor extends JFrame {

	private JPanel contentPane;
	private JTextField euros;
	private JTextField dolares;
	float d = (float) 1.1261;
	float e = (float) 0.8879;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Conversor() {
		setTitle("Conversor de divisas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		euros = new JTextField();
		euros.setBounds(136, 65, 86, 20);
		contentPane.add(euros);
		euros.setColumns(10);
		
		dolares = new JTextField();
		dolares.setText("");
		dolares.setBounds(136, 142, 86, 20);
		contentPane.add(dolares);
		dolares.setColumns(10);
		
		JLabel lblEuros = new JLabel("Euros");
		lblEuros.setBounds(30, 68, 46, 14);
		contentPane.add(lblEuros);
		
		JLabel lblDolares = new JLabel("Dolares");
		lblDolares.setBounds(30, 145, 46, 14);
		contentPane.add(lblDolares);
		
		JButton btnTo = new JButton("to $$$");
		btnTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float euross= Float.parseFloat(euros.getText());
				float resultado = (euross * d);
				String conversion = String.valueOf(resultado);
				dolares.setText(conversion);
				
				
			}
		});
		btnTo.setBounds(287, 64, 89, 23);
		contentPane.add(btnTo);
		
		JButton btnTo_1 = new JButton("to \u20AC\u20AC\u20AC");
		btnTo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float dolaress= Float.parseFloat(dolares.getText());
				float resultado = dolaress * Conversor.this.e;
				String conversion = String.valueOf(resultado);
				euros.setText(conversion);
			}
		});
		btnTo_1.setBounds(287, 141, 89, 23);
		contentPane.add(btnTo_1);
		
		JButton btnClean = new JButton("CLEAN");
		btnClean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				euros.setText("");
				dolares.setText("");
			}
		});
		btnClean.setBounds(30, 215, 89, 23);
		contentPane.add(btnClean);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(287, 215, 89, 23);
		contentPane.add(btnExit);
		
		JLabel lblParaPonerDecimales = new JLabel("Para poner decimales se utiliza el punto. Ejemplo 5.21");
		lblParaPonerDecimales.setBounds(30, 26, 346, 14);
		contentPane.add(lblParaPonerDecimales);
	}
}
