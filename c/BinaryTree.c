#include <stdio.h>
#include <stdlib.h>

struct node {
	struct node* parent;
	struct node* left;
	struct node* right;
	int value;
};

struct btree {
	struct node* root;
};

void insert(struct btree* tree, int value);
int search(struct btree* tree, int value);



int main() {

	struct btree cooltree;
	struct node root = { NULL, NULL, NULL, 25 };

	cooltree.root = &root;

	insert(&cooltree, 26);
	insert(&cooltree, 25);
	insert(&cooltree, 24);
	insert(&cooltree, 28);

	printf("%d\n", search(&cooltree, 28));

}

int search(struct btree* tree, int value) {
	struct node* checking = tree->root;
	while (1) {

		if (value > checking->value) {
			// Move right
			if (checking->right != NULL) {
				checking = checking->right;
			}
			else {
				return 0;
			}

		}
		else if (value < checking->value) {
			// Move left
			if (checking->left != NULL) {
				checking = checking->left;
			}
			else {
				return 0;
			}

		}
		else {
			// equal, stop
			return 1;
		}

	}


}

void insert(struct btree* tree, int value) {
	struct node* newnode = calloc(1, sizeof(struct node)); // Create a new node
	if (newnode == NULL) {
		printf("malloc fail");
		return;
	}

	newnode->value = value;

	struct node* checking = tree->root;
	while (1) {

		if (value > checking->value) {
			// Move right
			if (checking->right != NULL) {
				checking = checking->right;
			}
			else {
				checking->right = newnode;
				newnode->parent = checking;
				break;
			}
		}
		else if (value < checking->value) {
			// Move left
			if (checking->left != NULL) {
				checking = checking->left;
			}
			else {
				checking->left = newnode;
				newnode->parent = checking;
				break;
			}
		}
		else {
			// equal, stop
			break;
		}

	}



}
