
package GUI;
import Logic.SavedGame;
import Logic.SavedScore;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import static javax.sound.sampled.Clip.LOOP_CONTINUOUSLY;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Menu extends javax.swing.JFrame {
    public SavedGame save = new SavedGame();
    private SavedScore saveScore = new SavedScore();
    private UserPrompt userPrompt = new UserPrompt(save);
    private LoadPrompt loadPrompt = new LoadPrompt(save);
    private ScoreBoard scoreBoard = new ScoreBoard();

    public Menu() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        initComponents();
        this.setLocationRelativeTo(null);
        playMusic();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_NewGame = new javax.swing.JButton();
        jButton_LoadGame = new javax.swing.JButton();
        jButton_ScoreBoard = new javax.swing.JButton();
        jLabel_Logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(177, 156, 217));

        jButton_NewGame.setBackground(new java.awt.Color(156, 196, 217));
        jButton_NewGame.setFont(new java.awt.Font("Arcade Normal", 1, 12)); // NOI18N
        jButton_NewGame.setText("NEW GAME");
        jButton_NewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NewGameActionPerformed(evt);
            }
        });

        jButton_LoadGame.setBackground(new java.awt.Color(156, 196, 217));
        jButton_LoadGame.setFont(new java.awt.Font("Arcade Normal", 1, 12)); // NOI18N
        jButton_LoadGame.setText("LOAD GAME");
        jButton_LoadGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoadGameActionPerformed(evt);
            }
        });

        jButton_ScoreBoard.setBackground(new java.awt.Color(156, 196, 217));
        jButton_ScoreBoard.setFont(new java.awt.Font("Arcade Normal", 1, 12)); // NOI18N
        jButton_ScoreBoard.setText("SCORE BAORD");
        jButton_ScoreBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ScoreBoardActionPerformed(evt);
            }
        });

        jLabel_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(jLabel_Logo)
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_LoadGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_NewGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_ScoreBoard))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel_Logo)
                .addGap(18, 18, 18)
                .addComponent(jButton_NewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_LoadGame, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_ScoreBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_NewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NewGameActionPerformed
        userPrompt.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton_NewGameActionPerformed

    private void jButton_LoadGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoadGameActionPerformed
        loadPrompt.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton_LoadGameActionPerformed

    private void jButton_ScoreBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ScoreBoardActionPerformed
        saveScore.Upload();
        Object[] row = new Object[2];
        for (int i = 0; i < saveScore.scores.size(); i++){
            row[0] = saveScore.scores.get(i).getUser();
            row[1] = saveScore.scores.get(i).getPoints();
            scoreBoard.model.addRow(row);
        }
        scoreBoard.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton_ScoreBoardActionPerformed

    public static void playMusic() throws IOException, LineUnavailableException, UnsupportedAudioFileException{
        String filePath = "Audio/Blue.wav";
        File f = new File(filePath);
        AudioInputStream audioIn = null;
        try{
            audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());
        }
        catch (MalformedURLException e){
            System.out.println("Error while playing music");
        }
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        volume.setValue(-25f);
        clip.loop(LOOP_CONTINUOUSLY);
        clip.start();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_LoadGame;
    private javax.swing.JButton jButton_NewGame;
    private javax.swing.JButton jButton_ScoreBoard;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

