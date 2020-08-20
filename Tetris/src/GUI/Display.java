
package GUI;

import java.awt.Color;

public class Display extends javax.swing.JFrame {

    public Display() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_BG = new javax.swing.JPanel();
        jPanel_Board = new javax.swing.JPanel();
        jLabel_GameOver = new javax.swing.JLabel();
        jLabel_LevelMsg = new javax.swing.JLabel();
        jLabel_LevelMsg2 = new javax.swing.JLabel();
        jLabel_LevelMsg1 = new javax.swing.JLabel();
        jLabel_MSG4 = new javax.swing.JLabel();
        jLabel_Score = new javax.swing.JLabel();
        jLabel_Timer = new javax.swing.JLabel();
        jLabel_Lines = new javax.swing.JLabel();
        jLabel_Level = new javax.swing.JLabel();
        jPanel_Figures = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel_BG.setBackground(new java.awt.Color(177, 156, 217));

        jPanel_Board.setBackground(new java.awt.Color(156, 196, 217));

        jLabel_GameOver.setFont(new java.awt.Font("Arcade Normal", 1, 24)); // NOI18N
        jLabel_GameOver.setForeground(new java.awt.Color(255, 0, 0));
        jLabel_GameOver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel_BoardLayout = new javax.swing.GroupLayout(jPanel_Board);
        jPanel_Board.setLayout(jPanel_BoardLayout);
        jPanel_BoardLayout.setHorizontalGroup(
            jPanel_BoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BoardLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel_GameOver, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel_BoardLayout.setVerticalGroup(
            jPanel_BoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BoardLayout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addComponent(jLabel_GameOver, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
        );

        jLabel_LevelMsg.setFont(new java.awt.Font("Arcade Normal", 1, 18)); // NOI18N
        jLabel_LevelMsg.setText("TIME:");

        jLabel_LevelMsg2.setFont(new java.awt.Font("Arcade Normal", 1, 18)); // NOI18N
        jLabel_LevelMsg2.setText("SCORE:");

        jLabel_LevelMsg1.setFont(new java.awt.Font("Arcade Normal", 1, 18)); // NOI18N
        jLabel_LevelMsg1.setText("LINES:");

        jLabel_MSG4.setFont(new java.awt.Font("Arcade Normal", 1, 18)); // NOI18N
        jLabel_MSG4.setText("LEVEL:");

        jLabel_Score.setFont(new java.awt.Font("Arcade Normal", 1, 18)); // NOI18N

        jLabel_Timer.setFont(new java.awt.Font("Arcade Normal", 1, 18)); // NOI18N

        jLabel_Lines.setFont(new java.awt.Font("Arcade Normal", 1, 18)); // NOI18N

        jLabel_Level.setFont(new java.awt.Font("Arcade Normal", 1, 18)); // NOI18N

        jPanel_Figures.setBackground(new java.awt.Color(156, 196, 217));

        javax.swing.GroupLayout jPanel_FiguresLayout = new javax.swing.GroupLayout(jPanel_Figures);
        jPanel_Figures.setLayout(jPanel_FiguresLayout);
        jPanel_FiguresLayout.setHorizontalGroup(
            jPanel_FiguresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_FiguresLayout.setVerticalGroup(
            jPanel_FiguresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_BGLayout = new javax.swing.GroupLayout(jPanel_BG);
        jPanel_BG.setLayout(jPanel_BGLayout);
        jPanel_BGLayout.setHorizontalGroup(
            jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BGLayout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jPanel_Board, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel_BGLayout.createSequentialGroup()
                            .addGroup(jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel_LevelMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_LevelMsg2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_Score, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_Timer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_BGLayout.createSequentialGroup()
                            .addComponent(jLabel_LevelMsg1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel_Lines, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_BGLayout.createSequentialGroup()
                        .addGroup(jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel_Figures, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_MSG4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Level, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel_BGLayout.setVerticalGroup(
            jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_BGLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_BGLayout.createSequentialGroup()
                        .addGroup(jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_LevelMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Timer, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_Score, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_LevelMsg2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_LevelMsg1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Lines, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_Level, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_MSG4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(jPanel_Figures, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addComponent(jPanel_Board, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jLabel_GameOver;
    public javax.swing.JLabel jLabel_Level;
    private javax.swing.JLabel jLabel_LevelMsg;
    private javax.swing.JLabel jLabel_LevelMsg1;
    private javax.swing.JLabel jLabel_LevelMsg2;
    public javax.swing.JLabel jLabel_Lines;
    private javax.swing.JLabel jLabel_MSG4;
    public javax.swing.JLabel jLabel_Score;
    public javax.swing.JLabel jLabel_Timer;
    public javax.swing.JPanel jPanel_BG;
    public javax.swing.JPanel jPanel_Board;
    public javax.swing.JPanel jPanel_Figures;
    // End of variables declaration//GEN-END:variables
}
