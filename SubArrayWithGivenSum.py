arr=[1,2,3,4,5,6,7,8,9]
n=len(arr)
sum=9

def subArraySum(arr,n,sum):

    curr_sum = 0
    start = 0
    end = -1
    for i in range(n):
        curr_sum = curr_sum + arr[i]

        while curr_sum>sum:
            curr_sum = curr_sum - arr[start]
            start = start+1

        if sum==curr_sum:
            end=i
            break

    if end==-1:
        print(end)
    else:
        print(str(start+1)+" "+str(end+1))

subArraySum(arr,n,sum)