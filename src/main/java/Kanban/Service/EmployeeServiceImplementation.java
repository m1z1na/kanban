package Kanban.Service;

import Kanban.Model.Employee;
import Kanban.Model.Task;
import Kanban.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImplementation implements  EmployeeService, UserDetailsService{


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

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        System.out.println(login);
        Employee employee = employeeRepository.findByEmail(login);

        System.out.println(String.valueOf(employee.getRole()));

         return  employeeRepository.findByEmail(login);


    }
}
