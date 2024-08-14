public class Laptop extends Computers{
    String Brand;
    float vazni;
    String battery;
    String ekranDiagonali;
    String videokarta;

    public Laptop(String xotirasi, String protseessor, String RAM) {
        super(xotirasi, protseessor, RAM);
    }
    public Laptop(String xotirasi, String protseessor, String RAM, String Brand, float vazni, String battery, String ekranDiagonali, String videokarta) {
        super(xotirasi, protseessor, RAM);
        this.Brand = Brand;
        this.vazni = vazni;
        this.battery = battery;
        this.ekranDiagonali = ekranDiagonali;
        this.videokarta = videokarta;
    }
    public void LaptopInfo(){
        System.out.println("Laptop haqida: \n" +
                "Brand: " + Brand + "\n" +
                "Vazni: " + vazni + "\n" +
                "Battery: " + battery + "\n" +
                "Ekran Diagonali: " + ekranDiagonali + "\n" +
                "Videokarta: " + videokarta + "\n" +
                "Xotirasi: " + xotirasi + "\n" +
                "Protseessor: " + protseessor + "\n" +
                "RAM: " + RAM);
    }

    //getters and setters
    public String getBrand() {
        return this.Brand;
    }
    public void setBrand(String Brand) {
        this.Brand = Brand;
    }
    public float getVazni() {
        return this.vazni;
    }
    public void setVazni(float vazni) {
        this.vazni = vazni;
    }
    public String getBattery() {
        return this.battery;
    }
    public void setBattery(String battery) {
        this.battery = battery;
    }
    public String getEkranDiagonali() {
        return this.ekranDiagonali;
    }
    public void setEkranDiagonali(String ekranDiagonali) {
        this.ekranDiagonali = ekranDiagonali;
    }
    public String getVideokarta() {
        return this.videokarta;
    }
    public void setVideokarta(String videokarta) {
        this.videokarta = videokarta;
    }
}
