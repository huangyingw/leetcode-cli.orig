

class Solution(object):
    def rearrangeBarcodes(self, barcodes):
        n = len(barcodes)

        result = [0] * n
        i = 0

        for count, num in freq:
            for _ in range(count):
                result[i] = num
                i += 2
                if i >= n:
                    i = 1

        return result

