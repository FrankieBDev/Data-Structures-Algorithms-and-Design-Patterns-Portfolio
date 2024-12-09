function selectionSort(arr) {
    for (let i = 0; i < arr.length; i++) {
        let min = i;
        for (let j = i + 1; j < arr.length; j++) {
            if (arr[min] > arr[j]) {
                min = j;
            }
        }
            if (i !== min) {
                let temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
    }
    return arr;
}

let arr = [3, 55, 7, 10, 6, 8, 12, 16, 42];

console.log(selectionSort(arr));