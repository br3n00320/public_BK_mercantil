package bk_mercantil.bk_telas;

import bk_mercantil.funcionarios.BK_caixa;
import bk_mercantil.funcionarios.BK_funcionario;
import bk_mercantil.funcionarios.BK_gerente;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BK_TelaInicial extends JFrame {

    BK_funcionario f1 = new BK_funcionario();
    BK_funcionario f2 = new BK_funcionario();
    BK_funcionario f3 = new BK_funcionario();
    BK_gerente g1 = new BK_gerente();
    BK_caixa c1 = new BK_caixa();
    BK_caixa c2 = new BK_caixa();

    JLabel jLabel_Caixa = new JLabel("CAIXA");
    JLabel jLabel_Stts = new JLabel("LIVRE");

    JPanel jPanel_East = new JPanel();

    JLabel jLabel_Usuario = new JLabel("Não logado");

    JButton button_Logar = new JButton("Entrar");

    public void BK_TelaInicial() {

        JFrame BK_TelaPrincipal = new JFrame();
        BK_TelaPrincipal.setSize(1200, 650);
        BK_TelaPrincipal.setLocationRelativeTo(null);
        BK_TelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BK_TelaPrincipal.setVisible(true);

        //painel north
        JPanel jPanel_north = new JPanel();
        //CAIXA
        Font f = new Font("Bookman Old Style", Font.BOLD, 45);//formatei minha label
        jLabel_Caixa.setFont(f);
        jPanel_north.add(jLabel_Caixa);
        BK_TelaPrincipal.add(BorderLayout.NORTH, jPanel_north);

        Font f1 = new Font("Bookman Old Style", Font.BOLD, 45);//formatei minha label
        jLabel_Stts.setFont(f1);
        jPanel_north.add(jLabel_Stts);
        BK_TelaPrincipal.add(BorderLayout.NORTH, jPanel_north);

        //painel EAST
        jPanel_East.setLayout(new GridLayout(6, 1));
        BK_TelaPrincipal.add(BorderLayout.EAST, jPanel_East);

        jPanel_East.add(jLabel_Usuario);

        button_Logar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                BK_Login bK_Login = new BK_Login();
                bK_Login.BK_Login();

            }
        });
        jPanel_East.add(button_Logar);

        JLabel jLabel_Quantidade = new JLabel("Quantidade");
        jPanel_East.add(jLabel_Quantidade);

        JTextField field_Quantidade = new JTextField(20);
        field_Quantidade.setEnabled(false);
        jPanel_East.add(field_Quantidade);

        JLabel jLabel_Preco = new JLabel("Preço");
        jPanel_East.add(jLabel_Preco);

        JTextField field_Preco = new JTextField(20);
        field_Preco.setEnabled(false);
        jPanel_East.add(field_Preco);

        //painel center
        JPanel jPanel_Center = new JPanel();
        jPanel_Center.setLayout(new GridLayout(2, 1));
        BK_TelaPrincipal.add(BorderLayout.CENTER, jPanel_Center);

        JLabel jLabel_Descricao = new JLabel("Sua compra");
        jPanel_Center.add(jLabel_Descricao);

        JTextArea area_Descricao = new JTextArea();
        area_Descricao.setEnabled(false);
        jPanel_Center.add(area_Descricao);

        //painel south
        JPanel jPanel_South = new JPanel();
        jPanel_South.setLayout(new GridLayout(1, 6));
        BK_TelaPrincipal.add(BorderLayout.SOUTH, jPanel_South);

        //botoes
        JButton button_FinalizarCompra = new JButton("Finalizar Compra");
        button_FinalizarCompra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                BK_TelaFinalizarPedido bK_TelaFinalizarPedido = new BK_TelaFinalizarPedido();

                bK_TelaFinalizarPedido.BK_TelaFinalizarPedido();

            }
        });

        jPanel_South.add(button_FinalizarCompra);

        JButton button_Ocupado = new JButton("Ocupado");
        button_Ocupado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Caixa Ocupado");
                jLabel_Stts.setText("OCUPADO");

            }
        });

        jPanel_South.add(button_Ocupado);

        JButton button_FecharCaixa = new JButton("Fechar caixa");
        button_FecharCaixa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Caixa Fechado");
                jLabel_Stts.setText("FECHADO");

            }
        });

        jPanel_South.add(button_FecharCaixa);

        JButton button_Aberto = new JButton("Caixa livre");
        button_Aberto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(null, "Caixa livre");
                jLabel_Stts.setText("LIVRE");

            }
        });

        jPanel_South.add(button_Aberto);

        JButton button_AdicionarCumpom = new JButton("Adicionar Cumpom");

        button_AdicionarCumpom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                BK_TelaAdicionarCupom adicionnarCupom = new BK_TelaAdicionarCupom();
                adicionnarCupom.BK_TelaAdicionarCupom();

            }
        });

        jPanel_South.add(button_AdicionarCumpom);

        JButton button_NovoProduto = new JButton("Novo Produto");
        button_NovoProduto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                BK_TelaProdutos bK_Produtos = new BK_TelaProdutos();
                bK_Produtos.BK_TelaProdutos();

            }
        });
        jPanel_South.add(button_NovoProduto);

    }

    public static void main(String[] args) {

        BK_TelaInicial tela1 = new BK_TelaInicial();
        tela1.BK_TelaInicial();

    }

}
