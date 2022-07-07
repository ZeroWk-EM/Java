package market;

public class Main {
    public static void main(String[] args) {
        Catalog<Furniture> catalogFurniture = new Catalog<Furniture>();

        Furniture desk = new Furniture("Scrivania Ikea", 99.5, 6.8, 9.9, 10.00);
        Furniture chair = new Furniture("Lilla Chair", 350.00, 4.6, 22.5, 1.5);
        Furniture lamp = new Furniture("Lava Lamp", 650.00, 4.1, 72.5, 10.5);

        catalogFurniture.addArticle(desk);
        catalogFurniture.addArticle(chair);
        catalogFurniture.addArticle(lamp);

        System.out.println(catalogFurniture);

        System.out.println("\n ========= Prezzi sotto una certa soglia ================");
        System.out.println(catalogFurniture.getArticleCatalogUnderPrice(400.00));
    }

}
