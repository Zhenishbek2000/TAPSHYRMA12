public class Main {
    public static void main(String[] args) {
        University university = new University();
        university.setGroup("P-1-18");
        university.setHeadman("Asamgaziev");
        university.setAmount(25);

        University university1 = new University();
        university1.setGroup("P-1-19");
        university1.setHeadman("Jenishbekov");
        university1.setAmount(25);

        University university2 = new University();
        university2.setGroup("P-1-20");
        university2.setHeadman("Omurbekov");
        university2.setAmount(25);


        University[] universities={university,university1,university2};


        for (University univer:universities) {
            System.out.println();
            System.out.println(univer.getGroup());
            System.out.println(univer.getHeadman());
            System.out.println(univer.getAmount());

        }
        System.out.println("----------------------------");
    School school = new School();
        school.setPupils("Asanov Azamat");
        school.setClasssMonitor("Altynai");
        school.setAmount(18);

        School school1 = new School();
        school1.setPupils("Ergeshov Aman");
        school1.setClasssMonitor("Zarina");
        school1.setAmount(28);

        School school2 = new School();
        school2.setPupils("Rysbekov Kairat");
        school2.setClasssMonitor("Kuttubek");
        school2.setAmount(25);

        School[]schools={school,school1,school2};


        for (School school3:schools) {
            System.out.println( );
            System.out.println(school3.getPupils());
            System.out.println(school3.getClasssMonitor());
            System.out.println(school3.getAmount());

        }
        Car car= new Car();
        car.setMarca("Honda");
        car.setName("Fit");
        car.setSpeed(180);

        Car car1= new Car();
        car1.setMarca("Honda");
        car1.setName("Djaz");
        car1.setSpeed(160);


        Car car2= new Car();
        car2.setMarca("Honda");
        car2.setName("Camry");
        car2.setSpeed(280);
        System.out.println("--------------------------------");
        Car[]cars ={car,car1,car2};


        for (Car car3:cars) {
            System.out.println();
            System.out.println(car3.getMarca());
            System.out.println(car3.getName());
            System.out.println(car3.getSpeed());

        }
        Person person =new Person();
        person.setName("Medina");
        person.setAge(17);
        person.setGender("Girl");

        Person person1 =new Person();
        person1.setName("Nuriza");
        person1.setAge(25);
        person1.setGender("Girl");

        Person person2 =new Person();
        person2.setName("Nargiza");
        person2.setAge(27);
        person2.setGender("Girl");
        System.out.println("----------------------------------");

        Person[]people={person,person1,person2};
        for (Person person3:people) {
            System.out.println();
            System.out.println(person3.getName());
            System.out.println(person3.getAge());
            System.out.println(person3.getGender());

        }


    }
    }