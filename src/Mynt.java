public class Mynt extends Funngjenstand {
    private int diameter;
    private String metall;

    public Mynt(int id, String koordinater, int personId, String dato, int arstall, Integer museumId, int diameter, String metall) {
        super(id, koordinater, personId, dato, arstall, museumId);
        this.diameter = diameter;
        this.metall = metall;
    }

    public int getDiameter() {
        return diameter;
    }

    public String getMetall() {
        return metall;
    }

    @Override
    public String getType() {
        return "Mynt";
    }

    @Override
    public String getEgenskaper() {
        return "Diameter: " + diameter + ", Metall: " + metall;
    }
}
