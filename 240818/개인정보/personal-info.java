import java.util.*;

class Person {
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " " + height + " " + String.format("%.1f", weight);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] people = new Person[5];

        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();

            people[i] = new Person(name, height, weight);
        }

        // 이름순으로 정렬
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.name.compareTo(p2.name);
            }
        });

        System.out.println("name");
        for (Person person : people) {
            System.out.println(person);
        }

        // 키가 큰 순으로 정렬
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p2.height - p1.height;
            }
        });

        System.out.println();
        System.out.println("height");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}