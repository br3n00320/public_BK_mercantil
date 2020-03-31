package bk_mercantil.bk_telas;

import bk_mercantil.BK_produtos;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class BK_TelaProdutos extends JFrame {

    //instanciando alumas classes
    BK_produtos p1 = new BK_produtos();
    //telaPrincipal    
    JFrame frame_Produtos = new JFrame();
    //Paineis
    JPanel jPanel_North = new JPanel();
    JPanel jPanel_Center = new JPanel();
    JPanel jPanel_West = new JPanel();
    JPanel jPanel_South = new JPanel();
    //Labels
    JLabel jLabel_Estoque = new JLabel("Estoque");

    JLabel jLabel_Mercadoria = new JLabel("Mercadoria");
    JLabel jLabel_Validade = new JLabel("Validade");
    JLabel jLabel_Preco = new JLabel("Preco");
    JLabel jLabel_Kg = new JLabel("Kg");
    JLabel jLabel_Fardo = new JLabel("Fardo");
    //Campos textos
    JTextField field_Mercadoria = new JTextField(15);
    JTextField field_Validade = new JTextField(8);
    JTextField field_Preco = new JTextField(10);
    JTextField field_Kg = new JTextField(10);
    JTextField field_Fardo = new JTextField(15);
    //botoes
    JButton button_Adicionar = new JButton("Adicionar");
    JButton button_Salvar = new JButton("Salvar");
    JButton button_Cancelar = new JButton("Cancelar");
    JButton button_Voltar = new JButton("Voltar");
    //tabela
    JTable jTable_Produtos = new JTable();

    public void BK_TelaProdutos() {

        frame_Produtos.setSize(700, 300);
        frame_Produtos.setLocationRelativeTo(null);
        frame_Produtos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame_Produtos.setVisible(true);

        //adicionando os frames
        frame_Produtos.add(BorderLayout.NORTH, jPanel_North);
        frame_Produtos.add(BorderLayout.WEST, jPanel_West);
        frame_Produtos.add(BorderLayout.CENTER, jPanel_Center);
        frame_Produtos.add(BorderLayout.SOUTH, jPanel_South);

        Font f = new Font("Bookman Old Style", Font.BOLD, 25);//formatei minha label
        jLabel_Estoque.setFont(f);
        jPanel_North.add(jLabel_Estoque);

        //setando laytout do painel
        jPanel_West.setLayout(new GridLayout(10, 1));
        //adicionando labels e campos de texto
        jPanel_West.add(jLabel_Mercadoria);
        jPanel_West.add(field_Mercadoria);
        jPanel_West.add(jLabel_Validade);
        jPanel_West.add(field_Validade);
        jPanel_West.add(jLabel_Preco);
        jPanel_West.add(field_Preco);
        jPanel_West.add(jLabel_Kg);
        jPanel_West.add(field_Kg);
        jPanel_West.add(jLabel_Fardo);
        jPanel_West.add(field_Fardo);

        //deixando os textfilds nao editaves
        field_Mercadoria.setEnabled(false);
        field_Validade.setEnabled(false);
        field_Preco.setEnabled(false);
        field_Kg.setEnabled(false);
        field_Fardo.setEnabled(false);
        //setando layout do painel sul
        jPanel_South.setLayout(new GridLayout(1, 4));
        //adicionando os botoes
        jPanel_South.add(button_Adicionar);
        jPanel_South.add(button_Salvar);
        jPanel_South.add(button_Cancelar);
        jPanel_South.add(button_Voltar);

        //adicionando a tabela
        jTable_Produtos.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {"Mercadoria", "Validade", "Preco", "Kg", "Fardo"},},
                new String[]{
                    "Mercadoria", "Validade", "Preco", "Kg", "Fardo"

                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }

        });
        jPanel_Center.add(jTable_Produtos);

        //adicionando acoes aos botoes
        button_Adicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                button_Adicionar.setEnabled(false);
                button_Salvar.setEnabled(true);
                button_Cancelar.setEnabled(true);

                field_Mercadoria.setEnabled(true);
                field_Validade.setEnabled(true);
                field_Preco.setEnabled(true);
                field_Kg.setEnabled(true);
                field_Fardo.setEnabled(true);

            }
        });
        button_Salvar.setEnabled(false);
        button_Salvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                p1.setBK_merdadoria(field_Mercadoria.getText());
                p1.setBK_validade(field_Validade.getText());
                p1.setBK_preco(Integer.parseInt(field_Preco.getText()));
                p1.setBK_kg(Integer.parseInt(field_Kg.getText()));
                p1.setBK_fardo(field_Fardo.getText());

                DefaultTableModel dtmProdutos = (DefaultTableModel) jTable_Produtos.getModel();
                Object[] dados = {p1.getBK_merdadoria(), p1.getBK_validade(), p1.getBK_preco(), p1.getBK_kg(), p1.getBK_fardo()};
                dtmProdutos.addRow(dados);

                button_Adicionar.setEnabled(true);
                button_Salvar.setEnabled(false);
                button_Cancelar.setEnabled(false);

                field_Mercadoria.setEnabled(false);
                field_Validade.setEnabled(false);
                field_Preco.setEnabled(false);
                field_Kg.setEnabled(false);
                field_Fardo.setEnabled(false);

                field_Mercadoria.setText("");
                field_Validade.setText("");
                field_Preco.setText("");
                field_Kg.setText("");
                field_Fardo.setText("");

            }
        });
        button_Cancelar.setEnabled(false);
        button_Cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                button_Adicionar.setEnabled(true);
                button_Salvar.setEnabled(false);
                button_Cancelar.setEnabled(false);

                field_Mercadoria.setEnabled(false);
                field_Validade.setEnabled(false);
                field_Preco.setEnabled(false);
                field_Kg.setEnabled(false);
                field_Fardo.setEnabled(false);

                field_Mercadoria.setText("");
                field_Validade.setText("");
                field_Preco.setText("");
                field_Kg.setText("");
                field_Fardo.setText("");

            }
        });
        button_Voltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                frame_Produtos.dispose();

            }
        });

    }

}
