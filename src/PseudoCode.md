##Pseudo Code
###Notizen
- Welche packages erstellen wir:
    - 3 Stück
        - Service
        - Repositors
        - Modell(Entitäten)

  ###Produktstrang
    - Welche Klassen erstellen wir:
    - Produkt Klasse(Entität) `Product (int artikelNummer, String produktName)` erstellen(Produkt Informatiosnbereich)
        - Methoden
            - getter- und setter schreiben
            - toString schreiben  
        - Dafür machen wir 3 Instanzen(Objekte)
            - Seife 
            - Brot 
            - Hammer
    
    - ProductDB Klasse(Repository) **ProductDB** erstellen
        - Liste erstellen -> ArrayList, HashMap oder LinkedList
        - Methoden erstellen
            - getter und setter ?
            - list -> `public List<ProductDB> listWithAllProducts(){}`
            - toString (evtl. nur fürs testen wichtig)?
    - ProductService ?
    
###Orderstrang
  - Welche Klassen erstellen wir:
      - Order Klasse(Entität) `Order (int bestellNummer, List<Product> listOfOrders){}` erstellen(Produkt Informatiosnbereich)
          - Methoden
              - getter- und setter schreiben
              - toString schreiben
      - OrderDB
        - Methoden:
            - add-Methode
            - getter ?
            - list
            - toString 
        
              
    
                
