from Clase0404.juego.PersonajeClass import Personaje

class Jugador(Personaje):
    def __init__(self, nivel, velocida, habilidad, genero,nombre, daño, vida, nameTag, armamento, rango):
        super().__init__(nivel, velocida, habilidad, genero,nombre, daño, vida)
        self.nameTag = nameTag
        self.armamento = armamento
        self.rango = rango
        