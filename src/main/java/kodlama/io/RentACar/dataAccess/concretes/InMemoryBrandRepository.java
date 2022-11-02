package kodlama.io.RentACar.dataAccess.concretes;

import kodlama.io.RentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.RentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBrandRepository implements BrandRepository {
    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands=new ArrayList<>();
        brands.add(new Brand(1L,"BMW"));
        brands.add(new Brand(2L,"Mercedes"));
        brands.add(new Brand(3L,"Audi"));
        brands.add(new Brand(4L,"Fiat"));
        brands.add(new Brand(5L,"Renault"));

    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
