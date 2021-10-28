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
import javax.swing.JButton;
import javax.swing.DropMode;

public class QuartaTela {

	private JFrame frame;
	private JTextField textCodigo;
	private JTextField textField;
	private JTextField textEndereco;
	private JTextField textBairro;
	private JTextField textCidade;
	private JTextField textCEP;
	private JTextField textTelefone;

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
		
		JPanel panelFundoAzul = new JPanel();
		panelFundoAzul.setBackground(new Color(51, 51, 204));
		panelFundoAzul.setBounds(33, 28, 515, 43);
		frame.getContentPane().add(panelFundoAzul);
		panelFundoAzul.setLayout(null);
		
		JLabel lblNovosClientes = new JLabel("NOVOS CLIENTES");
		lblNovosClientes.setForeground(Color.WHITE);
		lblNovosClientes.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblNovosClientes.setBounds(192, 13, 132, 18);
		panelFundoAzul.add(lblNovosClientes);
		
		JPanel panelDadosCadastrais = new JPanel();
		panelDadosCadastrais.setBackground(new Color(192, 192, 192));
		panelDadosCadastrais.setBounds(33, 69, 515, 345);
		frame.getContentPane().add(panelDadosCadastrais);
		panelDadosCadastrais.setLayout(null);
		
		JLabel lblCodigo = new JLabel("C\u00D3DIGO");
		lblCodigo.setForeground(Color.BLACK);
		lblCodigo.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblCodigo.setBounds(63, 18, 51, 18);
		panelDadosCadastrais.add(lblCodigo);
		
		textCodigo = new JTextField();
		textCodigo.setText("325");
		textCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		textCodigo.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
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
		
		JLabel lblEndereco = new JLabel("ENDERE\u00C7O");
		lblEndereco.setForeground(Color.BLACK);
		lblEndereco.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblEndereco.setBounds(46, 62, 68, 18);
		panelDadosCadastrais.add(lblEndereco);
		
		textEndereco = new JTextField();
		textEndereco.setForeground(Color.BLACK);
		textEndereco.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textEndereco.setColumns(10);
		textEndereco.setBounds(122, 55, 335, 25);
		panelDadosCadastrais.add(textEndereco);
		
		JLabel lblBairro = new JLabel("BAIRRO");
		lblBairro.setForeground(Color.BLACK);
		lblBairro.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblBairro.setBounds(63, 108, 51, 18);
		panelDadosCadastrais.add(lblBairro);
		
		textBairro = new JTextField();
		textBairro.setForeground(Color.BLACK);
		textBairro.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textBairro.setColumns(10);
		textBairro.setBounds(122, 101, 129, 25);
		panelDadosCadastrais.add(textBairro);
		
		textCidade = new JTextField();
		textCidade.setForeground(Color.BLACK);
		textCidade.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textCidade.setColumns(10);
		textCidade.setBounds(328, 101, 129, 25);
		panelDadosCadastrais.add(textCidade);
		
		JLabel lblCidade = new JLabel("CIDADE");
		lblCidade.setForeground(Color.BLACK);
		lblCidade.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblCidade.setBounds(269, 108, 51, 18);
		panelDadosCadastrais.add(lblCidade);
		
		JLabel lblCEP = new JLabel("CEP");
		lblCEP.setForeground(Color.BLACK);
		lblCEP.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblCEP.setBounds(93, 153, 21, 18);
		panelDadosCadastrais.add(lblCEP);
		
		textCEP = new JTextField();
		textCEP.setForeground(Color.BLACK);
		textCEP.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textCEP.setColumns(10);
		textCEP.setBounds(122, 146, 129, 25);
		panelDadosCadastrais.add(textCEP);
		
		JLabel lblEstado = new JLabel("ESTADO");
		lblEstado.setForeground(Color.BLACK);
		lblEstado.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblEstado.setBounds(269, 153, 57, 18);
		panelDadosCadastrais.add(lblEstado);
		
		JComboBox comboBoxEstado = new JComboBox();
		comboBoxEstado.setModel(new DefaultComboBoxModel(new String[] {"(Escolha uma op\u00E7\u00E3o)", "Acre - AC", "Alagoas - AL", "Amap\u00E1 - AP", "Amazonas - AM", "Bahia - BA", "Cear\u00E1 - CE", "Esp\u00EDrito Santo - ES", "Distrito Federal - DF", "Goi\u00E1s - GO", "Maranh\u00E3o - MA", "Mato Grosso - MT", "Mato Grosso do Sul - MS", "Minas Gerais - MG", "Par\u00E1 - PA", "Para\u00EDba - PB", "Paran\u00E1 - PR", "Pernambuco - PE", "Piau\u00ED - PI", "Rio de Janeiro - RJ", "Rio Grande do Norte - RN", "Rio Grande do Sul - RS", "Rond\u00F4nia - RO", "Roraima - RR", "Santa Catarina - SC", "S\u00E3o Paulo - SP", "Sergipe - SE", "Tocantins - TO"}));
		comboBoxEstado.setForeground(Color.BLACK);
		comboBoxEstado.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		comboBoxEstado.setBounds(328, 146, 129, 25);
		panelDadosCadastrais.add(comboBoxEstado);
		
		JLabel lblTelefone = new JLabel("TELEFONE");
		lblTelefone.setForeground(Color.BLACK);
		lblTelefone.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblTelefone.setBounds(46, 200, 68, 18);
		panelDadosCadastrais.add(lblTelefone);
		
		textTelefone = new JTextField();
		textTelefone.setForeground(Color.BLACK);
		textTelefone.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textTelefone.setColumns(10);
		textTelefone.setBounds(122, 193, 171, 25);
		panelDadosCadastrais.add(textTelefone);
		
		JLabel lblObservacoes = new JLabel("OBSERVA\u00C7\u00D5ES");
		lblObservacoes.setForeground(Color.BLACK);
		lblObservacoes.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblObservacoes.setBounds(23, 241, 92, 18);
		panelDadosCadastrais.add(lblObservacoes);
		
		JTextArea textOberservacoes = new JTextArea();
		textOberservacoes.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textOberservacoes.setToolTipText("(Digite aqui uma observa\u00E7\u00E3o)");
		textOberservacoes.setBounds(123, 239, 335, 87);
		panelDadosCadastrais.add(textOberservacoes);
		
		JPanel panelOpcoes = new JPanel();
		panelOpcoes.setBounds(33, 414, 515, 100);
		frame.getContentPane().add(panelOpcoes);
		panelOpcoes.setLayout(null);
		
		JButton btnNewButton = new JButton("NOVO");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(51, 51, 204));
		btnNewButton.setBounds(29, 11, 124, 34);
		panelOpcoes.add(btnNewButton);
		
		JButton btnAlterar = new JButton("ALTERAR");
		btnAlterar.setForeground(Color.WHITE);
		btnAlterar.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnAlterar.setBackground(new Color(51, 51, 204));
		btnAlterar.setBounds(29, 56, 124, 34);
		panelOpcoes.add(btnAlterar);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.setForeground(Color.WHITE);
		btnSalvar.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnSalvar.setBackground(new Color(51, 51, 204));
		btnSalvar.setBounds(163, 11, 124, 34);
		panelOpcoes.add(btnSalvar);
		
		JButton btnRelatrio = new JButton("RELAT\u00D3RIO");
		btnRelatrio.setBounds(163, 56, 124, 34);
		panelOpcoes.add(btnRelatrio);
		btnRelatrio.setForeground(Color.WHITE);
		btnRelatrio.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnRelatrio.setBackground(new Color(51, 51, 204));
		
		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.setBounds(354, 11, 124, 34);
		panelOpcoes.add(btnExcluir);
		btnExcluir.setForeground(Color.WHITE);
		btnExcluir.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnExcluir.setBackground(Color.RED);
		
		JButton btnRetomar = new JButton("RETOMAR");
		btnRetomar.setBounds(354, 56, 124, 34);
		panelOpcoes.add(btnRetomar);
		btnRetomar.setForeground(Color.WHITE);
		btnRetomar.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnRetomar.setBackground(Color.RED);
		
		JPanel panelEspacamento = new JPanel();
		panelEspacamento.setBackground(new Color(51, 51, 204));
		panelEspacamento.setBounds(319, 0, 1, 100);
		panelOpcoes.add(panelEspacamento);
		frame.setBounds(100, 100, 600, 585);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
