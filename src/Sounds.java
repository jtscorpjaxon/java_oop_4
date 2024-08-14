public class Sounds extends Electronics{
    long MinChastotasi;
    long MaxChastotasi;
    int tovush_detsebali;
    String turi;

    Sounds(String nomi, int quvvati, int narxi) {
        super(nomi, quvvati, narxi);
    }
    Sounds(String nomi, int quvvati, int narxi, long MinChastotasi, long MaxChastotasi, int tovush_detsebali, String turi) {
        super(nomi, quvvati, narxi);
        this.MinChastotasi = MinChastotasi;
        this.MaxChastotasi = MaxChastotasi;
        this.tovush_detsebali = tovush_detsebali;
        this.turi = turi;
    }

    public Sounds() {

    }

    //setters and getters
    public long getMinChastotasi() {
        return this.MinChastotasi;
    }
    public void setMinChastotasi(long minChastotasi) {
        this.MinChastotasi = minChastotasi;
    }
    public long getMaxChastotasi() {
        return this.MaxChastotasi;
    }
    public void setMaxChastotasi(long maxChastotasi) {
        this.MaxChastotasi = maxChastotasi;
    }
    public int getTovush_detsebali() {
        return this.tovush_detsebali;
    }
    public void setTovush_detsebali(int tovush_detsebali) {
        this.tovush_detsebali = tovush_detsebali;
    }
    public String getTuri() {
        return this.turi;
    }
    public void setTuri(String turi) {
        this.turi = turi;
    }
}
