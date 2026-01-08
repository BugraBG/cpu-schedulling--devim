import java.util.*;

public class FCFS {

    public static void run(List<Process> list) {
        list.sort(Comparator.comparingInt(p -> p.arrival));
        double time = 0;

        for (Process p : list) {
            if (time < p.arrival)
                time = p.arrival;

            p.waiting = time - p.arrival;
            time += p.burst;
            p.finish = time;
            p.turnaround = p.finish - p.arrival;
            p.done = true;
        }

        print("FCFS", list);
    }

    static void print(String name, List<Process> l) {
        double w = 0, t = 0;
        for (Process p : l) {
            w += p.waiting;
            t += p.turnaround;
        }
        System.out.println(name);
        System.out.println("Avg Waiting: " + w / l.size());
        System.out.println("Avg Turnaround: " + t / l.size());
        System.out.println();
    }
}