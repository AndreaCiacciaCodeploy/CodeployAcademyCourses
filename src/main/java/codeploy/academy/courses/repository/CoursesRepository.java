package codeploy.academy.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import codeploy.academy.courses.model.Cours;

public interface CoursesRepository extends JpaRepository<Cours, Long> {

}
