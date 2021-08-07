package fr.snooker4real.facturation.listeners;

import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent evenement) {
        System.out.println("Connexion");
    }

    /**
     * Patron Observateur/Observé
     */
    @Override
    public void sessionDestroyed(HttpSessionEvent evenement) {
        System.out.println("Déconnexion");
    }
}
