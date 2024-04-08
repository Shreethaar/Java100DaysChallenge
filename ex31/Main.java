// Write a Java program to check whether Java is installed on your computer.

public class Main {
	public static void main(String[] args) {
		String javaVersion = System.getProperty("java.version");
		String javaRunTime = System.getProperty("java.runtime.version");
		String javaHome = System.getProperty("java.home");
		String javaVendor = System.getProperty("java.vendor");
		String javaVendorURL = System.getProperty("java.vendor.url");
		String javaClassPath = System.getProperty("java.class.path");

		System.out.printf("Java Version: %s\n",javaVersion);
		System.out.printf("Java Runtime Version: %s\n",javaRunTime);
		System.out.printf("Java Home: %s\n",javaHome);
		System.out.printf("Java Vendor: %s\n",javaVendor);
		System.out.printf("Java Vendor URL: %s\n",javaVendorURL);
		System.out.printf("Java Class Path: %s\n",javaClassPath);

	}
}
