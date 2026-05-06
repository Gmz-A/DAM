#Sumar los numeros del 1 al 10
resultado = 0
for i in range(1,11):
    resultado += i
print (resultado)

resultado2 = 1
numero = int(input("Introduce un numero para sumar (0 para salir)"))
while numero != 0:
    resultado2 += numero
    numero = int(input("Introduce un numero para sumar (0 para salir)"))
print(resultado2)

#Ejercicio 1
numero = int(input("Introduce un numero positivo -> "))
for i in range(numero): #tenemos que añadir el +1 para que imprima tambien el numero maximo de la serie
    print(i, end=", ")
print(numero)

#Ejercicio 2
numero = int(input("Introduce un numero -> "))
contador = 0
for i in range (0,numero+1,2): #Aqui lo que hacemos es indicar que al comenzar el numero en 0 y hacer cada dos saltos de linea un numero siempre que sume un valor va a ser par
    contador +=1
print(contador)

#Ejercicio 3
numero = int(input("Introduce un numero positivo -> "))
contador = 0
for contador in range(numero, 0, -1):
    print(contador, end=", ")
print(0)

#Ejercicio 4
numero = int(input("Introduce un numero positivo -> "))
resultado = 1
for factorial in range(1,numero+1):
    resultado *= factorial
print(f"El factorial de {numero} es {resultado}")

#Ejercico 5
numero = int(input("Introduce un numero positivo -> "))
for i in range(numero+1):
    if (i%3 != 0 and i%5!=0)or(i%3 == 0 and i%5 == 0):
        continue
print(i)