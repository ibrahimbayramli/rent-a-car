package kodlama.io.RentACar.business.concretes;

import kodlama.io.RentACar.business.abstracts.BrandService;
import kodlama.io.RentACar.business.requests.CreateBrandRequest;
import kodlama.io.RentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.RentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.RentACar.entities.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandManager implements BrandService {
    private final BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands=brandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponses=new ArrayList<>();

        for(Brand brand:brands){
            GetAllBrandsResponse responseItem=new GetAllBrandsResponse();

            responseItem.setId(brand.getId());

            responseItem.setName(brand.getName());

            brandsResponses.add(responseItem);

        }

        return brandsResponses;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand=new Brand();

        brand.setName(createBrandRequest.getName());
        this.brandRepository.save(brand);
    }
}
