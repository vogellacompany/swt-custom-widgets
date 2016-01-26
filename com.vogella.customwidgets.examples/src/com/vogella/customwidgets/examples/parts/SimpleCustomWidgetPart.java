package com.vogella.customwidgets.examples.parts;

import javax.annotation.PostConstruct;

import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.vogella.customwidgets.core.checkbox.Checkbox;

public class SimpleCustomWidgetPart {

	@PostConstruct
	public void createComposite(Composite parent) {
		GridLayoutFactory.fillDefaults().applyTo(parent);
		Checkbox checkbox = new Checkbox(parent, SWT.NONE);
		checkbox.setCenterColor(parent.getDisplay().getSystemColor(SWT.COLOR_GRAY));
		checkbox.setCheckColor(parent.getDisplay().getSystemColor(SWT.COLOR_YELLOW));
	}
}
