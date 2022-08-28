
package Apresentação;

import Negocio.Compositores;
import Negocio.Gravadora;
import Negocio.Interprete;
import Negocio.Lancamento;
import Negocio.Musica;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import persistencia.ControlaMusica;

        

 
public class DlgMostraMusica extends javax.swing.JDialog{

    ControlaMusica cm = new ControlaMusica();
    

    
    
    public DlgMostraMusica(java.awt.Frame parent, boolean modal, ControlaMusica cm) {
        super(parent, modal);
        this.cm = cm;
        initComponents();
        exibeInformacoes();

    }
      
    private void exibeInformacoes() {
          ArrayList<Musica> musica = cm.retornaTodos();

          for(int i=0; i<100; i++){
                      
          }
             for(int i=0; i < musica.size() && musica.get(i).getLancamento() != null; i++){
              TBLmusica.setValueAt(null, i, 0); 
              TBLmusica.setValueAt(null, i, 1);
              TBLmusica.setValueAt(null, i, 2);
              TBLmusica.setValueAt(null, i, 3);
              TBLmusica.setValueAt(null, i, 4);
              TBLmusica.setValueAt(null, i, 5); 
              
              TBLmusica.setValueAt(musica.get(i).getNome(), i, 0); 
              TBLmusica.setValueAt(musica.get(i).getLancamento().getEstilomus(), i, 1); 
              TBLmusica.setValueAt(musica.get(i).getLancamento().getAnolancamento(), i, 2);
              TBLmusica.setValueAt(musica.get(i).getLancamento().getTipolancamento(), i, 3);
              TBLmusica.setValueAt(musica.get(i).getLancamento().getAlbum(), i, 4);
              TBLmusica.setValueAt(musica.get(i).getLancamento().getDuração(), i, 5);   

             }
        }
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLmusica = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButtonVerSingle = new javax.swing.JButton();
        BotaoExtends = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BotaoLong1 = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        BotaoAtualizar = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTextField1.setText("jTextField1");

        setMinimumSize(new java.awt.Dimension(900, 500));
        setUndecorated(true);

        btnSair.setText("Sair");
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        TBLmusica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Estilo", "Tipo Lancamento", "Ano Lancamento", "Album", "Duração"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TBLmusica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(TBLmusica);

        jLabel2.setText("Veja sua PlayList Single");

        jButtonVerSingle.setText("Ver PlayList");
        jButtonVerSingle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVerSingle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerSingleActionPerformed(evt);
            }
        });

        BotaoExtends.setText("Ver PlayList");
        BotaoExtends.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoExtends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExtendsActionPerformed(evt);
            }
        });

        jLabel1.setText("Veja sua PlayList Extends");

        jLabel3.setText("Veja sua PlayList Long");

        BotaoLong1.setText("Ver Playlist");
        BotaoLong1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoLong1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLong1ActionPerformed(evt);
            }
        });

        botaoRemover.setText("Remover");
        botaoRemover.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoRemoverMouseClicked(evt);
            }
        });
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        BotaoAtualizar.setText("Atualizar");
        BotaoAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotaoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotaoExtends, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(botaoRemover)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BotaoAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonVerSingle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(BotaoLong1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(btnSair)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoExtends)
                    .addComponent(BotaoLong1)
                    .addComponent(jButtonVerSingle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoAtualizar)
                    .addComponent(botaoRemover)
                    .addComponent(btnSair))
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
           this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    
    private void jButtonVerSingleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerSingleActionPerformed
        DLGPlaySingle single = new DLGPlaySingle(null, true, cm); 
         single.setVisible(true);
         
    }//GEN-LAST:event_jButtonVerSingleActionPerformed

    
    private void BotaoExtendsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExtendsActionPerformed
         DLGPlayExtends estende = new DLGPlayExtends (null, true, cm); 
          estende.setVisible(true);
    }//GEN-LAST:event_BotaoExtendsActionPerformed

    
    private void BotaoLong1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLong1ActionPerformed
        DLGPlayLong longa = new DLGPlayLong (null, true, cm); 
          longa.setVisible(true);
    }//GEN-LAST:event_BotaoLong1ActionPerformed
 Interprete interprete = new Interprete(null, null, null);  
 Gravadora gravadora = new Gravadora(null, null, null);
 Compositores comp = new Compositores(null, null, null);
 Lancamento lancamento= new Lancamento(null, null, null, null, null, gravadora, interprete);
    
    private void BotaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAtualizarActionPerformed
       ArrayList<Musica> musica = cm.retornaTodos();
       
             for(int i=0; i<100; i++){
              TBLmusica.setValueAt(" ", i, 0); 
              TBLmusica.setValueAt(" ", i, 1);
              TBLmusica.setValueAt(" ", i, 2);
              TBLmusica.setValueAt(" ", i, 3);
              TBLmusica.setValueAt(" ", i, 4);
              TBLmusica.setValueAt(" ", i, 5);         
          }
             for(int i=0; i < musica.size() && musica.get(i).getLancamento() != null; i++){
              TBLmusica.setValueAt(musica.get(i).getNome(), i, 0); 
              TBLmusica.setValueAt(musica.get(i).getLancamento().getEstilomus(), i, 1); 
              TBLmusica.setValueAt(musica.get(i).getLancamento().getAnolancamento(), i, 2);
              TBLmusica.setValueAt(musica.get(i).getLancamento().getTipolancamento(), i, 3);
              TBLmusica.setValueAt(musica.get(i).getLancamento().getAlbum(), i, 4);
              TBLmusica.setValueAt(musica.get(i).getLancamento().getDuração(), i, 5);   

        }

    }//GEN-LAST:event_BotaoAtualizarActionPerformed

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoRemoverActionPerformed

    
    private void botaoRemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoRemoverMouseClicked

        int posicao = TBLmusica.getSelectedRow();
        cm.remove(cm.Buscar(posicao));
    }//GEN-LAST:event_botaoRemoverMouseClicked

    
    
    

 
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAtualizar;
    private javax.swing.JButton BotaoExtends;
    private javax.swing.JButton BotaoLong1;
    private javax.swing.JTable TBLmusica;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton jButtonVerSingle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

  
                               

   
}
