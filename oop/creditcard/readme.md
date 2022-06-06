# Carta di credito

Progettare la classe CartaCredito per la gestione di una carta di credito prepagata.

## Variabili di istanza

Si prevedano le variabili per

- l’intestatario della carta
- il codice della carta (stringa nel formato AAAA-BBBB-CCCC-DDDD)
- il saldo corrente della carta
- l’importo massimo prelevabile
- il numero di ricariche effettuate
- il numero di prelievi effettuati.

## Costruttori

Il costruttore che riceve in ingresso

- il nome dell’intestatario
- il codice della carta
- l’importo massimo prelevabile

inizializza in modo opportuno l’oggetto creato.

## Metodi

1.  Definire un metodo ricaricaCarta( ) che riceve in ingresso un intero corrispondente all’importo della ricarica da effettuare. Il metodo visualizzerà la stringa

        “Ricarica effettuata. Credito Disponibile = ????”

2.  Definire un metodo prelevaImporto( ) che riceve in ingresso un intero corrispondente all’importo del prelievo o della spesa da effettuare. Il metodo dovrà visualizzare la stringa

        “Importo superiore al massimo prelevabile”

nel caso in cui l’importo specificato sia superiore all’importo massimo prelevabile previsto per la carta; inoltre, se l’importo specificato è superiore alla disponibilità residua della carta dovrà essere visualizzata la stringa

    “Credito insufficiente. Effettuare una ricarica”

Quando il prelievo è possibile si deve visualizzare la stringa

    “Prelievo effettuato correttamente. Credito residuo = ???? ”

3. Definire un metodo visualizzaCarta che presenta le informazioni sullo stato della carta di credito nella seguente forma:

---

    Intestatario: ?????
    Numero Carta : \***\*-\*\***-\*\*\*\*-????
    Massimale: ??????
    Credito Residuo: ?????
    Numero Prelievi Effettuati: ?????
    Numero Ricariche Effettuate: ?????

---

Per il numero della carta di credito devono essere stampate solo le ultime quattro cifre.

Classe CartaPrincipale

Definire una classe CartaPrincipale per verificare il funzionamento dei metodi definiti.
