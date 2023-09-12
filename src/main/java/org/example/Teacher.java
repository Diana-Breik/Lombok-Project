package org.example;

import lombok.Builder;

//* Schritt 3: Erstelle einen Teacher Record mit den folgenden Attributen: id, name, subject.
@Builder
public record Teacher(String id,String name,String subject) {
}
