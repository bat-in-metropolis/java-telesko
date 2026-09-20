# Spring Boot and REST

Status: **NOT STARTED**

This folder will hold Spring MVC and REST examples after Spring Core.

Planned topics:

- HTTP methods, status codes, and JSON
- `@RestController` and `@RequestMapping`
- `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`
- `@RequestBody`, `@PathVariable`, and `@RequestParam`
- `ResponseEntity`

Target request flow:

```text
HTTP request
  → controller
  → service
  → repository or external service
  → database
  → response object
  → Jackson JSON
  → HTTP response
```

Do not generate placeholder controllers yet. Add examples when this learning
phase begins.

