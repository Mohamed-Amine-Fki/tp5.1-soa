package serveur;

import jakarta.xml.ws.Endpoint;
import service.BanqueService;

public class ServeurJWS {
    public static void main(String[] args) {
        //specifier l'URL à laquelle vous souhaitez publier le service.
        String url ="http://localhost:8084/";
        /* utiliser  Endpoint.publish() pour faire le deploiement de service web à l'URL specifiée
         et utiliser l'implementation de la classe 'BanqueService() pour gérer les requetes */
        Endpoint.publish(url,new BanqueService());
        // afficher l'URL à laquelle le service web a été publié
        System.out.println(url);
    }
}