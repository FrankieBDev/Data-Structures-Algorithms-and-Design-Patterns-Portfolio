const arr = [303,2923,176,412,609,588,767,9,823,10, 672, 686, 90, 16, 53840, 234, 565]
const getDigit = (num, i) => Math.floor(Math.abs(num) / Math.pow(10, i)) % 10

const numberCount = num => {
    if (num === 0) return 1
    return Math.floor(Math.log10(Math.abs(num))) + 1
}

const mostNumbers = nums => {
    let maxNumbers = 0
    for (let i = 0; i < nums.length; i++) maxNumbers = Math.max(maxNumbers, numberCount(nums[i]))
    return maxNumbers
}

const radixSort = nums => {
    let maxNumberCount = mostNumbers(nums)
    for (let a = 0; a < maxNumberCount; a++) {
        let numberBuckets = Array.from({ length: 10 }, () => [])
        for (let i = 0; i < nums.length; i++) {
            let number = getDigit(nums[i], a)
            numberBuckets[number].push(nums[i])
        }
        nums = [].concat(...numberBuckets)
    }
    return nums
}

console.log(radixSort(arr))