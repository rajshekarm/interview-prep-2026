
import java.time.LocalDateTime;
import java.util.*;


// Problem Statement:
// Imagine you're building a Spring Boot application where customer support tickets must be sorted according to these business rules: 
// 1.VIP customers first. 
// 2.Among tickets with the same VIP status, critical tickets first. 
// 3.If priority is the same, overdue tickets first. 
// 4.If everything else is equal, sort by the oldest creation time. 
enum Priority {
    CRITICAL(1),
    HIGH(2),
    NORMAL(3);

    private final int rank;

    Priority(int rank) {
        this.rank = rank;
    }

    public int rank() {
        return rank;
    }
}

record Ticket(
    String id,
    boolean vip,
    Priority priority,
    boolean overdue,
    LocalDateTime createdAt
) {}

public class Complex {
    public static void main(String[] args) {

        List<Ticket> tickets = new ArrayList<>(List.of(
            new Ticket("T1", false, Priority.CRITICAL, true,
                LocalDateTime.parse("2026-10-20T10:00:00")),
            new Ticket("T2", true, Priority.NORMAL, false,
                LocalDateTime.parse("2026-10-22T10:00:00")),
            new Ticket("T3", true, Priority.CRITICAL, true,
                LocalDateTime.parse("2026-10-21T10:00:00")),
            new Ticket("T4", true, Priority.CRITICAL, false,
                LocalDateTime.parse("2026-10-19T10:00:00"))
        ));

        Comparator<Ticket> ticketComparator =
            Comparator.comparing(
                Ticket::vip, Comparator.reverseOrder()
            )
            .thenComparingInt(t -> t.priority().rank())
            .thenComparing(
                Ticket::overdue, Comparator.reverseOrder()
            )
            .thenComparing(Ticket::createdAt);

        tickets.sort(ticketComparator);

        tickets.forEach(System.out::println);
    }
}
