package edu.kit.ipd.sdq.cbsm.codegen;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import edu.kit.ipd.sdq.cbsm.repository.ComplexType;
import edu.kit.ipd.sdq.cbsm.repository.Component;
import edu.kit.ipd.sdq.cbsm.repository.DataType;
import edu.kit.ipd.sdq.cbsm.repository.Interface;
import edu.kit.ipd.sdq.cbsm.repository.Parameter;
import edu.kit.ipd.sdq.cbsm.repository.ProvidedRole;
import edu.kit.ipd.sdq.cbsm.repository.Repository;
import edu.kit.ipd.sdq.cbsm.repository.RequiredRole;
import edu.kit.ipd.sdq.cbsm.repository.Signature;
import edu.kit.ipd.sdq.cbsm.repository.SimpleType;
import edu.kit.ipd.sdq.cbsm.repository.SimpleTypeInstance;
import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.StringExtensions;

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
      EList<Component> _components = repository.getComponents();
      final Consumer<Component> _function_2 = (Component component) -> {
        String _name = component.getName();
        String _plus = (_name + "/");
        String _name_1 = component.getName();
        String _plus_1 = (_plus + _name_1);
        String _plus_2 = (_plus_1 + "Impl.java");
        String _name_2 = repository.getName();
        CharSequence _compile = this.compile(component, _name_2);
        fsa.generateFile(_plus_2, _compile);
      };
      _components.forEach(_function_2);
      String _name = repository.getName();
      String _plus = (_name + "/Helper.java");
      CharSequence _compile = this.compile(repository);
      fsa.generateFile(_plus, _compile);
    };
    _filter.forEach(_function);
  }
  
  public CharSequence compile(final Repository repository) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _name = repository.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class Helper {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void assertNull(Object object) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("assert object == null;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void assertNotNull(Object object) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("assert object != null;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Component component, final String repositoryName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _name = component.getName();
    _builder.append(_name, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      TreeSet<String> _uniqueSortedInterfaceNames = this.uniqueSortedInterfaceNames(component);
      for(final String interfaceName : _uniqueSortedInterfaceNames) {
        _builder.append("import ");
        _builder.append(repositoryName, "");
        _builder.append(".");
        _builder.append(interfaceName, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<RequiredRole> _requiredRoles = component.getRequiredRoles();
      boolean _isEmpty = _requiredRoles.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("import ");
        _builder.append(repositoryName, "");
        _builder.append(".Helper;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("public class ");
    String _name_1 = component.getName();
    _builder.append(_name_1, "");
    _builder.append("Impl ");
    {
      EList<ProvidedRole> _providedRoles = component.getProvidedRoles();
      boolean _isEmpty_1 = _providedRoles.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        _builder.append("implements ");
        {
          EList<ProvidedRole> _providedRoles_1 = component.getProvidedRoles();
          boolean _hasElements = false;
          for(final ProvidedRole providedRole : _providedRoles_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            Interface _providedInterface = providedRole.getProvidedInterface();
            String _name_2 = _providedInterface.getName();
            _builder.append(_name_2, "");
          }
        }
        _builder.append(" ");
      }
    }
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<RequiredRole> _requiredRoles_1 = component.getRequiredRoles();
      for(final RequiredRole requiredRole : _requiredRoles_1) {
        _builder.append("\t");
        _builder.append("private ");
        Interface _requiredInterface = requiredRole.getRequiredInterface();
        String _name_3 = _requiredInterface.getName();
        _builder.append(_name_3, "\t");
        _builder.append(" ");
        Interface _requiredInterface_1 = requiredRole.getRequiredInterface();
        String _name_4 = _requiredInterface_1.getName();
        String _firstLower = StringExtensions.toFirstLower(_name_4);
        _builder.append(_firstLower, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      EList<RequiredRole> _requiredRoles_2 = component.getRequiredRoles();
      boolean _hasElements_1 = false;
      for(final RequiredRole requiredRole_1 : _requiredRoles_2) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate("\n", "\t");
        }
        _builder.append("\t");
        _builder.append("public void set");
        Interface _requiredInterface_2 = requiredRole_1.getRequiredInterface();
        String _name_5 = _requiredInterface_2.getName();
        _builder.append(_name_5, "\t");
        _builder.append("(");
        Interface _requiredInterface_3 = requiredRole_1.getRequiredInterface();
        String _name_6 = _requiredInterface_3.getName();
        _builder.append(_name_6, "\t");
        _builder.append(" ");
        Interface _requiredInterface_4 = requiredRole_1.getRequiredInterface();
        String _name_7 = _requiredInterface_4.getName();
        String _firstLower_1 = StringExtensions.toFirstLower(_name_7);
        _builder.append(_firstLower_1, "\t");
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("Helper.assertNull(this.");
        Interface _requiredInterface_5 = requiredRole_1.getRequiredInterface();
        String _name_8 = _requiredInterface_5.getName();
        String _firstLower_2 = StringExtensions.toFirstLower(_name_8);
        _builder.append(_firstLower_2, "\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("this.");
        Interface _requiredInterface_6 = requiredRole_1.getRequiredInterface();
        String _name_9 = _requiredInterface_6.getName();
        String _firstLower_3 = StringExtensions.toFirstLower(_name_9);
        _builder.append(_firstLower_3, "\t\t");
        _builder.append(" = ");
        Interface _requiredInterface_7 = requiredRole_1.getRequiredInterface();
        String _name_10 = _requiredInterface_7.getName();
        String _firstLower_4 = StringExtensions.toFirstLower(_name_10);
        _builder.append(_firstLower_4, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      EList<ProvidedRole> _providedRoles_2 = component.getProvidedRoles();
      LinkedList<Interface> _providedInterfacesAndSignaturesRecursive = this.providedInterfacesAndSignaturesRecursive(_providedRoles_2);
      boolean _hasElements_2 = false;
      for(final Interface providedInterface : _providedInterfacesAndSignaturesRecursive) {
        if (!_hasElements_2) {
          _hasElements_2 = true;
        } else {
          _builder.appendImmediate("\n", "\t");
        }
        {
          EList<Signature> _signatures = providedInterface.getSignatures();
          boolean _hasElements_3 = false;
          for(final Signature signature : _signatures) {
            if (!_hasElements_3) {
              _hasElements_3 = true;
            } else {
              _builder.appendImmediate("\n", "\t");
            }
            _builder.append("\t");
            _builder.append("//Implementing ");
            String _name_11 = signature.getName();
            _builder.append(_name_11, "\t");
            _builder.append(" from interface ");
            String _name_12 = providedInterface.getName();
            _builder.append(_name_12, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("@Override");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("public ");
            CharSequence _compile = this.compile(signature);
            _builder.append(_compile, "\t");
            _builder.append(" {");
            _builder.newLineIfNotEmpty();
            {
              EList<RequiredRole> _requiredRoles_3 = component.getRequiredRoles();
              for(final RequiredRole requiredRole_2 : _requiredRoles_3) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("Helper.assertNotNull(this.");
                Interface _requiredInterface_8 = requiredRole_2.getRequiredInterface();
                String _name_13 = _requiredInterface_8.getName();
                String _firstLower_5 = StringExtensions.toFirstLower(_name_13);
                _builder.append(_firstLower_5, "\t\t");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("// TODO: Insert code here");
            _builder.newLine();
            {
              DataType _returnType = signature.getReturnType();
              boolean _notEquals = (!Objects.equal(_returnType, null));
              if (_notEquals) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("return ");
                DataType _returnType_1 = signature.getReturnType();
                String _defaultReturnValue = this.defaultReturnValue(_returnType_1);
                _builder.append(_defaultReturnValue, "\t\t");
                _builder.append(";");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Removes duplicates from the combined list of provided and required interfaces
   * (an interface might be both provided and required) and sorts the result.
   */
  public TreeSet<String> uniqueSortedInterfaceNames(final Component component) {
    final TreeSet<String> result = new TreeSet<String>();
    EList<ProvidedRole> _providedRoles = component.getProvidedRoles();
    final Consumer<ProvidedRole> _function = (ProvidedRole providedRole) -> {
      Interface _providedInterface = providedRole.getProvidedInterface();
      String _name = _providedInterface.getName();
      result.add(_name);
    };
    _providedRoles.forEach(_function);
    EList<RequiredRole> _requiredRoles = component.getRequiredRoles();
    final Consumer<RequiredRole> _function_1 = (RequiredRole requiredRole) -> {
      Interface _requiredInterface = requiredRole.getRequiredInterface();
      String _name = _requiredInterface.getName();
      result.add(_name);
    };
    _requiredRoles.forEach(_function_1);
    return result;
  }
  
  /**
   * Returns a list with all provided interfaces, considering that provided interfaces
   * might have super-interfaces (transitive closure).
   */
  public LinkedList<Interface> providedInterfacesAndSignaturesRecursive(final Collection<ProvidedRole> providedRoles) {
    final LinkedList<Interface> result = new LinkedList<Interface>();
    final LinkedList<Interface> interfacesToAnalyze = new LinkedList<Interface>();
    final Consumer<ProvidedRole> _function = (ProvidedRole providedRole) -> {
      Interface _providedInterface = providedRole.getProvidedInterface();
      interfacesToAnalyze.add(_providedInterface);
    };
    providedRoles.forEach(_function);
    while ((!interfacesToAnalyze.isEmpty())) {
      {
        final Interface interfac = interfacesToAnalyze.remove();
        boolean _contains = result.contains(interfac);
        boolean _not = (!_contains);
        if (_not) {
          result.add(interfac);
        }
        EList<Interface> _superInterfaces = interfac.getSuperInterfaces();
        Iterables.<Interface>addAll(interfacesToAnalyze, _superInterfaces);
      }
    }
    return result;
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
    _builder.append(" ");
    {
      EList<Interface> _superInterfaces = interfac.getSuperInterfaces();
      boolean _isEmpty = _superInterfaces.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("extends ");
        {
          EList<Interface> _superInterfaces_1 = interfac.getSuperInterfaces();
          boolean _hasElements = false;
          for(final Interface superInterface : _superInterfaces_1) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder.appendImmediate(", ", "");
            }
            String _name_1 = superInterface.getName();
            _builder.append(_name_1, "");
          }
        }
        _builder.append(" ");
      }
    }
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Signature> _signatures = interfac.getSignatures();
      for(final Signature signature : _signatures) {
        _builder.append("\t");
        CharSequence _compile = this.compile(signature);
        _builder.append(_compile, "\t");
        _builder.append(";");
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
    _builder.append(")");
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
                _switchResult = "java.util.List<?>";
                break;
              case LONG:
                _switchResult = "long";
                break;
              case MAP:
                _switchResult = "java.util.Map<?,?>";
                break;
              case STRING:
                _switchResult = "java.lang.String";
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
  
  public String defaultReturnValue(final DataType dataType) {
    String _xifexpression = null;
    boolean _equals = Objects.equal(dataType, null);
    if (_equals) {
      return "";
    } else {
      String _xifexpression_1 = null;
      if ((dataType instanceof ComplexType)) {
        return "null";
      } else {
        String _xifexpression_2 = null;
        if ((dataType instanceof SimpleType)) {
          String _switchResult = null;
          SimpleTypeInstance _typeInstance = ((SimpleType)dataType).getTypeInstance();
          if (_typeInstance != null) {
            switch (_typeInstance) {
              case BOOLEAN:
                _switchResult = "false";
                break;
              case CHAR:
                _switchResult = "0";
                break;
              case DATE:
                _switchResult = "null";
                break;
              case DOUBLE:
                _switchResult = "0.0";
                break;
              case FLOAT:
                _switchResult = "0.0f";
                break;
              case INT:
                _switchResult = "0";
                break;
              case LIST:
                _switchResult = "null";
                break;
              case LONG:
                _switchResult = "0L";
                break;
              case MAP:
                _switchResult = "null";
                break;
              case STRING:
                _switchResult = "null";
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
