package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class SegundaTela {

	private JFrame frame;
	private JTextField txtID;
	private JTextField textRazao_S_Nome;
	private JTextField textCNPJ_CPF;
	private JTextField textIns_Est_RG;
	private JTextField textTelefone;
	private JTextField textEmail;
	private JLabel lblEmail;
	private JLabel lblPJ_PF;
	private JLabel lblCNPJ_CPF;
	private JLabel lblIns_Est_RG;
	private JLabel lblTelefone;
	private JLabel lblID;
	private JPanel panelFundoAzul_1;
	private JLabel lblContato;
	private JPanel panelDados_Comerciais_1;
	private JComboBox comboBoxEstado;
	private JLabel lblCEP;
	private JTextField textCEP;
	private JLabel lblCidade;
	private JTextField textCidade;
	private JTextField textRua;
	private JTextField textN_e_Complemento;
	private JTextField textBairro;
	private JLabel lblBairro;
	private JTextField textSite_Instagram;
	private JLabel lblSite_Instagram;
	private JButton btnSalvar;
	private JButton btnExcluir;
	private JPanel panelFundoAzul_2;
	private JLabel lblObservacoes;
	private JPanel panelDados_Comerciais_2;
	private JTextArea textObservacoes;

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
					SegundaTela window = new SegundaTela();
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
	public SegundaTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 215, 0));
		frame.setBounds(100, 100, 690, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panelFundoAzul = new JPanel();
		panelFundoAzul.setBackground(Color.BLUE);
		panelFundoAzul.setBounds(10, 11, 300, 40);
		frame.getContentPane().add(panelFundoAzul);
		panelFundoAzul.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DADOS COMERCIAIS");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(68, 11, 157, 18);
		panelFundoAzul.add(lblNewLabel);
		
		JPanel panelDados_Comerciais = new JPanel();
		panelDados_Comerciais.setBounds(10, 50, 300, 264);
		frame.getContentPane().add(panelDados_Comerciais);
		panelDados_Comerciais.setLayout(null);
		
		textRazao_S_Nome = new JTextField();
		textRazao_S_Nome.setBounds(123, 84, 165, 25);
		panelDados_Comerciais.add(textRazao_S_Nome);
		textRazao_S_Nome.setForeground(Color.BLACK);
		textRazao_S_Nome.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textRazao_S_Nome.setColumns(10);
		
		textCNPJ_CPF = new JTextField();
		textCNPJ_CPF.setBounds(123, 156, 165, 25);
		panelDados_Comerciais.add(textCNPJ_CPF);
		textCNPJ_CPF.setForeground(Color.BLACK);
		textCNPJ_CPF.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textCNPJ_CPF.setColumns(10);
		
		textIns_Est_RG = new JTextField();
		textIns_Est_RG.setBounds(123, 192, 165, 25);
		panelDados_Comerciais.add(textIns_Est_RG);
		textIns_Est_RG.setForeground(Color.BLACK);
		textIns_Est_RG.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textIns_Est_RG.setColumns(10);
		
		textTelefone = new JTextField();
		textTelefone.setForeground(Color.BLACK);
		textTelefone.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textTelefone.setColumns(10);
		textTelefone.setBounds(123, 228, 165, 25);
		panelDados_Comerciais.add(textTelefone);
		
		JComboBox comboBoxPJ_PF = new JComboBox();
		comboBoxPJ_PF.setBackground(Color.LIGHT_GRAY);
		comboBoxPJ_PF.setModel(new DefaultComboBoxModel(new String[] {"(Escolha uma op\u00E7\u00E3o)", "Pessoa F\u00EDsica", "Pessoa Jur\u00EDdica"}));
		comboBoxPJ_PF.setBounds(123, 120, 165, 25);
		panelDados_Comerciais.add(comboBoxPJ_PF);
		comboBoxPJ_PF.setForeground(Color.BLACK);
		comboBoxPJ_PF.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		
		textEmail = new JTextField();
		textEmail.setForeground(Color.BLACK);
		textEmail.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textEmail.setColumns(10);
		textEmail.setBounds(123, 48, 165, 25);
		panelDados_Comerciais.add(textEmail);
		
		txtID = new JTextField();
		txtID.setBounds(123, 11, 64, 25);
		panelDados_Comerciais.add(txtID);
		txtID.setHorizontalAlignment(SwingConstants.CENTER);
		txtID.setFont(new Font("Lucida Console", Font.BOLD, 12));
		txtID.setText("30");
		txtID.setEditable(false);
		txtID.setColumns(10);
		
		lblEmail = new JLabel("E-MAIL");
		lblEmail.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblEmail.setBounds(68, 55, 49, 18);
		panelDados_Comerciais.add(lblEmail);
		
		lblPJ_PF = new JLabel("PJ/PF");
		lblPJ_PF.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblPJ_PF.setBounds(84, 124, 33, 25);
		panelDados_Comerciais.add(lblPJ_PF);
		
		lblCNPJ_CPF = new JLabel("CNPJ/CPF");
		lblCNPJ_CPF.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblCNPJ_CPF.setBounds(60, 163, 57, 18);
		panelDados_Comerciais.add(lblCNPJ_CPF);
		
		lblIns_Est_RG = new JLabel("INS. EST./RG");
		lblIns_Est_RG.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblIns_Est_RG.setBounds(31, 199, 86, 18);
		panelDados_Comerciais.add(lblIns_Est_RG);
		
		lblTelefone = new JLabel("TELEFONE");
		lblTelefone.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblTelefone.setBounds(49, 235, 68, 18);
		panelDados_Comerciais.add(lblTelefone);
		
		JLabel lblRazao_S_Nome = new JLabel("RAZ\u00C3O S./NOME");
		lblRazao_S_Nome.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblRazao_S_Nome.setBounds(10, 91, 107, 18);
		panelDados_Comerciais.add(lblRazao_S_Nome);
		
		lblID = new JLabel("ID");
		lblID.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblID.setBounds(101, 19, 16, 18);
		panelDados_Comerciais.add(lblID);
		
		panelFundoAzul_1 = new JPanel();
		panelFundoAzul_1.setLayout(null);
		panelFundoAzul_1.setBackground(Color.BLUE);
		panelFundoAzul_1.setBounds(320, 11, 344, 40);
		frame.getContentPane().add(panelFundoAzul_1);
		
		lblContato = new JLabel("ENDERE\u00C7O/CONTATO");
		lblContato.setForeground(Color.WHITE);
		lblContato.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblContato.setBounds(94, 11, 156, 18);
		panelFundoAzul_1.add(lblContato);
		
		panelDados_Comerciais_1 = new JPanel();
		panelDados_Comerciais_1.setLayout(null);
		panelDados_Comerciais_1.setBounds(320, 50, 344, 264);
		frame.getContentPane().add(panelDados_Comerciais_1);
		
		comboBoxEstado = new JComboBox();
		comboBoxEstado.setBackground(Color.LIGHT_GRAY);
		comboBoxEstado.setModel(new DefaultComboBoxModel(new String[] {"--", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		comboBoxEstado.setForeground(Color.BLACK);
		comboBoxEstado.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		comboBoxEstado.setBounds(169, 83, 59, 25);
		panelDados_Comerciais_1.add(comboBoxEstado);
		
		lblCEP = new JLabel("CEP");
		lblCEP.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblCEP.setBounds(140, 54, 21, 18);
		panelDados_Comerciais_1.add(lblCEP);
		
		textCEP = new JTextField();
		textCEP.setBounds(168, 47, 165, 25);
		panelDados_Comerciais_1.add(textCEP);
		textCEP.setForeground(Color.BLACK);
		textCEP.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textCEP.setColumns(10);
		
		lblCidade = new JLabel("CIDADE");
		lblCidade.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblCidade.setBounds(112, 18, 49, 18);
		panelDados_Comerciais_1.add(lblCidade);
		
		textCidade = new JTextField();
		textCidade.setForeground(Color.BLACK);
		textCidade.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textCidade.setColumns(10);
		textCidade.setBounds(168, 11, 165, 25);
		panelDados_Comerciais_1.add(textCidade);
		
		JLabel lblEstado = new JLabel("ESTADO");
		lblEstado.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblEstado.setBounds(109, 90, 53, 18);
		panelDados_Comerciais_1.add(lblEstado);
		
		textRua = new JTextField();
		textRua.setForeground(Color.BLACK);
		textRua.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textRua.setColumns(10);
		textRua.setBounds(168, 154, 165, 25);
		panelDados_Comerciais_1.add(textRua);
		
		JLabel lblRua = new JLabel("RUA");
		lblRua.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblRua.setBounds(135, 161, 26, 18);
		panelDados_Comerciais_1.add(lblRua);
		
		textN_e_Complemento = new JTextField();
		textN_e_Complemento.setForeground(Color.BLACK);
		textN_e_Complemento.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textN_e_Complemento.setColumns(10);
		textN_e_Complemento.setBounds(168, 190, 165, 25);
		panelDados_Comerciais_1.add(textN_e_Complemento);
		
		JLabel lblN_e_Complemento = new JLabel("N\u00B0 e COMPLEMENTO");
		lblN_e_Complemento.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblN_e_Complemento.setBounds(32, 197, 130, 18);
		panelDados_Comerciais_1.add(lblN_e_Complemento);
		
		textBairro = new JTextField();
		textBairro.setForeground(Color.BLACK);
		textBairro.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textBairro.setColumns(10);
		textBairro.setBounds(168, 120, 165, 25);
		panelDados_Comerciais_1.add(textBairro);
		
		lblBairro = new JLabel("BAIRRO");
		lblBairro.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblBairro.setBounds(110, 131, 53, 12);
		panelDados_Comerciais_1.add(lblBairro);
		
		textSite_Instagram = new JTextField();
		textSite_Instagram.setForeground(Color.BLACK);
		textSite_Instagram.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textSite_Instagram.setColumns(10);
		textSite_Instagram.setBounds(169, 226, 165, 25);
		panelDados_Comerciais_1.add(textSite_Instagram);
		
		lblSite_Instagram = new JLabel("SITE/INSTAGRAM");
		lblSite_Instagram.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblSite_Instagram.setBounds(46, 233, 115, 18);
		panelDados_Comerciais_1.add(lblSite_Instagram);
		
		btnSalvar = new JButton("SALVAR");
		btnSalvar.setBackground(new Color(0, 102, 51));
		btnSalvar.setForeground(Color.WHITE);
		btnSalvar.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnSalvar.setBounds(444, 325, 220, 58);
		frame.getContentPane().add(btnSalvar);
		
		btnExcluir = new JButton("EXCLUIR");
		btnExcluir.setForeground(Color.WHITE);
		btnExcluir.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnExcluir.setBackground(Color.RED);
		btnExcluir.setBounds(444, 392, 220, 58);
		frame.getContentPane().add(btnExcluir);
		
		panelFundoAzul_2 = new JPanel();
		panelFundoAzul_2.setLayout(null);
		panelFundoAzul_2.setBackground(Color.BLUE);
		panelFundoAzul_2.setBounds(10, 325, 424, 34);
		frame.getContentPane().add(panelFundoAzul_2);
		
		lblObservacoes = new JLabel("OBSERVA\u00C7\u00D5ES");
		lblObservacoes.setForeground(Color.WHITE);
		lblObservacoes.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblObservacoes.setBounds(155, 8, 106, 18);
		panelFundoAzul_2.add(lblObservacoes);
		
		panelDados_Comerciais_2 = new JPanel();
		panelDados_Comerciais_2.setBounds(10, 351, 424, 99);
		frame.getContentPane().add(panelDados_Comerciais_2);
		panelDados_Comerciais_2.setLayout(null);
		
		textObservacoes = new JTextArea();
		textObservacoes.setToolTipText("(Digite aqui uma observa\u00E7\u00E3o)");
		textObservacoes.setBackground(Color.WHITE);
		textObservacoes.setBounds(10, 20, 404, 65);
		panelDados_Comerciais_2.add(textObservacoes);
	}
}
