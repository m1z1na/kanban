package Kanban.Service;

import Kanban.Model.Employee;
import Kanban.Model.Task;
import java.util.List;

public interface EmployeeService {

     List<Employee> getAll();

     List<Task> getTask();

     Employee getEmployeeInformation(Long id);
}
