package technology;

public class Abstract {
    private int idCounter = 1;
    private int id;

    public Abstract() {
        this.id = idCounter++;

    }
    public int getId() {
        return id;
    }

}
