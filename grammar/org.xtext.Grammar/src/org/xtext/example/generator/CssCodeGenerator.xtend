package org.xtext.example.generator

import org.xtext.example.myDsl.Style

class CssCodeGenerator {
	def generate(Style style) {
        val StringBuilder cssCode = extractCssFromDocument(style)
        
		return cssCode
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