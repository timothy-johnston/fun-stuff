def twoSum(nums, target):
    index1 = 0
    index2 = 0
    for num1 in nums:

        compliment = target - num1

        for num2 in nums:
            if index1 != index2 and num2 == compliment:
                return [index1, index2]
            index2 += 1
        index1 += 1

    return "shouldn't have got here lol"




numArray = [2, 7, 11, 15]
target = 9

print(twoSum(numArray, target))