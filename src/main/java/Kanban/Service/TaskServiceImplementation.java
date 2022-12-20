package Kanban.Service;

import Kanban.Model.Task;
import Kanban.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImplementation implements TaskService {

    @Autowired
    private TaskRepository taskRepository;


    public TaskServiceImplementation(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public TaskServiceImplementation() {

    }

    @Override
    public void createTask(Task task) {

    }

    @Override
    public void updateTask(Task task) {

    }

    @Override
    public void deleteTask(Task task) {

    }

    @Override
    public Task getTask(Long id) {
        return taskRepository.findById(id).orElse(new Task());
    }

    @Override
    public List<Task> getAll() {
        return taskRepository.findAll();
    }

    @Override
    public int getDoingTaskSize() {
        return 0;
    }

    @Override
    public int getToDoTaskSize() {
        return 0;
    }

    @Override
    public int getDoneTaskSize() {
        return 0;
    }
}

