package org.xtext.example.generator;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.myDsl.ClassSelector;
import org.xtext.example.myDsl.CssValue;
import org.xtext.example.myDsl.Declaration;
import org.xtext.example.myDsl.IDSelector;
import org.xtext.example.myDsl.Rule;
import org.xtext.example.myDsl.Style;

@SuppressWarnings("all")
public class CssCodeGenerator {
  public StringBuilder generate(final Style style) {
    final StringBuilder cssCode = this.extractCssFromDocument(style);
    return cssCode;
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
