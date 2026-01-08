import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== CASE 1 ===");
        List<Process> case1 = CSVReaderUtil.read("case1.csv");
        System.out.println("Process sayısı: " + case1.size());
        System.out.println();

        FCFS.run(CSVReaderUtil.clone(case1));
        SJF_NonPreemptive.run(CSVReaderUtil.clone(case1));
        SJF_Preemptive.run(CSVReaderUtil.clone(case1));

        System.out.println("=== CASE 2 ===");
        List<Process> case2 = CSVReaderUtil.read("case2.csv");
        System.out.println("Process sayısı: " + case2.size());
        System.out.println();

        FCFS.run(CSVReaderUtil.clone(case2));
        SJF_NonPreemptive.run(CSVReaderUtil.clone(case2));
        SJF_Preemptive.run(CSVReaderUtil.clone(case2));
    }
}