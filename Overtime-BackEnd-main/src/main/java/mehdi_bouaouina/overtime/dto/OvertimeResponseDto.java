package mehdi_bouaouina.overtime.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
@NoArgsConstructor

public class OvertimeResponseDto {
    private Long nbHoursSum;
    private String firstName;

    public OvertimeResponseDto(Long nbHoursSum, String firstName) {
        this.nbHoursSum = nbHoursSum;
        this.firstName = firstName;
    }
}
