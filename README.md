## Notes

Spring Data web support has _resolvers_ that *reduce boilerplate* and make our controllers more expressive.

Resolvers
 - interoperate with Spring Data Repositories
 - can fetch domain objects without explicitly calling the repo implementations
 - can construct controller responses that support pagination and sorting
 
findUserById()
 - Spring MVC uses the DomainClassConverter to convert the id path variable into the domain class's id type and uses it for fetching the matching domain object from the repository layer
 - By simply specifying the id path variable, along with a resolvable domain class instance, we've automatically triggered the domain object's lookup.
 
PageableHandlerMethodArgumentResolver
 - Spring will get the Page arguments from the parameters if you have them, and then inject it into the pageable:
```java
 @GetMapping("/users")
 public Page<User> findAllUsers(@RequestParam("page") int page,
                                @RequestParam("size") int size, Pageable pageable) {
     return userRepository.findAll(pageable);
 }
```

SortHandlerMethodArgumentResolver
 - also inserts the `sort` parameter into the pageable