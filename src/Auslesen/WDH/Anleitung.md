# Demo Aufgabe - Daten formatiert lesen
## Aufgabe
Gegeben ist die Datei daten.txt. Schreiben Sie ein Programm, das Daten formatiert aus der Datei daten.txt liest und am Bildschirm ausgibt. Das Lesen aus einer Textdatei sollte immer mit geeigneter Fehlerbehandlung try-catch-finally-Konstrukt abgesichert werden.
Modifizieren Sie das Programm so, dass zusätzlich zwei neue Zeilen auf dem Bildschirm dar-gestellt werden.
1. Zeile: Ausgabe von „******************************“
2. Zeile: Jeweils das Berechnungsergebnis aus der Summe der ersten Spaltenwerte etc.
### Tipp: 
Das Trennzeichen ist ein Tabulatur »\t«. Dabei ist zu beachten, dass Kommazahlen in Textdateien in der Regel mit einem Dezimalpunkt gespeichert sind

## Lösung: 
1. Erzeugen eines **BufferedReader Objekts** unter verwendung eines Dateipfades
2. **Try/Catch** erstellen
3. Verbinden der reader Instanz unter Verwendung folgender Methode: (Solang !Datei-Ende)
   - readLine() &rarr; zeilenweise
   - read() &rarr; zeichenweise
   - lines() &rarr; blockweise
4. Datei schließen 

```java
BufferedReader reader = null;
String [] datenarray = null;
String trennzeichen = "\t";
double zahl = 0, quadratzahl = 0, wurzelzahl = 0;
String line, ersteZeile = "", zweiteZeile = "";

try {
    reader = Files.newBufferedReader(Path.of(filename));

    ersteZeile = reader.readLine();
    System.out.println(ersteZeile);
    zweiteZeile = reader.readLine();
    System.out.println(zweiteZeile);


    while ((line = reader.readLine()) != null) {
        System.out.println(line);
        datenarray = line.split(trennzeichen);

        zahl += Double.parseDouble(datenarray[0]);
        quadratzahl += Double.parseDouble(datenarray[1]);
        wurzelzahl += Double.parseDouble(datenarray[2].replace(",", "."));
    }

    System.out.println("*****************");
    System.out.println(zahl + "\t" + quadratzahl + "\t" + wurzelzahl);

} catch (NoSuchFileException e) {
    System.out.println(e.getMessage());
} catch (Exception e) {
    System.out.println(e.getMessage());
} finally {
    if (reader != null) {
        reader.close();
    }
}
```