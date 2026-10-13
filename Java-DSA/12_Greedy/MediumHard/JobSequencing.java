import java.util.*;

public class JobSequencing {
    
    static class Job {
        int id, deadline, profit;
        
        Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    
    public static void main(String[] args) {
        Job[] jobs = {
            new Job(1, 4, 20),
            new Job(2, 1, 10),
            new Job(3, 1, 40),
            new Job(4, 1, 30)
        };
        
        int[] result = jobSequencing(jobs);
        System.out.println("Number of jobs: " + result[0]);
        System.out.println("Total profit: " + result[1]);
    }
    
    public static int[] jobSequencing(Job[] jobs) {
        // Sort by profit in descending order
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
        
        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }
        
        int[] slot = new int[maxDeadline + 1];
        Arrays.fill(slot, -1);
        
        int count = 0, profit = 0;
        
        for (Job job : jobs) {
            for (int j = job.deadline; j > 0; j--) {
                if (slot[j] == -1) {
                    slot[j] = job.id;
                    count++;
                    profit += job.profit;
                    break;
                }
            }
        }
        
        return new int[]{count, profit};
    }
}
