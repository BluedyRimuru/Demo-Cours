package Entities;

public class Etudiant {
    // Membres privés

    private int idEtudiant;
    private String prenomEtudiant;

    // Constructeur

    public Etudiant(int idEtudiant, String prenomEtudiant) {
        this.idEtudiant = idEtudiant;
        this.prenomEtudiant = prenomEtudiant;
    }

    // Getters and Setters

    public int getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getPrenomEtudiant() {
        return prenomEtudiant;
    }

    public void setPrenomEtudiant(String prenomEtudiant) {
        this.prenomEtudiant = prenomEtudiant;
    }


//    public Etudiant() {
//
//    }
//
//    public Etudiant(int unId, String unPrenom) {
//        this.idEtudiant = unId;
//        this.prenomEtudiant = unPrenom;
//    }
//
//    // Guetters + Setters (Principe d'encapsulation)
//
//    public int getIdEtudiant() {
//        return idEtudiant;
//    }
//
//    public void setIdEtudiant(int unNouvelId) {
//        idEtudiant = unNouvelId;
//    }

}
