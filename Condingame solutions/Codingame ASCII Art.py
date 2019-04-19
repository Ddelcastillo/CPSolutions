l = int(input())
h = int(input())
ind = list(map(ord, list(input().lower())))  # Lista de índices.
for i in range(len(ind)):
    ind[i] -= 97
    if ind[i] < 0 or ind[i] > 25:
        ind[i] = 26  # Punto de interrogación.
alf = list()  # Lista con el alfabeto de entrada.
for i in range(h):
    row = input()
    alf.append(row)

# Creating the output strings:
for i in alf:
    s = ""
    for j in ind:
        s += i[j * l:j * l + l]
    print(s)
