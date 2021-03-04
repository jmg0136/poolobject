[![Build Status](https://travis-ci.org/jmg0136/poolobject.svg?branch=master)](https://travis-ci.org/jmg0136/poolobject)

[![codecov](https://codecov.io/gh/jmg0136/poolobject/branch/master/graph/badge.svg?token=0SYIA0MNCO)](https://codecov.io/gh/jmg0136/poolobject)

Autor
=====

Jairo Montes González

Basado en el proyecto poolobject de @clopezno.

Repositorio
===========

- Github:		https://github.com/jmg0136/poolobject
- Travis-CI:	https://travis-ci.org/github/jmg0136/poolobject
- Codecov.io:	https://app.codecov.io/gh/jmg0136/poolobject


Objetivos específicos
=====================

- Comprender los objetivos de medición relacionados con la caracterización y la evaluación de productos, procesos y recursos software
- Comprender, aplicar y analizar técnicas de medición sobre entidades de productos software relacionados con conjuntos de pruebas de software
- Comprender, aplicar y analizar medidas relacionadas sobre entidades de proceso y recursos de prueba del software

Enunciado
=========

En la práctica se va simular un pequeño desarrollo de un producto software para realizar mediciones sobre él.
El objetivo es establecer un caso de estudio que sirva para caracterizar y evaluar tanto el producto desarrollado como el proceso seguido.

Preguntas
=========

## ¿Se ha realizado trabajo en equipo?

No, ha sido realizado de manera individual, aunque se ha contado en momentos puntuales con la ayuda del compañero Alfredo Asensio Vázquez.

## ¿Tiene calidad el conjunto de pruebas disponibles?

El proyecto ha superado las pruebas de Integración Contínua en Travis-CI, y ha obtenido un 87% de cobertura sobre la clase solicitada. La diferencia hasta el 100% es debida a que las instrucciones que producen las excepciones para evaluar los *catch* son contabilizadas como no cubiertas, así como algunos assert que son considerados como parcialmente cubiertos.

El porcentaje final de cobertura del proyecto es del 71,43%, debido al trabajo centrado en las pruebas de una única clase, dejando sin cubrir el resto del proyecto.

## ¿Cuál es el esfuerzo invertido en realizar la actividad?

La sensación general es que ha llevado muchísimo más trabajo del necesario, por fallos en las configuraciones de las herramientas, así como tener librerías obsoletas. No se ha contabilizado el total de horas por estar dispersas en varios días consecutivos.

Una vez solucionados todos los problemas, lo solicitado como trabajo real era sencillo y concreto, suponiendo aproximadamente un 15% en coste de implementación del código. Otro 5% del tiempo ha sido invertido en conocer las distintas herramientas a utilizar y corregir errores en su uso, habiendo siendo posible utilizarlas como se solicitaba sin mayor problema, aunque Travis-CI avisaba de que sus servicios estaban siendo migrados.

El 90% restante se ha dedicado a la lectura y visualización de los apuntes de teoría, adquisición de soltura con el IDE Eclipse, aprender a usar Markdown, corrección de errores en los commits a Github, y otros fallos surgidos en las pruebas para solucionar los errores encontrados mencionados al principio.

## ¿Cuál es el número de fallos encontrados en el código?

No se han encontrado errores en el código. Sí ha habido que realizar una actualización de la librería jacocoant.jar para el correcto funcionamiento del proyecto y eliminar la autentificación de dos factores (2FA) en la cuenta de Github para que Eclipse pudiese realizar los push.
