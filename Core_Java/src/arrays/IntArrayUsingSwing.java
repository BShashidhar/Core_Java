package arrays;

import javax.swing.JOptionPane;

public class IntArrayUsingSwing {
	public static void main(String[] args) {
		selectFunc();
	}

	private static void selectFunc() {
		int[] intarr = new int[10];
		int ch = 0;
		do {
			String menu = JOptionPane.showInputDialog(
					"enter your choice:\n 1. add \n 2. delete" + "\n 3. modify \n 4. view all \n 0. exit");
			int input = 0;
			try {
				if (menu != null) {
					input = Integer.parseInt(menu);
				} else {
					return;
				}
			} catch (NumberFormatException e) {
				System.out.println("invalid data");
			}
			switch (input) {
			case 1:
				add(intarr);
				break;
			case 2:
				delete(intarr);
				break;
			case 3:
				modify(intarr);
				break;
			case 4:
				viewall(intarr);
				break;
			case 0:
				ch = 1;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalid data entered");
			}
		} while (ch == 0);
	}

	private static void viewall(int[] intarr) {
		for (int j = 0; j < intarr.length; j++) {
			System.out.println(intarr[j]);
		}
		return;
	}

	private static void modify(int[] intarr) {
		String num = JOptionPane.showInputDialog("enter number to be replaced");
		int i = 0;
		try {
			if (num != null) {
				i = Integer.parseInt(num);
			} else {
				return;
			}
		} catch (NumberFormatException e) {
			System.out.println("invalid data");
		}
		int j = 0;
		for (int k = 0; k < intarr.length; k++) {
			if (intarr[k] == i) {
				num = JOptionPane.showInputDialog("enter new number");
				try {
					if (num != null) {
						j = Integer.parseInt(num);
					} else {
						return;
					}
				} catch (NumberFormatException e) {
					System.out.println("invalid data");
				}
				for (int y = 0; y < intarr.length; y++) {
					if (intarr[y] == j) {
						System.out.println("element already exits");
						return;
					}
				}
				intarr[k] = j;
				return;
			}
		}
		System.out.println("element does not exists");
		return;
	}

	private static void delete(int[] intarr) {
		String num = JOptionPane.showInputDialog("enter number to be deleted from  array");
		int i = 0;
		try {
			if (num != null) {
				i = Integer.parseInt(num);
			} else {
				return;
			}
		} catch (NumberFormatException e) {
			System.out.println("invalid data");
			// e.printStackTrace();
		}
		for (int j = 0; j < intarr.length; j++) {
			if (intarr[j] == i) {
				intarr[j] = 0;
				return;
			}
		}
	}

	private static void add(int[] intarr) {
		String num = JOptionPane.showInputDialog("enter number to insert in array");
		int i = 0;
		try {
			if (num != null) {
				i = Integer.parseInt(num);
			} else {
				return;
			}
		} catch (NumberFormatException e) {
			System.out.println("invalid data");
			// e.printStackTrace();
		}
		for (int j = 0; j < intarr.length; j++) {
			if (intarr[j] == 0) {
				intarr[j] = i;
				return;
			}
		}
	}
}
