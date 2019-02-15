Next 1
ei mitä verrata
tämän kustannus:39
Exception in thread "main" java.lang.NullPointerException
        at Model.Puzzle.compareTo(Puzzle.java:322)
        at ui.Heap.siftDown(Heap.java:86)
        at ui.Heap.remove(Heap.java:75)
        at Algorithms.Astar.run(Astar.java:31)
        at Algorithms.Astar.showResult(Astar.java:62)
        at ui.Main.main(Main.java:53)

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':run'.
> Process 'command '/home/tkarkine/.sdkman/candidates/java/8.0.191-oracle/bin/java'' finished with non-zero exit value 1

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 0s
2 actionable tasks: 1 executed, 1 up-to-date
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Puzzle-Solver$ gradle run

> Task :run FAILED
järjestyksessä
manhattan: 0
1
2
missplaced: 0
sekoitettu
manhanttan: 18
2
3
missplaced: 9

  1  2  4 15
  5  6  3 11
 12 10  8  7
 13  9 14    
adding to heap
siftup 0
removing from heap
Next 0
moves: 1
Testing right
Testing down
Testing left
Moving left
adding to heap
siftup 0
Testing up
Moving up
adding to heap
siftup 1
siftup 0
removing from heap
Next 1
left null
moves: 2
Testing right
Testing down
Testing left
Moving left
adding to heap
siftup 1
siftup 0
Testing up
Moving up
adding to heap
siftup 2
siftup 1
siftup 0
removing from heap
Next 2
tämän kustannus:20
Toisen kust: 20
moves: 3
Testing right
Testing down
Testing left
Moving left
adding to heap
siftup 2
siftup 1
siftup 0
Testing up
Moving up
adding to heap
siftup 3
siftup 1
siftup 0
removing from heap
Next 3
tämän kustannus:20
Toisen kust: 20
left null
moves: 4
Testing right
Testing down
Testing left
Moving left
adding to heap
siftup 3
siftup 1
siftup 0
Testing up
removing from heap
Next 3
tämän kustannus:20
Toisen kust: 20
left null
moves: 5
Testing right
Testing down
Moving down
adding to heap
siftup 3
siftup 1
siftup 0
Testing left
Moving left
adding to heap
siftup 4
siftup 2
siftup 1
siftup 0
Testing up
removing from heap
Next 4
tämän kustannus:16
Toisen kust: 20
tämän kustannus:20
Toisen kust: 20
moves: 6
Testing right
Testing down
Moving down
adding to heap
siftup 4
siftup 2
siftup 1
siftup 0
Testing left
Moving left
adding to heap
siftup 5
siftup 2
siftup 1
siftup 0
Testing up
removing from heap
Next 5
tämän kustannus:18
Toisen kust: 16
left null
moves: 7
Testing right
Testing down
Moving down
adding to heap
siftup 5
siftup 2
siftup 1
siftup 0
Testing left
Testing up
removing from heap
Next 5
tämän kustannus:16
Toisen kust: 18
tämän kustannus:20
Toisen kust: 20
left null
moves: 8
Testing right
Moving right
adding to heap
siftup 5
siftup 2
siftup 1
siftup 0
Testing down
Moving down
adding to heap
siftup 6
siftup 3
siftup 1
siftup 0
Testing left
Testing up
removing from heap
Next 6
tämän kustannus:20
Toisen kust: 20
tämän kustannus:18
Toisen kust: 20
Exception in thread "main" moves: 9
Testing right
Moving right
adding to heap
siftup 6
siftup 3
siftup 1
siftup 0
Testing down
java.lang.ArrayIndexOutOfBoundsException: 45
        at ui.Heap.siftDown(Heap.java:81)
        at ui.Heap.siftDown(Heap.java:98)
        at ui.Heap.siftDown(Heap.java:98)
        at ui.Heap.siftDown(Heap.java:98)
        at ui.Heap.siftDown(Heap.java:95)
        at ui.Heap.remove(Heap.java:75)
        at Algorithms.Astar.run(Astar.java:31)
        at Algorithms.Astar.showResult(Astar.java:62)
        at ui.Main.main(Main.java:53)
Moving down
adding to heap
siftup 7
siftup 3
siftup 1
siftup 0
Testing left
Testing up
removing from heap
Next 7
tämän kustannus:21
Toisen kust: 18
tämän kustannus:20
Toisen kust: 16
left null
moves: 10
Testing right
Moving right
adding to heap
siftup 7
siftup 3
siftup 1
siftup 0
Testing down
Testing left
Testing up
removing from heap
Next 7
tämän kustannus:18
Toisen kust: 16
tämän kustannus:20
Toisen kust: 20
left null
moves: 11
Testing right
Moving right
adding to heap
siftup 7
siftup 3
siftup 1
siftup 0
Testing down
Testing left
Testing up
Moving up
adding to heap
siftup 8
siftup 4
siftup 2
siftup 1
siftup 0
removing from heap
Next 8
tämän kustannus:20
Toisen kust: 16
tämän kustannus:20
Toisen kust: 20
left null
moves: 12
Testing right
Moving right
adding to heap
siftup 8
siftup 4
siftup 2
siftup 1
siftup 0
Testing down
Testing left
Moving left
adding to heap
siftup 9
siftup 4
siftup 2
siftup 1
siftup 0
Testing up
Moving up
adding to heap
siftup 10
siftup 5
siftup 2
siftup 1
siftup 0
removing from heap
Next 10
tämän kustannus:23
Toisen kust: 24
tämän kustannus:18
Toisen kust: 20
tämän kustannus:21
Toisen kust: 20
left null
moves: 13
Testing right
Moving right
adding to heap
siftup 10
siftup 5
siftup 2
siftup 1
siftup 0
Testing down
Testing left
Moving left
adding to heap
siftup 11
siftup 5
siftup 2
siftup 1
siftup 0
Testing up
Moving up
adding to heap
siftup 12
siftup 6
siftup 3
siftup 1
siftup 0
removing from heap
Next 12
tämän kustannus:25
Toisen kust: 23
tämän kustannus:18
Toisen kust: 20
tämän kustannus:24
Toisen kust: 20
moves: 14
Testing right
Moving right
adding to heap
siftup 12
siftup 6
siftup 3
siftup 1
siftup 0
Testing down
Testing left
Moving left
adding to heap
siftup 13
siftup 6
siftup 3
siftup 1
siftup 0
Testing up
removing from heap
Next 13
tämän kustannus:23
Toisen kust: 18
tämän kustannus:20
Toisen kust: 25
tämän kustannus:24
Toisen kust: 20
left null
moves: 15
Testing right
Testing down
Moving down
adding to heap
siftup 13
siftup 6
siftup 3
siftup 1
siftup 0
Testing left
Testing up
removing from heap
Next 13
tämän kustannus:18
Toisen kust: 20
tämän kustannus:23
Toisen kust: 20
tämän kustannus:20
Toisen kust: 16
left null
moves: 16
Testing right
Moving right
adding to heap
siftup 13
siftup 6
siftup 3
siftup 1
siftup 0
Testing down
Moving down
adding to heap
siftup 14
siftup 7
siftup 3
siftup 1
siftup 0
Testing left
Testing up
removing from heap
Next 14
tämän kustannus:26
Toisen kust: 20
tämän kustannus:20
Toisen kust: 23
tämän kustannus:24
Toisen kust: 24
left null
moves: 17
Testing right
Moving right
adding to heap
siftup 14
siftup 7
siftup 3
siftup 1
siftup 0
Testing down
Moving down
adding to heap
siftup 15
siftup 7
siftup 3
siftup 1
siftup 0
Testing left
Testing up
removing from heap
Next 15
tämän kustannus:28
Toisen kust: 20
tämän kustannus:24
Toisen kust: 23
tämän kustannus:23
Toisen kust: 20
left null
moves: 18
Testing right
Moving right
adding to heap
siftup 15
siftup 7
siftup 3
siftup 1
siftup 0
Testing down
Testing left
Testing up
removing from heap
Next 15
tämän kustannus:20
Toisen kust: 23
tämän kustannus:28
Toisen kust: 16
tämän kustannus:20
Toisen kust: 25
left null
moves: 19
Testing right
Moving right
adding to heap
siftup 15
siftup 7
siftup 3
siftup 1
siftup 0
Testing down
Testing left
Testing up
Moving up
adding to heap
siftup 16
siftup 8
siftup 4
siftup 2
siftup 1
siftup 0
removing from heap
Next 16
tämän kustannus:26
Toisen kust: 20
tämän kustannus:24
Toisen kust: 20
tämän kustannus:23
Toisen kust: 18
left null
moves: 20
Testing right
Moving right
adding to heap
siftup 16
siftup 8
siftup 4
siftup 2
siftup 1
siftup 0
Testing down
Testing left
Moving left
adding to heap
siftup 17
siftup 8
siftup 4
siftup 2
siftup 1
siftup 0
Testing up
Moving up
adding to heap
siftup 18
siftup 9
siftup 4
siftup 2
siftup 1
siftup 0
removing from heap
Next 18
tämän kustannus:28
Toisen kust: 30
tämän kustannus:16
Toisen kust: 20
tämän kustannus:28
Toisen kust: 20
tämän kustannus:23
Toisen kust: 26
moves: 21
Testing right
Moving right
adding to heap
siftup 18
siftup 9
siftup 4
siftup 2
siftup 1
siftup 0
Testing down
Testing left
Moving left
adding to heap
siftup 19
siftup 9
siftup 4
siftup 2
siftup 1
siftup 0
Testing up
Moving up
adding to heap
siftup 20
siftup 10
siftup 5
siftup 2
siftup 1
siftup 0
removing from heap
Next 20
tämän kustannus:31
Toisen kust: 30
tämän kustannus:28
Toisen kust: 18
tämän kustannus:23
Toisen kust: 20
left null
moves: 22
Testing right
Moving right
adding to heap
siftup 20
siftup 10
siftup 5
siftup 2
siftup 1
siftup 0
Testing down
Testing left
Moving left
adding to heap
siftup 21
siftup 10
siftup 5
siftup 2
siftup 1
siftup 0
Testing up
removing from heap
Next 21
tämän kustannus:27
Toisen kust: 30
tämän kustannus:20
Toisen kust: 16
tämän kustannus:30
Toisen kust: 18
left null
moves: 23
Testing right
Testing down
Moving down
adding to heap
siftup 21
siftup 10
siftup 5
siftup 2
siftup 1
siftup 0
Testing left
Testing up
removing from heap
Next 21
tämän kustannus:27
Toisen kust: 16
tämän kustannus:30
Toisen kust: 20
tämän kustannus:23
Toisen kust: 25
left null
moves: 24
Testing right
Moving right
adding to heap
siftup 21
siftup 10
siftup 5
siftup 2
siftup 1
siftup 0
Testing down
Moving down
adding to heap
siftup 22
siftup 11
siftup 5
siftup 2
siftup 1
siftup 0
Testing left
Testing up
removing from heap
Next 22
tämän kustannus:27
Toisen kust: 16
tämän kustannus:27
Toisen kust: 23
tämän kustannus:28
Toisen kust: 25
left null
moves: 25
Testing right
Moving right
adding to heap
siftup 22
siftup 11
siftup 5
siftup 2
siftup 1
siftup 0
Testing down
Moving down
adding to heap
siftup 23
siftup 11
siftup 5
siftup 2
siftup 1
siftup 0
Testing left
Testing up
removing from heap
Next 23
tämän kustannus:30
Toisen kust: 16
tämän kustannus:27
Toisen kust: 25
tämän kustannus:28
Toisen kust: 24
left null
moves: 26
Testing right
Moving right
adding to heap
siftup 23
siftup 11
siftup 5
siftup 2
siftup 1
siftup 0
Testing down
Testing left
Testing up
removing from heap
Next 23
tämän kustannus:16
Toisen kust: 30
tämän kustannus:20
Toisen kust: 18
tämän kustannus:30
Toisen kust: 30
tämän kustannus:31
Toisen kust: 20

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':run'.
> Process 'command '/home/tkarkine/.sdkman/candidates/java/8.0.191-oracle/bin/java'' finished with non-zero exit value 1

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 0s
2 actionable tasks: 2 executed
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Puzzle-Solver$ ls
build  build.gradle  java_pid16759.hprof  nbproject  settings.gradle  src
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Puzzle-Solver$ cd ..
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ ls
Dokumentaatio  LICENSE  Puzzle-Solver  README.md
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ nano README.md 
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ cd Dokumentaatio/
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ cp viikko4.md viikko5.md
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ ls
javadoc  maaritys.md  reports  testausdokumentti.md  toteutus.md  viikko1.md  viikko2.md  viikko3.md  viikko4.md  viikko5.md
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ nano viikko5.md
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ nano viikko4.md 
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ nano viikko3.md 
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ ls
javadoc  maaritys.md  reports  testausdokumentti.md  toteutus.md  viikko1.md  viikko2.md  viikko3.md  viikko4.md  viikko5.md
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ nano toteutus.md
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ cd ..
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git status
On branch master
Your branch is up-to-date with 'origin/master'.

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

	modified:   Dokumentaatio/toteutus.md
	modified:   Dokumentaatio/viikko3.md
	modified:   Dokumentaatio/viikko4.md
	modified:   Puzzle-Solver/.gradle/4.10.2/fileHashes/fileHashes.bin
	modified:   Puzzle-Solver/.gradle/4.10.2/fileHashes/fileHashes.lock
	modified:   Puzzle-Solver/.gradle/4.10.2/javaCompile/classAnalysis.bin
	modified:   Puzzle-Solver/.gradle/4.10.2/javaCompile/javaCompile.lock
	modified:   Puzzle-Solver/.gradle/4.10.2/taskHistory/taskHistory.bin
	modified:   Puzzle-Solver/.gradle/4.10.2/taskHistory/taskHistory.lock
	modified:   Puzzle-Solver/.gradle/4.5.1/fileContent/fileContent.lock
	modified:   Puzzle-Solver/.gradle/4.5.1/fileHashes/fileHashes.bin
	modified:   Puzzle-Solver/.gradle/4.5.1/fileHashes/fileHashes.lock
	modified:   Puzzle-Solver/.gradle/4.5.1/taskHistory/taskHistory.bin
	modified:   Puzzle-Solver/.gradle/4.5.1/taskHistory/taskHistory.lock
	modified:   Puzzle-Solver/.gradle/buildOutputCleanup/buildOutputCleanup.lock
	modified:   Puzzle-Solver/.gradle/buildOutputCleanup/cache.properties
	modified:   Puzzle-Solver/.gradle/buildOutputCleanup/outputFiles.bin
	modified:   Puzzle-Solver/src/main/java/Algorithms/BreadthFirst.java
	modified:   Puzzle-Solver/src/main/java/Model/Puzzle.java
	modified:   Puzzle-Solver/src/main/java/ui/Main.java
	modified:   Puzzle-Solver/src/main/java/ui/Queue.java
	modified:   README.md

Untracked files:
  (use "git add <file>..." to include in what will be committed)

	.gradle/
	Dokumentaatio/.viikko5.md.swp
	Dokumentaatio/viikko5.md
	Puzzle-Solver/java_pid16759.hprof
	Puzzle-Solver/src/main/java/Algorithms/Astar.java
	Puzzle-Solver/src/main/java/ui/Heap.java

no changes added to commit (use "git add" and/or "git commit -a")
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git add .
^X
ls

^C
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git status
On branch master
Your branch is up-to-date with 'origin/master'.

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

	modified:   Dokumentaatio/toteutus.md
	modified:   Dokumentaatio/viikko3.md
	modified:   Dokumentaatio/viikko4.md
	modified:   Puzzle-Solver/.gradle/4.10.2/fileHashes/fileHashes.bin
	modified:   Puzzle-Solver/.gradle/4.10.2/fileHashes/fileHashes.lock
	modified:   Puzzle-Solver/.gradle/4.10.2/javaCompile/classAnalysis.bin
	modified:   Puzzle-Solver/.gradle/4.10.2/javaCompile/javaCompile.lock
	modified:   Puzzle-Solver/.gradle/4.10.2/taskHistory/taskHistory.bin
	modified:   Puzzle-Solver/.gradle/4.10.2/taskHistory/taskHistory.lock
	modified:   Puzzle-Solver/.gradle/4.5.1/fileContent/fileContent.lock
	modified:   Puzzle-Solver/.gradle/4.5.1/fileHashes/fileHashes.bin
	modified:   Puzzle-Solver/.gradle/4.5.1/fileHashes/fileHashes.lock
	modified:   Puzzle-Solver/.gradle/4.5.1/taskHistory/taskHistory.bin
	modified:   Puzzle-Solver/.gradle/4.5.1/taskHistory/taskHistory.lock
	modified:   Puzzle-Solver/.gradle/buildOutputCleanup/buildOutputCleanup.lock
	modified:   Puzzle-Solver/.gradle/buildOutputCleanup/cache.properties
	modified:   Puzzle-Solver/.gradle/buildOutputCleanup/outputFiles.bin
	modified:   Puzzle-Solver/src/main/java/Algorithms/BreadthFirst.java
	modified:   Puzzle-Solver/src/main/java/Model/Puzzle.java
	modified:   Puzzle-Solver/src/main/java/ui/Main.java
	modified:   Puzzle-Solver/src/main/java/ui/Queue.java
	modified:   README.md

Untracked files:
  (use "git add <file>..." to include in what will be committed)

	.gradle/
	Dokumentaatio/.viikko5.md.swp
	Dokumentaatio/viikko5.md
	Puzzle-Solver/java_pid16759.hprof
	Puzzle-Solver/src/main/java/Algorithms/Astar.java
	Puzzle-Solver/src/main/java/ui/Heap.java

no changes added to commit (use "git add" and/or "git commit -a")
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git add .
^Z
[1]+  Stopped                 git add .
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git status
On branch master
Your branch is up-to-date with 'origin/master'.

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

	modified:   Dokumentaatio/toteutus.md
	modified:   Dokumentaatio/viikko3.md
	modified:   Dokumentaatio/viikko4.md
	modified:   Puzzle-Solver/.gradle/4.10.2/fileHashes/fileHashes.bin
	modified:   Puzzle-Solver/.gradle/4.10.2/fileHashes/fileHashes.lock
	modified:   Puzzle-Solver/.gradle/4.10.2/javaCompile/classAnalysis.bin
	modified:   Puzzle-Solver/.gradle/4.10.2/javaCompile/javaCompile.lock
	modified:   Puzzle-Solver/.gradle/4.10.2/taskHistory/taskHistory.bin
	modified:   Puzzle-Solver/.gradle/4.10.2/taskHistory/taskHistory.lock
	modified:   Puzzle-Solver/.gradle/4.5.1/fileContent/fileContent.lock
	modified:   Puzzle-Solver/.gradle/4.5.1/fileHashes/fileHashes.bin
	modified:   Puzzle-Solver/.gradle/4.5.1/fileHashes/fileHashes.lock
	modified:   Puzzle-Solver/.gradle/4.5.1/taskHistory/taskHistory.bin
	modified:   Puzzle-Solver/.gradle/4.5.1/taskHistory/taskHistory.lock
	modified:   Puzzle-Solver/.gradle/buildOutputCleanup/buildOutputCleanup.lock
	modified:   Puzzle-Solver/.gradle/buildOutputCleanup/cache.properties
	modified:   Puzzle-Solver/.gradle/buildOutputCleanup/outputFiles.bin
	modified:   Puzzle-Solver/src/main/java/Algorithms/BreadthFirst.java
	modified:   Puzzle-Solver/src/main/java/Model/Puzzle.java
	modified:   Puzzle-Solver/src/main/java/ui/Main.java
	modified:   Puzzle-Solver/src/main/java/ui/Queue.java
	modified:   README.md

Untracked files:
  (use "git add <file>..." to include in what will be committed)

	.gradle/
	Dokumentaatio/viikko5.md
	Dokumentaatio/viikko5.md.save
	Puzzle-Solver/java_pid16759.hprof
	Puzzle-Solver/src/main/java/Algorithms/Astar.java
	Puzzle-Solver/src/main/java/ui/Heap.java

no changes added to commit (use "git add" and/or "git commit -a")
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git add -p
diff --git a/Dokumentaatio/toteutus.md b/Dokumentaatio/toteutus.md
index 7885f1f..fd34597 100644
--- a/Dokumentaatio/toteutus.md
+++ b/Dokumentaatio/toteutus.md
@@ -2,11 +2,11 @@
 
 ## Ohjelman yleisrakenne
 
-Ohjelman käyttöliittymä on ainakin tällä hetkellä luokassa Main. 
+Ohjelman käyttöliittymä on ainakin vielä luokassa Main. 
 
 Aluksi luodaan Puzzle järjestyksessä ja sitten tulostetaan sen Manhattanluku tarkistuksen vuoksi. Tulostetaan numeron 14 sijainti tarkistuksen vuoksi. Sekoitetaan Puzzle tekemällä 10 kahden numeron keskinäistä siirtoa. Tulostetaan onko saatu Puzzle järjestyksessä ja mikä sen Manhattansumma on. Tulostetaan vielä numeron 14 sijainti ja koko Puzzle tarkistusta varten.
 
-Tämän jälkeen suoritetaan ratkaisu leveyshakuun perustuen. Ohjelma on kesken, ja manuaalisessa testauksessa jäi jumiin kun suffle(120) sekoitus tehtiin. Nyt main ohjelmaan on laitettu suffle(10), mutta sitä ei ole vielä itse testattu.
+Leveyshaku on toteutettu, mutta ei tehokas ja kaatuu muistiongelmaan 15 puzzlella. 8 puzzlella saatu kerran tulos 374175 siirtoa 49 sek. Nyt yritetään algoritmia Astar, mutta siinä keon toteutuksen virhe estää ratkaisuun pääsyn. Jatkuu viikolla 6.
 
 ## Ohjelman syötteet
 
Stage this hunk [y,n,q,a,d,j,J,g,/,s,e,?]? y
@@ -14,8 +14,12 @@ Tässä vaiheessa ohjelma ei pyydä syötteitä. Tarkoitus on, että käyttäjä
 
 ## Aika ja tilavaativuudet
 
-Tavoitteena on saada ratkaisijat toimimaan alle 10 minuutin. Nyt tuntuu vielä hankalalta. Tilavaatimusta ei ole vielä arvioitu.
+Tavoitteena on saada ratkaisijat toimimaan alle 10 minuutin.  Tilavaatimusta ei ole vielä arvioitu. Leveyshakua täytyy optimoida, jos tavoitteisiin halutaan päästä. Toive on, että Astar saadaan toteutettua kurssin puitteissa.
+
 
 ## Lähteet
 
 http://en.m.wikipedia.org/wiki/15_puzzle
+http://jamie-wong.com/2011/10/16/fifteen-puzzle-algorithm/
+https://www.youtube.com/watch?v=lL-8KGXehNY
+https://en.wikipedia.org/wiki/15_puzzle#Solvability	
Stage this hunk [y,n,q,a,d,K,g,/,s,e,?]? y
<stdin>:10: trailing whitespace.
Ohjelman käyttöliittymä on ainakin vielä luokassa Main. 
<stdin>:32: trailing whitespace.
https://en.wikipedia.org/wiki/15_puzzle#Solvability	
fatal: Unable to create '/home/tkarkine/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/.git/index.lock': File exists.

Another git process seems to be running in this repository, e.g.
an editor opened by 'git commit'. Please make sure all processes
are terminated then try again. If it still fails, a git process
may have crashed in this repository earlier:
remove the file manually to continue.
diff --git a/Dokumentaatio/toteutus.md b/Dokumentaatio/toteutus.md
index 7885f1f..fd34597 100644
--- a/Dokumentaatio/toteutus.md
+++ b/Dokumentaatio/toteutus.md
@@ -2,11 +2,11 @@
 
 ## Ohjelman yleisrakenne
 
-Ohjelman käyttöliittymä on ainakin tällä hetkellä luokassa Main. 
+Ohjelman käyttöliittymä on ainakin vielä luokassa Main. 
 
 Aluksi luodaan Puzzle järjestyksessä ja sitten tulostetaan sen Manhattanluku tarkistuksen vuoksi. Tulostetaan numeron 14 sijainti tarkistuksen vuoksi. Sekoitetaan Puzzle tekemällä 10 kahden numeron keskinäistä siirtoa. Tulostetaan onko saatu Puzzle järjestyksessä ja mikä sen Manhattansumma on. Tulostetaan vielä numeron 14 sijainti ja koko Puzzle tarkistusta varten.
 
-Tämän jälkeen suoritetaan ratkaisu leveyshakuun perustuen. Ohjelma on kesken, ja manuaalisessa testauksessa jäi jumiin kun suffle(120) sekoitus tehtiin. Nyt main ohjelmaan on laitettu suffle(10), mutta sitä ei ole vielä itse testattu.
+Leveyshaku on toteutettu, mutta ei tehokas ja kaatuu muistiongelmaan 15 puzzlella. 8 puzzlella saatu kerran tulos 374175 siirtoa 49 sek. Nyt yritetään algoritmia Astar, mutta siinä keon toteutuksen virhe estää ratkaisuun pääsyn. Jatkuu viikolla 6.
 
 ## Ohjelman syötteet
 
@@ -14,8 +14,12 @@ Tässä vaiheessa ohjelma ei pyydä syötteitä. Tarkoitus on, että käyttäjä
 
 ## Aika ja tilavaativuudet
 
-Tavoitteena on saada ratkaisijat toimimaan alle 10 minuutin. Nyt tuntuu vielä hankalalta. Tilavaatimusta ei ole vielä arvioitu.
+Tavoitteena on saada ratkaisijat toimimaan alle 10 minuutin.  Tilavaatimusta ei ole vielä arvioitu. Leveyshakua täytyy optimoida, jos tavoitteisiin halutaan päästä. Toive on, että Astar saadaan toteutettua kurssin puitteissa.
+
 
 ## Lähteet
 
 http://en.m.wikipedia.org/wiki/15_puzzle
+http://jamie-wong.com/2011/10/16/fifteen-puzzle-algorithm/
+https://www.youtube.com/watch?v=lL-8KGXehNY
+https://en.wikipedia.org/wiki/15_puzzle#Solvability	

diff --git a/Dokumentaatio/viikko3.md b/Dokumentaatio/viikko3.md
index ade05b0..e1fb193 100644
--- a/Dokumentaatio/viikko3.md
+++ b/Dokumentaatio/viikko3.md
@@ -1,4 +1,4 @@
-# Viikkoraportti 2
+# Viikkoraportti 3
 
 Author Toivo Kärkinen
 
Stage this hunk [y,n,q,a,d,e,?]? y     
fatal: Unable to create '/home/tkarkine/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/.git/index.lock': File exists.

Another git process seems to be running in this repository, e.g.
an editor opened by 'git commit'. Please make sure all processes
are terminated then try again. If it still fails, a git process
may have crashed in this repository earlier:
remove the file manually to continue.
diff --git a/Dokumentaatio/viikko3.md b/Dokumentaatio/viikko3.md
index ade05b0..e1fb193 100644
--- a/Dokumentaatio/viikko3.md
+++ b/Dokumentaatio/viikko3.md
@@ -1,4 +1,4 @@
-# Viikkoraportti 2
+# Viikkoraportti 3
 
 Author Toivo Kärkinen
 

diff --git a/Dokumentaatio/viikko4.md b/Dokumentaatio/viikko4.md
index 2664126..93d3208 100644
--- a/Dokumentaatio/viikko4.md
+++ b/Dokumentaatio/viikko4.md
@@ -1,4 +1,4 @@
-# Viikkoraportti 2
+# Viikkoraportti 4
 
 Author Toivo Kärkinen
 
Stage this hunk [y,n,q,a,d,e,?]? y
fatal: Unable to create '/home/tkarkine/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/.git/index.lock': File exists.

Another git process seems to be running in this repository, e.g.
an editor opened by 'git commit'. Please make sure all processes
are terminated then try again. If it still fails, a git process
may have crashed in this repository earlier:
remove the file manually to continue.
diff --git a/Dokumentaatio/viikko4.md b/Dokumentaatio/viikko4.md
index 2664126..93d3208 100644
--- a/Dokumentaatio/viikko4.md
+++ b/Dokumentaatio/viikko4.md
@@ -1,4 +1,4 @@
-# Viikkoraportti 2
+# Viikkoraportti 4
 
 Author Toivo Kärkinen
 

diff --git a/Puzzle-Solver/.gradle/buildOutputCleanup/cache.properties b/Puzzle-Solver/.gradle/buildOutputCleanup/cache.properties
index ae5085e..0569734 100644
--- a/Puzzle-Solver/.gradle/buildOutputCleanup/cache.properties
+++ b/Puzzle-Solver/.gradle/buildOutputCleanup/cache.properties
@@ -1,2 +1,2 @@
-#Fri Jan 25 18:07:31 EET 2019
-gradle.version=4.5.1
+#Fri Feb 15 20:36:53 EET 2019
+gradle.version=4.10.2
Stage this hunk [y,n,q,a,d,e,?]? y
fatal: Unable to create '/home/tkarkine/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/.git/index.lock': File exists.

Another git process seems to be running in this repository, e.g.
an editor opened by 'git commit'. Please make sure all processes
are terminated then try again. If it still fails, a git process
may have crashed in this repository earlier:
remove the file manually to continue.
diff --git a/Puzzle-Solver/.gradle/buildOutputCleanup/cache.properties b/Puzzle-Solver/.gradle/buildOutputCleanup/cache.properties
index ae5085e..0569734 100644
--- a/Puzzle-Solver/.gradle/buildOutputCleanup/cache.properties
+++ b/Puzzle-Solver/.gradle/buildOutputCleanup/cache.properties
@@ -1,2 +1,2 @@
-#Fri Jan 25 18:07:31 EET 2019
-gradle.version=4.5.1
+#Fri Feb 15 20:36:53 EET 2019
+gradle.version=4.10.2

diff --git a/Puzzle-Solver/src/main/java/Algorithms/BreadthFirst.java b/Puzzle-Solver/src/main/java/Algorithms/BreadthFirst.java
index 88b8671..93488f8 100644
--- a/Puzzle-Solver/src/main/java/Algorithms/BreadthFirst.java
+++ b/Puzzle-Solver/src/main/java/Algorithms/BreadthFirst.java
@@ -29,7 +29,7 @@ public class BreadthFirst {
             current = queue.remove();
             result.addMove();
             if (current.check()) {
-                break;
+               break;
             }
             if (current.canMoveRight()) {
                 queue.add(current.moveRight());
Stage this hunk [y,n,q,a,d,e,?]? y
fatal: Unable to create '/home/tkarkine/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/.git/index.lock': File exists.

Another git process seems to be running in this repository, e.g.
an editor opened by 'git commit'. Please make sure all processes
are terminated then try again. If it still fails, a git process
may have crashed in this repository earlier:
remove the file manually to continue.
diff --git a/Puzzle-Solver/src/main/java/Algorithms/BreadthFirst.java b/Puzzle-Solver/src/main/java/Algorithms/BreadthFirst.java
index 88b8671..93488f8 100644
--- a/Puzzle-Solver/src/main/java/Algorithms/BreadthFirst.java
+++ b/Puzzle-Solver/src/main/java/Algorithms/BreadthFirst.java
@@ -29,7 +29,7 @@ public class BreadthFirst {
             current = queue.remove();
             result.addMove();
             if (current.check()) {
-                break;
+               break;
             }
             if (current.canMoveRight()) {
                 queue.add(current.moveRight());

diff --git a/Puzzle-Solver/src/main/java/Model/Puzzle.java b/Puzzle-Solver/src/main/java/Model/Puzzle.java
index af58c0e..e7b3439 100644
--- a/Puzzle-Solver/src/main/java/Model/Puzzle.java
+++ b/Puzzle-Solver/src/main/java/Model/Puzzle.java
@@ -18,14 +18,16 @@ import java.util.Random;
  * lastMove     edellinen siirtosuunta 
  * 
  */
-public class Puzzle {
+public final class Puzzle implements Comparable<Puzzle> {
     private int[] table;
     private int freeRow;
     private int freeCol;
     private int cubic;    
     private int row;
     private int lastMove;
+    private int cost;
     
+   
     /**
      * 
      * @param side pelialue luodaan antamalla sen sivun pituus ruutuina
Stage this hunk [y,n,q,a,d,j,J,g,/,s,e,?]? y
@@ -39,8 +41,7 @@ public class Puzzle {
         table = new int[cubic];
         freeRow = row -1;
         freeCol = row -1;
-        lastMove = 0;       
-        
+        lastMove = 0;
     }
     
     /**
Stage this hunk [y,n,q,a,d,K,j,J,g,/,e,?]? y
@@ -71,7 +72,7 @@ public class Puzzle {
             }
         }
         lastMove = 0;     
-        
+        cost=Math.max(manhattan(), countMissPlaced());
     }
     
     public Puzzle copyPuzzle() {
Stage this hunk [y,n,q,a,d,K,j,J,g,/,e,?]? y
@@ -104,49 +105,59 @@ public class Puzzle {
     }
     
     public boolean canMoveRight() {
-        System.out.println("paikka " + freeCol + " " + " maxCol " + (row-1));
-        return freeCol < (row -1);
+        System.out.println("Testing right");
+        return freeCol < (row -1) && lastMove!=9;
     }
     
     public boolean canMoveDown() {
-        return freeRow < (row-1);
+        System.out.println("Testing down");
+        return freeRow < (row-1) && lastMove!=12;
     }
     
     public boolean canMoveLeft() {
-       System.out.println("paikka " + freeCol + " " + " minCol " + 0);
+      System.out.println("Testing left");
          
-       return freeCol > 0;
+       return freeCol > 0 && lastMove!=3;
     }
     
     public boolean canMoveUp() {
-        return freeRow > 0;
+        System.out.println("Testing up");
+        return freeRow > 0 && lastMove!=6;
     }
     
     public Puzzle moveLeft() {
+        System.out.println("Moving left");
         Puzzle left = copyPuzzle();
         left.table[freeRow*row+freeCol] = this.table[freeRow*row+freeCol-1];
-        left.freeCol--;        
+        left.freeCol--;      
+        left.lastMove=9;
         return left;
     }
     
      public Puzzle moveRight() {
+        System.out.println("Moving right");
         Puzzle right = copyPuzzle();
         right.table[freeRow*row+freeCol] = this.table[freeRow*row+freeCol+1];
-        right.freeCol++;        
+        right.freeCol++;
+        right.lastMove=3;
         return right;
     }
      
      public Puzzle moveUp() {
+        System.out.println("Moving up");
         Puzzle up = copyPuzzle();
         up.table[freeRow*row+freeCol] = this.table[(freeRow-1)*row+freeCol];
-        up.freeRow--;        
+        up.freeRow--;    
+        up.lastMove=12;
         return up;
     }
      
      public Puzzle moveDown() {
+        System.out.println("Moving down");
         Puzzle down = copyPuzzle();
         down.table[freeRow*row+freeCol] = this.table[(freeRow+1)*row+freeCol];
-        down.freeRow++;        
+        down.freeRow++;    
+        down.lastMove=6;
         return down;
     }
      
Stage this hunk [y,n,q,a,d,K,j,J,g,/,s,e,?]? y
@@ -167,6 +178,19 @@ public class Puzzle {
         return manh;
     }
     
+    public int countMissPlaced(){
+        int cmp=0;
+        for (int i=0;i<(cubic-1);i++){
+            if (table[i]!=i+1){
+                cmp++;
+            }
+        }
+        if (table[cubic-1]!=0) {
+            cmp++;
+        }
+        return cmp;
+    }
+    
     
     /**
      * Apumetodi, jolla saadaan selville millä rivillä jokin numero on
Stage this hunk [y,n,q,a,d,K,j,J,g,/,e,?]? y
@@ -288,6 +312,26 @@ public class Puzzle {
         }
         return tablePrint; 
     }
+
+    @Override
+    public int compareTo(Puzzle o) {
+        if (o==null){
+            System.out.println("ei mitä verrata");
+        }
+        System.out.println("tämän kustannus:" + cost);
+        System.out.println("Toisen kust: " + o.cost);
+        if (this.cost<o.cost){
+            return 1;
+        }
+        if(this.cost>o.cost){
+            return -1;
+        }
+        return 0;
+    }
+
+    public void setCost() {
+        cost= Math.max(manhattan(), countMissPlaced());
+    }
 }
     
     
Stage this hunk [y,n,q,a,d,K,g,/,e,?]? y
<stdin>:19: trailing whitespace.
   
<stdin>:77: trailing whitespace.
        left.freeCol--;      
<stdin>:97: trailing whitespace.
        up.freeRow--;    
<stdin>:107: trailing whitespace.
        down.freeRow++;    
<stdin>:128: trailing whitespace.
    
fatal: Unable to create '/home/tkarkine/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/.git/index.lock': File exists.

Another git process seems to be running in this repository, e.g.
an editor opened by 'git commit'. Please make sure all processes
are terminated then try again. If it still fails, a git process
may have crashed in this repository earlier:
remove the file manually to continue.
diff --git a/Puzzle-Solver/src/main/java/Model/Puzzle.java b/Puzzle-Solver/src/main/java/Model/Puzzle.java
index af58c0e..e7b3439 100644
--- a/Puzzle-Solver/src/main/java/Model/Puzzle.java
+++ b/Puzzle-Solver/src/main/java/Model/Puzzle.java
@@ -18,14 +18,16 @@ import java.util.Random;
  * lastMove     edellinen siirtosuunta 
  * 
  */
-public class Puzzle {
+public final class Puzzle implements Comparable<Puzzle> {
     private int[] table;
     private int freeRow;
     private int freeCol;
     private int cubic;    
     private int row;
     private int lastMove;
+    private int cost;
     
+   
     /**
      * 
      * @param side pelialue luodaan antamalla sen sivun pituus ruutuina
@@ -39,8 +41,7 @@ public class Puzzle {
         table = new int[cubic];
         freeRow = row -1;
         freeCol = row -1;
-        lastMove = 0;       
-        
+        lastMove = 0;
     }
     
     /**
@@ -71,7 +72,7 @@ public class Puzzle {
             }
         }
         lastMove = 0;     
-        
+        cost=Math.max(manhattan(), countMissPlaced());
     }
     
     public Puzzle copyPuzzle() {
@@ -104,49 +105,59 @@ public class Puzzle {
     }
     
     public boolean canMoveRight() {
-        System.out.println("paikka " + freeCol + " " + " maxCol " + (row-1));
-        return freeCol < (row -1);
+        System.out.println("Testing right");
+        return freeCol < (row -1) && lastMove!=9;
     }
     
     public boolean canMoveDown() {
-        return freeRow < (row-1);
+        System.out.println("Testing down");
+        return freeRow < (row-1) && lastMove!=12;
     }
     
     public boolean canMoveLeft() {
-       System.out.println("paikka " + freeCol + " " + " minCol " + 0);
+      System.out.println("Testing left");
          
-       return freeCol > 0;
+       return freeCol > 0 && lastMove!=3;
     }
     
     public boolean canMoveUp() {
-        return freeRow > 0;
+        System.out.println("Testing up");
+        return freeRow > 0 && lastMove!=6;
     }
     
     public Puzzle moveLeft() {
+        System.out.println("Moving left");
         Puzzle left = copyPuzzle();
         left.table[freeRow*row+freeCol] = this.table[freeRow*row+freeCol-1];
-        left.freeCol--;        
+        left.freeCol--;      
+        left.lastMove=9;
         return left;
     }
     
      public Puzzle moveRight() {
+        System.out.println("Moving right");
         Puzzle right = copyPuzzle();
         right.table[freeRow*row+freeCol] = this.table[freeRow*row+freeCol+1];
-        right.freeCol++;        
+        right.freeCol++;
+        right.lastMove=3;
         return right;
     }
      
      public Puzzle moveUp() {
+        System.out.println("Moving up");
         Puzzle up = copyPuzzle();
         up.table[freeRow*row+freeCol] = this.table[(freeRow-1)*row+freeCol];
-        up.freeRow--;        
+        up.freeRow--;    
+        up.lastMove=12;
         return up;
     }
      
      public Puzzle moveDown() {
+        System.out.println("Moving down");
         Puzzle down = copyPuzzle();
         down.table[freeRow*row+freeCol] = this.table[(freeRow+1)*row+freeCol];
-        down.freeRow++;        
+        down.freeRow++;    
+        down.lastMove=6;
         return down;
     }
      
@@ -167,6 +178,19 @@ public class Puzzle {
         return manh;
     }
     
+    public int countMissPlaced(){
+        int cmp=0;
+        for (int i=0;i<(cubic-1);i++){
+            if (table[i]!=i+1){
+                cmp++;
+            }
+        }
+        if (table[cubic-1]!=0) {
+            cmp++;
+        }
+        return cmp;
+    }
+    
     
     /**
      * Apumetodi, jolla saadaan selville millä rivillä jokin numero on
@@ -288,6 +312,26 @@ public class Puzzle {
         }
         return tablePrint; 
     }
+
+    @Override
+    public int compareTo(Puzzle o) {
+        if (o==null){
+            System.out.println("ei mitä verrata");
+        }
+        System.out.println("tämän kustannus:" + cost);
+        System.out.println("Toisen kust: " + o.cost);
+        if (this.cost<o.cost){
+            return 1;
+        }
+        if(this.cost>o.cost){
+            return -1;
+        }
+        return 0;
+    }
+
+    public void setCost() {
+        cost= Math.max(manhattan(), countMissPlaced());
+    }
 }
     
     

diff --git a/Puzzle-Solver/src/main/java/ui/Main.java b/Puzzle-Solver/src/main/java/ui/Main.java
index b3d7cd3..2b937ac 100644
--- a/Puzzle-Solver/src/main/java/ui/Main.java
+++ b/Puzzle-Solver/src/main/java/ui/Main.java
@@ -1,6 +1,7 @@
 package ui;
 
 
+import Algorithms.Astar;
 import Algorithms.BreadthFirst;
 import Model.Puzzle;
 
Stage this hunk [y,n,q,a,d,j,J,g,/,e,?]? y
@@ -22,6 +23,7 @@ public class Main {
     public static void main(String[] args) {
         Puzzle first;
         BreadthFirst bread;
+        Astar astar;
         first = new Puzzle(4);
         
         
Stage this hunk [y,n,q,a,d,K,j,J,g,/,e,?]? y
@@ -31,8 +33,9 @@ public class Main {
            System.out.println("järjestyksessä");
            System.out.println("manhattan: " + first.manhattan());
        }
-       System.out.println(first.getRowOfNumber(14));
-       System.out.println(first.getColumnOfNumber(14));
+       System.out.println(first.getRowOfNumber(7));
+       System.out.println(first.getColumnOfNumber(7));
+        System.out.println("missplaced: " + first.countMissPlaced());
        first.suffle(10);
        if (first.check()) {
            System.out.println("järjestyksessä");
Stage this hunk [y,n,q,a,d,K,j,J,g,/,e,?]? y
@@ -41,13 +44,19 @@ public class Main {
            System.out.println("sekoitettu");
            System.out.println("manhanttan: "+ first.manhattan());
        }
-       System.out.println(first.getRowOfNumber(14));
-       System.out.println(first.getColumnOfNumber(14));
+       System.out.println(first.getRowOfNumber(7));
+       System.out.println(first.getColumnOfNumber(7));
+       System.out.println("missplaced: " + first.countMissPlaced());
        
        System.out.println(first);
-       bread = new BreadthFirst(first);
-       System.out.println("siirtoja tarvitaan " +bread.showResult());
-       // jää vielä jumiin, ainakin jos suffle(120)
+       astar = new Astar(first);
+       System.out.println("siirtoja tarvitaan " +astar.showResult());
+       
+       
+       //bread = new BreadthFirst(first);
+       //System.out.println("siirtoja tarvitaan " +bread.showResult());
+       // 4 x 4 loppuu muisti, pisin ajettu suoritusaika 19:56
+       // 3 x 3 meni kerran läpi 374176 siirtoa, 49 sek .. 
        
        
        
Stage this hunk [y,n,q,a,d,K,g,/,s,e,?]? y
<stdin>:49: trailing whitespace.
       
<stdin>:50: trailing whitespace.
       
<stdin>:54: trailing whitespace.
       // 3 x 3 meni kerran läpi 374176 siirtoa, 49 sek .. 
fatal: Unable to create '/home/tkarkine/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/.git/index.lock': File exists.

Another git process seems to be running in this repository, e.g.
an editor opened by 'git commit'. Please make sure all processes
are terminated then try again. If it still fails, a git process
may have crashed in this repository earlier:
remove the file manually to continue.
diff --git a/Puzzle-Solver/src/main/java/ui/Main.java b/Puzzle-Solver/src/main/java/ui/Main.java
index b3d7cd3..2b937ac 100644
--- a/Puzzle-Solver/src/main/java/ui/Main.java
+++ b/Puzzle-Solver/src/main/java/ui/Main.java
@@ -1,6 +1,7 @@
 package ui;
 
 
+import Algorithms.Astar;
 import Algorithms.BreadthFirst;
 import Model.Puzzle;
 
@@ -22,6 +23,7 @@ public class Main {
     public static void main(String[] args) {
         Puzzle first;
         BreadthFirst bread;
+        Astar astar;
         first = new Puzzle(4);
         
         
@@ -31,8 +33,9 @@ public class Main {
            System.out.println("järjestyksessä");
            System.out.println("manhattan: " + first.manhattan());
        }
-       System.out.println(first.getRowOfNumber(14));
-       System.out.println(first.getColumnOfNumber(14));
+       System.out.println(first.getRowOfNumber(7));
+       System.out.println(first.getColumnOfNumber(7));
+        System.out.println("missplaced: " + first.countMissPlaced());
        first.suffle(10);
        if (first.check()) {
            System.out.println("järjestyksessä");
@@ -41,13 +44,19 @@ public class Main {
            System.out.println("sekoitettu");
            System.out.println("manhanttan: "+ first.manhattan());
        }
-       System.out.println(first.getRowOfNumber(14));
-       System.out.println(first.getColumnOfNumber(14));
+       System.out.println(first.getRowOfNumber(7));
+       System.out.println(first.getColumnOfNumber(7));
+       System.out.println("missplaced: " + first.countMissPlaced());
        
        System.out.println(first);
-       bread = new BreadthFirst(first);
-       System.out.println("siirtoja tarvitaan " +bread.showResult());
-       // jää vielä jumiin, ainakin jos suffle(120)
+       astar = new Astar(first);
+       System.out.println("siirtoja tarvitaan " +astar.showResult());
+       
+       
+       //bread = new BreadthFirst(first);
+       //System.out.println("siirtoja tarvitaan " +bread.showResult());
+       // 4 x 4 loppuu muisti, pisin ajettu suoritusaika 19:56
+       // 3 x 3 meni kerran läpi 374176 siirtoa, 49 sek .. 
        
        
        

diff --git a/Puzzle-Solver/src/main/java/ui/Queue.java b/Puzzle-Solver/src/main/java/ui/Queue.java
index 7bae9ed..9acb728 100644
--- a/Puzzle-Solver/src/main/java/ui/Queue.java
+++ b/Puzzle-Solver/src/main/java/ui/Queue.java
@@ -34,6 +34,8 @@ public class Queue {
     }
     
     private void resize() {
+        System.out.println("Resizing queue");
+        
         Puzzle[] copy = new Puzzle[size*2];
         for (int i=0; i<size; i++) {
             copy[i] = que[i];            
Stage this hunk [y,n,q,a,d,j,J,g,/,e,?]? y
@@ -43,7 +45,7 @@ public class Queue {
     }
     
     public void add(Puzzle added) {  
-        System.out.println("jonoon");
+        System.out.println("adding jonoon " + head);
         que[head++] = added;
         if (head == size) {
             this.resize();
Stage this hunk [y,n,q,a,d,K,j,J,g,/,e,?]? y
@@ -55,6 +57,7 @@ public class Queue {
     }
     
     public Puzzle remove() {
+        System.out.println("Removing queue " + tail);
         if (isEmpty()) {
             return null;
         }
Stage this hunk [y,n,q,a,d,K,g,/,e,?]? y
<stdin>:10: trailing whitespace.
        
fatal: Unable to create '/home/tkarkine/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/.git/index.lock': File exists.

Another git process seems to be running in this repository, e.g.
an editor opened by 'git commit'. Please make sure all processes
are terminated then try again. If it still fails, a git process
may have crashed in this repository earlier:
remove the file manually to continue.
diff --git a/Puzzle-Solver/src/main/java/ui/Queue.java b/Puzzle-Solver/src/main/java/ui/Queue.java
index 7bae9ed..9acb728 100644
--- a/Puzzle-Solver/src/main/java/ui/Queue.java
+++ b/Puzzle-Solver/src/main/java/ui/Queue.java
@@ -34,6 +34,8 @@ public class Queue {
     }
     
     private void resize() {
+        System.out.println("Resizing queue");
+        
         Puzzle[] copy = new Puzzle[size*2];
         for (int i=0; i<size; i++) {
             copy[i] = que[i];            
@@ -43,7 +45,7 @@ public class Queue {
     }
     
     public void add(Puzzle added) {  
-        System.out.println("jonoon");
+        System.out.println("adding jonoon " + head);
         que[head++] = added;
         if (head == size) {
             this.resize();
@@ -55,6 +57,7 @@ public class Queue {
     }
     
     public Puzzle remove() {
+        System.out.println("Removing queue " + tail);
         if (isEmpty()) {
             return null;
         }

diff --git a/README.md b/README.md
index 95ff091..a560e13 100644
--- a/README.md
+++ b/README.md
@@ -24,6 +24,8 @@ Author Toivo Kärkinen
 
 [Viikkoraportti 4](Dokumentaatio/viikko4.md)
 
+[Viikkoraportti 5](Dokumentaatio/viikko5.md)
+
 ## Testiraportti
 
 [Jacoco test](Dokumentaatio/reports/tests/test/index.html)
Stage this hunk [y,n,q,a,d,e,?]? y
fatal: Unable to create '/home/tkarkine/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/.git/index.lock': File exists.

Another git process seems to be running in this repository, e.g.
an editor opened by 'git commit'. Please make sure all processes
are terminated then try again. If it still fails, a git process
may have crashed in this repository earlier:
remove the file manually to continue.
diff --git a/README.md b/README.md
index 95ff091..a560e13 100644
--- a/README.md
+++ b/README.md
@@ -24,6 +24,8 @@ Author Toivo Kärkinen
 
 [Viikkoraportti 4](Dokumentaatio/viikko4.md)
 
+[Viikkoraportti 5](Dokumentaatio/viikko5.md)
+
 ## Testiraportti
 
 [Jacoco test](Dokumentaatio/reports/tests/test/index.html)

tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git add .
fatal: Unable to create '/home/tkarkine/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/.git/index.lock': File exists.

Another git process seems to be running in this repository, e.g.
an editor opened by 'git commit'. Please make sure all processes
are terminated then try again. If it still fails, a git process
may have crashed in this repository earlier:
remove the file manually to continue.
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git status
On branch master
Your branch is up-to-date with 'origin/master'.

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

	modified:   Dokumentaatio/toteutus.md
	modified:   Dokumentaatio/viikko3.md
	modified:   Dokumentaatio/viikko4.md
	modified:   Puzzle-Solver/.gradle/4.10.2/fileHashes/fileHashes.bin
	modified:   Puzzle-Solver/.gradle/4.10.2/fileHashes/fileHashes.lock
	modified:   Puzzle-Solver/.gradle/4.10.2/javaCompile/classAnalysis.bin
	modified:   Puzzle-Solver/.gradle/4.10.2/javaCompile/javaCompile.lock
	modified:   Puzzle-Solver/.gradle/4.10.2/taskHistory/taskHistory.bin
	modified:   Puzzle-Solver/.gradle/4.10.2/taskHistory/taskHistory.lock
	modified:   Puzzle-Solver/.gradle/4.5.1/fileContent/fileContent.lock
	modified:   Puzzle-Solver/.gradle/4.5.1/fileHashes/fileHashes.bin
	modified:   Puzzle-Solver/.gradle/4.5.1/fileHashes/fileHashes.lock
	modified:   Puzzle-Solver/.gradle/4.5.1/taskHistory/taskHistory.bin
	modified:   Puzzle-Solver/.gradle/4.5.1/taskHistory/taskHistory.lock
	modified:   Puzzle-Solver/.gradle/buildOutputCleanup/buildOutputCleanup.lock
	modified:   Puzzle-Solver/.gradle/buildOutputCleanup/cache.properties
	modified:   Puzzle-Solver/.gradle/buildOutputCleanup/outputFiles.bin
	modified:   Puzzle-Solver/src/main/java/Algorithms/BreadthFirst.java
	modified:   Puzzle-Solver/src/main/java/Model/Puzzle.java
	modified:   Puzzle-Solver/src/main/java/ui/Main.java
	modified:   Puzzle-Solver/src/main/java/ui/Queue.java
	modified:   README.md

Untracked files:
  (use "git add <file>..." to include in what will be committed)

	.gradle/
	Dokumentaatio/viikko5.md
	Dokumentaatio/viikko5.md.save
	Puzzle-Solver/java_pid16759.hprof
	Puzzle-Solver/src/main/java/Algorithms/Astar.java
	Puzzle-Solver/src/main/java/ui/Heap.java

no changes added to commit (use "git add" and/or "git commit -a")
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git add
fatal: Unable to create '/home/tkarkine/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/.git/index.lock': File exists.

Another git process seems to be running in this repository, e.g.
an editor opened by 'git commit'. Please make sure all processes
are terminated then try again. If it still fails, a git process
may have crashed in this repository earlier:
remove the file manually to continue.
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ sudo rm .git/index.lock
[sudo] password for tkarkine: 
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git status
On branch master
Your branch is up-to-date with 'origin/master'.

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

	modified:   Dokumentaatio/toteutus.md
	modified:   Dokumentaatio/viikko3.md
	modified:   Dokumentaatio/viikko4.md
	modified:   Puzzle-Solver/.gradle/4.10.2/fileHashes/fileHashes.bin
	modified:   Puzzle-Solver/.gradle/4.10.2/fileHashes/fileHashes.lock
	modified:   Puzzle-Solver/.gradle/4.10.2/javaCompile/classAnalysis.bin
	modified:   Puzzle-Solver/.gradle/4.10.2/javaCompile/javaCompile.lock
	modified:   Puzzle-Solver/.gradle/4.10.2/taskHistory/taskHistory.bin
	modified:   Puzzle-Solver/.gradle/4.10.2/taskHistory/taskHistory.lock
	modified:   Puzzle-Solver/.gradle/4.5.1/fileContent/fileContent.lock
	modified:   Puzzle-Solver/.gradle/4.5.1/fileHashes/fileHashes.bin
	modified:   Puzzle-Solver/.gradle/4.5.1/fileHashes/fileHashes.lock
	modified:   Puzzle-Solver/.gradle/4.5.1/taskHistory/taskHistory.bin
	modified:   Puzzle-Solver/.gradle/4.5.1/taskHistory/taskHistory.lock
	modified:   Puzzle-Solver/.gradle/buildOutputCleanup/buildOutputCleanup.lock
	modified:   Puzzle-Solver/.gradle/buildOutputCleanup/cache.properties
	modified:   Puzzle-Solver/.gradle/buildOutputCleanup/outputFiles.bin
	modified:   Puzzle-Solver/src/main/java/Algorithms/BreadthFirst.java
	modified:   Puzzle-Solver/src/main/java/Model/Puzzle.java
	modified:   Puzzle-Solver/src/main/java/ui/Main.java
	modified:   Puzzle-Solver/src/main/java/ui/Queue.java
	modified:   README.md

Untracked files:
  (use "git add <file>..." to include in what will be committed)

	.gradle/
	Dokumentaatio/viikko5.md
	Dokumentaatio/viikko5.md.save
	Puzzle-Solver/java_pid16759.hprof
	Puzzle-Solver/src/main/java/Algorithms/Astar.java
	Puzzle-Solver/src/main/java/ui/Heap.java

no changes added to commit (use "git add" and/or "git commit -a")
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git add .
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git status
On branch master
Your branch is up-to-date with 'origin/master'.

Changes to be committed:
  (use "git reset HEAD <file>..." to unstage)

	new file:   .gradle/4.10.2/fileChanges/last-build.bin
	new file:   .gradle/4.10.2/fileHashes/fileHashes.lock
	new file:   .gradle/4.10.2/gc.properties
	modified:   Dokumentaatio/toteutus.md
	modified:   Dokumentaatio/viikko3.md
	modified:   Dokumentaatio/viikko4.md
	new file:   Dokumentaatio/viikko5.md
	new file:   Dokumentaatio/viikko5.md.save
	modified:   Puzzle-Solver/.gradle/4.10.2/fileHashes/fileHashes.bin
	modified:   Puzzle-Solver/.gradle/4.10.2/fileHashes/fileHashes.lock
	modified:   Puzzle-Solver/.gradle/4.10.2/javaCompile/classAnalysis.bin
	modified:   Puzzle-Solver/.gradle/4.10.2/javaCompile/javaCompile.lock
	modified:   Puzzle-Solver/.gradle/4.10.2/taskHistory/taskHistory.bin
	modified:   Puzzle-Solver/.gradle/4.10.2/taskHistory/taskHistory.lock
	modified:   Puzzle-Solver/.gradle/4.5.1/fileContent/fileContent.lock
	modified:   Puzzle-Solver/.gradle/4.5.1/fileHashes/fileHashes.bin
	modified:   Puzzle-Solver/.gradle/4.5.1/fileHashes/fileHashes.lock
	modified:   Puzzle-Solver/.gradle/4.5.1/taskHistory/taskHistory.bin
	modified:   Puzzle-Solver/.gradle/4.5.1/taskHistory/taskHistory.lock
	modified:   Puzzle-Solver/.gradle/buildOutputCleanup/buildOutputCleanup.lock
	modified:   Puzzle-Solver/.gradle/buildOutputCleanup/cache.properties
	modified:   Puzzle-Solver/.gradle/buildOutputCleanup/outputFiles.bin
	new file:   Puzzle-Solver/java_pid16759.hprof
	new file:   Puzzle-Solver/src/main/java/Algorithms/Astar.java
	modified:   Puzzle-Solver/src/main/java/Algorithms/BreadthFirst.java
	modified:   Puzzle-Solver/src/main/java/Model/Puzzle.java
	new file:   Puzzle-Solver/src/main/java/ui/Heap.java
	modified:   Puzzle-Solver/src/main/java/ui/Main.java
	modified:   Puzzle-Solver/src/main/java/ui/Queue.java
	modified:   README.md

tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git commit -m "viikko5"
[master aae3e90] viikko5
 30 files changed, 327 insertions(+), 30 deletions(-)
 create mode 100644 .gradle/4.10.2/fileChanges/last-build.bin
 create mode 100644 .gradle/4.10.2/fileHashes/fileHashes.lock
 create mode 100644 .gradle/4.10.2/gc.properties
 create mode 100644 Dokumentaatio/viikko5.md
 create mode 100644 Dokumentaatio/viikko5.md.save
 create mode 100644 Puzzle-Solver/java_pid16759.hprof
 create mode 100644 Puzzle-Solver/src/main/java/Algorithms/Astar.java
 create mode 100644 Puzzle-Solver/src/main/java/ui/Heap.java
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git push
Counting objects: 50, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (38/38), done.
^Ziting objects:  72% (36/50), 141.87 MiB | 1.13 MiB/s   
[2]+  Stopped                 git push
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ ls -a
.  ..  Dokumentaatio  .git  .gitignore  .gradle  LICENSE  Puzzle-Solver  README.md
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ nano .gitignore
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git rm -r Puzzle-Solver/.gradle/*
rm 'Puzzle-Solver/.gradle/4.10.2/fileChanges/last-build.bin'
rm 'Puzzle-Solver/.gradle/4.10.2/fileContent/fileContent.lock'
rm 'Puzzle-Solver/.gradle/4.10.2/fileHashes/fileHashes.bin'
rm 'Puzzle-Solver/.gradle/4.10.2/fileHashes/fileHashes.lock'
rm 'Puzzle-Solver/.gradle/4.10.2/fileHashes/resourceHashesCache.bin'
rm 'Puzzle-Solver/.gradle/4.10.2/gc.properties'
rm 'Puzzle-Solver/.gradle/4.10.2/javaCompile/classAnalysis.bin'
rm 'Puzzle-Solver/.gradle/4.10.2/javaCompile/jarAnalysis.bin'
rm 'Puzzle-Solver/.gradle/4.10.2/javaCompile/javaCompile.lock'
rm 'Puzzle-Solver/.gradle/4.10.2/javaCompile/taskHistory.bin'
rm 'Puzzle-Solver/.gradle/4.10.2/taskHistory/taskHistory.bin'
rm 'Puzzle-Solver/.gradle/4.10.2/taskHistory/taskHistory.lock'
rm 'Puzzle-Solver/.gradle/4.5.1/fileChanges/last-build.bin'
rm 'Puzzle-Solver/.gradle/4.5.1/fileContent/annotation-processors.bin'
rm 'Puzzle-Solver/.gradle/4.5.1/fileContent/fileContent.lock'
rm 'Puzzle-Solver/.gradle/4.5.1/fileHashes/fileHashes.bin'
rm 'Puzzle-Solver/.gradle/4.5.1/fileHashes/fileHashes.lock'
rm 'Puzzle-Solver/.gradle/4.5.1/fileHashes/resourceHashesCache.bin'
rm 'Puzzle-Solver/.gradle/4.5.1/taskHistory/taskHistory.bin'
rm 'Puzzle-Solver/.gradle/4.5.1/taskHistory/taskHistory.lock'
rm 'Puzzle-Solver/.gradle/buildOutputCleanup/buildOutputCleanup.lock'
rm 'Puzzle-Solver/.gradle/buildOutputCleanup/cache.properties'
rm 'Puzzle-Solver/.gradle/buildOutputCleanup/outputFiles.bin'
rm 'Puzzle-Solver/.gradle/vcs-1/gc.properties'
rm 'Puzzle-Solver/.gradle/vcsWorkingDirs/gc.properties'
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git status
On branch master
Your branch is ahead of 'origin/master' by 1 commit.
  (use "git push" to publish your local commits)

Changes to be committed:
  (use "git reset HEAD <file>..." to unstage)

	deleted:    Puzzle-Solver/.gradle/4.10.2/fileChanges/last-build.bin
	deleted:    Puzzle-Solver/.gradle/4.10.2/fileContent/fileContent.lock
	deleted:    Puzzle-Solver/.gradle/4.10.2/fileHashes/fileHashes.bin
	deleted:    Puzzle-Solver/.gradle/4.10.2/fileHashes/fileHashes.lock
	deleted:    Puzzle-Solver/.gradle/4.10.2/fileHashes/resourceHashesCache.bin
	deleted:    Puzzle-Solver/.gradle/4.10.2/gc.properties
	deleted:    Puzzle-Solver/.gradle/4.10.2/javaCompile/classAnalysis.bin
	deleted:    Puzzle-Solver/.gradle/4.10.2/javaCompile/jarAnalysis.bin
	deleted:    Puzzle-Solver/.gradle/4.10.2/javaCompile/javaCompile.lock
	deleted:    Puzzle-Solver/.gradle/4.10.2/javaCompile/taskHistory.bin
	deleted:    Puzzle-Solver/.gradle/4.10.2/taskHistory/taskHistory.bin
	deleted:    Puzzle-Solver/.gradle/4.10.2/taskHistory/taskHistory.lock
	deleted:    Puzzle-Solver/.gradle/4.5.1/fileChanges/last-build.bin
	deleted:    Puzzle-Solver/.gradle/4.5.1/fileContent/annotation-processors.bin
	deleted:    Puzzle-Solver/.gradle/4.5.1/fileContent/fileContent.lock
	deleted:    Puzzle-Solver/.gradle/4.5.1/fileHashes/fileHashes.bin
	deleted:    Puzzle-Solver/.gradle/4.5.1/fileHashes/fileHashes.lock
	deleted:    Puzzle-Solver/.gradle/4.5.1/fileHashes/resourceHashesCache.bin
	deleted:    Puzzle-Solver/.gradle/4.5.1/taskHistory/taskHistory.bin
	deleted:    Puzzle-Solver/.gradle/4.5.1/taskHistory/taskHistory.lock
	deleted:    Puzzle-Solver/.gradle/buildOutputCleanup/buildOutputCleanup.lock
	deleted:    Puzzle-Solver/.gradle/buildOutputCleanup/cache.properties
	deleted:    Puzzle-Solver/.gradle/buildOutputCleanup/outputFiles.bin
	deleted:    Puzzle-Solver/.gradle/vcs-1/gc.properties
	deleted:    Puzzle-Solver/.gradle/vcsWorkingDirs/gc.properties

tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git commit -m "viikko5 putsattu"
[master 6926815] viikko5 putsattu
 25 files changed, 2 deletions(-)
 delete mode 100644 Puzzle-Solver/.gradle/4.10.2/fileChanges/last-build.bin
 delete mode 100644 Puzzle-Solver/.gradle/4.10.2/fileContent/fileContent.lock
 delete mode 100644 Puzzle-Solver/.gradle/4.10.2/fileHashes/fileHashes.bin
 delete mode 100644 Puzzle-Solver/.gradle/4.10.2/fileHashes/fileHashes.lock
 delete mode 100644 Puzzle-Solver/.gradle/4.10.2/fileHashes/resourceHashesCache.bin
 delete mode 100644 Puzzle-Solver/.gradle/4.10.2/gc.properties
 delete mode 100644 Puzzle-Solver/.gradle/4.10.2/javaCompile/classAnalysis.bin
 delete mode 100644 Puzzle-Solver/.gradle/4.10.2/javaCompile/jarAnalysis.bin
 delete mode 100644 Puzzle-Solver/.gradle/4.10.2/javaCompile/javaCompile.lock
 delete mode 100644 Puzzle-Solver/.gradle/4.10.2/javaCompile/taskHistory.bin
 delete mode 100644 Puzzle-Solver/.gradle/4.10.2/taskHistory/taskHistory.bin
 delete mode 100644 Puzzle-Solver/.gradle/4.10.2/taskHistory/taskHistory.lock
 delete mode 100644 Puzzle-Solver/.gradle/4.5.1/fileChanges/last-build.bin
 delete mode 100644 Puzzle-Solver/.gradle/4.5.1/fileContent/annotation-processors.bin
 delete mode 100644 Puzzle-Solver/.gradle/4.5.1/fileContent/fileContent.lock
 delete mode 100644 Puzzle-Solver/.gradle/4.5.1/fileHashes/fileHashes.bin
 delete mode 100644 Puzzle-Solver/.gradle/4.5.1/fileHashes/fileHashes.lock
 delete mode 100644 Puzzle-Solver/.gradle/4.5.1/fileHashes/resourceHashesCache.bin
 delete mode 100644 Puzzle-Solver/.gradle/4.5.1/taskHistory/taskHistory.bin
 delete mode 100644 Puzzle-Solver/.gradle/4.5.1/taskHistory/taskHistory.lock
 delete mode 100644 Puzzle-Solver/.gradle/buildOutputCleanup/buildOutputCleanup.lock
 delete mode 100644 Puzzle-Solver/.gradle/buildOutputCleanup/cache.properties
 delete mode 100644 Puzzle-Solver/.gradle/buildOutputCleanup/outputFiles.bin
 delete mode 100644 Puzzle-Solver/.gradle/vcs-1/gc.properties
 delete mode 100644 Puzzle-Solver/.gradle/vcsWorkingDirs/gc.properties
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git push
Counting objects: 53, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (41/41), done.
^Ziting objects:  26% (14/53), 84.30 MiB | 1.22 MiB/s   
[3]+  Stopped                 git push
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ gradle clean

FAILURE: Build failed with an exception.

* What went wrong:
Task 'clean' not found in root project 'Tira_Puzzlesolver'.

* Try:
Run gradle tasks to get a list of available tasks. Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 0s
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git status
On branch master
Your branch is ahead of 'origin/master' by 2 commits.
  (use "git push" to publish your local commits)

nothing to commit, working tree clean
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git push
Counting objects: 53, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (41/41), done.
^Ziting objects:  26% (14/53), 242.21 MiB | 1.14 MiB/s   
[4]+  Stopped                 git push
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git status
On branch master
Your branch is ahead of 'origin/master' by 2 commits.
  (use "git push" to publish your local commits)

Changes not staged for commit:
  (use "git add/rm <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

	deleted:    Puzzle-Solver/java_pid16759.hprof

no changes added to commit (use "git add" and/or "git commit -a")
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git commit -m "viikko5 putsit"
On branch master
Your branch is ahead of 'origin/master' by 2 commits.
  (use "git push" to publish your local commits)

Changes not staged for commit:
	deleted:    Puzzle-Solver/java_pid16759.hprof

no changes added to commit
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git status
On branch master
Your branch is ahead of 'origin/master' by 2 commits.
  (use "git push" to publish your local commits)

Changes not staged for commit:
  (use "git add/rm <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

	deleted:    Puzzle-Solver/java_pid16759.hprof

no changes added to commit (use "git add" and/or "git commit -a")
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git push
Counting objects: 53, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (41/41), done.
^Ziting objects:  26% (14/53), 18.70 MiB | 1.15 MiB/s   
[5]+  Stopped                 git push
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git rm -r Puzzle-Solver/java_pid*
rm 'Puzzle-Solver/java_pid16759.hprof'
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git push
Counting objects: 53, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (41/41), done.
^Ziting objects:  26% (14/53), 13.16 MiB | 1.50 MiB/s    
[6]+  Stopped                 git push
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git add .
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git add -p
No changes.
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git status
On branch master
Your branch is ahead of 'origin/master' by 2 commits.
  (use "git push" to publish your local commits)

Changes to be committed:
  (use "git reset HEAD <file>..." to unstage)

	deleted:    Puzzle-Solver/java_pid16759.hprof

tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git commit -m "viikko5 final"
[master e9dc5e2] viikko5 final
 1 file changed, 0 insertions(+), 0 deletions(-)
 delete mode 100644 Puzzle-Solver/java_pid16759.hprof
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git push
Counting objects: 56, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (44/44), done.
Writing objects: 100% (56/56), 251.16 MiB | 1.17 MiB/s, done.
Total 56 (delta 22), reused 1 (delta 0)
remote: Resolving deltas: 100% (22/22), completed with 15 local objects.
remote: error: GH001: Large files detected. You may want to try Git Large File Storage - https://git-lfs.github.com.
remote: error: Trace: add4a3cae706166b8ffc96145007728f
remote: error: See http://git.io/iEPt8g for more information.
remote: error: File Puzzle-Solver/java_pid16759.hprof is 1349.71 MB; this exceeds GitHub's file size limit of 100.00 MB
To github.com:Topi62/Tira_Puzzlesolver.git
 ! [remote rejected] master -> master (pre-receive hook declined)
error: failed to push some refs to 'git@github.com:Topi62/Tira_Puzzlesolver.git'
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git status
On branch master
Your branch is ahead of 'origin/master' by 3 commits.
  (use "git push" to publish your local commits)

nothing to commit, working tree clean
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git rm -f Puzzle-Solver/java*
fatal: pathspec 'Puzzle-Solver/java*' did not match any files
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git add .
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git add -p
No changes.
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git status
On branch master
Your branch is ahead of 'origin/master' by 3 commits.
  (use "git push" to publish your local commits)

nothing to commit, working tree clean
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git push
Counting objects: 56, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (44/44), done.
^Ziting objects:  53% (30/56), 197.57 MiB | 1.15 MiB/s    
[7]+  Stopped                 git push
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git
usage: git [--version] [--help] [-C <path>] [-c <name>=<value>]
           [--exec-path[=<path>]] [--html-path] [--man-path] [--info-path]
           [-p | --paginate | --no-pager] [--no-replace-objects] [--bare]
           [--git-dir=<path>] [--work-tree=<path>] [--namespace=<name>]
           <command> [<args>]

These are common Git commands used in various situations:

start a working area (see also: git help tutorial)
   clone      Clone a repository into a new directory
   init       Create an empty Git repository or reinitialise an existing one

work on the current change (see also: git help everyday)
   add        Add file contents to the index
   mv         Move or rename a file, a directory, or a symlink
   reset      Reset current HEAD to the specified state
   rm         Remove files from the working tree and from the index

examine the history and state (see also: git help revisions)
   bisect     Use binary search to find the commit that introduced a bug
   grep       Print lines matching a pattern
   log        Show commit logs
   show       Show various types of objects
   status     Show the working tree status

grow, mark and tweak your common history
   branch     List, create, or delete branches
   checkout   Switch branches or restore working tree files
   commit     Record changes to the repository
   diff       Show changes between commits, commit and working tree, etc
   merge      Join two or more development histories together
   rebase     Reapply commits on top of another base tip
   tag        Create, list, delete or verify a tag object signed with GPG

collaborate (see also: git help workflows)
   fetch      Download objects and refs from another repository
   pull       Fetch from and integrate with another repository or a local branch
   push       Update remote refs along with associated objects

'git help -a' and 'git help -g' list available subcommands and some
concept guides. See 'git help <command>' or 'git help <concept>'
to read about a specific subcommand or concept.
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ gitk
git log
^Z
[8]+  Stopped                 gitk
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git log
commit e9dc5e2b06a6bd115ae9db7cc5d3394e431a03cc (HEAD -> master)
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Feb 15 21:26:34 2019 +0200

    viikko5 final

commit 6926815fe1f8b342f0c794df21a6de9cdbd5b264
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Feb 15 21:17:41 2019 +0200

    viikko5 putsattu

commit aae3e90d12293be70fc1e5be1b86f7104c1c4dcd
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Feb 15 21:13:11 2019 +0200

    viikko5

commit 70b8447e27dcf272237d40e376af220b14d0e21d (origin/master, origin/HEAD)
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Feb 8 22:10:18 2019 +0200

    viikko4

commit d5b39df022c93aa6177890ee06181f4daff04bd8
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Feb 1 05:11:33 2019 +0200

    viikko 3 readme

commit e62846b2e30c9b39e9b2ec8cc91de6d28187837c
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Feb 1 05:09:19 2019 +0200

    viikko3

commit e37cf20868b33820f19948e1d71aa176e7fe70d7
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Jan 25 19:19:44 2019 +0200

    korjattua maarittelyä

commit b290bc8437340244364c0f6f26f076a06122dfde
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Jan 25 19:09:06 2019 +0200

    viikko2 dokut ja viikkoraportti

commit 2ac526b4bdb28dcbd11577762be51f96474a7fd5
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Jan 25 18:48:06 2019 +0200

    viikko2 ohjelma

commit df3064273ccd9eb5185327e3389415165fa29ff1
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Jan 18 16:42:40 2019 +0200

    virhe tiedostonimessä korjattu

commit c4bb8860084eb006f63ff3f472c9c8e81ef65a10
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Jan 18 16:40:08 2019 +0200

    typot korjattu

commit 01fdfd143017204b561a862c9f8aa9d635bddf26
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Jan 18 16:30:42 2019 +0200

    Viikko 1 palautus

commit e1faddaae3df09642ec991852707b8a9eadfdb2a
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Jan 18 15:46:56 2019 +0200

    Initial commit

[9]+  Stopped                 git log
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git checkout aae3e90d12293be70fc1e5be1b86f7104c1c4dcd
Note: checking out 'aae3e90d12293be70fc1e5be1b86f7104c1c4dcd'.

You are in 'detached HEAD' state. You can look around, make experimental
changes and commit them, and you can discard any commits you make in this
state without impacting any branches by performing another checkout.

If you want to create a new branch to retain commits you create, you may
do so (now or later) by using -b with the checkout command again. Example:

  git checkout -b <new-branch-name>

HEAD is now at aae3e90 viikko5
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git rm -m Puzzle-Solver/java_pid16759.hprof 
error: unknown switch `m'
usage: git rm [<options>] [--] <file>...

    -n, --dry-run         dry run
    -q, --quiet           do not list removed files
    --cached              only remove from the index
    -f, --force           override the up-to-date check
    -r                    allow recursive removal
    --ignore-unmatch      exit with a zero status even if nothing matched

tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git status
HEAD detached at aae3e90
nothing to commit, working tree clean
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ ^C
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git checkout e9dc5e2b06a6bd115ae9db7cc5d3394e431a03cc
Previous HEAD position was aae3e90 viikko5
HEAD is now at e9dc5e2 viikko5 final
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git status
HEAD detached at e9dc5e2
nothing to commit, working tree clean
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git push
Counting objects: 56, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (44/44), done.
^Ziting objects:  53% (30/56), 81.61 MiB | 1.15 MiB/s   
[10]+  Stopped                 git push
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git log
commit e9dc5e2b06a6bd115ae9db7cc5d3394e431a03cc (HEAD, master)
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Feb 15 21:26:34 2019 +0200

    viikko5 final

commit 6926815fe1f8b342f0c794df21a6de9cdbd5b264
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Feb 15 21:17:41 2019 +0200

    viikko5 putsattu

commit aae3e90d12293be70fc1e5be1b86f7104c1c4dcd
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Feb 15 21:13:11 2019 +0200

    viikko5

commit 70b8447e27dcf272237d40e376af220b14d0e21d (origin/master, origin/HEAD)
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Feb 8 22:10:18 2019 +0200

    viikko4

commit d5b39df022c93aa6177890ee06181f4daff04bd8
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Feb 1 05:11:33 2019 +0200

    viikko 3 readme

commit e62846b2e30c9b39e9b2ec8cc91de6d28187837c
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Feb 1 05:09:19 2019 +0200


[11]+  Stopped                 git log
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git checkout 70b8447e27
Previous HEAD position was e9dc5e2 viikko5 final
HEAD is now at 70b8447 viikko4
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git checkout -b repair
Switched to a new branch 'repair'
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git cherry-pick e9de5e2b
fatal: bad revision 'e9de5e2b'
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git cherry-pick e9dc5e2b06a6bd115ae9db7cc5d3394e431a03cc
On branch repair
You are currently cherry-picking commit e9dc5e2.

nothing to commit, working tree clean
The previous cherry-pick is now empty, possibly due to conflict resolution.
If you wish to commit it anyway, use:

    git commit --allow-empty

Otherwise, please use 'git reset'
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git status
On branch repair
You are currently cherry-picking commit e9dc5e2.
  (all conflicts fixed: run "git cherry-pick --continue")
  (use "git cherry-pick --abort" to cancel the cherry-pick operation)

nothing to commit, working tree clean
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git checkout master
Switched to branch 'master'
Your branch is ahead of 'origin/master' by 3 commits.
  (use "git push" to publish your local commits)
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ gitk
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git checkout repair
Switched to branch 'repair'
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git cherry-pick e9dc5e2b06a6bd115ae9db7cc5d3394e431a03cc
On branch repair
You are currently cherry-picking commit e9dc5e2.

nothing to commit, working tree clean
The previous cherry-pick is now empty, possibly due to conflict resolution.
If you wish to commit it anyway, use:

    git commit --allow-empty

Otherwise, please use 'git reset'
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ ls
Dokumentaatio  LICENSE  Puzzle-Solver  README.md
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ git Dokumentaatio/
git: 'Dokumentaatio/' is not a git command. See 'git --help'.
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ ls
Dokumentaatio  LICENSE  Puzzle-Solver  README.md
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ cd Dokumentaatio/
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ ls
javadoc  maaritys.md  reports  testausdokumentti.md  toteutus.md  viikko1.md  viikko2.md  viikko3.md  viikko4.md
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ git checkout master
Switched to branch 'master'
Your branch is ahead of 'origin/master' by 3 commits.
  (use "git push" to publish your local commits)
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ ls
javadoc      reports               toteutus.md  viikko2.md  viikko4.md  viikko5.md.save
maaritys.md  testausdokumentti.md  viikko1.md   viikko3.md  viikko5.md
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ rm viikko.md.save
rm: cannot remove 'viikko.md.save': No such file or directory
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ git status
On branch master
Your branch is ahead of 'origin/master' by 3 commits.
  (use "git push" to publish your local commits)

Changes not staged for commit:
  (use "git add/rm <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

	deleted:    viikko5.md.save

no changes added to commit (use "git add" and/or "git commit -a")
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ git add .
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ git commit -m "viikko5"
[master 7fb74d9] viikko5
 1 file changed, 25 deletions(-)
 delete mode 100644 Dokumentaatio/viikko5.md.save
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ git rebase HEAD-5 -i
fatal: Needed a single revision
invalid upstream 'HEAD-5'
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ git log
commit 7fb74d93cf19061f58b44a340e789de24c37431e (HEAD -> master)
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Feb 15 22:04:26 2019 +0200

    viikko5

commit e9dc5e2b06a6bd115ae9db7cc5d3394e431a03cc
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Feb 15 21:26:34 2019 +0200

    viikko5 final

commit 6926815fe1f8b342f0c794df21a6de9cdbd5b264
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Feb 15 21:17:41 2019 +0200

    viikko5 putsattu

commit aae3e90d12293be70fc1e5be1b86f7104c1c4dcd
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Feb 15 21:13:11 2019 +0200

    viikko5

commit 70b8447e27dcf272237d40e376af220b14d0e21d (origin/master, origin/HEAD, repair)
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Feb 8 22:10:18 2019 +0200

    viikko4

commit d5b39df022c93aa6177890ee06181f4daff04bd8
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Feb 1 05:11:33 2019 +0200


[12]+  Stopped                 git log
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ git rebase -i 7fb74d93cf19061f58b44a340e789de24c37431e
Successfully rebased and updated refs/heads/master.
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ git rebase -i 70b8447e27dcf272237d40e376af220b14d0e21d
Successfully rebased and updated refs/heads/master.
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ git rebase -i d5b39df022c93aa6177890ee06181f4daff04bd8
The previous cherry-pick is now empty, possibly due to conflict resolution.
If you wish to commit it anyway, use:

    git commit --allow-empty

Otherwise, please use 'git reset'
interactive rebase in progress; onto d5b39df
Last commands done (4 commands done):
   drop 6926815 viikko5 putsattu
   pick e9dc5e2 viikko5 final
Next command to do (1 remaining command):
   pick 7fb74d9 viikko5
You are currently rebasing branch 'master' on 'd5b39df'.

nothing to commit, working tree clean
Could not apply e9dc5e2... viikko5 final
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ git push
Counting objects: 59, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (47/47), done.
^Ziting objects:  55% (33/59), 98.82 MiB | 1.15 MiB/s    
[13]+  Stopped                 git push
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ ls
javadoc  maaritys.md  reports  testausdokumentti.md  toteutus.md  viikko1.md  viikko2.md  viikko3.md  viikko4.md
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ gitk
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ git log
commit 70b8447e27dcf272237d40e376af220b14d0e21d (HEAD, origin/master, origin/HEAD, repair)
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Feb 8 22:10:18 2019 +0200

    viikko4

commit d5b39df022c93aa6177890ee06181f4daff04bd8
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Feb 1 05:11:33 2019 +0200

    viikko 3 readme

commit e62846b2e30c9b39e9b2ec8cc91de6d28187837c
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Feb 1 05:09:19 2019 +0200

    viikko3

commit e37cf20868b33820f19948e1d71aa176e7fe70d7
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Jan 25 19:19:44 2019 +0200

    korjattua maarittelyä

commit b290bc8437340244364c0f6f26f076a06122dfde
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Jan 25 19:09:06 2019 +0200

    viikko2 dokut ja viikkoraportti

commit 2ac526b4bdb28dcbd11577762be51f96474a7fd5
Author: Toivo Kärkinen <toivo.karkinen@helsinki.fi>
Date:   Fri Jan 25 18:48:06 2019 +0200


[14]+  Stopped                 git log
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ ls
javadoc  maaritys.md  reports  testausdokumentti.md  toteutus.md  viikko1.md  viikko2.md  viikko3.md  viikko4.md  viikko5.md.save
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ cp viikko5.md.save viikko5.md
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ rm viikko5.md.save
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ nano viikko5.md
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ ls
javadoc  maaritys.md  reports  testausdokumentti.md  toteutus.md  viikko1.md  viikko2.md  viikko3.md  viikko4.md  viikko5.md
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver/Dokumentaatio$ cd ..
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ ls
Dokumentaatio  LICENSE  Puzzle-Solver  README.md
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ nano README.md 
tkarkine@dhcp-asv-91:~/Documents/yliopisto/Tiralabra/Tira_Puzzlesolver$ 

