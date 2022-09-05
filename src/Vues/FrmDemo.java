package Vues;

import Entities.Etudiant;

import javax.swing.*;
import java.util.ArrayList;

public class FrmDemo extends JFrame {
    private JButton btnDemo;
    private JPanel pnlRoot;
    private JComboBox cboLangages;

    public FrmDemo() {

        // Permet de donner un titre à notre fenêtre
        this.setTitle("2ème fenêtre du cours");
        // Permet d'afficher les contrôles graphiques
        this.setContentPane(pnlRoot);
        // Permet de gérer le dimensionnement de la fenêtre par rapport aux contrôles graphiques
        this.pack();
        // Permet d'afficher le formulaire au milieu de votre écran
        this.setLocationRelativeTo(null);
        // Permet de fermer le formulaire
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        Etudiant monEtudiant2 = new Etudiant(1, "Alain");

        ArrayList<Etudiant> mesEtudiants = new ArrayList<>();

    }
}
