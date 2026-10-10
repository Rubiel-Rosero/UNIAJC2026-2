//este es el carrito
public class Carrito {

    private int id;

    public Carrito(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Carrito #" + id;
    }
}


