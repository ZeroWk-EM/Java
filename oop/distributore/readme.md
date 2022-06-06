# Distributore

Progettare la classe Distributore per la gestione di un distributore di bevande. Il distributore consente di scegliere solo tra due bevande (ad esempio Acqua e Aranciata). Ogni bevanda è caratterizzata da un prezzo unitario e dalla quantità di bottiglie presenti in un dato momento nel distributore. Dovrà essere possibile inserire monete nel distributore e scegliere uno dei due tipi di bevande. Il distributore potrà erogare la bevanda solo se l’importo inserito è uguale o superiore al costo unitario della bevanda. In caso contrario inviterà l’utente a inserire ulteriori monete.

## Variabili di istanza

Si prevedano le variabili

- per i costi unitari delle due bevande
- per il numero delle bottiglie di entrambe le bevande presenti nel distributore
- per l’importo presente nel distributore (le monete inserite da un utente che vuole comperare una bevanda).

# Costruttori

Il costruttore deve ricevere

- in ingresso i costi unitari delle due bevande
- inizializzare a 20 la quantità di bottiglie disponibili per ciascuna bevanda.

## Metodi

1.  Definire un metodo ricaricaDistributore( ) che riceve in ingresso due interi corrispondenti alla quantità di bottiglie per ciascuna bevanda rispettivamente che devono essere caricate nel distributore. Il metodo visualizzerà le righe

         “Ricarica effettuata.”
         “N. bottiglie bevanda 1 = ????”
         “N. bottiglie bevanda 2 = ????”

(Si supponga che il distributore abbia la capacità di contenere infinite bottiglie di ciascuna bevanda. Chi vuole gestire una versione più complicata del metodo può fare l’ipotesi che la capacità massima del distributore sia di 20 bottiglie per bevanda).

2.  Definire un metodo inserisciMonete( ) che riceve in ingresso il valore corrispondente alla moneta che si vuole inserire (le monete possibili sono quelle da 0,05 – 0,10 – 0,20 – 0,50 – 1,00 euro). Il metodo dovrà visualizzare la stringa

    “Il credito ammonta a = ?????”

3.  Definire un metodo scegliBevanda( ) che riceve in ingresso il numero della bevanda che si vuole scegliere (i valori possibili sono quindi 1 o 2). Se l’ammontare inserito è sufficiente per l’acquisto della bevanda il metodo dovrà visualizzare le stringhe

         “Erogazione in corso….”

         “Preleva la bevanda.”

         “Ritira il resto = ?????”

In caso contrario il metodo visualizzerà le righe

    “Credito insufficiente per l’acquisto.”

    “Inserisci ulteriori monete.”

4. Definire un metodo ritiraResto( ) senza parametri che semplicemente ritira il resto.

5. Definire un metodo visualizzaStato( ) che presenta le informazioni sullo stato del distributore nella seguente forma:

---

    Numero Bottiglie Bevanda 1: ?????

    Costo Bevanda 1: ????

    Numero Bottiglie Bevanda 2: ?????

    Costo Bevanda 2: ????

    Credito Presente: ?????

---

Definire una classe DistributorePrincipale per verificare il funzionamento dei metodi definiti.
In particolare le istruzioni da codificare all’interno del metodo main sono (almeno) le seguenti:

crea un distributore con costi unitari delle due bevande pari a 0,55 e 0,70 

rispettivamente
- inserisci una moneta da 0,50

- inserisci una moneta da 0,20

scegli la bevanda 1

ritira il resto

visualizza lo stato del distributore
