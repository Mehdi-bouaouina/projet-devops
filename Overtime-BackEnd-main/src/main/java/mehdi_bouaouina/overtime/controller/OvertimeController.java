package mehdi_bouaouina.overtime.controller;

import ahmed_hammami.overtime.dto.OvertimeResponseDto;
import ahmed_hammami.overtime.model.entity.Employee;
import ahmed_hammami.overtime.model.entity.Overtime;
import ahmed_hammami.overtime.model.entity.Price;
import ahmed_hammami.overtime.service.IOvertimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
//@RequestMapping("overtime")
public class OvertimeController {

    @Autowired
    IOvertimeService overtimeService;

    @GetMapping("/findAllEmployees")
    public List<Employee> findAllEmployees() {
        return overtimeService.findAllEmployees();
    }

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return overtimeService.addEmployee(employee);
    }

    @GetMapping("/findAllOvertimes")
    public List<Overtime> findAllOvertimes() {
        return overtimeService.findAllOvertimes();
    }

    @PostMapping("/addOvertime")
    public Overtime addOvertime(@RequestBody Overtime overtime) {
        return overtimeService.addOvertime(overtime);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/findOvertimePerEmployeeByDate/{startDate}/{endDate}")
    public List<OvertimeResponseDto> findOvertimePerEmployeeByDate(@PathVariable("startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate1 , @PathVariable("startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endtDate1){
        return overtimeService.findOvertimePerEmployeeByDate(startDate1, endtDate1);
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/findAllPrices")
    public List<Price> findAllPrices() {
        return overtimeService.findAllPrices();
    }


}
