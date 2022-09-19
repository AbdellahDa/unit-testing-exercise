# TDD Demo 
Requirements:
Schrijf een class Product.
Je maakt een object van de class Product met 3 parameters:
* name (String)
* size (Integer - optioneel = mogelijk null)
* percentage (Double - optioneel = mogelijk null)

In de class Product maak je een functie productDescription.
Deze geeft een beschrijving van de details van het product (size en percentage) als die gegeven zijn.
Indien die beide null zijn, dan wordt een lege string geretourneerd.  
De beschrijving begint met het character •.
De size is in CL, het percentage in %.  
Als percentage een geheel getal is toon je dit zonder cijfers na de komma, anders met 1 cijfer.  
Size en percentage zijn gescheiden door een spatie.

Dus bvb: " • 33CL 6.3%" 
