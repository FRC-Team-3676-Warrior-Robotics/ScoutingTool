package team3676scouting;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neil
 */
public class MainMenu extends javax.swing.JFrame {

	/**
	 * Creates new form MainMenu
	 */
	public MainMenu() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BackGroundPane = new javax.swing.JPanel();
        TabPane = new javax.swing.JTabbedPane();
        PitScouting = new javax.swing.JPanel();
        CurrentRanking = new javax.swing.JPanel();
        NotesPane = new javax.swing.JPanel();
        FieldScouting = new javax.swing.JPanel();
        DriveLabel = new javax.swing.JLabel();
        ShotAcuracyLabel = new javax.swing.JLabel();
        ShotSpeedabel = new javax.swing.JLabel();
        ClimbingLabel = new javax.swing.JLabel();
        LowEndLabel = new javax.swing.JLabel();
        HighEndText = new javax.swing.JLabel();
        DrivingSLider = new javax.swing.JSlider();
        ClimbingSlider = new javax.swing.JSlider();
        ShotAcuracySlider = new javax.swing.JSlider();
        ShotSpeedSlider = new javax.swing.JSlider();
        AutoLabel = new javax.swing.JLabel();
        GeneralLabel = new javax.swing.JLabel();
        StartingPositionPane = new javax.swing.JScrollPane();
        StartingPositionList = new javax.swing.JList();
        StartingPositionLabel = new javax.swing.JLabel();
        ClimbingCatergoryLabel = new javax.swing.JLabel();
        LowClimbCheckBox = new javax.swing.JCheckBox();
        MiddleClimbCheckBox = new javax.swing.JCheckBox();
        HighClimbCheckBox = new javax.swing.JCheckBox();
        ClimbPointsLabel = new javax.swing.JLabel();
        ClimbTimeLabel = new javax.swing.JLabel();
        ClimbPointsTextField = new javax.swing.JTextField();
        ClimbTimeTextField = new javax.swing.JTextField();
        ShootingCatergoryLabel = new javax.swing.JLabel();
        LowShootCheckBox = new javax.swing.JCheckBox();
        MiddleShootCheckBox1 = new javax.swing.JCheckBox();
        HighShootCheckBox1 = new javax.swing.JCheckBox();
        ShootPointsLabel = new javax.swing.JLabel();
        ShootPointsTextField = new javax.swing.JTextField();
        TeamCatergoryLabel1 = new javax.swing.JLabel();
        TeamNumberLabel = new javax.swing.JLabel();
        TeamNumberTextField = new javax.swing.JTextField();
        NotesLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        NotesTextBox = new javax.swing.JTextArea();
        SubmitButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackGroundPane.setBackground(new java.awt.Color(204, 0, 0));
        BackGroundPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BackGroundPane.setDoubleBuffered(false);

        TabPane.setBackground(new java.awt.Color(204, 0, 0));

        PitScouting.setBackground(new java.awt.Color(0, 0, 0));
        PitScouting.setForeground(new java.awt.Color(153, 0, 0));

        org.jdesktop.layout.GroupLayout PitScoutingLayout = new org.jdesktop.layout.GroupLayout(PitScouting);
        PitScouting.setLayout(PitScoutingLayout);
        PitScoutingLayout.setHorizontalGroup(
            PitScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 1250, Short.MAX_VALUE)
        );
        PitScoutingLayout.setVerticalGroup(
            PitScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 669, Short.MAX_VALUE)
        );

        TabPane.addTab("Pit Scouting", PitScouting);

        CurrentRanking.setBackground(new java.awt.Color(0, 0, 0));
        CurrentRanking.setForeground(new java.awt.Color(153, 0, 0));

        org.jdesktop.layout.GroupLayout CurrentRankingLayout = new org.jdesktop.layout.GroupLayout(CurrentRanking);
        CurrentRanking.setLayout(CurrentRankingLayout);
        CurrentRankingLayout.setHorizontalGroup(
            CurrentRankingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 1250, Short.MAX_VALUE)
        );
        CurrentRankingLayout.setVerticalGroup(
            CurrentRankingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 669, Short.MAX_VALUE)
        );

        TabPane.addTab("Current Ranking", CurrentRanking);

        NotesPane.setBackground(new java.awt.Color(0, 0, 0));
        NotesPane.setForeground(new java.awt.Color(153, 0, 0));

        org.jdesktop.layout.GroupLayout NotesPaneLayout = new org.jdesktop.layout.GroupLayout(NotesPane);
        NotesPane.setLayout(NotesPaneLayout);
        NotesPaneLayout.setHorizontalGroup(
            NotesPaneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 1250, Short.MAX_VALUE)
        );
        NotesPaneLayout.setVerticalGroup(
            NotesPaneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 669, Short.MAX_VALUE)
        );

        TabPane.addTab("Notes", NotesPane);

        FieldScouting.setBackground(new java.awt.Color(0, 0, 0));
        FieldScouting.setForeground(new java.awt.Color(153, 0, 0));

        DriveLabel.setBackground(new java.awt.Color(0, 0, 0));
        DriveLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DriveLabel.setForeground(new java.awt.Color(255, 255, 255));
        DriveLabel.setText("Drive Skill");
        DriveLabel.setToolTipText("");

        ShotAcuracyLabel.setBackground(new java.awt.Color(0, 0, 0));
        ShotAcuracyLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShotAcuracyLabel.setForeground(new java.awt.Color(255, 255, 255));
        ShotAcuracyLabel.setText("Shot Acuracy");

        ShotSpeedabel.setBackground(new java.awt.Color(0, 0, 0));
        ShotSpeedabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShotSpeedabel.setForeground(new java.awt.Color(255, 255, 255));
        ShotSpeedabel.setText("Shot Speed");

        ClimbingLabel.setBackground(new java.awt.Color(0, 0, 0));
        ClimbingLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ClimbingLabel.setForeground(new java.awt.Color(255, 255, 255));
        ClimbingLabel.setText("Climbing Skill");

        LowEndLabel.setForeground(new java.awt.Color(255, 255, 255));
        LowEndLabel.setText("0");
        LowEndLabel.setToolTipText("");

        HighEndText.setBackground(new java.awt.Color(0, 0, 0));
        HighEndText.setForeground(new java.awt.Color(255, 255, 255));
        HighEndText.setText("5");

        DrivingSLider.setBackground(new java.awt.Color(0, 0, 0));
        DrivingSLider.setForeground(new java.awt.Color(255, 255, 255));

        ClimbingSlider.setBackground(new java.awt.Color(0, 0, 0));
        ClimbingSlider.setForeground(new java.awt.Color(255, 255, 255));

        ShotAcuracySlider.setBackground(new java.awt.Color(0, 0, 0));
        ShotAcuracySlider.setForeground(new java.awt.Color(255, 255, 255));

        ShotSpeedSlider.setBackground(new java.awt.Color(0, 0, 0));
        ShotSpeedSlider.setForeground(new java.awt.Color(255, 255, 255));

        AutoLabel.setBackground(new java.awt.Color(0, 0, 0));
        AutoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AutoLabel.setForeground(new java.awt.Color(204, 0, 0));
        AutoLabel.setText("Autonomous");

        GeneralLabel.setBackground(new java.awt.Color(0, 0, 0));
        GeneralLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        GeneralLabel.setForeground(new java.awt.Color(204, 0, 0));
        GeneralLabel.setText("General");

        StartingPositionList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        StartingPositionList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Front Left", "Front Right", "Back Left", "Back Right", "Other" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        StartingPositionList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        StartingPositionList.setSelectionBackground(new java.awt.Color(204, 0, 0));
        StartingPositionPane.setViewportView(StartingPositionList);

        StartingPositionLabel.setBackground(new java.awt.Color(0, 0, 0));
        StartingPositionLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        StartingPositionLabel.setForeground(new java.awt.Color(255, 255, 255));
        StartingPositionLabel.setText("Starting Position");

        ClimbingCatergoryLabel.setBackground(new java.awt.Color(0, 0, 0));
        ClimbingCatergoryLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ClimbingCatergoryLabel.setForeground(new java.awt.Color(204, 0, 0));
        ClimbingCatergoryLabel.setText("Climbing");

        LowClimbCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        LowClimbCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        LowClimbCheckBox.setText("Low?");

        MiddleClimbCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        MiddleClimbCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        MiddleClimbCheckBox.setText("Middle?");

        HighClimbCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        HighClimbCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        HighClimbCheckBox.setText("High?");
        HighClimbCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HighClimbCheckBoxActionPerformed(evt);
            }
        });

        ClimbPointsLabel.setBackground(new java.awt.Color(0, 0, 0));
        ClimbPointsLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ClimbPointsLabel.setForeground(new java.awt.Color(255, 255, 255));
        ClimbPointsLabel.setText("Points?");

        ClimbTimeLabel.setBackground(new java.awt.Color(0, 0, 0));
        ClimbTimeLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ClimbTimeLabel.setForeground(new java.awt.Color(255, 255, 255));
        ClimbTimeLabel.setText("Time?");

        ClimbPointsTextField.setText("15");

        ClimbTimeTextField.setText("75");

        ShootingCatergoryLabel.setBackground(new java.awt.Color(0, 0, 0));
        ShootingCatergoryLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ShootingCatergoryLabel.setForeground(new java.awt.Color(204, 0, 0));
        ShootingCatergoryLabel.setText("Shooting");

        LowShootCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        LowShootCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        LowShootCheckBox.setText("Low?");

        MiddleShootCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        MiddleShootCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        MiddleShootCheckBox1.setText("Middle?");

        HighShootCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        HighShootCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        HighShootCheckBox1.setText("High?");
        HighShootCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HighShootCheckBox1ActionPerformed(evt);
            }
        });

        ShootPointsLabel.setBackground(new java.awt.Color(0, 0, 0));
        ShootPointsLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ShootPointsLabel.setForeground(new java.awt.Color(255, 255, 255));
        ShootPointsLabel.setText("Points?");

        ShootPointsTextField.setText("15");

        TeamCatergoryLabel1.setBackground(new java.awt.Color(0, 0, 0));
        TeamCatergoryLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TeamCatergoryLabel1.setForeground(new java.awt.Color(204, 0, 0));
        TeamCatergoryLabel1.setText("Team Info");

        TeamNumberLabel.setBackground(new java.awt.Color(0, 0, 0));
        TeamNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        TeamNumberLabel.setText("Team Number");

        TeamNumberTextField.setText("3676");

        NotesLabel.setBackground(new java.awt.Color(0, 0, 0));
        NotesLabel.setForeground(new java.awt.Color(255, 255, 255));
        NotesLabel.setText("Other Info (Damage, Special Notes, ect)");

        NotesTextBox.setColumns(20);
        NotesTextBox.setRows(5);
        jScrollPane1.setViewportView(NotesTextBox);

        SubmitButton.setText("Submit");

        jSeparator1.setBackground(new java.awt.Color(204, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(204, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Scouter Info");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Name");

        jTextField1.setText("Default");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(204, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(204, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Synchronize");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("LET NEIL DO THIS");

        jPasswordField1.setText("example");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("File Path");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout FieldScoutingLayout = new org.jdesktop.layout.GroupLayout(FieldScouting);
        FieldScouting.setLayout(FieldScoutingLayout);
        FieldScoutingLayout.setHorizontalGroup(
            FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(FieldScoutingLayout.createSequentialGroup()
                .addContainerGap()
                .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(FieldScoutingLayout.createSequentialGroup()
                            .add(GeneralLabel)
                            .add(18, 18, 18)
                            .add(LowEndLabel)
                            .add(188, 188, 188)
                            .add(HighEndText))
                        .add(FieldScoutingLayout.createSequentialGroup()
                            .add(DriveLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(DrivingSLider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(FieldScoutingLayout.createSequentialGroup()
                            .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(ClimbingLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(ShotSpeedabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(ShotAcuracyLabel))
                            .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(FieldScoutingLayout.createSequentialGroup()
                                        .add(18, 18, 18)
                                        .add(ShotAcuracySlider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, FieldScoutingLayout.createSequentialGroup()
                                        .add(18, 18, 18)
                                        .add(ShotSpeedSlider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, FieldScoutingLayout.createSequentialGroup()
                                    .add(18, 18, 18)
                                    .add(ClimbingSlider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                    .add(FieldScoutingLayout.createSequentialGroup()
                        .add(ShootPointsLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(ShootPointsTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(LowShootCheckBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(HighShootCheckBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(MiddleShootCheckBox1)
                    .add(ShootingCatergoryLabel)
                    .add(TeamCatergoryLabel1)
                    .add(FieldScoutingLayout.createSequentialGroup()
                        .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(TeamNumberLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(TeamNumberTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 66, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(NotesLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 194, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .add(18, 18, 18)
                .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(ClimbingCatergoryLabel)
                    .add(MiddleClimbCheckBox)
                    .add(FieldScoutingLayout.createSequentialGroup()
                        .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(SubmitButton)
                            .add(FieldScoutingLayout.createSequentialGroup()
                                .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(LowClimbCheckBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(HighClimbCheckBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 61, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(57, 57, 57)
                                .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(ClimbPointsLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(ClimbTimeLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .add(18, 18, 18)
                        .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(ClimbTimeTextField)
                            .add(ClimbPointsTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(AutoLabel)
                    .add(StartingPositionLabel)
                    .add(FieldScoutingLayout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(StartingPositionPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(18, 18, 18)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2)
                    .add(jLabel3)
                    .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(32, 32, 32)
                .add(jSeparator2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jLabel4)
                    .add(jLabel5)
                    .add(jPasswordField1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .add(jTextField2))
                .addContainerGap(315, Short.MAX_VALUE))
        );
        FieldScoutingLayout.setVerticalGroup(
            FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(FieldScoutingLayout.createSequentialGroup()
                .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(FieldScoutingLayout.createSequentialGroup()
                        .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(FieldScoutingLayout.createSequentialGroup()
                                .add(19, 19, 19)
                                .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(LowEndLabel)
                                    .add(HighEndText)))
                            .add(GeneralLabel))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(DriveLabel)
                            .add(DrivingSLider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(ShotAcuracyLabel)
                            .add(ShotAcuracySlider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(ShotSpeedabel)
                            .add(ShotSpeedSlider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(ClimbingSlider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(ClimbingLabel)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, FieldScoutingLayout.createSequentialGroup()
                        .add(AutoLabel)
                        .add(18, 18, 18)
                        .add(StartingPositionLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(StartingPositionPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(FieldScoutingLayout.createSequentialGroup()
                        .add(7, 7, 7)
                        .add(ShootingCatergoryLabel)
                        .add(18, 18, 18)
                        .add(LowShootCheckBox)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(MiddleShootCheckBox1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(HighShootCheckBox1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(ShootPointsLabel)
                            .add(ShootPointsTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(TeamCatergoryLabel1)
                        .add(18, 18, 18)
                        .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(TeamNumberLabel)
                            .add(NotesLabel))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(FieldScoutingLayout.createSequentialGroup()
                                .add(TeamNumberTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(0, 0, Short.MAX_VALUE))
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                        .addContainerGap())
                    .add(FieldScoutingLayout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(ClimbingCatergoryLabel)
                        .add(18, 18, 18)
                        .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(LowClimbCheckBox)
                            .add(ClimbPointsLabel)
                            .add(ClimbPointsTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(MiddleClimbCheckBox)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(HighClimbCheckBox)
                            .add(ClimbTimeLabel)
                            .add(ClimbTimeTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(SubmitButton)
                        .add(168, 168, 168))))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jSeparator1)
            .add(jSeparator2)
            .add(FieldScoutingLayout.createSequentialGroup()
                .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(FieldScoutingLayout.createSequentialGroup()
                        .add(jLabel2)
                        .add(18, 18, 18)
                        .add(jLabel3))
                    .add(FieldScoutingLayout.createSequentialGroup()
                        .add(jLabel4)
                        .add(18, 18, 18)
                        .add(jLabel5)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(FieldScoutingLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPasswordField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );

        TabPane.addTab("Field Scouting", FieldScouting);

        org.jdesktop.layout.GroupLayout BackGroundPaneLayout = new org.jdesktop.layout.GroupLayout(BackGroundPane);
        BackGroundPane.setLayout(BackGroundPaneLayout);
        BackGroundPaneLayout.setHorizontalGroup(
            BackGroundPaneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(BackGroundPaneLayout.createSequentialGroup()
                .addContainerGap()
                .add(TabPane)
                .addContainerGap())
        );
        BackGroundPaneLayout.setVerticalGroup(
            BackGroundPaneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(BackGroundPaneLayout.createSequentialGroup()
                .addContainerGap()
                .add(TabPane)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(BackGroundPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(BackGroundPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HighClimbCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HighClimbCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HighClimbCheckBoxActionPerformed

    private void HighShootCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HighShootCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HighShootCheckBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
			java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainMenu().setVisible(true);
			}
		});
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AutoLabel;
    private javax.swing.JPanel BackGroundPane;
    private javax.swing.JLabel ClimbPointsLabel;
    private javax.swing.JTextField ClimbPointsTextField;
    private javax.swing.JLabel ClimbTimeLabel;
    private javax.swing.JTextField ClimbTimeTextField;
    private javax.swing.JLabel ClimbingCatergoryLabel;
    private javax.swing.JLabel ClimbingLabel;
    private javax.swing.JSlider ClimbingSlider;
    private javax.swing.JPanel CurrentRanking;
    private javax.swing.JLabel DriveLabel;
    private javax.swing.JSlider DrivingSLider;
    private javax.swing.JPanel FieldScouting;
    private javax.swing.JLabel GeneralLabel;
    private javax.swing.JCheckBox HighClimbCheckBox;
    private javax.swing.JLabel HighEndText;
    private javax.swing.JCheckBox HighShootCheckBox1;
    private javax.swing.JCheckBox LowClimbCheckBox;
    private javax.swing.JLabel LowEndLabel;
    private javax.swing.JCheckBox LowShootCheckBox;
    private javax.swing.JCheckBox MiddleClimbCheckBox;
    private javax.swing.JCheckBox MiddleShootCheckBox1;
    private javax.swing.JLabel NotesLabel;
    private javax.swing.JPanel NotesPane;
    private javax.swing.JTextArea NotesTextBox;
    private javax.swing.JPanel PitScouting;
    private javax.swing.JLabel ShootPointsLabel;
    private javax.swing.JTextField ShootPointsTextField;
    private javax.swing.JLabel ShootingCatergoryLabel;
    private javax.swing.JLabel ShotAcuracyLabel;
    private javax.swing.JSlider ShotAcuracySlider;
    private javax.swing.JSlider ShotSpeedSlider;
    private javax.swing.JLabel ShotSpeedabel;
    private javax.swing.JLabel StartingPositionLabel;
    private javax.swing.JList StartingPositionList;
    private javax.swing.JScrollPane StartingPositionPane;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JTabbedPane TabPane;
    private javax.swing.JLabel TeamCatergoryLabel1;
    private javax.swing.JLabel TeamNumberLabel;
    private javax.swing.JTextField TeamNumberTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
