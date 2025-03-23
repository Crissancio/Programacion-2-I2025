class CajaAhorros:
    def __init__(self, nombre, nro, saldo):
        self.nombre = nombre
        self._nroCuenta = nro
        self.__saldo = saldo
    
    def mostrarDatos(self):
        print("Nombre: ", self.nombre)
        print("Número de cuenta: ", self._nroCuenta)
        print("Saldo: ", self.__saldo)
        
    def _getSaldo(self):
        return self.__saldo
    
    def __transferencia(self, monto):
        self.__saldo += monto

caja = CajaAhorros("Juan",1112, 100)
print("\t\t-->Acceso a atributos protegidos")
print(caja.__saldo)
caja.__saldo = 100000

print("\t\t-->Acceso a metodos protegidos")
caja.__transferencia(300)
print(caja.__saldo)