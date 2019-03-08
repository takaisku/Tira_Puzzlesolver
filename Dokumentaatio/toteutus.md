# Toteutusdokumentti

## Ohjelman yleisrakenne

Ohjelman käyttöliittymä on luokassa Main. Aluksi esitellään Puzzle ja sen sekoittaminen ratkaistavaksi. Käyttäjää opastetaan konsolissa antamaan syötteen kokonaislukuina. Aluksi käyttäjä voi antaa montako kertaa 4x4 puzzlen kahta numeroa vaihdetaan. Jos vaihdetaan parillinen määrä, on Puzzle ratkaistavissa. 

Sitten puzzle ratkaistaan algoritmillaA* ja tulostetaan siirtojen määrä, käytetty muisti kilotavuina ja käytetty aika millisekunteina. 

Tämän jälkeen käyttäjältä kysytään halutun puzzlen koko. Muisti ja aika asettavat rajoituksia, mutta myös jo käytyjen tilanteiden lista (Position.Java) voi kaatua, kun annetaan liian iso koko. Tämä siksi, että Puzzle talletaan listaan String oliona ja kullekin Puzzlen numerolle on asciimerkkivastine. Käyttäjältä kysytään minkä kokoisella puzzlella haluaa testata algoritmit, mutta varoitetaan, että yli 3x3 puzzlet vie aikaa ja muistia. Aluksi luodaan Puzzle järjestyksessä ja sitten  tulostetaan sen Manhattanluku tarkistuksen vuoksi.  Sekoitetaan Puzzle tekemällä 19 kahden numeron keskinäistä siirtoa. Tulostetaan onko saatu Puzzle järjestyksessä ja mikä sen Manhattansumma on ja onko Puzzle ratkaistavissa, tulos false. Sitten vaihdetaan vielä yksi pari ja samat tulosteet, nyt true. Sitten ratkaistaan se ensin pisimpään kestävällä syvyyshaulla. Toisena leveyshaku ja viimeisenä a* algoritmilla.

Syvyyshaku kestää tosi kauan jo 4x4 puzzlella vaikkakin parhaita tuloksia on 70 sekunnin luokkaa. Leveyshaku on toteutettu, mutta ei tehokas ja kaatuu muistiongelmaan 15 puzzlella. Leveyshaku käyttää liikaa aikaa ja muistia ratkaistaakseen 4x4 kokoisen Puzzlen, pisin ajo kesti 19 min 56 sek, päätyen muistin loppumiseen. 3x3 Puzzle saatiin kerran ratkaistua ajassa 49 sek, 374176 siirtoa. 8 puzzlella saatu kerran tulos 374175 siirtoa 49 sek. 

Hakujen tehostusta ei ehditty tehdä kurssin puitteissa. Olisi kiva lukea toisen Puzzleratkojan tehneen kurssilaisen työ.


## Ohjelman syötteet

Ohjelma etenee pyytämällä käyttäjältä kokonaislukuja. 

## Aika ja tilavaativuudet

Tavoitteena on saada ratkaisijat toimimaan alle 10 minuutin. Tilavaatimusta ei saatu määriteltyä vaihtelun vuoksi. Periaatteessa 4 x 4 puzzlelle on 16! eli noin 20 biljoonaa vaihtoehtoa, ja jos jokaisessa käydään ennen oikeaa, on Position listalla näin monta 16 int + osoitetta vaativa muistitarve. Leveyshakua täytyy optimoida, jos tavoitteisiin halutaan päästä. 

Aika, muisti ja tilavaativuuden mittausta hoitaa Result luokka, mutta tämä jäi pahasti kesken eräiseksi eikä esimerkiksi muistia mittaa oikein. Nyt sen keskeisenä osana on System.runtime() olio.

## Lähteet

http://en.m.wikipedia.org/wiki/15_puzzle
http://jamie-wong.com/2011/10/16/fifteen-puzzle-algorithm/ 
https://www.youtube.com/watch?v=lL-8KGXehNY 
https://en.wikipedia.org/wiki/15_puzzle#Solvability
