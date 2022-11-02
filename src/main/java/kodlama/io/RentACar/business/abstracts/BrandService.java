package kodlama.io.RentACar.business.abstracts;

import kodlama.io.RentACar.entities.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BrandService {
    List<Brand> getAll();
}
