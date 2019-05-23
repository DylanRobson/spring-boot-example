A Spring Boot example web application to explore its basic functionalities.
Using spring-boot-starter-web, spring-boot-starter-data-jpa, and mysql-connector-java.


The following RESTful endpoints are defined:

GET "/"                     (Get home)

GET "/users"                (List users)
GET "/users/{id}"           (Get user)
POST "/users"               (Create user)

GET "/posts"                (List posts)
GET "/users/{id}/posts"     (List posts by user)
GET "/posts/{id}"           (Get post)
POST "/posts"               (Create post)


Building with in-memory H2 DB:
    (Non-persistent)
    1: Comment the mysql-connector-java dependency in build.gradle.
    2: Uncomment the h2database dependency in build.gradle.
    3: Delete the contents of application.properties.


Building with MySQL DB:
    See [6] and configure the database and application.properties accordingly.


Resources:
    [1] https://spring.io/guides/gs/rest-service/
    [2] https://spring.io/guides/gs/accessing-data-jpa/
    [3] https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-data-jpa
    [4] https://spring.io/guides/gs/accessing-data-mysql/
    [5] https://en.wikibooks.org/wiki/Java_Persistence/ManyToOne
    [6] https://en.wikibooks.org/wiki/Java_Persistence/OneToMany
    [7] https://stackoverflow.com/questions/24994440/no-serializer-found-for-class-org-hibernate-proxy-pojo-javassist-javassist