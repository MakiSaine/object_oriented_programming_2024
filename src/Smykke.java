public class Smykke extends Funngjenstand {
    private String typeSmykke;
    private int verdiEstimat;
    private String bildeFilnavn;

    public Smykke(int id, String koordinater, int personId, String dato, int arstall, Integer museumId, String typeSmykke, int verdiEstimat, String bildeFilnavn) {
        super(id, koordinater, personId, dato, arstall, museumId);
        this.typeSmykke = typeSmykke;
        this.verdiEstimat = verdiEstimat;
        this.bildeFilnavn = bildeFilnavn;
    }

    public String getTypeSmykke() {
        return typeSmykke;
    }

    public int getVerdiEstimat() {
        return verdiEstimat;
    }

    public String getBildeFilnavn() {
        return bildeFilnavn;
    }

    @Override
    public String getType() {
        return "Smykke";
    }

    @Override
    public String getEgenskaper() {
        return "Type Smykke: " + typeSmykke + ", Verdi Estimat: " + verdiEstimat + ", Bilde Filnavn: " + bildeFilnavn;
    }
}
