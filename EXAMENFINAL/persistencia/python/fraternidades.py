import json

class Persona:
    def __init__(self, nom, genero, edad):
        self.nom = nom
        self.genero = genero
        self.edad = edad

    def to_dict(self):
        return {
            "nom": self.nom,
            "genero": self.genero,
            "edad": self.edad
        }

class Danzarin(Persona):
    def __init__(self, nom, genero, edad, nroParticipaciones):
        super().__init__(nom, genero, edad)
        self.nroParticipaciones = nroParticipaciones

    def to_dict(self):
        data = super().to_dict()
        data["nroParticipaciones"] = self.nroParticipaciones
        return data

class Fraternidad:
    def __init__(self, nombre, danza):
        self.nombre = nombre
        self.danza = danza
        self.danzarines = []

    def agregar_danzarin(self, danzarin):
        self.danzarines.append(danzarin)

    def promedio_edad_genero(self, genero):
        filtrados = [d for d in self.danzarines if d.genero.lower() == genero.lower()]
        if not filtrados:
            return 0.0
        total = sum(d.edad for d in filtrados)
        return total / len(filtrados)

    def danzarines_mas_participaciones(self):
        if not self.danzarines:
            return []
        max_part = max(d.nroParticipaciones for d in self.danzarines)
        return [d for d in self.danzarines if d.nroParticipaciones == max_part]

    def to_dict(self):
        return {
            "nombre": self.nombre,
            "danza": self.danza,
            "danzarines": [d.to_dict() for d in self.danzarines]
        }
    
    def mostrar(self):
        print(f"Fraternidad: {self.nombre}, Danza: {self.danza}")
        for d in self.danzarines:
            print(f" - Danzarin: {d.nom}, Género: {d.genero}, Edad: {d.edad}, Participaciones: {d.nroParticipaciones}")

class ArchivoFraternidad:
    def __init__(self, nombre_archivo):
        self.nombre_archivo = nombre_archivo

    def guardar_fraternidades(self, lista_fraternidades):
        data = []
        for f in lista_fraternidades:
            data.append(f.to_dict())
        with open(self.nombre_archivo, 'w', encoding='utf-8') as f:
            json.dump(data, f, ensure_ascii=False, indent=4)

    def leer_fraternidades(self):
        fraternidades = []
        try:
            with open(self.nombre_archivo, 'r', encoding='utf-8') as f:
                data = json.load(f)
                for item in data:
                    fraternidad = Fraternidad(item['nombre'], item['danza'])
                    for d in item['danzarines']:
                        danzarin = Danzarin(d['nom'], d['genero'], d['edad'], d['nroParticipaciones'])
                        fraternidad.agregar_danzarin(danzarin)
                    fraternidades.append(fraternidad)
        except FileNotFoundError:
            print("Archivo no encontrado.")
        return fraternidades

f1 = Fraternidad("Los Andinos", "Caporales")
f1.agregar_danzarin(Danzarin("Juan", "M", 21, 5))
f1.agregar_danzarin(Danzarin("Ana", "F", 19, 3))
f1.agregar_danzarin(Danzarin("Luis", "M", 23, 5))
f1.agregar_danzarin(Danzarin("Maria", "F", 22, 2))
f1.agregar_danzarin(Danzarin("Carlos", "M", 20, 4))
f1.agregar_danzarin(Danzarin("Sofia", "F", 21, 6))


f2 = Fraternidad("Urus", "Morenada")
f2.agregar_danzarin(Danzarin("Carla", "F", 20, 4))
f2.agregar_danzarin(Danzarin("Pedro", "M", 22, 4))
f2.agregar_danzarin(Danzarin("Lucia", "F", 19, 3))
f2.agregar_danzarin(Danzarin("Miguel", "M", 21, 5))
f2.agregar_danzarin(Danzarin("Elena", "F", 23, 2))


archivo = ArchivoFraternidad("fraternidades.json")
#archivo.guardar_fraternidades([f1, f2])
#print("Fraternidades guardadas.")

fraternidades = archivo.leer_fraternidades()
for f in fraternidades:
    f.mostrar()

print("\n--Promedio de edad masculino en 'Los Andinos':--")
nombre_frate = "Los Andinos"
for fraternidad in fraternidades:
    if fraternidad.nombre == nombre_frate:
        promedio_edad_masculino = fraternidad.promedio_edad_genero("M")
        print(f" Promedio de edad masculino: {promedio_edad_masculino:.2f}")



print("\n--Danzarines con más participaciones en 'Urus':--")
nombre_frate = "Urus"
for fraternidad in fraternidades:
    if fraternidad.nombre == nombre_frate:
        filtrado = fraternidad.danzarines_mas_participaciones()
        for d in filtrado:
            print(f" {d.nom}, Participaciones: {d.nroParticipaciones}")