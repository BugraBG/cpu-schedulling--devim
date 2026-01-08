import java.util.*;

public class SJF_NonPreemptive {

    public static void run(List<Process> list) {
        double time = 0;
        int completed = 0;

        while (completed < list.size()) {
            Process shortest = null;

            for (Process p : list) {
                if (!p.done && p.arrival <= time) {
                    if (shortest == null || p.burst < shortest.burst)
                        shortest = p;
                }
            }

            if (shortest == null) {
                time++;
                continue;
            }

            shortest.waiting = time - shortest.arrival;
            time += shortest.burst;
            shortest.finish = time;
            shortest.turnaround = shortest.finish - shortest.arrival;
            shortest.done = true;
            completed++;
        }

        FCFS.print("SJF Non-Preemptive", list);
    }
}