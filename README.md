# TP1POA
Le **multithreading** en Java permet d'exécuter plusieurs tâches en parallèle. Mais pourquoi en avons-nous besoin ? En Java, par défaut, un seul processus (ou thread principal) s'exécute dans un programme. Cela signifie que les tâches s'exécutent de manière séquentielle. Cependant, dans certaines situations, il est nécessaire d'exécuter plusieurs tâches simultanément pour améliorer l'efficacité ou pour que l'interface utilisateur reste réactive.

C'est là que le multithreading intervient : il permet de gérer plusieurs threads (ou processus légers) qui s'exécutent en parallèle au sein du même programme.

Il existe deux manières principales de créer des threads en Java :
    1-En héritant directement de la classe Thread.
    2-En implémentant l'interface Runnable.
    
Dans le deuxième exercice de ce TP, nous avons utilisé le multithreading pour que notre programme affiche une horloge graphique et compte les secondes en arrière-plan. Le programme met à jour l'affichage chaque seconde tout en laissant l'interface graphique active et réactive. C'est un exemple pertinent de l'utilisation des threads en Java, car il illustre comment une tâche continue (le comptage du temps) peut être exécutée en parallèle avec d'autres processus (comme l'affichage de l'horloge).

