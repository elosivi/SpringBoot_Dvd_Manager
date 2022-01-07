# STEP AND SPECS


## STEP 1

---


**SPEC 1** : Le gérant d’un magasin de vente de DVD désire réaliser une application permettant de gérer à distance son stock de DVD (Extranet). 

**DEV** : Création d'une première entité métier,  premier service métier et premier repository
cf commit
Pour l'instant : récupération des données via la console + mémorisation intern

**TEST** : 
* Specs demandés : ok 
* Toutes les réponses possibles à saisir (attendues ou non) par le client dans la console on été testées.
* Ajout possibilité de saisir un nouveau film

---
**SPEC2** :préparer l'architecture de notre application DVDStore à la possibilité d'interagir via la console et via le web au choix du client.
Dans le cadre du repo : com.mycompany.dvdstore.repository.GoLiveMovieRepository . L'implémentation de cette méthode va différer de l'original en ajoutant les informations du film à enregistrer dans un fichier movies.txt qui devra se situer dans C:\\temp

**DEV** : 
* ajout d'un package controller pour checker demande client et orienter l'app vers l'un des 2 repository : même méthode "add" mais l'une via console et l'autre via web.
* intégartion d'écriture sur un fichier .txt

**TEST** :
* Specs demandés: ok, pas de choix de saisie pour l'utilisateur + les titre et genre s'inscrivent bien dans le fichier moovies.txt au format demandé
* Ajout possibilité de saisir un nouveau film sans avoir à redémarrer le programme

**A PREVOIR**:
* Pas de vérification des saisies 
---




