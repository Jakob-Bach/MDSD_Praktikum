/**
 * generated by Xtext 2.9.2
 */
package edu.kit.ipd.sdq.cbsmdsl.tests;

import com.google.inject.Inject;
import edu.kit.ipd.sdq.cbsm.core.ViewType;
import edu.kit.ipd.sdq.cbsmdsl.tests.CbsmDslInjectorProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(CbsmDslInjectorProvider.class)
@SuppressWarnings("all")
public class CbsmDslParsingTest {
  @Inject
  private ParseHelper<ViewType> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final ViewType result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
