/*
 * generated by Xtext 2.9.2
 */
package edu.kit.ipd.sdq.cbsmdsl.tests

import com.google.inject.Inject
import edu.kit.ipd.sdq.cbsm.core.ViewType
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(CbsmDslInjectorProvider)
class CbsmDslParsingTest{

	@Inject
	ParseHelper<ViewType> parseHelper;

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
