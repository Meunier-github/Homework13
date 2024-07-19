public class FacultySlytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public FacultySlytherin(String name, int magiс, int transgression, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magiс, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return super.toString() + " FacultySlytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                '}';
    }

    public void compareStudent(Object o) {
        if (getClass() != o.getClass()) {
            System.out.println("Студенты учатся на разных факультетах");
            return;
        }
        FacultySlytherin that = (FacultySlytherin) o;
        int sumThis = this.ambition + this.cunning + this.determination + this.resourcefulness + this.thirstForPower;
        int sumThat = that.ambition + that.cunning + that.determination + that.resourcefulness + that.thirstForPower;
        if (sumThat > sumThis) {
            System.out.println(that.getName() + " лучший Слизеринец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + that.getName());
        }
    }

}
