#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <stdbool.h>


int menu();
void listCad(void ** cadenas);
void delCad(int x, void ** cadena);
void sobreescribir(int x, void ** cadena, char * nueva);
void ord(void ** cadenas);

int main(int argc, char ** argv) {

  void **cadenas = (void**) calloc(10, sizeof(void**));

  for (int i = 0; i < 10; i++) {
    printf("\nIngresa cadena %d: ", i+1);
    cadenas[i] = (char*) calloc(50,sizeof(char));
    scanf("%s", (char*)cadenas[i]);
  }

  int menu() {
    int opc = 0;
    printf("\nPrebemenu\n");
    printf("1. Listar las cadenas\n");
    printf("2. Ordenar las cadenas\n");
    printf("3. Sobreescribir una cadena\n");
    printf("4. Borrar una cadena\n");
    printf("5. Exit\n");
    printf("Escoge una opcion: ");
    scanf("%i", &opc);
    return opc;
  }

  int men = 1;
  while (men) {
    int x = 0;

    switch(menu()) {
    case 1:
      listCad(cadenas);
      break;

    case 2:
      ord(cadenas);
      break;

    case 3:
    printf("Numero cadena a sobeescribir: ");
    scanf("\n%i", &x);
    printf("Ingresa la nueva cadena: ");
    scanf("%s", (char*)cadenas[x-1]);
      break;

    case 4:
      printf("Numero cadena a eliminar: ");
      scanf("\n%i", &x);
      delCad(x-1, cadenas);
      break;

    case 5:
      men = 0;
      break;

    default:
      printf("No existe esa opcion en el menú, ingresa otro valor\n");
      return 1;
    }
  }

  for (int i = 0; i < 10; i++)
        free(cadenas[i]);
        free(cadenas);

  return EXIT_SUCCESS;
}


void listCad(void ** cadenas) {
  printf("Cadenas listadas\n");
  for (int i = 0; i < 10; i++)
    printf("%i.-%s\n", i+1, (char*)cadenas[i]);
}

int comparar(const void *a, const void *b) {      //me ayudo en esto un prebepokemon
  const char **ia = (const char **)a;
  const char **ib = (const char **)b;
  return strcmp(*ia, *ib);
}

void ord(void ** cadenas) {
  qsort(cadenas, 10, sizeof(char *), comparar);
}

void delCad(int x, void ** cadenas) {
  free(cadenas[x]);

  cadenas[x] = (char*) calloc(1,sizeof(char));
}
