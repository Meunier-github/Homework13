public class FacultyHufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public FacultyHufflepuff(String name, int magiс, int transgression, int diligence, int loyalty, int honesty) {
        super(name, magiс, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() + " FacultyHufflepuff{" +
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    public void compareStudent(Object o) {
        if (getClass() != o.getClass()) {
            System.out.println("Студенты учатся на разных факультетах");
            return;
        }
        FacultyHufflepuff that = (FacultyHufflepuff) o;
        int sumThis = this.diligence + this.honesty + this.loyalty;
        int sumThat = that.diligence + that.honesty + that.loyalty;
        if (sumThat > sumThis) {
            System.out.println(that.getName() + " лучший Пуффендуец, чем " + this.getName());
        } else {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + that.getName());
        }

    }
}
