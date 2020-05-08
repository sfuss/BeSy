import java.util.*;

public class MemLeak {

	public static void main(String[] args) throws InterruptedException {

		ArrayList<byte[]> list = new ArrayList<byte[]>();

		byte[] array1 = new byte[1024 * 1024]; // Größe von 1 MB

		for (int i = 0; i < 3072; i++) { // 3072 mal > bis 3GB

			list.add(array1);
			Thread.sleep(20);

			if (i % 10 == 0) {
				System.out.println(i+" MB eingefügt; " + "JVM total: " + Runtime.getRuntime().totalMemory() + " MB "
						+ " Free: " + Runtime.getRuntime().freeMemory() + " MB " + " used: "
						+ (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) + " MB");
				System.out.println();
			}

		}

	}

}
