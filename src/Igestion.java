public interface Igestion <T>
{
    void ajouterEmployes(T t);
    public boolean rechercheEmploye(String nom);
    public boolean rechercheEmploye(T t);
    public void supprimerEmploye(T t);
    public void displayEmployes();
    public void trierEmployesParld();//comparable
    public void trierEmployesParNom_depEtGrade();//comprator


}
