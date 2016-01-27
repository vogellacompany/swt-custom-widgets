package com.vogella.customwidgets.examples.parts;

import javax.annotation.PostConstruct;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import com.vogella.customwidgets.core.checkbox.Checkbox;

public class SimpleCustomWidgetPart {

	@PostConstruct
	public void createComposite(Composite parent) {
		GridLayoutFactory.fillDefaults().applyTo(parent);
		Checkbox checkbox = new Checkbox(parent, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(checkbox);
		checkbox.setSelection(true);
		checkbox.setText("Custom SWT check button");

		checkbox.setForeground(parent.getDisplay().getSystemColor(SWT.COLOR_YELLOW));
		checkbox.setCenterColor(parent.getDisplay().getSystemColor(SWT.COLOR_GRAY));
		checkbox.setCheckColor(parent.getDisplay().getSystemColor(SWT.COLOR_YELLOW));
	
		Button checkButton = new Button(parent, SWT.CHECK);
		checkButton.setSelection(true);
		checkButton.setText("Usual SWT check button");
	}
}
