from Persona import Persona
from Medicamento import Medicamento
from Farmacia import Farmacia

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


farmacia = Farmacia("Farmacia Central")
farmacia.cargarPersonas()
farmacia.cargarMedicamentos()
'''
print("-----------------Medicamentos-----------------")
farmacia.mostrarMedicamentos()
print("-----------------Personas-----------------")
farmacia.mostrarPersonas()
'''
# print("----------VENDER MEDICAMENTO--------------")
# farmacia.venderMedicamento("Amoxicilina", 5)

print("-----------------Medicamentos-----------------")
farmacia.mostrarMedicamentos()
print("-----------------Personas-----------------")
farmacia.mostrarPersonas()
