package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class QuartaTela {

	private JFrame frame;
	private JTextField textCodigo;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        } catch (InstantiationException ex) {
        	System.err.println(ex);
        } catch (IllegalAccessException ex) {
        	System.err.println(ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        	System.err.println(ex);
        }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuartaTela window = new QuartaTela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public QuartaTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 153, 204));
		frame.getContentPane().setLayout(null);
		
		JPanel panelFudoAzul = new JPanel();
		panelFudoAzul.setBackground(new Color(51, 51, 204));
		panelFudoAzul.setBounds(33, 28, 515, 43);
		frame.getContentPane().add(panelFudoAzul);
		panelFudoAzul.setLayout(null);
		
		JLabel lblNovosClientes = new JLabel("NOVOS CLIENTES");
		lblNovosClientes.setForeground(Color.WHITE);
		lblNovosClientes.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblNovosClientes.setBounds(192, 13, 132, 18);
		panelFudoAzul.add(lblNovosClientes);
		
		JPanel panelDadosCadastrais = new JPanel();
		panelDadosCadastrais.setBackground(new Color(192, 192, 192));
		panelDadosCadastrais.setBounds(33, 69, 515, 288);
		frame.getContentPane().add(panelDadosCadastrais);
		panelDadosCadastrais.setLayout(null);
		
		JLabel lblCodigo = new JLabel("C\u00D3DIGO");
		lblCodigo.setForeground(Color.BLACK);
		lblCodigo.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblCodigo.setBounds(63, 18, 51, 18);
		panelDadosCadastrais.add(lblCodigo);
		
		textCodigo = new JTextField();
		textCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		textCodigo.setFont(new Font("Lucida Console", Font.BOLD, 12));
		textCodigo.setEditable(false);
		textCodigo.setColumns(10);
		textCodigo.setBounds(122, 11, 64, 25);
		panelDadosCadastrais.add(textCodigo);
		
		JLabel lblNome = new JLabel("NOME");
		lblNome.setForeground(Color.BLACK);
		lblNome.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblNome.setBounds(212, 18, 51, 18);
		panelDadosCadastrais.add(lblNome);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textField.setColumns(10);
		textField.setBounds(259, 11, 198, 25);
		panelDadosCadastrais.add(textField);
		
		JLabel lblEndereo = new JLabel("ENDERE\u00C7O");
		lblEndereo.setForeground(Color.BLACK);
		lblEndereo.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblEndereo.setBounds(63, 62, 68, 18);
		panelDadosCadastrais.add(lblEndereo);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(141, 55, 316, 25);
		panelDadosCadastrais.add(textField_1);
		
		JLabel lblNome_2 = new JLabel("BAIRRO");
		lblNome_2.setForeground(Color.BLACK);
		lblNome_2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblNome_2.setBounds(63, 108, 51, 18);
		panelDadosCadastrais.add(lblNome_2);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.BLACK);
		textField_2.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(122, 101, 129, 25);
		panelDadosCadastrais.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.BLACK);
		textField_3.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(328, 101, 129, 25);
		panelDadosCadastrais.add(textField_3);
		
		JLabel lblNome_2_1 = new JLabel("CIDADE");
		lblNome_2_1.setForeground(Color.BLACK);
		lblNome_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblNome_2_1.setBounds(269, 108, 51, 18);
		panelDadosCadastrais.add(lblNome_2_1);
		
		JLabel lblNome_2_2 = new JLabel("CEP");
		lblNome_2_2.setForeground(Color.BLACK);
		lblNome_2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblNome_2_2.setBounds(93, 153, 21, 18);
		panelDadosCadastrais.add(lblNome_2_2);
		
		textField_4 = new JTextField();
		textField_4.setForeground(Color.BLACK);
		textField_4.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(122, 146, 129, 25);
		panelDadosCadastrais.add(textField_4);
		
		JLabel lblNome_2_1_1 = new JLabel("ESTADO");
		lblNome_2_1_1.setForeground(Color.BLACK);
		lblNome_2_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblNome_2_1_1.setBounds(269, 153, 57, 18);
		panelDadosCadastrais.add(lblNome_2_1_1);
		
		JComboBox comboBoxEstado = new JComboBox();
		comboBoxEstado.setModel(new DefaultComboBoxModel(new String[] {"(Escolha uma op\u00E7\u00E3o)", "Acre - AC", "Alagoas - AL", "Amap\u00E1 - AP", "Amazonas - AM", "Bahia - BA", "Cear\u00E1 - CE", "Esp\u00EDrito Santo - ES", "Distrito Federal - DF", "Goi\u00E1s - GO", "Maranh\u00E3o - MA", "Mato Grosso - MT", "Mato Grosso do Sul - MS", "Minas Gerais - MG", "Par\u00E1 - PA", "Para\u00EDba - PB", "Paran\u00E1 - PR", "Pernambuco - PE", "Piau\u00ED - PI", "Rio de Janeiro - RJ", "Rio Grande do Norte - RN", "Rio Grande do Sul - RS", "Rond\u00F4nia - RO", "Roraima - RR", "Santa Catarina - SC", "S\u00E3o Paulo - SP", "Sergipe - SE", "Tocantins - TO"}));
		comboBoxEstado.setForeground(Color.BLACK);
		comboBoxEstado.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		comboBoxEstado.setBounds(328, 146, 129, 25);
		panelDadosCadastrais.add(comboBoxEstado);
		frame.setBounds(100, 100, 600, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
