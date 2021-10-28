package Telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import java.awt.Panel;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import java.awt.Checkbox;

public class PrimeiraTela {

	private JFrame frame;
	private JTextField textNome;
	private JPasswordField passwordSenha;
	private final JPanel panel_1 = new JPanel();

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
					PrimeiraTela window = new PrimeiraTela();
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
	public PrimeiraTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 153, 204));
		frame.setBounds(100, 100, 349, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel Panel_Principal = new JPanel();
		Panel_Principal.setBackground(new Color(192, 192, 192));
		Panel_Principal.setBounds(43, 42, 245, 205);
		frame.getContentPane().add(Panel_Principal);
		Panel_Principal.setLayout(null);
		
		JButton btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Logado com Sucesso!");
			}
		});
		btnEntrar.setBackground(new Color(51, 51, 204));
		btnEntrar.setForeground(Color.WHITE);
		btnEntrar.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		btnEntrar.setBounds(69, 162, 103, 25);
		Panel_Principal.add(btnEntrar);
		
		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setBounds(10, 76, 59, 25);
		Panel_Principal.add(lblSenha);
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setBackground(new Color(0, 0, 0));
		lblSenha.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		
		passwordSenha = new JPasswordField();
		passwordSenha.setBounds(10, 100, 221, 25);
		Panel_Principal.add(passwordSenha);
		passwordSenha.setHorizontalAlignment(SwingConstants.LEFT);
		passwordSenha.setFont(new Font("Lucida Console", Font.BOLD, 12));
		passwordSenha.setBackground(Color.WHITE);
		passwordSenha.setToolTipText("");
		
		JLabel lblNome = new JLabel("LOGIN");
		lblNome.setBounds(10, 21, 59, 25);
		Panel_Principal.add(lblNome);
		lblNome.setForeground(Color.BLACK);
		lblNome.setBackground(new Color(0, 0, 0));
		lblNome.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		
		textNome = new JTextField();
		textNome.setBounds(10, 46, 221, 25);
		Panel_Principal.add(textNome);
		textNome.setToolTipText("");
		textNome.setHorizontalAlignment(SwingConstants.LEFT);
		textNome.setFont(new Font("Lucida Sans", Font.BOLD, 12));
		textNome.setColumns(10);
		
		Checkbox checkbox_LembrarSenha = new Checkbox("Lembrar senha");
		checkbox_LembrarSenha.setFont(new Font("Arial", Font.BOLD, 12));
		checkbox_LembrarSenha.setBackground(new Color(192, 192, 192));
		checkbox_LembrarSenha.setBounds(10, 131, 129, 22);
		Panel_Principal.add(checkbox_LembrarSenha);
		panel_1.setBackground(new Color(51, 51, 204));
		panel_1.setBounds(43, 11, 245, 35);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTela_de_Login = new JLabel("LOGIN");
		lblTela_de_Login.setBounds(95, 6, 55, 19);
		panel_1.add(lblTela_de_Login);
		lblTela_de_Login.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblTela_de_Login.setForeground(Color.WHITE);
	}
}
