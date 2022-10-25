import java.math.BigDecimal;

import static java.lang.Integer.MAX_VALUE;

public class Flower {
    private String flower;
    private String country;
    private float cost;
    private int lifeSpan;

    public Flower(String flower, String country, float cost, int lifeSpan) {
        this.flower = validOrDefault(flower, "белый");
        this.country = validOrDefault(country, "Россия");
        this.cost = cost >= 0 ? cost : 1;
        this.lifeSpan = lifeSpan >= 0 ? lifeSpan : 3;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "flower='" + flower + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + cost +
                ", lifeSpan=" + lifeSpan +
                '}';
    }

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        if (flower == null || flower.isEmpty()) {
            this.flower = "Белый";
        } else {
            this.flower = flower;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }

    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        if (cost == 0 || cost < 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }

    private String validOrDefault(String value, String valueDefault) {
        if (value == null || value.isBlank()) {
            return valueDefault;
        } else {
            return value;
        }
    }

    public static class Bouquet {
        private int flowerRose;
        private int flowerPeony;
        private int flowerChrysan;
        private int flowerGypsophila;
        private float price;
        private int term;

        public Bouquet(int flowerRose, int flowerPeony, int flowerChrysan, int flowerGypsophila, float price, int term) {
            this.flowerRose = flowerRose;
            this.flowerPeony = flowerPeony;
            this.flowerChrysan = flowerChrysan;
            this.flowerGypsophila = flowerGypsophila;
            this.price = price;
            this.term = term;
        }

        public static float priceBouquet(Flower.Bouquet bouquet, Flower[] flowers){
                                         //float pR, float pP, float pC, float pG){
            float price1=0;
            price1 = bouquet.getFlowerRose() * flowers[0].getCost()+
                    bouquet.getFlowerChrysan() * flowers[1].getCost() +
                    bouquet.getFlowerPeony() * flowers[2].getCost()+
                    bouquet.getFlowerGypsophila() * flowers[3].getCost();
            price1 = (float) (price1 * (1+0.1)); // 10% НАЦЕНКА ФЛОРИСТУ
            return (price1);
        }

        public static int termBouquet(Flower.Bouquet bouquet, Flower[] flowers){
            //float pR, float pP, float pC, float pG){
            int term1 = MAX_VALUE;
            if (bouquet.getFlowerRose()!=0 && term1>flowers[0].getLifeSpan()){
                term1 = flowers[0].getLifeSpan();
            }
            if (bouquet.getFlowerChrysan()!=0 && term1>flowers[1].getLifeSpan()){
                term1 = flowers[1].getLifeSpan();
            }
            if (bouquet.getFlowerPeony()!=0 && term1>flowers[2].getLifeSpan()){
                term1 = flowers[2].getLifeSpan();
            }
            if (bouquet.getFlowerGypsophila()!=0 && term1>flowers[3].getLifeSpan()){
                term1 = flowers[3].getLifeSpan();
            }

            return term1;
        }

        @Override
        public String toString() {
            return "Букет состоит из {" +
                    "flowerRose=" + flowerRose +
                    ", flowerPeony=" + flowerPeony +
                    ", flowerChrysan=" + flowerChrysan +
                    ", flowerGypsophila=" + flowerGypsophila +
                    "}, цена букета=" + price +
                    ", срок=" + term;

        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public int getTerm() {
            return term;
        }

        public void setTerm(int term) {
            this.term = term;
        }

        public int getFlowerRose() {
            return flowerRose;
        }

        public void setFlowerRose(int flowerRose) {
            this.flowerRose = flowerRose;
        }

        public int getFlowerPeony() {
            return flowerPeony;
        }

        public void setFlowerPeony(int flowerPeony) {
            this.flowerPeony = flowerPeony;
        }

        public int getFlowerChrysan() {
            return flowerChrysan;
        }

        public void setFlowerChrysan(int flowerChrysan) {
            this.flowerChrysan = flowerChrysan;
        }

        public int getFlowerGypsophila() {
            return flowerGypsophila;
        }

        public void setFlowerGypsophila(int flowerGypsophila) {
            this.flowerGypsophila = flowerGypsophila;
        }
    }




}
