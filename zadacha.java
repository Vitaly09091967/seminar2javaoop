/* Принципы ООП Абстракция и интерфейсы. Пример проектирования
Создать класс Создайте интерфейсы Soundable, Runnable, Flyable, Swimable. 
У интерфейсов должны быть методы получения скорости заданного действия.

Добавьте наследников этим интерфейсам, но таким образом,
чтобы у каждого интерфейса было минимум по два наследника (при 
необходимости, добавьте в приложение новые классы)

Создать класс Doctor и подумать над его поведением. Создать 
класс Nurse(медсестра) и подумать над его поведением.

У ветеринарной клиники добавьте методы получения всех бегающих, 
всех плавающих, всех говорящих и всех летающих. */


// Определение интерфейсов
interface Soundable {
    int getSoundSpeed();
}

interface Runnable {
    int getRunningSpeed();
}

interface Flyable {
    int getFlyingSpeed();
}

interface Swimable {
    int getSwimmingSpeed();
}

// Реализация интерфейсов
class Dog implements Soundable, Runnable {
    @Override
    public int getSoundSpeed() {
        return 10; // Произвольная скорость издаваемого звука собаки
    }

    @Override
    public int getRunningSpeed() {
        return 20; // Произвольная скорость бега собаки
    }
}

class Bird implements Soundable, Flyable {
    @Override
    public int getSoundSpeed() {
        return 5; // Произвольная скорость издаваемого звука птицы
    }

    @Override
    public int getFlyingSpeed() {
        return 50; // Произвольная скорость полета птицы
    }
}

class Fish implements Swimable {
    @Override
    public int getSwimmingSpeed() {
        return 30; // Произвольная скорость плавания рыбы
    }
}

// Классы Doctor и Nurse
// Класс Doctor
class Doctor {
   public void treatAnimal(Soundable animal) {
       System.out.println("Doctor is treating an animal.");
       // поведение доктора
   }
}

// Класс Nurse
class Nurse {
   public void careForAnimal(Swimable animal) {
       System.out.println("Nurse is caring for an animal.");
       // поведение медсестры
   }
}



// Ветеринарная клиника
class VeterinaryClinic {
    private List<Soundable> soundableAnimals;
    private List<Runnable> runnableAnimals;
    private List<Flyable> flyableAnimals;
    private List<Swimable> swimableAnimals;

    public VeterinaryClinic(List<Soundable> soundableAnimals, List<Runnable> runnableAnimals,
                            List<Flyable> flyableAnimals, List<Swimable> swimableAnimals) {
        this.soundableAnimals = soundableAnimals;
        this.runnableAnimals = runnableAnimals;
        this.flyableAnimals = flyableAnimals;
        this.swimableAnimals = swimableAnimals;
    }

    public List<Runnable> getAllRunners() {
        return runnableAnimals;
    }

    public List<Swimable> getAllSwimmers() {
        return swimableAnimals;
    }

    public List<Soundable> getAllSounders() {
        return soundableAnimals;
    }

    public List<Flyable> getAllFlyers() {
        return flyableAnimals;
    }
}




