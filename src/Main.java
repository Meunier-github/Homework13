public class Main {
    public static void main(String[] args) {
        FacultyGryffindor harryPotter = new FacultyGryffindor("Harry Potter", 45, 45, 10, 54, 56);
        FacultyGryffindor hermioneGranger = new FacultyGryffindor("Hermione Granger", 50, 54, 20, 44, 50);
        FacultyGryffindor ronWeasley = new FacultyGryffindor("Ron Weasley", 60, 40, 30, 48, 30);

        FacultySlytherin dracoMalfoy = new FacultySlytherin("Draco Malfoy", 45, 65, 65, 45, 78, 82, 45);
        FacultySlytherin grahamMontague = new FacultySlytherin("Graham Montague", 45, 56, 45, 78, 12, 53, 56);
        FacultySlytherin gregoryGoyle = new FacultySlytherin("Gregory Goyle", 89, 45, 32, 85, 78, 45, 45);

        FacultyHufflepuff zachariasSmith = new FacultyHufflepuff("Zacharias Smith", 45, 12, 45, 78, 89);
        FacultyHufflepuff cedricDiggory = new FacultyHufflepuff("Cedric Diggory", 85, 45, 32, 16, 75);
        FacultyHufflepuff justinFinchFletchley = new FacultyHufflepuff("Justin Finch Fletchley", 53, 17, 48, 59, 27);

        FacultyRavenclaw jujuChang = new FacultyRavenclaw("Juju Chang", 71, 65, 23, 45, 89, 4);
        FacultyRavenclaw padmaPatil = new FacultyRavenclaw("Padma Patil", 75, 99, 54, 25, 66, 35);
        FacultyRavenclaw marcusBelby = new FacultyRavenclaw("Marcus Belby", 45, 78, 78, 45, 12, 4);

        System.out.println("harryPotter = " + harryPotter.toString());
        System.out.println("hermioneGranger = " + hermioneGranger.toString());
        System.out.println("ronWeasley = " + ronWeasley.toString());
        System.out.println("dracoMalfoy = " + dracoMalfoy.toString());
        System.out.println("grahamMontague = " + grahamMontague.toString());
        System.out.println("gregoryGoyle = " + gregoryGoyle.toString());
        System.out.println("zachariasSmith = " + zachariasSmith.toString());
        System.out.println("cedricDiggory = " + cedricDiggory.toString());
        System.out.println("justinFinchFletchley = " + justinFinchFletchley.toString());
        System.out.println("jujuChang = " + jujuChang.toString());
        System.out.println("padmaPatil = " + padmaPatil.toString());
        System.out.println("marcusBelby = " + marcusBelby.toString());

        System.out.println("----------------------");

        harryPotter.compareStudent(hermioneGranger);
        dracoMalfoy.compareStudent(grahamMontague);
        zachariasSmith.compareStudent(cedricDiggory);
        jujuChang.compareStudent(marcusBelby);

        System.out.println("----------------------");

        harryPotter.compareStudentHogwarts(jujuChang);
    }
}