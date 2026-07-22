<img width="1509" height="675" alt="image" src="https://github.com/user-attachments/assets/830b4689-654b-42fc-b5ca-ce52cadfb353" />
El problema es el sistema de toma de pedidos de la cafetería. 
Los clientes suelen personalizar sus bebidas con distintos extras (como leche, caramelo o crema batida), y si intentamos crear una clase por cada combinación posible,
el código se volvería inmanejable por la cantidad de archivos. Para evitar eso, aplicamos el patrón Decorator. Esto nos permite tomar una bebida base y simplemente ir agregándole los ingredientes extra de forma dinámica, 
calculando el precio total y armando la descripción del pedido final de forma muy limpia y sin repetir código.
