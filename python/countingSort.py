def countingsort(array):
    counter = []
    for item in array:
        counter.append(0) # O(|S|)
    out = []
    for i in range(len(array)): # O(n)
        counter[array[i]] += 1

    for index in range(len(counter)):  # O(n)
        for times in range(counter[index]):
            out.append(index)
    return out

arr = [5, 4, 2, 1]
print(countingsort(arr))
