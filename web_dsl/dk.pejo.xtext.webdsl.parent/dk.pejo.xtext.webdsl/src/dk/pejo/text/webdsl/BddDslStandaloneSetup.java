/*
 * generated by Xtext 2.25.0
 */
package dk.pejo.text.webdsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class BddDslStandaloneSetup extends BddDslStandaloneSetupGenerated {

	public static void doSetup() {
		new BddDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
