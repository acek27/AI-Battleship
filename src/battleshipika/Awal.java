/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleshipika;

import javax.swing.JButton;

/**
 *
 * @author Acek
 */
public class Awal extends javax.swing.JFrame {

    JButton btn1[];
    JButton btn2[];
    boolean pencet1;
    JButton kapal[];
    JButton kapalTerpilih;

    /**
     * Creates new form Awal
     */
    public Awal() {
        initComponents();
        btn1 = new JButton[100];
        btn2 = new JButton[100];
        kapal = new JButton[5];
        isi();
        pencet1 = false;
        kapalTerpilih = null;

    }

    public void isi() {
        kapal[0] = kapal1;

        btn1[0] = p1;
        btn1[1] = p2;
        btn1[2] = p3;
        btn1[3] = p4;
        btn1[4] = p5;
        btn1[5] = p6;
        btn1[6] = p7;
        btn1[7] = p8;
        btn1[8] = p9;
        btn1[9] = p10;
        btn1[10] = p11;
        btn1[11] = p12;
        btn1[12] = p13;
        btn1[13] = p14;
        btn1[14] = p15;
        btn1[15] = p16;
        btn1[16] = p17;
        btn1[17] = p18;
        btn1[18] = p19;
        btn1[19] = p20;
        btn1[20] = p21;
        btn1[21] = p22;
        btn1[22] = p23;
        btn1[23] = p24;
        btn1[24] = p25;
        btn1[25] = p26;
        btn1[26] = p27;
        btn1[27] = p28;
        btn1[28] = p29;
        btn1[29] = p30;
        btn1[30] = p31;
        btn1[31] = p32;
        btn1[32] = p33;
        btn1[33] = p34;
        btn1[34] = p35;
        btn1[35] = p36;
        btn1[36] = p37;
        btn1[37] = p38;
        btn1[38] = p39;
        btn1[39] = p40;
        btn1[40] = p41;
        btn1[41] = p42;
        btn1[42] = p43;
        btn1[43] = p44;
        btn1[44] = p45;
        btn1[45] = p46;
        btn1[46] = p47;
        btn1[47] = p48;
        btn1[48] = p49;
        btn1[49] = p50;
        btn1[50] = p51;
        btn1[51] = p52;
        btn1[52] = p53;
        btn1[53] = p54;
        btn1[54] = p55;
        btn1[55] = p56;
        btn1[56] = p57;
        btn1[57] = p58;
        btn1[58] = p59;
        btn1[59] = p60;
        btn1[60] = p61;
        btn1[61] = p62;
        btn1[62] = p63;
        btn1[63] = p64;
        btn1[64] = p65;
        btn1[65] = p66;
        btn1[66] = p67;
        btn1[67] = p68;
        btn1[68] = p69;
        btn1[69] = p70;
        btn1[70] = p71;
        btn1[71] = p72;
        btn1[72] = p73;
        btn1[73] = p74;
        btn1[74] = p75;
        btn1[75] = p76;
        btn1[76] = p77;
        btn1[77] = p78;
        btn1[78] = p79;
        btn1[79] = p80;
        btn1[80] = p81;
        btn1[81] = p82;
        btn1[82] = p83;
        btn1[83] = p84;
        btn1[84] = p85;
        btn1[85] = p86;
        btn1[86] = p87;
        btn1[87] = p88;
        btn1[88] = p89;
        btn1[89] = p90;
        btn1[90] = p91;
        btn1[91] = p92;
        btn1[92] = p93;
        btn1[93] = p94;
        btn1[94] = p95;
        btn1[95] = p96;
        btn1[96] = p97;
        btn1[97] = p98;
        btn1[98] = p99;
        btn1[99] = p100;

        btn2[0] = c1;
        btn2[1] = c2;
        btn2[2] = c3;
        btn2[3] = c4;
        btn2[4] = c5;
        btn2[5] = c6;
        btn2[6] = c7;
        btn2[7] = c8;
        btn2[8] = c9;
        btn2[9] = c10;
        btn2[10] = c11;
        btn2[11] = c12;
        btn2[12] = c13;
        btn2[13] = c14;
        btn2[14] = c15;
        btn2[15] = c16;
        btn2[16] = c17;
        btn2[17] = c18;
        btn2[18] = c19;
        btn2[19] = c20;
        btn2[20] = c21;
        btn2[21] = c22;
        btn2[22] = c23;
        btn2[23] = c24;
        btn2[24] = c25;
        btn2[25] = c26;
        btn2[26] = c27;
        btn2[27] = c28;
        btn2[28] = c29;
        btn2[29] = c30;
        btn2[30] = c31;
        btn2[31] = c32;
        btn2[32] = c33;
        btn2[33] = c34;
        btn2[34] = c35;
        btn2[35] = c36;
        btn2[36] = c37;
        btn2[37] = c38;
        btn2[38] = c39;
        btn2[39] = c40;
        btn2[40] = c41;
        btn2[41] = c42;
        btn2[42] = c43;
        btn2[43] = c44;
        btn2[44] = c45;
        btn2[45] = c46;
        btn2[46] = c47;
        btn2[47] = c48;
        btn2[48] = c49;
        btn2[49] = c50;
        btn2[50] = c51;
        btn2[51] = c52;
        btn2[52] = c53;
        btn2[53] = c54;
        btn2[54] = c55;
        btn2[55] = c56;
        btn2[56] = c57;
        btn2[57] = c58;
        btn2[58] = c59;
        btn2[59] = c60;
        btn2[60] = c61;
        btn2[61] = c62;
        btn2[62] = c63;
        btn2[63] = c64;
        btn2[64] = c65;
        btn2[65] = c66;
        btn2[66] = c67;
        btn2[67] = c68;
        btn2[68] = c69;
        btn2[69] = c70;
        btn2[70] = c71;
        btn2[71] = c72;
        btn2[72] = c73;
        btn2[73] = c74;
        btn2[74] = c75;
        btn2[75] = c76;
        btn2[76] = c77;
        btn2[77] = c78;
        btn2[78] = c79;
        btn2[79] = c80;
        btn2[80] = c81;
        btn2[81] = c82;
        btn2[82] = c83;
        btn2[83] = c84;
        btn2[84] = c85;
        btn2[85] = c86;
        btn2[86] = c87;
        btn2[87] = c88;
        btn2[88] = c89;
        btn2[89] = c90;
        btn2[90] = c91;
        btn2[91] = c92;
        btn2[92] = c93;
        btn2[93] = c94;
        btn2[94] = c95;
        btn2[95] = c96;
        btn2[96] = c97;
        btn2[97] = c98;
        btn2[98] = c99;
        btn2[99] = c100;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void pindah(JButton p) {
        if (pencet1) {
            kapalTerpilih.setLocation(p.getLocation());
        }
        kapalTerpilih.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kapal1 = new javax.swing.JButton();
        p1 = new javax.swing.JButton();
        p2 = new javax.swing.JButton();
        p4 = new javax.swing.JButton();
        p3 = new javax.swing.JButton();
        p6 = new javax.swing.JButton();
        p5 = new javax.swing.JButton();
        p8 = new javax.swing.JButton();
        p7 = new javax.swing.JButton();
        p10 = new javax.swing.JButton();
        p9 = new javax.swing.JButton();
        p12 = new javax.swing.JButton();
        p11 = new javax.swing.JButton();
        p14 = new javax.swing.JButton();
        p13 = new javax.swing.JButton();
        p16 = new javax.swing.JButton();
        p15 = new javax.swing.JButton();
        p18 = new javax.swing.JButton();
        p17 = new javax.swing.JButton();
        p20 = new javax.swing.JButton();
        p19 = new javax.swing.JButton();
        p22 = new javax.swing.JButton();
        p21 = new javax.swing.JButton();
        p24 = new javax.swing.JButton();
        p23 = new javax.swing.JButton();
        p26 = new javax.swing.JButton();
        p25 = new javax.swing.JButton();
        p28 = new javax.swing.JButton();
        p27 = new javax.swing.JButton();
        p30 = new javax.swing.JButton();
        p29 = new javax.swing.JButton();
        p32 = new javax.swing.JButton();
        p31 = new javax.swing.JButton();
        p34 = new javax.swing.JButton();
        p33 = new javax.swing.JButton();
        p36 = new javax.swing.JButton();
        p35 = new javax.swing.JButton();
        p38 = new javax.swing.JButton();
        p37 = new javax.swing.JButton();
        p40 = new javax.swing.JButton();
        p39 = new javax.swing.JButton();
        p42 = new javax.swing.JButton();
        p41 = new javax.swing.JButton();
        p44 = new javax.swing.JButton();
        p43 = new javax.swing.JButton();
        p46 = new javax.swing.JButton();
        p45 = new javax.swing.JButton();
        p48 = new javax.swing.JButton();
        p47 = new javax.swing.JButton();
        p50 = new javax.swing.JButton();
        p49 = new javax.swing.JButton();
        p52 = new javax.swing.JButton();
        p51 = new javax.swing.JButton();
        p54 = new javax.swing.JButton();
        p53 = new javax.swing.JButton();
        p56 = new javax.swing.JButton();
        p55 = new javax.swing.JButton();
        p58 = new javax.swing.JButton();
        p57 = new javax.swing.JButton();
        p60 = new javax.swing.JButton();
        p59 = new javax.swing.JButton();
        p62 = new javax.swing.JButton();
        p61 = new javax.swing.JButton();
        p64 = new javax.swing.JButton();
        p63 = new javax.swing.JButton();
        p66 = new javax.swing.JButton();
        p65 = new javax.swing.JButton();
        p68 = new javax.swing.JButton();
        p67 = new javax.swing.JButton();
        p70 = new javax.swing.JButton();
        p69 = new javax.swing.JButton();
        p72 = new javax.swing.JButton();
        p71 = new javax.swing.JButton();
        p74 = new javax.swing.JButton();
        p73 = new javax.swing.JButton();
        p76 = new javax.swing.JButton();
        p75 = new javax.swing.JButton();
        p78 = new javax.swing.JButton();
        p77 = new javax.swing.JButton();
        p80 = new javax.swing.JButton();
        p79 = new javax.swing.JButton();
        p82 = new javax.swing.JButton();
        p81 = new javax.swing.JButton();
        p84 = new javax.swing.JButton();
        p83 = new javax.swing.JButton();
        p86 = new javax.swing.JButton();
        p85 = new javax.swing.JButton();
        p88 = new javax.swing.JButton();
        p87 = new javax.swing.JButton();
        p90 = new javax.swing.JButton();
        p89 = new javax.swing.JButton();
        p92 = new javax.swing.JButton();
        p91 = new javax.swing.JButton();
        p94 = new javax.swing.JButton();
        p93 = new javax.swing.JButton();
        p96 = new javax.swing.JButton();
        p95 = new javax.swing.JButton();
        p98 = new javax.swing.JButton();
        p97 = new javax.swing.JButton();
        p100 = new javax.swing.JButton();
        p99 = new javax.swing.JButton();
        Lname = new javax.swing.JLabel();
        c2 = new javax.swing.JButton();
        c1 = new javax.swing.JButton();
        c4 = new javax.swing.JButton();
        c3 = new javax.swing.JButton();
        c6 = new javax.swing.JButton();
        c5 = new javax.swing.JButton();
        c8 = new javax.swing.JButton();
        c7 = new javax.swing.JButton();
        c10 = new javax.swing.JButton();
        c9 = new javax.swing.JButton();
        c12 = new javax.swing.JButton();
        c11 = new javax.swing.JButton();
        c14 = new javax.swing.JButton();
        c13 = new javax.swing.JButton();
        c16 = new javax.swing.JButton();
        c15 = new javax.swing.JButton();
        c18 = new javax.swing.JButton();
        c17 = new javax.swing.JButton();
        c20 = new javax.swing.JButton();
        c19 = new javax.swing.JButton();
        c22 = new javax.swing.JButton();
        c21 = new javax.swing.JButton();
        c24 = new javax.swing.JButton();
        c23 = new javax.swing.JButton();
        c26 = new javax.swing.JButton();
        c25 = new javax.swing.JButton();
        c28 = new javax.swing.JButton();
        c27 = new javax.swing.JButton();
        c30 = new javax.swing.JButton();
        c29 = new javax.swing.JButton();
        c32 = new javax.swing.JButton();
        c31 = new javax.swing.JButton();
        c34 = new javax.swing.JButton();
        c33 = new javax.swing.JButton();
        c36 = new javax.swing.JButton();
        c35 = new javax.swing.JButton();
        c38 = new javax.swing.JButton();
        c37 = new javax.swing.JButton();
        c40 = new javax.swing.JButton();
        c39 = new javax.swing.JButton();
        c42 = new javax.swing.JButton();
        c41 = new javax.swing.JButton();
        c44 = new javax.swing.JButton();
        c43 = new javax.swing.JButton();
        c46 = new javax.swing.JButton();
        c45 = new javax.swing.JButton();
        c48 = new javax.swing.JButton();
        c47 = new javax.swing.JButton();
        c50 = new javax.swing.JButton();
        c49 = new javax.swing.JButton();
        c52 = new javax.swing.JButton();
        c51 = new javax.swing.JButton();
        c54 = new javax.swing.JButton();
        c53 = new javax.swing.JButton();
        c56 = new javax.swing.JButton();
        c55 = new javax.swing.JButton();
        c58 = new javax.swing.JButton();
        c57 = new javax.swing.JButton();
        c60 = new javax.swing.JButton();
        c59 = new javax.swing.JButton();
        c62 = new javax.swing.JButton();
        c61 = new javax.swing.JButton();
        c64 = new javax.swing.JButton();
        c63 = new javax.swing.JButton();
        c66 = new javax.swing.JButton();
        c65 = new javax.swing.JButton();
        c68 = new javax.swing.JButton();
        c67 = new javax.swing.JButton();
        c70 = new javax.swing.JButton();
        c69 = new javax.swing.JButton();
        c72 = new javax.swing.JButton();
        c71 = new javax.swing.JButton();
        c74 = new javax.swing.JButton();
        c73 = new javax.swing.JButton();
        c76 = new javax.swing.JButton();
        c75 = new javax.swing.JButton();
        c78 = new javax.swing.JButton();
        c77 = new javax.swing.JButton();
        c80 = new javax.swing.JButton();
        c79 = new javax.swing.JButton();
        c82 = new javax.swing.JButton();
        c81 = new javax.swing.JButton();
        c84 = new javax.swing.JButton();
        c83 = new javax.swing.JButton();
        c86 = new javax.swing.JButton();
        c85 = new javax.swing.JButton();
        c88 = new javax.swing.JButton();
        c87 = new javax.swing.JButton();
        c90 = new javax.swing.JButton();
        c89 = new javax.swing.JButton();
        c92 = new javax.swing.JButton();
        c91 = new javax.swing.JButton();
        c94 = new javax.swing.JButton();
        c93 = new javax.swing.JButton();
        c96 = new javax.swing.JButton();
        c95 = new javax.swing.JButton();
        c98 = new javax.swing.JButton();
        c97 = new javax.swing.JButton();
        c100 = new javax.swing.JButton();
        c99 = new javax.swing.JButton();
        jbBack = new javax.swing.JButton();
        iniJudul = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kapal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cnth.png"))); // NOI18N
        kapal1.setRolloverEnabled(false);
        kapal1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cnth1.png"))); // NOI18N
        kapal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kapal1ActionPerformed(evt);
            }
        });
        getContentPane().add(kapal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 120, 40));

        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 40, 40));

        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2ActionPerformed(evt);
            }
        });
        getContentPane().add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 40, 40));

        p4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4ActionPerformed(evt);
            }
        });
        getContentPane().add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 40, 40));

        p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3ActionPerformed(evt);
            }
        });
        getContentPane().add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 40, 40));

        p6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p6ActionPerformed(evt);
            }
        });
        getContentPane().add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 40, 40));

        p5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5ActionPerformed(evt);
            }
        });
        getContentPane().add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 40, 40));

        p8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p8ActionPerformed(evt);
            }
        });
        getContentPane().add(p8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 40, 40));

        p7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p7ActionPerformed(evt);
            }
        });
        getContentPane().add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 40, 40));

        p10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p10ActionPerformed(evt);
            }
        });
        getContentPane().add(p10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 40, 40));

        p9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p9ActionPerformed(evt);
            }
        });
        getContentPane().add(p9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 40, 40));

        p12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p12ActionPerformed(evt);
            }
        });
        getContentPane().add(p12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 40, 40));

        p11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p11ActionPerformed(evt);
            }
        });
        getContentPane().add(p11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 40, 40));

        p14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p14ActionPerformed(evt);
            }
        });
        getContentPane().add(p14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 40, 40));

        p13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p13ActionPerformed(evt);
            }
        });
        getContentPane().add(p13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 40, 40));

        p16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p16ActionPerformed(evt);
            }
        });
        getContentPane().add(p16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 40, 40));

        p15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p15ActionPerformed(evt);
            }
        });
        getContentPane().add(p15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 40, 40));

        p18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p18ActionPerformed(evt);
            }
        });
        getContentPane().add(p18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 40, 40));

        p17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p17ActionPerformed(evt);
            }
        });
        getContentPane().add(p17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 40, 40));

        p20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p20ActionPerformed(evt);
            }
        });
        getContentPane().add(p20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 40, 40));

        p19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p19ActionPerformed(evt);
            }
        });
        getContentPane().add(p19, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 40, 40));

        p22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p22ActionPerformed(evt);
            }
        });
        getContentPane().add(p22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 40, 40));

        p21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p21ActionPerformed(evt);
            }
        });
        getContentPane().add(p21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 40, 40));

        p24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p24ActionPerformed(evt);
            }
        });
        getContentPane().add(p24, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 40, 40));

        p23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p23ActionPerformed(evt);
            }
        });
        getContentPane().add(p23, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 40, 40));

        p26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p26ActionPerformed(evt);
            }
        });
        getContentPane().add(p26, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 40, 40));

        p25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p25ActionPerformed(evt);
            }
        });
        getContentPane().add(p25, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 40, 40));

        p28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p28ActionPerformed(evt);
            }
        });
        getContentPane().add(p28, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 40, 40));

        p27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p27ActionPerformed(evt);
            }
        });
        getContentPane().add(p27, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 40, 40));

        p30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p30ActionPerformed(evt);
            }
        });
        getContentPane().add(p30, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 40, 40));

        p29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p29ActionPerformed(evt);
            }
        });
        getContentPane().add(p29, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 40, 40));

        p32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p32ActionPerformed(evt);
            }
        });
        getContentPane().add(p32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 40, 40));

        p31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p31ActionPerformed(evt);
            }
        });
        getContentPane().add(p31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 40, 40));

        p34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p34ActionPerformed(evt);
            }
        });
        getContentPane().add(p34, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 40, 40));

        p33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p33ActionPerformed(evt);
            }
        });
        getContentPane().add(p33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 40, 40));

        p36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p36ActionPerformed(evt);
            }
        });
        getContentPane().add(p36, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 40, 40));

        p35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p35ActionPerformed(evt);
            }
        });
        getContentPane().add(p35, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 40, 40));

        p38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p38ActionPerformed(evt);
            }
        });
        getContentPane().add(p38, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 40, 40));

        p37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p37ActionPerformed(evt);
            }
        });
        getContentPane().add(p37, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 40, 40));

        p40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p40ActionPerformed(evt);
            }
        });
        getContentPane().add(p40, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 40, 40));

        p39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p39ActionPerformed(evt);
            }
        });
        getContentPane().add(p39, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 40, 40));

        p42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p42ActionPerformed(evt);
            }
        });
        getContentPane().add(p42, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 40, 40));

        p41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p41ActionPerformed(evt);
            }
        });
        getContentPane().add(p41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 40, 40));

        p44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p44ActionPerformed(evt);
            }
        });
        getContentPane().add(p44, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 40, 40));

        p43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p43ActionPerformed(evt);
            }
        });
        getContentPane().add(p43, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 40, 40));

        p46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p46ActionPerformed(evt);
            }
        });
        getContentPane().add(p46, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 40, 40));

        p45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p45ActionPerformed(evt);
            }
        });
        getContentPane().add(p45, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 40, 40));

        p48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p48ActionPerformed(evt);
            }
        });
        getContentPane().add(p48, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 40, 40));

        p47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p47ActionPerformed(evt);
            }
        });
        getContentPane().add(p47, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 40, 40));

        p50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p50ActionPerformed(evt);
            }
        });
        getContentPane().add(p50, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 40, 40));

        p49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p49ActionPerformed(evt);
            }
        });
        getContentPane().add(p49, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 40, 40));
        getContentPane().add(p52, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 40, 40));
        getContentPane().add(p51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 40, 40));
        getContentPane().add(p54, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 40, 40));
        getContentPane().add(p53, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 40, 40));
        getContentPane().add(p56, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 40, 40));
        getContentPane().add(p55, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 40, 40));
        getContentPane().add(p58, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 40, 40));
        getContentPane().add(p57, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 40, 40));
        getContentPane().add(p60, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 40, 40));
        getContentPane().add(p59, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 40, 40));
        getContentPane().add(p62, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 40, 40));
        getContentPane().add(p61, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 40, 40));
        getContentPane().add(p64, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 40, 40));
        getContentPane().add(p63, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 40, 40));
        getContentPane().add(p66, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 40, 40));
        getContentPane().add(p65, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 40, 40));
        getContentPane().add(p68, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 40, 40));
        getContentPane().add(p67, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 40, 40));
        getContentPane().add(p70, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 40, 40));
        getContentPane().add(p69, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 40, 40));
        getContentPane().add(p72, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 40, 40));
        getContentPane().add(p71, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 40, 40));
        getContentPane().add(p74, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 40, 40));

        p73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p73ActionPerformed(evt);
            }
        });
        getContentPane().add(p73, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 40, 40));
        getContentPane().add(p76, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 40, 40));
        getContentPane().add(p75, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 40, 40));
        getContentPane().add(p78, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 40, 40));
        getContentPane().add(p77, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 40, 40));
        getContentPane().add(p80, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 40, 40));
        getContentPane().add(p79, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 40, 40));
        getContentPane().add(p82, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 40, 40));
        getContentPane().add(p81, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 40, 40));
        getContentPane().add(p84, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 40, 40));
        getContentPane().add(p83, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 40, 40));
        getContentPane().add(p86, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 40, 40));
        getContentPane().add(p85, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 40, 40));
        getContentPane().add(p88, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 40, 40));
        getContentPane().add(p87, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 40, 40));
        getContentPane().add(p90, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 40, 40));
        getContentPane().add(p89, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 40, 40));
        getContentPane().add(p92, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 40, 40));
        getContentPane().add(p91, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 40, 40));
        getContentPane().add(p94, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 40, 40));
        getContentPane().add(p93, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 40, 40));
        getContentPane().add(p96, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 40, 40));
        getContentPane().add(p95, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 40, 40));
        getContentPane().add(p98, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 40, 40));
        getContentPane().add(p97, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 40, 40));
        getContentPane().add(p100, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 40, 40));
        getContentPane().add(p99, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 40, 40));

        Lname.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 20)); // NOI18N
        Lname.setText("PLAYER");
        getContentPane().add(Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        c2.setEnabled(false);
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 40, 40));

        c1.setEnabled(false);
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 40, 40));

        c4.setEnabled(false);
        getContentPane().add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 40, 40));

        c3.setEnabled(false);
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 40, 40));

        c6.setEnabled(false);
        getContentPane().add(c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 100, 40, 40));

        c5.setEnabled(false);
        getContentPane().add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 40, 40));

        c8.setEnabled(false);
        getContentPane().add(c8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 40, 40));

        c7.setEnabled(false);
        getContentPane().add(c7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 40, 40));

        c10.setEnabled(false);
        getContentPane().add(c10, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, 40, 40));

        c9.setEnabled(false);
        getContentPane().add(c9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, 40, 40));

        c12.setEnabled(false);
        getContentPane().add(c12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 40, 40));

        c11.setEnabled(false);
        getContentPane().add(c11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 40, 40));

        c14.setEnabled(false);
        getContentPane().add(c14, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 40, 40));

        c13.setEnabled(false);
        getContentPane().add(c13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 40, 40));

        c16.setEnabled(false);
        getContentPane().add(c16, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 40, 40));

        c15.setEnabled(false);
        getContentPane().add(c15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 40, 40));

        c18.setEnabled(false);
        getContentPane().add(c18, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, 40, 40));

        c17.setEnabled(false);
        getContentPane().add(c17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 40, 40));

        c20.setEnabled(false);
        getContentPane().add(c20, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 140, 40, 40));

        c19.setEnabled(false);
        getContentPane().add(c19, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 40, 40));

        c22.setEnabled(false);
        getContentPane().add(c22, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 40, 40));

        c21.setEnabled(false);
        getContentPane().add(c21, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 40, 40));

        c24.setEnabled(false);
        getContentPane().add(c24, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 40, 40));

        c23.setEnabled(false);
        getContentPane().add(c23, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 40, 40));

        c26.setEnabled(false);
        getContentPane().add(c26, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 40, 40));

        c25.setEnabled(false);
        getContentPane().add(c25, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 40, 40));

        c28.setEnabled(false);
        getContentPane().add(c28, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 180, 40, 40));

        c27.setEnabled(false);
        getContentPane().add(c27, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 180, 40, 40));

        c30.setEnabled(false);
        getContentPane().add(c30, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 180, 40, 40));

        c29.setEnabled(false);
        getContentPane().add(c29, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, 40, 40));

        c32.setEnabled(false);
        getContentPane().add(c32, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 40, 40));

        c31.setEnabled(false);
        getContentPane().add(c31, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 40, 40));

        c34.setEnabled(false);
        getContentPane().add(c34, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 40, 40));

        c33.setEnabled(false);
        getContentPane().add(c33, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 40, 40));

        c36.setEnabled(false);
        getContentPane().add(c36, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 40, 40));

        c35.setEnabled(false);
        getContentPane().add(c35, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 40, 40));

        c38.setEnabled(false);
        getContentPane().add(c38, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 40, 40));

        c37.setEnabled(false);
        getContentPane().add(c37, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 40, 40));

        c40.setEnabled(false);
        getContentPane().add(c40, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 220, 40, 40));

        c39.setEnabled(false);
        getContentPane().add(c39, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 220, 40, 40));

        c42.setEnabled(false);
        getContentPane().add(c42, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 40, 40));

        c41.setEnabled(false);
        getContentPane().add(c41, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 40, 40));

        c44.setEnabled(false);
        getContentPane().add(c44, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 40, 40));

        c43.setEnabled(false);
        getContentPane().add(c43, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 40, 40));

        c46.setEnabled(false);
        getContentPane().add(c46, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 40, 40));

        c45.setEnabled(false);
        getContentPane().add(c45, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 40, 40));

        c48.setEnabled(false);
        getContentPane().add(c48, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 40, 40));

        c47.setEnabled(false);
        getContentPane().add(c47, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, 40, 40));

        c50.setEnabled(false);
        getContentPane().add(c50, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 260, 40, 40));

        c49.setEnabled(false);
        getContentPane().add(c49, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 260, 40, 40));

        c52.setEnabled(false);
        getContentPane().add(c52, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 40, 40));

        c51.setEnabled(false);
        getContentPane().add(c51, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 40, 40));

        c54.setEnabled(false);
        getContentPane().add(c54, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 40, 40));

        c53.setEnabled(false);
        getContentPane().add(c53, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 40, 40));

        c56.setEnabled(false);
        getContentPane().add(c56, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 40, 40));

        c55.setEnabled(false);
        getContentPane().add(c55, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 40, 40));

        c58.setEnabled(false);
        getContentPane().add(c58, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, 40, 40));

        c57.setEnabled(false);
        getContentPane().add(c57, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 40, 40));

        c60.setEnabled(false);
        getContentPane().add(c60, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 300, 40, 40));

        c59.setEnabled(false);
        getContentPane().add(c59, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, 40, 40));

        c62.setEnabled(false);
        getContentPane().add(c62, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 40, 40));

        c61.setEnabled(false);
        getContentPane().add(c61, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 40, 40));

        c64.setEnabled(false);
        getContentPane().add(c64, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 40, 40));

        c63.setEnabled(false);
        getContentPane().add(c63, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 40, 40));

        c66.setEnabled(false);
        getContentPane().add(c66, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 40, 40));

        c65.setEnabled(false);
        getContentPane().add(c65, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 40, 40));

        c68.setEnabled(false);
        getContentPane().add(c68, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 340, 40, 40));

        c67.setEnabled(false);
        getContentPane().add(c67, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 40, 40));

        c70.setEnabled(false);
        getContentPane().add(c70, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 340, 40, 40));

        c69.setEnabled(false);
        getContentPane().add(c69, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 40, 40));

        c72.setEnabled(false);
        getContentPane().add(c72, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 40, 40));

        c71.setEnabled(false);
        getContentPane().add(c71, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 40, 40));

        c74.setEnabled(false);
        getContentPane().add(c74, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 40, 40));

        c73.setEnabled(false);
        c73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c73ActionPerformed(evt);
            }
        });
        getContentPane().add(c73, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 40, 40));

        c76.setEnabled(false);
        getContentPane().add(c76, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, 40, 40));

        c75.setEnabled(false);
        getContentPane().add(c75, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 40, 40));

        c78.setEnabled(false);
        getContentPane().add(c78, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, 40, 40));

        c77.setEnabled(false);
        getContentPane().add(c77, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, 40, 40));

        c80.setEnabled(false);
        getContentPane().add(c80, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 380, 40, 40));

        c79.setEnabled(false);
        getContentPane().add(c79, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 380, 40, 40));

        c82.setEnabled(false);
        getContentPane().add(c82, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 40, 40));

        c81.setEnabled(false);
        getContentPane().add(c81, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 40, 40));

        c84.setEnabled(false);
        getContentPane().add(c84, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 40, 40));

        c83.setEnabled(false);
        getContentPane().add(c83, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 40, 40));

        c86.setEnabled(false);
        getContentPane().add(c86, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, 40, 40));

        c85.setEnabled(false);
        getContentPane().add(c85, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 40, 40));

        c88.setEnabled(false);
        getContentPane().add(c88, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, 40, 40));

        c87.setEnabled(false);
        getContentPane().add(c87, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 40, 40));

        c90.setEnabled(false);
        getContentPane().add(c90, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 420, 40, 40));

        c89.setEnabled(false);
        getContentPane().add(c89, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 420, 40, 40));

        c92.setEnabled(false);
        getContentPane().add(c92, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 460, 40, 40));

        c91.setEnabled(false);
        getContentPane().add(c91, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 40, 40));

        c94.setEnabled(false);
        getContentPane().add(c94, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 40, 40));

        c93.setEnabled(false);
        getContentPane().add(c93, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, 40, 40));

        c96.setEnabled(false);
        getContentPane().add(c96, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, 40, 40));

        c95.setEnabled(false);
        getContentPane().add(c95, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, 40, 40));

        c98.setEnabled(false);
        getContentPane().add(c98, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, 40, 40));

        c97.setEnabled(false);
        getContentPane().add(c97, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, 40, 40));

        c100.setEnabled(false);
        getContentPane().add(c100, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 460, 40, 40));

        c99.setEnabled(false);
        getContentPane().add(c99, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 460, 40, 40));

        jbBack.setText("BACK");
        jbBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBackActionPerformed(evt);
            }
        });
        getContentPane().add(jbBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, -1, -1));

        iniJudul.setFont(new java.awt.Font("Rosewood Std Regular", 1, 60)); // NOI18N
        iniJudul.setForeground(new java.awt.Color(0, 0, 0));
        iniJudul.setText("BATTLESHIP");
        getContentPane().add(iniJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 20)); // NOI18N
        jLabel2.setText("COMPUTER");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bacground1.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void p73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p73ActionPerformed
        pindah(p73);
    }//GEN-LAST:event_p73ActionPerformed

    private void c73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c73ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c73ActionPerformed

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        // TODO add your handling code here:
        pindah(p1);
    }//GEN-LAST:event_p1ActionPerformed

    private void p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2ActionPerformed
        pindah(p2);

    }//GEN-LAST:event_p2ActionPerformed

    private void p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3ActionPerformed
        // TODO add your handling code here:
        pindah(p3);
    }//GEN-LAST:event_p3ActionPerformed

    private void p4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4ActionPerformed
        // TODO add your handling code here:
        pindah(p4);
    }//GEN-LAST:event_p4ActionPerformed

    private void p5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5ActionPerformed
        pindah(p5);
    }//GEN-LAST:event_p5ActionPerformed

    private void p6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p6ActionPerformed
        pindah(p6);
    }//GEN-LAST:event_p6ActionPerformed

    private void p7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p7ActionPerformed
        pindah(p7);
    }//GEN-LAST:event_p7ActionPerformed

    private void p8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p8ActionPerformed
        pindah(p8);
    }//GEN-LAST:event_p8ActionPerformed

    private void p9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p9ActionPerformed
        pindah(p9);
    }//GEN-LAST:event_p9ActionPerformed

    private void p10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p10ActionPerformed
        pindah(p10);
    }//GEN-LAST:event_p10ActionPerformed

    private void p11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p11ActionPerformed
        pindah(p11);
    }//GEN-LAST:event_p11ActionPerformed

    private void p12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p12ActionPerformed
        pindah(p12);
    }//GEN-LAST:event_p12ActionPerformed

    private void p13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p13ActionPerformed
        pindah(p13);
    }//GEN-LAST:event_p13ActionPerformed

    private void p14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p14ActionPerformed
        // TODO add your handling code here:
        p14.setEnabled(false);
    }//GEN-LAST:event_p14ActionPerformed

    private void p15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p15ActionPerformed
        pindah(p15);;
    }//GEN-LAST:event_p15ActionPerformed

    private void p16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p16ActionPerformed
        pindah(p16);
    }//GEN-LAST:event_p16ActionPerformed

    private void p17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p17ActionPerformed
        pindah(p17);
    }//GEN-LAST:event_p17ActionPerformed

    private void p18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p18ActionPerformed
        pindah(p18);
    }//GEN-LAST:event_p18ActionPerformed

    private void p19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p19ActionPerformed
        pindah(p19);
    }//GEN-LAST:event_p19ActionPerformed

    private void p20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p20ActionPerformed
        pindah(p20);
    }//GEN-LAST:event_p20ActionPerformed

    private void p21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p21ActionPerformed
        pindah(p21);
    }//GEN-LAST:event_p21ActionPerformed

    private void p22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p22ActionPerformed
        pindah(p22);
    }//GEN-LAST:event_p22ActionPerformed

    private void p23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p23ActionPerformed
        pindah(p23);
    }//GEN-LAST:event_p23ActionPerformed

    private void p24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p24ActionPerformed
        pindah(p24);
    }//GEN-LAST:event_p24ActionPerformed

    private void p25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p25ActionPerformed
        pindah(p25);
    }//GEN-LAST:event_p25ActionPerformed

    private void p26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p26ActionPerformed
        pindah(p26);
    }//GEN-LAST:event_p26ActionPerformed

    private void p27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p27ActionPerformed
        pindah(p27);
    }//GEN-LAST:event_p27ActionPerformed

    private void p28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p28ActionPerformed
        pindah(p28);
    }//GEN-LAST:event_p28ActionPerformed

    private void p29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p29ActionPerformed
        pindah(p29);
    }//GEN-LAST:event_p29ActionPerformed

    private void p30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p30ActionPerformed
        pindah(p30);
    }//GEN-LAST:event_p30ActionPerformed

    private void p31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p31ActionPerformed
        // TODO add your handling code here:
        p31.setEnabled(false);
    }//GEN-LAST:event_p31ActionPerformed

    private void p32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p32ActionPerformed
        // TODO add your handling code here:
        p32.setEnabled(false);
    }//GEN-LAST:event_p32ActionPerformed

    private void p33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p33ActionPerformed
        // TODO add your handling code here:
        p33.setEnabled(false);
    }//GEN-LAST:event_p33ActionPerformed

    private void p34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p34ActionPerformed
        // TODO add your handling code here:
        p34.setEnabled(false);
    }//GEN-LAST:event_p34ActionPerformed

    private void p35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p35ActionPerformed
        // TODO add your handling code here:
        p35.setEnabled(false);
    }//GEN-LAST:event_p35ActionPerformed

    private void p36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p36ActionPerformed
        // TODO add your handling code here:
        p36.setEnabled(false);
    }//GEN-LAST:event_p36ActionPerformed

    private void p37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p37ActionPerformed
        // TODO add your handling code here:
        p37.setEnabled(false);
    }//GEN-LAST:event_p37ActionPerformed

    private void p38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p38ActionPerformed
        // TODO add your handling code here:
        p38.setEnabled(false);
    }//GEN-LAST:event_p38ActionPerformed

    private void p39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p39ActionPerformed
        // TODO add your handling code here:
        p39.setEnabled(false);
    }//GEN-LAST:event_p39ActionPerformed

    private void p40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p40ActionPerformed
        // TODO add your handling code here:
        p40.setEnabled(false);
    }//GEN-LAST:event_p40ActionPerformed

    private void p41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p41ActionPerformed
        // TODO add your handling code here:
        p41.setEnabled(false);
    }//GEN-LAST:event_p41ActionPerformed

    private void p42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p42ActionPerformed
        // TODO add your handling code here:
        p42.setEnabled(false);
    }//GEN-LAST:event_p42ActionPerformed

    private void p43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p43ActionPerformed
        // TODO add your handling code here:
        p43.setEnabled(false);
    }//GEN-LAST:event_p43ActionPerformed

    private void p44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p44ActionPerformed
        // TODO add your handling code here:
        p44.setEnabled(false);
    }//GEN-LAST:event_p44ActionPerformed

    private void p45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p45ActionPerformed
        // TODO add your handling code here:
        p45.setEnabled(false);
    }//GEN-LAST:event_p45ActionPerformed

    private void p46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p46ActionPerformed
        // TODO add your handling code here:
        p46.setEnabled(false);
    }//GEN-LAST:event_p46ActionPerformed

    private void p47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p47ActionPerformed
        // TODO add your handling code here:
        p47.setEnabled(false);
    }//GEN-LAST:event_p47ActionPerformed

    private void p48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p48ActionPerformed
        // TODO add your handling code here:
        p48.setEnabled(false);
    }//GEN-LAST:event_p48ActionPerformed

    private void p49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p49ActionPerformed
        // TODO add your handling code here:
        p49.setEnabled(false);
    }//GEN-LAST:event_p49ActionPerformed

    private void p50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p50ActionPerformed
        // TODO add your handling code here:
        p50.setEnabled(false);
    }//GEN-LAST:event_p50ActionPerformed

    private void jbBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBackActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbBackActionPerformed

    private void kapal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kapal1ActionPerformed
        terpilih(kapal1);
    }//GEN-LAST:event_kapal1ActionPerformed
    public void terpilih(JButton kapal) {
        if (kapal.isSelected()) {
            kapal.setSelected(false);
            pencet1 = false;
        } else {
            kapal.setSelected(true);
            pencet1 = true;
            kapalTerpilih = kapal;
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
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Awal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Awal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lname;
    private javax.swing.JButton c1;
    private javax.swing.JButton c10;
    private javax.swing.JButton c100;
    private javax.swing.JButton c11;
    private javax.swing.JButton c12;
    private javax.swing.JButton c13;
    private javax.swing.JButton c14;
    private javax.swing.JButton c15;
    private javax.swing.JButton c16;
    private javax.swing.JButton c17;
    private javax.swing.JButton c18;
    private javax.swing.JButton c19;
    private javax.swing.JButton c2;
    private javax.swing.JButton c20;
    private javax.swing.JButton c21;
    private javax.swing.JButton c22;
    private javax.swing.JButton c23;
    private javax.swing.JButton c24;
    private javax.swing.JButton c25;
    private javax.swing.JButton c26;
    private javax.swing.JButton c27;
    private javax.swing.JButton c28;
    private javax.swing.JButton c29;
    private javax.swing.JButton c3;
    private javax.swing.JButton c30;
    private javax.swing.JButton c31;
    private javax.swing.JButton c32;
    private javax.swing.JButton c33;
    private javax.swing.JButton c34;
    private javax.swing.JButton c35;
    private javax.swing.JButton c36;
    private javax.swing.JButton c37;
    private javax.swing.JButton c38;
    private javax.swing.JButton c39;
    private javax.swing.JButton c4;
    private javax.swing.JButton c40;
    private javax.swing.JButton c41;
    private javax.swing.JButton c42;
    private javax.swing.JButton c43;
    private javax.swing.JButton c44;
    private javax.swing.JButton c45;
    private javax.swing.JButton c46;
    private javax.swing.JButton c47;
    private javax.swing.JButton c48;
    private javax.swing.JButton c49;
    private javax.swing.JButton c5;
    private javax.swing.JButton c50;
    private javax.swing.JButton c51;
    private javax.swing.JButton c52;
    private javax.swing.JButton c53;
    private javax.swing.JButton c54;
    private javax.swing.JButton c55;
    private javax.swing.JButton c56;
    private javax.swing.JButton c57;
    private javax.swing.JButton c58;
    private javax.swing.JButton c59;
    private javax.swing.JButton c6;
    private javax.swing.JButton c60;
    private javax.swing.JButton c61;
    private javax.swing.JButton c62;
    private javax.swing.JButton c63;
    private javax.swing.JButton c64;
    private javax.swing.JButton c65;
    private javax.swing.JButton c66;
    private javax.swing.JButton c67;
    private javax.swing.JButton c68;
    private javax.swing.JButton c69;
    private javax.swing.JButton c7;
    private javax.swing.JButton c70;
    private javax.swing.JButton c71;
    private javax.swing.JButton c72;
    private javax.swing.JButton c73;
    private javax.swing.JButton c74;
    private javax.swing.JButton c75;
    private javax.swing.JButton c76;
    private javax.swing.JButton c77;
    private javax.swing.JButton c78;
    private javax.swing.JButton c79;
    private javax.swing.JButton c8;
    private javax.swing.JButton c80;
    private javax.swing.JButton c81;
    private javax.swing.JButton c82;
    private javax.swing.JButton c83;
    private javax.swing.JButton c84;
    private javax.swing.JButton c85;
    private javax.swing.JButton c86;
    private javax.swing.JButton c87;
    private javax.swing.JButton c88;
    private javax.swing.JButton c89;
    private javax.swing.JButton c9;
    private javax.swing.JButton c90;
    private javax.swing.JButton c91;
    private javax.swing.JButton c92;
    private javax.swing.JButton c93;
    private javax.swing.JButton c94;
    private javax.swing.JButton c95;
    private javax.swing.JButton c96;
    private javax.swing.JButton c97;
    private javax.swing.JButton c98;
    private javax.swing.JButton c99;
    private javax.swing.JLabel iniJudul;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbBack;
    private javax.swing.JButton kapal1;
    private javax.swing.JButton p1;
    private javax.swing.JButton p10;
    private javax.swing.JButton p100;
    private javax.swing.JButton p11;
    private javax.swing.JButton p12;
    private javax.swing.JButton p13;
    private javax.swing.JButton p14;
    private javax.swing.JButton p15;
    private javax.swing.JButton p16;
    private javax.swing.JButton p17;
    private javax.swing.JButton p18;
    private javax.swing.JButton p19;
    private javax.swing.JButton p2;
    private javax.swing.JButton p20;
    private javax.swing.JButton p21;
    private javax.swing.JButton p22;
    private javax.swing.JButton p23;
    private javax.swing.JButton p24;
    private javax.swing.JButton p25;
    private javax.swing.JButton p26;
    private javax.swing.JButton p27;
    private javax.swing.JButton p28;
    private javax.swing.JButton p29;
    private javax.swing.JButton p3;
    private javax.swing.JButton p30;
    private javax.swing.JButton p31;
    private javax.swing.JButton p32;
    private javax.swing.JButton p33;
    private javax.swing.JButton p34;
    private javax.swing.JButton p35;
    private javax.swing.JButton p36;
    private javax.swing.JButton p37;
    private javax.swing.JButton p38;
    private javax.swing.JButton p39;
    private javax.swing.JButton p4;
    private javax.swing.JButton p40;
    private javax.swing.JButton p41;
    private javax.swing.JButton p42;
    private javax.swing.JButton p43;
    private javax.swing.JButton p44;
    private javax.swing.JButton p45;
    private javax.swing.JButton p46;
    private javax.swing.JButton p47;
    private javax.swing.JButton p48;
    private javax.swing.JButton p49;
    private javax.swing.JButton p5;
    private javax.swing.JButton p50;
    private javax.swing.JButton p51;
    private javax.swing.JButton p52;
    private javax.swing.JButton p53;
    private javax.swing.JButton p54;
    private javax.swing.JButton p55;
    private javax.swing.JButton p56;
    private javax.swing.JButton p57;
    private javax.swing.JButton p58;
    private javax.swing.JButton p59;
    private javax.swing.JButton p6;
    private javax.swing.JButton p60;
    private javax.swing.JButton p61;
    private javax.swing.JButton p62;
    private javax.swing.JButton p63;
    private javax.swing.JButton p64;
    private javax.swing.JButton p65;
    private javax.swing.JButton p66;
    private javax.swing.JButton p67;
    private javax.swing.JButton p68;
    private javax.swing.JButton p69;
    private javax.swing.JButton p7;
    private javax.swing.JButton p70;
    private javax.swing.JButton p71;
    private javax.swing.JButton p72;
    private javax.swing.JButton p73;
    private javax.swing.JButton p74;
    private javax.swing.JButton p75;
    private javax.swing.JButton p76;
    private javax.swing.JButton p77;
    private javax.swing.JButton p78;
    private javax.swing.JButton p79;
    private javax.swing.JButton p8;
    private javax.swing.JButton p80;
    private javax.swing.JButton p81;
    private javax.swing.JButton p82;
    private javax.swing.JButton p83;
    private javax.swing.JButton p84;
    private javax.swing.JButton p85;
    private javax.swing.JButton p86;
    private javax.swing.JButton p87;
    private javax.swing.JButton p88;
    private javax.swing.JButton p89;
    private javax.swing.JButton p9;
    private javax.swing.JButton p90;
    private javax.swing.JButton p91;
    private javax.swing.JButton p92;
    private javax.swing.JButton p93;
    private javax.swing.JButton p94;
    private javax.swing.JButton p95;
    private javax.swing.JButton p96;
    private javax.swing.JButton p97;
    private javax.swing.JButton p98;
    private javax.swing.JButton p99;
    // End of variables declaration//GEN-END:variables
}
