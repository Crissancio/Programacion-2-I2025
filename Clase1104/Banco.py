class Persona:
    def __init__(self, ci, nombre, apellido, edad):
        self.__ci = ci
        self.__nombre = nombre
        self.__apellido = apellido
        self.__edad = edad

    def getCi(self):
        return self.__ci
    
    def getNombre(self):
        return self.__nombre
    
    def getApellido(self):
        return self.__apellido
    
    def getEdad(self):
        return self.__edad
    
    def EsMayorEdad(self):
        return self.__edad >= 18
    
class CuentaBancaria:
    def __init__(self, ci, nombre, apellido):
        self.__idCuenta = ci+apellido[0]+nombre[0]
        self.__saldo = 0
    
    def getIdCuenta(self):
        return self.__idCuenta
    
    def getSaldo(self):
        return self.__saldo
    
    def retirar(self, monto):
        if monto <= self.__saldo:
            self.__saldo -= monto
            return monto
        else:
            return 0
     
    def depositar(self, monto):
        self.__saldo += monto
        
    def mostrar(self):
        print("Cuenta: "+self.__idCuenta+" Saldo: "+str(self.__saldo))
        

class PilaCB:
    def __init__(self, max):
        self.__tope = 0
        self.__max = max
        self.__v = [None]*(max+1)
    
    def esVacia(self):
        return self.__tope == 0
    
    def esLlena(self):
        return self.__tope == self.__max
    
    def adicionar(self, cuenta : CuentaBancaria):
        if self.esLlena():
            print("Pila llena")
        else:
            self.__tope += 1
            self.__v[self.__tope] = cuenta
    
    def eliminar(self):
        cuenta = None;
        if self.esVacia():
            print("Pila vacia")
        else:
            cuenta = self.__v[self.__tope]
            self.__tope -= 1
        return cuenta
    
class Banco:
    def __init__(self, nombre, max):
        self.__nombre = nombre
        self.__cuentas = PilaCB(max)
    
    def agregarUsuario(self, p: Persona):
        idCuenta = p.getCi()+p.getApellido()[0]+p.getNombre()[0]
        
        aux = PilaCB(100)
        
        tieneCuenta = False
        while not self.__cuentas.esVacia():
            cuenta = self.__cuentas.eliminar()
            if cuenta.getIdCuenta() == idCuenta:
                tieneCuenta = True
            aux.adicionar(cuenta)
        
        while not aux.esVacia():
            self.__cuentas.adicionar(aux.eliminar())
        
        if tieneCuenta:
            print("Ya existe una cuenta con ese id")
        else:
            cuenta = CuentaBancaria(p.getCi(), p.getNombre(), p.getApellido())
            self.__cuentas.adicionar(cuenta)
    
    def eliminarUsuario(self, p: Persona):
        idCuenta = p.getCi()+p.getApellido()[0]+p.getNombre()[0]
        
        seElimino = False
        aux = PilaCB(100)
        
        while not self.__cuentas.esVacia():
            cuenta = self.__cuentas.eliminar()
            if cuenta.getIdCuenta() == idCuenta:
                seElimino = True
            else:
                aux.adicionar(cuenta)
        
        while not aux.esVacia():
            self.__cuentas.adicionar(aux.eliminar())
        
        if seElimino:
            print("Se elimino la cuenta")
        else:
            print("No se encontro la cuenta")
    
    def retiro(self, monto, p: Persona):
        idCuenta = p.getCi()+p.getApellido()[0]+p.getNombre()[0]
        montoRetirado = self.__retiro(monto, idCuenta)
        return montoRetirado

    def __retiro(self, monto, idCuenta):
        montoRetirado = 0
        aux = PilaCB(100)
        
        while not self.__cuentas.esVacia():
            cuenta = self.__cuentas.eliminar()
            if cuenta.getIdCuenta() == idCuenta:
                montoRetirado = cuenta.retirar(monto)
            aux.adicionar(cuenta)
        
        while not aux.esVacia():
            self.__cuentas.adicionar(aux.eliminar())
        
        return montoRetirado
    
    def deposito(self, monto, p: Persona):
        idCuenta = p.getCi()+p.getApellido()[0]+p.getNombre()[0]
        self.__deposito(monto, idCuenta)
    
    def __deposito(self, monto, idCuenta):
        aux = PilaCB(100)
        seDeposito = False
        
        while not self.__cuentas.esVacia():
            cuenta = self.__cuentas.eliminar()
            if cuenta.getIdCuenta() == idCuenta:
                cuenta.depositar(monto)
                seDeposito = True
            aux.adicionar(cuenta)
        
        while not aux.esVacia():
            self.__cuentas.adicionar(aux.eliminar())
        
        if seDeposito:
            print("Se deposito el monto")
        else:
            print("No se encontro la cuenta")
        
    def transaccion(self, p: Persona, cuenta, monto):
        montoRetirado = self.retiro(monto, p)
        
        if montoRetirado > 0:
            self.__deposito(montoRetirado, cuenta)
        else:
            print("No se pudo realizar la transaccion: Fondos Inscuficientes")

    def verificarDatos(self, p:Persona):
        idCuenta = p.getCi()+p.getApellido()[0]+p.getNombre()[0]
        existe = False
        
        aux = PilaCB(100)
        
        while not self.__cuentas.esVacia():
            cuenta = self.__cuentas.eliminar()
            if cuenta.getIdCuenta() == idCuenta:
                existe = True
                cuenta.mostrar()
            aux.adicionar(cuenta)
        
        while not aux.esVacia():
            self.__cuentas.adicionar(aux.eliminar())
        
        if(not existe):
            print("No existe la cuenta")


bancoSol = Banco("Banco Sol", 100)

persona1 = Persona("1111", "Juan", "Pérez", 25)
persona2 = Persona("2222", "María", "Gómez", 30)
persona3 = Persona("3333", "Pedro", "López", 17)
persona4 = Persona("4444", "Ana", "Martínez", 20)
persona5 = Persona("5555", "Luis", "Fernández", 40)
persona6 = Persona("6666", "Laura", "García", 19)

bancoSol.agregarUsuario(persona1)
bancoSol.agregarUsuario(persona2)
bancoSol.agregarUsuario(persona3)
bancoSol.agregarUsuario(persona4)
bancoSol.agregarUsuario(persona5)
bancoSol.agregarUsuario(persona6)

bancoSol.eliminarUsuario(persona2)

bancoSol.deposito(1000, persona1)
bancoSol.deposito(500, persona3)
bancoSol.deposito(2000, persona4)
bancoSol.deposito(1500, persona5)
bancoSol.deposito(800, persona6)

retiro = bancoSol.retiro(200, persona1)
if retiro > 0:
    print("Retiro exitoso: ", retiro)
else:
    print("Fondos insuficientes")

bancoSol.transaccion(persona1, persona6, 300)

bancoSol.verificarDatos(persona6)
