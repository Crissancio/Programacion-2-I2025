class Persona:
    def __init__(self, ci, nombre, apellido, edad):
        self.__ci = ci
        self.__nombre = nombre
        self.__apellido = apellido
        self.__edad = edad
    
    def saludo(self):
        print(f"Hola, soy {self.__nombre} {self.__apellido} y tengo {self.__edad} años.")
    
    def getCi(self):
        return self.__ci
    
    def getNombre(self):
        return self.__nombre
    
    def getApellido(self):
        return self.__apellido
    
    def getEdad(self):
        return self.__edad
        
class Docente(Persona):
    def __init__(self, ci, nombre, apellido, edad, años_trabajo, materias):
        super().__init__(ci, nombre, apellido, edad)
        self.__años_trabajo = años_trabajo
        self.__materias = materias
    
    def saludo(self):
        print(f"Hola, soy {self.getNombre()} {self.getApellido()}, tengo {self.getEdad()} años y trabajo desde hace {self.__años_trabajo} años.")
        

class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, edad, ru, semestre):
        super().__init__(ci, nombre, apellido, edad)
        self.__ru = ru
        self.__semestre = semestre
    
    def saludo(self):
        print(f"Hola, soy {self.getNombre()} {self.getApellido()}, tengo {self.getEdad()} y voy{self.__semestre} semestre")
    
    
    

d1 = Docente(12345678, "Juan", "Pérez", 40, 15, ["Matemáticas", "Física"])
# d1.saludo()

e1 = Estudiante(87654321, "Ana", "Gómez", 20, 123456, 2)
e1.saludo()