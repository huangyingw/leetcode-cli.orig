	public class Solution {
		public int sqrt(int a) {
			if (a < 0) {
				return -1;
			}

			if (a == 0) {
				return 0;
			}

			int l = 1;
			int r = a / 2 + 1;

			while (l <= r) {
				int m = (l + r) / 2;

				if (m * m <= a && a < (m + 1) * (m + 1)) {
					return m;
				}

				if (a / m < m) {
					r = m - 1;
				}
				else {
					l = m + 1;
				}
			}

			return 0;
		}
	}

