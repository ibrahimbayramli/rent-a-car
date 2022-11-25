package kodlama.io.RentACar.business.abstracts;

import kodlama.io.RentACar.business.requests.CreateBrandRequest;
import kodlama.io.RentACar.business.responses.GetAllBrandsResponse;

import java.util.List;


public interface BrandService {
    List<GetAllBrandsResponse> getAll();

    void add(CreateBrandRequest createBrandRequest);
}
