class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:

        a = set(allowed)
        count = 0
        for i in words:
            for j in i:
                if j not in a:
                    count+=1
                    break


        return len(words) - count            







        