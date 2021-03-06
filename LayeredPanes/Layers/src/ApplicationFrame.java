/*
 * Copyright (c) 2007, Romain Guy
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   * Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *   * Redistributions in binary form must reproduce the above
 *     copyright notice, this list of conditions and the following
 *     disclaimer in the documentation and/or other materials provided
 *     with the distribution.
 *   * Neither the name of the TimingFramework project nor the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.OverlayLayout;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Romain Guy
 */
public class ApplicationFrame extends javax.swing.JFrame {
    
    /** Creates new form ApplicationFrame */
    public ApplicationFrame() {
        initComponents();
        
        addLayeredValidator();
        addValidations();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        javax.swing.JLabel jLabel1;
        javax.swing.JLabel jLabel2;
        javax.swing.JLabel jLabel3;
        javax.swing.JLabel jLabel4;
        javax.swing.JLabel jLabel5;
        javax.swing.JList jList1;
        javax.swing.JScrollPane jScrollPane1;
        javax.swing.JScrollPane jScrollPane2;

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Layered Panes");
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Jeff Dinkins", "Richard Bair", "Amy Fowler", "Scott Violet", "Hans Muller", "Chris Campbell", "Chet Haase" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        jLabel3.setText("Phone");

        jLabel4.setText("Email");

        jLabel5.setText("Address");

        address.setColumns(15);
        address.setRows(5);
        jScrollPane2.setViewportView(address);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 152, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel5)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel4)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel3)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel2)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(firstName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .add(lastName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .add(phoneNumber, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .add(email, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel1)
                            .add(firstName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel2)
                            .add(lastName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel3)
                            .add(phoneNumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel4)
                            .add(email, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel5)
                            .add(jScrollPane2))
                        .add(6, 6, 6))
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                .addContainerGap())
        );
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-489)/2, (screenSize.height-266)/2, 489, 266);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApplicationFrame().setVisible(true);
            }
        });
    }

    private void addLayeredValidator() {
        validator = new Validator();
        
        JLayeredPane layeredPane = getRootPane().getLayeredPane();
        layeredPane.setLayout(new OverlayLayout(layeredPane));
        layeredPane.add(validator, (Integer) (JLayeredPane.DEFAULT_LAYER + 50));
        //validator.setBounds(0, 0, getWidth(), getHeight());
    }

    private void addValidations() {
        addValidationForText(address);
        addValidationForText(firstName);
        addValidationForText(lastName);
        addValidationForNumber(phoneNumber);
        addValidationForEmail(email);
    }

    private void addValidationForText(JTextComponent field) {
        field.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent focusEvent) {
            }
            
            public void focusLost(FocusEvent focusEvent) {
                JTextComponent field = (JTextComponent) focusEvent.getComponent();
                String text = field.getText();
                
                if (text.matches("[-A-Za-z ]*")) {
                    validator.addWarning(field);
                } else {
                    validator.removeWarning(field);
                }
            }
        });
    }

    private void addValidationForNumber(JTextComponent field) {
        field.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent focusEvent) {
            }
            
            public void focusLost(FocusEvent focusEvent) {
                JTextField field = (JTextField) focusEvent.getComponent();
                String text = field.getText();
                
                if (text.matches("[-()0-9 ]*")) {
                    validator.addWarning(field);
                } else {
                    validator.removeWarning(field);
                }
            }
        });
    }

    private void addValidationForEmail(JTextComponent field) {
        field.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent focusEvent) {
            }
            
            public void focusLost(FocusEvent focusEvent) {
                JTextComponent field = (JTextComponent) focusEvent.getComponent();
                String text = field.getText();
                
                if (text.matches("[^@]+@([^.]+\\.)+[^.]+")) {
                    validator.addWarning(field);
                } else {
                    validator.removeWarning(field);
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstName;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField phoneNumber;
    // End of variables declaration//GEN-END:variables

    private Validator validator;
    
}
