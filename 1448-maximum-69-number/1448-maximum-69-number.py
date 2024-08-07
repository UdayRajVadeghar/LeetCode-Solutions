class Solution:
    def maximum69Number (self, num: int) -> int:

        strNum = str(num)
        for i in range(len(strNum)):

            if strNum[i] == '6':

                strNum = strNum[0:i] + '9' + strNum[i+1:len(strNum)]
                break   
        return int(strNum)