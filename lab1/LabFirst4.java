import java.util.Scanner;

public class LabFirst4 {
    //Задано текст, слова в якому розділені пробілами і розділовими знаками. Розробити програму,
// яка вилучає в кожному слові цього тексту всі попередні входження останньої літери.
// До прикладу є речення "Його армія чудовиськ і демонів наповнює країну, змушуючи людей жити страхом і недовірою." 
// після вилучення попередніх входжень, дане речення має виглядати так:
//  "Йго армія чудовиськ і демонів наповнює країну, змшуючи людей жти страхом і недовірою."
public static void main(String[] args) {
Scanner in = new Scanner(System.in,  "UTF-8");
System.out.print("Введіть текст: ");
String text = in.nextLine();
String result = "";
String word = "";

for (int i = 0; i < text.length(); i++) {
    char ch = text.charAt(i);

    if (Character.isLetter(ch)) {
        word += ch;
    } else {
        if (!word.isEmpty()) {
            char last = word.charAt(word.length() - 1);
            for (int j = 0; j < word.length() - 1; j++) {
                if (word.charAt(j) != last) {
                    result += word.charAt(j);
                }
            }
            result += last;
            word = "";
        }
        result += ch;
    }
}

if (!word.isEmpty()) {

    char last = word.charAt(word.length() - 1);
    for (int j = 0; j < word.length() - 1; j++) {
        if (word.charAt(j) != last) {
            result += word.charAt(j);
        }
    }

    result += last;
}
System.out.println("Результат:");
System.out.println(result);
in.close();
}
}
