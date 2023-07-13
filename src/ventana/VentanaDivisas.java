package ventana;

public class VentanaDivisas extends javax.swing.JFrame {

    private String divisa1 = "Europa, Euro";
    private String divisa2 = "EEUU, Dólar";
    private String cantidad = "";
    private double dinero, cambio;
    private boolean punto = true;

    public VentanaDivisas() {
        initComponents();
        setSize(300, 450);
        setLocationRelativeTo(null);
        setTitle("Conversor de divisas");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        etiquetaDivisa1 = new javax.swing.JLabel();
        etiquetaCambio1 = new javax.swing.JLabel();
        comboDivisas1 = new javax.swing.JComboBox<>();
        etiquetaDivisa2 = new javax.swing.JLabel();
        etiquetaCambio2 = new javax.swing.JLabel();
        comboDivisas2 = new javax.swing.JComboBox<>();
        botonC = new javax.swing.JButton();
        botonBorraar = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();
        barraDeMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        calculadoraEstandar = new javax.swing.JMenuItem();
        conversorDivisas = new javax.swing.JMenuItem();
        separador = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de divisas");

        jPanel1.setLayout(new java.awt.GridBagLayout());

        etiquetaDivisa1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        etiquetaDivisa1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaDivisa1.setText("$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 10);
        jPanel1.add(etiquetaDivisa1, gridBagConstraints);

        etiquetaCambio1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        etiquetaCambio1.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        jPanel1.add(etiquetaCambio1, gridBagConstraints);

        comboDivisas1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboDivisas1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EEUU, Dólar", "Perú, Nuevo Sol", "Europa, Euro" }));
        comboDivisas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDivisas1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel1.add(comboDivisas1, gridBagConstraints);

        etiquetaDivisa2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        etiquetaDivisa2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaDivisa2.setText("€");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 0, 10);
        jPanel1.add(etiquetaDivisa2, gridBagConstraints);

        etiquetaCambio2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        etiquetaCambio2.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        jPanel1.add(etiquetaCambio2, gridBagConstraints);

        comboDivisas2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboDivisas2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EEUU, Dólar", "Perú, Nuevo Sol", "Europa, Euro" }));
        comboDivisas2.setSelectedIndex(2);
        comboDivisas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDivisas2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel1.add(comboDivisas2, gridBagConstraints);

        botonC.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonC.setText("C");
        botonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        jPanel1.add(botonC, gridBagConstraints);

        botonBorraar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Delete.png"))); // NOI18N
        botonBorraar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorraarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        jPanel1.add(botonBorraar, gridBagConstraints);

        boton7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        boton7.setText("7");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton7, gridBagConstraints);

        boton8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton8, gridBagConstraints);

        boton9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton9, gridBagConstraints);

        boton4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton4, gridBagConstraints);

        boton5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton5, gridBagConstraints);

        boton6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton6, gridBagConstraints);

        boton1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton1, gridBagConstraints);

        boton2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton2, gridBagConstraints);

        boton3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton3, gridBagConstraints);

        boton0.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        boton0.setText("0");
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(boton0, gridBagConstraints);

        botonPunto.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Punto.png"))); // NOI18N
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        jPanel1.add(botonPunto, gridBagConstraints);

        jMenu1.setText("Usos");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        calculadoraEstandar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        calculadoraEstandar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calculadora.png"))); // NOI18N
        calculadoraEstandar.setText("Calculadora estándar");
        calculadoraEstandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculadoraEstandarActionPerformed(evt);
            }
        });
        jMenu1.add(calculadoraEstandar);

        conversorDivisas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        conversorDivisas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambio.png"))); // NOI18N
        conversorDivisas.setText("Conversor de divisas");
        jMenu1.add(conversorDivisas);
        jMenu1.add(separador);

        salir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jMenu1.add(salir);

        barraDeMenu.add(jMenu1);

        setJMenuBar(barraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calculadoraEstandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculadoraEstandarActionPerformed
        // TODO add your handling code here:
        VentanaCalculadora calculadora = new VentanaCalculadora();
        calculadora.setVisible(true);
        calculadora.setSize(300, 450);
        calculadora.setTitle("Calculadora");

        dispose();
    }//GEN-LAST:event_calculadoraEstandarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void botonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCActionPerformed

        cantidad = "";
        punto = true;

        etiquetaCambio1.setText("0");
        etiquetaCambio2.setText("0");

    }//GEN-LAST:event_botonCActionPerformed

    private void pulsado(String n) {
        if (etiquetaCambio1.getText() == "0") {
            cantidad = n;
        } else {
            cantidad += n;
        }

    }
    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
        pulsado("4");
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed

        pulsado("1");

        etiquetaCambio1.setText(cantidad);
        obtenerDinero();

    }//GEN-LAST:event_boton1ActionPerformed

    private void comboDivisas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDivisas1ActionPerformed

        divisa1 = (String) comboDivisas1.getSelectedItem();
        if (divisa1.equals("EEUU, Dólar")) {
            etiquetaDivisa1.setText("$");
        }
        if (divisa1.equals("Perú, Nuevo Sol")) {
            etiquetaDivisa1.setText("S/.");
        }
        if (divisa1.equals("Europa, Euro")) {
            etiquetaDivisa1.setText("€");
        }
        obtenerDinero();


    }//GEN-LAST:event_comboDivisas1ActionPerformed

    private void comboDivisas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDivisas2ActionPerformed

        divisa2 = (String) comboDivisas2.getSelectedItem();
        if (divisa2.equals("EEUU, Dólar")) {
            etiquetaDivisa2.setText("$");
        }
        if (divisa2.equals("Perú, Nuevo Sol")) {
            etiquetaDivisa2.setText("S/.");
        }
        if (divisa2.equals("Europa, Euro")) {
            etiquetaDivisa2.setText("€");
        }
        obtenerDinero();

    }//GEN-LAST:event_comboDivisas2ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed

        pulsado("2");
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed

        pulsado("3");

        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
 pulsado("5");
        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        pulsado("6");

        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        pulsado("7");

        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
        pulsado("8");

        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
        pulsado("9");

        etiquetaCambio1.setText(cantidad);
        obtenerDinero();
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
        if (cantidad != "") {
            pulsado("0");

            etiquetaCambio1.setText(cantidad);
            obtenerDinero();
        }
    }//GEN-LAST:event_boton0ActionPerformed

    private void botonBorraarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorraarActionPerformed
        int size = cantidad.length();
        if (size > 0) {
            if (size == 1) {
                cantidad = "0";
            } else {
                cantidad = cantidad.substring(0, cantidad.length() - 1);
            }
            etiquetaCambio1.setText(cantidad);
        }
        obtenerDinero();
    }//GEN-LAST:event_botonBorraarActionPerformed

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPuntoActionPerformed
        if (punto == true) {
            if (cantidad == "") {
                cantidad = "0.";
            } else {
                cantidad += ".";
            }
            etiquetaCambio1.setText(cantidad);
            punto = false;
        }
    }//GEN-LAST:event_botonPuntoActionPerformed

    private void obtenerDinero() {
        cantidad = etiquetaCambio1.getText();
        dinero = Double.parseDouble(cantidad);
        cambioDivisas();
        dinero *= cambio;
        etiquetaCambio2.setText(String.format("%.2f", dinero));

    }

    private void cambioDivisas() {
        if (divisa1.equals(divisa2)) {
            cambio = 1;
        } else if (divisa1.equals("EEUU, Dólar") && divisa2.equals("Perú, Nuevo Sol")) {
            cambio = 3.25;
        } else if (divisa1.equals("EEUU, Dólar") && divisa2.equals("Europa, Euro")) {
            cambio = 0.84;
        } else if (divisa1.equals("Perú, Nuevo Sol") && divisa2.equals("EEUU, Dólar")) {
            cambio = 0.32;
        } else if (divisa1.equals("Perú, Nuevo Sol") && divisa2.equals("Europa, Euro")) {
            cambio = 0.26;
        } else if (divisa1.equals("Europa, Euro") && divisa2.equals("Perú, Nuevo Sol")) {
            cambio = 3.91;
        } else if (divisa1.equals("Europa, Euro") && divisa2.equals("EEUU, Dólar")) {
            cambio = 1.2;
        } else if (divisa1.equals("EEUU, Dólar") && divisa2.equals("Perú, Nuevo Sol")) {
            cambio = 3.25;
        } else if (divisa1.equals("EEUU, Dólar") && divisa2.equals("Perú, Nuevo Sol")) {
            cambio = 3.25;
        } else if (divisa1.equals("EEUU, Dólar") && divisa2.equals("Perú, Nuevo Sol")) {
            cambio = 3.25;
        }
    }

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
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDivisas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraDeMenu;
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonBorraar;
    private javax.swing.JButton botonC;
    private javax.swing.JButton botonPunto;
    private javax.swing.JMenuItem calculadoraEstandar;
    private javax.swing.JComboBox<String> comboDivisas1;
    private javax.swing.JComboBox<String> comboDivisas2;
    private javax.swing.JMenuItem conversorDivisas;
    private javax.swing.JLabel etiquetaCambio1;
    private javax.swing.JLabel etiquetaCambio2;
    private javax.swing.JLabel etiquetaDivisa1;
    private javax.swing.JLabel etiquetaDivisa2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem salir;
    private javax.swing.JPopupMenu.Separator separador;
    // End of variables declaration//GEN-END:variables
}
