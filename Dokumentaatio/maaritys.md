# Puzzle pelin ratkaisija vertailu

# Määrittelydokumentti

## Aihe

Tavoitteena on verrata puzzle pelin (15-peli) ratkaisevia algoritmeja tilavaativuuden, suoritusajan ja myös ratkaisun siirtojen määrän mukaan. Tulosten vuoksi ei rajoituta 4x4 pelialueeseen, vaan ohjelmalle voi antaa halutun koon, joskin muisti / aika raja tulee joskus vastaan.  Ensin toteutan leveyshaun, jonka ensimmäinen löytynyt ratkaisu toimii verrokkina. Kolmantena syvyyshaku vastaavasti. Jos löydän jotain vihjeitä teen niiden perusteella optimoidun ratkaisijan neljänneksi. Lopulliset algorithmit pitää toimia eri kokoisilla puzzleilla, kuitenkin niin, ettei 10 sek aikaa ylitetä. Kurssin vetäjän vihjeestä tein A* algoritmin, joka olikin nopein tehdyistä.

Tilavaatimus määräytyy myöhemmin. Helpoimmillaan tarvitaan tieto palikan sijainnista, sen oikeasta paikasta ja aukon sijainnista eli T(2n) = T(n). Leveys ja syvyyshaku T(n²). Yksinkertaisen koodin aikavaativuus on arvioitavissa seuraavasti: jokainen palikka on keskimäärin puolet leveydestä ja puolet korkeudesta pielessä paikaltaan. Ensin aukko siirretään oikealle puolelle siirrettävää palikkaa ja sitten palikka oikealle kohdalle. Jokainen aukon tai palikan siirto kulmittain vaatii neljä palikan siirtoa. Siirtovaatimus on siis lähtökohtaisesti S(4n) = S(n). Aikavaatimus kasvaa toki puzzlen kasvaessa, mutta tavoite on, että puzzlen koko valitaan siten, että yksittäisen algoritmin maksimiaika on 10 sek. Tämä toimii valitettavasti vain 3 x 3 eli 8-puzzlella.

Ohjelma generoi randomin puzzlen annetulle koolle ja suorittaa vertailut sillä. 

Kurssiohjeiden mukaan määrittelydokumentaation pitäisi olla valmis ensimmäiseen palautukseen ja siihen pitäisi olla merkitty lähteet. No omasta päästä tähän asti.


