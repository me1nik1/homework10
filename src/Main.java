public class Main {
    public static void main(String[] args) {

        {
            System.out.println("Задание 1");
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";
            String fullName = lastName + firstName + middleName;
            System.out.println("Ф. И. О. сотрудника — " + fullName);
        }
        System.out.println();
        {
            System.out.println("Задание 2");
            String fullName = "Ivanov Ivan Ivanovich";
            String fullName2 = fullName.toUpperCase();
            System.out.println(fullName2);
        }
        System.out.println();
        {
            System.out.println("Задание 3");
            String fullName = "Иванов Семён Семёнович";
            String fullNameTrue = fullName.replace("ё", "е");
            System.out.println(fullNameTrue);
        }
    }
}