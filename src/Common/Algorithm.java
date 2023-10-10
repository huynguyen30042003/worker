package Common;

import java.time.LocalDate;
import java.util.ArrayList;

import Model.HistoryWorker;
import Model.Worker;

public class Algorithm {
    public void write(Worker worker, HistoryWorker historyWorker) {
        historyWorker.setId(worker.getId());
        historyWorker.setAge(worker.getAge());
        historyWorker.setName(worker.getName());
        historyWorker.setWorkLocation(worker.getWorkLocation());
        historyWorker.setSalary(worker.getSalary());
        LocalDate currentDate = LocalDate.now();
        historyWorker.setDay(currentDate.getDayOfMonth());
        historyWorker.setMonth(currentDate.getMonthValue());
        historyWorker.setYear(currentDate.getYear());

    }

    public void decrease(ArrayList<Worker> dataWorker, int target, ArrayList<HistoryWorker> historyWorkers) {
        Worker worker = new Worker();
        int moneyToRaise;
        worker = dataWorker.get(target);
        moneyToRaise = Library.getInt("Enter money to cut", 0, worker.getSalary());
        worker.setSalary(worker.getSalary() - moneyToRaise);
        dataWorker.set(target, worker);
        HistoryWorker historyWorker = new HistoryWorker();
        historyWorker.setTypeOfStatus("down");
        write(worker, historyWorker);
        historyWorkers.add(historyWorker);

    }

    public void increase(ArrayList<Worker> dataWorker, int target, ArrayList<HistoryWorker> historyWorkers) {
        Worker worker = new Worker();
        int moneyToRaise;
        moneyToRaise = Library.validNumber("Enter money to raise");
        worker = dataWorker.get(target);
        worker.setSalary(worker.getSalary() + moneyToRaise);
        dataWorker.set(target, worker);
        HistoryWorker historyWorker = new HistoryWorker();
        historyWorker.setTypeOfStatus("up");
        write(worker, historyWorker);
        historyWorkers.add(historyWorker);
    }

    public void display(ArrayList<HistoryWorker> historyWorkers) {

        System.out.printf("%-5s%-10s%-5s%-14s%-14s%-14s", "Code", "Name", "Age", "Salary", "Status", "Date");
        System.out.println();
        historyWorkers.stream().forEach(worker -> {
            String date = worker.getDay() + "/" + worker.getMonth() + "/" + worker.getYear();
            System.out.printf("%-5s%-10s%-5s%-14s%-14s%-14s", worker.getId(), worker.getName(), worker.getAge(),
                    worker.getSalary(), worker.getTypeOfStatus(), date);
            System.out.println();
        });
    }
}
