# Martingala
Simulador de casino y ruleta usando la estrategia Martingala con el sistema de 50% o 66%, aunque en el cálculo se tiene en cuenta el 0 de la ruleta europea y por lo tanto las probabilidades reales son algo menores.

## Sistema del 50%

**Probabilidad real por apuesta**: _18/37 = ~0,4865%_

Apuesta al rojo / negro o a par / impar.

Doblar cantidad en la siguiente si se pierde la apuesta.

## Sistema del 66%

**Probabilidad real por apuesta**: _24/37 = ~0,64865%_

Apuesta a dos docenas de tres, por ejemplo del 1 al 24.

Triplicar cantidad en la siguiente si se pierde la apuesta.

## Seguridad en la apuesta

Hay diferentes parámetros que puedes introducir en el simulador:

- Saldo inicial
- Seguridad de la apuesta _(ver más abajo)_
- Número de apuestas (o infinito)
- Meta de beneficios (o infinito, aunque por probabilidad el programa siempre acaba)
- Sistema 50% o 66%

Este simulador calcula la ronda máxima a la que puedes llegar perdiendo consecutivamente sin quedarte sin dinero mediante la probabilidad/seguridad en cada apuesta que indiques como parámetro, en forma de porcentaje del 1 al 99, aceptando decimales. Una seguridad del 100% es imposible de alcanzar matemáticamente. A mayor seguridad deseada, menor es la apuesta a realizar en cada paso, con un límite inferior de 1 por apuesta.

## Ejemplos

Saldo: **1000**

Probabilidad/Seguridad: **50**

Número de apuestas (infinity = -1): **10**

Meta de beneficios (infinity = -1): **3000**

Sistema 50% o 66%: **50**

```
Seguridad hasta ronda: 2

Apostando 333 en pares.

X = 333 | W | +333 | 1333

X = 333 | L | -333 | 1000

X = 666 | W | +666 | 1666

X = 333 | W | +333 | 1999

X = 333 | L | -333 | 1666

X = 666 | L | -666 | 1000

No puedes apostar más.

STATS: Total (6) / Won (3) / Lost (3) / 50,00%

SALDO: 1000
```

Saldo: **1000**

Probabilidad/Seguridad: **95**

Número de apuestas (infinity = -1): **10**

Meta de beneficios (infinity = -1): **3000**

Sistema 50% o 66%: **50**

```
Seguridad hasta ronda: 5

Apostando 32 en pares.

X = 32 | W | +32 | 1032

X = 32 | L | -32 | 1000

X = 64 | W | +64 | 1064

X = 32 | L | -32 | 1032

X = 64 | L | -64 | 968

X = 128 | L | -128 | 840

X = 256 | W | +256 | 1096

X = 32 | L | -32 | 1064

X = 64 | W | +64 | 1128

X = 32 | W | +32 | 1160

Se ha alcanzado la máxima ronda.

STATS: Total (10) / Won (5) / Lost (5) / 50,00%

SALDO: 1160
```

Saldo: **5000**

Probabilidad/Seguridad: **99,9**

Número de apuestas (infinity = -1): **-1**

Meta de beneficios (infinity = -1): **3000**

Sistema 50% o 66%: **66**

```
Seguridad hasta ronda: 7

Apostando 2 en 2a 12 y 3a 12.

X = 2 | L | -2 | 4998

X = 6 | W | +6 | 5004

X = 2 | W | +2 | 5006

X = 2 | W | +2 | 5008

X = 2 | W | +2 | 5010

X = 2 | W | +2 | 5012

X = 2 | W | +2 | 5014

X = 2 | W | +2 | 5016

X = 2 | L | -2 | 5014

X = 6 | W | +6 | 5020

X = 2 | W | +2 | 5022

X = 2 | W | +2 | 5024

X = 2 | W | +2 | 5026

X = 2 | L | -2 | 5024

X = 6 | W | +6 | 5030

...

X = 2 | L | -2 | 5514

X = 6 | W | +6 | 5520

X = 2 | W | +2 | 5522

X = 2 | W | +2 | 5524

X = 2 | W | +2 | 5526

X = 2 | W | +2 | 5528

X = 2 | L | -2 | 5526

X = 6 | W | +6 | 5532

X = 2 | W | +2 | 5534

X = 2 | W | +2 | 5536

X = 2 | W | +2 | 5538

X = 2 | L | -2 | 5536

X = 6 | L | -6 | 5530

X = 18 | W | +18 | 5548

X = 2 | L | -2 | 5546

X = 6 | L | -6 | 5540

X = 18 | L | -18 | 5522

X = 54 | L | -54 | 5468

X = 162 | L | -162 | 5306

X = 486 | W | +486 | 5792

X = 2 | W | +2 | 5794

X = 2 | W | +2 | 5796

X = 2 | W | +2 | 5798

X = 2 | W | +2 | 5800

X = 2 | L | -2 | 5798

X = 6 | W | +6 | 5804

X = 2 | W | +2 | 5806

X = 2 | L | -2 | 5804

...

X = 2 | W | +2 | 7276

X = 2 | W | +2 | 7278

X = 2 | L | -2 | 7276

X = 6 | W | +6 | 7282

X = 2 | L (0) | -2 | 7280

X = 6 | W | +6 | 7286

X = 2 | W | +2 | 7288

X = 2 | L | -2 | 7286

X = 6 | W | +6 | 7292

X = 2 | W | +2 | 7294

X = 2 | L | -2 | 7292

X = 6 | L (0) | -6 | 7286

X = 18 | W | +18 | 7304

X = 2 | W | +2 | 7306

X = 2 | L | -2 | 7304

X = 6 | W | +6 | 7310

...

X = 2 | W | +2 | 7980

X = 2 | W | +2 | 7982

X = 2 | W | +2 | 7984

X = 2 | L | -2 | 7982

X = 6 | W | +6 | 7988

X = 2 | W | +2 | 7990

X = 2 | W | +2 | 7992

X = 2 | W | +2 | 7994

X = 2 | W | +2 | 7996

X = 2 | L | -2 | 7994

X = 6 | W | +6 | 8000

¡Qué suerte! ¡Ya eres un millonetis! Ve a gastártelo en otra ruleta.

STATS: Total (878) / Won (586) / Lost (292) / 66,74%

SALDO: 8000
```

Saldo: **1000**

Probabilidad/Seguridad: **99**

Número de apuestas (infinity = -1): **-1**

Meta de beneficios (infinity = -1): **3000**

Sistema 50% o 66%: **66**

```
Seguridad hasta ronda: 5

Apostando 4 en 2a 12 y 3a 12.

X = 4 | L (0) | -4 | 996

X = 12 | W | +12 | 1008

X = 4 | W | +4 | 1012

X = 4 | W | +4 | 1016

X = 4 | W | +4 | 1020

X = 4 | L | -4 | 1016

X = 12 | W | +12 | 1028

X = 4 | W | +4 | 1032

X = 4 | L | -4 | 1028

X = 12 | W | +12 | 1040

X = 4 | W | +4 | 1044

X = 4 | L | -4 | 1040

X = 12 | W | +12 | 1052

X = 4 | W | +4 | 1056

X = 4 | L | -4 | 1052

X = 12 | L | -12 | 1040

X = 36 | W | +36 | 1076

X = 4 | L | -4 | 1072

X = 12 | W | +12 | 1084

X = 4 | L | -4 | 1080

X = 12 | L (0) | -12 | 1068

X = 36 | W | +36 | 1104

X = 4 | W | +4 | 1108

X = 4 | W | +4 | 1112

X = 4 | W | +4 | 1116

X = 4 | W | +4 | 1120

X = 4 | L | -4 | 1116

X = 12 | L | -12 | 1104

X = 36 | W | +36 | 1140

X = 4 | L | -4 | 1136

X = 12 | W | +12 | 1148

X = 4 | W | +4 | 1152

X = 4 | W | +4 | 1156

X = 4 | L | -4 | 1152

X = 12 | W | +12 | 1164

X = 4 | W | +4 | 1168

X = 4 | L | -4 | 1164

X = 12 | L | -12 | 1152

X = 36 | W | +36 | 1188

X = 4 | L (0) | -4 | 1184

X = 12 | W | +12 | 1196

X = 4 | L | -4 | 1192

X = 12 | L | -12 | 1180

X = 36 | L | -36 | 1144

X = 108 | W | +108 | 1252

X = 4 | W | +4 | 1256

X = 4 | W | +4 | 1260

X = 4 | W | +4 | 1264

X = 4 | W | +4 | 1268

X = 4 | W | +4 | 1272

X = 4 | L | -4 | 1268

X = 12 | L | -12 | 1256

X = 36 | L | -36 | 1220

X = 108 | L | -108 | 1112

X = 324 | L | -324 | 788

No puedes apostar más.

STATS: Total (55) / Won (31) / Lost (24) / 56,36%

SALDO: 788
```

