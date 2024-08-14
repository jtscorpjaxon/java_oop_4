public class Loudspeaker extends Sounds{
    String loudspeakerTuri;

    Loudspeaker(String nomi, int quvvati, int narxi, String loudspeakerTuri) {
        super(nomi, quvvati, narxi);
        this.loudspeakerTuri = loudspeakerTuri;
    }

    public void printInfo() {
        System.out.println("Loudspeaker nomi: " + this.nomi + "\nLoudspeaker quvvati: " + this.quvvati + "\nLoudspeaker narxi: " + this.narxi + "\nLoudspeaker turi: " + this.loudspeakerTuri);
    }
    public void setLoudspeakerTuri(String loudspeakerTuri) {
        this.loudspeakerTuri = loudspeakerTuri;
    }
    public String getLoudspeakerTuri() {
        return loudspeakerTuri;
    }

}
