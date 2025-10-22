public class Våpen extends Funngjenstand {
    private String typeVåpen;
    private String materiale;
    private int vekt;

    public Våpen(int id, String koordinater, int personId, String dato, int arstall, Integer museumId, String typeVåpen, String materiale, int vekt) {
        super(id, koordinater, personId, dato, arstall, museumId);
        this.typeVåpen = typeVåpen;
        this.materiale = materiale;
        this.vekt = vekt;
    }

    public String getTypeVåpen() {
        return typeVåpen;
    }

    public String getMateriale() {
        return materiale;
    }

    public int getVekt() {
        return vekt;
    }

    @Override
    public String getType() {
        return "Våpen";
    }

    @Override
    public String getEgenskaper() {
        return "Type Våpen: " + typeVåpen + ", Materiale: " + materiale + ", Vekt: " + vekt;
    }
}
