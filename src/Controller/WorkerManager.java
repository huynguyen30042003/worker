package Controller;

import java.util.ArrayList;

import Common.Algorithm;
import Common.Library;
import Model.HistoryWorker;
import Model.Worker;
import View.Menu;

public class WorkerManager extends Menu<String> {
    static String[] options = { "Add Worker", "Up Salary", "Down Salary", "Display Information Salary" };
    static ArrayList<Worker> dataWorker = new ArrayList<>();
    static ArrayList<HistoryWorker> historyWorkers = new ArrayList<>();

    Algorithm algorithm = new Algorithm();

    public WorkerManager() {
        super("Worker Management", options);
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                Worker worker = new Worker();
                worker.setId(dataWorker.size());
                worker.input();
                dataWorker.add(worker);
                break;
            case 2:
                int target;
                target = Library.getInt("Enter Id", 0, dataWorker.size());
                algorithm.increase(dataWorker, target,historyWorkers);
                break;
            case 3:
                int targetDecrease;
                targetDecrease = Library.getInt("Enter Id", 0, dataWorker.size());
                algorithm.decrease(dataWorker, targetDecrease,historyWorkers);
                break;
            case 4:
                algorithm.display(historyWorkers);
                break;
        }

    }

    public static void main(String[] args) {

        new WorkerManager().run();
    }

}
