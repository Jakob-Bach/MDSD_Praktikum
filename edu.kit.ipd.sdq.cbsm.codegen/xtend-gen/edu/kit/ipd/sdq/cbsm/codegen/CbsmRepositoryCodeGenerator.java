package edu.kit.ipd.sdq.cbsm.codegen;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import edu.kit.ipd.sdq.cbsm.repository.ComplexType;
import edu.kit.ipd.sdq.cbsm.repository.Component;
import edu.kit.ipd.sdq.cbsm.repository.DataType;
import edu.kit.ipd.sdq.cbsm.repository.Interface;
import edu.kit.ipd.sdq.cbsm.repository.Parameter;
import edu.kit.ipd.sdq.cbsm.repository.Repository;
import edu.kit.ipd.sdq.cbsm.repository.Signature;
import edu.kit.ipd.sdq.cbsm.repository.SimpleType;
import edu.kit.ipd.sdq.cbsm.repository.SimpleTypeInstance;
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
        String _name = repository.getName();
        String _plus = (_name + "/");
        String _name_1 = interfac.getName();
        String _plus_1 = (_plus + _name_1);
        String _plus_2 = (_plus_1 + ".java");
        String _name_2 = repository.getName();
        CharSequence _compile = this.compile(interfac, _name_2);
        fsa.generateFile(_plus_2, _compile);
      };
      _interfaces.forEach(_function_1);
    };
    _filter.forEach(_function);
  }
  
  public CharSequence compile(final Component component) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Interface interfac, final String repositoryName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(repositoryName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public interface ");
    String _name = interfac.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Signature> _signatures = interfac.getSignatures();
      for(final Signature signature : _signatures) {
        _builder.append("\t");
        CharSequence _compile = this.compile(signature);
        _builder.append(_compile, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Signature signature) {
    StringConcatenation _builder = new StringConcatenation();
    DataType _returnType = signature.getReturnType();
    String _compile = this.compile(_returnType);
    _builder.append(_compile, "");
    _builder.append(" ");
    String _name = signature.getName();
    _builder.append(_name, "");
    _builder.append("(");
    {
      EList<Parameter> _parameters = signature.getParameters();
      boolean _hasElements = false;
      for(final Parameter parameter : _parameters) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        CharSequence _compile_1 = this.compile(parameter);
        _builder.append(_compile_1, "");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Parameter parameter) {
    StringConcatenation _builder = new StringConcatenation();
    DataType _type = parameter.getType();
    String _compile = this.compile(_type);
    _builder.append(_compile, "");
    _builder.append(" ");
    String _name = parameter.getName();
    _builder.append(_name, "");
    return _builder;
  }
  
  public String compile(final DataType dataType) {
    String _xifexpression = null;
    boolean _equals = Objects.equal(dataType, null);
    if (_equals) {
      return "void";
    } else {
      String _xifexpression_1 = null;
      if ((dataType instanceof ComplexType)) {
        return "Object";
      } else {
        String _xifexpression_2 = null;
        if ((dataType instanceof SimpleType)) {
          String _switchResult = null;
          SimpleTypeInstance _typeInstance = ((SimpleType)dataType).getTypeInstance();
          if (_typeInstance != null) {
            switch (_typeInstance) {
              case BOOLEAN:
                _switchResult = "boolean";
                break;
              case CHAR:
                _switchResult = "char";
                break;
              case DATE:
                _switchResult = "java.util.Date";
                break;
              case DOUBLE:
                _switchResult = "double";
                break;
              case FLOAT:
                _switchResult = "float";
                break;
              case INT:
                _switchResult = "int";
                break;
              case LIST:
                _switchResult = "java.util.List";
                break;
              case LONG:
                _switchResult = "long";
                break;
              case MAP:
                _switchResult = "java.util.Map";
                break;
              case STRING:
                _switchResult = "String";
                break;
              default:
                break;
            }
          }
          _xifexpression_2 = _switchResult;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
}
