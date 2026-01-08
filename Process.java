public class Process {
    String id;
    int arrival;
    int burst;
    int priority;

    int remaining;
    double finish;
    double waiting;
    double turnaround;
    boolean done;

    public Process(String id, int a, int b, int p) {
        this.id = id;
        arrival = a;
        burst = b;
        priority = p;
        remaining = b;
        done = false;
    }
}