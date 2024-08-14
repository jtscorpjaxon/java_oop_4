public class Lor extends Doctor{
    String quloq;
    String burun;
    String tomoq;

    public Lor(int id, String FIO, String mutaxassisligi, int tajribaasi) {
        super(id, FIO, mutaxassisligi, tajribaasi);
    }
    public Lor(int id, String FIO, String mutaxassisligi, int tajribaasi, String quloq, String burun, String tomoq) {
        super(id, FIO, mutaxassisligi, tajribaasi);
        this.quloq = quloq;
        this.burun = burun;
        this.tomoq = tomoq;
    }
    //getters and setters
    public String getQuloq() {
        return this.quloq;
    }
    public void setQuloq(String quloq) {
        this.quloq = quloq;
    }
    public String getBurun() {
        return this.burun;
    }
    public void setBurun(String burun) {
        this.burun = burun;
    }
    public String getTomoq() {
        return this.tomoq;
    }
    public void setTomoq(String tomoq) {
        this.tomoq = tomoq;
    }
    public void printInfo(){
        System.out.println("ID: " + this.id + "\nFIO: " + this.FIO + "\nMutaxassisligi: " + this.mutaxassisligi + "\nTajriba aysi: " + this.tajribaasi + "\nQuloq: " + this.quloq + "\nBurun: " + this.burun + "\nTomoq: " + this.tomoq);
    }
}
