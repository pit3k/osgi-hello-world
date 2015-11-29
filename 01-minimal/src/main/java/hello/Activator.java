package hello;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Hello!");
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Bye...");
	}

}
