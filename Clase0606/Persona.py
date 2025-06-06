import os

class Persona:
    def __init__(self, id, nom, edad):
        self.id = id
        self.nom = nom
        self.edad = edad
        self.archivo = f"F:/program/aux_121/Programacion-2-I2025/Clase0606/personaPython/persona{self.id}.json"

    @classmethod
    def desde_archivo(cls, id):
        ruta = f"F:/program/aux_121/Programacion-2-I2025/Clase0606/personaPython/persona{id}.json"
        with open(ruta, "r") as f:
            datos = f.read().splitlines()
            return cls(int(datos[0]), datos[1], int(datos[2]))

    def guardar(self):
        os.makedirs(os.path.dirname(self.archivo), exist_ok=True)
        with open(self.archivo, "w") as f:
            f.write(f"{self.id}\n{self.nom}\n{self.edad}\n")

    def actualizar(self, nuevo_nom, nueva_edad):
        self.nom = nuevo_nom
        self.edad = nueva_edad
        self.guardar()

    def eliminar(self):
        if os.path.exists(self.archivo):
            os.remove(self.archivo)

    def __str__(self):
        return f"ID: {self.id}, Nombre: {self.nom}, Edad: {self.edad}"


p = Persona.desde_archivo(1)
# p.actualizar("Tadeo", 52)

p.eliminar()
