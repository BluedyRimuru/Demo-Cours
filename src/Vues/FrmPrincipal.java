package Vues;

import Entities.Etudiant;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.ArrayList;

public class FrmPrincipal extends JFrame {
    private JLabel lblTitre;
    private JLabel lblNom;
    private JButton btnValider;
    private JTextField txtNom;
    private JPanel pnlRoot;
    private JTable tblEtudiant;

    public FrmPrincipal()
    {

        // Permet de donner un titre à notre fenêtre
        this.setTitle("Démo du cours");
        // Permet d'afficher les contrôles graphiques
        this.setContentPane(pnlRoot);
        // Permet de gérer le dimensionnement de la fenêtre par rapport aux contrôles graphiques
        this.pack();
        // Permet d'afficher le formulaire au milieu de votre écran
        this.setLocationRelativeTo(null);
        // Permet de fermer le formulaire
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        btnValider.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                FrmDemo frm = new FrmDemo();
                frm.setVisible(true);
            }
        });
        btnValider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);

                ArrayList<Etudiant> mesEtudiants = new ArrayList<>();

                Etudiant et1 = new Etudiant(1, "Alain");
                Etudiant et2 = new Etudiant(2, "Paul");
                Etudiant et3 = new Etudiant(3, "Jacques");

                mesEtudiants.add(et1);
                mesEtudiants.add(et2);
                mesEtudiants.add(et3);


                // 2 tableaux pour remplir le JTable

                String[] colonnes = new String[]{"Numéro","Prénom"}; // new String[]{2};
                Object[][] datas = new Object[mesEtudiants.size()][2];

                int i = 0;
                for(Etudiant etud:mesEtudiants) {
                    datas[i][0] = etud.getIdEtudiant();
                    datas[i][1] = etud.getPrenomEtudiant();
                    i++;
                }
                DefaultTableModel dtmEtudiant = new DefaultTableModel(datas,colonnes);
                tblEtudiant.setModel(dtmEtudiant);
            }
        });
    }
}
