package org.xtext.example.generator

import org.xtext.example.myDsl.Document
import org.xtext.example.myDsl.Style
import org.xtext.example.myDsl.Data
import org.xtext.example.myDsl.Col
import org.xtext.example.myDsl.Row
import org.xtext.example.myDsl.Function
import org.xtext.example.myDsl.ProdFunction
import org.xtext.example.myDsl.SumFunction
import org.xtext.example.myDsl.Argument1
import org.xtext.example.myDsl.DivFunction
import org.xtext.example.myDsl.Page
import org.xtext.example.myDsl.Value
import org.xtext.example.myDsl.NestedObject
import org.xtext.example.myDsl.Array
import org.xtext.example.myDsl.Part
import org.xtext.example.myDsl.Condition1
import static extension org.eclipse.xtext.xbase.lib.ObjectExtensions.*
import org.xtext.example.myDsl.Conditional
import org.xtext.example.myDsl.ClassD

class HtmlCodeGenerator {
    private Context context1;  // Déclaration de context1 comme champ de classe

    // Constructeur pour initialiser context1
    new(Context context) {
        this.context1 = context;
    }
	def generate(Document document, String fileName) {
        val StringBuilder cssCode = extractCssFromDocument(document.style)
        val StringBuilder buildCode = buildDocument(document)
        
		return '''
		<!DOCTYPE html>
		<html lang="en">
			<head>
			    <meta charset="UTF-8">
			    <meta name="viewport" content="width=device-width, initial-scale=1.0">
			    <title>''' + fileName + '''</title>
                <style>''' + cssCode + '''</style>
			</head>
			<body>
			    ''' + buildCode + '''
			</body>
		</html>'''
	} 
	
	def getValueOfVariableInData (String variable, Data data) {		
		for(keyValue : data.keyValue) {
			if(keyValue.string.toString == variable.toString) {
				if(keyValue.value.string !== null) {
					return keyValue.value.string
				} else if(keyValue.value.integer !== 0 || keyValue.value.integer === 0) {
					return keyValue.value.integer
				} else if(keyValue.value.trueV !== null){
					return true
				} else if(keyValue.value.falseV !== null){
					return false
				} else {
					return variable
				}
			}
		}
	}
	
	def getValueOfVariableInObject(Value object, String variableName, int position) {
		if(object.nestedObject instanceof NestedObject) {
			for(keyValue : object.nestedObject.keyValue) {
				if(keyValue.string == variableName) {
					if(keyValue.value !== null) {
						if(keyValue.value.string !== null) {
							return keyValue.value.string
						} else if(keyValue.value.array !== null) {
							var p = 0
							for(value : keyValue.value.array.values) {
								if(p == position) {
									if(value.string !== null) {
										return value.string
									} else if(value.integer !== 0 || value.integer === 0) {
										return value.integer
									} else if(value.trueV.toString !== null) {
										return "true"
									} else if(value.falseV.toString !== null) {
										return "false"
									} else {
										return "null"
									}
								}
								p = p + 1
							}
						} else if(keyValue.value.integer !== 0 || keyValue.value.integer === 0) {
							return keyValue.value.integer
						} else {
							return null
						}
					}
				}
			}
		}
	}
	
	def getValueOfVariableInArray (Array array, int position, Data data) {
		var p = 0
		for(value : array.values) {
			if(p == position) {
				if(value.string !== null) {
					return value.string
				} else if(value.integer !== 0 || value.integer === 0) {
					return value.integer
				} else if(value.trueV.toString !== null) {
					return "true"
				} else if(value.falseV.toString !== null) {
					return "false"
				} else {
					return null
				}
			}
			p = p + 1
		}
	}
	
	def getLengthForArray (String variable, Data data) {	
		var p = 0	
		for(keyValue : data.keyValue) {
			if(keyValue.string.toString == variable.toString) {
				for(value : keyValue.value.array.values) {
					p = p + 1
				}
			}
		}	
		return p	
	}
	
	def getLengthForArrayInObject(Value object, String nameOfArray) {	
		if(object.nestedObject instanceof NestedObject) {
			var p = 0
			for(keyValue : object.nestedObject.keyValue) {
				if(keyValue.string.toString == nameOfArray) {
					for(value : keyValue.value.array.values) {
						p ++
					}
				}
			}		
			return p	
		}
	}
	
	def numberOfArgumentsOfAFunction(Function function) {
		var nbr = 0
		if(function.sumFunction !== null && function.sumFunction.argument1 !== null) {
			for(argument : function.sumFunction.argument1) {
				nbr ++
			}
		} else if(function.prodFunction !== null && function.prodFunction.argument1 !== null) {
			for(argument : function.prodFunction.argument1) {
				nbr ++
			}			
		} else if(function.divFunction !== null && function.divFunction.argument1 !== null) {
			for(argument : function.divFunction.argument1) {
				nbr ++
			}
		}
		return nbr
	}
	
	def sumElementsInArray(Array array) {	
		var total = 0.0
		for(value : array.values) {
			if(value.integer !== 0 || value.integer === 0){
				total += value.integer
			}
		}
		return total	
	}
	
	def prodElementsInArray(Array array) {	
		var total = 1.0
		for(value : array.values) {
			if(value.integer !== 0 || value.integer === 0){
				total *= value.integer
			}
		}
		return total		
	}
	
	def prodAllElementInArgument(ProdFunction prodFunction, Data data, int position) {
		var total = 1.0
		if(prodFunction.argument1 !== null) {
			for(argument : prodFunction.argument1) {
				if(argument.string !== null) {
					return argument.string
				} else if(argument.variable !== null) {
					if(argument.arrayC === null && argument.objectC !== null){
						var object = context1.getVariable(argument.variable.name) as Value
						var v = getValueOfVariableInObject(object, argument.variable.name, -1)
						if(v === null) {
							var array = getArrayInObject(object, argument.objectC.name) as Array
							v = prodElementsInArray(array)
						}
						if (v instanceof Integer) {
							total *= v
						} else if(v instanceof Float) {
							total *= v
						} else {
							return v
						}
					} else if(argument.arrayC !== null && argument.objectC !== null) {
						var object = context1.getVariable(argument.variable.name) as Value
						if(argument.arrayC.position.variable !== null) {
							var v = getValueOfVariableInObject(object, argument.objectC.name, context1.getVariable(argument.arrayC.position.variable.name) as Integer)
							if (v instanceof Integer) {
								total *= v
							} else if(v instanceof Float) {
								total *= v
							} else {
								return v
							}
						} else {
							var v = getValueOfVariableInObject(object, argument.objectC.name, argument.arrayC.position.integer)
							if (v instanceof Integer) {
								total *= v
							} else if(v instanceof Float) {
								total *= v
							} else {
								return v
							}				
						}
					} else if(argument.arrayC !== null && argument.arrayC.position !== null && argument.objectC === null){
						if(argument.arrayC.position.variable !== null) {
							var v = getValueOfVariableInArray(getArrayInData(argument.variable.name, data), position, data)
							if (v instanceof Integer) {
								total *= v
							} else if(v instanceof Float) {
								total *= v
							} else {
								return v
							}
						} else {
							var v = getValueOfVariableInArray(getArrayInData(argument.variable.name, data), argument.arrayC.position.integer, data)
							if (v instanceof Integer) {
								total *= v
							} else if(v instanceof Float) {
								total *= v
							} else {
								return v
							}				
						}
					} else {
						var v = getValueOfVariableInData(argument.variable.name, data)
						if (v instanceof Integer) {
								total *= v
							} else if(v instanceof Float) {
								total *= v
							} else {
								return v
							}
					}
				} else if(argument.integer !== 0 || argument.integer === 0) {
					total *= argument.integer
				}
			}
		}
		return total
	}
	
	def sumAllElementInArgument(SumFunction sumFunction, Data data, int position) {
		var total = 0.0
		if(sumFunction.argument1 !== null) {
			for(argument : sumFunction.argument1) {
				if(argument.string !== null) {
					return argument.string
				} else if(argument.variable !== null) {
					if(argument.arrayC === null && argument.objectC !== null){
						var object = context1.getVariable(argument.variable.name) as Value
						var v = getValueOfVariableInObject(object, argument.variable.name, -1)
						if(v === null) {
							var array = getArrayInObject(object, argument.objectC.name) as Array
							v = sumElementsInArray(array)
						}
						if (v instanceof Integer) {
							total += v
						} else if(v instanceof Float) {
							total += v
						} else {
							return v
						}
					} else if(argument.arrayC !== null && argument.objectC !== null) {
						var object = context1.getVariable(argument.variable.name) as Value
						if(argument.arrayC.position.variable !== null) {
							var v = getValueOfVariableInObject(object, argument.objectC.name, context1.getVariable(argument.arrayC.position.variable.name) as Integer)
							if (v instanceof Integer) {
								total += v
							} else if(v instanceof Float) {
								total += v
							} else {
								return v
							}
						} else {
							var v = getValueOfVariableInObject(object, argument.objectC.name, argument.arrayC.position.integer)
							if (v instanceof Integer) {
								total += v
							} else if(v instanceof Float) {
								total += v
							} else {
								return v
							}				
						}
					} else if(argument.arrayC !== null && argument.arrayC.position !== null && argument.objectC === null){
						if(argument.arrayC.position.variable !== null) {
							var v = getValueOfVariableInArray(getArrayInData(argument.variable.name, data), position, data)
							if (v instanceof Integer) {
								total += v
							} else if(v instanceof Float) {
								total += v
							} else {
								return v
							}
						} else {
							var v = getValueOfVariableInArray(getArrayInData(argument.variable.name, data), argument.arrayC.position.integer, data)
							if (v instanceof Integer) {
								total += v
							} else if(v instanceof Float) {
								total += v
							} else {
								return v
							}				
						}
					} else {
						var v = getValueOfVariableInData(argument.variable.name, data)
						if (v instanceof Integer) {
								total += v
							} else if(v instanceof Float) {
								total += v
							} else {
								return v
							}
					}
				} else if(argument.integer !== 0 || argument.integer === 0) {
					total += argument.integer
				}
			}
		}
		return total
	}
	
	def div2Arguments(DivFunction divFunction, Data data, int position) {
		var i = 1
		if(divFunction.argument1 !== null) {
			var valueOfFirstArgument = 0.0
			for(argument : divFunction.argument1) {
				if(i == 1){
					var v1  = getArgument1ForDivFunction(argument, position, data)
					if(v1 instanceof Integer) {
						valueOfFirstArgument = v1
					}
				}
				if(i == 2) {
					var v2  = getArgument1ForDivFunction(argument, position, data)
					if(v2 instanceof Integer) {
						return String::format("%.2f", valueOfFirstArgument / v2)
					}
				}
				i ++
			}
		}
		return null
	}
	
	def getArgument1ForDivFunction(Argument1 argument, int position, Data data) {
		if(argument.string !== null) {
			return argument.string
		} else if(argument.variable !== null) {
			if(argument.arrayC !== null && argument.arrayC.position !== null){
				if(argument.arrayC.position.variable !== null) {
					var v = getValueOfVariableInArray(getArrayInData(argument.variable.name, data), position, data)
					return v
				} else {
					var v = getValueOfVariableInArray(getArrayInData(argument.variable.name, data), argument.arrayC.position.integer, data)
					return v			
				}
			} else {
				var v = getValueOfVariableInData(argument.variable.name, data)
				return v
			}
		} else if(argument.integer !== 0 || argument.integer === 0) {
			return argument.integer
		}
	}
	
	def getObjetInArray(String arrayName, Data data, int position) {
		var p = 0
		for(keyValue : data.keyValue) {
			if(keyValue.string.toString == arrayName) {
				for(value : keyValue.value.array.values) {
					if(p == position) {
						return value
					}
					p ++
				}
			}
		}
	}
	
	def getArrayInData(String arrayName, Data data) {
		for(keyValue : data.keyValue) {
			if(keyValue.string.toString == arrayName) {
				return keyValue.value.array
			}
		}
	}
	
	def getArrayInObject(Value object, String arrayName) {
		for(keyValue : object.nestedObject.keyValue) {
			if(keyValue.string.toString == arrayName) {
				return keyValue.value.array
			}
		}
	}
	
	def buildDocument(Document document) {
		val StringBuilder buildCode = new StringBuilder
		
		if (document.build !== null) {
			for (elementBuild : document.build.elementBuild) {
				if (elementBuild.page !== null) {
					buildPage(buildCode, elementBuild.page, document)
				} else if(elementBuild.loop !== null) {
					if(elementBuild.loop.forLoop !== null) {
						if(0 <= elementBuild.loop.forLoop.initWithInteger) {
							var p = elementBuild.loop.forLoop.initWithInteger
							for(otherElement : elementBuild.loop.forLoop.otherElement) {
								if(otherElement.page !== null) {
									 if(elementBuild.loop.forLoop.endWithVariable !== null) {
										context1.setVariable(elementBuild.loop.forLoop.increment.name, p)
										for (var i = p; i < getLengthForArray(elementBuild.loop.forLoop.endWithVariable.name, document.data); i++) {
									        buildPage(buildCode, otherElement.page, document)
											context1.incrementVariable(elementBuild.loop.forLoop.increment.name, 1)
										}										
									} else if(0 <= elementBuild.loop.forLoop.endWithInteger){
										context1.setVariable(elementBuild.loop.forLoop.increment.name, p)
										for(var i = p; i<=elementBuild.loop.forLoop.endWithInteger; i++) {
									        buildPage(buildCode, otherElement.page, document)
											context1.incrementVariable(elementBuild.loop.forLoop.increment.name, 1)
										}									
									}
								}
							}							
						}
					} else if(elementBuild.loop.withLoop !== null) {
						if(elementBuild.loop.withLoop.init !== null && elementBuild.loop.withLoop.variable !== null) {
							for(otherElement : elementBuild.loop.withLoop.otherElement) {
								if(otherElement.page !== null) {
									for(var i=0; i<getLengthForArray(elementBuild.loop.withLoop.variable.name, document.data); i++) {
										var object = getObjetInArray(elementBuild.loop.withLoop.variable.name, document.data, i)
										context1.setVariable(elementBuild.loop.withLoop.init.name, object)
										buildWithLoopPage(buildCode, otherElement.page, document, elementBuild.loop.withLoop.init.name)
									}
								}
							}
						}
					}
				}
			}
		}
		
		return buildCode
	}
	
	def getNameOfPage(Page page, Data data, Value value) {
		if (page.string !== null) {
			return page.string
		} else if (page.variable !== null && page.arrayC !== null && page.objectC === null) {
			if(0 <= page.arrayC.position.integer && page.arrayC.position.variable === null) {
				return getValueOfVariableInArray(getArrayInData(page.variable.name, data), page.arrayC.position.integer, data)				
			} else if(page.arrayC.position.variable !== null) {
			    val i = context1.getVariable(page.arrayC.position.variable.name) as Integer
				return getValueOfVariableInArray(getArrayInData(page.variable.name, data), i, data)
			}
		} else if (page.variable !== null && page.objectC !== null && page.arrayC === null) {
			return getValueOfVariableInObject(value, page.objectC.name, -1)
		} else if (page.variable !== null && page.objectC !== null && page.arrayC !== null) {
			if(0 <= page.arrayC.position.integer && page.arrayC.position.variable === null) {
				return getValueOfVariableInObject(value, page.objectC.name, page.arrayC.position.integer)			
			} else if(page.arrayC.position.variable !== null) {
			    val i = context1.getVariable(page.arrayC.position.variable.name) as Integer
				return getValueOfVariableInObject(value, page.objectC.name, i)
			}
		} else if (page.variable !== null) {
			return getValueOfVariableInData(page.variable.name, data)
		}
	}
	
	def buildWithLoopPage(StringBuilder buildCode, Page page, Document document, String nameOfObject) {
		val Context contextPage = new Context()
		val Value object = context1.getVariable(nameOfObject) as Value

		getTitles(buildCode, page, document)
		
		buildCode.append("<table border='1' cellspacing='0'>\n")
		for(elementPage : page.elementPage) {
			if (elementPage.row !== null) {
				buildRow(elementPage.row, buildCode, document, -1, contextPage)
			}
			if(elementPage.loop !== null && elementPage.loop.forLoop !== null && elementPage.loop.forLoop.otherElement !== null) {
				var p = elementPage.loop.forLoop.initWithInteger
				for(otherElement : elementPage.loop.forLoop.otherElement) {
					if(otherElement.row !== null) {
						context1.setVariable(elementPage.loop.forLoop.increment.name, p)
						if(elementPage.loop.forLoop.endWithVariable !== null && elementPage.loop.forLoop.objectC !== null) {
							for(var i=p; i < getLengthForArrayInObject(object, elementPage.loop.forLoop.objectC.name); i ++) {
								val po = context1.getVariable(elementPage.loop.forLoop.increment.name) as Integer
						        buildRow(otherElement.row, buildCode, document, po, contextPage)
								context1.incrementVariable(elementPage.loop.forLoop.increment.name, 1)
							}
						} else if(elementPage.loop.forLoop.endWithVariable !== null) {
							for (var i = p; i < getLengthForArray(elementPage.loop.forLoop.endWithVariable.name, document.data); i++) {
								val po = context1.getVariable(elementPage.loop.forLoop.increment.name) as Integer
						        buildRow(otherElement.row, buildCode, document, po, contextPage)
								context1.incrementVariable(elementPage.loop.forLoop.increment.name, 1)
							}
						} else if(0 <= elementPage.loop.forLoop.endWithInteger) {
							for(var i = p; i<=elementPage.loop.forLoop.endWithInteger; i++) {
								val po = context1.getVariable(elementPage.loop.forLoop.increment.name) as Integer
						        buildRow(otherElement.row, buildCode, document, po, contextPage)
								context1.incrementVariable(elementPage.loop.forLoop.increment.name, 1)
							}
						}
					}
				}
			}
		}
		buildCode.append("</table>\n")
		contextPage.clearVariables()
	}
	
	def String getClassD(ClassD classD) {
		if(classD.string !== null) {
			return classD.string.toString()
		}
		return new String
	}
	
	def getTitles(StringBuilder buildCode, Page page, Document document) {
		for(title : page.titles) {
			var classD = new String
			if(title.bigTitle !== null && title.bigTitle.string !== null) {
				if(title.bigTitle.classD !== null) {
					classD = getClassD(title.bigTitle.classD)
				}
				buildCode.append("<h1 class='" + classD + "'>")
				if(title.bigTitle.string !== null) {
					buildCode.append(title.bigTitle.string + "</h1>")
				} else if(title.bigTitle.variable !== null && title.bigTitle.objectC === null && title.bigTitle.arrayC === null) {
					buildCode.append(getValueOfVariableInData(title.bigTitle.variable.name, document.data) + "aa</h1>")
				} else if(title.bigTitle.objectC === null && title.bigTitle.arrayC !== null) {
					
				} else if(title.bigTitle.objectC !== null && title.bigTitle.arrayC === null) {
					
				} else if(title.bigTitle.objectC !== null && title.bigTitle.arrayC !== null) {
					
				}
			} else if(title.subTitle !== null && title.subTitle.string !== null) {
				if(title.subTitle.classD !== null) {
					classD = getClassD(title.subTitle.classD)
				}
				buildCode.append("<h2 class='" + classD + "'>" + title.subTitle.string + "</h2>")
			} else if(title.subSubTitle !== null && title.subSubTitle.string !== null) {
				if(title.subSubTitle.classD !== null) {
					classD = getClassD(title.subSubTitle.classD)
				}
				buildCode.append("<h3 class='" + classD + "'>" + title.subSubTitle.string + "</h3>")
			}
		}
	}
	
	def buildPage(StringBuilder buildCode, Page page, Document document) {
		val Context contextPage = new Context()

		getTitles(buildCode, page, document)
		
		buildCode.append("<table border='1' cellspacing='0'>\n")
		for (elementPage : page.elementPage) {
			if (elementPage.row !== null) {
				buildRow(elementPage.row, buildCode, document, -1, contextPage)
			}
			if(elementPage.loop !== null && elementPage.loop.forLoop !== null && elementPage.loop.forLoop.otherElement !== null) {
				var p = elementPage.loop.forLoop.initWithInteger
				for(otherElement : elementPage.loop.forLoop.otherElement) {
					if(otherElement.row !== null) {
						context1.setVariable(elementPage.loop.forLoop.increment.name, p)
						if(elementPage.loop.forLoop.endWithVariable !== null) {
							for (var i = p; i < getLengthForArray(elementPage.loop.forLoop.endWithVariable.name, document.data); i++) {
								val po = context1.getVariable(elementPage.loop.forLoop.increment.name) as Integer
						        buildRow(otherElement.row, buildCode, document, po, contextPage)
								context1.incrementVariable(elementPage.loop.forLoop.increment.name, 1)
							}
						} else if(0 <= elementPage.loop.forLoop.endWithInteger) {
							for(var i = p; i<=elementPage.loop.forLoop.endWithInteger; i++) {
								val po = context1.getVariable(elementPage.loop.forLoop.increment.name) as Integer
						        buildRow(otherElement.row, buildCode, document, po, contextPage)
								context1.incrementVariable(elementPage.loop.forLoop.increment.name, 1)
							}
						}
					}
				}
			}
		}
		buildCode.append("</table>\n")
		contextPage.clearVariables()
	}
	
	def getValueForSimpleCol(Col col, Document document, int position, Context contextPage) {
		if (col.string !== null) {
			return col.string
		} else if(col.variable !== null && col.objectC !== null && col.arrayC === null) {
			val Value object = context1.getVariable(col.variable.name) as Value
			return getValueOfVariableInObject(object, col.objectC.name, -1)
		} else if(col.variable !== null && col.objectC !== null && col.arrayC !== null) {
			val Value object = context1.getVariable(col.variable.name) as Value
			if(0 <= col.arrayC.position.integer && col.arrayC.position.variable === null) {
				return getValueOfVariableInObject(object, col.objectC.name, col.arrayC.position.integer)
			} else if(col.arrayC.position.variable !== null) {
				val po = context1.getVariable(col.arrayC.position.variable.name) as Integer
				return getValueOfVariableInObject(object, col.objectC.name, po)
			}
		} else if(col.variable !== null && col.arrayC !== null && col.objectC === null) {
			if(0 <= col.arrayC.position.integer && col.arrayC.position.variable === null) {
				return getValueOfVariableInArray(getArrayInData(col.variable.name, document.data), col.arrayC.position.integer, document.data)			
			} else if(col.arrayC.position.variable !== null) {
				val po = context1.getVariable(col.arrayC.position.variable.name) as Integer
				return getValueOfVariableInArray(getArrayInData(col.variable.name, document.data), po, document.data)			
			}
		} else if(col.variable !== null) {
			return getValueOfVariableInData(col.variable.name, document.data)
		} else if(col.img !== null){
			val StringBuilder c = new StringBuilder
			val StringBuilder a = new StringBuilder
			val StringBuilder url = new StringBuilder
			if(col.img.classD !== null) {
				c.append(col.img.classD.string)
			}
			if(col.img.stringAlt !== null) {
				a.append(col.img.stringAlt)
			}
			if(col.img.string !== null) {
				url.append(col.img.string)
			} else if(col.img.variable !== null) {
				if(col.img.arrayC !== null && col.img.objectC === null){
					var array = getArrayInData(col.img.variable.name, document.data) as Array
					if(col.img.arrayC.position.variable !== null) {
						var po = context1.getVariable(col.img.arrayC.position.variable.name) as Integer
						url.append(getValueOfVariableInArray(array, po, document.data))
					} else {
						url.append(getValueOfVariableInArray(array, col.img.arrayC.position.integer, document.data))
					}
				} else if(col.img.arrayC === null && col.img.objectC !== null) {
					var object = context1.getVariable(col.img.variable.name) as Value
					url.append(getValueOfVariableInObject(object, col.img.objectC.name, -1))
				} else if(col.img.arrayC !== null && col.img.objectC !== null) {
					var object = context1.getVariable(col.img.variable.name) as Value
					var array = getArrayInObject(object, col.img.objectC.name)
					if(col.img.arrayC.position.variable !== null) {
						var po = context1.getVariable(col.img.arrayC.position.variable.name) as Integer
						url.append(getValueOfVariableInArray(array, po, document.data))
					} else {
						url.append(getValueOfVariableInArray(array, col.img.arrayC.position.integer, document.data))
					}
				} else {
					url.append(getValueOfVariableInData(col.img.variable.name, document.data))
				}
			}
			return "<img src='" + url + "' alt='" + a + "' class='" + c + "'>"
		} else if(col.function !== null) {
			var nberArguments = 0
			if(col.function.sumFunction !== null && col.function.sumFunction.argument1 !== null) {
				nberArguments = numberOfArgumentsOfAFunction(col.function)
				if(nberArguments == 1) {
					for(argument : col.function.sumFunction.argument1) {
						if((argument.integer !== 0 || argument.integer === 0) && argument.variable === null && argument.string === null && argument.classVariable === null) {
							return argument.integer
						} else if(argument.string !== null && argument.variable === null) {
							return argument.string
						} else if(argument.variable !== null && argument.arrayC !== null && argument.objectC === null) {
							if(0 <= argument.arrayC.position.integer && argument.arrayC.position.variable === null) {
								return getValueOfVariableInArray(getArrayInData(argument.variable.name, document.data), argument.arrayC.position.integer, document.data)								
							} else if(argument.arrayC.position.variable !== null) {
								val po = context1.getVariable(argument.arrayC.position.variable.name) as Integer
								return getValueOfVariableInArray(getArrayInData(argument.variable.name, document.data), po, document.data)				
							}
						} else if(argument.variable !== null && argument.arrayC === null && argument.objectC !== null) {
							var Value object = context1.getVariable(argument.variable.name) as Value
							var v = getValueOfVariableInObject(object, argument.objectC.name, -1)
							if(v === null) {
								var Array array = getArrayInObject(object, argument.objectC.name)
								if(array !== null) {
									v = sumElementsInArray(array)									
								}
							}
							return v
						} else if(argument.variable !== null && argument.arrayC !== null && argument.objectC !== null) {
							var Value object = context1.getVariable(argument.variable.name) as Value
							if(0 <= argument.arrayC.position.integer && argument.arrayC.position.variable === null) {
								return getValueOfVariableInObject(object, argument.objectC.name, argument.arrayC.position.integer)								
							} else if(argument.arrayC.position.variable !== null) {
								val po = context1.getVariable(argument.arrayC.position.variable.name) as Integer
								return getValueOfVariableInObject(object, argument.objectC.name, po)			
							}
						} else if(argument.variable !== null && argument.arrayC === null) {
							return sumElementsInArray(getArrayInData(argument.variable.name, document.data))
						} else if(argument.classVariable !== null) {
							return contextPage.sumArray(argument.classVariable.name)
						} 
					}
				} else {
					return sumAllElementInArgument(col.function.sumFunction, document.data, position)
				}
			} else if(col.function.prodFunction !== null && col.function.prodFunction.argument1 !== null) {
				nberArguments = numberOfArgumentsOfAFunction(col.function)
				if(nberArguments == 1) {
					for(argument : col.function.prodFunction.argument1) {
						if((argument.integer !== 0 || argument.integer === 0) && argument.variable === null && argument.string === null) {
							return argument.integer
						} else if(argument.string !== null && argument.variable === null) {
							return argument.string
						} else if(argument.variable !== null && argument.arrayC !== null && argument.objectC === null) {
							if(0 <= argument.arrayC.position.integer && argument.arrayC.position.variable === null) {
								return getValueOfVariableInArray(getArrayInData(argument.variable.name, document.data), argument.arrayC.position.integer, document.data)								
							} else if(argument.arrayC.position.variable !== null) {
								val po = context1.getVariable(argument.arrayC.position.variable.name) as Integer
								return getValueOfVariableInArray(getArrayInData(argument.variable.name, document.data), po, document.data)				
							}
						} else if(argument.variable !== null && argument.arrayC === null && argument.objectC !== null) {
							var Value object = context1.getVariable(argument.variable.name) as Value
							var v = getValueOfVariableInObject(object, argument.objectC.name, -1)
							if(v === null) {
								var Array array = getArrayInObject(object, argument.objectC.name)
								if(array !== null) {
									v = prodElementsInArray(array)									
								}
							}
							return v
						} else if(argument.variable !== null && argument.arrayC !== null && argument.objectC !== null) {
							var Value object = context1.getVariable(argument.variable.name) as Value
							if(0 <= argument.arrayC.position.integer && argument.arrayC.position.variable === null) {
								return getValueOfVariableInObject(object, argument.objectC.name, argument.arrayC.position.integer)								
							} else if(argument.arrayC.position.variable !== null) {
								val po = context1.getVariable(argument.arrayC.position.variable.name) as Integer
								return getValueOfVariableInObject(object, argument.objectC.name, po)			
							}
						} else if(argument.variable !== null && argument.arrayC === null) {
							return prodElementsInArray(getArrayInData(argument.variable.name, document.data))
						} else if(argument.classVariable !== null) {
							return contextPage.productArray(argument.classVariable.name)
						}
					}
				} else {
					return prodAllElementInArgument(col.function.prodFunction, document.data, position)
				}			
			} else if(col.function.divFunction !== null && col.function.divFunction.argument1 !== null) {
				nberArguments = numberOfArgumentsOfAFunction(col.function)
				if(nberArguments == 2) {
					if(col.function.divFunction.argument1 !== null) {
						var String dividente = null
						var String diviseur = null
						for(argument : col.function.divFunction.argument1) {
							if(argument.classVariable !== null) {
								if(dividente === null) {
									dividente = argument.classVariable.name
								} else if(diviseur === null) {
									diviseur = argument.classVariable.name
								}
								if(dividente !== null && diviseur !== null) {
									return contextPage.divideArraysFirstElement(dividente, diviseur)
								}
							} else {
								return div2Arguments(col.function.divFunction, document.data, position)
							}
						}
					}
				}
			}
		} else if (col.integer !== 0 || col.integer === 0) {
			return col.integer
		}
	}
	
	def buildSimpleCol(Col col, StringBuilder buildCode, Document document, int position, Context contextPage) {
		val StringBuilder classDC = new StringBuilder
		if(col.classD !== null){
			classDC.append(" class='" + col.classD.string +"'")
		}
		val StringBuilder fu = new StringBuilder
		if(col.fusion !== null) {
			if(col.fusion.colspan !== null) {
				fu.append(" colspan='")
				if(0 < col.fusion.colspan.integer) {
					fu.append(col.fusion.colspan.integer + "'")
				}
			}
			if(col.fusion.rowspan !== null) {
				fu.append(" rowspan='")
				if(0 < col.fusion.rowspan.integer) {
					fu.append(col.fusion.rowspan.integer + "'")
				}
			}
		}
		buildCode.append("<td" + fu + classDC + ">\n")
		
		val value = getValueForSimpleCol(col, document, position, contextPage)
		
		if(col.classD !== null){
			contextPage.addToAllClassVariables(col.classD.string, value)
		}
		
		buildCode.append(value)
		
		buildCode.append("\n</td>\n")
	}
	
	def getValueForWithLoopCol(Value value, String globalVariable) {
		if(value.string !== null) {
			return value.string
		} else if(value.integer !== 0 || value.integer === 0) {
			return value.integer
		} else if(value.trueV.toString !== null) {
			return "true"
		} else if(value.falseV.toString !== null) {
			return "false"
		} else {
			return globalVariable
		}
	}
	
	def buildWithLoopCol(Col col, StringBuilder buildCode, String globalVariable, Data data, Context contextPage) {
		val StringBuilder classDC = new StringBuilder
		if(col.classD !== null){
			classDC.append(" class='" + col.classD.string +"'")
		}	
		
		val StringBuilder fu = new StringBuilder
		if(col.fusion !== null) {
			if(col.fusion.colspan !== null) {
				fu.append(" colspan='")
				if(0 < col.fusion.colspan.integer) {
					fu.append(col.fusion.colspan.integer + "'")
				}
			}
			if(col.fusion.rowspan !== null) {
				fu.append(" rowspan='")
				if(0 < col.fusion.rowspan.integer) {
					fu.append(col.fusion.rowspan.integer + "'")
				}
			}
		}
			
		for(keyValue : data.keyValue) {
			if(keyValue.string.toString == globalVariable.toString) {
				for(value : keyValue.value.array.values) {
					buildCode.append("<td" + fu + classDC + ">\n")
					
					val valeur = getValueForWithLoopCol(value, globalVariable)
		
					if(col.classD !== null){
						contextPage.addToAllClassVariables(col.classD.string, valeur)
					}
					
					buildCode.append(valeur)
					
					buildCode.append("\n</td>\n")
				}
			}
		}	
	}
	
	def buildRow(Row row, StringBuilder buildCode, Document document, int position, Context contextPage) {
		buildCode.append("<tr>\n")
		for (elementRow : row.elementRow) {
			if(elementRow.loop !== null && elementRow.loop.withLoop !== null && elementRow.loop.withLoop.otherElement !== null) {
				for(otherElement : elementRow.loop.withLoop.otherElement) {
					if(otherElement.col !== null) {
						buildWithLoopCol(otherElement.col, buildCode, elementRow.loop.withLoop.variable.name, document.data, contextPage)
					}
				}
			}
			if (elementRow.col !== null) {
				buildSimpleCol(elementRow.col, buildCode, document, position, contextPage)
			}
			if(elementRow.conditional !== null) {
				buildConditional(elementRow.conditional, buildCode, document, position, contextPage)
			}
		}
		buildCode.append("</tr>\n")
	}
	
	def buildConditional(Conditional conditional, StringBuilder buildCode, Document document, int position, Context contextPage) {
		if(evaluateCondition(conditional.ifCondition.condition, document, contextPage)) {
			for(otherElement : conditional.ifCondition.otherElement) {
				if (otherElement.col !== null) {
					buildSimpleCol(otherElement.col, buildCode, document, position, contextPage)
				}		
				if(otherElement.row !== null) {
					buildRow(otherElement.row, buildCode, document, position, contextPage)
				}
				if(otherElement.page !== null) {
					buildPage(buildCode, otherElement.page, document)
				}
				if(otherElement.conditional !== null) {
					buildConditional(otherElement.conditional, buildCode, document, position, contextPage)
				}
			}
		} else {
			if(conditional.elseCondion !== null){
	            for (elseCondition : conditional.elseCondion) {
	                if (elseCondition.ifCondition !== null) {
	                    if (evaluateCondition(elseCondition.ifCondition.condition, document, contextPage)) {
							for(otherElement : elseCondition.ifCondition.otherElement) {
								if (otherElement.col !== null) {
									buildSimpleCol(otherElement.col, buildCode, document, position, contextPage)
								}		
								if(otherElement.row !== null) {
									buildRow(otherElement.row, buildCode, document, position, contextPage)
								}
								if(otherElement.page !== null) {
									buildPage(buildCode, otherElement.page, document)
								}
								if(otherElement.conditional !== null) {
									buildConditional(otherElement.conditional, buildCode, document, position, contextPage)
								}			
							}
	                    }
	                } else {
						for(otherElement : elseCondition.otherElement) {
							if (otherElement.col !== null) {
								buildSimpleCol(otherElement.col, buildCode, document, position, contextPage)
							}					
							if(otherElement.row !== null) {
								buildRow(otherElement.row, buildCode, document, position, contextPage)
							}
							if(otherElement.page !== null) {
								buildPage(buildCode, otherElement.page, document)
							}
							if(otherElement.conditional !== null) {
								buildConditional(otherElement.conditional, buildCode, document, position, contextPage)
							}
						}
	                }
	            }
	        }
        }
	}
	
	def getValueForPartInConditionParams(Part part, Document document, Context contextPage) {
		if(part.string !== null) {
			return part.string
		} else if(part.variable !== null){
			if(part.objectC === null && part.arrayC !== null) {
				if(part.arrayC.position.variable !== null) {
					return getValueOfVariableInArray(getArrayInData(part.variable.name, document.data), -1, document.data)				
				} else {
					return getValueOfVariableInArray(getArrayInData(part.variable.name, document.data), part.arrayC.position.integer as Integer, document.data)
				}
			} else if(part.objectC !== null && part.arrayC === null) {
				val Value object = context1.getVariable(part.variable.name) as Value
				return getValueOfVariableInObject(object, part.objectC.name, -1)
			} else if(part.objectC !== null && part.arrayC !== null) {
				val Value object = context1.getVariable(part.variable.name) as Value
				if(0 <= part.arrayC.position.integer && part.arrayC.position.variable === null) {
					return getValueOfVariableInObject(object, part.objectC.name, part.arrayC.position.integer)
				} else if(part.arrayC.position.variable !== null) {
					val po = context1.getVariable(part.arrayC.position.variable.name) as Integer
					return getValueOfVariableInObject(object, part.objectC.name, po)
				}
			} else {
				return getValueOfVariableInData(part.variable.name, document.data)
			}
		} else if(part.classVariable !== null) {
			return contextPage.getFirstValueInArray(part.classVariable.name)
		} else if(part.superVariable !== null) {
			return context1.getFirstValueInArray(part.superVariable.name)
		} else {
			return part.integer
		}
	}
	
	def boolean evaluateCondition(Condition1 condition, Document document, Context contextPage) {
	    var firstPart = getValueForPartInConditionParams(condition.firstPart, document, contextPage)
	    var secondPart = getValueForPartInConditionParams(condition.secondPart, document, contextPage)
	   
	    var compareOperator = condition.compare
	
	    switch compareOperator {
	        case "==": 
	            return firstPart == secondPart
	        case "!=":
	            return firstPart != secondPart
	        case "<":
	        	if(firstPart instanceof String && secondPart instanceof String) {
	            	return (firstPart as String) < (secondPart as String)
	        	} else if(firstPart instanceof Number && secondPart instanceof Number) {
	        		var Double first = 0.0
	        		var Double second = 0.0
	        		if(firstPart instanceof Integer) {
	        			first = (firstPart as Integer).doubleValue()
	        		} else if(firstPart instanceof Double) {
	        			first = firstPart as Double
	        		}
	        		if(secondPart instanceof Integer) {
	        			second = (secondPart as Integer).doubleValue()
	        		} else if(secondPart instanceof Double) {
	        			second = secondPart as Double
	        		}
	            	return (first < second)
	        	}
	        case ">":
	        	if(firstPart instanceof String && secondPart instanceof String) {
	            	return (firstPart as String) > (secondPart as String)
	        	} else if(firstPart instanceof Number && secondPart instanceof Number) {
	        		var Double first = 0.0
	        		var Double second = 0.0
	        		if(firstPart instanceof Integer) {
	        			first = (firstPart as Integer).doubleValue()
	        		} else if(firstPart instanceof Double) {
	        			first = firstPart as Double
	        		}
	        		if(secondPart instanceof Integer) {
	        			second = (secondPart as Integer).doubleValue()
	        		} else if(secondPart instanceof Double) {
	        			second = secondPart as Double
	        		}
	            	return (first > second)
	        	}
	        default:
	            return false
	    }
	}
	
	def extractCssFromDocument(Style style) {
	    val StringBuilder cssCode = new StringBuilder
	
	    if (style !== null) {
	        for (rule : style.css.rules) {
	            if (rule.selector.idSelector !== null) {
	            	cssCode.append("#")
	            	cssCode.append(rule.selector.idSelector.name)
	            } else if (rule.selector.classSelector !== null) {
	            	cssCode.append(".")
	            	cssCode.append(rule.selector.classSelector.name)	            	
	            } else {
	            	cssCode.append(rule.selector.typeSelector.name)
	            }
	            cssCode.append(" { ")
	            for (declaration : rule.declarations) {
	                cssCode.append(declaration.property)
	                cssCode.append(": ")
	                for (value : declaration.cssValue) {
	                	var space = false
	                	if (value.name !== null) {
	                    	cssCode.append(value.name)	
	                    	space = true                		
	                	} else if (value.coma !== null) {
	                    	cssCode.append(",")
	                    	space = true
	                    } else if (value.integer !== 0 || value.integer === 0) {
	                    	cssCode.append(value.integer)	                    	
	                    } else if (value.string !== null) {
	                    	cssCode.append(value.string)
	                		space = true
	                	} else if(value.hashtag !== null) {
	                    	cssCode.append("#")
	                    	space = false
	                	} else if(value.pourcent !== null) {
	                    	cssCode.append("%")
	                    	space = true
	                	} else if(value.apostrophe !== null) {
	                    	cssCode.append("'")
	                    	space = false
	                	}
	                    if (space) {
	                    	cssCode.append(" ")
	                    }
	                }
	                cssCode.append("; ")
	            }
	            cssCode.append(" } ")
	        }
	    }
	
	    return cssCode
	}
	
}