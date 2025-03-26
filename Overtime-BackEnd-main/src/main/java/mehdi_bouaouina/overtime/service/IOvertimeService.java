package ahmed_hammami.overtime.service;

import ahmed_hammami.overtime.dto.OvertimeResponseDto;
import ahmed_hammami.overtime.model.entity.Employee;
import ahmed_hammami.overtime.model.entity.Overtime;
import ahmed_hammami.overtime.model.entity.Price;

import java.util.Date;
import java.util.List;

public interface IOvertimeService {
    public List<Employee> findAllEmployees();
    public Employee addEmployee(Employee employee);

    public List<Overtime> findAllOvertimes();
    public Overtime addOvertime(Overtime overtime);

    public List<OvertimeResponseDto> findOvertimePerEmployeeByDate(Date startDate , Date endDate);


    public List<Price> findAllPrices();


}
