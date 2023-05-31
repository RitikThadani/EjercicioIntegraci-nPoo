# EjercicioIntegraci-nPoo

# **Introducción**
Programa de un dispositivo que actúa como un Posnet que procesa pagos con tarjetas de c´redito.

# **Programa Principal**
Las tarjetas de crédito guardan el nombre de la entidad financiera a la que pertenecen, el nombre de la entidad bancaria, el número de tarjeta, el saldo disponible y
los datos del titular. 

# **Funcionamiento**

Cada vez que se cree una nueva tarjeta,
deberán indicarse todos los datos anteriores.

Si el pago es en 1 cuota, no se genera ningún recargo, de lo contrario, el monto se incrementará en
un 3% por cada cuota superior a 1.

El POSNET debe chequear que la tarjeta tenga saldo suficiente para poder efectuar el pago junto
con el recargo, si hubiese. En caso de éxito, debe generar y retornar un ticket donde
consten los siguientes datos:
* Nombre y apellido del cliente.
* Monto total a pagar.
* Monto de cada cuota.

Si la operación no tuvo éxito, se retornará null.
