# Toteutusdokumentti

## Ohjelman yleisrakenne

Ohjelman käyttöliittymä on ainakin vielä luokassa Main. Aluksi luodaan Puzzle järjestyksessä ja sitten tulostetaan sen Manhattanluku tarkistuksen vuoksi. Tulostetaan numeron 7 sijainti tarkistuksen vuoksi. Sekoitetaan Puzzle tekemällä 10 kahden numeron keskinäistä siirtoa. Tulostetaan onko saatu Puzzle järjestyksessä ja mikä sen Manhattansumma on. Tulostetaan vielä numeron 7 sijainti ja koko Puzzle tarkistusta varten.

Tämän jälkeen suoritetaan ratkaisu leveyshakuun perustuen. Ohjelma on kesken, ja manuaalisessa testauksessa jäi jumiin kun suffle(120) sekoitus tehtiin. Nyt main ohjelmaan on laitettu suffle(10), mutta sitä ei ole vielä itse testattu. +Leveyshaku on toteutettu, mutta ei tehokas ja kaatuu muistiongelmaan 15 puzzlella. 8 puzzlella saatu kerran tulos 374175 siirtoa 49 sek. Nyt yritetään algoritmia Astar, mutta siinä keon toteutuksen virhe estää ratkaisuun pääsyn. Jatkuu viikolla 6. Aiemmin tehty leveyshaku käyttää liikaa aikaa ja muistia ratkaistaakseen 4x4 kokoisen Puzzlen, pisin ajo kesti 19 min 56 sek, päätyen muistin loppumiseen. 3x3 Puzzle saatiin kerran ratkaistua ajassa 49 sek, 374176 siirtoa. Tarvitaan tehostusta.


## Ohjelman syötteet

Tässä vaiheessa ohjelma ei pyydä syötteitä. Tarkoitus on, että käyttäjä voi valita Puzzlen koon, antaa sekoituskerrat tai vaihtoehtoisesti syöttää oman alkuaseman.

## Aika ja tilavaativuudet

Tavoitteena on saada ratkaisijat toimimaan alle 10 minuutin. Tilavaatimusta ei ole vielä arvioitu. Leveyshakua täytyy optimoida, jos tavoitteisiin halutaan päästä. Toive on, että Astar saadaan toteutettua kurssin puitteissa

## Lähteet

http://en.m.wikipedia.org/wiki/15_puzzle
http://jamie-wong.com/2011/10/16/fifteen-puzzle-algorithm/ 
https://www.youtube.com/watch?v=lL-8KGXehNY 
https://en.wikipedia.org/wiki/15_puzzle#Solvability
