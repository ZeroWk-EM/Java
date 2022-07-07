package market;

import java.util.*;

public class Catalog<E extends Article> {
    private List<E> articleCatalog;

    public Catalog() {
        this.articleCatalog = new ArrayList<E>();
    }

    public boolean addArticle(E article) {
        return articleCatalog.add(article);
    }

    public List<E> getArticleCatalogUnderPrice(double price) {
        // articleCatalog.size() serve per fargli creare una lista che non superi la
        // lista completa perche su 50 elementi per esempio il massimo che può stare
        // sotto una certa soglia e 50
        List<E> articlesUnderPrice = new ArrayList<E>(articleCatalog.size());
        // Scorriamo tutta la lista
        for (E article : articleCatalog) {
            // Se il prezzo dell'iesimo articolo e inferiore o uguale all prezzo desiderato
            if (article.getPrice() <= price) {
                // andiamo ad aggiungere quell'articolo nella lista articlesUnderPrice
                articlesUnderPrice.add(article);
            }
        }
        return articlesUnderPrice;
    }

    @Override
    public String toString() {
        return "Catalogo\n" + articleCatalog;
    }
}
