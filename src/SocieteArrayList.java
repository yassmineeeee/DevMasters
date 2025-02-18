import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

public class SocieteArrayList implements Igestion <Employes> {

    private ArrayList<Employes> employes = new ArrayList<>();

    @Override
    public ajouterEmployes(Employes employe)
    {
        employes.add(employe);
    }
    @Override
    public void trierEmployesParNom_depEtGrade()
    {
        this.employes.sort(Comparator.comparing(Employes::getNom_dep)
                .thenComparing(Employes::getGrade));
        /*
        collections.sort(

        )
         */
    }

}
