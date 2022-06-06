# Linea di produzione

Progettare la classe LineaProduzione per la gestione di una linea di produzione di una fabbrica. Una linea di produzione viene definita

- da un codice di identificazione (ad esempio “LN001”)
- dalla produttività oraria espressa in pezzi all’ora (ad esempio 30 pezzi/ora),
- dal numero di pezzi prodotti,
- dal numero di pezzi controllati e dal numero di pezzi scartati.

## Costruttori

Il costruttore deve ricevere in ingresso

- il codice di identificazione della linea
- la produttività oraria in pezzi/ora e

inizializzare in modo opportuno le altre variabili di istanza.

## Metodi

1.  Definire un metodo attivaLinea( ) che riceve in ingresso un numero intero di ore. Il metodo visualizzerà le righe

        “Linea xxx attivata.”

        “Tempo esecuzione = ????”

        “…….. Produzione terminata.”

        “Pezzi Prodotti = ????”

        “Pezzi Totali = ????”

e registrerà i pezzi prodotti in base alla produttività oraria. (Ad esempio, se la produttività oraria è di 40 pezzi/ora e la linea lavora per 3 ore verranno registrati 120 pezzi).

2. Definire un metodo controllaProduzione( ) che riceve in ingresso il numero di pezzi che sono stati controllati dagli addetti al controllo della qualità e il numero di pezzi che sono stati scartati per difetti di produzione. Il metodo dovrà naturalmente controllare che il numero di pezzi controllati passato come parametro sia superiore a quello dei pezzi scartati e stampare l’avviso “Parametri errati” in caso contrario.

3. Definire un metodo visualizzaLinea che presenta le informazioni sullo stato della linea di produzione nella seguente forma:

---

    Identificativo linea: ?????

    Produttività in pezzi/ora: ?????

    Pezzi totali prodotti: ?????

    Pezzi controllati: ?????

    Pezzi scartati: ?????

---

Definire una classe LineaPrincipale per verificare il funzionamento dei metodi definiti. In particolare le istruzioni da codificare all’interno del metodo main sono (almeno) le seguenti:

    creare una linea con produttività oraria di 70 pezzi/ora

    attivare la linea per 3 ore

    controllare 20 pezzi e registrare 3 pezzi scartati

    visualizzare lo stato della linea

    attivare la linea per 5 ore

    controllare 100 pezzi e registrare 8 pezzi scartati

    visualizzare lo stato della linea
