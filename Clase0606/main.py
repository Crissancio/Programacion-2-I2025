from Persona import Persona
import os

ruta_base = "F:/program/aux_121/Programacion-2-I2025/Clase0606/personaPython"
def llenarDatos():
    datos = []
    carpeta = ruta_base
    for archivo in os.listdir(carpeta):
        ruta_completa = ruta_base + "/" + archivo
        if(os.path.isfile(ruta_completa)):
            persona = Persona()
            persona.cargarDatos(ruta_completa)
            datos.append(persona)
    return datos
'''
p1 = Persona(1, "Juan", 25)
p2 = Persona(2, "Ana", 30)
p3 = Persona(3, "Luis", 22)
p4 = Persona(4, "Maria", 28)
p5 = Persona(5, "Pedro", 35)

p1.guardarDatos()
p2.guardarDatos()
p3.guardarDatos()
p4.guardarDatos()
p5.guardarDatos()


'''
datos = llenarDatos()
for persona in datos:
    print(persona)

