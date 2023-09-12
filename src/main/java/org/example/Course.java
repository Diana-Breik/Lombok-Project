package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

//* Schritt 4: Erstelle eine Klasse Course mit den folgenden Attributen: id, name, teacher, students.
//* Schritt 4.5: Verwendet die passenden Lombok-Annotationen, um Getter, Setter, Equals, HashCode, ToString und Konstruktoren für die Entität zu generieren.

@Data
@AllArgsConstructor
public class Course {
    private String id;
    private String name;
    private Teacher teacher;
    private ArrayList<Student> students ;

}
