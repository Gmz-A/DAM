#Programa el cual se encargue de pedir al usuario:
# + Nombre
# + Año de Nacimiento
# + Ciudad
# + Calcular la edad aproximada

nombre = input("Proporcina su nombre -> ") #solicitamos el nombre
nacimiento = int(input("En que año naciste -> ")) #solicitamos el año de nacimiento
ciudad = input("En que ciudad naciste -> ") #solicitamos la ciudad de nacimiento

nombre = nombre.capitalize() #ponemos la primera letra del nombre en mayusculas
ciudad = ciudad.capitalize() #ponemos el nombre de la ciudad en mayusculas

print("\n---- FICHA DE USUARIO ----")
print(f"Nombre: {nombre}")
print(f"Ciudad: {ciudad}")
print(f"Edad Aproximada: {2026-nacimiento}")
print("--------------------------")
if (2026-nacimiento) < 30:
    print("Eres Joven")
else:
    print("Eres Adulto")
print("--------------------------")