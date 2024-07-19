public class FacultyRavenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public FacultyRavenclaw(String name, int magiс, int transgression, int intelligence, int wisdom, int wit, int creativity) {
        super(name, magiс, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString() +
                " FacultyRavenclaw{" +
                "intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }

    public void compareStudent(Object o) {
        if (getClass() != o.getClass()) {
            System.out.println("Студенты учатся на разных факультетах");
            return;
        }
        FacultyRavenclaw that = (FacultyRavenclaw) o;
        int sumThis = this.creativity + this.intelligence + this.wisdom + this.wit;
        int sumThat = that.creativity + that.intelligence + that.wisdom + that.wit;
        if (sumThat > sumThis) {
            System.out.println(that.getName() + " лучший Когтевранец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + that.getName());
        }
    }


}
