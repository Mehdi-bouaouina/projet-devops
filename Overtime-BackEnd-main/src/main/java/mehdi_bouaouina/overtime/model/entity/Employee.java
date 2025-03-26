package mehdi_bouaouina.overtime.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String LastName;
    private String function;
    @OneToMany(mappedBy = "employee" , cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Overtime> overtime;

}
