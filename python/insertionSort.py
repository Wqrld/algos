arr = [20, 8, 5, 9, 12, 13, 18, 11, 3, 2, 1, 7, 3, 1]


def sort():
    for i in range(1, len(arr)):
        j = i
        key = arr[i]
        while j > 0 and arr[j - 1] > key:
            arr[j] = arr[j - 1]
            j = j - 1
        arr[j] = key


if __name__ == "__main__":
    sort()
    print(arr)
