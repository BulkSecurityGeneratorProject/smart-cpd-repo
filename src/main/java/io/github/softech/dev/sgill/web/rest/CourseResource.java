package io.github.softech.dev.sgill.web.rest;

import com.codahale.metrics.annotation.Timed;
import io.github.softech.dev.sgill.domain.*;
import io.github.softech.dev.sgill.repository.CourseCartBridgeRepository;
import io.github.softech.dev.sgill.repository.CourseHistoryRepository;
import io.github.softech.dev.sgill.repository.CourseRepository;
import io.github.softech.dev.sgill.repository.CustomerRepository;
import io.github.softech.dev.sgill.service.*;
import io.github.softech.dev.sgill.web.rest.errors.BadRequestAlertException;
import io.github.softech.dev.sgill.web.rest.util.HeaderUtil;
import io.github.softech.dev.sgill.web.rest.util.PaginationUtil;
import io.github.softech.dev.sgill.service.dto.CourseCriteria;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

import static org.elasticsearch.index.query.QueryBuilders.*;

/**
 * REST controller for managing Course.
 */
@RestController
@RequestMapping("/api")
public class CourseResource {

    private final Logger log = LoggerFactory.getLogger(CourseResource.class);

    private static final String ENTITY_NAME = "course";

    private final CourseService courseService;

    private final CourseQueryService courseQueryService;

    private final CustomerRepository customerRepository;

    private final CourseHistoryRepository courseHistoryRepository;

    private final CustomerService customerService;

    private final CourseCartBridgeRepository courseCartBridgeRepository;

    private final CourseCartBridgeService courseCartBridgeService;

    private final CartService cartService;

    public CourseResource(CourseService courseService, CourseQueryService courseQueryService, CustomerRepository customerRepository,
                          CourseHistoryRepository courseHistoryRepository, CustomerService customerService, CourseCartBridgeRepository courseCartBridgeRepository,
                          CourseCartBridgeService courseCartBridgeService, CartService cartService) {
        this.courseService = courseService;
        this.courseQueryService = courseQueryService;
        this.customerRepository = customerRepository;
        this.courseHistoryRepository = courseHistoryRepository;
        this.customerService = customerService;
        this.courseCartBridgeRepository = courseCartBridgeRepository;
        this.courseCartBridgeService = courseCartBridgeService;
        this.cartService = cartService;
    }

    /**
     * POST  /courses : Create a new course.
     *
     * @param course the course to create
     * @return the ResponseEntity with status 201 (Created) and with body the new course, or with status 400 (Bad Request) if the course has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/courses")
    @Timed
    public ResponseEntity<Course> createCourse(@Valid @RequestBody Course course) throws URISyntaxException {
        log.debug("REST request to save Course : {}", course);
        if (course.getId() != null) {
            throw new BadRequestAlertException("A new course cannot already have an ID", ENTITY_NAME, "idexists");
        }
        Course result = courseService.save(course);
        return ResponseEntity.created(new URI("/api/courses/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /courses : Updates an existing course.
     *
     * @param course the course to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated course,
     * or with status 400 (Bad Request) if the course is not valid,
     * or with status 500 (Internal Server Error) if the course couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/courses")
    @Timed
    public ResponseEntity<Course> updateCourse(@Valid @RequestBody Course course) throws URISyntaxException {
        log.debug("REST request to update Course : {}", course);
        if (course.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        Course result = courseService.save(course);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, course.getId().toString()))
            .body(result);
    }

    @PostMapping("/check/courses/{id}")
    @Timed
    public boolean checkCourses(@RequestParam Long custid, @RequestParam Long cartid, @PathVariable Long id) throws URISyntaxException {
        Course course = courseService.findOne(id).orElse(null);
        Customer customer = customerService.findOne(custid).orElse(null);
        CourseHistory temp = courseHistoryRepository.findCourseHistoryByCourseAndCustomer(course, customer);
        Cart tempCart = cartService.findOne(cartid).orElse(null);
        if(temp == null || temp.isAccess() || !temp.isIsactive()){
            CourseCartBridge tempCourseCart = courseCartBridgeRepository.findCourseCartBridgeByCartIdAndCourseId(cartid, id).orElse(null);
            if(tempCourseCart == null){
                CourseCartBridge tempCartBridge = new CourseCartBridge();
                tempCartBridge.setCart(tempCart);
                tempCartBridge.setCourse(course);
                tempCartBridge.setTimestamp(Instant.now());
                courseCartBridgeService.save(tempCartBridge);
            }
        }
        return temp == null || temp.isAccess() || !temp.isIsactive();
    }

    /**
     * GET  /courses : get all the courses.
     *
     * @param pageable the pagination information
     * @param criteria the criterias which the requested entities should match
     * @return the ResponseEntity with status 200 (OK) and the list of courses in body
     */
    @GetMapping("/courses")
    @Timed
    public ResponseEntity<List<Course>> getAllCourses(CourseCriteria criteria, Pageable pageable) {
        log.debug("REST request to get Courses by criteria: {}", criteria);
        Page<Course> page = courseQueryService.findByCriteria(criteria, pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/courses");
        return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
    }

    /**
     * GET  /courses/:id : get the "id" course.
     *
     * @param id the id of the course to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the course, or with status 404 (Not Found)
     */
    @GetMapping("/courses/{id}")
    @Timed
    public ResponseEntity<Course> getCourse(@PathVariable Long id) {
        log.debug("REST request to get Course : {}", id);
        Optional<Course> course = courseService.findOne(id);
        return ResponseUtil.wrapOrNotFound(course);
    }

    /**
     * DELETE  /courses/:id : delete the "id" course.
     *
     * @param id the id of the course to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/courses/{id}")
    @Timed
    public ResponseEntity<Void> deleteCourse(@PathVariable Long id) {
        log.debug("REST request to delete Course : {}", id);
        courseService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }

    /**
     * SEARCH  /_search/courses?query=:query : search for the course corresponding
     * to the query.
     *
     * @param query the query of the course search
     * @param pageable the pagination information
     * @return the result of the search
     */
    @GetMapping("/_search/courses")
    @Timed
    public ResponseEntity<List<Course>> searchCourses(@RequestParam String query, Pageable pageable) {
        log.debug("REST request to search for a page of Courses for query {}", query);
        Page<Course> page = courseService.search(query, pageable);
        HttpHeaders headers = PaginationUtil.generateSearchPaginationHttpHeaders(query, page, "/api/_search/courses");
        return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
    }

}
