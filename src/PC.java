public class PC extends Computers{
    String keysTuri;
    String sovutishTizimi;

    public PC(String xotirasi, String protseessor, String RAM, String keysTuri, String sovutishTizimi) {
        super(xotirasi, protseessor, RAM);
        this.keysTuri = keysTuri;
        this.sovutishTizimi = sovutishTizimi;
    }
    public void print(){
        super.print();
        System.out.println("Keys Turi: " + keysTuri);
        System.out.println("Sovutish Tizimi: " + sovutishTizimi);
    }
    //getters and setters
    public String getKeysTuri() {
        return this.keysTuri;
    }
    public void setKeysTuri(String keysTuri) {
        this.keysTuri = keysTuri;
    }
    public String getSovutishTizimi() {
        return this.sovutishTizimi;
    }
    public void setSovutishTizimi(String sovutishTizimi) {
        this.sovutishTizimi = sovutishTizimi;
    }

}
