print("Opcion 1")
for i in range(5):
    print(i)
    
    
print("Opcion 2")
for i in range(1,6):
    print(i)

print("Opcion 3")
for i in range(0,6,2):
    print(i)


print("Ejercicio Clase 1")
resultado = 0
for i in range(1,11,1):
    resultado = resultado + i

print(resultado)


print("Ejercicio Clase 2")
resultado = 0
for i in range(1,11,1):
    if i % 2 == 0:
        resultado = resultado + i
print(resultado)