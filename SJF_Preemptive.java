import java.util.*;

public class SJF_Preemptive {

    public static void run(List<Process> list) {
        double time = 0;
        int finished = 0;

        while (finished < list.size()) {
            Process cur = null;

            for (Process p : list) {
                if (!p.done && p.arrival <= time) {
                    if (cur == null || p.remaining < cur.remaining)
                        cur = p;
                }
            }

            if (cur == null) {
                time++;
                continue;
            }

            cur.remaining--;
            time++;

            if (cur.remaining == 0) {
                cur.finish = time;
                cur.turnaround = cur.finish - cur.arrival;
                cur.waiting = cur.turnaround - cur.burst;
                cur.done = true;
                finished++;
            }
        }

        FCFS.print("SJF Preemptive", list);
    }
}
