/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Views;

/**
 *
 * @author ELSO
 */
public class UpdateDocumentsApp extends javax.swing.JDialog {

    /**
     * Creates new form AddDocumentApp
     * 
     * 
     */
    public UpdateDocumentsApp(){
        
    }
    
    public UpdateDocumentsApp(List_Documents UpdateDocumentsApp, boolean modal) {
        super(UpdateDocumentsApp, modal);
        initComponents();
        this.setSize(1280, 680);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("MÓDULO DE REGISTROS DE DOCUMENTOS DE TRABAJOS");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel_Body = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Central_Label = new javax.swing.JLabel();
        N_Equipo_Label = new javax.swing.JLabel();
        Tipo_Trabajo_Label = new javax.swing.JLabel();
        Descripcion_Label = new javax.swing.JLabel();
        Fecha_Vigencia_Label = new javax.swing.JLabel();
        Fecha_Caducacion_Label = new javax.swing.JLabel();
        JComboCentral = new javax.swing.JComboBox<>();
        JComboEquipo = new javax.swing.JComboBox<>();
        JComboTipo_Text = new javax.swing.JComboBox<>();
        JCombo_Descripcion_Text = new javax.swing.JComboBox<>();
        Fecha_Vigencia_Text = new com.toedter.calendar.JDateChooser();
        Fecha_Caduca_Text = new com.toedter.calendar.JDateChooser();
        N_Documento_Label = new javax.swing.JLabel();
        Numero_Gen = new rojeru_san.RSMTextFull();
        Central_Label8 = new javax.swing.JLabel();
        JComboEstado = new javax.swing.JComboBox<>();
        JPanelActualizar = new javax.swing.JPanel();
        Titulo1 = new javax.swing.JLabel();
        Central_Label1 = new javax.swing.JLabel();
        Central_Label2 = new javax.swing.JLabel();
        Central_Label5 = new javax.swing.JLabel();
        Central_Label6 = new javax.swing.JLabel();
        Central_Label7 = new javax.swing.JLabel();
        Central_Label3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Central_Label4 = new javax.swing.JLabel();
        Btn_Actualizar = new rojeru_san.RSButton();
        Vigencia = new rojeru_san.RSMTextFull();
        Inicio_Manten = new rojeru_san.RSMTextFull();
        Final_Manten = new rojeru_san.RSMTextFull();
        Vacio = new rojeru_san.RSMTextFull();
        Carga = new rojeru_san.RSMTextFull();
        Cancela = new rojeru_san.RSMTextFull();
        Fecha_Ejecucion = new com.toedter.calendar.JDateChooser();
        Banner_Header_Label = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanel_Body.setBackground(new java.awt.Color(255, 255, 255));

        Titulo.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(51, 51, 51));
        Titulo.setText("ACTUALIZAR DOCUMENTO TRABAJO ");

        Central_Label.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        Central_Label.setForeground(new java.awt.Color(102, 102, 102));
        Central_Label.setText("CENTRAL:");

        N_Equipo_Label.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        N_Equipo_Label.setForeground(new java.awt.Color(102, 102, 102));
        N_Equipo_Label.setText("N° EQUIPO:");

        Tipo_Trabajo_Label.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        Tipo_Trabajo_Label.setForeground(new java.awt.Color(102, 102, 102));
        Tipo_Trabajo_Label.setText("TIPO DE TRABAJO:");

        Descripcion_Label.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        Descripcion_Label.setForeground(new java.awt.Color(102, 102, 102));
        Descripcion_Label.setText("DESCRIPCIÓN:");

        Fecha_Vigencia_Label.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        Fecha_Vigencia_Label.setForeground(new java.awt.Color(102, 102, 102));
        Fecha_Vigencia_Label.setText("FECHA DE VIGENCIA:");

        Fecha_Caducacion_Label.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        Fecha_Caducacion_Label.setForeground(new java.awt.Color(102, 102, 102));
        Fecha_Caducacion_Label.setText("FECHA CADUCACIÓN:");

        JComboCentral.setBackground(new java.awt.Color(255, 255, 255));
        JComboCentral.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        JComboCentral.setForeground(new java.awt.Color(51, 51, 51));
        JComboCentral.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA UNA CENTRAL" }));

        JComboEquipo.setBackground(new java.awt.Color(255, 255, 255));
        JComboEquipo.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        JComboEquipo.setForeground(new java.awt.Color(51, 51, 51));
        JComboEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA UN EQUIPO" }));

        JComboTipo_Text.setBackground(new java.awt.Color(255, 255, 255));
        JComboTipo_Text.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        JComboTipo_Text.setForeground(new java.awt.Color(51, 51, 51));
        JComboTipo_Text.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA UNA CATEGORÍA" }));

        JCombo_Descripcion_Text.setBackground(new java.awt.Color(255, 255, 255));
        JCombo_Descripcion_Text.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        JCombo_Descripcion_Text.setForeground(new java.awt.Color(51, 51, 51));
        JCombo_Descripcion_Text.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA UNA CATEGORÍA", "CAMBIO DE ACEITE, FILTROS Y REFRIGERANTE", "CAMBIO DE REFRIGERANTE Y LIMPIEZA RADIADOR", "CAMBIO DE FILTROS RACOR, COMBUSTIBLE", "CAMBIO DE FILTRO DE AIRE", "CAMBIO DE CORREAS VENTILADOR RADIADOR", "CAMBIO DE BATERÍAS", "CAMBIO DE CORREAS ALTERNADOR", "CAMBIO DE BORNES DE BATERÍAS", "MEDICIÓN VOLTAJE DE BATERÍAS", "CAMBIO DE BISAGRAS PUERTAS CONTAINER", "CAMBIO LUMINARIAS CONTAINER", " " }));

        Fecha_Vigencia_Text.setBackground(new java.awt.Color(255, 255, 255));
        Fecha_Vigencia_Text.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Fecha_Vigencia_Text.setForeground(new java.awt.Color(51, 51, 51));
        Fecha_Vigencia_Text.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N

        Fecha_Caduca_Text.setBackground(new java.awt.Color(255, 255, 255));
        Fecha_Caduca_Text.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Fecha_Caduca_Text.setForeground(new java.awt.Color(51, 51, 51));
        Fecha_Caduca_Text.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N

        N_Documento_Label.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        N_Documento_Label.setForeground(new java.awt.Color(102, 102, 102));
        N_Documento_Label.setText("N° DOCUMENTO:");

        Numero_Gen.setBackground(new java.awt.Color(255, 255, 255));
        Numero_Gen.setForeground(new java.awt.Color(51, 51, 51));
        Numero_Gen.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        Numero_Gen.setPlaceholder("Ingresa N° del Documento...");

        Central_Label8.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        Central_Label8.setForeground(new java.awt.Color(102, 102, 102));
        Central_Label8.setText("ESTADO DEL DOCUMENTO:");

        JComboEstado.setBackground(new java.awt.Color(255, 255, 255));
        JComboEstado.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 14)); // NOI18N
        JComboEstado.setForeground(new java.awt.Color(51, 51, 51));
        JComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA UN ESTADO", "EN TRAMITACIÓN", "APROBADO", "TERMINADO", "PAUSADO", "CANCELADO" }));

        javax.swing.GroupLayout JPanel_BodyLayout = new javax.swing.GroupLayout(JPanel_Body);
        JPanel_Body.setLayout(JPanel_BodyLayout);
        JPanel_BodyLayout.setHorizontalGroup(
            JPanel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_BodyLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(JPanel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_BodyLayout.createSequentialGroup()
                        .addGroup(JPanel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Central_Label)
                            .addComponent(JComboCentral, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(JPanel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JComboTipo_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tipo_Trabajo_Label)))
                    .addGroup(JPanel_BodyLayout.createSequentialGroup()
                        .addGroup(JPanel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JComboEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N_Equipo_Label)
                            .addComponent(Titulo))
                        .addGap(50, 50, 50)
                        .addGroup(JPanel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Descripcion_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCombo_Descripcion_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(65, 65, 65)
                .addGroup(JPanel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_BodyLayout.createSequentialGroup()
                        .addGroup(JPanel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Numero_Gen, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(N_Documento_Label)
                            .addComponent(JComboEstado, 0, 190, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addGroup(JPanel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fecha_Caducacion_Label)
                            .addComponent(Fecha_Vigencia_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fecha_Caduca_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fecha_Vigencia_Label)))
                    .addComponent(Central_Label8))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        JPanel_BodyLayout.setVerticalGroup(
            JPanel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_BodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(26, 26, 26)
                .addGroup(JPanel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPanel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Central_Label)
                            .addComponent(Tipo_Trabajo_Label, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(N_Documento_Label, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(Fecha_Vigencia_Label, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPanel_BodyLayout.createSequentialGroup()
                        .addComponent(Numero_Gen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Central_Label8)
                            .addComponent(Fecha_Caducacion_Label)))
                    .addGroup(JPanel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanel_BodyLayout.createSequentialGroup()
                            .addGroup(JPanel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JComboTipo_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JComboCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(JPanel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(N_Equipo_Label)
                                .addComponent(Descripcion_Label)))
                        .addGroup(JPanel_BodyLayout.createSequentialGroup()
                            .addComponent(Fecha_Vigencia_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28))))
                .addGroup(JPanel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JComboEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JCombo_Descripcion_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanel_BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Fecha_Caduca_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(JPanel_Body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1280, -1));

        JPanelActualizar.setBackground(new java.awt.Color(255, 255, 255));

        Titulo1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(51, 51, 51));
        Titulo1.setText("ACTUALIZACIÓN DE DOCUMENTOS DE TRABAJOS");

        Central_Label1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        Central_Label1.setForeground(new java.awt.Color(102, 102, 102));
        Central_Label1.setText("VIGENCIA:");

        Central_Label2.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        Central_Label2.setForeground(new java.awt.Color(102, 102, 102));
        Central_Label2.setText("INICIO MANTENIMIENTO:");

        Central_Label5.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        Central_Label5.setForeground(new java.awt.Color(102, 102, 102));
        Central_Label5.setText("TERMINO MANTENIMIENTO:");

        Central_Label6.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        Central_Label6.setForeground(new java.awt.Color(102, 102, 102));
        Central_Label6.setText("CANCELACIÓN:");

        Central_Label7.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        Central_Label7.setForeground(new java.awt.Color(102, 102, 102));
        Central_Label7.setText("FECHA DE EJECUCIÓN:");

        Central_Label3.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        Central_Label3.setForeground(new java.awt.Color(102, 102, 102));
        Central_Label3.setText("PRUEBAS EN VACIO:");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("PANEL DE CONTROL ");

        Central_Label4.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 14)); // NOI18N
        Central_Label4.setForeground(new java.awt.Color(102, 102, 102));
        Central_Label4.setText("PRUEBAS CARGA:");

        Btn_Actualizar.setBackground(new java.awt.Color(255, 153, 0));
        Btn_Actualizar.setText("ACTUALIZAR");
        Btn_Actualizar.setColorHover(new java.awt.Color(204, 102, 0));

        Vigencia.setBackground(new java.awt.Color(255, 255, 255));
        Vigencia.setForeground(new java.awt.Color(51, 51, 51));
        Vigencia.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        Vigencia.setPlaceholder("00:00:00");

        Inicio_Manten.setBackground(new java.awt.Color(255, 255, 255));
        Inicio_Manten.setForeground(new java.awt.Color(51, 51, 51));
        Inicio_Manten.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        Inicio_Manten.setPlaceholder("00:00:00");

        Final_Manten.setBackground(new java.awt.Color(255, 255, 255));
        Final_Manten.setForeground(new java.awt.Color(51, 51, 51));
        Final_Manten.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        Final_Manten.setPlaceholder("00:00:00");

        Vacio.setBackground(new java.awt.Color(255, 255, 255));
        Vacio.setForeground(new java.awt.Color(51, 51, 51));
        Vacio.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        Vacio.setPlaceholder("00:00:00");

        Carga.setBackground(new java.awt.Color(255, 255, 255));
        Carga.setForeground(new java.awt.Color(51, 51, 51));
        Carga.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        Carga.setPlaceholder("00:00:00");

        Cancela.setBackground(new java.awt.Color(255, 255, 255));
        Cancela.setForeground(new java.awt.Color(51, 51, 51));
        Cancela.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        Cancela.setPlaceholder("00:00:00");

        Fecha_Ejecucion.setBackground(new java.awt.Color(255, 255, 255));
        Fecha_Ejecucion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Fecha_Ejecucion.setForeground(new java.awt.Color(51, 51, 51));
        Fecha_Ejecucion.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N

        javax.swing.GroupLayout JPanelActualizarLayout = new javax.swing.GroupLayout(JPanelActualizar);
        JPanelActualizar.setLayout(JPanelActualizarLayout);
        JPanelActualizarLayout.setHorizontalGroup(
            JPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelActualizarLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(JPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo1)
                    .addComponent(Vigencia, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPanelActualizarLayout.createSequentialGroup()
                        .addComponent(Central_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(JPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Central_Label2)
                            .addComponent(Inicio_Manten, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Central_Label5)
                            .addComponent(Final_Manten, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(JPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Central_Label3)
                            .addComponent(Central_Label4)
                            .addComponent(Vacio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Carga, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(JPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Central_Label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Cancela, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                            .addComponent(Central_Label7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fecha_Ejecucion, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addGroup(JPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );
        JPanelActualizarLayout.setVerticalGroup(
            JPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelActualizarLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(JPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Fecha_Ejecucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPanelActualizarLayout.createSequentialGroup()
                        .addGroup(JPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Titulo1)
                            .addComponent(jLabel2))
                        .addGap(24, 24, 24)
                        .addGroup(JPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Central_Label1)
                            .addComponent(Central_Label6)
                            .addComponent(Central_Label2)
                            .addComponent(Central_Label3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Vigencia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Inicio_Manten, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Vacio, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cancela, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(JPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Central_Label5)
                            .addComponent(Central_Label4)
                            .addComponent(Central_Label7))
                        .addGap(18, 18, 18)
                        .addGroup(JPanelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Final_Manten, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Carga, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(JPanelActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 337, 1280, 260));

        Banner_Header_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/BG-PT.png"))); // NOI18N
        Banner_Header_Label.setText("Banner_Header");
        getContentPane().add(Banner_Header_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 180));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 1280, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(UpdateDocumentsApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDocumentsApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDocumentsApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDocumentsApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateDocumentsApp dialog = new UpdateDocumentsApp((List_Documents) new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Banner_Header_Label;
    private rojeru_san.RSButton Btn_Actualizar;
    private rojeru_san.RSMTextFull Cancela;
    private rojeru_san.RSMTextFull Carga;
    private javax.swing.JLabel Central_Label;
    private javax.swing.JLabel Central_Label1;
    private javax.swing.JLabel Central_Label2;
    private javax.swing.JLabel Central_Label3;
    private javax.swing.JLabel Central_Label4;
    private javax.swing.JLabel Central_Label5;
    private javax.swing.JLabel Central_Label6;
    private javax.swing.JLabel Central_Label7;
    private javax.swing.JLabel Central_Label8;
    private javax.swing.JLabel Descripcion_Label;
    public static com.toedter.calendar.JDateChooser Fecha_Caduca_Text;
    private javax.swing.JLabel Fecha_Caducacion_Label;
    private com.toedter.calendar.JDateChooser Fecha_Ejecucion;
    private javax.swing.JLabel Fecha_Vigencia_Label;
    public static com.toedter.calendar.JDateChooser Fecha_Vigencia_Text;
    private rojeru_san.RSMTextFull Final_Manten;
    private rojeru_san.RSMTextFull Inicio_Manten;
    public static javax.swing.JComboBox<String> JComboCentral;
    public static javax.swing.JComboBox<String> JComboEquipo;
    public static javax.swing.JComboBox<String> JComboEstado;
    public static javax.swing.JComboBox<String> JComboTipo_Text;
    public static javax.swing.JComboBox<String> JCombo_Descripcion_Text;
    private javax.swing.JPanel JPanelActualizar;
    private javax.swing.JPanel JPanel_Body;
    private javax.swing.JLabel N_Documento_Label;
    private javax.swing.JLabel N_Equipo_Label;
    public static rojeru_san.RSMTextFull Numero_Gen;
    private javax.swing.JLabel Tipo_Trabajo_Label;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo1;
    private rojeru_san.RSMTextFull Vacio;
    private rojeru_san.RSMTextFull Vigencia;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
