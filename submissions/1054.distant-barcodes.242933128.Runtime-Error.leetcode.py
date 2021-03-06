from collections import Counter


class Solution(object):
    def rearrangeBarcodes(self, barcodes):
        n = len(barcodes)
        print('n --> %s' % (n))
        freq = Counter(barcodes)
        freq = sorted([(count, num) for num, count in freq.items()], reverse=True)
        result = [0] * n
        i = 0
        for count, num in freq:
            for _ in range(count):
                result[i] = num
                i += 2
                print('i --> %s' % (i))
        return result

