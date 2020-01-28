package student.enterprise.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import student.enterprise.project.entity.LecturerEntity;

public interface LecturerRepository extends JpaRepository<LecturerEntity, Long> {
}
