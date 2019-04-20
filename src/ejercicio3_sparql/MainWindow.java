package ejercicio3_sparql;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.jena.atlas.logging.LogCtl;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryParseException;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.ResultSetFactory;
import org.apache.jena.query.ResultSetFormatter;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.sparql.resultset.ResultsFormat;
import static org.apache.jena.sparql.resultset.ResultsFormat.FMT_RDF_TURTLE;
import static org.apache.jena.sparql.resultset.ResultsFormat.FMT_RDF_XML;
import static org.apache.jena.sparql.resultset.ResultsFormat.FMT_RS_JSON;
import static org.apache.jena.sparql.resultset.ResultsFormat.FMT_TEXT;

public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
        LogCtl.setCmdLogging();
//        model = RDFDataMgr.loadModel("C:\\Users\\samu_\\Desktop\\SI2\\SemanticWeb\\Pratises\\Ejercicio3_ConsultasConSPARQL\\palaeontology_articles-reducido\\palaeontology_articles-reducido.rdf");                
        model = RDFDataMgr.loadModel("C:\\Users\\samu_\\Desktop\\SI2\\SemanticWeb\\Pratises\\Ejercicio3_ConsultasConSPARQL\\datos-ejemplo-sparql\\datos-sparql-2018-19.ttl");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectDataFileRDFLabel = new javax.swing.JLabel();
        dataFileTextField = new javax.swing.JTextField();
        dataFileSearchButton = new javax.swing.JButton();
        resultScrollPanel = new javax.swing.JScrollPane();
        resultTextArea = new javax.swing.JTextArea();
        queryScrollPanel = new javax.swing.JScrollPane();
        queryTextArea = new javax.swing.JTextArea();
        selectURLRemoteQueryLabel = new javax.swing.JLabel();
        selectURLRemoteQueryTextField = new javax.swing.JTextField();
        queryLabel = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        queryExecuteButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        selectDataFileRDFLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        selectDataFileRDFLabel.setText("Seleccione el archivo de datos RDF:");

        dataFileTextField.setText("C:\\Users\\samu_\\Desktop\\SI2\\SemanticWeb\\Pratises\\Ejercicio3_ConsultasConSPARQL\\datos-ejemplo-sparql\\datos-sparql-2018-19.ttl");
        dataFileTextField.setEnabled(false);

        dataFileSearchButton.setText("Buscar");
        dataFileSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataFileSearchButtonActionPerformed(evt);
            }
        });

        resultTextArea.setColumns(20);
        resultTextArea.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        resultTextArea.setRows(5);
        resultScrollPanel.setViewportView(resultTextArea);

        queryTextArea.setColumns(20);
        queryTextArea.setRows(5);
        queryTextArea.setText("PREFIX dc: <http://purl.org/dc/elements/1.1/>\nPREFIX eg: <http://www.si2.com/si2/>\n\nselect ?titulo ?coleccion\nwhere {\n\t?libro dc:title ?titulo.\n\t?libro dc:isPartOf ?coleccion.\n}\n");
        queryScrollPanel.setViewportView(queryTextArea);

        selectURLRemoteQueryLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        selectURLRemoteQueryLabel.setText("URL (consultas remotas):");

        queryLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        queryLabel.setText("Consulta");

        resultLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        resultLabel.setText("Resultados");

        queryExecuteButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        queryExecuteButton.setText("Ejecutar");
        queryExecuteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryExecuteButtonActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        saveButton.setText("Guardar Resultados");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(queryScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                .addComponent(resultScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(selectDataFileRDFLabel)
                                    .addComponent(selectURLRemoteQueryLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dataFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(dataFileSearchButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(selectURLRemoteQueryTextField)
                                        .addGap(89, 89, 89)))))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(queryLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resultLabel)
                        .addGap(214, 214, 214))))
            .addGroup(layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(queryExecuteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveButton)
                .addGap(169, 169, 169))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataFileSearchButton)
                    .addComponent(selectDataFileRDFLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectURLRemoteQueryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectURLRemoteQueryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultLabel)
                    .addComponent(queryLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(queryScrollPanel)
                    .addComponent(resultScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(queryExecuteButton)
                    .addComponent(saveButton))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dataFileSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataFileSearchButtonActionPerformed
        if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fc.getSelectedFile();
            if (selectedFile.exists() && selectedFile.isFile() && selectedFile.canRead()) {
                String absolutePath = fc.getSelectedFile().getAbsolutePath();
                if (checkFileFormat(absolutePath)) {
                    dataFileTextField.setText(absolutePath);
                    model = RDFDataMgr.loadModel(absolutePath);
                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "El formato del fichero debe ser compatible con rdf",
                            "Aviso",
                            JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Su elección no es válida",
                        "Aviso",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_dataFileSearchButtonActionPerformed

    private void queryExecuteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryExecuteButtonActionPerformed
        final String currentQuery = queryTextArea.getText();
        ResultSet results = executeQuery(currentQuery, model);
        if (results != null) {
            this.query = currentQuery;
            String resultText = "";
            if (!results.hasNext())
                resultText += "La consulta no obtiene ningún resultado.";
            else
                while (results.hasNext())
                    resultText += results.next() + "\n";
            resultTextArea.setText(resultText);
        } else {
            this.query = "";
        }
    }//GEN-LAST:event_queryExecuteButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if (!query.isEmpty()) {
            String[] possibleFormats = { "XML", "Turtle", "JSON", "Plain Text"};
            String selectedValue = String.valueOf(JOptionPane.showInputDialog(
                                    this,
                                    "Elige el formato con el que deseas guardar los resultados de la consulta",
                                    "Formato",
                                    JOptionPane.DEFAULT_OPTION,
                                    null,
                                    possibleFormats,
                                    possibleFormats[0]));
            if (fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                String saveFilePath = fc.getSelectedFile().getAbsolutePath();
                OutputStream os = null;
                File saveFile = null;
                switch (selectedValue) {
                    case "XML":
                        saveWithFormat(saveFilePath, os, saveFile, ".xml", FMT_RDF_XML);
                        break;
                    case "Turtle":
                        saveWithFormat(saveFilePath, os, saveFile, ".ttl", FMT_RDF_TURTLE);
                        break;
                    case "JSON":
                        saveWithFormat(saveFilePath, os, saveFile, ".json", FMT_RS_JSON);
                        break;
                    case "Plain Text":
                        saveWithFormat(saveFilePath, os, saveFile, ".txt", FMT_TEXT);
                        break;
                }
            } else
                JOptionPane.showMessageDialog(
                            null,
                            "Debes elegir algún tipo de formato de salida",
                            "Aviso",
                            JOptionPane.WARNING_MESSAGE);
        } else
            JOptionPane.showMessageDialog(
                        null,
                        "Debes realizar una consulta válida para guardar",
                        "Aviso",
                        JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_saveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    
    
    private final JFileChooser fc = new JFileChooser();
    private Model model;
    private String query = "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dataFileSearchButton;
    private javax.swing.JTextField dataFileTextField;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton queryExecuteButton;
    private javax.swing.JLabel queryLabel;
    private javax.swing.JScrollPane queryScrollPanel;
    private javax.swing.JTextArea queryTextArea;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JScrollPane resultScrollPanel;
    private javax.swing.JTextArea resultTextArea;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel selectDataFileRDFLabel;
    private javax.swing.JLabel selectURLRemoteQueryLabel;
    private javax.swing.JTextField selectURLRemoteQueryTextField;
    // End of variables declaration//GEN-END:variables

    private boolean checkFileFormat(String absolutePath) {
        return absolutePath.endsWith(".rdf") || 
               absolutePath.endsWith(".ttl") ||
               absolutePath.endsWith(".xml");
    }
    
    private void saveWithFormat(String saveFilePath, OutputStream os, File saveFile, String extension, ResultsFormat format) {
        saveFilePath += extension;
        saveFile = new File(saveFilePath);
        try {
            os = new FileOutputStream(saveFile);
            ResultSet result = executeQuery(query, model);
            if (result != null)
                ResultSetFormatter.output(os, result, format);
        } catch (FileNotFoundException ex) {
             JOptionPane.showMessageDialog(
                null,
                "Ha ocurrido un error con el fichero de salida.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private ResultSet executeQuery(String query, Model model) {
        ResultSet resultAux;
        ResultSet result = null;
        try (QueryExecution execution = QueryExecutionFactory.create(query, model)) {
            resultAux = execution.execSelect();
            result = ResultSetFactory.copyResults(resultAux);
            execution.close();
        }  catch (QueryParseException e) {
            resultTextArea.setText("Error en sintaxis de la consulta\n\n"
                                    + "ERROR: "
                                    + e.getMessage());
        }
        return result;
    }
}
