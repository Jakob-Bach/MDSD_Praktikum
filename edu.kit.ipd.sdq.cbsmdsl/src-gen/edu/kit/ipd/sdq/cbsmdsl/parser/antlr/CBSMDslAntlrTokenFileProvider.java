/*
 * generated by Xtext 2.9.2
 */
package edu.kit.ipd.sdq.cbsmdsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CBSMDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("edu/kit/ipd/sdq/cbsmdsl/parser/antlr/internal/InternalCBSMDsl.tokens");
	}
}
