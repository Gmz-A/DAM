#El programa debe pedir:
# + Nombre del Producto
# + Precio Initario
# + Cantidad
#
#Debe calcular
# + Precio Total
# + IVA(21%)
# + Total final con iva

producto = input("Cual es el producto -> ")
precio = int(input("Precio unitario -> "))
cantidad = int(input("Cantidad requerida -> "))

subtotal = precio*cantidad #calculamos el subtotal con las variables proporcionadas de precio y cantidad
iva = subtotal*0.21 #calculamos el iba multiplicandolo por 0.21
total = subtotal+iva #calculamos el total con las variables creadas antes partiendo de los valores introducidos

print("-------- TICKET --------")
print(f"Producto: {producto} \nCantidad: {cantidad} \nPrecio Unitario: {precio} \nSubtotal: {subtotal} \nIVA (21%): {iva} \nTotal: {total:.2f}") #aqui estamos imprimiendo todo el tiket dentro de una misma linea para evitar confusiones
print("--------------------------")
if total < 20:
    print("Compra pequeña")
else:
    print("Compra frande")
print("--------------------------")