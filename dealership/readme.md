# NOTE SULLO SVILUPPO
## INTERFACCIA
Interfaccia **VehicleCore** contiene i metodi che tutti i veicoli hanno
perché comuni

	String getBrand();
	String getModel();
	String getColor();
	int getPower();
	int getDisplacement();
	int getAvailablePlaces();
	String getLicenzePlate();
	double getPrice();
    public String toString();
    public boolean equals(Object o);

## CONDIZIONI DI UGUAGLIANZA

#### DUE CAMPER SARANNO UGUALI QUANDO
- Brand
- Modello
- Potenza
- Cilindrata
- Posti
- Tipo di camper
	 
#### DUE AUTO SARANNO UGUALI QUANDO
- Brand
- Modello
- Potenza
- Cilindrata
- Posti
- Trasmissione
- Portiere

#### DUE MOTO SARANNO UGUALI QUANDO
- Brand
- Modello
- Potenza
- Cilindrata
- Posti
- Tipo di moto

#### DUE FURGONI SARANNO UGUALI QUANDO
- Brand
- Modello
- Potenza
- Cilindrata
- Posti
- Capacita di carico

#### DUE LISTE SARANNO UGUALI QUANDO
- avranno gli stessi oggetti

## ENUMARATION
Possono essere "raggruppati" nelle enumeration 
#### Sulle auto
- CAMBIO MANUALE
- CAMBIO AUTOMATICO
#### Sulle moto
- ENDURO
- NAKED
- SUPERBIKE
- STRADALE
#### Sui camper
- AUTOCARAVAN
- PROFILATO
- MOTORHOME
- FURGONATO

## Metodi
- [X] toString e equals

- [X] Quanti mezzi sono presenti nel catalogo 

- [X] Quanti mezzi per un singolo tipo (ha scelta) sono presenti nel catalogo

- [X] Tutti i mezzi al di sotto di un certo prezzo;

- [X] Tutti i mezzi per un singolo tipo (ha scelta) al di sopra di un certo prezzo;

- [X] Tutti le auto di una certa cilindrata.

# TEST DELLE FUNZIONI
Per una maggiore leggibilità e ordine ho deciso di splittare il test delle funzioni creando tre diverse classi ognuno con il proprio main dove
### DEALERSHIPTESTER
Viene usata per testare la corretta implementazione dell equals e il toString
### DEALERSHIPDEMO
Invece viene usata per creare la lista e testare il corretto funzionamento di tutti i metodi
### DEALERSHIPCOPYTEST
Invece viene usata per testare la creazione del catalogo passando una lista gia esistente.


	