/*
 * generated by Xtext
 */
package edu.kit.ipd.sdq.cbsmdsl.ui.internal;

import com.google.common.collect.Maps;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import edu.kit.ipd.sdq.cbsmdsl.CbsmDslRuntimeModule;
import edu.kit.ipd.sdq.cbsmdsl.ui.CbsmDslUiModule;
import java.util.Collections;
import java.util.Map;
import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.osgi.framework.BundleContext;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CbsmdslActivator extends AbstractUIPlugin {

	public static final String EDU_KIT_IPD_SDQ_CBSMDSL_CBSMDSL = "edu.kit.ipd.sdq.cbsmdsl.CbsmDsl";
	
	private static final Logger logger = Logger.getLogger(CbsmdslActivator.class);
	
	private static CbsmdslActivator INSTANCE;
	
	private Map<String, Injector> injectors = Collections.synchronizedMap(Maps.<String, Injector> newHashMapWithExpectedSize(1));
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		injectors.clear();
		INSTANCE = null;
		super.stop(context);
	}
	
	public static CbsmdslActivator getInstance() {
		return INSTANCE;
	}
	
	public Injector getInjector(String language) {
		synchronized (injectors) {
			Injector injector = injectors.get(language);
			if (injector == null) {
				injectors.put(language, injector = createInjector(language));
			}
			return injector;
		}
	}
	
	protected Injector createInjector(String language) {
		try {
			Module runtimeModule = getRuntimeModule(language);
			Module sharedStateModule = getSharedStateModule();
			Module uiModule = getUiModule(language);
			Module mergedModule = Modules2.mixin(runtimeModule, sharedStateModule, uiModule);
			return Guice.createInjector(mergedModule);
		} catch (Exception e) {
			logger.error("Failed to create injector for " + language);
			logger.error(e.getMessage(), e);
			throw new RuntimeException("Failed to create injector for " + language, e);
		}
	}
	
	protected Module getRuntimeModule(String grammar) {
		if (EDU_KIT_IPD_SDQ_CBSMDSL_CBSMDSL.equals(grammar)) {
			return new CbsmDslRuntimeModule();
		}
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getUiModule(String grammar) {
		if (EDU_KIT_IPD_SDQ_CBSMDSL_CBSMDSL.equals(grammar)) {
			return new CbsmDslUiModule(this);
		}
		throw new IllegalArgumentException(grammar);
	}
	
	protected Module getSharedStateModule() {
		return new SharedStateModule();
	}
	
}
