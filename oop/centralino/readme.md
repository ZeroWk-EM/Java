# Cetralino

Progettare la classe Centralino per la gestione di un centralino telefonico.
Un centralino è caratterizzata dal nome (ad esempio INFOTEL), dal numero di chiamate ricevute,
dalla durata totale delle chiamate ricevute, dal numero di chiamate effettuate, dalla durata
totale delle chiamate effettuate.

Si prevedano le opportune variabili di istanza della classe Centralino
in base alla descrizione fornita, ponendo attenzione al loro tipo.

- Costruttori
  Prevedere un costruttore che crea un centralino; il costruttore deve ricevere
  in ingresso il nome del centralino e inizializzare in
  modo opportuno le altre variabili di istanza.

### Definizione della classe Centralino: Metodi

1.  Definire un metodo riceviChiamata( ) che riceve in ingresso
    la durata della chiamata ricevuta. Il metodo visualizzerà le righe

            “Ricevuta chiamata.”

            “Durata della chiamata = ????”

            “Totale chiamate ricevute = ????”

2.  Definire un metodo effettuaChiamata( ) che riceve in ingresso
    la durata della chiamata effettuata. Il metodo visualizzerà le righe

            “Effettuata chiamata.”

            “Durata della chiamata = ????”

            “Totale chiamate effettuate = ????”

3.  Definire un metodo visualizzaCentralino( ) che visualizza lo stato corrente del centralino nella seguente forma:

---

    Nome centralino: ??????

    Totale chiamate ricevute: ?????

    Durata chiamate ricevute: ?????

    Totale chiamate effettuate: ?????

    Durata chiamate effettuate: ?????

---

Classe Main
Definire una classe Main per verificare il funzionamento dei metodi definiti.
In particolare le istruzioni da codificare all’interno
del metodo main sono le seguenti:

    1. Creare un centralino
    2. Effettuare una chiamata di durata 3 minuti
    3. Ricevere una chiamata di durata 12 minuti
    4. Visualizzare lo stato del centralino
    5. Ricevere una chiamata di durata 30 minuti
    6. Effettuare una chiamata di durata 5 minuti
    7. visualizzare lo stato del centralino
