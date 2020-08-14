1.A fost folosit Lombok. Setarea Lombok in Intelij IDEA si Eclipse: https://www.baeldung.com/lombok-ide

2.Scripturile sql se afla: src/main/resources/db/migration. SGBD este postgres.

3.A fost folosit flyway. Aceasta aplicatie migreaza fisierele sql automat cand aplicatia se porneste. Este flyway plugin si se poate de facut migrarea manual: mvn flyway:migrate

Configurarea proprietatilor Flyway:

        <!-- Flyway properties -->
        <flyway.version>6.3.1</flyway.version>
        <flyway.user>postgres</flyway.user>
        <flyway.password>postgres</flyway.password>
        <flyway.url>jdbc:postgresql://localhost:5432/postgres</flyway.url>
        <driver>org.postgresql.Driver</driver>
        
Configurarea proprietatilor Postgres BD: 

    spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
    spring.datasource.username=postgres
    spring.datasource.password=postgres
    spring.datasource.driver-class-name=org.postgresql.Driver


4.Cele 4 endpoint-uri se pot testa direct din Intelij IDEA ruland http cererile: src\test\http\rest-api.http 