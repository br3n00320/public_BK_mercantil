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

public class BK_TelaFinalizarPedido extends JFrame {

    JFrame BK_TelaFinalizar = new JFrame();

    JLabel jLabel_OK = new JLabel("Tudo certo com a compra?\n"
            + " Se sim pressione '1'\n"
            + " Se deseja remover algo pressione '2'\n");
    JTextField field_Teste = new JTextField(2);
    JButton button_Sim = new JButton("Sim");
    JButton button_Voltar = new JButton("Voltar");

    JPanel jPanel_North = new JPanel();
    JPanel jPanel_South = new JPanel();

    public void BK_TelaFinalizarPedido() {

        BK_TelaFinalizar.setSize(670, 125);
        BK_TelaFinalizar.setLocationRelativeTo(null);
        BK_TelaFinalizar.setDefaultCloseOperation(JFrame.DEFAULT_CURSOR);
        BK_TelaFinalizar.setVisible(true);

        BK_TelaFinalizar.add(BorderLayout.CENTER, jPanel_North);

        //jPanel_North.setLayout(new GridLayout(1,1));
        BK_TelaFinalizar.add(BorderLayout.NORTH, jLabel_OK);
        jPanel_North.add(field_Teste);

        BK_TelaFinalizar.add(BorderLayout.SOUTH, jPanel_South);
        jPanel_South.setLayout(new GridLayout(1, 2));
        jPanel_South.add(button_Sim);
        jPanel_South.add(button_Voltar);

        button_Voltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                BK_TelaFinalizar.dispose();
            }
        });

        button_Sim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                    
                String teste = field_Teste.getText();

                switch (teste) {
                    case "1":
                        JOptionPane.showMessageDialog(null, "Compra finalizada");
                        
                    BK_TelaFinalizar.dispose();
                        
                        break;
                    case "2":
                    
                        JOptionPane.showMessageDialog(null, "Impossivel remover itens");
                        
                        break;
                    default:
                        break;
                }
                
                }
            }
        );

    }

   
}
