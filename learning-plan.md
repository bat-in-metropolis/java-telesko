# FMS-GPS Java Backend Learning Plan

## Goal

Move from "vibe coding" to being able to read, explain, debug, test, and safely modify the existing FMS-GPS backend.

This plan is based on the actual repository stack, not a generic Java-backend syllabus.

---

## Actual Stack

| Area | Technology |
|---|---|
| Java | Java 8 |
| Framework | Spring Boot 2.1.2 |
| Build | Gradle (Groovy DSL) |
| API | Spring MVC / REST |
| Database | MySQL |
| Persistence | Spring Data JPA + Hibernate |
| Testing | JUnit 4 + Mockito |
| Mapping | MapStruct |
| Boilerplate | Lombok |
| Validation | Hibernate Validator |
| JSON | Jackson |
| Cache | Redis |
| Messaging | Kafka |
| External HTTP | RestTemplate |
| Resilience | Resilience4j |
| Logging | SLF4J + Logback |
| Deployment | Docker + Kubernetes |

---

# Learning Order

## Phase 0 — Finish the relevant Core Java section

### Must know
- Classes and objects
- Encapsulation
- Interfaces
- Inheritance and polymorphism
- Generics
- Exceptions and custom exceptions
- Collections: List, Set, Map
- Lambdas
- Streams: `filter`, `map`, `reduce`, `sorted`
- `Optional`
- Method references
- Enums
- Annotations conceptually

### Know, but do not over-invest yet
- Comparator / Comparable
- Thread and synchronization basics
- File I/O
- Reflection

### Low priority for this codebase
The repository targets Java 8, so newer Java language features are not immediately useful:
- `var` / LVTI
- records
- sealed classes
- pattern matching

Understand what they are when the course covers them, but do not spend much practice time on them yet.

---

## Phase 1 — Gradle Basics

FMS-GPS uses Gradle, not Maven.

Learn:
- `build.gradle`
- `settings.gradle`
- plugins
- dependencies
- Gradle Wrapper
- `compile` vs `implementation`
- test dependencies

Commands:

```bash
./gradlew build
./gradlew test
./gradlew bootRun
./gradlew dependencies
```

Do not study advanced Gradle task authoring yet.

---

## Phase 2 — Spring Core + Dependency Injection

Learn:
- IoC
- Dependency Injection
- ApplicationContext
- beans
- component scanning
- `@Component`
- `@Service`
- `@Repository`
- `@Configuration`
- `@Bean`
- `@Autowired`
- constructor injection

Mental model:

```text
Spring starts
  ↓
Scans classes
  ↓
Creates beans
  ↓
Injects dependencies
  ↓
Controllers/services/repositories are ready
```

The existing project heavily uses field `@Autowired`, so be able to read it even though constructor injection is the preferred modern style.

---

## Phase 3 — Spring MVC + REST

Learn well:
- HTTP basics
- GET / POST / PUT / DELETE
- status codes
- JSON
- `@RestController`
- `@RequestMapping`
- `@GetMapping`
- `@PostMapping`
- `@PutMapping`
- `@DeleteMapping`
- `@RequestBody`
- `@PathVariable`
- `@RequestParam`
- `ResponseEntity`

Mental model:

```text
HTTP Request
  ↓
Controller
  ↓
Service
  ↓
Repository / external service
  ↓
Database
  ↓
Service
  ↓
Controller
  ↓
Jackson: Java object → JSON
  ↓
HTTP Response
```

---

## Phase 4 — SQL + MySQL

Learn SQL alongside Spring.

Must know:
- `SELECT`
- `WHERE`
- `ORDER BY`
- `GROUP BY`
- `HAVING`
- `INSERT`
- `UPDATE`
- `DELETE`
- `INNER JOIN`
- `LEFT JOIN`
- primary keys
- foreign keys
- indexes
- `NULL`
- aggregates: `COUNT`, `SUM`, `AVG`
- transactions at a basic level

You do not need MongoDB for this project.

---

## Phase 5 — Spring Data JPA + Hibernate

Learn:
- ORM
- `@Entity`
- `@Table`
- `@Id`
- `@Column`
- `@GeneratedValue`
- relationships such as `@OneToMany` and `@ManyToOne`
- `JpaRepository`
- `CrudRepository`
- derived query methods
- `@Query`
- JPQL vs native SQL
- transactions
- lazy vs eager loading at a basic level

Mental model:

```text
Java Entity
   ↕
JPA / Hibernate
   ↕
MySQL Table
```

---

## Phase 6 — Lombok

Learn:
- `@Data`
- `@Getter`
- `@Setter`
- `@Builder`
- `@NoArgsConstructor`
- `@AllArgsConstructor`
- `@RequiredArgsConstructor`
- `@Slf4j`
- `@EqualsAndHashCode`
- `@ToString`

Always understand what ordinary Java code Lombok generates.

---

## Phase 7 — DTOs + MapStruct

Understand:
- request DTO
- response DTO
- entity
- internal model

Then learn basic MapStruct:
- `@Mapper`
- generated implementations
- entity → DTO
- DTO → entity

Advanced MapStruct can wait.

---

## Phase 8 — Validation + Error Handling

Validation:
- `@Valid`
- `@NotNull`
- `@NotBlank`
- `@Size`
- `@Pattern`

Error handling:
- checked vs unchecked exceptions
- `RuntimeException`
- custom exceptions
- `throw`
- `@RestControllerAdvice`
- `@ExceptionHandler`

Mental model:

```text
Service throws exception
  ↓
Exception propagates
  ↓
Global handler catches it
  ↓
HTTP error response
```

---

## Phase 9 — JUnit 4 + Mockito

This repository primarily uses service-layer unit tests.

JUnit 4:
- `@RunWith`
- `@Test`
- `@Before`
- `Assert.assertEquals`
- `Assert.assertTrue`
- `Assert.assertNull`

Mockito:
- `@Mock`
- `@InjectMocks`
- `when(...).thenReturn(...)`
- `verify(...)`
- argument matchers

Do not prioritize Testcontainers, WireMock, MockMvc, or deep Spring integration testing yet.

---

## Phase 10 — Jackson + Logging

Jackson:
- Java object ↔ JSON
- `ObjectMapper`
- `@JsonProperty`
- `@JsonIgnore`
- `@JsonFormat`

Logging:
- SLF4J
- Lombok `@Slf4j`
- `log.info`
- `log.warn`
- `log.error`
- basic Logback awareness

---

## Phase 11 — RestTemplate

Learn:
- synchronous HTTP calls
- `getForObject`
- `getForEntity`
- `postForEntity`
- `exchange`
- headers
- downstream failures

Then learn the Resilience4j circuit-breaker concept. Advanced configuration can wait.

---

## Phase 12 — Redis

Learn:
- why caching exists
- cache hit / miss
- TTL
- stale data
- `@Cacheable`
- `@CacheEvict`
- `RedisTemplate`

```text
MySQL = source of truth
Redis = cache / fast temporary storage
```

---

## Phase 13 — Kafka

Learn after normal REST + database flows make sense:
- producer
- consumer
- topic
- event/message
- consumer group
- serialization/deserialization
- `@KafkaListener`

```text
Service A
   ↓
Kafka Topic
   ↓
Service B Consumer
```

---

## Phase 14 — Docker + Kubernetes Basics

Docker:
- image
- container
- Dockerfile
- `FROM`
- `WORKDIR`
- `COPY` / `ADD`

Kubernetes:
- Pod
- Deployment
- Service
- configuration
- environment variables
- liveness/readiness probes
- resource limits

Initially, learn to read the existing files rather than administer Kubernetes.

---

# Postpone for Now

Based on this repository, postpone:
- Maven
- MongoDB
- Elasticsearch
- Spring Security
- JWT
- OAuth2
- GraphQL
- gRPC
- WebFlux / Reactor
- Kotlin
- Flyway
- Liquibase
- Quartz
- JSP
- Swing
- JavaFX
- advanced raw JDBC
- advanced concurrency
- Testcontainers
- WireMock

---

# How to Learn Using the Real Codebase

Use this loop:

```text
Learn one concept
   ↓
Find it in FMS-GPS
   ↓
Trace one real use
   ↓
Explain it without AI
   ↓
Make one small safe change or test
```

Do not wait until an entire course is complete before opening the project.

---

# First Real Endpoint to Study

Start with the already-identified flow:

```text
POST /v2/coupon-code/create
  ↓
CouponCodeModelControllerV2
  ↓
addCouponCode()
  ↓
CouponCodeModelServiceV2Impl
  ↓
addCouponCode()
  ↓
CouponCodeModelRepository
  ↓
JpaRepository
  ↓
Hibernate
  ↓
CouponCodeEntity
  ↓
MySQL coupon_codes
  ↓
ResponseModel
  ↓
ResponseEntity
  ↓
JSON
```

Use this endpoint to connect Spring annotations, dependency injection, DTOs, service logic, repositories, JPA/Hibernate, SQL, Jackson, validation, and exception handling.

---

# Telusko Video Strategy

Do **not** follow the full 63-hour video linearly just because that is the upload order.

For this project:

1. Finish the useful Core Java material.
2. Jump to **Gradle**.
3. Learn Spring Framework / Dependency Injection.
4. Learn REST / Spring MVC.
5. Learn SQL/MySQL in parallel.
6. Learn Hibernate.
7. Learn Spring Data JPA.
8. Learn JUnit/Mockito.
9. Learn Kafka later.
10. Learn Docker/deployment basics later.

Maven can be postponed because FMS-GPS is a Gradle project.

---

# Immediate Objective

Do not optimize for:

> "I finished every section of the course."

Optimize for:

> "I can open one FMS-GPS endpoint and explain what every important piece does from HTTP request → database/external service → HTTP response."

That is the fastest route from vibe coding to genuinely understanding the backend.
