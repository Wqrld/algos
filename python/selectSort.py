def selectsort(arr):
    for x in range(len(arr)):
        miny = arr[x]
        minyindex = x
        for y in range(x, len(arr)):
            if arr[y] < miny:
                miny = arr[y]
                minyindex = y
        temp = arr[x]
        arr[x] = miny
        arr[minyindex] = temp
    return arr

print(selectsort([4,3,4,1]))
