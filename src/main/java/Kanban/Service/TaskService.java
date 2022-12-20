package Kanban.Service;

import Kanban.Model.Task;

import java.util.List;

public interface TaskService {
    void createTask(Task task);
    void updateTask(Task task);
    void deleteTask(Task task);
    Task getTask(Long id);
    List<Task> getAll( );
    int getDoingTaskSize( );
    int getToDoTaskSize( );
    int getDoneTaskSize( );
}
