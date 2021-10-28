package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;

public class TerceiraTela {

	private JFrame frame;
	private JTextField textEspecie;
	private JTextField textResultado_Especie;
	private JTextField textUnid_Entrada;
	private JTextField textResultado_Unid_Entrada;
	private JTextField textQt_Subdivisao;
	private JTextField textUnid_Saida;
	private JTextField textResultado_Unid_Saida;

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
					TerceiraTela window = new TerceiraTela();
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
	public TerceiraTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 215, 0));
		frame.setBounds(100, 100, 610, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panelFundoAzul = new JPanel();
		panelFundoAzul.setBounds(23, 22, 544, 36);
		panelFundoAzul.setBackground(new Color(0, 0, 255));
		frame.getContentPane().add(panelFundoAzul);
		panelFundoAzul.setLayout(null);
		
		JLabel lblProduto = new JLabel("NOVO PRODUTO");
		lblProduto.setForeground(Color.WHITE);
		lblProduto.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblProduto.setBounds(215, 9, 116, 18);
		panelFundoAzul.add(lblProduto);
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBounds(23, 57, 544, 305);
		frame.getContentPane().add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		JLabel lblDescricao = new JLabel("DESCRI\u00C7\u00C3O");
		lblDescricao.setBackground(Color.WHITE);
		lblDescricao.setForeground(Color.BLACK);
		lblDescricao.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblDescricao.setBounds(69, 198, 73, 18);
		panelPrincipal.add(lblDescricao);
		
		JTextArea textDescricao = new JTextArea();
		textDescricao.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textDescricao.setToolTipText("(Digite aqui a descri\u00E7\u00E3o do produto)");
		textDescricao.setBounds(152, 191, 343, 95);
		panelPrincipal.add(textDescricao);
		
		JLabel lblEspecie = new JLabel("ESP\u00C9CIE");
		lblEspecie.setForeground(Color.BLACK);
		lblEspecie.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblEspecie.setBackground(Color.WHITE);
		lblEspecie.setBounds(90, 19, 52, 18);
		panelPrincipal.add(lblEspecie);
		
		textEspecie = new JTextField();
		textEspecie.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textEspecie.setBounds(152, 12, 120, 25);
		panelPrincipal.add(textEspecie);
		textEspecie.setColumns(10);
		
		textResultado_Especie = new JTextField();
		textResultado_Especie.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textResultado_Especie.setBackground(Color.LIGHT_GRAY);
		textResultado_Especie.setEditable(false);
		textResultado_Especie.setColumns(10);
		textResultado_Especie.setBounds(282, 12, 180, 25);
		panelPrincipal.add(textResultado_Especie);
		
		JLabel lblUnidEntrada = new JLabel("UNID. ENTRADA");
		lblUnidEntrada.setForeground(Color.BLACK);
		lblUnidEntrada.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblUnidEntrada.setBackground(Color.WHITE);
		lblUnidEntrada.setBounds(36, 125, 106, 18);
		panelPrincipal.add(lblUnidEntrada);
		
		textUnid_Entrada = new JTextField();
		textUnid_Entrada.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textUnid_Entrada.setColumns(10);
		textUnid_Entrada.setBounds(152, 118, 120, 25);
		panelPrincipal.add(textUnid_Entrada);
		
		textResultado_Unid_Entrada = new JTextField();
		textResultado_Unid_Entrada.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textResultado_Unid_Entrada.setBackground(Color.LIGHT_GRAY);
		textResultado_Unid_Entrada.setEditable(false);
		textResultado_Unid_Entrada.setColumns(10);
		textResultado_Unid_Entrada.setBounds(282, 118, 180, 25);
		panelPrincipal.add(textResultado_Unid_Entrada);
		
		JButton btnProcurar1 = new JButton("");
		btnProcurar1.setBounds(462, 11, 33, 25);
		panelPrincipal.add(btnProcurar1);
		
		JButton btnProcurar2 = new JButton("");
		btnProcurar2.setBounds(462, 117, 33, 25);
		panelPrincipal.add(btnProcurar2);
		
		JLabel lblUnidEntrada_1_2 = new JLabel("QT. SUBDIVIS\u00C3O");
		lblUnidEntrada_1_2.setForeground(Color.BLACK);
		lblUnidEntrada_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblUnidEntrada_1_2.setBackground(Color.WHITE);
		lblUnidEntrada_1_2.setBounds(30, 89, 112, 18);
		panelPrincipal.add(lblUnidEntrada_1_2);
		
		textQt_Subdivisao = new JTextField();
		textQt_Subdivisao.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textQt_Subdivisao.setColumns(10);
		textQt_Subdivisao.setBounds(152, 82, 120, 25);
		panelPrincipal.add(textQt_Subdivisao);
		
		JLabel lblUnidEntrada_1_3 = new JLabel("UNID. SA\u00CDDA");
		lblUnidEntrada_1_3.setForeground(Color.BLACK);
		lblUnidEntrada_1_3.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblUnidEntrada_1_3.setBackground(Color.WHITE);
		lblUnidEntrada_1_3.setBounds(55, 162, 87, 18);
		panelPrincipal.add(lblUnidEntrada_1_3);
		
		textUnid_Saida = new JTextField();
		textUnid_Saida.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textUnid_Saida.setColumns(10);
		textUnid_Saida.setBounds(152, 155, 120, 25);
		panelPrincipal.add(textUnid_Saida);
		
		textResultado_Unid_Saida = new JTextField();
		textResultado_Unid_Saida.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		textResultado_Unid_Saida.setEditable(false);
		textResultado_Unid_Saida.setColumns(10);
		textResultado_Unid_Saida.setBackground(Color.LIGHT_GRAY);
		textResultado_Unid_Saida.setBounds(282, 155, 180, 25);
		panelPrincipal.add(textResultado_Unid_Saida);
		
		JButton btnProcurar3 = new JButton("");
		btnProcurar3.setBounds(462, 154, 33, 25);
		panelPrincipal.add(btnProcurar3);
		
		JLabel lblSubdivsivel = new JLabel("SUBDIV\u00CDSIVEL");
		lblSubdivsivel.setBounds(48, 52, 94, 18);
		panelPrincipal.add(lblSubdivsivel);
		lblSubdivsivel.setForeground(Color.BLACK);
		lblSubdivsivel.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblSubdivsivel.setBackground(Color.WHITE);
		
		JComboBox comboBox_Subdivisivel = new JComboBox();
		comboBox_Subdivisivel.setBounds(152, 48, 160, 22);
		panelPrincipal.add(comboBox_Subdivisivel);
		comboBox_Subdivisivel.setFont(new Font("Franklin Gothic Book", Font.BOLD, 12));
		comboBox_Subdivisivel.setModel(new DefaultComboBoxModel(new String[] {"(Escolha uma op\u00E7\u00E3o)", "(---------------------)", "(---------------------)", "(---------------------)"}));
	}
}
