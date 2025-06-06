import os
import json

rutaBase = "F:/program/aux_121/Programacion-2-I2025/Clase0606/personaPython"
class Persona:
    def __init__(self, id=None, nom=None, edad=None):
        self.id = id
        self.nom = nom
        self.edad = edad
        self.archivo = f"{rutaBase}/persona{self.id}.json"

    def cargarDatos(self, rutaArchivo):
        self.archivo = rutaArchivo
        if os.path.isfile(self.archivo):
            with open(self.archivo, 'r') as archivo:
                datos = json.load(archivo)
                self.id = datos.get("id")
                self.nom = datos.get("nom")
                self.edad = datos.get("edad")
                print(f"Datos cargados: persona{self.id}.json")
        else:
            print(f"El archivo persona{self.id}.json no existe.")
        
    def guardarDatos(self):
        os.makedirs(rutaBase, exist_ok=True)
        
        if not os.path.exists(self.archivo):
            with open(self.archivo, 'w') as archivo:
                datos = {
                    "id": self.id,
                    "nom": self.nom,
                    "edad": self.edad
                }
                
                with open(self.archivo, 'w') as archivo:
                    json.dump(datos, archivo, indent=4)
            print(f"Datos guardados en: persona{self.id}.json")

        
    def actualizarDatos(self):
        with open(self.archivo, 'r') as archivo:
            datos = json.load(archivo)
            datos["nom"] = self.nom
            datos["edad"] = self.edad
            with open(self.archivo, 'w') as archivo:
                json.dump(datos, archivo, indent=4)

    def eliminarDatos(self):
        if os.path.isfile(self.archivo):
            os.remove(self.archivo)
            print(f"Archivo persona{self.id}.json eliminado.")
        else:
            print(f"El archivo persona{self.id}.json no existe.")
    
    def __str__(self):
        return f"ID: {self.id}, Nombre: {self.nom}, Edad: {self.edad}"
    
