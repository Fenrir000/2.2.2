package web.model;

public class Car {
    private int number;
    private String model;
    private long id;

    public Car(int number, String model, int id) {
        this.number = number;
        this.model = model;
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
