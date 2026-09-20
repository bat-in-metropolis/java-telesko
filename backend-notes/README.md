# Later backend topics

The full priority order and work stack live in [../learning-plan.md](../learning-plan.md).
This page is only a navigation placeholder so the repository stays compact.

Planned after Spring Core and REST:

1. SQL and MySQL
2. Spring Data JPA and Hibernate
3. Lombok
4. DTOs and MapStruct
5. Validation and global error handling
6. JUnit 4 and Mockito
7. Jackson and logging
8. RestTemplate and basic Resilience4j
9. Redis
10. Kafka
11. Docker and Kubernetes reading basics

The first real work flow to trace is:

```text
POST /v2/coupon-code/create
  → CouponCodeModelControllerV2
  → CouponCodeModelServiceV2Impl
  → CouponCodeModelRepository
  → JpaRepository / Hibernate
  → coupon_codes in MySQL
  → ResponseEntity
  → JSON
```

Create a dedicated top-level folder for a topic only when active examples or
notes actually exist. This avoids a repository full of empty architecture.

