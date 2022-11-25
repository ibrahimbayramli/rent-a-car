package kodlama.io.RentACar.dataAccess.abstracts;

import kodlama.io.RentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.RentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand,Integer> {

}
