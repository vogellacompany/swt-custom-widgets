package com.vogella.customwidgets.examples.parts;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.services.IStylingEngine;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import com.vogella.customwidgets.core.checkbox.Checkbox;

public class CssCustomWidgetPart {

	@PostConstruct
	public void createComposite(Composite parent, IStylingEngine stylingEngine) {
		GridLayoutFactory.fillDefaults().applyTo(parent);
		Checkbox checkbox = new Checkbox(parent, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(checkbox);
		stylingEngine.setClassname(checkbox, "CheckboxCSS");
		checkbox.setSelection(true);
		checkbox.setText("Custom checkbox styled with CSS");
		
		Button checkButton = new Button(parent, SWT.CHECK);
		checkButton.setSelection(true);
		checkButton.setText("Usual SWT check button");
	}
}
