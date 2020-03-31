package bk_mercantil.bk_telas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BK_TelaAdicionarCupom extends JFrame {

    JFrame BK_TelaCumpom = new JFrame();

    JLabel jLabel_CumpomCliente = new JLabel("Adicione o cumpom do cliente");
    JTextField field_CumpomCliente = new JTextField(10);

    JButton button_Adicionar = new JButton("Adicionar");
    JButton button_Voltar = new JButton("Voltar");

    JPanel jPanel_North = new JPanel();
    JPanel jPanel_South = new JPanel();

    public void BK_TelaAdicionarCupom() {

        BK_TelaCumpom.setSize(670, 125);
        BK_TelaCumpom.setLocationRelativeTo(null);
        BK_TelaCumpom.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        BK_TelaCumpom.setVisible(true);
            
        
        BK_TelaCumpom.add(BorderLayout.NORTH,jLabel_CumpomCliente);
        BK_TelaCumpom.add(BorderLayout.CENTER,jPanel_North);
        jPanel_North.add(field_CumpomCliente);
        
        BK_TelaCumpom.add(BorderLayout.SOUTH,jPanel_South);
        
        jPanel_South.setLayout(new GridLayout(1,2));
        jPanel_South.add(button_Adicionar);
        jPanel_South.add(button_Voltar);
        
        button_Adicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                JOptionPane.showMessageDialog(null, "Impossivel adicionar cupom");
            }
        });
        
        button_Voltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                BK_TelaCumpom.dispose();
            }
        });
        
        
    }

}
