# Design — Exercices de programmation fonctionnelle en Scala

## 1. Ce que fait le produit (scénarios courants)

Ce projet est un ensemble d'exercices auto-contenus pour des étudiants débutants
en Scala qui apprennent la programmation fonctionnelle. Chaque exercice est un
fichier Scala contenant des fonctions stub à implémenter, accompagné d'une suite
de tests (MUnit pour le Scala de base, ZIO Test pour les effets). L'étudiant
édite `src/main` et lance `sbt test` pour vérifier son travail. Les exercices
sont indépendants les uns des autres et ne comportent pas de solutions fournies.

## 2. Environnement et outillage

- Outil de build : sbt, Scala 3.9.0
- IDE local : VS Code + Metals, ou IntelliJ
- Tests Scala de base : MUnit
  (`libraryDependencies += "org.scalameta" %% "munit" % "1.3.6" % Test`)
- Tests effets : ZIO Test
  (`"dev.zio" %% "zio-test" % "2.1.26" % Test`,
   `"dev.zio" %% "zio-test-sbt" % "2.1.26" % Test`)
- Dépendance runtime pour les exercices : `"dev.zio" %% "zio" % "2.1.26"`

## 3. Plan des exercices

### Phase 1 — Scala de base (MUnit)

1. **Échauffement** : valeurs, types, méthodes, interpolation de chaînes.
2. **Contrôle de flux et pattern matching**.
3. **Méthodes, récursion, récursion de queue**.

### Phase 2 — Listes (MUnit)

4. **Construction et déconstruction** de listes.
5. **map / filter / fold**.
6. **Algorithmes sur les listes** : reverse, zip, partition, groupBy,
   take/drop, find.

### Phase 3 — Typeclasses, construites de zéro (MUnit)

7. **Eq**
8. **Ord**
9. **Show**
10. **Functor**
11. **Monad**

### Phase 4 — Effets ZIO (ZIO Test)

12. **Construction d'effets**
13. **map / flatMap / for-comprehensions**
14. **Gestion d'erreurs**
15. **Fibers**
16. **Ref**
17. **Queue**
18. **Schedule**
19. **ZStream**

## 4. Flux des utilisateurs

- L'étudiant ouvre le projet dans son IDE local.
- Il choisit un exercice (fichier stub dans `src/main`).
- Il implémente les fonctions demandées.
- Il lance `sbt test` ; MUnit ou ZIO Test lui indique ce qui passe et ce qui échoue.
- Il itère jusqu'à ce que tous les tests soient verts.
- Les exercices sont indépendants : n'importe lequel peut être fait dans n'importe
  quel ordre.

## 5. Résumé d'utilisabilité

Chaque exercice est un fichier stub + une suite de tests. L'étudiant édite
`src/main` et lance `sbt test`. Les exercices sont auto-contenus. Aucune solution
n'est fournie.