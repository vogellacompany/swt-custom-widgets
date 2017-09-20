 
package com.vogella.customwidgets.examples.parts;

import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.vogella.customwidgets.core.checkbox.TriStateWidget;

public class FirstTriStatePart {
	@PostConstruct
	public void postConstruct(Composite parent) {
		TriStateWidget triStateWidget = new TriStateWidget(parent, SWT.NONE);
	}
	
}