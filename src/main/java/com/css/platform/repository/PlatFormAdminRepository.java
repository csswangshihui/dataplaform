package com.css.platform.repository;
import com.css.platform.domain.PlatFormAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatFormAdminRepository extends JpaRepository<PlatFormAdmin,String> {
}
