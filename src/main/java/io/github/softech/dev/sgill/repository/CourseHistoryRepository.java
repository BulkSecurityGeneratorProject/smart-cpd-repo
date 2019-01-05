package io.github.softech.dev.sgill.repository;

import io.github.softech.dev.sgill.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Null;
import java.util.List;
import java.util.Optional;


/**
 * Spring Data  repository for the CourseHistory entity.
 */
@Repository
public interface CourseHistoryRepository extends JpaRepository<CourseHistory, Long>, JpaSpecificationExecutor<CourseHistory> {
    CourseHistory findCourseHistoryByCourseAndCustomer(Course course, Customer customer);
    Optional<CourseHistory> findCourseHistoryByCourseIdAndCustomer_Id(Long cid, Long custId);
    Optional<List<CourseHistory>> getCourseHistoriesByCustomer(Customer customer);
    @Query(value = "SELECT TOP 1 * FROM course_history u WHERE u.customer_id = :customer_id ORDER BY u.id DESC", nativeQuery = true)
    CourseHistory findRecentCourseHistory(@Param("customer_id") Long id);
}
