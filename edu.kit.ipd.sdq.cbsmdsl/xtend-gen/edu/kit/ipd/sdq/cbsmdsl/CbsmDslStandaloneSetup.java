/**
 * generated by Xtext 2.9.2
 */
package edu.kit.ipd.sdq.cbsmdsl;

import edu.kit.ipd.sdq.cbsmdsl.CbsmDslStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class CbsmDslStandaloneSetup extends CbsmDslStandaloneSetupGenerated {
  public static void doSetup() {
    CbsmDslStandaloneSetup _cbsmDslStandaloneSetup = new CbsmDslStandaloneSetup();
    _cbsmDslStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
