package biancheng;
//binary search
public class SearchTest {

	/** 被搜索数据的大小 */
	private static final int size = 500000;

	public static void main(String[] args) {

		long[] data = new long[size];

		// 添加测试数据

		for (int k = 0; k < data.length; k++) {

			data[k] = k;
		}
		long target = 3344;

		binaryFindTest(data, target);

	}

	public static void binaryFindTest(long[] data, long target) {

		long start = System.nanoTime();

		int result = binaryFind(data, target);

		long end = System.nanoTime();

		System.out.println("binary search position：" + result);

		System.out.println("binary search time：" + (end - start));

	}

	public static int binaryFind(long[] data, long target) {

		int start = 0;

		int end = data.length - 1;

		while (start <= end) {

			int middleIndex = (start + end) / 2;

			if (target == data[middleIndex]) {

				return middleIndex;

			}

			if (target >= data[middleIndex]) {

				start = middleIndex + 1;

			} else {

				end = middleIndex - 1;

			}

		}

		return -1;

	}

}