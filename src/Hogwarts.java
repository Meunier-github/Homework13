public class Hogwarts {
    private String name;
    private int magiс;
    private int transgression;

    public Hogwarts(String name, int magiс, int transgression) {
        this.name = name;
        this.magiс = magiс;
        this.transgression = transgression;
    }

    public int getMagiс() {
        return magiс;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMagiс(int magiс) {
        this.magiс = magiс;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "magiс=" + magiс +
                ", transgression=" + transgression +
                '}';
    }

    public void compareStudentHogwarts(Object o) {
        Hogwarts that = (Hogwarts) o;

        if (that.magiс > this.magiс) {
            System.out.println(that.getName() + " обладает большей мощностью магии, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " обладает большей мощностью магии, чем " + that.getName());
        }
        if (that.transgression > this.transgression) {
            System.out.println(that.getName() + " обладает большей мощностью трансгрессии, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " обладает большей мощностью трансгрессии, чем " + that.getName());
        }

    }

}

