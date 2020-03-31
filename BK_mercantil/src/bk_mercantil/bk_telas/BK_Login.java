package bk_mercantil.bk_telas;

import bk_mercantil.funcionarios.BK_funcionario;
import bk_mercantil.funcionarios.BK_caixa;
import bk_mercantil.funcionarios.BK_gerente;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BK_Login extends JFrame {

    BK_TelaInicial t1 = new BK_TelaInicial();

    BK_funcionario f1 = new BK_funcionario();
    BK_funcionario f2 = new BK_funcionario();
    BK_funcionario f3 = new BK_funcionario();
    BK_gerente g1 = new BK_gerente();
    BK_caixa c1 = new BK_caixa();
    BK_caixa c2 = new BK_caixa();

    //tela principal
    JFrame frame_Login = new JFrame();

    public void BK_Login() {

        frame_Login.setSize(600, 150);
        frame_Login.setLocationRelativeTo(null);
        frame_Login.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame_Login.setVisible(true);

        //painel north
        JPanel jPanel_North = new JPanel();
        frame_Login.add(BorderLayout.NORTH, jPanel_North);

        JLabel jLabel_Caixa = new JLabel("Login");
        Font f = new Font("Bookman Old Style", Font.BOLD, 15);//formatei minha label
        jLabel_Caixa.setFont(f);
        jPanel_North.add(jLabel_Caixa);

        //painel CENTER
        JPanel jPanel_Center = new JPanel();
        frame_Login.add(BorderLayout.CENTER, jPanel_Center);

        JLabel jLabel_Usuario = new JLabel("Usúario");
        jPanel_Center.add(jLabel_Usuario);

        JTextField field_Usuario = new JTextField(15);
        jPanel_Center.add(field_Usuario);

        JLabel jLabel_Senha = new JLabel("Senha");
        jPanel_Center.add(jLabel_Senha);

        JTextField field_Senha = new JTextField(10);
        jPanel_Center.add(field_Senha);

        JButton button_Logar = new JButton("Entrar");
        button_Logar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                f1.setBK_nome("Breno");
                f1.setBK_idade(20);
                f1.setBK_sexo('M');
                f1.setBK_Tel(991638946);

                //gerentes
                g1.setBK_nome(f1.getBK_nome());
                g1.setBK_funcao("Gerente");
                g1.setSalario(1040);
                g1.setBK_idade(f1.getBK_idade());
                g1.setBK_sexo(f1.getBK_sexo());
                g1.setBK_Tel(f1.getBK_Tel());
                g1.setBK_Usuario("gerentebreno");
                g1.setBK_Senha("1234");

                String user = field_Usuario.getText();
                String pass = field_Senha.getText();
                //gerente
                if (user.equals(g1.getBK_Usuario()) && pass.equals(g1.getBK_Senha())) {
                    JOptionPane.showMessageDialog(null, "Bem vindo" + g1.getBK_nome());
                    frame_Login.dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Usuário inválido");
                }

            }
        });

        jPanel_Center.add(button_Logar);

        JButton button_Cancelar = new JButton("Cancelar");
        button_Cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                frame_Login.dispose();
            }
        });
        jPanel_Center.add(button_Cancelar);

    }
}
