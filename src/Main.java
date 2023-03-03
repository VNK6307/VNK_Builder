public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setLocation("Сидней")
                .build();
        System.out.println("Мама: " + mom + ".");

        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();

        System.out.println("У " + mom.getName() + " " + mom.getSurname() + " есть сын " + son.getName() + ".");

        Person papa = new PersonBuilder()
                .setName("Николай")
//                .setSurname("Вольф")
                .setAge(36)
                .setLocation("Сидней")
                .build();
        System.out.println("Папа: " + papa + ".");
        papa.happyBirthday();
        System.out.println("Новый возраст папы: " + papa.getAge() + " лет.");


        Person grandpa = null;
        try {
            grandpa = new PersonBuilder()
                    .setName("Василий")
                    .setSurname("Вольф")
//                    .setAge(67)
                    .setLocation("Москва")
                    .build();
            System.out.println("Дедушка: " + grandpa + ".");
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
//        grandpa.happyBirthday();
//        System.out.println(grandpa.getAge());
//
//        try {
//            Person momSister = new PersonBuilder()
//                    .setName("Камила")
//                    .setSurname("Сергеева")
//                    .setAge(- 10)
//                    .setLocation("Мельбурн")
//                    .build();
//            System.out.println("Сестра: " + momSister + ".");
//        } catch (IllegalStateException e) {
//            e.printStackTrace();
//        }
    }// main
}// class
