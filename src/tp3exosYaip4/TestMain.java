package tp3exosYaip4;

public class TestMain {
    public static void main(String[] args) {
    	
    	// Ici la méthode toString n'est pas testée (car elle renvoie la même chose que si on affiche l'objet lui même
    	
        // Test Person class
        Person person = new Person("Alice", "123 Main Street");
        System.out.println(person);
        person.setAddress("456 Elm Street");
        System.out.println(person.getAddress());

        // Test Student class
        Student student = new Student("Bob", "789 Oak Avenue", "Computer Science", 2, 1500.50);
        System.out.println(student);
        student.setProgram("Mathematics");
        student.setYear(3);
        student.setFee(1800.75);
        System.out.println(student);

        // Test Staff class
        Staff staff = new Staff("Charlie", "101 Pine Road", "High School", 2500.00);
        System.out.println(staff);
        staff.setSchool("University");
        staff.setPay(3000.00);
        System.out.println(staff);
        
        // Test Animal class
        Animal animal = new Animal("Generic Animal");
        System.out.println(animal);
        
        // Test Cat class
        Mammal mammal = new Mammal("Generic Mammal");
        System.out.println(mammal);

        // Test Dog class
        Cat cat = new Cat("Whiskers");
        System.out.println(cat);
        cat.greets();

        // Test Dog class
        Dog dog1 = new Dog("Buddy");
        System.out.println(dog1);
        dog1.greets();

        Dog dog2 = new Dog("Rex");
        System.out.println(dog2);
        dog1.greets(dog2);
    }
}