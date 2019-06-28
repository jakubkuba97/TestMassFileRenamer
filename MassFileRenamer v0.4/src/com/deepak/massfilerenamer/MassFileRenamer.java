/*
 MassFileRenamer v0.4
 -------------------------------------
 a batch renaming software in java
 -------------------------------------
 Developed By : deepak pk
 Email : deepakpk009@yahoo.in
 -------------------------------------
 This Project is Licensed under LGPL
 -------------------------------------
 
 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU Lesser General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU Lesser General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.deepak.massfilerenamer;

import com.deepak.massfilerenamer.utils.DisabledGlassPane;
import com.deepak.massfilerenamer.utils.FileTypes;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * this class is the main class for the project
 *
 * @author deepak
 */
public class MassFileRenamer extends javax.swing.JFrame {

    // file object to store the files folder
    private File folder = null;
    // file object to store all files within the files folder
    private File files[] = null;
    // variable to store the total no of files renamed count
    private int noOfFilesRenamed = 0;
    // variable to store renamining status
    private boolean renameSuccess = false;
    // string storing current original file name
    private String currentFileName = null;
    // string storing current original extension
    private String currentExtension = null;
    // variable storing the name staring index
    private int startingIndex = 0;
    private DisabledGlassPane disabledGlassPane = null;

    /**
     * Creates new form MassFileRenamer
     */
    public MassFileRenamer() {
        initComponents();

        // initilize the disabled glass pane
        disabledGlassPane = new DisabledGlassPane();
        // set it as the root pane
        this.getRootPane().setGlassPane(disabledGlassPane);
        // setting the main window title bar icon
        try {
            this.setIconImage(ImageIO.read(getClass().getResource("/com/deepak/massfilerenamer/resources/icon.png")));
        } catch (IOException ex) {
            Logger.getLogger(MassFileRenamer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        optionButtonGroup = new javax.swing.ButtonGroup();
        folderLabel = new javax.swing.JLabel();
        folderTextField = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();
        renameLabel = new javax.swing.JLabel();
        fileNameAndExtensionRadioButton = new javax.swing.JRadioButton();
        fileNameOnlyRadioButton = new javax.swing.JRadioButton();
        extensionOnlyRadioButton = new javax.swing.JRadioButton();
        starterWordLabel = new javax.swing.JLabel();
        starterWordTextField = new javax.swing.JTextField();
        startingIndexLabel = new javax.swing.JLabel();
        startingIndexTextField = new javax.swing.JTextField();
        extensionLabel = new javax.swing.JLabel();
        extensionTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoTextArea = new javax.swing.JTextArea();
        startRenamingButton = new javax.swing.JButton();
        fileFilterLabel = new javax.swing.JLabel();
        fileFilterComboBox = new javax.swing.JComboBox();
        replaceInFileNameRadioButton = new javax.swing.JRadioButton();
        replaceThisTextField = new javax.swing.JTextField();
        replacWithTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mass File Renamer v0.4");

        folderLabel.setText("Folder");

        browseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/deepak/massfilerenamer/resources/browse.png"))); // NOI18N
        browseButton.setText("Browse");
        browseButton.setToolTipText("select the files folder");
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        renameLabel.setText("Rename");

        optionButtonGroup.add(fileNameAndExtensionRadioButton);
        fileNameAndExtensionRadioButton.setSelected(true);
        fileNameAndExtensionRadioButton.setText("File name & Extension");
        fileNameAndExtensionRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileNameAndExtensionRadioButtonActionPerformed(evt);
            }
        });

        optionButtonGroup.add(fileNameOnlyRadioButton);
        fileNameOnlyRadioButton.setText("File name Only");
        fileNameOnlyRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileNameOnlyRadioButtonActionPerformed(evt);
            }
        });

        optionButtonGroup.add(extensionOnlyRadioButton);
        extensionOnlyRadioButton.setText("Extension Only");
        extensionOnlyRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extensionOnlyRadioButtonActionPerformed(evt);
            }
        });

        starterWordLabel.setText("Starter Word");

        starterWordTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        startingIndexLabel.setText("Starting Index");

        startingIndexTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        startingIndexTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                startingIndexTextFieldKeyTyped(evt);
            }
        });

        extensionLabel.setText("Extension");

        extensionTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        extensionTextField.setToolTipText("eg '.png'");

        infoTextArea.setEditable(false);
        infoTextArea.setColumns(20);
        infoTextArea.setRows(5);
        infoTextArea.setText("Mass File Renamer v0.4\n\na batch renaming software in java\n\nDeveloped By: deepak\nEmail: deepakpk009@yahoo.in\n--------------------------------------------------------------");
        infoTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Info"));
        jScrollPane1.setViewportView(infoTextArea);

        startRenamingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/deepak/massfilerenamer/resources/rename.png"))); // NOI18N
        startRenamingButton.setText("Start Renaming");
        startRenamingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startRenamingButtonActionPerformed(evt);
            }
        });

        fileFilterLabel.setText("File Filter");

        fileFilterComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Filter" }));

        optionButtonGroup.add(replaceInFileNameRadioButton);
        replaceInFileNameRadioButton.setText("Replace in File name");

        replaceThisTextField.setToolTipText("string to replace");

        replacWithTextField.setText(" ");
        replacWithTextField.setToolTipText("replace with");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(folderLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(renameLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(starterWordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(starterWordLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(startRenamingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(startingIndexLabel)
                                    .addComponent(startingIndexTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(extensionLabel, javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(extensionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fileNameOnlyRadioButton, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(extensionOnlyRadioButton, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(replaceInFileNameRadioButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(replaceThisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(replacWithTextField))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(fileNameAndExtensionRadioButton)
                                    .addGap(44, 44, 44)
                                    .addComponent(fileFilterLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fileFilterComboBox, 0, 207, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(folderTextField)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(browseButton)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {extensionOnlyRadioButton, fileNameAndExtensionRadioButton, fileNameOnlyRadioButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(folderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(folderLabel)
                    .addComponent(browseButton))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(renameLabel)
                    .addComponent(fileNameAndExtensionRadioButton)
                    .addComponent(fileFilterLabel)
                    .addComponent(fileFilterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fileNameOnlyRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(extensionOnlyRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(replaceInFileNameRadioButton)
                    .addComponent(replaceThisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(replacWithTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(starterWordLabel)
                    .addComponent(startingIndexLabel)
                    .addComponent(extensionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(starterWordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startingIndexTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(extensionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(startRenamingButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Mass File Renamer v0.4");

        setSize(new java.awt.Dimension(605, 601));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed

        // create a file chooser
        JFileChooser jfc = new JFileChooser();

        // set selection for folder only
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        // if the user has already browsed once then open the last 
        // opened directory's parent
        if (folder != null) {
            jfc.setCurrentDirectory(folder.getParentFile());
        }

        // show the dialog
        int r = jfc.showOpenDialog(this);

        // on approval
        if (r == JFileChooser.APPROVE_OPTION) {
            // display the file path in the folder text field
            folderTextField.setText(jfc.getSelectedFile().getAbsolutePath());
            // load the file filter combo box
            loadFileFilterComboBox();
        }
    }//GEN-LAST:event_browseButtonActionPerformed

    private void fileNameAndExtensionRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileNameAndExtensionRadioButtonActionPerformed

        // if user select rename file name and extension
        // enable all fields

        starterWordLabel.setEnabled(true);
        starterWordTextField.setEnabled(true);

        startingIndexLabel.setEnabled(true);
        startingIndexTextField.setEnabled(true);

        extensionLabel.setEnabled(true);
        extensionTextField.setEnabled(true);
    }//GEN-LAST:event_fileNameAndExtensionRadioButtonActionPerformed

    private void fileNameOnlyRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileNameOnlyRadioButtonActionPerformed

        // if user selects rename file name only
        // enable all but extension field

        starterWordLabel.setEnabled(true);
        starterWordTextField.setEnabled(true);

        startingIndexLabel.setEnabled(true);
        startingIndexTextField.setEnabled(true);

        extensionLabel.setEnabled(false);
        extensionTextField.setEnabled(false);
    }//GEN-LAST:event_fileNameOnlyRadioButtonActionPerformed

    private void extensionOnlyRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extensionOnlyRadioButtonActionPerformed

        // if user selects rename extension only
        // dissable all but extension field

        starterWordLabel.setEnabled(false);
        starterWordTextField.setEnabled(false);

        startingIndexLabel.setEnabled(false);
        startingIndexTextField.setEnabled(false);

        extensionLabel.setEnabled(true);
        extensionTextField.setEnabled(true);
    }//GEN-LAST:event_extensionOnlyRadioButtonActionPerformed

    private void startRenamingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startRenamingButtonActionPerformed

        // get the folder
        folder = new File(folderTextField.getText());

        // check if ready to reanme 
        if (!readyToRename()) {
            // if no then return
            return;
        }

        // reinitialilsing variables
        noOfFilesRenamed = 0;

        // disabling all components to prevent futher manipulation durying renaming
        disabledGlassPane.activate("Please Wait. Renaming...");

        // create a file filter for the extension type
        FileFilter fileFilter = new FileFilter() {
            public boolean accept(File pathname) {
                // if the user has selected 'no filter'
                if (fileFilterComboBox.getSelectedIndex() == 0) {
                    // just check whether it is a file or not
                    return pathname.isFile();
                } else {
                    // check whether it is a file or not and the extension matches the filter type
                    return pathname.isFile()
                            && pathname.getName().endsWith(fileFilterComboBox.getSelectedItem().toString());
                }

            }
        };

        // get all files and load it to the files array with the file filter
        files = folder.listFiles(fileFilter);

        // print information
        infoTextArea.append("\n Total No. Of Files Present: " + files.length);

        // renamining both file name and extension
        if (fileNameAndExtensionRadioButton.isSelected()) {
            // get the starting index
            startingIndex = Integer.parseInt(startingIndexTextField.getText());
            // renaming each files with new name + index . extension
            for (int i = 0; i < files.length; i++) {

                currentFileName = files[i].getName();

                if (new File(folder.getAbsolutePath()
                        + File.separator
                        + starterWordTextField.getText()
                        + (startingIndex + i)
                        + extensionTextField.getText()).exists()) {
                    renameSuccess = false;
                } else {
                    renameSuccess = files[i].renameTo(
                            new File(folder.getAbsolutePath()
                            + File.separator
                            + starterWordTextField.getText()
                            + (startingIndex + i)
                            + extensionTextField.getText()));
                }
                infoTextArea.append("\nrenaming file <"
                        + currentFileName
                        + "> to <"
                        + starterWordTextField.getText()
                        + (startingIndex + i)
                        + extensionTextField.getText()
                        + (renameSuccess ? "> Successful " : "> Failed!"));

                if (renameSuccess) {
                    noOfFilesRenamed++;
                }
            }
        } // renamining file name only
        else if (fileNameOnlyRadioButton.isSelected()) {
            // get the starting index
            startingIndex = Integer.parseInt(startingIndexTextField.getText());
            // renaming each files with new name + index . original extension
            for (int i = 0; i < files.length; i++) {
                currentFileName = files[i].getName();

                if (currentFileName.indexOf(".") == -1) {
                    currentExtension = "";
                } else {
                    currentExtension = currentFileName.substring(currentFileName.indexOf(".") - 1);
                }

                if (new File(folder.getAbsolutePath()
                        + File.separator
                        + starterWordTextField.getText()
                        + (startingIndex + i)
                        + currentExtension).exists()) {
                    renameSuccess = false;
                } else {
                    renameSuccess = files[i].renameTo(
                            new File(folder.getAbsolutePath()
                            + File.separator
                            + starterWordTextField.getText()
                            + (startingIndex + i)
                            + currentExtension));
                }

                infoTextArea.append("\nrenaming file <"
                        + currentFileName
                        + "> to <"
                        + starterWordTextField.getText()
                        + (startingIndex + i)
                        + currentExtension
                        + (renameSuccess ? "> Successful " : "> Failed!"));

                if (renameSuccess) {
                    noOfFilesRenamed++;
                }
            }
        } // renaming extension only
        else if (extensionOnlyRadioButton.isSelected()) {
            String fileName = null;
            // renaming each files with original name . new extension
            for (int i = 0; i < files.length; i++) {
                currentFileName = files[i].getName();

                if (currentFileName.indexOf(".") == -1) {
                    fileName = currentFileName;
                } else {
                    fileName = currentFileName.substring(0, currentFileName.indexOf("."));
                }

                if (new File(folder.getAbsolutePath()
                        + File.separator
                        + fileName
                        + extensionTextField.getText()).exists()) {
                    renameSuccess = false;
                } else {
                    renameSuccess = files[i].renameTo(
                            new File(folder.getAbsolutePath()
                            + File.separator
                            + fileName
                            + extensionTextField.getText()));
                }

                infoTextArea.append("\nrenaming file <"
                        + currentFileName
                        + "> to <"
                        + fileName
                        + extensionTextField.getText()
                        + (renameSuccess ? "> Successful " : "> Failed!"));
                if (renameSuccess) {
                    noOfFilesRenamed++;
                }
            }
        } // replace in file name only
        else if (replaceInFileNameRadioButton.isSelected()) {
            String replaceThis  = replaceThisTextField.getText();
            String replaceWith = replacWithTextField.getText();
            String newFileName;
            for (int i = 0; i < files.length; i++) {
                currentFileName = files[i].getName();
                newFileName = currentFileName.replace(replaceThis, replaceWith);
                
                if (new File(folder.getAbsolutePath()
                        + File.separator
                        + newFileName).exists()) {
                    renameSuccess = false;
                } else {
                    renameSuccess = files[i].renameTo(
                            new File(folder.getAbsolutePath()
                            + File.separator
                            + newFileName));
                }

                infoTextArea.append("\nrenaming file <"
                        + currentFileName
                        + "> to <"
                        + starterWordTextField.getText()
                        + (startingIndex + i)
                        + currentExtension
                        + (renameSuccess ? "> Successful " : "> Failed!"));

                if (renameSuccess) {
                    noOfFilesRenamed++;
                }
            }
        } 
        // print information
        infoTextArea.append("\nFiles Present: " + files.length);
        infoTextArea.append("\nFiles Renamed: " + noOfFilesRenamed);
        infoTextArea.append("\nFiles NOT Renamed: " + (files.length - noOfFilesRenamed));
        infoTextArea.append("\n-----------------------------------------------------\n\n");

        // refresht the filter list
        loadFileFilterComboBox();

        // enabling all components
        disabledGlassPane.deactivate();
    }//GEN-LAST:event_startRenamingButtonActionPerformed

    private void startingIndexTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_startingIndexTextFieldKeyTyped

        // preventing character input in starting index input field
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_startingIndexTextFieldKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MassFileRenamer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MassFileRenamer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MassFileRenamer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MassFileRenamer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MassFileRenamer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JLabel extensionLabel;
    private javax.swing.JRadioButton extensionOnlyRadioButton;
    private javax.swing.JTextField extensionTextField;
    private javax.swing.JComboBox fileFilterComboBox;
    private javax.swing.JLabel fileFilterLabel;
    private javax.swing.JRadioButton fileNameAndExtensionRadioButton;
    private javax.swing.JRadioButton fileNameOnlyRadioButton;
    private javax.swing.JLabel folderLabel;
    private javax.swing.JTextField folderTextField;
    private javax.swing.JTextArea infoTextArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup optionButtonGroup;
    private javax.swing.JLabel renameLabel;
    private javax.swing.JTextField replacWithTextField;
    private javax.swing.JRadioButton replaceInFileNameRadioButton;
    private javax.swing.JTextField replaceThisTextField;
    private javax.swing.JButton startRenamingButton;
    private javax.swing.JLabel starterWordLabel;
    private javax.swing.JTextField starterWordTextField;
    private javax.swing.JLabel startingIndexLabel;
    private javax.swing.JTextField startingIndexTextField;
    // End of variables declaration//GEN-END:variables

    /**
     * method to check whether the inputs are enough for renaming process
     *
     * @return true if ready, else false
     */
    private boolean readyToRename() {
        // check whether the folder is selected or not
        if (folder == null || !folder.exists()) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Folder doesn't exists! Select a valid folder!",
                    "Invalid Folder",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // if the user has selected rename both file name and extension or file name only
        // then check for the starting index input
        if (!extensionOnlyRadioButton.isSelected()
                // incase of replace in file name option we dont need starting index
                && !replaceInFileNameRadioButton.isSelected()
                && (startingIndexTextField.getText() == null
                || startingIndexTextField.getText().isEmpty())) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Enter a valid index value!",
                    "Invalid Index",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (replaceInFileNameRadioButton.isSelected()
                && (replaceThisTextField.getText() == null
                || replaceThisTextField.getText().isEmpty())) {
            JOptionPane.showMessageDialog(
                    rootPane,
                    "Enter a valid replace string!",
                    "Invalid String to Replace",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        // if every check is passed then return true
        return true;
    }

    /**
     * method to load the file filters in the file filters combo box
     */
    private void loadFileFilterComboBox() {

        // first remove all items
        fileFilterComboBox.removeAllItems();
        // set the first selection as 'No Filter'
        fileFilterComboBox.addItem("No Filter");

        // get the selected folder
        File f = new File(folderTextField.getText());

        // if the folder doesnt esists then return
        if (!f.exists()) {
            return;
        }

        // else for every file types in that folder 
        for (String s : FileTypes.getFileTypesIn(f)) {
            // add the extension to the combobox
            fileFilterComboBox.addItem(s);
        }
    }
}
