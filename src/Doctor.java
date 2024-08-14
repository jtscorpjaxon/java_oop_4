public class Doctor {
    int id;
    String FIO;
    String mutaxassisligi;
    int tajribaasi;

    public Doctor(int id, String FIO, String mutaxassisligi, int tajribaasi){
        this.id = id;
        this.FIO = FIO;
        this.mutaxassisligi = mutaxassisligi;
        this.tajribaasi = tajribaasi;
    }
    public void print(){
        System.out.println("ID: " + id + " FIO: " + FIO + " Mutaxassisligi: " + mutaxassisligi + " Tajribaasi: " + tajribaasi);
    }
    //getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFIO() {
        return this.FIO;
    }
    public void setFIO(String FIO) {
        this.FIO = FIO;
    }
    public String getMutaxassisligi() {
        return this.mutaxassisligi;
    }
    public void setMutaxassisligi(String mutaxassisligi) {
        this.mutaxassisligi = mutaxassisligi;
    }
    public int getTajribaasi() {
        return this.tajribaasi;
    }
    public void setTajribaasi(int tajribaasi) {
        this.tajribaasi = tajribaasi;
    }
}
