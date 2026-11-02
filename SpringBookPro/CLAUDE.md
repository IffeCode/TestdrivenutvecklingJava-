
# Regler för projekt
- Vi använder TDD- red, green och refactor
- committa aldrig ändringar utan att fråga
- Vi använder Hexagonal Arkitektur och SOLID-principer
- Affärslogik och portar i domain/ och domain/ports/
- Ändra inte i pom.xml utan att fråga först

# Regler för tester
- Skriv alltid ett failande test först
- Ändra aldrig befintliga tester utan att fråga
- Kör mvn test efter varje ändring
- Använd @WebMvcTest och @DataJpaTest – inte @SpringBootTest
- Använd @MockitoBean – inte @MockBean
- Använd JUnit 6