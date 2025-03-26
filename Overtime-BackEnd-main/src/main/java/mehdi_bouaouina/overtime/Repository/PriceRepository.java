package mehdi_bouaouina.overtime.Repository;

import mehdi_bouaouina.overtime.model.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends JpaRepository<Price, Integer> {
}