package edu.kit.ipd.sdq.cbsm.codegen;

import com.google.common.collect.Iterables;
import edu.kit.ipd.sdq.cbsm.repository.Interface;
import edu.kit.ipd.sdq.cbsm.repository.Repository;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

@SuppressWarnings("all")
public class CbsmRepositoryCodeGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EcoreUtil.resolveAll(resource);
    EList<EObject> _contents = resource.getContents();
    Iterable<Repository> _filter = Iterables.<Repository>filter(_contents, Repository.class);
    final Consumer<Repository> _function = (Repository repository) -> {
      EList<Interface> _interfaces = repository.getInterfaces();
      final Consumer<Interface> _function_1 = (Interface interfac) -> {
        String _name = interfac.getName();
        String _plus = (_name + ".java");
        CharSequence _compile = this.compile(interfac);
        fsa.generateFile(_plus, _compile);
      };
      _interfaces.forEach(_function_1);
    };
    _filter.forEach(_function);
  }
  
  public CharSequence compile(final Interface interfac) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public interface ");
    String _name = interfac.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
