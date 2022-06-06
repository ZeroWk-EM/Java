# Lettore MP3

Progettare la classe LettoreMP3 per la gestione di un lettore MP3. Un lettore MP3 è caratterizzato

- dalla memoria totale in GB
- dalla potenza della batteria espressa da un numero massimo di ore ascoltabili
- dal numero di brani caricati
- dal livello residuo della batteria espresso in ore di ascolto
- dal tempo totale di ascolto.

## Costruttori

Il costruttore deve ricevere in ingresso

- la memoria in GB
- la potenza della batteria
- ed inizializzare in modo opportuno le altre variabili di istanza.

## Metodi

1.  Definire un metodo caricaBrani( ) che riceve in ingresso un intero corrispondente al numero di brani da inserire nel lettore. Il metodo visualizzerà le righe

         “Caricati ???? brani.”
         “Totale brani presenti nel lettore = ????”

2.  Definire un metodo rimuoviBrani( ) che riceve in ingresso un intero corrispondente al numero di brani da rimuovere dal lettore. Il metodo visualizzerà le righe

         “Rimossi ???? brani.”
         “Totale brani presenti nel lettore = ????”

Il metodo dovrà controllare che il numero di brani da rimuovere sia inferiore o uguala a quello dei brani presenti nel lettore; in caso contrario visualizzerà il messaggio “Parametri errati!”.

3. Definire un metodo ascoltaBrani( ) che riceve in ingresso un numero di ore corrispondente al tempo di ascolto ( si controlli che tale numero sia inferiore al livello corrente della batteria)
   decrementa in modo opportuno il livello della batteria e registra le ore ascoltate.

4. Definire un metodo caricaBatteria( ) che riporta il livello della batteria al massimo valore e visualizza il messaggio:

“Ricarica completata!”

5. Definire un metodo visualizzaLettore( ) che visualizza lo stato corrente del lettore MP3 nella seguente forma:

---

      Dimensione memoria in GB: ?????
      Potenza batteria in ore: ?????
      Numero brani presenti nel lettore: ?????
      Livello residuo batteria: ?????
      Tempo totale di ascolto: ?????

---

Classe LettorePrincipale
Definire una classe LettorePrincipale per verificare il funzionamento dei metodi definiti. In particolare le istruzioni da codificare all’interno del metodo main sono le seguenti:

      creare un lettore MP3 da 8 GB e potenza batteria di 16 ore

      caricare 30 brani

      registrare 4 ore di ascolto

      visualizzare lo stato del lettore

      rimuovere 8 brani

      registrare 7 ore di ascolto

      visualizzare lo stato del lettore
