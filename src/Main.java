import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Person> queue = new LinkedList<>();
        List<Person> play = generateClients();

        for (int i = 0; i < play.size(); i++) {
            queue.offer(play.get(i));
        }
        while (!queue.isEmpty()) {
            Person person = queue.poll();
            int start = person.getTickets();
            person.setTickets(start - 1);
            System.out.println(person.getName() + " " + person.getSurname() + " посетил аттракцион. Осталось билетов " + person.getTickets());
            if (person.getTickets() != 0) {
                queue.offer(person);
            }
        }
    }

    private static List<Person> generateClients() {
        LinkedList<Person> clients = new LinkedList<>();
        clients.add(new Person("Савелий", "Шишкин", 4));
        clients.add(new Person("Тамара", "Иванова", 2));
        clients.add(new Person("Василий", "Жуков", 7));
        clients.add(new Person("Зоя", "Иванова", 5));
        clients.add(new Person("Антон", "Николаев", 9));
        return clients;
    }
}