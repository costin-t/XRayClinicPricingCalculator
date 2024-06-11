
package pricelist;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;

public class NewJFrame extends javax.swing.JFrame {

    
    public NewJFrame() {
        initComponents();
        setSpinnerValueToOne(1);
        setButtonColorDefault();
        setIconImage();
        
    }
       
    
    public void makeArrayButtonsZeros(){
        for(int i = 0; i < 50; i++){
            buttonArray[i] = 0;
        }
    }
    
    public void setSpinnerValueToOne(int n){
    SpinnerRetro.setValue(n);
    bitewingSpinner.setValue(n);
    jSpinner4.setValue(n);
    statusSpinner.setValue(n);
    ocluzieSpinner.setValue(n);
    TeleSpinner.setValue(n);
    fotoIntraSpinner.setValue(n);
    spinnerExtraorale.setValue(n);
    scannareSpinner.setValue(n);
    scanareSpinnerGips.setValue(n);
    studiuSpinner.setValue(n);
    deplasareSpinner.setValue(n);
    analizaSpinner.setValue(n);
    spinnerDosar.setValue(n);
    opgSpinner.setValue(n);
    opgBitewingSpinner.setValue(n);
    atmSpinner.setValue(n);
    spinnerSinusuri.setValue(n);
    safSpinner.setValue(n);
    maxMandSpinner.setValue(n);
    maxilarSpinner.setValue(n);
    mandibularSpinner.setValue(n);
    hemiarcadaMaxilaraSpinner.setValue(n);
    hemiarcadaMandSpinner.setValue(n);
    unuDintiSpinner.setValue(n);
    ctAtmSpinner.setValue(n);
    ctSinusuriSpinner.setValue(n);
}
    public void setButtonColorDefault(){
         defaultButtonColor = reset.getBackground();
    } 
    
    public void changeTotalLabel(int n){
        String putText = String.valueOf(n);
        actualTotal.setText(putText);
    }
    
    public void buttonColor(JButton button){
          if (button.getBackground().equals(Color.GREEN)) {
            button.setBackground(defaultButtonColor);
        } else {
            button.setBackground(Color.GREEN);
        }
    }
    
     public void resetWithThreeButtons (JButton button1, JButton button2, JButton button3, JSpinner jspinner){
        button1.setBackground(defaultButtonColor);
        button2.setBackground(defaultButtonColor);
        button3.setBackground(defaultButtonColor);
            setSpinnerValueToOne(1);
            jspinner.setEnabled(true);
            button1.setEnabled(true);
            button2.setEnabled(true);
            button3.setEnabled(true);
    }
    
   
    public void resetPanelWithProcedure(JButton button1, JButton button2, JSpinner jspinner){
        button1.setBackground(defaultButtonColor);
        button2.setBackground(defaultButtonColor);
            setSpinnerValueToOne(1);
            jspinner.setEnabled(true);
            button1.setEnabled(true);
            button2.setEnabled(true);
    }
    
    public void resetOnlyOneButton(JButton button1, JSpinner jspinner){
        button1.setBackground(defaultButtonColor);
        setSpinnerValueToOne(1);
        button1.setEnabled(true);
        jspinner.setEnabled(true);
        
    }
    
    
    
    public void spinnerCalculator(JSpinner jspinner, JButton button){
        String ConvertedSpinnerValue = jspinner.getValue().toString();
       int spinervalue = Integer.parseInt(ConvertedSpinnerValue);
       if(spinervalue<0){
           setSpinnerValueToOne(0);
            button.setBackground(defaultButtonColor);
       } else {
           String converter = button.getText().toString();
           int valueOfButton = Integer.parseInt(converter);
           totalSum = totalSum + valueOfButton*spinervalue;
           changeTotalLabel(totalSum);
           jspinner.setEnabled(false);
       }
    }
    
      public void NegativespinnerCalculator(JSpinner jspinner, JButton button){
        String ConvertedSpinnerValue = jspinner.getValue().toString();
       int spinervalue = Integer.parseInt(ConvertedSpinnerValue);
       if(spinervalue<0){
           setSpinnerValueToOne(0);
            button.setBackground(defaultButtonColor);
       } else {
           String converter = button.getText().toString();
           int valueOfButton = Integer.parseInt(converter);
           totalSum = totalSum - valueOfButton*spinervalue;
           changeTotalLabel(totalSum);
           jspinner.setEnabled(true);
       }
    }
      
      public void threeButtonFunctionality(int numberIndexArray, JSpinner jspinner, JButton print, JButton email, JButton neprelucrat ){
        String converterSpinner = jspinner.getValue().toString();
         int spinnerValue = Integer.parseInt(converterSpinner);
       if(spinnerValue>=1){
           if(buttonArray[numberIndexArray]==0){
           buttonColor(print);
           spinnerCalculator(jspinner,print);
           buttonArray[numberIndexArray] = 1;
           email.setEnabled(false);
           neprelucrat.setEnabled(false);
       } else {
           buttonColor(print);
           email.setEnabled(true);
           neprelucrat.setEnabled(true);
           jspinner.setEnabled(true);
           buttonArray[numberIndexArray] = 0;
          NegativespinnerCalculator(jspinner, print);
        }
       } else {
           jspinner.setValue(1);
       }
    }
      
      
      
      
       public void twoButtonPanelFunctionality(int numberIndexArray, JSpinner jspinner, JButton print, JButton email ){
        String converterSpinner = jspinner.getValue().toString();
         int spinnerValue = Integer.parseInt(converterSpinner);
       if(spinnerValue>=1){
           if(buttonArray[numberIndexArray]==0){
           buttonColor(print);
           spinnerCalculator(jspinner,print);
           buttonArray[numberIndexArray] = 1;
           email.setEnabled(false);
       } else {
           buttonColor(print);
           email.setEnabled(true);
           jspinner.setEnabled(true);
           buttonArray[numberIndexArray] = 0;
          NegativespinnerCalculator(jspinner, print);
        }
       } else {
           jspinner.setValue(1);
       }
    }
       
        public void OneButtonPanelFunctionality(int numberIndexArray, JSpinner jspinner, JButton print){
        String converterSpinner = jspinner.getValue().toString();
         int spinnerValue = Integer.parseInt(converterSpinner);
       if(spinnerValue>=1){
           if(buttonArray[numberIndexArray]==0){
           buttonColor(print);
           spinnerCalculator(jspinner,print);
           buttonArray[numberIndexArray] = 1;
       } else {
           buttonColor(print);
           jspinner.setEnabled(true);
           buttonArray[numberIndexArray] = 0;
          NegativespinnerCalculator(jspinner, print);
        }
       } else {
           jspinner.setValue(1);
       }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSigla = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        maxMandPrint = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        maxMandEmail = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        maxMandNeprelucrat = new javax.swing.JButton();
        maxMandSpinner = new javax.swing.JSpinner();
        jPanel27 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        maxilarPrint = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        maxilarEmail = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        maxilarNeprelucrat = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        mandibularPrint = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        mandibularEmail = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        mandibularNeprelucrat = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        hemiarcadaMaxilaraPrint = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        hemiarcadaMaxilaraEmail = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        hemiarcadaMaxilaraNeprelucrat = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        hemiarcadaMandPrint = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        hemiarcadaMandEmail = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        hemiarcadaMandNeprelucrat = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        unuDintiPrint = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        unuDintiEmail = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        unuDintiNeprelucrat = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        ctAtmPrint = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        ctAtmEmail = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        ctAtmNeprelucrat = new javax.swing.JButton();
        ctAtmSpinner = new javax.swing.JSpinner();
        jPanel33 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        ctSinusuriPrint = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        ctSinusuriEmail = new javax.swing.JButton();
        jLabel69 = new javax.swing.JLabel();
        ctSinusuriNeprelucrat = new javax.swing.JButton();
        jLabel70 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        opgPrint = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        opgEmail = new javax.swing.JButton();
        opgSpinner = new javax.swing.JSpinner();
        jLabel40 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        bitewingOpgPrint = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        bitewingOpgEmail = new javax.swing.JButton();
        opgBitewingSpinner = new javax.swing.JSpinner();
        jLabel25 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        atmPrint = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        atmEmail = new javax.swing.JButton();
        atmSpinner = new javax.swing.JSpinner();
        jLabel24 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        sinusuriPrint = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        sinusuriEmail = new javax.swing.JButton();
        spinnerSinusuri = new javax.swing.JSpinner();
        jPanel11 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        safPrint = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        safEmail = new javax.swing.JButton();
        safSpinner = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel7 = new javax.swing.JLabel();
        maxilarSpinner = new javax.swing.JSpinner();
        mandibularSpinner = new javax.swing.JSpinner();
        hemiarcadaMaxilaraSpinner = new javax.swing.JSpinner();
        hemiarcadaMandSpinner = new javax.swing.JSpinner();
        unuDintiSpinner = new javax.swing.JSpinner();
        ctSinusuriSpinner = new javax.swing.JSpinner();
        jPanelTotal = new javax.swing.JPanel();
        total = new javax.swing.JLabel();
        actualTotal = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        jPanelIntraorale = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        buttonRetroPrint = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        ButtonRetroEmail = new javax.swing.JButton();
        SpinnerRetro = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        bitewingPrint = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        BiteWingEmail = new javax.swing.JButton();
        bitewingSpinner = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jSpinner4 = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        statusPrint = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        staticEmail = new javax.swing.JButton();
        statusSpinner = new javax.swing.JSpinner();
        jPanelOrotodontie = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        OcluziePrint = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        ocluzieEmail = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        ocluzieSpinner = new javax.swing.JSpinner();
        jPanel15 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        telePrint = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        teleEmail = new javax.swing.JButton();
        TeleSpinner = new javax.swing.JSpinner();
        jPanel16 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        fotoIntraPrint = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        fotoIntraEmail = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        prinExtraorale = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        EmailExtraorale = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        scanareButton = new javax.swing.JButton();
        scannareSpinner = new javax.swing.JSpinner();
        jPanel19 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        studiuButton = new javax.swing.JButton();
        studiuSpinner = new javax.swing.JSpinner();
        jPanel20 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        scanareGipsButton = new javax.swing.JButton();
        scanareSpinnerGips = new javax.swing.JSpinner();
        jPanel21 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        deplasareButton = new javax.swing.JButton();
        deplasareSpinner = new javax.swing.JSpinner();
        jLabel39 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        AnalizaPrint = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        AnalizaEmail = new javax.swing.JButton();
        analizaSpinner = new javax.swing.JSpinner();
        jLabel42 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        printDosar = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        EmailDosar = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        spinnerDosar = new javax.swing.JSpinner();
        fotoIntraSpinner = new javax.swing.JSpinner();
        spinnerExtraorale = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Price List");
        setPreferredSize(new java.awt.Dimension(1394, 746));

        jLabel45.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel45.setText("Tomografii: ");

        jLabel46.setText("Tomografie 3D totala maxilara si mandibulara     ");

        maxMandPrint.setText("950");
        maxMandPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxMandPrintActionPerformed(evt);
            }
        });

        jLabel47.setText(" *email");

        maxMandEmail.setText("700");
        maxMandEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxMandEmailActionPerformed(evt);
            }
        });

        jLabel48.setText(" * neprelucrata");

        maxMandNeprelucrat.setText("570");
        maxMandNeprelucrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxMandNeprelucratActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maxMandPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(maxMandEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(maxMandNeprelucrat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(maxMandSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(maxMandNeprelucrat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(maxMandPrint)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(maxMandSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(maxMandEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jLabel49.setText("Tomografie 3D totala maxilara          ");

        maxilarPrint.setText("570");
        maxilarPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxilarPrintActionPerformed(evt);
            }
        });

        jLabel50.setText(" *email");

        maxilarEmail.setText("430");
        maxilarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxilarEmailActionPerformed(evt);
            }
        });

        jLabel51.setText(" * neprelucrata");

        maxilarNeprelucrat.setText("365");
        maxilarNeprelucrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxilarNeprelucratActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(maxilarPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(maxilarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maxilarNeprelucrat, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(maxilarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(maxilarPrint))
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maxilarNeprelucrat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jLabel52.setText("Tomografie 3D totala mandibulara  *print");

        mandibularPrint.setText("570");
        mandibularPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mandibularPrintActionPerformed(evt);
            }
        });

        jLabel53.setText(" *email");

        mandibularEmail.setText("430");
        mandibularEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mandibularEmailActionPerformed(evt);
            }
        });

        jLabel54.setText(" * neprelucrata");

        mandibularNeprelucrat.setText("365");
        mandibularNeprelucrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mandibularNeprelucratActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(mandibularPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mandibularEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mandibularNeprelucrat, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mandibularEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mandibularPrint))
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mandibularNeprelucrat)))))
        );

        jLabel55.setText("Tomografie 3D partiala maxilara-hemiarcada ");

        hemiarcadaMaxilaraPrint.setText("410");
        hemiarcadaMaxilaraPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hemiarcadaMaxilaraPrintActionPerformed(evt);
            }
        });

        jLabel56.setText(" *email");

        hemiarcadaMaxilaraEmail.setText("325");
        hemiarcadaMaxilaraEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hemiarcadaMaxilaraEmailActionPerformed(evt);
            }
        });

        jLabel57.setText(" * neprelucrata");

        hemiarcadaMaxilaraNeprelucrat.setText("265");
        hemiarcadaMaxilaraNeprelucrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hemiarcadaMaxilaraNeprelucratActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(hemiarcadaMaxilaraPrint, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hemiarcadaMaxilaraEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hemiarcadaMaxilaraNeprelucrat, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hemiarcadaMaxilaraPrint)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hemiarcadaMaxilaraEmail)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hemiarcadaMaxilaraNeprelucrat)))
        );

        jLabel58.setText("Tomografie 3D partiala mandibulara-hemiarcada");

        hemiarcadaMandPrint.setText("410");
        hemiarcadaMandPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hemiarcadaMandPrintActionPerformed(evt);
            }
        });

        jLabel59.setText(" *email");

        hemiarcadaMandEmail.setText("325");
        hemiarcadaMandEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hemiarcadaMandEmailActionPerformed(evt);
            }
        });

        jLabel60.setText(" * neprelucrata");

        hemiarcadaMandNeprelucrat.setText("265");
        hemiarcadaMandNeprelucrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hemiarcadaMandNeprelucratActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(hemiarcadaMandPrint, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hemiarcadaMandEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hemiarcadaMandNeprelucrat, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hemiarcadaMandPrint)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hemiarcadaMandEmail)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hemiarcadaMandNeprelucrat)))
        );

        jLabel61.setText("Tomografie 3D partiala- 1,2 dinti");

        unuDintiPrint.setText("250");
        unuDintiPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unuDintiPrintActionPerformed(evt);
            }
        });

        jLabel62.setText(" *email");

        unuDintiEmail.setText("210");
        unuDintiEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unuDintiEmailActionPerformed(evt);
            }
        });

        jLabel63.setText(" * neprelucrata");

        unuDintiNeprelucrat.setText("190");
        unuDintiNeprelucrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unuDintiNeprelucratActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(unuDintiPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unuDintiEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(unuDintiNeprelucrat, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unuDintiPrint)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unuDintiEmail)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unuDintiNeprelucrat)))
        );

        jLabel64.setText("Tomografie 3D ATM                                         ");

        ctAtmPrint.setText("550");
        ctAtmPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctAtmPrintActionPerformed(evt);
            }
        });

        jLabel65.setText(" *email");

        ctAtmEmail.setText("430");
        ctAtmEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctAtmEmailActionPerformed(evt);
            }
        });

        jLabel66.setText(" * neprelucrata");

        ctAtmNeprelucrat.setText("365");
        ctAtmNeprelucrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctAtmNeprelucratActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(ctAtmPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ctAtmEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ctAtmNeprelucrat, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctAtmSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctAtmPrint)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctAtmEmail)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctAtmNeprelucrat)
                    .addComponent(ctAtmSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel67.setText("Tomografie 3D sinusuri fronto-maxilare                ");

        ctSinusuriPrint.setText("450");
        ctSinusuriPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctSinusuriPrintActionPerformed(evt);
            }
        });

        jLabel68.setText(" *email");

        ctSinusuriEmail.setText("350");
        ctSinusuriEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctSinusuriEmailActionPerformed(evt);
            }
        });

        jLabel69.setText(" * neprelucrata");

        ctSinusuriNeprelucrat.setText("250");
        ctSinusuriNeprelucrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctSinusuriNeprelucratActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(ctSinusuriPrint, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctSinusuriEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ctSinusuriNeprelucrat, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctSinusuriPrint)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctSinusuriEmail)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctSinusuriNeprelucrat)))
        );

        jLabel70.setText("Pentru tomografiile 3D se ofera, la cererea medicului, simulare de implant GRATUIT !");
        jLabel70.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        jLabel12.setText("Radiografii extraorale digitale: ");

        jLabel13.setText("Radiografie panoramica  : ");

        opgPrint.setText("110");
        opgPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opgPrintActionPerformed(evt);
            }
        });

        jLabel14.setText("Email: ");

        opgEmail.setText("105");
        opgEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opgEmailActionPerformed(evt);
            }
        });

        jLabel40.setText("*print");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(82, 82, 82)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opgPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(opgEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opgSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(opgPrint)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(opgSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel40))
            .addComponent(opgEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel15.setText("Radiografie bitewing  :  ");

        bitewingOpgPrint.setText("110");
        bitewingOpgPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bitewingOpgPrintActionPerformed(evt);
            }
        });

        jLabel16.setText("Email:");

        bitewingOpgEmail.setText("105");
        bitewingOpgEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bitewingOpgEmailActionPerformed(evt);
            }
        });

        jLabel25.setText("*print");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bitewingOpgPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(bitewingOpgEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opgBitewingSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel16)
                .addComponent(bitewingOpgEmail)
                .addComponent(opgBitewingSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(bitewingOpgPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel17.setText("Radiografie ATM  :");

        atmPrint.setText("110");
        atmPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atmPrintActionPerformed(evt);
            }
        });

        jLabel18.setText("Email: ");

        atmEmail.setText("105");
        atmEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atmEmailActionPerformed(evt);
            }
        });

        jLabel24.setText("*print");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atmPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(atmEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(atmSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atmPrint)
                    .addComponent(jLabel18)
                    .addComponent(atmEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atmSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)))
        );

        jLabel21.setText("Radiografie sinusuri maxilare  : ");

        sinusuriPrint.setText("110");
        sinusuriPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinusuriPrintActionPerformed(evt);
            }
        });

        jLabel22.setText("Email: ");

        sinusuriEmail.setText("105");
        sinusuriEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinusuriEmailActionPerformed(evt);
            }
        });

        jLabel19.setText("Radiografie SAF  :");

        safPrint.setText("110");
        safPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                safPrintActionPerformed(evt);
            }
        });

        jLabel20.setText("Email: ");

        safEmail.setText("105");
        safEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                safEmailActionPerformed(evt);
            }
        });

        jLabel6.setText("*print");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(safPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(safEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(safSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(safSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(safPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(filler2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filler1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(safEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel7.setText("*print");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel21)
                .addGap(58, 58, 58)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sinusuriPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(sinusuriEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spinnerSinusuri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sinusuriEmail)
                        .addComponent(spinnerSinusuri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sinusuriPrint)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mandibularSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hemiarcadaMaxilaraSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hemiarcadaMandSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(unuDintiSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ctSinusuriSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel25Layout.createSequentialGroup()
                                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(maxilarSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(maxilarSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mandibularSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hemiarcadaMaxilaraSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hemiarcadaMandSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unuDintiSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ctSinusuriSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        total.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        total.setText("Total :");

        actualTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        actualTotal.setText("0");

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTotalLayout = new javax.swing.GroupLayout(jPanelTotal);
        jPanelTotal.setLayout(jPanelTotalLayout);
        jPanelTotalLayout.setHorizontalGroup(
            jPanelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTotalLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(total)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actualTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanelTotalLayout.setVerticalGroup(
            jPanelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTotalLayout.createSequentialGroup()
                        .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTotalLayout.createSequentialGroup()
                        .addGroup(jPanelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(actualTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(total))
                        .addGap(12, 12, 12))))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("RADIOGRAFII INTRAORALE DIGITALE:");

        jLabel10.setText("Retroalveolara digitala :  Film radiologic: ");

        buttonRetroPrint.setText("55");
        buttonRetroPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRetroPrintActionPerformed(evt);
            }
        });

        jLabel11.setText("Email: ");

        ButtonRetroEmail.setText("50");
        ButtonRetroEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRetroEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonRetroPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(ButtonRetroEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(SpinnerRetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(ButtonRetroEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SpinnerRetro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel11)
                .addComponent(buttonRetroPrint))
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bitewingPrint.setText("55");
        bitewingPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bitewingPrintActionPerformed(evt);
            }
        });

        jLabel5.setText("Email: ");

        BiteWingEmail.setText("50");
        BiteWingEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BiteWingEmailActionPerformed(evt);
            }
        });

        jLabel4.setText("Bitewing digitala :  Film radiologic: ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(bitewingPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BiteWingEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bitewingSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(bitewingPrint)
                .addComponent(jLabel5)
                .addComponent(jLabel4)
                .addComponent(BiteWingEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bitewingSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel8.setText("Ocluzala digitala  maxilara/ mandibulara:  ");

        jButton7.setText("110");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel9.setText("Email: ");

        jButton8.setText("105");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7))
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel2.setText("Status radiologic bimaxilar :  Film radiologic: ");

        statusPrint.setText("350");
        statusPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusPrintActionPerformed(evt);
            }
        });

        jLabel3.setText("Email: ");

        staticEmail.setText("325");
        staticEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staticEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(statusPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staticEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statusSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(staticEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statusSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statusPrint))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanelIntraoraleLayout = new javax.swing.GroupLayout(jPanelIntraorale);
        jPanelIntraorale.setLayout(jPanelIntraoraleLayout);
        jPanelIntraoraleLayout.setHorizontalGroup(
            jPanelIntraoraleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelIntraoraleLayout.createSequentialGroup()
                .addGroup(jPanelIntraoraleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelIntraoraleLayout.setVerticalGroup(
            jPanelIntraoraleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelIntraoraleLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jLabel23.setText("ORTODONTIE");

        OcluziePrint.setText("110");
        OcluziePrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OcluziePrintActionPerformed(evt);
            }
        });

        jLabel27.setText("Email: ");

        ocluzieEmail.setText("105");
        ocluzieEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocluzieEmailActionPerformed(evt);
            }
        });

        jLabel26.setText("Radiografie panoramica ocluzie  :");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OcluziePrint, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ocluzieEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ocluzieSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(OcluziePrint)
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(ocluzieEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ocluzieSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel28.setText("Teleradiografie laterala sau postero-anterioara  :  ");

        telePrint.setText("110");
        telePrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telePrintActionPerformed(evt);
            }
        });

        jLabel29.setText("Email: ");

        teleEmail.setText("105");
        teleEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telePrint, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teleEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TeleSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(teleEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TeleSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(telePrint))
        );

        jLabel30.setText("Fotografii intraorale de diagnostic ortodontic  :   ");

        fotoIntraPrint.setText("125");
        fotoIntraPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fotoIntraPrintActionPerformed(evt);
            }
        });

        jLabel31.setText("Email: ");

        fotoIntraEmail.setText("105");
        fotoIntraEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fotoIntraEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fotoIntraPrint, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fotoIntraEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(fotoIntraPrint)
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fotoIntraEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel32.setText("Fotografii extraorale de diagnostic ortodontic  :  ");

        prinExtraorale.setText("90");
        prinExtraorale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prinExtraoraleActionPerformed(evt);
            }
        });

        jLabel33.setText("Email: ");

        EmailExtraorale.setText("75");
        EmailExtraorale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailExtraoraleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(prinExtraorale, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailExtraorale, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(prinExtraorale)
                .addComponent(jLabel33)
                .addComponent(EmailExtraorale))
        );

        jLabel34.setText("Scanare intraorala maxilara si mandibulare + inregistrare ocluzie");

        scanareButton.setText("220");
        scanareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanareButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(scanareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scannareSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(scanareButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scannareSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel36.setText("Modele de studiu printate 3D ");

        studiuButton.setText("275");
        studiuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studiuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(studiuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(studiuSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(studiuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(studiuSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel37.setText("Scanare modele gips maxilar si mandibular ");

        scanareGipsButton.setText("200");
        scanareGipsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanareGipsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(scanareGipsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scanareSpinnerGips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(scanareGipsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scanareSpinnerGips, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel38.setText("Serviciul deplasare scanare in cabinetul medicului");

        deplasareButton.setText("150");
        deplasareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deplasareButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(deplasareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deplasareSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(deplasareButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deplasareSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel39.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel39.setText("!Toate serviciile de scanare necesita programare");

        AnalizaPrint.setText("250");
        AnalizaPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalizaPrintActionPerformed(evt);
            }
        });

        jLabel41.setText("Email: ");

        AnalizaEmail.setText("200");
        AnalizaEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalizaEmailActionPerformed(evt);
            }
        });

        jLabel42.setText("Analiza computerizata :");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AnalizaPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AnalizaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(analizaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(AnalizaPrint)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(AnalizaEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(analizaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel41))
        );

        printDosar.setText("350");
        printDosar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printDosarActionPerformed(evt);
            }
        });

        jLabel43.setText("Email: ");

        EmailDosar.setText("200");
        EmailDosar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailDosarActionPerformed(evt);
            }
        });

        jLabel44.setText("Dosar complet (opg, tele, foto)");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printDosar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailDosar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spinnerDosar)
                .addGap(33, 33, 33))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(printDosar)
                .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(EmailDosar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(spinnerDosar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanelOrotodontieLayout = new javax.swing.GroupLayout(jPanelOrotodontie);
        jPanelOrotodontie.setLayout(jPanelOrotodontieLayout);
        jPanelOrotodontieLayout.setHorizontalGroup(
            jPanelOrotodontieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrotodontieLayout.createSequentialGroup()
                .addGroup(jPanelOrotodontieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelOrotodontieLayout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinnerExtraorale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelOrotodontieLayout.createSequentialGroup()
                .addGroup(jPanelOrotodontieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOrotodontieLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelOrotodontieLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelOrotodontieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelOrotodontieLayout.createSequentialGroup()
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fotoIntraSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelOrotodontieLayout.setVerticalGroup(
            jPanelOrotodontieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrotodontieLayout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanelOrotodontieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelOrotodontieLayout.createSequentialGroup()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fotoIntraSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanelOrotodontieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerExtraorale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelSiglaLayout = new javax.swing.GroupLayout(jPanelSigla);
        jPanelSigla.setLayout(jPanelSiglaLayout);
        jPanelSiglaLayout.setHorizontalGroup(
            jPanelSiglaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSiglaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSiglaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelIntraorale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelOrotodontie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSiglaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269))
        );
        jPanelSiglaLayout.setVerticalGroup(
            jPanelSiglaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSiglaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelIntraorale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanelOrotodontie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(295, 295, 295))
            .addGroup(jPanelSiglaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanelSigla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelSigla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailDosarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailDosarActionPerformed
        twoButtonPanelFunctionality(13,spinnerDosar,EmailDosar, printDosar);
    }//GEN-LAST:event_EmailDosarActionPerformed

    private void printDosarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printDosarActionPerformed
        twoButtonPanelFunctionality(13,spinnerDosar,printDosar,EmailDosar);
    }//GEN-LAST:event_printDosarActionPerformed

    private void AnalizaEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalizaEmailActionPerformed
        twoButtonPanelFunctionality(12,analizaSpinner,AnalizaEmail,AnalizaPrint);
    }//GEN-LAST:event_AnalizaEmailActionPerformed

    private void AnalizaPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalizaPrintActionPerformed
         twoButtonPanelFunctionality(12,analizaSpinner,AnalizaPrint,AnalizaEmail);
    }//GEN-LAST:event_AnalizaPrintActionPerformed

    private void deplasareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deplasareButtonActionPerformed
        OneButtonPanelFunctionality(11,deplasareSpinner,deplasareButton);
    }//GEN-LAST:event_deplasareButtonActionPerformed

    private void scanareGipsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanareGipsButtonActionPerformed
       OneButtonPanelFunctionality(9,scanareSpinnerGips,scanareGipsButton);
    }//GEN-LAST:event_scanareGipsButtonActionPerformed

    private void studiuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studiuButtonActionPerformed
        OneButtonPanelFunctionality(10,studiuSpinner,studiuButton);
    }//GEN-LAST:event_studiuButtonActionPerformed

    private void scanareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanareButtonActionPerformed
       OneButtonPanelFunctionality(8,scannareSpinner,scanareButton);
    }//GEN-LAST:event_scanareButtonActionPerformed

    private void EmailExtraoraleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailExtraoraleActionPerformed
        twoButtonPanelFunctionality(7,spinnerExtraorale,EmailExtraorale,prinExtraorale);
    }//GEN-LAST:event_EmailExtraoraleActionPerformed

    private void prinExtraoraleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prinExtraoraleActionPerformed
        twoButtonPanelFunctionality(7,spinnerExtraorale,prinExtraorale,EmailExtraorale);
    }//GEN-LAST:event_prinExtraoraleActionPerformed

    private void fotoIntraEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fotoIntraEmailActionPerformed
        twoButtonPanelFunctionality(6,fotoIntraSpinner,fotoIntraEmail,fotoIntraPrint);
    }//GEN-LAST:event_fotoIntraEmailActionPerformed

    private void fotoIntraPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fotoIntraPrintActionPerformed
        twoButtonPanelFunctionality(6,fotoIntraSpinner,fotoIntraPrint,fotoIntraEmail);
    }//GEN-LAST:event_fotoIntraPrintActionPerformed

    private void teleEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleEmailActionPerformed
        twoButtonPanelFunctionality(5,TeleSpinner,teleEmail,telePrint);
    }//GEN-LAST:event_teleEmailActionPerformed

    private void telePrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telePrintActionPerformed
        twoButtonPanelFunctionality(5,TeleSpinner,telePrint,teleEmail);
    }//GEN-LAST:event_telePrintActionPerformed

    private void ocluzieEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocluzieEmailActionPerformed
         twoButtonPanelFunctionality(4,ocluzieSpinner, ocluzieEmail,OcluziePrint);
    }//GEN-LAST:event_ocluzieEmailActionPerformed

    private void OcluziePrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OcluziePrintActionPerformed
        twoButtonPanelFunctionality(4,ocluzieSpinner, OcluziePrint,ocluzieEmail);
    }//GEN-LAST:event_OcluziePrintActionPerformed

    private void staticEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staticEmailActionPerformed
         twoButtonPanelFunctionality(3,statusSpinner,staticEmail, statusPrint);
    }//GEN-LAST:event_staticEmailActionPerformed

    private void statusPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusPrintActionPerformed
        twoButtonPanelFunctionality(3,statusSpinner,statusPrint,staticEmail);
    }//GEN-LAST:event_statusPrintActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         twoButtonPanelFunctionality(2,jSpinner4,jButton8, jButton7);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        twoButtonPanelFunctionality(2,jSpinner4,jButton7,jButton8);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void BiteWingEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BiteWingEmailActionPerformed
       twoButtonPanelFunctionality(1,bitewingSpinner, BiteWingEmail, bitewingPrint );
    }//GEN-LAST:event_BiteWingEmailActionPerformed

    private void bitewingPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bitewingPrintActionPerformed
       twoButtonPanelFunctionality(1,bitewingSpinner, bitewingPrint, BiteWingEmail );
    }//GEN-LAST:event_bitewingPrintActionPerformed

    private void ButtonRetroEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRetroEmailActionPerformed
        twoButtonPanelFunctionality(0,SpinnerRetro, ButtonRetroEmail, buttonRetroPrint );
    }//GEN-LAST:event_ButtonRetroEmailActionPerformed

    private void buttonRetroPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRetroPrintActionPerformed
        twoButtonPanelFunctionality(0,SpinnerRetro, buttonRetroPrint, ButtonRetroEmail );
    }//GEN-LAST:event_buttonRetroPrintActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        totalSum = 0;
        changeTotalLabel(totalSum);
        makeArrayButtonsZeros();
        resetPanelWithProcedure(buttonRetroPrint,ButtonRetroEmail,SpinnerRetro);
        resetPanelWithProcedure(bitewingPrint,BiteWingEmail,bitewingSpinner);
        resetPanelWithProcedure(jButton7, jButton8, jSpinner4);
        resetPanelWithProcedure(OcluziePrint,ocluzieEmail,ocluzieSpinner);
        resetPanelWithProcedure(teleEmail,telePrint,TeleSpinner);
        resetPanelWithProcedure(fotoIntraEmail,fotoIntraPrint,fotoIntraSpinner);
        resetPanelWithProcedure(EmailExtraorale,prinExtraorale,spinnerExtraorale);
        resetPanelWithProcedure(statusPrint,staticEmail,statusSpinner);
        resetOnlyOneButton(scanareButton,scannareSpinner);
        resetOnlyOneButton(scanareGipsButton,scanareSpinnerGips);
        resetOnlyOneButton(studiuButton,studiuSpinner);
        resetOnlyOneButton(deplasareButton,deplasareSpinner);
        resetPanelWithProcedure(AnalizaPrint,AnalizaEmail,analizaSpinner);
        resetPanelWithProcedure(EmailDosar,printDosar,spinnerDosar);
        resetPanelWithProcedure(opgEmail,opgPrint,opgSpinner);
        resetPanelWithProcedure(bitewingOpgEmail,bitewingOpgPrint,opgBitewingSpinner);
        resetPanelWithProcedure(atmEmail,atmPrint,atmSpinner);
        resetPanelWithProcedure(sinusuriPrint,sinusuriEmail,spinnerSinusuri);
        resetPanelWithProcedure(safPrint,safEmail,safSpinner);
        resetWithThreeButtons(maxMandPrint,maxMandEmail,maxMandNeprelucrat,maxMandSpinner);
        resetWithThreeButtons(maxilarNeprelucrat,maxilarEmail,maxilarPrint,maxilarSpinner);
        resetWithThreeButtons(mandibularNeprelucrat,mandibularEmail,mandibularPrint,mandibularSpinner);
        resetWithThreeButtons(hemiarcadaMaxilaraNeprelucrat,hemiarcadaMaxilaraEmail,hemiarcadaMaxilaraPrint,hemiarcadaMaxilaraSpinner);
        resetWithThreeButtons(hemiarcadaMandNeprelucrat,hemiarcadaMandEmail,hemiarcadaMandPrint,hemiarcadaMandSpinner);
        resetWithThreeButtons(unuDintiNeprelucrat,unuDintiEmail,unuDintiPrint,unuDintiSpinner);
        resetWithThreeButtons(ctAtmNeprelucrat,ctAtmEmail,ctAtmPrint,ctAtmSpinner);
        resetWithThreeButtons(ctSinusuriNeprelucrat,ctSinusuriEmail,ctSinusuriPrint,ctSinusuriSpinner);
        

    }//GEN-LAST:event_resetActionPerformed

    private void safEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_safEmailActionPerformed
        twoButtonPanelFunctionality(18,safSpinner,safEmail,safPrint);
    }//GEN-LAST:event_safEmailActionPerformed

    private void safPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_safPrintActionPerformed
        twoButtonPanelFunctionality(18,safSpinner,safPrint,safEmail);
    }//GEN-LAST:event_safPrintActionPerformed

    private void sinusuriEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinusuriEmailActionPerformed
        twoButtonPanelFunctionality(17,spinnerSinusuri,sinusuriEmail,sinusuriPrint);
    }//GEN-LAST:event_sinusuriEmailActionPerformed

    private void sinusuriPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinusuriPrintActionPerformed
        twoButtonPanelFunctionality(17,spinnerSinusuri,sinusuriPrint,sinusuriEmail);
    }//GEN-LAST:event_sinusuriPrintActionPerformed

    private void atmEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atmEmailActionPerformed
        twoButtonPanelFunctionality(16,atmSpinner,atmEmail,atmPrint);
    }//GEN-LAST:event_atmEmailActionPerformed

    private void atmPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atmPrintActionPerformed
       twoButtonPanelFunctionality(16,atmSpinner,atmPrint,atmEmail);
    }//GEN-LAST:event_atmPrintActionPerformed

    private void bitewingOpgEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bitewingOpgEmailActionPerformed
        twoButtonPanelFunctionality(15,opgBitewingSpinner,bitewingOpgEmail,bitewingOpgPrint);
    }//GEN-LAST:event_bitewingOpgEmailActionPerformed

    private void bitewingOpgPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bitewingOpgPrintActionPerformed
        twoButtonPanelFunctionality(15,opgBitewingSpinner,bitewingOpgPrint,bitewingOpgEmail);
    }//GEN-LAST:event_bitewingOpgPrintActionPerformed

    private void opgEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opgEmailActionPerformed
          twoButtonPanelFunctionality(14,opgSpinner,opgEmail,opgPrint);
    }//GEN-LAST:event_opgEmailActionPerformed

    private void opgPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opgPrintActionPerformed
        twoButtonPanelFunctionality(14,opgSpinner,opgPrint,opgEmail);
    }//GEN-LAST:event_opgPrintActionPerformed

    private void ctSinusuriNeprelucratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctSinusuriNeprelucratActionPerformed
         threeButtonFunctionality(26,ctSinusuriSpinner,ctSinusuriNeprelucrat,ctSinusuriEmail,ctSinusuriPrint);
    }//GEN-LAST:event_ctSinusuriNeprelucratActionPerformed

    private void ctSinusuriEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctSinusuriEmailActionPerformed
         threeButtonFunctionality(26,ctSinusuriSpinner,ctSinusuriEmail,ctSinusuriPrint,ctSinusuriNeprelucrat);
    }//GEN-LAST:event_ctSinusuriEmailActionPerformed

    private void ctSinusuriPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctSinusuriPrintActionPerformed
        threeButtonFunctionality(26,ctSinusuriSpinner,ctSinusuriPrint,ctSinusuriEmail,ctSinusuriNeprelucrat);
    }//GEN-LAST:event_ctSinusuriPrintActionPerformed

    private void ctAtmNeprelucratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctAtmNeprelucratActionPerformed
        threeButtonFunctionality(25,ctAtmSpinner,ctAtmNeprelucrat,ctAtmEmail,ctAtmPrint);
    }//GEN-LAST:event_ctAtmNeprelucratActionPerformed

    private void ctAtmEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctAtmEmailActionPerformed
        threeButtonFunctionality(25,ctAtmSpinner,ctAtmEmail,ctAtmPrint,ctAtmNeprelucrat);
    }//GEN-LAST:event_ctAtmEmailActionPerformed

    private void unuDintiNeprelucratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unuDintiNeprelucratActionPerformed
        threeButtonFunctionality(24,unuDintiSpinner,unuDintiNeprelucrat,unuDintiEmail,unuDintiPrint);
    }//GEN-LAST:event_unuDintiNeprelucratActionPerformed

    private void unuDintiEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unuDintiEmailActionPerformed
         threeButtonFunctionality(24,unuDintiSpinner,unuDintiEmail,unuDintiPrint,unuDintiNeprelucrat);
    }//GEN-LAST:event_unuDintiEmailActionPerformed

    private void hemiarcadaMandNeprelucratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hemiarcadaMandNeprelucratActionPerformed
        threeButtonFunctionality(23,hemiarcadaMandSpinner,hemiarcadaMandNeprelucrat,hemiarcadaMandEmail,hemiarcadaMandPrint);
    }//GEN-LAST:event_hemiarcadaMandNeprelucratActionPerformed

    private void hemiarcadaMandEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hemiarcadaMandEmailActionPerformed
        threeButtonFunctionality(23,hemiarcadaMandSpinner,hemiarcadaMandEmail,hemiarcadaMandPrint,hemiarcadaMandNeprelucrat);
    }//GEN-LAST:event_hemiarcadaMandEmailActionPerformed

    private void hemiarcadaMandPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hemiarcadaMandPrintActionPerformed
        threeButtonFunctionality(23,hemiarcadaMandSpinner,hemiarcadaMandPrint,hemiarcadaMandEmail,hemiarcadaMandNeprelucrat);
    }//GEN-LAST:event_hemiarcadaMandPrintActionPerformed

    private void hemiarcadaMaxilaraNeprelucratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hemiarcadaMaxilaraNeprelucratActionPerformed
        threeButtonFunctionality(22,hemiarcadaMaxilaraSpinner,hemiarcadaMaxilaraNeprelucrat,hemiarcadaMaxilaraPrint,hemiarcadaMaxilaraEmail);
    }//GEN-LAST:event_hemiarcadaMaxilaraNeprelucratActionPerformed

    private void hemiarcadaMaxilaraEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hemiarcadaMaxilaraEmailActionPerformed
         threeButtonFunctionality(22,hemiarcadaMaxilaraSpinner,hemiarcadaMaxilaraEmail,hemiarcadaMaxilaraPrint,hemiarcadaMaxilaraNeprelucrat);
    }//GEN-LAST:event_hemiarcadaMaxilaraEmailActionPerformed

    private void mandibularNeprelucratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mandibularNeprelucratActionPerformed
          threeButtonFunctionality(21,mandibularSpinner,mandibularNeprelucrat,mandibularPrint,mandibularEmail);
    }//GEN-LAST:event_mandibularNeprelucratActionPerformed

    private void mandibularEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mandibularEmailActionPerformed
          threeButtonFunctionality(21,mandibularSpinner,mandibularEmail,mandibularPrint,mandibularNeprelucrat);
    }//GEN-LAST:event_mandibularEmailActionPerformed

    private void mandibularPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mandibularPrintActionPerformed
        threeButtonFunctionality(21,mandibularSpinner,mandibularPrint,mandibularEmail,mandibularNeprelucrat);
    }//GEN-LAST:event_mandibularPrintActionPerformed

    private void maxilarNeprelucratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxilarNeprelucratActionPerformed
         threeButtonFunctionality(20,maxilarSpinner,maxilarNeprelucrat,maxilarEmail,maxilarPrint);
    }//GEN-LAST:event_maxilarNeprelucratActionPerformed

    private void maxilarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxilarEmailActionPerformed
         threeButtonFunctionality(20,maxilarSpinner,maxilarEmail,maxilarNeprelucrat,maxilarPrint);
    }//GEN-LAST:event_maxilarEmailActionPerformed

    private void maxilarPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxilarPrintActionPerformed
        threeButtonFunctionality(20,maxilarSpinner,maxilarPrint,maxilarNeprelucrat,maxilarEmail);
    }//GEN-LAST:event_maxilarPrintActionPerformed

    private void maxMandNeprelucratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxMandNeprelucratActionPerformed
        threeButtonFunctionality(19,maxMandSpinner,maxMandNeprelucrat,maxMandPrint,maxMandEmail);
    }//GEN-LAST:event_maxMandNeprelucratActionPerformed

    private void maxMandEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxMandEmailActionPerformed
        threeButtonFunctionality(19,maxMandSpinner,maxMandEmail,maxMandPrint,maxMandNeprelucrat);
    }//GEN-LAST:event_maxMandEmailActionPerformed

    private void maxMandPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxMandPrintActionPerformed
        threeButtonFunctionality(19,maxMandSpinner,maxMandPrint,maxMandEmail,maxMandNeprelucrat);

    }//GEN-LAST:event_maxMandPrintActionPerformed

    private void hemiarcadaMaxilaraPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hemiarcadaMaxilaraPrintActionPerformed
        threeButtonFunctionality(22,hemiarcadaMaxilaraSpinner,hemiarcadaMaxilaraPrint,hemiarcadaMaxilaraEmail,hemiarcadaMaxilaraNeprelucrat);
    }//GEN-LAST:event_hemiarcadaMaxilaraPrintActionPerformed

    private void unuDintiPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unuDintiPrintActionPerformed
       threeButtonFunctionality(24,unuDintiSpinner,unuDintiPrint,unuDintiEmail,unuDintiNeprelucrat);
    }//GEN-LAST:event_unuDintiPrintActionPerformed

    private void ctAtmPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctAtmPrintActionPerformed
       threeButtonFunctionality(25,ctAtmSpinner,ctAtmPrint,ctAtmEmail,ctAtmNeprelucrat);
    }//GEN-LAST:event_ctAtmPrintActionPerformed
        
   

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    private int[] buttonArray = new int[50];
    private Color defaultButtonColor;
    private int totalSum = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnalizaEmail;
    private javax.swing.JButton AnalizaPrint;
    private javax.swing.JButton BiteWingEmail;
    private javax.swing.JButton ButtonRetroEmail;
    private javax.swing.JButton EmailDosar;
    private javax.swing.JButton EmailExtraorale;
    private javax.swing.JButton OcluziePrint;
    private javax.swing.JSpinner SpinnerRetro;
    private javax.swing.JSpinner TeleSpinner;
    private javax.swing.JLabel actualTotal;
    private javax.swing.JSpinner analizaSpinner;
    private javax.swing.JButton atmEmail;
    private javax.swing.JButton atmPrint;
    private javax.swing.JSpinner atmSpinner;
    private javax.swing.JButton bitewingOpgEmail;
    private javax.swing.JButton bitewingOpgPrint;
    private javax.swing.JButton bitewingPrint;
    private javax.swing.JSpinner bitewingSpinner;
    private javax.swing.JButton buttonRetroPrint;
    private javax.swing.JButton ctAtmEmail;
    private javax.swing.JButton ctAtmNeprelucrat;
    private javax.swing.JButton ctAtmPrint;
    private javax.swing.JSpinner ctAtmSpinner;
    private javax.swing.JButton ctSinusuriEmail;
    private javax.swing.JButton ctSinusuriNeprelucrat;
    private javax.swing.JButton ctSinusuriPrint;
    private javax.swing.JSpinner ctSinusuriSpinner;
    private javax.swing.JButton deplasareButton;
    private javax.swing.JSpinner deplasareSpinner;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton fotoIntraEmail;
    private javax.swing.JButton fotoIntraPrint;
    private javax.swing.JSpinner fotoIntraSpinner;
    private javax.swing.JButton hemiarcadaMandEmail;
    private javax.swing.JButton hemiarcadaMandNeprelucrat;
    private javax.swing.JButton hemiarcadaMandPrint;
    private javax.swing.JSpinner hemiarcadaMandSpinner;
    private javax.swing.JButton hemiarcadaMaxilaraEmail;
    private javax.swing.JButton hemiarcadaMaxilaraNeprelucrat;
    private javax.swing.JButton hemiarcadaMaxilaraPrint;
    private javax.swing.JSpinner hemiarcadaMaxilaraSpinner;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelIntraorale;
    private javax.swing.JPanel jPanelOrotodontie;
    private javax.swing.JPanel jPanelSigla;
    private javax.swing.JPanel jPanelTotal;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JButton mandibularEmail;
    private javax.swing.JButton mandibularNeprelucrat;
    private javax.swing.JButton mandibularPrint;
    private javax.swing.JSpinner mandibularSpinner;
    private javax.swing.JButton maxMandEmail;
    private javax.swing.JButton maxMandNeprelucrat;
    private javax.swing.JButton maxMandPrint;
    private javax.swing.JSpinner maxMandSpinner;
    private javax.swing.JButton maxilarEmail;
    private javax.swing.JButton maxilarNeprelucrat;
    private javax.swing.JButton maxilarPrint;
    private javax.swing.JSpinner maxilarSpinner;
    private javax.swing.JButton ocluzieEmail;
    private javax.swing.JSpinner ocluzieSpinner;
    private javax.swing.JSpinner opgBitewingSpinner;
    private javax.swing.JButton opgEmail;
    private javax.swing.JButton opgPrint;
    private javax.swing.JSpinner opgSpinner;
    private javax.swing.JButton prinExtraorale;
    private javax.swing.JButton printDosar;
    private javax.swing.JButton reset;
    private javax.swing.JButton safEmail;
    private javax.swing.JButton safPrint;
    private javax.swing.JSpinner safSpinner;
    private javax.swing.JButton scanareButton;
    private javax.swing.JButton scanareGipsButton;
    private javax.swing.JSpinner scanareSpinnerGips;
    private javax.swing.JSpinner scannareSpinner;
    private javax.swing.JButton sinusuriEmail;
    private javax.swing.JButton sinusuriPrint;
    private javax.swing.JSpinner spinnerDosar;
    private javax.swing.JSpinner spinnerExtraorale;
    private javax.swing.JSpinner spinnerSinusuri;
    private javax.swing.JButton staticEmail;
    private javax.swing.JButton statusPrint;
    private javax.swing.JSpinner statusSpinner;
    private javax.swing.JButton studiuButton;
    private javax.swing.JSpinner studiuSpinner;
    private javax.swing.JButton teleEmail;
    private javax.swing.JButton telePrint;
    private javax.swing.JLabel total;
    private javax.swing.JButton unuDintiEmail;
    private javax.swing.JButton unuDintiNeprelucrat;
    private javax.swing.JButton unuDintiPrint;
    private javax.swing.JSpinner unuDintiSpinner;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
