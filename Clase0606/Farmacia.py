from Persona import Persona
from Medicamento import Medicamento
import os

rutaPer = "F:/program/aux_121/Programacion-2-I2025/Clase0606/personaPython"
rutaMed = "F:/program/aux_121/Programacion-2-I2025/Clase0606/medicamentoPython"

class Farmacia:
    def __init__(self, nombre):
        self.nombre = nombre
        self.personas = []
        self.medicamentos = []
    
    def cargarPersonas(self):
        carpeta = rutaPer
        for archivo in os.listdir(carpeta):
            ruta_completa = rutaPer+ "/"+archivo
            if(os.path.isfile(ruta_completa)):
                persona = Persona()
                persona.cargarDatos(ruta_completa)
                self.personas.append(persona)
    
    def cargarMedicamentos(self):
        carpeta = rutaMed
        for archivo in os.listdir(carpeta):
            ruta_completa = rutaMed+"/"+archivo
            if(os.path.isfile(ruta_completa)):
                medicamento = Medicamento()
                medicamento.cargarDatos(ruta_completa)
                self.medicamentos.append(medicamento)
                
    def agregarPersona(self, persona):
        self.personas.append(persona)
        persona.guardarDatos()
    
    def agregarMedicamento(self, medicamento):
        self.medicamentos.append(medicamento)
        medicamento.guardar()
    
    def mostrarPersonas(self):
        for persona in self.personas:
            print(persona)
    
    def mostrarMedicamentos(self):
        for medicamento in self.medicamentos:
            print(medicamento)

    def venderMedicamento(self, nombre, cantidad):
        pe = self.personas.pop(0)
        pe.eliminarDatos();

        for med in self.medicamentos:
            if(med.nombre == nombre):
                total = med.precio * cantidad
                newStock = med.stock - cantidad
                
                med.stock = newStock
                med.actualizar()
                
                print(f"CLIENTE: {pe.nom}\nPRECIO: {total}")
                break