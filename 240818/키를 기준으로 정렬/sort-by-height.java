import java.util.*;

class Person implements Comparable<Person>{ 
    String name;
    int height, weight;

    public Person(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void printPerson(){
        System.out.println(this.name+" "+this.height+" "+this.weight);
    }

    @Override
    public int compareTo(Person person){
        return this.height - person.height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Person[] person = new Person[n];

        for (int i=0; i<n; i++){
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();

            person[i] = new Person(name, height, weight);
        }

        Arrays.sort(person);

        for(int i=0; i<n; i++){
            person[i].printPerson();
        }
    }
}