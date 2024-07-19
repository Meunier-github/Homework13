import java.util.Objects;

public class FacultyGryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public FacultyGryffindor(String name,int magiс, int transgression, int nobility, int honor, int bravery) {
        super(name,magiс, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString()+
                " FacultyGryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacultyGryffindor that = (FacultyGryffindor) o;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }

    public void compareStudent(Object o) {
        if (getClass() != o.getClass()) {
            System.out.println("Студенты учатся на разных факультетах");
            return;
        }
        FacultyGryffindor that = (FacultyGryffindor) o;
        int sumThis = this.bravery + this.honor + this.nobility;
        int sumThat = that.bravery + that.honor + that.nobility;
        if (sumThat > sumThis) {

            System.out.println(that.getName() + " лучший Гриффендорец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " лучший Гриффендорец, чем " + that.getName());
        }

    }

}
