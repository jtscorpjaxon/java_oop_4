public class Computers extends Electronics {
    String xotirasi;
    String protseessor;
    String RAM;

    public Computers(String xotirasi, String protseessor, String RAM) {
        this.xotirasi = xotirasi;
        this.protseessor = protseessor;
        this.RAM = RAM;
    }
    //getters and setters
    public String getXotirasi() {
        return this.xotirasi;
    }
    public void setXotirasi(String xotirasi) {
        this.xotirasi = xotirasi;
    }
    public String getProtseessor() {
        return this.protseessor;
    }
    public void setProtseessor(String protseessor) {
        this.protseessor = protseessor;
    }
    public String getRAM() {
        return this.RAM;
    }

}
