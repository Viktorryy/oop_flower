public class Main {
    public static void main(String[] args) {

        Flower[] flower = new Flower[4];
        flower[0] = new Flower("Роза обыкновенная", "Голландии", 35.59f, 3);
        flower[1] = new Flower("Хризантема", "", 15, 5);
        flower[2] = new Flower("Пион", "Англия", 69.9f, 1);
        flower[3] = new Flower("Гипсофила", "Турция", 19.5f, 10);
        System.out.println("    Цветы");

        for (int i = 0; i < flower.length; i++) {
            System.out.println(flower[i]);
        }

        System.out.println("    Букеты");

            Flower.Bouquet[] bouquet = new Flower.Bouquet[3];
            bouquet[0] = new Flower.Bouquet(0, 3, 3, 3, 0, 0);
            bouquet[1] = new Flower.Bouquet(11, 0, 7, 7, 0, 0);
            bouquet[2] = new Flower.Bouquet(0, 5, 3, 1, 0, 0);

            for (int j = 0; j < bouquet.length; j++) {
                float priceTime = Flower.Bouquet.priceBouquet(bouquet[j], flower);
                bouquet[j].setPrice(priceTime);
                int termTime = Flower.Bouquet.termBouquet(bouquet[j], flower);
                bouquet[j].setTerm(termTime);

                System.out.println(bouquet[j]);
            }


    }
}