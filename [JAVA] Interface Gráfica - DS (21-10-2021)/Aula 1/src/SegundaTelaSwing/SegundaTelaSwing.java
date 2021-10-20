package SegundaTelaSwing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SegundaTelaSwing extends JFrame{ // Subclasse de JFrame do próprio JAVA
	
	// 1° Código é visivel
	// 2° Campo e Identificação do campo
	JLabel lblCodigo = new JLabel("Código"); 
	JTextField txtCodigo = new JTextField(2);
	
	JLabel lblPJ_PF = new JLabel("PJ/PF");
	JComboBox cboPJ_PF = new JComboBox();
	
	JLabel lblRazaoSNome = new JLabel("Razão S./Nome");
	JTextField txtRazaoSNome = new JTextField(30);
	
	JLabel lblCNPJ_CPF = new JLabel("CNPJ/CPF");
	JTextField txtCNPJ_CPF = new JTextField(14);
	
	JLabel lblIns_Est_RG = new JLabel("Ins. Est./RG");
	JTextField txtIns_Est_RG = new JTextField(9);
	
	JLabel lblTelefone1 = new JLabel("Telefone 1");
	JTextField txtTelefone1 = new JTextField(11);
	
	JLabel lblTelefone2 = new JLabel("Telefone 2");
	JTextField txtTelefone2 = new JTextField(11);
	
	JLabel lblEmail = new JLabel("E-mail");
	JTextField txtEmail = new JTextField(50);
	
	JLabel lblObservacoes = new JLabel("Observações");
	JTextField txtObservacoes = new JTextField(1000);
	
	JLabel lblAtividade_Profissao = new JLabel("Atividade/ Profissão");
	JTextField txtAtividade_Profissao = new JTextField();

	JLabel lblCEP = new JLabel("CEP");
	JTextField txtCEP = new JTextField();
	
	JLabel lblEstado = new JLabel("Estado");
	String [] Estados = {"AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", 
	"PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF"};
	JComboBox cboEstados = new JComboBox(Estados);
	
	JLabel lblCidade = new JLabel("Cidade");
	JTextField txtCidade = new JTextField();
	
	JLabel lblRua = new JLabel("Rua");
	JTextField txtRua = new JTextField();
	
	JLabel lblN_Comprimento = new JLabel("N° de Comprimento");
	JTextField txtN_Comprimento = new JTextField();
	
	JLabel lblBairro = new JLabel("Bairro");
	JTextField txtBairro = new JTextField();
	
	JLabel lblSite_Instagram = new JLabel("Site/Instagram");
	JTextField txtSite_Instagram = new JTextField();
	
	// Botões da Tela
	JButton btnGravar = new JButton("GRAVAR");
	JButton btnFechar = new JButton("FECHAR");
	
	// Utilizando construtor
	public SegundaTelaSwing() {  
		/* FlowLayout(): Ocorre quando os componentes GUI são colocados em 
		um contêiner da esquerda para a direita na ordem em que são colocadas.*/
		setLayout(new FlowLayout());
		
		Container c = getContentPane();
		
		// Os componentes serão apresentados na tela nesta ordem.
		/* Serve como janela mãe (desktop) das demais janelas. Um objeto JDesktopPene 
		pode conter diversos objetos JInternalFrame. */
		
		setLayout(new GridLayout(0,1));
		setTitle("CADASTRAR NOVO FORNECEDOR");
		c.add(lblCodigo);
		c.add(txtCodigo);
		c.add(lblPJ_PF);
		c.add(cboPJ_PF);
		c.add(lblRazaoSNome);
		c.add(txtRazaoSNome);
		c.add(lblCNPJ_CPF);
		c.add(txtCNPJ_CPF);
		c.add(lblIns_Est_RG);
		c.add(txtIns_Est_RG);
		c.add(lblTelefone1);
		c.add(txtTelefone1);
		c.add(lblTelefone2);
		c.add(txtTelefone2);
		c.add(lblEmail);
		c.add(txtEmail);
		c.add(lblObservacoes);
		c.add(txtObservacoes);
		c.add(lblAtividade_Profissao);
		c.add(txtAtividade_Profissao);
		c.add(lblCEP);
		c.add(txtCEP);
		c.add(lblEstado);
		c.add(cboEstados);
		c.add(lblCidade);
		c.add(txtCidade);
		c.add(lblRua);
		c.add(txtRua);
		c.add(lblN_Comprimento);
		c.add(txtN_Comprimento);
		c.add(lblBairro);
		c.add(txtBairro);
		c.add(lblSite_Instagram);
		c.add(txtSite_Instagram);
		
		c.add(btnGravar);
		c.add(btnFechar);
		
		setVisible(true);
		pack();
	}
}