#include <stdio.h>
#include <climits>

#pragma warning(disable:6031)
#pragma warning(disable:4996)

#define ARRLEN 10

// SELECT-SORT

int main() {
	int intarr[10];

	// de getallen inlezen
	for (int i = 0; i < ARRLEN; i++) {
		printf("Geef getal %d: ", i + 1);
		scanf("%d", &intarr[i]);
	}

	// Doorlopen tot hij helemaal gesorteerd is
	while (1) {

		// Voor elke index van de gekozen getallen
		for (int o = 0; o < ARRLEN; o++) {


			// Het minimum berekenen van de huidige index t/m ARRLEN
			int minindex = 0;
			int minimum = INT_MAX;
			for (int i = o; i < ARRLEN; i++) { // bereken het minimum voor o t/m 10
				if (intarr[i] < minimum) {// is dit getal lager dan het minimum?
					minimum = intarr[i]; // Zet het minimumgetal naar de huidige i
					minindex = i;
				}
			}


			// Omdraaien
			int tempint = intarr[o]; // sla de erste tijdelijk op
			intarr[o] = intarr[minindex];  // zet eerste naar minimum
			intarr[minindex] = tempint; // zet de minimum naar de eerste


		}

		// check of we klaar zijn met sorteren.
		int failcount = 0;
		for (int y = 0; y < ARRLEN - 1; y++) {
			if (intarr[y + 1] < intarr[y]) {
				failcount++; // Nog niet helemaal gesorteerd.
			}
		}



		if (failcount == 0) {
			break; // We zijn klaar!
		}



	}

	printf("De gesorteerde array is: ");
	for (int i = 0; i < ARRLEN; i++) {
		printf("%d ", intarr[i]);
	}

}