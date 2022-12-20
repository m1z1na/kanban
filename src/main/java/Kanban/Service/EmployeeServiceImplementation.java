package Kanban.Service;

import Kanban.Model.Employee;
import Kanban.Model.Task;
import Kanban.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImplementation implements  EmployeeService{


    @Autowired
    private EmployeeRepository employeeRepository;


    public EmployeeServiceImplementation(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Task> getTask() {
        return null;
    }

    @Override
    public Employee getEmployeeInformation(Long id) {
       return employeeRepository.findById(id).orElse( new Employee( ));
    }

//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        return  employeeRepository.findByEmail(email);
//    }
}
