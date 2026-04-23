class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        dict_s = dict()
        dict_t = dict()

        for i, c in enumerate(s):
            if c in dict_s.keys():
                dict_s[c] += 1
            else:
                dict_s[c] = 1

        for i, c in enumerate(t):
            if c in dict_t.keys():
                dict_t[c] += 1
            else:
                dict_t[c] = 1
        
        for key, val in dict_s.items():
            if dict_t.get(key) != val:
                return False
            
        return True
        
            