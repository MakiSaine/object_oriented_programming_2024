public abstract class Funngjenstand {
    private int id;
    private String koordinater;
    private int personId;
    private String dato;
    private int arstall;
    private Integer museumId;

    public Funngjenstand(int id, String koordinater, int personId, String dato, int arstall, Integer museumId) {
        this.id = id;
        this.koordinater = koordinater;
        this.personId = personId;
        this.dato = dato;
        this.arstall = arstall;
        this.museumId = museumId;
    }

    public int getId() {
        return id;
    }

    public String getKoordinater() {
        return koordinater;
    }

    public int getPersonId() {
        return personId;
    }

    public String getDato() {
        return dato;
    }

    public int getArstall() {
        return arstall;
    }

    public Integer getMuseumId() {
        return museumId;
    }

    public abstract String getType();

    public abstract String getEgenskaper();
}
