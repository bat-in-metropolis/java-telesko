# Spring Core

Status: **NOT STARTED**

This folder is ready for focused Spring fundamentals after Gradle.

Planned topics, in work-priority order:

1. IoC and dependency injection
2. `ApplicationContext` and beans
3. component scanning
4. `@Component`, `@Service`, and `@Repository`
5. `@Configuration` and `@Bean`
6. `@Autowired`
7. constructor injection

The FMS-GPS project uses field `@Autowired` in places, so learn to read it even
though constructor injection is preferred for new code.

```text
Spring starts
  → scans classes
  → creates beans
  → injects dependencies
  → controllers/services/repositories are ready
```

Do not add examples here until the Gradle fundamentals phase is complete.

