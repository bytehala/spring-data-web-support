## Notes

Spring Data web support has _resolvers_ that *reduce boilerplate* and make our controllers more expressive.

Resolvers
 - interoperate with Spring Data Repositories
 - can fetch domain objects without explicitly calling the repo implementations
 - can construct controller responses that support pagination and sorting
 
findUserById()
 - Spring MVC uses the DomainClassConverter to convert the id path variable into the domain class's id type and uses it for fetching the matching domain object from the repository layer
 - By simply specifying the id path variable, along with a resolvable domain class instance, we've automatically triggered the domain object's lookup.