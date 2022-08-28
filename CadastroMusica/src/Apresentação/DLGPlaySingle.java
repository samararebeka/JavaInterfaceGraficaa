
package Apresentação;

import Negocio.Musica;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import persistencia.ControlaMusica;

        

 
public class DLGPlaySingle extends javax.swing.JDialog{

    ControlaMusica cm;
    
    


    
    public DLGPlaySingle(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }
    public DLGPlaySingle(java.awt.Frame parent, boolean modal,  ControlaMusica cm) {
        super(parent, modal);
        this.cm = cm;
        initComponents();
        exibeInformacoes();
    }
      private void exibeInformacoes() {
          ArrayList<Musica> musica = cm.retornaTodos();

          for(int i=0; i<100; i++){
              DLGPlaySingle.setValueAt("", i, 0); 
              DLGPlaySingle.setValueAt("", i, 1);
          }
      /*   
              
          }
             double[] compare=new double[3];
        int cont, cont1=0, k=0, l=0;
        
       try{
        for(int i=0; i<musica.size(); i++){
            if(musica.get(i).getNome().equals(cm)){
            if(musica.get(i).getLancamento().getDuração()<=600.0 &&cont1<3){      
                musica.get(i).getLancamento().setTipolancamento("Single Play");  
                 
                }
            }
        }}catch(Exception e){
                JOptionPane.showMessageDialog(null, "\nMUSICA NAO ENCONTRADA!!!!\n" + e.getMessage());}
   
                
            
        for(int i=0; i < musica.size() && musica.get(i).getNome() != null ; i++){
              DLGPlaySingle.setValueAt(musica.get(i).getNome(), i, 0); 
              DLGPlaySingle.setValueAt(musica.get(i).getLancamento().getDuração(), i, 1); 
     
    }
       }catch(NullPointerException e) {
            JOptionPane.showMessageDialog(null, "\nMUSICA NAO ENCONTRADA!!!!\n" + e.getMessage());
        }
          
             */
      
      for(int i=0; i < musica.size() && musica.get(i).getNome() != null && musica.get(i).getLancamento().getDuração()!= null ; i++){
              DLGPlaySingle.setValueAt(musica.get(i).getNome(), i, 0); 
              DLGPlaySingle.setValueAt(musica.get(i).getLancamento().getDuração(), i, 1); 
     
    }


 }
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DLGPlaySingle = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

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

        btnSair.setBackground(new java.awt.Color(0, 0, 0));
        btnSair.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        DLGPlaySingle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Duração"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DLGPlaySingle);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apresentação/png-clipart-deezer-music-logo-playlist-deezer-album-text.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
           this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DLGPlaySingle;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
  
}
