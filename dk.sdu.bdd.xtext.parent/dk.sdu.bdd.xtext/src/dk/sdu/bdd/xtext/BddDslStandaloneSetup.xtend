/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.bdd.xtext


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class BddDslStandaloneSetup extends BddDslStandaloneSetupGenerated {

	def static void doSetup() {
		new BddDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
