# USB

Progettare la classe ChiavettaUSB per la gestione di una chiavetta USB.
Una chiavetta USB è caratterizzata dal

- nome (ad esempio LEXAR)
- dalla memoria totale in GB
- dal numero di file memorizzati
- dallo spazio occupato.

## Costruttori

Prevedere un costruttore che crea una chiavetta USB.

Il costruttore deve ricevere in ingresso il

- nome della chiavetta
- la memoria in GB
- ed inizializzare in modo opportuno le altre variabili di istanza.

## Metodi

1. Definire un metodo aggiungiFiles( ) che riceve in ingresso due valori corrispondenti rispettivamente

- al numero di file da inserire nella chiavetta
- e alla dimensione in MB da essi occupata.

Il metodo visualizzerà le righe

    “Caricati ???? files.”

    “Totale file presenti nella chiavetta = ????”

    “Spazio residuo disponibile = ????”

Il metodo dovrà controllare che la dimensione dei file da inserire sia inferiore o uguale allo spazio attualmente disponibile nella chiavetta; in caso contrario visualizzerà il messaggio

    “Parametri errati!”.

2.  Definire un metodo rimuoviFiles( ) che riceve in ingresso due valori corrispondenti rispettivamente al numero di file da rimuovere dal lettore e alla dimensione in MB da essi occupata. Il metodo visualizzerà le righe

        “Rimossi ???? files.”

        “Totale file presenti nella chiavetta = ????”

        “Spazio residuo disponibile = ????”

Il metodo dovrà controllare che il numero di file da rimuovere sia inferiore o uguale a quello dei file presenti nel lettore e che la dimensione da essi occupata sia inferiore allo spazio attualmente occupato; in caso contrario visualizzerà il messaggio

    “Parametri errati!”.

3. Definire un metodo visualizzaChiavettaUSB( ) che visualizza lo stato corrente della chiavetta USB nella seguente forma:

---

    Nome supporto: ??????

    Dimensione memoria in GB: ?????

    Numero file presenti nella chiavetta: ?????

    Spazio attualmente occupato: ?????

    Spazio disponibile: ?????

---

Definire una classe Main per verificare il funzionamento dei metodi definiti. In particolare le istruzioni da codificare all’interno del metodo main sono le seguenti:

    creare una chiavetta USB da 32 GB

    caricare 15 file di dimensione complessiva 231 MB

    caricare 3 file di dimensione complessiva 8.3 MB

    visualizzare lo stato della chiavetta

    rimuovere 8 file di dimensione 122 MB

    caricare 3 file di dimensione complessiva 12.4 MB

    visualizzare lo stato della chiavetta
