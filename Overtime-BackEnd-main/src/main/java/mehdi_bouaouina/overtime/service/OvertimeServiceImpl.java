package ahmed_hammami.overtime.service;

import ahmed_hammami.overtime.Repository.EmployeeRepository;
import ahmed_hammami.overtime.Repository.OvertimeRepository;
import ahmed_hammami.overtime.Repository.PriceRepository;
import ahmed_hammami.overtime.dto.OvertimeResponseDto;
import ahmed_hammami.overtime.model.entity.Employee;
import ahmed_hammami.overtime.model.entity.Overtime;
import ahmed_hammami.overtime.model.entity.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class OvertimeServiceImpl implements IOvertimeService{
    @Autowired
    OvertimeRepository overtimeRepository;
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    PriceRepository priceRepository;

    @Override
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Overtime> findAllOvertimes() {
        return overtimeRepository.findAll();
    }

    @Override
    public Overtime addOvertime(Overtime overtime) {
        return overtimeRepository.save(overtime);
    }

    @Override
    public List<OvertimeResponseDto> findOvertimePerEmployeeByDate(Date startDate , Date endDate)
    {
        return overtimeRepository.findOvertimePerEmployeeByDate(startDate,endDate);
    }

    @Override
    public List<Price> findAllPrices() {
        return priceRepository.findAll();
    }


}
