package logic_program;

import java.util.Arrays;

public class Zoho_prgm_Version {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String v = "10.11.112";
		String v1 = "10.121.221";

		String[] version = v.split("\\.");

		String[] New = v1.split("\\.");

		System.out.println(version.length);

		System.out.println(New.length);

		int[] currentVersion = new int[version.length];
		for (int i = 0; i < version.length; i++) {
			String numberAsString = version[i];
			currentVersion[i] = Integer.parseInt(numberAsString);

		}

		int[] newVersion = new int[New.length];
		for (int i = 0; i < New.length; i++) {
			String numberAsString = New[i];
			newVersion[i] = Integer.parseInt(numberAsString);

		}

		if (version.length == New.length) {

			System.out.println("Current Version are :" + Arrays.toString(currentVersion));
			System.out.println("Given New Version are:" + Arrays.toString(newVersion));

			if (currentVersion[0] > newVersion[0]) {

				System.out.println("Given Version1 is lower Version");

			}

			else if (currentVersion[0] == newVersion[0]) {

				if (((currentVersion[1] == newVersion[1])) && ((currentVersion[2] == newVersion[2]))) {
					System.out.println("Both Version are Equal");
				} else if ((currentVersion[1] > newVersion[1])) {
					System.out.println(" Given is Lower Version");
				} else {

					System.out.println("Given is Upgraded Version");
				}
			}

			else if (newVersion[0] > currentVersion[0]) {

				System.out.println("Given Version1 is Higher  Version");

			}

		} else {

			System.out.println("Current Version are :" + Arrays.toString(currentVersion));
			System.out.println("Given New Version are:" + Arrays.toString(newVersion));

			System.out.println("Please Check the given version");
		}

	}

}
