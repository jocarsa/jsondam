import json

archivo = open("clientes.json",'r')
archivojson = json.load(archivo)

#solo quiero el primero
print(archivojson[0])
