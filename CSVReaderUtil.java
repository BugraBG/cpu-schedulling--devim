import java.io.*;
import java.util.*;

public class CSVReaderUtil {

    public static List<Process> read(String path) {
        List<Process> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            br.readLine(); // header

            String line;
            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");

                String id = d[0];
                int arrival = Integer.parseInt(d[1]);
                int burst = Integer.parseInt(d[2]);
                int priority = mapPriority(d[3]);

                list.add(new Process(id, arrival, burst, priority));
            }
        } catch (Exception e) {
            System.out.println("CSV okunamadı");
        }

        return list;
    }

    private static int mapPriority(String p) {
        if (p.equalsIgnoreCase("high")) return 1;
        if (p.equalsIgnoreCase("normal")) return 2;
        return 3; // low
    }

    public static List<Process> clone(List<Process> src) {
        List<Process> c = new ArrayList<>();
        for (Process p : src)
            c.add(new Process(p.id, p.arrival, p.burst, p.priority));
        return c;
    }
}