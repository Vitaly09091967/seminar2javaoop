// Использование классов и интерфейсов
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Fish fish = new Fish();

        List<Soundable> soundableAnimals = new ArrayList<>();
        soundableAnimals.add(dog);
        soundableAnimals.add(bird);

        List<Runnable> runnableAnimals = new ArrayList<>();
        runnableAnimals.add(dog);

        List<Flyable> flyableAnimals = new ArrayList<>();
        flyableAnimals.add(bird);

        List<Swimable> swimableAnimals = new ArrayList<>();
        swimableAnimals.add(fish);

        VeterinaryClinic clinic = new VeterinaryClinic(soundableAnimals, runnableAnimals, flyableAnimals, swimableAnimals);

        List<Runnable> runners = clinic.getAllRunners();
        List<Swimable> swimmers = clinic.getAllSwimmers();
        List<Soundable> sounders = clinic.getAllSounders();
        List<Flyable> flyers = clinic.getAllFlyers();

        // Использование списков с животными по соответствующим интерфейсам
        for (Runnable runner : runners) {
            System.out.println("Animal running speed: " + runner.getRunningSpeed());
        }

        for (Swimable swimmer : swimmers) {
            System.out.println("Animal swimming speed: " + swimmer.getSwimmingSpeed());
        }

        for (Soundable sounder : sounders) {
            System.out.println("Animal sound speed: " + sounder.getSoundSpeed());
        }

        for (Flyable flyer : flyers) {
            System.out.println("Animal flying speed: " + flyer.getFlyingSpeed());
        }
    }
}
