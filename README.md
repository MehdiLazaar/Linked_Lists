# Projet Liste Chainee en Java

Ce projet implémente une liste chaînée simple en Java, utilisant les classes `Cellule` et `ListeChainee` pour gérer les éléments de la liste. Les opérations de base telles que l'ajout, la suppression, l'insertion à une position spécifique, et l'affichage sont couvertes par les méthodes définies dans ces classes.

## Description du projet

### 1. **Classe `Cellule`**
La classe `Cellule` représente un élément (ou un "nœud") d'une liste chaînée. Chaque cellule contient un objet (`contenu`) et un pointeur vers la cellule suivante (`suivant`).

#### Attributs :
- `contenu` : L'objet encapsulé dans la cellule.
- `suivant` : Un pointeur vers la cellule suivante dans la liste.

#### Constructeurs :
- `Cellule()` : Crée une cellule sans contenu ni suivant.
- `Cellule(Object o_contenu)` : Crée une cellule contenant un objet spécifié.

#### Méthodes :
- `getSuivant()` : Retourne la cellule suivante.
- `setSuivant(Cellule c_suivante)` : Modifie la cellule suivante.
- `setSuivant(Object o_suivant)` : Crée une nouvelle cellule pour encapsuler un objet et la relie en tant que suivante.
- `getContenu()` : Retourne le contenu de la cellule.
- `setContenu(Object o_contenu)` : Modifie le contenu de la cellule.
- `toString()` : Retourne une représentation en chaîne de caractères de la cellule.

#### Exemple d'utilisation dans `main` :
```java
Cellule c1 = new Cellule();
Cellule c2 = new Cellule(3);
System.out.println("c1 : " + c1);
System.out.println("c2 : " + c2);
c1.setContenu(5);
System.out.println("c1 après modification : " + c1);
c1.setSuivant(c2);
System.out.println("c1 avec c2 comme suivant : " + c1);
