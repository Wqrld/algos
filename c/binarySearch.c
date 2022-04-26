#include <stdio.h>


int main() {
	int arr[] = {1, 2, 3, 5, 10, 15, 91, 100};
	int searchFor = 6;


	int arrMax = sizeof(arr) / sizeof(arr[0]);
	int middle = arrMax / 2;
	int arrMin = 0;

	while (1) {

		printf("Middle: %d, Looking for %d\n", arr[middle], searchFor);


		if (arr[middle] > searchFor) {
			// go to the left
			arrMax = middle;
		
		}
		else if (arr[middle] < searchFor) {
			// go to the right
			arrMin = middle;
		}
		else if (arr[middle] == searchFor) {
			printf("Item is in array!\n");
			break;
		}

		if ((arrMax - arrMin) == 1 && arr[middle] != searchFor) {
			printf("Item is not in array!\n");
			break;
		}

		middle = arrMin + (arrMax - arrMin) / 2;

	}

}
