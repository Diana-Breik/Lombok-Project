package org.example;

//* Schritt 2: Erstellt eine einfache Klasse "Student" mit den folgenden Attributen: id, name, adress, grade.
//* Schritt 2.5: Verwendet die passenden Lombok-Annotationen, um Getter, Setter, Equals, HashCode, ToString und Konstruktoren für die Entität zu generieren.

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String id;
    private String name;
    private String adress;
    private int grade;


}
