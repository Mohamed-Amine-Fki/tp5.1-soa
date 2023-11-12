package service;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService
public class BanqueService {

    @WebMethod
    public double conversion(@WebParam double montant) {
        return montant*3.36;
    }
    @WebMethod
    public List<Compte> getComptes(){
        List<Compte> comptes=new ArrayList<Compte>();
        Compte cp = new Compte( "123",400,new Date());
        Compte cp2= new Compte("145",500,new Date());
        comptes.add(cp);
        comptes.add(cp2);
        return comptes;
    }
}