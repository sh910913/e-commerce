package merchants.dao;

import merchants.entity.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MerchantRepository extends JpaRepository<Merchant, Integer> {
    Optional<Merchant> findById(Integer id);

    Optional<Merchant> findByName(String name);
}