package mehdi_bouaouina.overtime.Repository;

import ahmed_hammami.overtime.dto.OvertimeResponseDto;
import ahmed_hammami.overtime.model.entity.Overtime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface OvertimeRepository extends JpaRepository<Overtime, Integer> {

//  @Query(value = "SELECT SUM(o.nb_hours) * 10 AS totalOvertime, e.first_name AS firstName FROM overtime o JOIN employee e ON o.employee_id = e.id GROUP BY e.first_name", nativeQuery = true)
    @Query("select new ahmed_hammami.overtime.dto.OvertimeResponseDto(sum(o.nbHours)*(select p.price from Price p where p.dayType='WEEKEND' ), e.firstName) from Overtime o join o.employee e where o.date between :startDate and :endDate group by e.firstName " )
    public List<OvertimeResponseDto> findOvertimePerEmployeeByDate(Date startDate , Date endDate);


}
