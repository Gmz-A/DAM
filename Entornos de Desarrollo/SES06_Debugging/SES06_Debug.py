altura = int(input("Cual es la altura del triangulo\n"))
for i in range(1, altura+1):
    print("*"*i)

for i in range(1,altura):
    for j in range(i):
        print("*",end="") #Por defecto el print si no le añades un end te va a generar un salto de linea. El end es el encargado de indicar el espacio que quieres dejar entre los espacios del mismo nivel
    print() #Esto hay que añadirlo para que al salir del bucle J tienes que tener un salto de linea para no tener todo junto

numero = int(input("Ingresa un numero: "))

for i in range(11): #aqui es 11 ya que siempre se comienza desde 0 por lo que el valor siempre es un numero menor al final
    print(f"{numero} X {i} = {numero*i}") #aqui es donde hacemos la consecucion de numeros integrados con "f" para asi tenerlo todo en una misma linea.