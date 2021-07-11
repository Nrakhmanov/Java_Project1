package Replets.getter_and_setter;

public class Db {
    public Db(String data, int yint) {
        this.data = data;
        this.yint = yint;
    }
    // Do not touch

    private String data;
    private int yint;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getYint() {
        return yint;
    }

    public void setYint(int yint) {
        this.yint = yint;
    }
}
