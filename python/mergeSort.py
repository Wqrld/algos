import math

arr = [20, 8, 1, -100, 3, 1, 8, 1]


def merge(left, right):
    leftindex = 0
    rightindex = 0
    newarray = []

    while True:

        if leftindex >= len(left) and rightindex >= len(right):
            return newarray

        elif leftindex >= len(left):
            newarray.append(right[rightindex])
            rightindex += 1
        elif rightindex >= len(right):
            newarray.append(left[leftindex])
            leftindex += 1

        elif left[leftindex] >= right[rightindex]:
            newarray.append(right[rightindex])
            rightindex += 1
        elif right[rightindex] >= left[leftindex]:
            newarray.append(left[leftindex])
            leftindex += 1



def sort(array):
    if len(array) <= 1:
        return array

    alen = math.floor(len(array) / 2)

    left = array[:alen]
    right = array[alen:]
    left = sort(left)
    right = sort(right)
    return merge(left, right)


if __name__ == "__main__":
    arr = sort(arr)
    print(arr)
