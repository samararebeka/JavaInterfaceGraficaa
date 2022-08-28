


package Apresentação;

import Negocio.Compositores;
import Negocio.Gravadora;
import Negocio.Interprete;
import Negocio.Lancamento;
import Negocio.Musica;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import persistencia.ControlaMusica;


public class Principal extends javax.swing.JFrame {
    ControlaMusica cm = new ControlaMusica();
    ArrayList<Musica> info = cm.retornaTodos();
    private boolean controle;

    //metodo principal, está
    public Principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        TanoGrav1 = new javax.swing.JTextField();
        btnINTERPRETE = new javax.swing.JButton();
        btnGravadora = new javax.swing.JButton();
        JNOMEinterprete = new javax.swing.JLabel();
        JGRAVADORA = new javax.swing.JLabel();
        jPAISSinterprete = new javax.swing.JLabel();
        jpaisGrav = new javax.swing.JLabel();
        TnomeInterprete = new javax.swing.JTextField();
        TnomeGrav = new javax.swing.JTextField();
        jANOinterprete = new javax.swing.JLabel();
        jAnoGav = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Tnome = new javax.swing.JTextField();
        TpaisGrav = new javax.swing.JTextField();
        TtipoLancamento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Testilo = new javax.swing.JTextField();
        TanoGrav = new javax.swing.JTextField();
        btnCompositor = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        JnomeComp = new javax.swing.JLabel();
        btnTodos = new javax.swing.JButton();
        jpaisComp = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        TnomeComp = new javax.swing.JTextField();
        AnoLan = new javax.swing.JLabel();
        jAnoComp = new javax.swing.JLabel();
        TipoLan = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Jalbum = new javax.swing.JLabel();
        TpaisComp = new javax.swing.JTextField();
        jduracao = new javax.swing.JLabel();
        TanoComp = new javax.swing.JTextField();
        Talbum = new javax.swing.JTextField();
        TpaisInterprete = new javax.swing.JTextField();
        TanoLancamento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Tduracao = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(242, 242, 242));
        setMinimumSize(new java.awt.Dimension(1286, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TanoGrav1.setBackground(new java.awt.Color(0, 0, 0));
        TanoGrav1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TanoGrav1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 460, 173, -1));

        btnINTERPRETE.setBackground(new java.awt.Color(102, 102, 102));
        btnINTERPRETE.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        btnINTERPRETE.setForeground(new java.awt.Color(255, 255, 255));
        btnINTERPRETE.setText("Ver Interprete");
        btnINTERPRETE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnINTERPRETE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnINTERPRETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINTERPRETEActionPerformed(evt);
            }
        });
        getContentPane().add(btnINTERPRETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 510, 110, 30));

        btnGravadora.setBackground(new java.awt.Color(102, 102, 102));
        btnGravadora.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        btnGravadora.setForeground(new java.awt.Color(255, 255, 255));
        btnGravadora.setText("Ver Gravadora");
        btnGravadora.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGravadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGravadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravadoraActionPerformed(evt);
            }
        });
        getContentPane().add(btnGravadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, 110, 30));

        JNOMEinterprete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JNOMEinterprete.setForeground(new java.awt.Color(255, 255, 255));
        JNOMEinterprete.setText("Nome");
        getContentPane().add(JNOMEinterprete, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 400, -1, -1));

        JGRAVADORA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JGRAVADORA.setForeground(new java.awt.Color(255, 255, 255));
        JGRAVADORA.setText("Nome");
        getContentPane().add(JGRAVADORA, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, -1, -1));

        jPAISSinterprete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPAISSinterprete.setForeground(new java.awt.Color(255, 255, 255));
        jPAISSinterprete.setText("País");
        getContentPane().add(jPAISSinterprete, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 430, -1, -1));

        jpaisGrav.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jpaisGrav.setForeground(new java.awt.Color(255, 255, 255));
        jpaisGrav.setText("País");
        getContentPane().add(jpaisGrav, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, -1, -1));

        TnomeInterprete.setBackground(new java.awt.Color(0, 0, 0));
        TnomeInterprete.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TnomeInterprete, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 400, 174, -1));

        TnomeGrav.setBackground(new java.awt.Color(0, 0, 0));
        TnomeGrav.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TnomeGrav, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 190, -1));

        jANOinterprete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jANOinterprete.setForeground(new java.awt.Color(255, 255, 255));
        jANOinterprete.setText("Ano");
        getContentPane().add(jANOinterprete, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 460, -1, -1));

        jAnoGav.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jAnoGav.setForeground(new java.awt.Color(255, 255, 255));
        jAnoGav.setText("Ano");
        getContentPane().add(jAnoGav, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DADOS DE INTERPRETE");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DADOS DAS MÚSICAS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DADOS DA GRAVADORA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 180, -1));

        Tnome.setBackground(new java.awt.Color(0, 0, 0));
        Tnome.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Tnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 210, -1));

        TpaisGrav.setBackground(new java.awt.Color(0, 0, 0));
        TpaisGrav.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TpaisGrav, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, 190, -1));

        TtipoLancamento.setBackground(new java.awt.Color(0, 0, 0));
        TtipoLancamento.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TtipoLancamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 210, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Estilo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        Testilo.setBackground(new java.awt.Color(0, 0, 0));
        Testilo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Testilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 210, -1));

        TanoGrav.setBackground(new java.awt.Color(0, 0, 0));
        TanoGrav.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TanoGrav, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, 190, -1));

        btnCompositor.setBackground(new java.awt.Color(102, 102, 102));
        btnCompositor.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        btnCompositor.setForeground(new java.awt.Color(255, 255, 255));
        btnCompositor.setText("Ver Compositores");
        btnCompositor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCompositor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompositor.setMinimumSize(new java.awt.Dimension(115, 345));
        btnCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompositorActionPerformed(evt);
            }
        });
        getContentPane().add(btnCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, -1, 30));

        btnSalvar.setBackground(new java.awt.Color(0, 0, 0));
        btnSalvar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar ");
        btnSalvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 620, 142, 35));

        JnomeComp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JnomeComp.setForeground(new java.awt.Color(255, 255, 255));
        JnomeComp.setText("Nome");
        getContentPane().add(JnomeComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, -1));

        btnTodos.setBackground(new java.awt.Color(102, 102, 102));
        btnTodos.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        btnTodos.setForeground(new java.awt.Color(255, 255, 255));
        btnTodos.setText("Ver Musicas");
        btnTodos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });
        getContentPane().add(btnTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 600, 120, 30));

        jpaisComp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jpaisComp.setForeground(new java.awt.Color(255, 255, 255));
        jpaisComp.setText("País");
        getContentPane().add(jpaisComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, -1, -1));

        btnSair.setBackground(new java.awt.Color(0, 0, 0));
        btnSair.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 620, 142, 35));

        TnomeComp.setBackground(new java.awt.Color(0, 0, 0));
        TnomeComp.setForeground(new java.awt.Color(255, 255, 255));
        TnomeComp.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TnomeComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TnomeCompActionPerformed(evt);
            }
        });
        getContentPane().add(TnomeComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 202, -1));

        AnoLan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AnoLan.setForeground(new java.awt.Color(255, 255, 255));
        AnoLan.setText("Ano Lancamento");
        getContentPane().add(AnoLan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jAnoComp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jAnoComp.setForeground(new java.awt.Color(255, 255, 255));
        jAnoComp.setText("Ano");
        getContentPane().add(jAnoComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, -1, -1));

        TipoLan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TipoLan.setForeground(new java.awt.Color(255, 255, 255));
        TipoLan.setText("Tipo Lancamento");
        getContentPane().add(TipoLan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DADOS DOS COMPOSITORES");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 220, -1));

        Jalbum.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Jalbum.setForeground(new java.awt.Color(255, 255, 255));
        Jalbum.setText("Album");
        getContentPane().add(Jalbum, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        TpaisComp.setBackground(new java.awt.Color(0, 0, 0));
        TpaisComp.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TpaisComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 202, -1));

        jduracao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jduracao.setForeground(new java.awt.Color(255, 255, 255));
        jduracao.setText("Duração");
        getContentPane().add(jduracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        TanoComp.setBackground(new java.awt.Color(0, 0, 0));
        TanoComp.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TanoComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 200, -1));

        Talbum.setBackground(new java.awt.Color(0, 0, 0));
        Talbum.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Talbum, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 210, -1));

        TpaisInterprete.setBackground(new java.awt.Color(0, 0, 0));
        TpaisInterprete.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TpaisInterprete, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 430, 174, -1));

        TanoLancamento.setBackground(new java.awt.Color(0, 0, 0));
        TanoLancamento.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(TanoLancamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 210, -1));

        jLabel3.setBackground(new java.awt.Color(102, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CADASTRO DE MÚSICAS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apresentação/logo2.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 633, 140, 60));

        Tduracao.setBackground(new java.awt.Color(0, 0, 0));
        Tduracao.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Tduracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, 210, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buraco negro.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 0, 1460, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //botao ver grvadora
    
    private void btnGravadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravadoraActionPerformed
        DlgGravadora  Gravadoraa = new DlgGravadora ( null, true, cm);
        Gravadoraa.setVisible(true);
    }//GEN-LAST:event_btnGravadoraActionPerformed

    //botao ver interprete
    
    private void btnINTERPRETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINTERPRETEActionPerformed
        DlgINTERPRETEE interpretee = new DlgINTERPRETEE  (null, true, cm);
        interpretee.setVisible(true);
    }//GEN-LAST:event_btnINTERPRETEActionPerformed

    //botao sair
    
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    //botao ver todos de musica

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        DlgMostraMusica dlg = new DlgMostraMusica( null, true, cm);
        dlg.setVisible(true);
    }//GEN-LAST:event_btnTodosActionPerformed

    
    
 
    //botao salvar todos
    
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Interprete interprete = new Interprete("Trfsd","Tesegrg","Ttsgtre");  
        Gravadora gravadora = new Gravadora("Trfsd","Tesegrg","Ttsgtre");
        Compositores comp = new Compositores("Trfsd","Tesegrg","Ttsgtre");
        Lancamento lancamento= new Lancamento("Tnome","Testilo","Tnome","Testilo","Testilo", gravadora, interprete);
        Musica musica = new Musica("Tnome", lancamento, comp);
        
        //INFORMAÇÕES DA CLASSE MUSICA
        
        musica.setNome(Tnome.getText());
        do{
            if(musica.getNome()!=null){
                musica.getLancamento().setEstilomus(Testilo.getText());
                controle = true;            
            }else{
                JOptionPane.showMessageDialog(null, "Primeiro preencha o campo anterior. ");
            }
        }while(controle!=true);
        
        if(musica.getLancamento().getEstilomus()!=null){
            musica.getLancamento().setTipolancamento(TtipoLancamento.getText());
        }
        if(musica.getLancamento().getTipolancamento()!=null){
            musica.getLancamento().setAnolancamento(TanoLancamento.getText());
        }
        if(musica.getLancamento().getAnolancamento()!=null){
            musica.getLancamento().setAlbum(Talbum.getText());
        }
        if(musica.getLancamento().getAlbum()!=null){
            musica.getLancamento().setDuração(Tduracao.getText());
        }
        

        //INFORMAÇÕES DA GRAVADORA
        if(musica.getNome()!=null){
            musica.getLancamento().getGravadora().setNome(TnomeGrav.getText());
        }
        if(musica.getLancamento().getGravadora().getNome()!=null){
            musica.getLancamento().getGravadora().setPais(TpaisGrav.getText());
        }
        if(musica.getLancamento().getGravadora().getPais()!=null){
            musica.getLancamento().getGravadora().setAno(TanoGrav.getText());
        }

        //INFORMAÇÕES DOS  COMPOSITORES
        if(musica.getNome()!=null){
            musica.getCompositor().setNome(TnomeComp.getText());
        }
        if(musica.getNome()!=null){
            musica.getCompositor().setPais(TpaisComp.getText());
        }
        if(musica.getNome()!=null){
            musica.getCompositor().setAno(TanoComp.getText());
        }

        //INFORMAÇÕES DE INTERPRETE
        if(musica.getNome()!=null){
            musica.getLancamento().getInterprete().setNome(TnomeInterprete.getText());
        }
        if(musica.getLancamento().getInterprete().getNome()!=null){
            musica.getLancamento().getInterprete().setPais(TpaisInterprete.getText());
        }
        if(musica.getLancamento().getInterprete().getAno()!=null){
            musica.getLancamento().getInterprete().setAno(TanoGrav1.getText());
        }

        
        
        //tentar salvar tudo

        if(cm.salvar(musica)){
            try{
            JOptionPane.showMessageDialog(null, "Musica cadastrada com sucesso. ");

            //INFORMAÇÕES DA CLASSE MUSICA
            Tnome.setText(null);
            Testilo.setText(null);
            TtipoLancamento.setText(null);
            TanoLancamento.setText(null);
            Talbum.setText(null);
            Tduracao.setText(null);

            //INFORMAÇÕES DA GRAVADORA
            TnomeGrav.setText(null);
            TpaisGrav.setText(null);
            TanoGrav.setText(null);

            //INFORMAÇÕES DOS  COMPOSITORES
            TnomeComp.setText(null);
            TpaisComp.setText(null);
            TanoComp.setText(null);

            //INFORMAÇÕES DE INTERPRETE
            TnomeInterprete.setText(null);
            TpaisInterprete.setText(null);
            TanoGrav1.setText(null);

            }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrada a musica. " + e.getMessage());
            }
    }//GEN-LAST:event_btnSalvarActionPerformed
    }
    
    //botao ver compositores
    
    private void btnCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompositorActionPerformed
        DlgCompositores dlg = new DlgCompositores( null, true, cm);
        dlg.setVisible(true);
    }//GEN-LAST:event_btnCompositorActionPerformed

    private void TnomeCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TnomeCompActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TnomeCompActionPerformed

   
   
    
    
   
    
 
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnoLan;
    private javax.swing.JLabel JGRAVADORA;
    private javax.swing.JLabel JNOMEinterprete;
    private javax.swing.JLabel Jalbum;
    private javax.swing.JLabel JnomeComp;
    private javax.swing.JTextField Talbum;
    private javax.swing.JTextField TanoComp;
    private javax.swing.JTextField TanoGrav;
    private javax.swing.JTextField TanoGrav1;
    private javax.swing.JTextField TanoLancamento;
    private javax.swing.JTextField Tduracao;
    private javax.swing.JTextField Testilo;
    private javax.swing.JLabel TipoLan;
    private javax.swing.JTextField Tnome;
    private javax.swing.JTextField TnomeComp;
    private javax.swing.JTextField TnomeGrav;
    private javax.swing.JTextField TnomeInterprete;
    private javax.swing.JTextField TpaisComp;
    private javax.swing.JTextField TpaisGrav;
    private javax.swing.JTextField TpaisInterprete;
    private javax.swing.JTextField TtipoLancamento;
    private javax.swing.JButton btnCompositor;
    private javax.swing.JButton btnGravadora;
    private javax.swing.JButton btnINTERPRETE;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnTodos;
    private javax.swing.JLabel jANOinterprete;
    private javax.swing.JLabel jAnoComp;
    private javax.swing.JLabel jAnoGav;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jPAISSinterprete;
    private javax.swing.JLabel jduracao;
    private javax.swing.JLabel jpaisComp;
    private javax.swing.JLabel jpaisGrav;
    // End of variables declaration//GEN-END:variables

    public static void main(String args[]) {
        
        
      //  Tratamento de exceção para aparência dos jframes. O método mostra o jframe na aparência do Nimbus. 
        //Abaixo está o código, quando executado o arquivo ele configura a aparência do Nimbus. 
        /*
        Ou seja, código de configuração de aparência e comportamento (opcional) " Se o Nimbus (introduzido no Java) não estiver disponível, 
        fique com a aparência padrão.
        */
        
        
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        
        /* Criar e exibir os dados do método de principal*/
            
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }
}