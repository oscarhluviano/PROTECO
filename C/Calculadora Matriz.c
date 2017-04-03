#include <stdio.h>
#include <stdlib.h>

void mult(int arr1[4][1], float arr2[1][4]);
void matriz1(int arr[4][1]);
void matriz2(float arr[1][4]);

//Apiadate de mí, es la primera vez que programo en C jajaja

int main(int argc, char const *argv[]){
	int arr1[4][1];
	float arr2[1][4];
printf("Introduce matriz 4x1\n");
		matriz1(arr1);
printf("Introduce matriz 1x4\n");
		matriz2(arr2);
printf("\n");
		mult(arr1, arr2);
}

void matriz1(int arr1[4][1]){
	for (int i = 0; i < 4; i++){
		for (int j = 0; j < 1; j++)
		{	printf("Posición [%d][%d] :", i, j);
			scanf("%d", &arr1[i][j]);
		}
	}
}

void matriz2(float arr2[1][4]){
	for (int i = 0; i < 1; i++){
		for (int j = 0; j < 4; j++)
		{	printf("Posición [%d][%d] :", i, j);
			scanf("%f", &arr2[i][j]);
		}
	}
}
void mult(int arr1[4][1], float arr2[1][4]){
	double arr[4][4];
	for (int i = 0; i < 4; i++)
		for (int j = 0; j < 4; j++)
			arr[i][j] = (double)arr1[i][0]*arr2[0][j];
	printf("El resultado de la matriz es\n");
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 4; j++){
				printf("%f  ", arr[i][j]);		
			}
		printf("\n");		
		}	
}