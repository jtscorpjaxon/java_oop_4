public class Electronics {
    String nomi;
    int quvvati;
    int narxi;
    Electronics(String nomi, int quvvati, int narxi){
        this.nomi = nomi;
        this.quvvati = quvvati;
        this.narxi = narxi;
    }

    public Electronics() {

    }

    public void print(){
        System.out.println("Nomi: " + nomi + " Quvvati: " + quvvati + " Narxi: " + narxi);

    }
    public void setNomi(String nomi){
        this.nomi = nomi;
    }
    public void setQuvvati(int quvvati){
        this.quvvati = quvvati;
    }
    public void setNarxi(int narxi){
        this.narxi = narxi;
    }
    public String getNomi(){
        return this.nomi;
    }
    public int getQuvvati(){
        return this.quvvati;
    }
    public int getNarxi(){
        return this.narxi;
    }
}
