import matplotlib.pyplot as plt
import matplotlib.dates as mdates
import numpy as np


linguagem = ["closure", "closure_xml", "java_xml", "pair", "pair_closure",
             "pair_closure_xml", "pair_xml", "xml"]

X = []
Y = np.zeros(len(linguagem))
Ytab = []

java = []
java_value = []
java_X = []

cont = 0


dataset = open('./reports/Saida.csv', 'r')

for line in dataset:
    line = line.strip()  # Tira o \n no final da linha
    x, y, z = line.split(';')  # Quebra a linha com o marcador ;

    cont += 1
    if x in linguagem:
        if x == "closure":
            Y[0] += int(y)
        elif x == "closure_xml":
            Y[1] += int(y)
        elif x == "java_xml":
            Y[2] += int(y)
        elif x == "pair":
            Y[3] += int(y)
        elif x == "pair_closure":
            Y[4] += int(y)
        elif x == "pair_closure_xml":
            Y[5] += int(y)
        elif x == "pair_xml":
            Y[6] += int(y)
        elif x == "xml":
            Y[7] += int(y)

    elif x in java:
        java_value[java.index(x)] += int(y)
    else:
        java.append(x)
        java_value.append(int(y))

dataset.close()


for i in range(len(linguagem)):
    X.append(linguagem[i])
    Ytab.append(Y[i] / cont)

for j in range(len(java_value)):
   java_value[j] /= cont


# grafico = plt.subplots(1, 1, figsize=(5, 10))

# grafico[1,0].bar(X, Y)
# grafico[1,0].title('Tempo de Execução')
# grafico[1,0].xlabel('Nome arquivo')
# grafico[1,0].ylabel('Tempo')
# # grafico[1,0].xticks(rotation=90)
# # grafico[1,0].xticks(rotation=45, ha='right')
# grafico[1,0].tick_params(axis='x', labelrotation=45)
# grafico[1,0].subplots_adjust(bottom=0.35)

# grafico[0,1].bar(java, java_value)

# grafico[0,1].title('Tempo de Execução')
# grafico[0,1].xlabel('Nome arquivo')
# grafico[0,1].ylabel('Tempo')

# # grafico[0,1].xticks(rotation=90)
# # grafico[0,1].xticks(rotation=45, ha='right')
# grafico[0,1].tick_params(axis='x', labelrotation=45)
# grafico[0,1].subplots_adjust(bottom=0.35)

# plt.show()


plt.bar(X, Y)

plt.title('Tempo de Execução')
plt.xlabel('Nome arquivo')
plt.ylabel('Tempo')

# plt.xticks(rotation=90)
# plt.xticks(rotation=45, ha='right')
plt.tick_params(axis='x', labelrotation=45)
plt.subplots_adjust(bottom=0.35)

plt.show()


plt.bar(java, java_value)

plt.title('Tempo de Execução')
plt.xlabel('Nome arquivo')
plt.ylabel('Tempo')

# plt.xticks(rotation=90)
# plt.xticks(rotation=45, ha='right')
plt.tick_params(axis='x', labelrotation=45)
plt.subplots_adjust(bottom=0.35)

plt.show()
