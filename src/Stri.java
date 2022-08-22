import java.util.Arrays;

public class Stri {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Task 1");
        System.out.println("ФИО сотрудника — " + fullName);

        System.out.println("Task 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println("Task 3");
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.replace("ё", "е"));

        System.out.println("Task 4");        
        String[] fio = separateFullName(fullName);
        System.out.println("Имя сотрудника — " + fio[0]);
        System.out.println("Фамилия сотрудника — " + fio[2]);
        System.out.println("Отчество сотрудника — " + fio[1]);

        System.out.println("Task 5");
        fullName = "ivanov ivan ivanovich";
        System.out.println(rightName(fullName));

        System.out.println("Task 6");
        String first = "135";
        String second = "246";
        System.out.println("Данные строки — " + mergeStrings(first, second));

        System.out.println("Task 7");
        String str = "aabccddefgghiijjkk";
        System.out.println("Чистая строка без дубликатов - " + cleanString(str));

    }

    private static String[] separateFullName(String fullName) {
        String firstName = fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" "));
        String middleName = fullName.substring(fullName.lastIndexOf(" "));
        String lastName = fullName.substring(0, fullName.indexOf(" "));

        return new String[] {firstName, middleName, lastName};
    }

    private static String rightName(String fullName) {
        return fullName.toUpperCase().charAt(0) +
                fullName.substring(1, (fullName.indexOf(" ") + 1)) +
                fullName.toUpperCase().charAt((fullName.indexOf(" ") + 1)) +
                fullName.substring((fullName.indexOf(" ") + 2), (fullName.lastIndexOf(" ") + 1)) +
                fullName.toUpperCase().charAt((fullName.lastIndexOf(" ") + 1)) +
                fullName.substring((fullName.lastIndexOf(" ") + 2));
    }

    private static String mergeStrings(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        int length = Math.max(str1.length(), str2.length());

        for (int i = 0; i < length; i++) {
            if (str1.length() > i) {
                answer.append(str1.charAt(i));
            }
            if (str2.length() > i) {
                answer.append(str2.charAt(i));
            }
        }
        return answer.toString();
    }

    private static String cleanString(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder answer = new StringBuilder();

        Arrays.sort(charArray);
        answer.append(charArray[0]);

        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] != charArray[i - 1]) {
                answer.append(charArray[i]);
            }
        }
        return answer.toString();
    }
}
