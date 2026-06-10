#El prograa debe pedir:
# + Nombre del alumno
# + Nota del 0 al 10
#El programa debe mostrar:
# + Si ha aprobado o suspendido
# + Su calificacion segun la nota:
#   + >5 -> Suspenso
#   + 5-6-> Aprobado
#   + 7-8-> Notable
#   + 9-10-> Sobresaliente

nombre = input("Cual es tu nombre -> ")
nota = int(input("Que nota has sacado -> "))


if nota > 0 and nota < 10:
    
    print(f"Alumno: {nombre} \nNota: {nota} \nResultado: ")

    if nota < 5:
        print("SUSPENSO")
        print("Hay que seguir trabajando, a por ello!!!")
    else:
        if nota == 5 or nota == 6:
            print("APROBADO")
        elif nota == 7 or nota == 8:
            print("NOTABLE")
        else:
            print("SOBRESALIENTE")
        print("Buen trabajo, a seguir asi!!!")
else: 
    print("Nota mal introducida")