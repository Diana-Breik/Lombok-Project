package org.example;

import lombok.Builder;
import lombok.With;

//* Schritt 3: Erstelle einen Teacher Record mit den folgenden Attributen: id, name, subject.
@Builder
@With
public record Teacher(String id,
                      String name,

                      String subject) {
}
