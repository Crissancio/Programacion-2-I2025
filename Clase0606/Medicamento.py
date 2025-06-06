import os
import json

rutaBase = "F:/program/aux_121/Programacion-2-I2025/Clase0606/medicamentoPython"

class Medicamento:
    def __init__(self, id=None, nombre=None, tipo = None, precio=None, stock=None):
        self.id = id
        self.nombre = nombre
        self.tipo = tipo
        self.precio = precio
        self.stock = stock
        self.archivo = f"{rutaBase}/medicamento{self.id}.json"
        
    def guardar(self):
        os.makedirs(rutaBase, exist_ok=True)
        
        if not os.path.exists(self.archivo):
            with open(self.archivo, 'w') as archivo:
                datos = {
                    "id": self.id,
                    "nombre": self.nombre,
                    "tipo": self.tipo,
                    "precio": self.precio,
                    "stock": self.stock
                }
                
                json.dump(datos, archivo, indent=4)
    
    def cargarDatos(self, rutaArchivo):
        self.archivo = rutaArchivo
        if os.path.isfile(self.archivo):
            with open(self.archivo, 'r') as archivo:
                datos = json.load(archivo)
                self.precio = datos.get("precio")
                self.id = datos.get("id")
                self.tipo = datos.get("tipo")
                self.nombre = datos.get("nombre")
                self.stock = datos.get("stock")
                print(f"Datos cargados: medicamento{self.id}.json")
        else:
            print(f"El archivo medicamento{self.id}.json no existe.")
            
    def actualizar(self):
        with open(self.archivo, 'r') as archivo:
            datos = json.load(archivo)
            datos["nombre"] = self.nombre
            datos["tipo"] = self.tipo
            datos["precio"] = self.precio
            datos["stock"] = self.stock
            with open(self.archivo, 'w') as archivo:
                json.dump(datos, archivo, indent=4)
    
    def eliminar(self):
        if os.path.isfile(self.archivo):
            os.remove(self.archivo)
            print(f"Archivo medicamento{self.id}.json eliminado.")
        else:
            print(f"El archivo medicamento{self.id}.json no existe.")
            
    def __str__(self):
        return f"ID: {self.id}, Nombre: {self.nombre}, Tipo: {self.tipo}, Precio: {self.precio}, Stock: {self.stock}"