package gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class FrmConsultaConcursoPorPremio extends JFrame  {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDesde;
	private JTextField txtHasta;
	private JTable table;
	private JButton btnFiltrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmConsultaConcursoPorPremio frame = new FrmConsultaConcursoPorPremio();
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
	public FrmConsultaConcursoPorPremio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 757, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConsultaConursoPor = new JLabel("Consulta Concurso por premio");
		lblConsultaConursoPor.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultaConursoPor.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblConsultaConursoPor.setBounds(44, 33, 664, 31);
		contentPane.add(lblConsultaConursoPor);
		
		JLabel lblPremio = new JLabel("Premio");
		lblPremio.setBounds(54, 101, 46, 14);
		contentPane.add(lblPremio);
		
		txtDesde = new JTextField();
		txtDesde.setBounds(182, 98, 129, 20);
		contentPane.add(txtDesde);
		txtDesde.setColumns(10);
		
		txtHasta = new JTextField();
		txtHasta.setBounds(336, 99, 129, 20);
		contentPane.add(txtHasta);
		txtHasta.setColumns(10);
		
		btnFiltrar = new JButton("Filtrar");
		btnFiltrar.setBounds(550, 98, 89, 23);
		contentPane.add(btnFiltrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 147, 625, 193);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nombre", "Precio", "Premio"
			}
		));
		scrollPane.setViewportView(table);
	}
	
	
	void mensaje(String msg) {
		JOptionPane.showMessageDialog(this, msg);
	}
}



