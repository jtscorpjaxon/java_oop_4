public class Subwoofer extends Sounds {
    String konstruksiyasi;
    int kolonkalari;
    public Subwoofer(String nomi, int quvvati, int narxi,String konstruksiyasi, int kolonkalari) {
        super(nomi, quvvati, narxi);
        this.konstruksiyasi = konstruksiyasi;
        this.kolonkalari = kolonkalari;
    }
    public void setKonstruksiyasi(String konstruksiyasi) {
        this.konstruksiyasi = konstruksiyasi;
    }
    public String getKonstruksiyasi() {
        return konstruksiyasi;
    }
    public void setKolonkalari(int kolonkalari) {
        this.kolonkalari = kolonkalari;
    }
    public int getKolonkalari() {
        return kolonkalari;
    }
    public void printInfo() {
        super.print();
        System.out.println("Konstruksiyasi: " + konstruksiyasi);
        System.out.println("Kolonkalari: " + kolonkalari);
    }
}
