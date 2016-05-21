/*
 * generated by Xtext 2.9.2
 */
package edu.kit.ipd.sdq.cbsmdsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractCBSMDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://sdq.ipd.kit.edu/componentBasedSystemModel/architecture"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://sdq.ipd.kit.edu/componentBasedSystemModel/repository"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://sdq.ipd.kit.edu/componentBasedSystemModel/assembly"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://sdq.ipd.kit.edu/componentBasedSystemModel/repository/behavior"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://sdq.ipd.kit.edu/componentBasedSystemModel/environment"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://sdq.ipd.kit.edu/componentBasedSystemModel/allocation"));
		return result;
	}
	
}
