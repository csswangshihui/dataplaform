package com.css.platform.repository;
import com.css.platform.entity.AyxxVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AyxxRepository extends JpaRepository<AyxxVO,String> {
}
