public class Main {
    public static void main(String[] args) {
        DataRetriever dataRetriever = new DataRetriever();
        System.out.println("Test 1 : Recherche d'une commande existante");
        try {
            // Supposons qu'il existe une commande avec cette référence
            String referenceExistante = "1";
            Order commande = dataRetriever.findOrderByReference(referenceExistante);

            System.out.println("✓ Commande trouvée !");

            System.out.println("   ID : " + commande.getId());
            System.out.println("   Date : " + commande.getCreationDatetime());
            System.out.println("   Type : " + commande.getTypeOrder());
            System.out.println("   Statut : " + commande.getStatus());

            if (commande.getDishOrderList() != null) {
                System.out.println("   Nombre de plats : " + commande.getDishOrderList().size());
            } else {
                System.out.println("   Aucun plat dans cette commande");
            }

        } catch (RuntimeException e) {
            System.out.println("✗ Erreur : " + e.getMessage());
        }
//        Dish saladeVerte = dataRetriever.findDishById(1);
//        System.out.println(saladeVerte);
//
//        Dish poulet = dataRetriever.findDishById(2);
//        System.out.println(poulet);
//
//        Dish rizLegume = dataRetriever.findDishById(3);
//        rizLegume.setPrice(100.0);
//        Dish newRizLegume = dataRetriever.saveDish(rizLegume);
//        System.out.println(newRizLegume); // Should not throw exception


//        Dish rizLegumeAgain = dataRetriever.findDishById(3);
//        rizLegumeAgain.setPrice(null);
//        Dish savedNewRizLegume = dataRetriever.saveDish(rizLegume);
//        System.out.println(savedNewRizLegume); // Should throw exception

        Ingredient laitue = dataRetriever.findIngredientById(1);
        System.out.println(laitue);

    }
}
