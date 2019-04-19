h, ip, nf = int(input()), True, 1
an = list(map(int, input().split()))
for i in range(h):
    # El árbol es perfecto si no hay 1, 1 seguidos, dado que siempre se puede construir
    # un árbol con n nodos en un nodo o 1 nodo por nodo.
    if an[i] > 1 and an[i+1] > 1:
        ip = False
        break
if ip:
    print("perfect")
else:
    print("ambiguous")
    t1 = list(range(h+1))  # Al inicio ambos árboles comienzan igual.
    t2 = list(range(h+1))
    for i in range(1, h+1):
        t1.extend([i]*(an[i]-1))
        nf = len(t2) if an[i] > 1 and an[i-1] > 1 else i
        t2.extend([nf]*(an[i]-1))
        # Si el papá e hijo son inválidos, los modifica. El nuevo nodo después de la rama más larga
        # será ubicado en el menor nodo si es inválido, si no, únicamente será su altura - 1.
    print(" ".join(str(e) for e in t1))
    print(" ".join(str(e) for e in t2))
