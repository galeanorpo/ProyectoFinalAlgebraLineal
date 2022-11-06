/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author SaulUrias
 */
public class GaussJordan extends javax.swing.JFrame {

    /**
     * Creates new form interfazGauss
     */
    public GaussJordan() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * Atributos utilizados en la interfaz
     */
    int p = 0, n; // pivote y tamaño de la matriz
    double a[][] = null; // arreglo que almacena la matriz
    char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'}; //variables

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btBorrarMatriz1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbGauss = new javax.swing.JTable();
        txtTamanioMatriz = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        btAplicarMetodo = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPasos = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btBorrarMatriz2 = new javax.swing.JButton();

        btBorrarMatriz1.setText("Borrar");
        btBorrarMatriz1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBorrarMatriz1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Método de Gauss-Jordan");

        jPanel1.setLayout(null);

        tbGauss.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbGauss);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 90, 380, 200);

        txtTamanioMatriz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTamanioMatrizKeyTyped(evt);
            }
        });
        jPanel1.add(txtTamanioMatriz);
        txtTamanioMatriz.setBounds(170, 60, 100, 23);

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        jPanel1.add(okButton);
        okButton.setBounds(290, 60, 72, 20);

        btAplicarMetodo.setText("Aplicar");
        btAplicarMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAplicarMetodoActionPerformed(evt);
            }
        });
        jPanel1.add(btAplicarMetodo);
        btAplicarMetodo.setBounds(90, 300, 80, 30);

        btnBack.setText("Volver");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(280, 300, 80, 30);

        txtPasos.setEditable(false);
        txtPasos.setColumns(20);
        txtPasos.setLineWrap(true);
        txtPasos.setRows(5);
        jScrollPane2.setViewportView(txtPasos);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(420, 90, 360, 230);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gauss-Jordan");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 10, 800, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Tamaño de la matriz:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 60, 120, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Procedimiento:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(420, 60, 90, 20);

        btBorrarMatriz2.setText("Borrar");
        btBorrarMatriz2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBorrarMatriz2ActionPerformed(evt);
            }
        });
        jPanel1.add(btBorrarMatriz2);
        btBorrarMatriz2.setBounds(180, 300, 80, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        btnOK();
    }//GEN-LAST:event_okButtonActionPerformed

    private void btAplicarMetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAplicarMetodoActionPerformed
        btnAplicar();
    }//GEN-LAST:event_btAplicarMetodoActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        DashBoard d1 = new DashBoard();
        d1.show();
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtTamanioMatrizKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTamanioMatrizKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLetter(c)) {
            getToolkit().beep();
            
            evt.consume();
            JOptionPane.showMessageDialog(null, "Favor de Introducir Caracteres Validos");
            
        }
    }//GEN-LAST:event_txtTamanioMatrizKeyTyped

    private void btBorrarMatriz1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBorrarMatriz1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBorrarMatriz1ActionPerformed

    private void btBorrarMatriz2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBorrarMatriz2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBorrarMatriz2ActionPerformed

    public void btnAplicar() {
        try {
            int valorInicial = Integer.parseInt((String) tbGauss.getValueAt(0, 0));
            
            if (valorInicial == 0) { //si el primer valor esta 0
                JOptionPane.showMessageDialog(null, " El primer valor debe ser \n Diferente de 0 \n Gracias");
            } else {

                int fila = tbGauss.getSelectedRow();
                if (fila == -1) { //Si esta uno seleccionado
                    JOptionPane.showMessageDialog(this, "Favor de llenar la Matriz");
                    
                } else {
                    boolean verificada = verificarMatriz();
                    if (verificada) {
                        a = new double[n][n+1];
                        llenarMatriz(n);
                        btAplicarMetodo.setEnabled(false);
                        okButton.setEnabled(false);
                    }
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verificar la Matriz \n Algo anda mal");
            System.out.println(e);
        }
    }
    
    public void btnOK() {
        if (Integer.parseInt(txtTamanioMatriz.getText()) > 10 || Integer.parseInt(txtTamanioMatriz.getText()) < 2) {
            JOptionPane.showMessageDialog(null, " El algoritmo solo resuelve matrices \n en un rango entre \n 2 y 10 valores");
        }
        else if (txtTamanioMatriz.getText().equals("") ) {
            JOptionPane.showMessageDialog(this, "Favor de introducir un número");
        }
        else{
            n = Integer.parseInt(txtTamanioMatriz.getText()); //leer tamaño
            llenarTabla(n);
        }
    }
    
    public void llenarTabla(int n) {
        DefaultTableModel tabla = new DefaultTableModel();
        
        //Columnas
        for (int i = 0; i < n; i++) {
            tabla.addColumn(letras[i]);
        }
        tabla.addColumn("Resultado");
        tbGauss.setModel(tabla);
        
        //Filas
        String datosTabla[] = new String[n];
        
        for (int i = 0; i < n; i++) {
            tabla.addRow(datosTabla);
        }
    }

    public void llenarMatriz(int n) {
        TableModel tabla = tbGauss.getModel();
        
        txtPasos.append("Matriz original\n");
        for (int i = 0; i < n; i++) // ciclo para añadir datos
        {
            for (int j = 0; j <= n; j++) {
                double numero = Double.parseDouble((String) tabla.getValueAt(i, j));
                
                a[i][j] = numero;
                //System.out.println("a: " + a[i][j]);
                
                txtPasos.append(String.valueOf(a[i][j])+"\t");
            }
            txtPasos.append("\n");
        }
        aplicarMetodo();
        
    }

    public void aplicarMetodo() {
        for (int i = 0; i < n; i++) {
            txtPasos.append("-------------------\n");
            pivote(a, p, n);
            llenarMatrizActualizada(a, n);
            //inserte timer aqui
            
            txtPasos.append("-------------------\n");
            hacerCeros(a, p, n);
            llenarMatrizActualizada(a, n);
            //inserte timer aqui
            
            p++;
        }
        
    }

    public void llenarMatrizActualizada(double matriz[][], int var) {
        TableModel tabla = tbGauss.getModel();
        
        for (int x = 0; x < var; x++) {
            for (int y = 0; y < var+1; y++) {
                tabla.setValueAt(matriz[x][y], x, y);
                txtPasos.append(String.valueOf(matriz[x][y])+"\t");
            }
            txtPasos.append("\n");
        }
    }
    
    public void pivote(double matriz[][], int p, int var) {
        double divicion = matriz[p][p]; //guardar sobre cuanto se va a dividir
        
        for (int y = 0; y < (var + 1); y++) { //recorrer la fila para ir dividiendo
            double resultado = matriz[p][y] / divicion;
            double r = redondearDecimales(resultado, 2);
            matriz[p][y] = r;
        }
        txtPasos.append("Pivote: Fila" + p + " / " +divicion + "\n");
        //txtPasos.append("\n");
    }
    
    public void hacerCeros(double matriz[][], int p, int var) {
        for (int x = 0; x < var; x++) { //recorrer filas
            
            if (x != p) { //si el pivote no concuerda con la fila en la que la esta
                double constante = matriz[x][p]; //guardar constante del valor de la fila que se va a restar
                
                for (int z = 0; z < (var + 1); z++) { //recorrer columnas
                    double resultado = ((-1 * constante) * matriz[p][z]) + matriz[x][z]; //la matriz se le va a restar tantas veces el pivote por su valor actual
                    double r = redondearDecimales(resultado, 2);
                    matriz[x][z] = r;
                }
                txtPasos.append("Ceros: Fila"+ x + " " + -1*constante + " * Fila" + p + "\n");
            }
        }
    }
    
    public boolean verificarMatriz(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                String valor = (String) tbGauss.getModel().getValueAt(i, j);
                if (valor.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "La tabla no esta completa");
                    return false;
                    
                }
            }
        }
        return true;
    }
    
    public double redondearDecimales(double valorInicial, int numeroDecimales) {
        double parteEntera, resultado;
        
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado=(resultado-parteEntera)*Math.pow(10, numeroDecimales);
        resultado=Math.round(resultado);
        resultado=(resultado/Math.pow(10, numeroDecimales))+parteEntera;
        
        return resultado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAplicarMetodo;
    private javax.swing.JButton btBorrarMatriz1;
    private javax.swing.JButton btBorrarMatriz2;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton okButton;
    private javax.swing.JTable tbGauss;
    private javax.swing.JTextArea txtPasos;
    private javax.swing.JTextField txtTamanioMatriz;
    // End of variables declaration//GEN-END:variables
}