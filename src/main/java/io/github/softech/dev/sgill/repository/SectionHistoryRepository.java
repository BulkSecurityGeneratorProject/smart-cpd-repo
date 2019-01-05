package io.github.softech.dev.sgill.repository;

import io.github.softech.dev.sgill.domain.Choice;
import io.github.softech.dev.sgill.domain.Customer;
import io.github.softech.dev.sgill.domain.Section;
import io.github.softech.dev.sgill.domain.SectionHistory;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


/**
 * Spring Data  repository for the SectionHistory entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SectionHistoryRepository extends JpaRepository<SectionHistory, Long>, JpaSpecificationExecutor<SectionHistory> {
    Optional<List<SectionHistory>> getSectionHistoriesByCustomer(Customer customer);

    @Query(value = "SELECT TOP 1 * FROM section_history u WHERE u.customer_id = :customer_id ORDER BY u.id DESC", nativeQuery = true)
    Optional<SectionHistory> getRecentSectionHistory(@Param("customer_id") Long id);

    @Query(value = "SELECT TOP 1 * FROM section_history u WHERE u.customer_id = :customer_id AND u.course_id = :course_id ORDER BY u.startdate DESC", nativeQuery = true)
    Optional<SectionHistory> getPersistanceSectionHistory(@Param("customer_id") Long id, @Param("course_id") Long courseId);

    Optional<SectionHistory> getSectionHistoryByCustomerIdAndSectionId(Long customerId, Long sectionId);

    @Query(value = "SELECT TOP 1 * FROM section_history u WHERE u.customer_id = :customer_id AND u.id IN (SELECT id from section r WHERE r.course_id = :course_id) ORDER BY u.id DESC", nativeQuery = true)
    Optional<SectionHistory> getSectionByCourse(@Param("customer_id") Long customer_id, @Param("course_id") Long course_id);
}
