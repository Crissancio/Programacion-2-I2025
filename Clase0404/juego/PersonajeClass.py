class Personaje:
    def __init__(self, nivel, velocida, habilidad, genero,nombre, daño, vida):
        self.nivel = nivel
        self.velocida = velocida
        self.habilidad = habilidad
        self.genero = genero
        self.nombre = nombre
        self.daño = daño
        self.vida = vida
    
    def atarcar(self):
        print(f"{self.nombre} ataca con {self.daño} de daño.")
    
    def curar(self):
        print(f"{self.nombre} cura {self.vida} de vida.")
    
    def aumentarNivel(self):
        self.nivel += 1
        print(f"{self.nombre} ha aumentado a nivel {self.nivel}.")
    
    def mover(self, mover):
        print(f"{self.nombre} se movio hacia {mover}")


class Jugador(Personaje):
    def __init__(self, nivel, velocida, habilidad, genero,nombre, daño, vida, nameTag, armamento, rango):
        super().__init__(nivel, velocida, habilidad, genero,nombre, daño, vida)
        self.nameTag = nameTag
        self.armamento = armamento
        self.rango = rango