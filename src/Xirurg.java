public class Xirurg extends Doctor{
    String yonalishi;

    public Xirurg(int id, String FIO, String mutaxassisligi, int tajribaasi) {
        super(id, FIO, mutaxassisligi, tajribaasi);
    }
    public Xirurg(int id, String FIO, String mutaxassisligi, int tajribaasi, String yonalishi) {
        super(id, FIO, mutaxassisligi, tajribaasi);
        this.yonalishi = yonalishi;
    }
    public void setYonalishi(String yonalishi) {
        this.yonalishi = yonalishi;
    }
    public String getYonalishi() {
        return this.yonalishi;
    }
    public void printInfo(){
        super.print();
        System.out.println("Yonalishi: " + yonalishi);
    }
}
