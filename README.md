# Paradigma orientado a objetos

# Ejercicio Hambuerguesa

Hamburguesas Low Cost: Parte 1

Una hamburguesería que está por instalarse cerca de la UADE, está pensando en las diferentes opciones para ofrecer a sus clientes. Desea cubrir un gran segmento del mercado, para todos los gustos. El asesor de marketing que está trabajando con el dueño le propuso un modelo de negocio basado en el de las aerolíneas low cost: “solamente pagás lo que comés”. Para esto, el cliente prepara su hamburguesa y luego es el trabajo de calcular el precio.

Consigna: Modelar las clases que se necesiten para poder calcular el precio de una hamburguesa, siguiendo las siguientes reglas:

▪︎ Una hamburguesa puede ser simple, doble o plus. Una hamburguesa simple tiene un único medallón, la doble contiene 2 medallones y la plus contiene 3 medallones.

▪︎Los medallones pueden ser de carne, pollo o vegetarianos. Todos tienen un precio distinto. Es posible (aunque poco probable que alguien lo pida) que los medallones sean distintos, por ejemplo que alguien pida una hamburguesa doble con un medallón de carne y uno vegetariano.

▪︎Cada hamburguesa debe poder calcular su precio sumando el precio de todos sus ingredientes, más el precio base. El precio base es siempre el mismo para todos los tipos de hamburguesas, pero debe poder actualizarse por inflación al igual que todos los precios.

▪︎Es posible agregarle ingredientes extra a una hamburguesa, como huevo frito, lechuga y tomate, cheddar, y otros que se agreguen en un futuro. Siguiendo la política low cost, los ingredientes tienen todos un precio diferente. En cuanto a la cantidad de ingredientes extra es un poco estricta la hamburguesería. Se pueden agregar tantos ingredientes como medallones tenga la hamburguesa.

Ejemplos para crear y calcular el precio:

▪︎ Hamburguesa doble (precio base $2500) con 1 medallón de pollo ($700) y 1 de carne ($900), ingredientes cheddar ($300) y berenjena ($250). Precio total: $4650.

Aclaraciones:

▪︎ Leer bien el enunciado, y pensar el objetivo del problema. ▪︎ Respetar la terminología usada en el enunciado. ▪︎ Hacer el diagrama de clases antes de escribir el código.

# Parte 2: Implementando colecciones

Luego de varios reclamos de amigos y viejos clientes, el dueño de la hamburguesería se fue dando cuenta que su hamburguesa low cost no era tan así como proponía el slogan. No todos los clientes que pedían una hamburguesa doble querían agregarle 2 ingredientes y menos aún pagar por eso. La solución tenía que ser una hamburguesa única y que el cliente pueda agregarle todo lo que guste, sin límite de medallones ni ingredientes, incluso poder repetir algún ingrediente.

Consigna: Agregar al código del ejercicio anterior una nueva Hamburguesa Flex que pueda cumplir estos requerimientos sin modificar el código de las clases existentes. Recordar que el objetivo es poder calcular el precio sumando el precio de todos los ingredientes. No debe haber límite de ingredientes ni de medallones.
