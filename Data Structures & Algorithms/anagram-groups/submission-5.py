class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = dict()
        for s in strs:
            c = ''.join(sorted(s))
            anagrams.setdefault(c, []).append(s)
        return list(anagrams.values())
        