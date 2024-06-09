package org.xtext.example.generator;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.example.myDsl.Argument1;
import org.xtext.example.myDsl.Array;
import org.xtext.example.myDsl.Build;
import org.xtext.example.myDsl.ClassD;
import org.xtext.example.myDsl.ClassSelector;
import org.xtext.example.myDsl.ClassVariable;
import org.xtext.example.myDsl.Col;
import org.xtext.example.myDsl.Colspan;
import org.xtext.example.myDsl.Condition1;
import org.xtext.example.myDsl.Conditional;
import org.xtext.example.myDsl.CssValue;
import org.xtext.example.myDsl.Data;
import org.xtext.example.myDsl.Declaration;
import org.xtext.example.myDsl.DivFunction;
import org.xtext.example.myDsl.Document;
import org.xtext.example.myDsl.ElementBuild;
import org.xtext.example.myDsl.ElementPage;
import org.xtext.example.myDsl.ElementRow;
import org.xtext.example.myDsl.ElseCondition;
import org.xtext.example.myDsl.For;
import org.xtext.example.myDsl.Function;
import org.xtext.example.myDsl.Fusion;
import org.xtext.example.myDsl.IDSelector;
import org.xtext.example.myDsl.IfCondition;
import org.xtext.example.myDsl.Img;
import org.xtext.example.myDsl.KeyValue;
import org.xtext.example.myDsl.Loop;
import org.xtext.example.myDsl.NestedObject;
import org.xtext.example.myDsl.OtherElement;
import org.xtext.example.myDsl.Page;
import org.xtext.example.myDsl.Part;
import org.xtext.example.myDsl.ProdFunction;
import org.xtext.example.myDsl.Row;
import org.xtext.example.myDsl.Rowspan;
import org.xtext.example.myDsl.Rule;
import org.xtext.example.myDsl.Style;
import org.xtext.example.myDsl.SumFunction;
import org.xtext.example.myDsl.SuperVariable;
import org.xtext.example.myDsl.Title;
import org.xtext.example.myDsl.Value;
import org.xtext.example.myDsl.Variable;
import org.xtext.example.myDsl.With;

@SuppressWarnings("all")
public class HtmlCodeGenerator {
  private Context context1;

  public HtmlCodeGenerator(final Context context) {
    this.context1 = context;
  }

  public String generate(final Document document, final String fileName) {
    final StringBuilder cssCode = this.extractCssFromDocument(document.getStyle());
    final StringBuilder buildCode = this.buildDocument(document);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html lang=\"en\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("<meta charset=\"UTF-8\">");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("<title>");
    String _plus = (_builder.toString() + fileName);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("</title>");
    _builder_1.newLine();
    _builder_1.append("                ");
    _builder_1.append("<style>");
    String _plus_1 = (_plus + _builder_1);
    String _plus_2 = (_plus_1 + cssCode);
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("</style>");
    _builder_2.newLine();
    _builder_2.append("\t\t\t");
    _builder_2.append("</head>");
    _builder_2.newLine();
    _builder_2.append("\t\t\t");
    _builder_2.append("<body>");
    _builder_2.newLine();
    String _plus_3 = (_plus_2 + _builder_2);
    String _plus_4 = (_plus_3 + buildCode);
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("\t");
    _builder_3.append("</body>");
    _builder_3.newLine();
    _builder_3.append("</html>");
    return (_plus_4 + _builder_3);
  }

  public Object getValueOfVariableInData(final String variable, final Data data) {
    EList<KeyValue> _keyValue = data.getKeyValue();
    for (final KeyValue keyValue : _keyValue) {
      String _string = keyValue.getString().toString();
      String _string_1 = variable.toString();
      boolean _equals = Objects.equal(_string, _string_1);
      if (_equals) {
        String _string_2 = keyValue.getValue().getString();
        boolean _tripleNotEquals = (_string_2 != null);
        if (_tripleNotEquals) {
          return keyValue.getValue().getString();
        } else {
          if (((keyValue.getValue().getInteger() != 0) || (keyValue.getValue().getInteger() == 0))) {
            return Integer.valueOf(keyValue.getValue().getInteger());
          } else {
            String _trueV = keyValue.getValue().getTrueV();
            boolean _tripleNotEquals_1 = (_trueV != null);
            if (_tripleNotEquals_1) {
              return Boolean.valueOf(true);
            } else {
              String _falseV = keyValue.getValue().getFalseV();
              boolean _tripleNotEquals_2 = (_falseV != null);
              if (_tripleNotEquals_2) {
                return Boolean.valueOf(false);
              } else {
                return variable;
              }
            }
          }
        }
      }
    }
    return null;
  }

  public Object getValueOfVariableInObject(final Value object, final String variableName, final int position) {
    NestedObject _nestedObject = object.getNestedObject();
    if ((_nestedObject instanceof NestedObject)) {
      EList<KeyValue> _keyValue = object.getNestedObject().getKeyValue();
      for (final KeyValue keyValue : _keyValue) {
        String _string = keyValue.getString();
        boolean _equals = Objects.equal(_string, variableName);
        if (_equals) {
          Value _value = keyValue.getValue();
          boolean _tripleNotEquals = (_value != null);
          if (_tripleNotEquals) {
            String _string_1 = keyValue.getValue().getString();
            boolean _tripleNotEquals_1 = (_string_1 != null);
            if (_tripleNotEquals_1) {
              return keyValue.getValue().getString();
            } else {
              Array _array = keyValue.getValue().getArray();
              boolean _tripleNotEquals_2 = (_array != null);
              if (_tripleNotEquals_2) {
                int p = 0;
                EList<Value> _values = keyValue.getValue().getArray().getValues();
                for (final Value value : _values) {
                  {
                    if ((p == position)) {
                      String _string_2 = value.getString();
                      boolean _tripleNotEquals_3 = (_string_2 != null);
                      if (_tripleNotEquals_3) {
                        return value.getString();
                      } else {
                        if (((value.getInteger() != 0) || (value.getInteger() == 0))) {
                          return Integer.valueOf(value.getInteger());
                        } else {
                          String _string_3 = value.getTrueV().toString();
                          boolean _tripleNotEquals_4 = (_string_3 != null);
                          if (_tripleNotEquals_4) {
                            return "true";
                          } else {
                            String _string_4 = value.getFalseV().toString();
                            boolean _tripleNotEquals_5 = (_string_4 != null);
                            if (_tripleNotEquals_5) {
                              return "false";
                            } else {
                              return "null";
                            }
                          }
                        }
                      }
                    }
                    p = (p + 1);
                  }
                }
              } else {
                if (((keyValue.getValue().getInteger() != 0) || (keyValue.getValue().getInteger() == 0))) {
                  return Integer.valueOf(keyValue.getValue().getInteger());
                } else {
                  return null;
                }
              }
            }
          }
        }
      }
    }
    return null;
  }

  public Object getValueOfVariableInArray(final Array array, final int position, final Data data) {
    int p = 0;
    EList<Value> _values = array.getValues();
    for (final Value value : _values) {
      {
        if ((p == position)) {
          String _string = value.getString();
          boolean _tripleNotEquals = (_string != null);
          if (_tripleNotEquals) {
            return value.getString();
          } else {
            if (((value.getInteger() != 0) || (value.getInteger() == 0))) {
              return Integer.valueOf(value.getInteger());
            } else {
              String _string_1 = value.getTrueV().toString();
              boolean _tripleNotEquals_1 = (_string_1 != null);
              if (_tripleNotEquals_1) {
                return "true";
              } else {
                String _string_2 = value.getFalseV().toString();
                boolean _tripleNotEquals_2 = (_string_2 != null);
                if (_tripleNotEquals_2) {
                  return "false";
                } else {
                  return null;
                }
              }
            }
          }
        }
        p = (p + 1);
      }
    }
    return null;
  }

  public int getLengthForArray(final String variable, final Data data) {
    int p = 0;
    EList<KeyValue> _keyValue = data.getKeyValue();
    for (final KeyValue keyValue : _keyValue) {
      String _string = keyValue.getString().toString();
      String _string_1 = variable.toString();
      boolean _equals = Objects.equal(_string, _string_1);
      if (_equals) {
        EList<Value> _values = keyValue.getValue().getArray().getValues();
        for (final Value value : _values) {
          p = (p + 1);
        }
      }
    }
    return p;
  }

  public int getLengthForArrayInObject(final Value object, final String nameOfArray) {
    NestedObject _nestedObject = object.getNestedObject();
    if ((_nestedObject instanceof NestedObject)) {
      int p = 0;
      EList<KeyValue> _keyValue = object.getNestedObject().getKeyValue();
      for (final KeyValue keyValue : _keyValue) {
        String _string = keyValue.getString().toString();
        boolean _equals = Objects.equal(_string, nameOfArray);
        if (_equals) {
          EList<Value> _values = keyValue.getValue().getArray().getValues();
          for (final Value value : _values) {
            p++;
          }
        }
      }
      return p;
    }
    return 0;
  }

  public int numberOfArgumentsOfAFunction(final Function function) {
    int nbr = 0;
    if (((function.getSumFunction() != null) && (function.getSumFunction().getArgument1() != null))) {
      EList<Argument1> _argument1 = function.getSumFunction().getArgument1();
      for (final Argument1 argument : _argument1) {
        nbr++;
      }
    } else {
      if (((function.getProdFunction() != null) && (function.getProdFunction().getArgument1() != null))) {
        EList<Argument1> _argument1_1 = function.getProdFunction().getArgument1();
        for (final Argument1 argument_1 : _argument1_1) {
          nbr++;
        }
      } else {
        if (((function.getDivFunction() != null) && (function.getDivFunction().getArgument1() != null))) {
          EList<Argument1> _argument1_2 = function.getDivFunction().getArgument1();
          for (final Argument1 argument_2 : _argument1_2) {
            nbr++;
          }
        }
      }
    }
    return nbr;
  }

  public double sumElementsInArray(final Array array) {
    double total = 0.0;
    EList<Value> _values = array.getValues();
    for (final Value value : _values) {
      if (((value.getInteger() != 0) || (value.getInteger() == 0))) {
        double _tal = total;
        int _integer = value.getInteger();
        total = (_tal + _integer);
      }
    }
    return total;
  }

  public double prodElementsInArray(final Array array) {
    double total = 1.0;
    EList<Value> _values = array.getValues();
    for (final Value value : _values) {
      if (((value.getInteger() != 0) || (value.getInteger() == 0))) {
        double _tal = total;
        int _integer = value.getInteger();
        total = (_tal * _integer);
      }
    }
    return total;
  }

  public Object prodAllElementInArgument(final ProdFunction prodFunction, final Data data, final int position) {
    double total = 1.0;
    EList<Argument1> _argument1 = prodFunction.getArgument1();
    boolean _tripleNotEquals = (_argument1 != null);
    if (_tripleNotEquals) {
      EList<Argument1> _argument1_1 = prodFunction.getArgument1();
      for (final Argument1 argument : _argument1_1) {
        String _string = argument.getString();
        boolean _tripleNotEquals_1 = (_string != null);
        if (_tripleNotEquals_1) {
          return argument.getString();
        } else {
          Variable _variable = argument.getVariable();
          boolean _tripleNotEquals_2 = (_variable != null);
          if (_tripleNotEquals_2) {
            if (((argument.getArrayC() == null) && (argument.getObjectC() != null))) {
              Object _variable_1 = this.context1.getVariable(argument.getVariable().getName());
              Value object = ((Value) _variable_1);
              Object v = this.getValueOfVariableInObject(object, argument.getVariable().getName(), (-1));
              if ((v == null)) {
                Array _arrayInObject = this.getArrayInObject(object, argument.getObjectC().getName());
                Array array = ((Array) _arrayInObject);
                v = Double.valueOf(this.prodElementsInArray(array));
              }
              if ((v instanceof Integer)) {
                double _tal = total;
                total = (_tal * ((Integer) v).intValue());
              } else {
                if ((v instanceof Float)) {
                  double _tal_1 = total;
                  total = (_tal_1 * ((Float) v).floatValue());
                } else {
                  return v;
                }
              }
            } else {
              if (((argument.getArrayC() != null) && (argument.getObjectC() != null))) {
                Object _variable_2 = this.context1.getVariable(argument.getVariable().getName());
                Value object_1 = ((Value) _variable_2);
                Variable _variable_3 = argument.getArrayC().getPosition().getVariable();
                boolean _tripleNotEquals_3 = (_variable_3 != null);
                if (_tripleNotEquals_3) {
                  Object _variable_4 = this.context1.getVariable(argument.getArrayC().getPosition().getVariable().getName());
                  Object v_1 = this.getValueOfVariableInObject(object_1, argument.getObjectC().getName(), (((Integer) _variable_4)).intValue());
                  if ((v_1 instanceof Integer)) {
                    double _tal_2 = total;
                    total = (_tal_2 * ((Integer) v_1).intValue());
                  } else {
                    if ((v_1 instanceof Float)) {
                      double _tal_3 = total;
                      total = (_tal_3 * ((Float) v_1).floatValue());
                    } else {
                      return v_1;
                    }
                  }
                } else {
                  Object v_2 = this.getValueOfVariableInObject(object_1, argument.getObjectC().getName(), argument.getArrayC().getPosition().getInteger());
                  if ((v_2 instanceof Integer)) {
                    double _tal_4 = total;
                    total = (_tal_4 * ((Integer) v_2).intValue());
                  } else {
                    if ((v_2 instanceof Float)) {
                      double _tal_5 = total;
                      total = (_tal_5 * ((Float) v_2).floatValue());
                    } else {
                      return v_2;
                    }
                  }
                }
              } else {
                if ((((argument.getArrayC() != null) && (argument.getArrayC().getPosition() != null)) && (argument.getObjectC() == null))) {
                  Variable _variable_5 = argument.getArrayC().getPosition().getVariable();
                  boolean _tripleNotEquals_4 = (_variable_5 != null);
                  if (_tripleNotEquals_4) {
                    Object v_3 = this.getValueOfVariableInArray(this.getArrayInData(argument.getVariable().getName(), data), position, data);
                    if ((v_3 instanceof Integer)) {
                      double _tal_6 = total;
                      total = (_tal_6 * ((Integer) v_3).intValue());
                    } else {
                      if ((v_3 instanceof Float)) {
                        double _tal_7 = total;
                        total = (_tal_7 * ((Float) v_3).floatValue());
                      } else {
                        return v_3;
                      }
                    }
                  } else {
                    Object v_4 = this.getValueOfVariableInArray(this.getArrayInData(argument.getVariable().getName(), data), argument.getArrayC().getPosition().getInteger(), data);
                    if ((v_4 instanceof Integer)) {
                      double _tal_8 = total;
                      total = (_tal_8 * ((Integer) v_4).intValue());
                    } else {
                      if ((v_4 instanceof Float)) {
                        double _tal_9 = total;
                        total = (_tal_9 * ((Float) v_4).floatValue());
                      } else {
                        return v_4;
                      }
                    }
                  }
                } else {
                  Object v_5 = this.getValueOfVariableInData(argument.getVariable().getName(), data);
                  if ((v_5 instanceof Integer)) {
                    double _tal_10 = total;
                    total = (_tal_10 * ((Integer) v_5).intValue());
                  } else {
                    if ((v_5 instanceof Float)) {
                      double _tal_11 = total;
                      total = (_tal_11 * ((Float) v_5).floatValue());
                    } else {
                      return v_5;
                    }
                  }
                }
              }
            }
          } else {
            if (((argument.getInteger() != 0) || (argument.getInteger() == 0))) {
              double _tal_12 = total;
              int _integer = argument.getInteger();
              total = (_tal_12 * _integer);
            }
          }
        }
      }
    }
    return Double.valueOf(total);
  }

  public Object sumAllElementInArgument(final SumFunction sumFunction, final Data data, final int position) {
    double total = 0.0;
    EList<Argument1> _argument1 = sumFunction.getArgument1();
    boolean _tripleNotEquals = (_argument1 != null);
    if (_tripleNotEquals) {
      EList<Argument1> _argument1_1 = sumFunction.getArgument1();
      for (final Argument1 argument : _argument1_1) {
        String _string = argument.getString();
        boolean _tripleNotEquals_1 = (_string != null);
        if (_tripleNotEquals_1) {
          return argument.getString();
        } else {
          Variable _variable = argument.getVariable();
          boolean _tripleNotEquals_2 = (_variable != null);
          if (_tripleNotEquals_2) {
            if (((argument.getArrayC() == null) && (argument.getObjectC() != null))) {
              Object _variable_1 = this.context1.getVariable(argument.getVariable().getName());
              Value object = ((Value) _variable_1);
              Object v = this.getValueOfVariableInObject(object, argument.getVariable().getName(), (-1));
              if ((v == null)) {
                Array _arrayInObject = this.getArrayInObject(object, argument.getObjectC().getName());
                Array array = ((Array) _arrayInObject);
                v = Double.valueOf(this.sumElementsInArray(array));
              }
              if ((v instanceof Integer)) {
                double _tal = total;
                total = (_tal + ((Integer) v).intValue());
              } else {
                if ((v instanceof Float)) {
                  double _tal_1 = total;
                  total = (_tal_1 + ((Float) v).floatValue());
                } else {
                  return v;
                }
              }
            } else {
              if (((argument.getArrayC() != null) && (argument.getObjectC() != null))) {
                Object _variable_2 = this.context1.getVariable(argument.getVariable().getName());
                Value object_1 = ((Value) _variable_2);
                Variable _variable_3 = argument.getArrayC().getPosition().getVariable();
                boolean _tripleNotEquals_3 = (_variable_3 != null);
                if (_tripleNotEquals_3) {
                  Object _variable_4 = this.context1.getVariable(argument.getArrayC().getPosition().getVariable().getName());
                  Object v_1 = this.getValueOfVariableInObject(object_1, argument.getObjectC().getName(), (((Integer) _variable_4)).intValue());
                  if ((v_1 instanceof Integer)) {
                    double _tal_2 = total;
                    total = (_tal_2 + ((Integer) v_1).intValue());
                  } else {
                    if ((v_1 instanceof Float)) {
                      double _tal_3 = total;
                      total = (_tal_3 + ((Float) v_1).floatValue());
                    } else {
                      return v_1;
                    }
                  }
                } else {
                  Object v_2 = this.getValueOfVariableInObject(object_1, argument.getObjectC().getName(), argument.getArrayC().getPosition().getInteger());
                  if ((v_2 instanceof Integer)) {
                    double _tal_4 = total;
                    total = (_tal_4 + ((Integer) v_2).intValue());
                  } else {
                    if ((v_2 instanceof Float)) {
                      double _tal_5 = total;
                      total = (_tal_5 + ((Float) v_2).floatValue());
                    } else {
                      return v_2;
                    }
                  }
                }
              } else {
                if ((((argument.getArrayC() != null) && (argument.getArrayC().getPosition() != null)) && (argument.getObjectC() == null))) {
                  Variable _variable_5 = argument.getArrayC().getPosition().getVariable();
                  boolean _tripleNotEquals_4 = (_variable_5 != null);
                  if (_tripleNotEquals_4) {
                    Object v_3 = this.getValueOfVariableInArray(this.getArrayInData(argument.getVariable().getName(), data), position, data);
                    if ((v_3 instanceof Integer)) {
                      double _tal_6 = total;
                      total = (_tal_6 + ((Integer) v_3).intValue());
                    } else {
                      if ((v_3 instanceof Float)) {
                        double _tal_7 = total;
                        total = (_tal_7 + ((Float) v_3).floatValue());
                      } else {
                        return v_3;
                      }
                    }
                  } else {
                    Object v_4 = this.getValueOfVariableInArray(this.getArrayInData(argument.getVariable().getName(), data), argument.getArrayC().getPosition().getInteger(), data);
                    if ((v_4 instanceof Integer)) {
                      double _tal_8 = total;
                      total = (_tal_8 + ((Integer) v_4).intValue());
                    } else {
                      if ((v_4 instanceof Float)) {
                        double _tal_9 = total;
                        total = (_tal_9 + ((Float) v_4).floatValue());
                      } else {
                        return v_4;
                      }
                    }
                  }
                } else {
                  Object v_5 = this.getValueOfVariableInData(argument.getVariable().getName(), data);
                  if ((v_5 instanceof Integer)) {
                    double _tal_10 = total;
                    total = (_tal_10 + ((Integer) v_5).intValue());
                  } else {
                    if ((v_5 instanceof Float)) {
                      double _tal_11 = total;
                      total = (_tal_11 + ((Float) v_5).floatValue());
                    } else {
                      return v_5;
                    }
                  }
                }
              }
            }
          } else {
            if (((argument.getInteger() != 0) || (argument.getInteger() == 0))) {
              double _tal_12 = total;
              int _integer = argument.getInteger();
              total = (_tal_12 + _integer);
            }
          }
        }
      }
    }
    return Double.valueOf(total);
  }

  public String div2Arguments(final DivFunction divFunction, final Data data, final int position) {
    int i = 1;
    EList<Argument1> _argument1 = divFunction.getArgument1();
    boolean _tripleNotEquals = (_argument1 != null);
    if (_tripleNotEquals) {
      double valueOfFirstArgument = 0.0;
      EList<Argument1> _argument1_1 = divFunction.getArgument1();
      for (final Argument1 argument : _argument1_1) {
        {
          if ((i == 1)) {
            Object v1 = this.getArgument1ForDivFunction(argument, position, data);
            if ((v1 instanceof Integer)) {
              valueOfFirstArgument = ((Integer) v1).intValue();
            }
          }
          if ((i == 2)) {
            Object v2 = this.getArgument1ForDivFunction(argument, position, data);
            if ((v2 instanceof Integer)) {
              return String.format("%.2f", Double.valueOf((valueOfFirstArgument / ((Integer) v2).intValue())));
            }
          }
          i++;
        }
      }
    }
    return null;
  }

  public Object getArgument1ForDivFunction(final Argument1 argument, final int position, final Data data) {
    String _string = argument.getString();
    boolean _tripleNotEquals = (_string != null);
    if (_tripleNotEquals) {
      return argument.getString();
    } else {
      Variable _variable = argument.getVariable();
      boolean _tripleNotEquals_1 = (_variable != null);
      if (_tripleNotEquals_1) {
        if (((argument.getArrayC() != null) && (argument.getArrayC().getPosition() != null))) {
          Variable _variable_1 = argument.getArrayC().getPosition().getVariable();
          boolean _tripleNotEquals_2 = (_variable_1 != null);
          if (_tripleNotEquals_2) {
            Object v = this.getValueOfVariableInArray(this.getArrayInData(argument.getVariable().getName(), data), position, data);
            return v;
          } else {
            Object v_1 = this.getValueOfVariableInArray(this.getArrayInData(argument.getVariable().getName(), data), argument.getArrayC().getPosition().getInteger(), data);
            return v_1;
          }
        } else {
          Object v_2 = this.getValueOfVariableInData(argument.getVariable().getName(), data);
          return v_2;
        }
      } else {
        if (((argument.getInteger() != 0) || (argument.getInteger() == 0))) {
          return Integer.valueOf(argument.getInteger());
        }
      }
    }
    return null;
  }

  public Value getObjetInArray(final String arrayName, final Data data, final int position) {
    int p = 0;
    EList<KeyValue> _keyValue = data.getKeyValue();
    for (final KeyValue keyValue : _keyValue) {
      String _string = keyValue.getString().toString();
      boolean _equals = Objects.equal(_string, arrayName);
      if (_equals) {
        EList<Value> _values = keyValue.getValue().getArray().getValues();
        for (final Value value : _values) {
          {
            if ((p == position)) {
              return value;
            }
            p++;
          }
        }
      }
    }
    return null;
  }

  public Array getArrayInData(final String arrayName, final Data data) {
    EList<KeyValue> _keyValue = data.getKeyValue();
    for (final KeyValue keyValue : _keyValue) {
      String _string = keyValue.getString().toString();
      boolean _equals = Objects.equal(_string, arrayName);
      if (_equals) {
        return keyValue.getValue().getArray();
      }
    }
    return null;
  }

  public Array getArrayInObject(final Value object, final String arrayName) {
    EList<KeyValue> _keyValue = object.getNestedObject().getKeyValue();
    for (final KeyValue keyValue : _keyValue) {
      String _string = keyValue.getString().toString();
      boolean _equals = Objects.equal(_string, arrayName);
      if (_equals) {
        return keyValue.getValue().getArray();
      }
    }
    return null;
  }

  public StringBuilder buildDocument(final Document document) {
    final StringBuilder buildCode = new StringBuilder();
    Build _build = document.getBuild();
    boolean _tripleNotEquals = (_build != null);
    if (_tripleNotEquals) {
      EList<ElementBuild> _elementBuild = document.getBuild().getElementBuild();
      for (final ElementBuild elementBuild : _elementBuild) {
        Page _page = elementBuild.getPage();
        boolean _tripleNotEquals_1 = (_page != null);
        if (_tripleNotEquals_1) {
          this.buildPage(buildCode, elementBuild.getPage(), document);
        } else {
          Loop _loop = elementBuild.getLoop();
          boolean _tripleNotEquals_2 = (_loop != null);
          if (_tripleNotEquals_2) {
            For _forLoop = elementBuild.getLoop().getForLoop();
            boolean _tripleNotEquals_3 = (_forLoop != null);
            if (_tripleNotEquals_3) {
              int _initWithInteger = elementBuild.getLoop().getForLoop().getInitWithInteger();
              boolean _lessEqualsThan = (0 <= _initWithInteger);
              if (_lessEqualsThan) {
                int p = elementBuild.getLoop().getForLoop().getInitWithInteger();
                EList<OtherElement> _otherElement = elementBuild.getLoop().getForLoop().getOtherElement();
                for (final OtherElement otherElement : _otherElement) {
                  Page _page_1 = otherElement.getPage();
                  boolean _tripleNotEquals_4 = (_page_1 != null);
                  if (_tripleNotEquals_4) {
                    Variable _endWithVariable = elementBuild.getLoop().getForLoop().getEndWithVariable();
                    boolean _tripleNotEquals_5 = (_endWithVariable != null);
                    if (_tripleNotEquals_5) {
                      this.context1.setVariable(elementBuild.getLoop().getForLoop().getIncrement().getName(), Integer.valueOf(p));
                      for (int i = p; (i < this.getLengthForArray(elementBuild.getLoop().getForLoop().getEndWithVariable().getName(), document.getData())); i++) {
                        {
                          this.buildPage(buildCode, otherElement.getPage(), document);
                          this.context1.incrementVariable(elementBuild.getLoop().getForLoop().getIncrement().getName(), 1);
                        }
                      }
                    } else {
                      int _endWithInteger = elementBuild.getLoop().getForLoop().getEndWithInteger();
                      boolean _lessEqualsThan_1 = (0 <= _endWithInteger);
                      if (_lessEqualsThan_1) {
                        this.context1.setVariable(elementBuild.getLoop().getForLoop().getIncrement().getName(), Integer.valueOf(p));
                        for (int i = p; (i <= elementBuild.getLoop().getForLoop().getEndWithInteger()); i++) {
                          {
                            this.buildPage(buildCode, otherElement.getPage(), document);
                            this.context1.incrementVariable(elementBuild.getLoop().getForLoop().getIncrement().getName(), 1);
                          }
                        }
                      }
                    }
                  }
                }
              }
            } else {
              With _withLoop = elementBuild.getLoop().getWithLoop();
              boolean _tripleNotEquals_6 = (_withLoop != null);
              if (_tripleNotEquals_6) {
                if (((elementBuild.getLoop().getWithLoop().getInit() != null) && (elementBuild.getLoop().getWithLoop().getVariable() != null))) {
                  EList<OtherElement> _otherElement_1 = elementBuild.getLoop().getWithLoop().getOtherElement();
                  for (final OtherElement otherElement_1 : _otherElement_1) {
                    Page _page_2 = otherElement_1.getPage();
                    boolean _tripleNotEquals_7 = (_page_2 != null);
                    if (_tripleNotEquals_7) {
                      for (int i = 0; (i < this.getLengthForArray(elementBuild.getLoop().getWithLoop().getVariable().getName(), document.getData())); i++) {
                        {
                          Value object = this.getObjetInArray(elementBuild.getLoop().getWithLoop().getVariable().getName(), document.getData(), i);
                          this.context1.setVariable(elementBuild.getLoop().getWithLoop().getInit().getName(), object);
                          this.buildWithLoopPage(buildCode, otherElement_1.getPage(), document, elementBuild.getLoop().getWithLoop().getInit().getName());
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return buildCode;
  }

  public Object getNameOfPage(final Page page, final Data data, final Value value) {
    String _string = page.getString();
    boolean _tripleNotEquals = (_string != null);
    if (_tripleNotEquals) {
      return page.getString();
    } else {
      if ((((page.getVariable() != null) && (page.getArrayC() != null)) && (page.getObjectC() == null))) {
        if (((0 <= page.getArrayC().getPosition().getInteger()) && (page.getArrayC().getPosition().getVariable() == null))) {
          return this.getValueOfVariableInArray(this.getArrayInData(page.getVariable().getName(), data), page.getArrayC().getPosition().getInteger(), data);
        } else {
          Variable _variable = page.getArrayC().getPosition().getVariable();
          boolean _tripleNotEquals_1 = (_variable != null);
          if (_tripleNotEquals_1) {
            Object _variable_1 = this.context1.getVariable(page.getArrayC().getPosition().getVariable().getName());
            final Integer i = ((Integer) _variable_1);
            return this.getValueOfVariableInArray(this.getArrayInData(page.getVariable().getName(), data), (i).intValue(), data);
          }
        }
      } else {
        if ((((page.getVariable() != null) && (page.getObjectC() != null)) && (page.getArrayC() == null))) {
          return this.getValueOfVariableInObject(value, page.getObjectC().getName(), (-1));
        } else {
          if ((((page.getVariable() != null) && (page.getObjectC() != null)) && (page.getArrayC() != null))) {
            if (((0 <= page.getArrayC().getPosition().getInteger()) && (page.getArrayC().getPosition().getVariable() == null))) {
              return this.getValueOfVariableInObject(value, page.getObjectC().getName(), page.getArrayC().getPosition().getInteger());
            } else {
              Variable _variable_2 = page.getArrayC().getPosition().getVariable();
              boolean _tripleNotEquals_2 = (_variable_2 != null);
              if (_tripleNotEquals_2) {
                Object _variable_3 = this.context1.getVariable(page.getArrayC().getPosition().getVariable().getName());
                final Integer i_1 = ((Integer) _variable_3);
                return this.getValueOfVariableInObject(value, page.getObjectC().getName(), (i_1).intValue());
              }
            }
          } else {
            Variable _variable_4 = page.getVariable();
            boolean _tripleNotEquals_3 = (_variable_4 != null);
            if (_tripleNotEquals_3) {
              return this.getValueOfVariableInData(page.getVariable().getName(), data);
            }
          }
        }
      }
    }
    return null;
  }

  public void buildWithLoopPage(final StringBuilder buildCode, final Page page, final Document document, final String nameOfObject) {
    final Context contextPage = new Context();
    Object _variable = this.context1.getVariable(nameOfObject);
    final Value object = ((Value) _variable);
    this.getTitles(buildCode, page, document);
    buildCode.append("<table border=\'1\' cellspacing=\'0\'>\n");
    EList<ElementPage> _elementPage = page.getElementPage();
    for (final ElementPage elementPage : _elementPage) {
      {
        Row _row = elementPage.getRow();
        boolean _tripleNotEquals = (_row != null);
        if (_tripleNotEquals) {
          this.buildRow(elementPage.getRow(), buildCode, document, (-1), contextPage);
        }
        if ((((elementPage.getLoop() != null) && (elementPage.getLoop().getForLoop() != null)) && (elementPage.getLoop().getForLoop().getOtherElement() != null))) {
          int p = elementPage.getLoop().getForLoop().getInitWithInteger();
          EList<OtherElement> _otherElement = elementPage.getLoop().getForLoop().getOtherElement();
          for (final OtherElement otherElement : _otherElement) {
            Row _row_1 = otherElement.getRow();
            boolean _tripleNotEquals_1 = (_row_1 != null);
            if (_tripleNotEquals_1) {
              this.context1.setVariable(elementPage.getLoop().getForLoop().getIncrement().getName(), Integer.valueOf(p));
              if (((elementPage.getLoop().getForLoop().getEndWithVariable() != null) && (elementPage.getLoop().getForLoop().getObjectC() != null))) {
                for (int i = p; (i < this.getLengthForArrayInObject(object, elementPage.getLoop().getForLoop().getObjectC().getName())); i++) {
                  {
                    Object _variable_1 = this.context1.getVariable(elementPage.getLoop().getForLoop().getIncrement().getName());
                    final Integer po = ((Integer) _variable_1);
                    this.buildRow(otherElement.getRow(), buildCode, document, (po).intValue(), contextPage);
                    this.context1.incrementVariable(elementPage.getLoop().getForLoop().getIncrement().getName(), 1);
                  }
                }
              } else {
                Variable _endWithVariable = elementPage.getLoop().getForLoop().getEndWithVariable();
                boolean _tripleNotEquals_2 = (_endWithVariable != null);
                if (_tripleNotEquals_2) {
                  for (int i = p; (i < this.getLengthForArray(elementPage.getLoop().getForLoop().getEndWithVariable().getName(), document.getData())); i++) {
                    {
                      Object _variable_1 = this.context1.getVariable(elementPage.getLoop().getForLoop().getIncrement().getName());
                      final Integer po = ((Integer) _variable_1);
                      this.buildRow(otherElement.getRow(), buildCode, document, (po).intValue(), contextPage);
                      this.context1.incrementVariable(elementPage.getLoop().getForLoop().getIncrement().getName(), 1);
                    }
                  }
                } else {
                  int _endWithInteger = elementPage.getLoop().getForLoop().getEndWithInteger();
                  boolean _lessEqualsThan = (0 <= _endWithInteger);
                  if (_lessEqualsThan) {
                    for (int i = p; (i <= elementPage.getLoop().getForLoop().getEndWithInteger()); i++) {
                      {
                        Object _variable_1 = this.context1.getVariable(elementPage.getLoop().getForLoop().getIncrement().getName());
                        final Integer po = ((Integer) _variable_1);
                        this.buildRow(otherElement.getRow(), buildCode, document, (po).intValue(), contextPage);
                        this.context1.incrementVariable(elementPage.getLoop().getForLoop().getIncrement().getName(), 1);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    buildCode.append("</table>\n");
    contextPage.clearVariables();
  }

  public String getClassD(final ClassD classD) {
    String _string = classD.getString();
    boolean _tripleNotEquals = (_string != null);
    if (_tripleNotEquals) {
      return classD.getString().toString();
    }
    return new String();
  }

  public void getTitles(final StringBuilder buildCode, final Page page, final Document document) {
    EList<Title> _titles = page.getTitles();
    for (final Title title : _titles) {
      {
        String classD = new String();
        if (((title.getBigTitle() != null) && (title.getBigTitle().getString() != null))) {
          ClassD _classD = title.getBigTitle().getClassD();
          boolean _tripleNotEquals = (_classD != null);
          if (_tripleNotEquals) {
            classD = this.getClassD(title.getBigTitle().getClassD());
          }
          buildCode.append((("<h1 class=\'" + classD) + "\'>"));
          String _string = title.getBigTitle().getString();
          boolean _tripleNotEquals_1 = (_string != null);
          if (_tripleNotEquals_1) {
            String _string_1 = title.getBigTitle().getString();
            String _plus = (_string_1 + "</h1>");
            buildCode.append(_plus);
          } else {
            if ((((title.getBigTitle().getVariable() != null) && (title.getBigTitle().getObjectC() == null)) && (title.getBigTitle().getArrayC() == null))) {
              Object _valueOfVariableInData = this.getValueOfVariableInData(title.getBigTitle().getVariable().getName(), document.getData());
              String _plus_1 = (_valueOfVariableInData + "aa</h1>");
              buildCode.append(_plus_1);
            } else {
              if (((title.getBigTitle().getObjectC() == null) && (title.getBigTitle().getArrayC() != null))) {
              } else {
                if (((title.getBigTitle().getObjectC() != null) && (title.getBigTitle().getArrayC() == null))) {
                } else {
                  if (((title.getBigTitle().getObjectC() != null) && (title.getBigTitle().getArrayC() != null))) {
                  }
                }
              }
            }
          }
        } else {
          if (((title.getSubTitle() != null) && (title.getSubTitle().getString() != null))) {
            ClassD _classD_1 = title.getSubTitle().getClassD();
            boolean _tripleNotEquals_2 = (_classD_1 != null);
            if (_tripleNotEquals_2) {
              classD = this.getClassD(title.getSubTitle().getClassD());
            }
            String _string_2 = title.getSubTitle().getString();
            String _plus_2 = ((("<h2 class=\'" + classD) + "\'>") + _string_2);
            String _plus_3 = (_plus_2 + "</h2>");
            buildCode.append(_plus_3);
          } else {
            if (((title.getSubSubTitle() != null) && (title.getSubSubTitle().getString() != null))) {
              ClassD _classD_2 = title.getSubSubTitle().getClassD();
              boolean _tripleNotEquals_3 = (_classD_2 != null);
              if (_tripleNotEquals_3) {
                classD = this.getClassD(title.getSubSubTitle().getClassD());
              }
              String _string_3 = title.getSubSubTitle().getString();
              String _plus_4 = ((("<h3 class=\'" + classD) + "\'>") + _string_3);
              String _plus_5 = (_plus_4 + "</h3>");
              buildCode.append(_plus_5);
            }
          }
        }
      }
    }
  }

  public void buildPage(final StringBuilder buildCode, final Page page, final Document document) {
    final Context contextPage = new Context();
    this.getTitles(buildCode, page, document);
    buildCode.append("<table border=\'1\' cellspacing=\'0\'>\n");
    EList<ElementPage> _elementPage = page.getElementPage();
    for (final ElementPage elementPage : _elementPage) {
      {
        Row _row = elementPage.getRow();
        boolean _tripleNotEquals = (_row != null);
        if (_tripleNotEquals) {
          this.buildRow(elementPage.getRow(), buildCode, document, (-1), contextPage);
        }
        if ((((elementPage.getLoop() != null) && (elementPage.getLoop().getForLoop() != null)) && (elementPage.getLoop().getForLoop().getOtherElement() != null))) {
          int p = elementPage.getLoop().getForLoop().getInitWithInteger();
          EList<OtherElement> _otherElement = elementPage.getLoop().getForLoop().getOtherElement();
          for (final OtherElement otherElement : _otherElement) {
            Row _row_1 = otherElement.getRow();
            boolean _tripleNotEquals_1 = (_row_1 != null);
            if (_tripleNotEquals_1) {
              this.context1.setVariable(elementPage.getLoop().getForLoop().getIncrement().getName(), Integer.valueOf(p));
              Variable _endWithVariable = elementPage.getLoop().getForLoop().getEndWithVariable();
              boolean _tripleNotEquals_2 = (_endWithVariable != null);
              if (_tripleNotEquals_2) {
                for (int i = p; (i < this.getLengthForArray(elementPage.getLoop().getForLoop().getEndWithVariable().getName(), document.getData())); i++) {
                  {
                    Object _variable = this.context1.getVariable(elementPage.getLoop().getForLoop().getIncrement().getName());
                    final Integer po = ((Integer) _variable);
                    this.buildRow(otherElement.getRow(), buildCode, document, (po).intValue(), contextPage);
                    this.context1.incrementVariable(elementPage.getLoop().getForLoop().getIncrement().getName(), 1);
                  }
                }
              } else {
                int _endWithInteger = elementPage.getLoop().getForLoop().getEndWithInteger();
                boolean _lessEqualsThan = (0 <= _endWithInteger);
                if (_lessEqualsThan) {
                  for (int i = p; (i <= elementPage.getLoop().getForLoop().getEndWithInteger()); i++) {
                    {
                      Object _variable = this.context1.getVariable(elementPage.getLoop().getForLoop().getIncrement().getName());
                      final Integer po = ((Integer) _variable);
                      this.buildRow(otherElement.getRow(), buildCode, document, (po).intValue(), contextPage);
                      this.context1.incrementVariable(elementPage.getLoop().getForLoop().getIncrement().getName(), 1);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    buildCode.append("</table>\n");
    contextPage.clearVariables();
  }

  public Object getValueForSimpleCol(final Col col, final Document document, final int position, final Context contextPage) {
    String _string = col.getString();
    boolean _tripleNotEquals = (_string != null);
    if (_tripleNotEquals) {
      return col.getString();
    } else {
      if ((((col.getVariable() != null) && (col.getObjectC() != null)) && (col.getArrayC() == null))) {
        Object _variable = this.context1.getVariable(col.getVariable().getName());
        final Value object = ((Value) _variable);
        return this.getValueOfVariableInObject(object, col.getObjectC().getName(), (-1));
      } else {
        if ((((col.getVariable() != null) && (col.getObjectC() != null)) && (col.getArrayC() != null))) {
          Object _variable_1 = this.context1.getVariable(col.getVariable().getName());
          final Value object_1 = ((Value) _variable_1);
          if (((0 <= col.getArrayC().getPosition().getInteger()) && (col.getArrayC().getPosition().getVariable() == null))) {
            return this.getValueOfVariableInObject(object_1, col.getObjectC().getName(), col.getArrayC().getPosition().getInteger());
          } else {
            Variable _variable_2 = col.getArrayC().getPosition().getVariable();
            boolean _tripleNotEquals_1 = (_variable_2 != null);
            if (_tripleNotEquals_1) {
              Object _variable_3 = this.context1.getVariable(col.getArrayC().getPosition().getVariable().getName());
              final Integer po = ((Integer) _variable_3);
              return this.getValueOfVariableInObject(object_1, col.getObjectC().getName(), (po).intValue());
            }
          }
        } else {
          if ((((col.getVariable() != null) && (col.getArrayC() != null)) && (col.getObjectC() == null))) {
            if (((0 <= col.getArrayC().getPosition().getInteger()) && (col.getArrayC().getPosition().getVariable() == null))) {
              return this.getValueOfVariableInArray(this.getArrayInData(col.getVariable().getName(), document.getData()), col.getArrayC().getPosition().getInteger(), document.getData());
            } else {
              Variable _variable_4 = col.getArrayC().getPosition().getVariable();
              boolean _tripleNotEquals_2 = (_variable_4 != null);
              if (_tripleNotEquals_2) {
                Object _variable_5 = this.context1.getVariable(col.getArrayC().getPosition().getVariable().getName());
                final Integer po_1 = ((Integer) _variable_5);
                return this.getValueOfVariableInArray(this.getArrayInData(col.getVariable().getName(), document.getData()), (po_1).intValue(), document.getData());
              }
            }
          } else {
            Variable _variable_6 = col.getVariable();
            boolean _tripleNotEquals_3 = (_variable_6 != null);
            if (_tripleNotEquals_3) {
              return this.getValueOfVariableInData(col.getVariable().getName(), document.getData());
            } else {
              Img _img = col.getImg();
              boolean _tripleNotEquals_4 = (_img != null);
              if (_tripleNotEquals_4) {
                final StringBuilder c = new StringBuilder();
                final StringBuilder a = new StringBuilder();
                final StringBuilder url = new StringBuilder();
                ClassD _classD = col.getImg().getClassD();
                boolean _tripleNotEquals_5 = (_classD != null);
                if (_tripleNotEquals_5) {
                  c.append(col.getImg().getClassD().getString());
                }
                String _stringAlt = col.getImg().getStringAlt();
                boolean _tripleNotEquals_6 = (_stringAlt != null);
                if (_tripleNotEquals_6) {
                  a.append(col.getImg().getStringAlt());
                }
                String _string_1 = col.getImg().getString();
                boolean _tripleNotEquals_7 = (_string_1 != null);
                if (_tripleNotEquals_7) {
                  url.append(col.getImg().getString());
                } else {
                  Variable _variable_7 = col.getImg().getVariable();
                  boolean _tripleNotEquals_8 = (_variable_7 != null);
                  if (_tripleNotEquals_8) {
                    if (((col.getImg().getArrayC() != null) && (col.getImg().getObjectC() == null))) {
                      Array _arrayInData = this.getArrayInData(col.getImg().getVariable().getName(), document.getData());
                      Array array = ((Array) _arrayInData);
                      Variable _variable_8 = col.getImg().getArrayC().getPosition().getVariable();
                      boolean _tripleNotEquals_9 = (_variable_8 != null);
                      if (_tripleNotEquals_9) {
                        Object _variable_9 = this.context1.getVariable(col.getImg().getArrayC().getPosition().getVariable().getName());
                        Integer po_2 = ((Integer) _variable_9);
                        url.append(this.getValueOfVariableInArray(array, (po_2).intValue(), document.getData()));
                      } else {
                        url.append(this.getValueOfVariableInArray(array, col.getImg().getArrayC().getPosition().getInteger(), document.getData()));
                      }
                    } else {
                      if (((col.getImg().getArrayC() == null) && (col.getImg().getObjectC() != null))) {
                        Object _variable_10 = this.context1.getVariable(col.getImg().getVariable().getName());
                        Value object_2 = ((Value) _variable_10);
                        url.append(this.getValueOfVariableInObject(object_2, col.getImg().getObjectC().getName(), (-1)));
                      } else {
                        if (((col.getImg().getArrayC() != null) && (col.getImg().getObjectC() != null))) {
                          Object _variable_11 = this.context1.getVariable(col.getImg().getVariable().getName());
                          Value object_3 = ((Value) _variable_11);
                          Array array_1 = this.getArrayInObject(object_3, col.getImg().getObjectC().getName());
                          Variable _variable_12 = col.getImg().getArrayC().getPosition().getVariable();
                          boolean _tripleNotEquals_10 = (_variable_12 != null);
                          if (_tripleNotEquals_10) {
                            Object _variable_13 = this.context1.getVariable(col.getImg().getArrayC().getPosition().getVariable().getName());
                            Integer po_3 = ((Integer) _variable_13);
                            url.append(this.getValueOfVariableInArray(array_1, (po_3).intValue(), document.getData()));
                          } else {
                            url.append(this.getValueOfVariableInArray(array_1, col.getImg().getArrayC().getPosition().getInteger(), document.getData()));
                          }
                        } else {
                          url.append(this.getValueOfVariableInData(col.getImg().getVariable().getName(), document.getData()));
                        }
                      }
                    }
                  }
                }
                return (((((("<img src=\'" + url) + "\' alt=\'") + a) + "\' class=\'") + c) + "\'>");
              } else {
                Function _function = col.getFunction();
                boolean _tripleNotEquals_11 = (_function != null);
                if (_tripleNotEquals_11) {
                  int nberArguments = 0;
                  if (((col.getFunction().getSumFunction() != null) && (col.getFunction().getSumFunction().getArgument1() != null))) {
                    nberArguments = this.numberOfArgumentsOfAFunction(col.getFunction());
                    if ((nberArguments == 1)) {
                      EList<Argument1> _argument1 = col.getFunction().getSumFunction().getArgument1();
                      for (final Argument1 argument : _argument1) {
                        if ((((((argument.getInteger() != 0) || (argument.getInteger() == 0)) && (argument.getVariable() == null)) && (argument.getString() == null)) && (argument.getClassVariable() == null))) {
                          return Integer.valueOf(argument.getInteger());
                        } else {
                          if (((argument.getString() != null) && (argument.getVariable() == null))) {
                            return argument.getString();
                          } else {
                            if ((((argument.getVariable() != null) && (argument.getArrayC() != null)) && (argument.getObjectC() == null))) {
                              if (((0 <= argument.getArrayC().getPosition().getInteger()) && (argument.getArrayC().getPosition().getVariable() == null))) {
                                return this.getValueOfVariableInArray(this.getArrayInData(argument.getVariable().getName(), document.getData()), argument.getArrayC().getPosition().getInteger(), document.getData());
                              } else {
                                Variable _variable_14 = argument.getArrayC().getPosition().getVariable();
                                boolean _tripleNotEquals_12 = (_variable_14 != null);
                                if (_tripleNotEquals_12) {
                                  Object _variable_15 = this.context1.getVariable(argument.getArrayC().getPosition().getVariable().getName());
                                  final Integer po_4 = ((Integer) _variable_15);
                                  return this.getValueOfVariableInArray(this.getArrayInData(argument.getVariable().getName(), document.getData()), (po_4).intValue(), document.getData());
                                }
                              }
                            } else {
                              if ((((argument.getVariable() != null) && (argument.getArrayC() == null)) && (argument.getObjectC() != null))) {
                                Object _variable_16 = this.context1.getVariable(argument.getVariable().getName());
                                Value object_4 = ((Value) _variable_16);
                                Object v = this.getValueOfVariableInObject(object_4, argument.getObjectC().getName(), (-1));
                                if ((v == null)) {
                                  Array array_2 = this.getArrayInObject(object_4, argument.getObjectC().getName());
                                  if ((array_2 != null)) {
                                    v = Double.valueOf(this.sumElementsInArray(array_2));
                                  }
                                }
                                return v;
                              } else {
                                if ((((argument.getVariable() != null) && (argument.getArrayC() != null)) && (argument.getObjectC() != null))) {
                                  Object _variable_17 = this.context1.getVariable(argument.getVariable().getName());
                                  Value object_5 = ((Value) _variable_17);
                                  if (((0 <= argument.getArrayC().getPosition().getInteger()) && (argument.getArrayC().getPosition().getVariable() == null))) {
                                    return this.getValueOfVariableInObject(object_5, argument.getObjectC().getName(), argument.getArrayC().getPosition().getInteger());
                                  } else {
                                    Variable _variable_18 = argument.getArrayC().getPosition().getVariable();
                                    boolean _tripleNotEquals_13 = (_variable_18 != null);
                                    if (_tripleNotEquals_13) {
                                      Object _variable_19 = this.context1.getVariable(argument.getArrayC().getPosition().getVariable().getName());
                                      final Integer po_5 = ((Integer) _variable_19);
                                      return this.getValueOfVariableInObject(object_5, argument.getObjectC().getName(), (po_5).intValue());
                                    }
                                  }
                                } else {
                                  if (((argument.getVariable() != null) && (argument.getArrayC() == null))) {
                                    return Double.valueOf(this.sumElementsInArray(this.getArrayInData(argument.getVariable().getName(), document.getData())));
                                  } else {
                                    ClassVariable _classVariable = argument.getClassVariable();
                                    boolean _tripleNotEquals_14 = (_classVariable != null);
                                    if (_tripleNotEquals_14) {
                                      return Double.valueOf(contextPage.sumArray(argument.getClassVariable().getName()));
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      return this.sumAllElementInArgument(col.getFunction().getSumFunction(), document.getData(), position);
                    }
                  } else {
                    if (((col.getFunction().getProdFunction() != null) && (col.getFunction().getProdFunction().getArgument1() != null))) {
                      nberArguments = this.numberOfArgumentsOfAFunction(col.getFunction());
                      if ((nberArguments == 1)) {
                        EList<Argument1> _argument1_1 = col.getFunction().getProdFunction().getArgument1();
                        for (final Argument1 argument_1 : _argument1_1) {
                          if (((((argument_1.getInteger() != 0) || (argument_1.getInteger() == 0)) && (argument_1.getVariable() == null)) && (argument_1.getString() == null))) {
                            return Integer.valueOf(argument_1.getInteger());
                          } else {
                            if (((argument_1.getString() != null) && (argument_1.getVariable() == null))) {
                              return argument_1.getString();
                            } else {
                              if ((((argument_1.getVariable() != null) && (argument_1.getArrayC() != null)) && (argument_1.getObjectC() == null))) {
                                if (((0 <= argument_1.getArrayC().getPosition().getInteger()) && (argument_1.getArrayC().getPosition().getVariable() == null))) {
                                  return this.getValueOfVariableInArray(this.getArrayInData(argument_1.getVariable().getName(), document.getData()), argument_1.getArrayC().getPosition().getInteger(), document.getData());
                                } else {
                                  Variable _variable_20 = argument_1.getArrayC().getPosition().getVariable();
                                  boolean _tripleNotEquals_15 = (_variable_20 != null);
                                  if (_tripleNotEquals_15) {
                                    Object _variable_21 = this.context1.getVariable(argument_1.getArrayC().getPosition().getVariable().getName());
                                    final Integer po_6 = ((Integer) _variable_21);
                                    return this.getValueOfVariableInArray(this.getArrayInData(argument_1.getVariable().getName(), document.getData()), (po_6).intValue(), document.getData());
                                  }
                                }
                              } else {
                                if ((((argument_1.getVariable() != null) && (argument_1.getArrayC() == null)) && (argument_1.getObjectC() != null))) {
                                  Object _variable_22 = this.context1.getVariable(argument_1.getVariable().getName());
                                  Value object_6 = ((Value) _variable_22);
                                  Object v_1 = this.getValueOfVariableInObject(object_6, argument_1.getObjectC().getName(), (-1));
                                  if ((v_1 == null)) {
                                    Array array_3 = this.getArrayInObject(object_6, argument_1.getObjectC().getName());
                                    if ((array_3 != null)) {
                                      v_1 = Double.valueOf(this.prodElementsInArray(array_3));
                                    }
                                  }
                                  return v_1;
                                } else {
                                  if ((((argument_1.getVariable() != null) && (argument_1.getArrayC() != null)) && (argument_1.getObjectC() != null))) {
                                    Object _variable_23 = this.context1.getVariable(argument_1.getVariable().getName());
                                    Value object_7 = ((Value) _variable_23);
                                    if (((0 <= argument_1.getArrayC().getPosition().getInteger()) && (argument_1.getArrayC().getPosition().getVariable() == null))) {
                                      return this.getValueOfVariableInObject(object_7, argument_1.getObjectC().getName(), argument_1.getArrayC().getPosition().getInteger());
                                    } else {
                                      Variable _variable_24 = argument_1.getArrayC().getPosition().getVariable();
                                      boolean _tripleNotEquals_16 = (_variable_24 != null);
                                      if (_tripleNotEquals_16) {
                                        Object _variable_25 = this.context1.getVariable(argument_1.getArrayC().getPosition().getVariable().getName());
                                        final Integer po_7 = ((Integer) _variable_25);
                                        return this.getValueOfVariableInObject(object_7, argument_1.getObjectC().getName(), (po_7).intValue());
                                      }
                                    }
                                  } else {
                                    if (((argument_1.getVariable() != null) && (argument_1.getArrayC() == null))) {
                                      return Double.valueOf(this.prodElementsInArray(this.getArrayInData(argument_1.getVariable().getName(), document.getData())));
                                    } else {
                                      ClassVariable _classVariable_1 = argument_1.getClassVariable();
                                      boolean _tripleNotEquals_17 = (_classVariable_1 != null);
                                      if (_tripleNotEquals_17) {
                                        return Double.valueOf(contextPage.productArray(argument_1.getClassVariable().getName()));
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        return this.prodAllElementInArgument(col.getFunction().getProdFunction(), document.getData(), position);
                      }
                    } else {
                      if (((col.getFunction().getDivFunction() != null) && (col.getFunction().getDivFunction().getArgument1() != null))) {
                        nberArguments = this.numberOfArgumentsOfAFunction(col.getFunction());
                        if ((nberArguments == 2)) {
                          EList<Argument1> _argument1_2 = col.getFunction().getDivFunction().getArgument1();
                          boolean _tripleNotEquals_18 = (_argument1_2 != null);
                          if (_tripleNotEquals_18) {
                            String dividente = null;
                            String diviseur = null;
                            EList<Argument1> _argument1_3 = col.getFunction().getDivFunction().getArgument1();
                            for (final Argument1 argument_2 : _argument1_3) {
                              ClassVariable _classVariable_2 = argument_2.getClassVariable();
                              boolean _tripleNotEquals_19 = (_classVariable_2 != null);
                              if (_tripleNotEquals_19) {
                                if ((dividente == null)) {
                                  dividente = argument_2.getClassVariable().getName();
                                } else {
                                  if ((diviseur == null)) {
                                    diviseur = argument_2.getClassVariable().getName();
                                  }
                                }
                                if (((dividente != null) && (diviseur != null))) {
                                  return Double.valueOf(contextPage.divideArraysFirstElement(dividente, diviseur));
                                }
                              } else {
                                return this.div2Arguments(col.getFunction().getDivFunction(), document.getData(), position);
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (((col.getInteger() != 0) || (col.getInteger() == 0))) {
                    return Integer.valueOf(col.getInteger());
                  }
                }
              }
            }
          }
        }
      }
    }
    return null;
  }

  public StringBuilder buildSimpleCol(final Col col, final StringBuilder buildCode, final Document document, final int position, final Context contextPage) {
    StringBuilder _xblockexpression = null;
    {
      final StringBuilder classDC = new StringBuilder();
      ClassD _classD = col.getClassD();
      boolean _tripleNotEquals = (_classD != null);
      if (_tripleNotEquals) {
        String _string = col.getClassD().getString();
        String _plus = (" class=\'" + _string);
        String _plus_1 = (_plus + "\'");
        classDC.append(_plus_1);
      }
      final StringBuilder fu = new StringBuilder();
      Fusion _fusion = col.getFusion();
      boolean _tripleNotEquals_1 = (_fusion != null);
      if (_tripleNotEquals_1) {
        Colspan _colspan = col.getFusion().getColspan();
        boolean _tripleNotEquals_2 = (_colspan != null);
        if (_tripleNotEquals_2) {
          fu.append(" colspan=\'");
          int _integer = col.getFusion().getColspan().getInteger();
          boolean _lessThan = (0 < _integer);
          if (_lessThan) {
            int _integer_1 = col.getFusion().getColspan().getInteger();
            String _plus_2 = (Integer.valueOf(_integer_1) + "\'");
            fu.append(_plus_2);
          }
        }
        Rowspan _rowspan = col.getFusion().getRowspan();
        boolean _tripleNotEquals_3 = (_rowspan != null);
        if (_tripleNotEquals_3) {
          fu.append(" rowspan=\'");
          int _integer_2 = col.getFusion().getRowspan().getInteger();
          boolean _lessThan_1 = (0 < _integer_2);
          if (_lessThan_1) {
            int _integer_3 = col.getFusion().getRowspan().getInteger();
            String _plus_3 = (Integer.valueOf(_integer_3) + "\'");
            fu.append(_plus_3);
          }
        }
      }
      buildCode.append(((("<td" + fu) + classDC) + ">\n"));
      final Object value = this.getValueForSimpleCol(col, document, position, contextPage);
      ClassD _classD_1 = col.getClassD();
      boolean _tripleNotEquals_4 = (_classD_1 != null);
      if (_tripleNotEquals_4) {
        contextPage.addToAllClassVariables(col.getClassD().getString(), value);
      }
      buildCode.append(value);
      _xblockexpression = buildCode.append("\n</td>\n");
    }
    return _xblockexpression;
  }

  public Object getValueForWithLoopCol(final Value value, final String globalVariable) {
    String _string = value.getString();
    boolean _tripleNotEquals = (_string != null);
    if (_tripleNotEquals) {
      return value.getString();
    } else {
      if (((value.getInteger() != 0) || (value.getInteger() == 0))) {
        return Integer.valueOf(value.getInteger());
      } else {
        String _string_1 = value.getTrueV().toString();
        boolean _tripleNotEquals_1 = (_string_1 != null);
        if (_tripleNotEquals_1) {
          return "true";
        } else {
          String _string_2 = value.getFalseV().toString();
          boolean _tripleNotEquals_2 = (_string_2 != null);
          if (_tripleNotEquals_2) {
            return "false";
          } else {
            return globalVariable;
          }
        }
      }
    }
  }

  public void buildWithLoopCol(final Col col, final StringBuilder buildCode, final String globalVariable, final Data data, final Context contextPage) {
    final StringBuilder classDC = new StringBuilder();
    ClassD _classD = col.getClassD();
    boolean _tripleNotEquals = (_classD != null);
    if (_tripleNotEquals) {
      String _string = col.getClassD().getString();
      String _plus = (" class=\'" + _string);
      String _plus_1 = (_plus + "\'");
      classDC.append(_plus_1);
    }
    final StringBuilder fu = new StringBuilder();
    Fusion _fusion = col.getFusion();
    boolean _tripleNotEquals_1 = (_fusion != null);
    if (_tripleNotEquals_1) {
      Colspan _colspan = col.getFusion().getColspan();
      boolean _tripleNotEquals_2 = (_colspan != null);
      if (_tripleNotEquals_2) {
        fu.append(" colspan=\'");
        int _integer = col.getFusion().getColspan().getInteger();
        boolean _lessThan = (0 < _integer);
        if (_lessThan) {
          int _integer_1 = col.getFusion().getColspan().getInteger();
          String _plus_2 = (Integer.valueOf(_integer_1) + "\'");
          fu.append(_plus_2);
        }
      }
      Rowspan _rowspan = col.getFusion().getRowspan();
      boolean _tripleNotEquals_3 = (_rowspan != null);
      if (_tripleNotEquals_3) {
        fu.append(" rowspan=\'");
        int _integer_2 = col.getFusion().getRowspan().getInteger();
        boolean _lessThan_1 = (0 < _integer_2);
        if (_lessThan_1) {
          int _integer_3 = col.getFusion().getRowspan().getInteger();
          String _plus_3 = (Integer.valueOf(_integer_3) + "\'");
          fu.append(_plus_3);
        }
      }
    }
    EList<KeyValue> _keyValue = data.getKeyValue();
    for (final KeyValue keyValue : _keyValue) {
      String _string_1 = keyValue.getString().toString();
      String _string_2 = globalVariable.toString();
      boolean _equals = Objects.equal(_string_1, _string_2);
      if (_equals) {
        EList<Value> _values = keyValue.getValue().getArray().getValues();
        for (final Value value : _values) {
          {
            buildCode.append(((("<td" + fu) + classDC) + ">\n"));
            final Object valeur = this.getValueForWithLoopCol(value, globalVariable);
            ClassD _classD_1 = col.getClassD();
            boolean _tripleNotEquals_4 = (_classD_1 != null);
            if (_tripleNotEquals_4) {
              contextPage.addToAllClassVariables(col.getClassD().getString(), valeur);
            }
            buildCode.append(valeur);
            buildCode.append("\n</td>\n");
          }
        }
      }
    }
  }

  public StringBuilder buildRow(final Row row, final StringBuilder buildCode, final Document document, final int position, final Context contextPage) {
    StringBuilder _xblockexpression = null;
    {
      buildCode.append("<tr>\n");
      EList<ElementRow> _elementRow = row.getElementRow();
      for (final ElementRow elementRow : _elementRow) {
        {
          if ((((elementRow.getLoop() != null) && (elementRow.getLoop().getWithLoop() != null)) && (elementRow.getLoop().getWithLoop().getOtherElement() != null))) {
            EList<OtherElement> _otherElement = elementRow.getLoop().getWithLoop().getOtherElement();
            for (final OtherElement otherElement : _otherElement) {
              Col _col = otherElement.getCol();
              boolean _tripleNotEquals = (_col != null);
              if (_tripleNotEquals) {
                this.buildWithLoopCol(otherElement.getCol(), buildCode, elementRow.getLoop().getWithLoop().getVariable().getName(), document.getData(), contextPage);
              }
            }
          }
          Col _col_1 = elementRow.getCol();
          boolean _tripleNotEquals_1 = (_col_1 != null);
          if (_tripleNotEquals_1) {
            this.buildSimpleCol(elementRow.getCol(), buildCode, document, position, contextPage);
          }
          Conditional _conditional = elementRow.getConditional();
          boolean _tripleNotEquals_2 = (_conditional != null);
          if (_tripleNotEquals_2) {
            this.buildConditional(elementRow.getConditional(), buildCode, document, position, contextPage);
          }
        }
      }
      _xblockexpression = buildCode.append("</tr>\n");
    }
    return _xblockexpression;
  }

  public void buildConditional(final Conditional conditional, final StringBuilder buildCode, final Document document, final int position, final Context contextPage) {
    boolean _evaluateCondition = this.evaluateCondition(conditional.getIfCondition().getCondition(), document, contextPage);
    if (_evaluateCondition) {
      EList<OtherElement> _otherElement = conditional.getIfCondition().getOtherElement();
      for (final OtherElement otherElement : _otherElement) {
        {
          Col _col = otherElement.getCol();
          boolean _tripleNotEquals = (_col != null);
          if (_tripleNotEquals) {
            this.buildSimpleCol(otherElement.getCol(), buildCode, document, position, contextPage);
          }
          Row _row = otherElement.getRow();
          boolean _tripleNotEquals_1 = (_row != null);
          if (_tripleNotEquals_1) {
            this.buildRow(otherElement.getRow(), buildCode, document, position, contextPage);
          }
          Page _page = otherElement.getPage();
          boolean _tripleNotEquals_2 = (_page != null);
          if (_tripleNotEquals_2) {
            this.buildPage(buildCode, otherElement.getPage(), document);
          }
          Conditional _conditional = otherElement.getConditional();
          boolean _tripleNotEquals_3 = (_conditional != null);
          if (_tripleNotEquals_3) {
            this.buildConditional(otherElement.getConditional(), buildCode, document, position, contextPage);
          }
        }
      }
    } else {
      EList<ElseCondition> _elseCondion = conditional.getElseCondion();
      boolean _tripleNotEquals = (_elseCondion != null);
      if (_tripleNotEquals) {
        EList<ElseCondition> _elseCondion_1 = conditional.getElseCondion();
        for (final ElseCondition elseCondition : _elseCondion_1) {
          IfCondition _ifCondition = elseCondition.getIfCondition();
          boolean _tripleNotEquals_1 = (_ifCondition != null);
          if (_tripleNotEquals_1) {
            boolean _evaluateCondition_1 = this.evaluateCondition(elseCondition.getIfCondition().getCondition(), document, contextPage);
            if (_evaluateCondition_1) {
              EList<OtherElement> _otherElement_1 = elseCondition.getIfCondition().getOtherElement();
              for (final OtherElement otherElement_1 : _otherElement_1) {
                {
                  Col _col = otherElement_1.getCol();
                  boolean _tripleNotEquals_2 = (_col != null);
                  if (_tripleNotEquals_2) {
                    this.buildSimpleCol(otherElement_1.getCol(), buildCode, document, position, contextPage);
                  }
                  Row _row = otherElement_1.getRow();
                  boolean _tripleNotEquals_3 = (_row != null);
                  if (_tripleNotEquals_3) {
                    this.buildRow(otherElement_1.getRow(), buildCode, document, position, contextPage);
                  }
                  Page _page = otherElement_1.getPage();
                  boolean _tripleNotEquals_4 = (_page != null);
                  if (_tripleNotEquals_4) {
                    this.buildPage(buildCode, otherElement_1.getPage(), document);
                  }
                  Conditional _conditional = otherElement_1.getConditional();
                  boolean _tripleNotEquals_5 = (_conditional != null);
                  if (_tripleNotEquals_5) {
                    this.buildConditional(otherElement_1.getConditional(), buildCode, document, position, contextPage);
                  }
                }
              }
            }
          } else {
            EList<OtherElement> _otherElement_2 = elseCondition.getOtherElement();
            for (final OtherElement otherElement_2 : _otherElement_2) {
              {
                Col _col = otherElement_2.getCol();
                boolean _tripleNotEquals_2 = (_col != null);
                if (_tripleNotEquals_2) {
                  this.buildSimpleCol(otherElement_2.getCol(), buildCode, document, position, contextPage);
                }
                Row _row = otherElement_2.getRow();
                boolean _tripleNotEquals_3 = (_row != null);
                if (_tripleNotEquals_3) {
                  this.buildRow(otherElement_2.getRow(), buildCode, document, position, contextPage);
                }
                Page _page = otherElement_2.getPage();
                boolean _tripleNotEquals_4 = (_page != null);
                if (_tripleNotEquals_4) {
                  this.buildPage(buildCode, otherElement_2.getPage(), document);
                }
                Conditional _conditional = otherElement_2.getConditional();
                boolean _tripleNotEquals_5 = (_conditional != null);
                if (_tripleNotEquals_5) {
                  this.buildConditional(otherElement_2.getConditional(), buildCode, document, position, contextPage);
                }
              }
            }
          }
        }
      }
    }
  }

  public Object getValueForPartInConditionParams(final Part part, final Document document, final Context contextPage) {
    String _string = part.getString();
    boolean _tripleNotEquals = (_string != null);
    if (_tripleNotEquals) {
      return part.getString();
    } else {
      Variable _variable = part.getVariable();
      boolean _tripleNotEquals_1 = (_variable != null);
      if (_tripleNotEquals_1) {
        if (((part.getObjectC() == null) && (part.getArrayC() != null))) {
          Variable _variable_1 = part.getArrayC().getPosition().getVariable();
          boolean _tripleNotEquals_2 = (_variable_1 != null);
          if (_tripleNotEquals_2) {
            return this.getValueOfVariableInArray(this.getArrayInData(part.getVariable().getName(), document.getData()), (-1), document.getData());
          } else {
            int _integer = part.getArrayC().getPosition().getInteger();
            return this.getValueOfVariableInArray(this.getArrayInData(part.getVariable().getName(), document.getData()), (((Integer) Integer.valueOf(_integer))).intValue(), document.getData());
          }
        } else {
          if (((part.getObjectC() != null) && (part.getArrayC() == null))) {
            Object _variable_2 = this.context1.getVariable(part.getVariable().getName());
            final Value object = ((Value) _variable_2);
            return this.getValueOfVariableInObject(object, part.getObjectC().getName(), (-1));
          } else {
            if (((part.getObjectC() != null) && (part.getArrayC() != null))) {
              Object _variable_3 = this.context1.getVariable(part.getVariable().getName());
              final Value object_1 = ((Value) _variable_3);
              if (((0 <= part.getArrayC().getPosition().getInteger()) && (part.getArrayC().getPosition().getVariable() == null))) {
                return this.getValueOfVariableInObject(object_1, part.getObjectC().getName(), part.getArrayC().getPosition().getInteger());
              } else {
                Variable _variable_4 = part.getArrayC().getPosition().getVariable();
                boolean _tripleNotEquals_3 = (_variable_4 != null);
                if (_tripleNotEquals_3) {
                  Object _variable_5 = this.context1.getVariable(part.getArrayC().getPosition().getVariable().getName());
                  final Integer po = ((Integer) _variable_5);
                  return this.getValueOfVariableInObject(object_1, part.getObjectC().getName(), (po).intValue());
                }
              }
            } else {
              return this.getValueOfVariableInData(part.getVariable().getName(), document.getData());
            }
          }
        }
      } else {
        ClassVariable _classVariable = part.getClassVariable();
        boolean _tripleNotEquals_4 = (_classVariable != null);
        if (_tripleNotEquals_4) {
          return contextPage.getFirstValueInArray(part.getClassVariable().getName());
        } else {
          SuperVariable _superVariable = part.getSuperVariable();
          boolean _tripleNotEquals_5 = (_superVariable != null);
          if (_tripleNotEquals_5) {
            return this.context1.getFirstValueInArray(part.getSuperVariable().getName());
          } else {
            return Integer.valueOf(part.getInteger());
          }
        }
      }
    }
    return null;
  }

  public boolean evaluateCondition(final Condition1 condition, final Document document, final Context contextPage) {
    Object firstPart = this.getValueForPartInConditionParams(condition.getFirstPart(), document, contextPage);
    Object secondPart = this.getValueForPartInConditionParams(condition.getSecondPart(), document, contextPage);
    String compareOperator = condition.getCompare();
    if (compareOperator != null) {
      switch (compareOperator) {
        case "==":
          return Objects.equal(firstPart, secondPart);
        case "!=":
          return (!Objects.equal(firstPart, secondPart));
        case "<":
          if (((firstPart instanceof String) && (secondPart instanceof String))) {
            return (((String) firstPart).compareTo(((String) secondPart)) < 0);
          } else {
            if (((firstPart instanceof Number) && (secondPart instanceof Number))) {
              Double first = Double.valueOf(0.0);
              Double second = Double.valueOf(0.0);
              if ((firstPart instanceof Integer)) {
                first = Double.valueOf(((Integer) firstPart).doubleValue());
              } else {
                if ((firstPart instanceof Double)) {
                  first = ((Double) firstPart);
                }
              }
              if ((secondPart instanceof Integer)) {
                second = Double.valueOf(((Integer) secondPart).doubleValue());
              } else {
                if ((secondPart instanceof Double)) {
                  second = ((Double) secondPart);
                }
              }
              return (first.compareTo(second) < 0);
            }
          }
          break;
        case ">":
          if (((firstPart instanceof String) && (secondPart instanceof String))) {
            return (((String) firstPart).compareTo(((String) secondPart)) > 0);
          } else {
            if (((firstPart instanceof Number) && (secondPart instanceof Number))) {
              Double first_1 = Double.valueOf(0.0);
              Double second_1 = Double.valueOf(0.0);
              if ((firstPart instanceof Integer)) {
                first_1 = Double.valueOf(((Integer) firstPart).doubleValue());
              } else {
                if ((firstPart instanceof Double)) {
                  first_1 = ((Double) firstPart);
                }
              }
              if ((secondPart instanceof Integer)) {
                second_1 = Double.valueOf(((Integer) secondPart).doubleValue());
              } else {
                if ((secondPart instanceof Double)) {
                  second_1 = ((Double) secondPart);
                }
              }
              return (first_1.compareTo(second_1) > 0);
            }
          }
          break;
        default:
          return false;
      }
    } else {
      return false;
    }
    return false;
  }

  public StringBuilder extractCssFromDocument(final Style style) {
    final StringBuilder cssCode = new StringBuilder();
    if ((style != null)) {
      EList<Rule> _rules = style.getCss().getRules();
      for (final Rule rule : _rules) {
        {
          IDSelector _idSelector = rule.getSelector().getIdSelector();
          boolean _tripleNotEquals = (_idSelector != null);
          if (_tripleNotEquals) {
            cssCode.append("#");
            cssCode.append(rule.getSelector().getIdSelector().getName());
          } else {
            ClassSelector _classSelector = rule.getSelector().getClassSelector();
            boolean _tripleNotEquals_1 = (_classSelector != null);
            if (_tripleNotEquals_1) {
              cssCode.append(".");
              cssCode.append(rule.getSelector().getClassSelector().getName());
            } else {
              cssCode.append(rule.getSelector().getTypeSelector().getName());
            }
          }
          cssCode.append(" { ");
          EList<Declaration> _declarations = rule.getDeclarations();
          for (final Declaration declaration : _declarations) {
            {
              cssCode.append(declaration.getProperty());
              cssCode.append(": ");
              EList<CssValue> _cssValue = declaration.getCssValue();
              for (final CssValue value : _cssValue) {
                {
                  boolean space = false;
                  String _name = value.getName();
                  boolean _tripleNotEquals_2 = (_name != null);
                  if (_tripleNotEquals_2) {
                    cssCode.append(value.getName());
                    space = true;
                  } else {
                    String _coma = value.getComa();
                    boolean _tripleNotEquals_3 = (_coma != null);
                    if (_tripleNotEquals_3) {
                      cssCode.append(",");
                      space = true;
                    } else {
                      if (((value.getInteger() != 0) || (value.getInteger() == 0))) {
                        cssCode.append(value.getInteger());
                      } else {
                        String _string = value.getString();
                        boolean _tripleNotEquals_4 = (_string != null);
                        if (_tripleNotEquals_4) {
                          cssCode.append(value.getString());
                          space = true;
                        } else {
                          String _hashtag = value.getHashtag();
                          boolean _tripleNotEquals_5 = (_hashtag != null);
                          if (_tripleNotEquals_5) {
                            cssCode.append("#");
                            space = false;
                          } else {
                            String _pourcent = value.getPourcent();
                            boolean _tripleNotEquals_6 = (_pourcent != null);
                            if (_tripleNotEquals_6) {
                              cssCode.append("%");
                              space = true;
                            } else {
                              String _apostrophe = value.getApostrophe();
                              boolean _tripleNotEquals_7 = (_apostrophe != null);
                              if (_tripleNotEquals_7) {
                                cssCode.append("\'");
                                space = false;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  if (space) {
                    cssCode.append(" ");
                  }
                }
              }
              cssCode.append("; ");
            }
          }
          cssCode.append(" } ");
        }
      }
    }
    return cssCode;
  }
}
